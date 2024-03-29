package typings.awsSdk.clientsRekognitionMod

import typings.awsSdk.anon.DescribeProjectVersionsRe
import typings.awsSdk.awsSdkStrings.projectVersionRunning
import typings.awsSdk.awsSdkStrings.projectVersionTrainingCompleted
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rekognition extends Service {
  
  /**
    * Compares a face in the source input image with each of the 100 largest faces detected in the target input image.   If the source image contains multiple faces, the service detects the largest face and compares it with each face detected in the target image.   CompareFaces uses machine learning algorithms, which are probabilistic. A false negative is an incorrect prediction that a face in the target image has a low similarity confidence score when compared to the face in the source image. To reduce the probability of false negatives, we recommend that you compare the target image against multiple source images. If you plan to use CompareFaces to make a decision that impacts an individual's rights, privacy, or access to services, we recommend that you pass the result to a human for review and further validation before taking action.  You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  In response, the operation returns an array of face matches ordered by similarity score in descending order. For each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, roll, and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the bounding box contains a face). The response also provides a similarity score, which indicates how closely the faces match.   By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You can change this value by specifying the SimilarityThreshold parameter.   CompareFaces also returns an array of faces that don't match the source image. For each face, it returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns information about the face in the source image, including the bounding box of the face and confidence value. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. Use QualityFilter to set the quality bar by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE. The default value is NONE.  If the image doesn't contain Exif metadata, CompareFaces returns orientation information for the source and target images. Use these values to display the images with the correct image orientation. If no faces are detected in the source or target images, CompareFaces returns an InvalidParameterException error.    This is a stateless API operation. That is, data returned by this operation doesn't persist.  For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:CompareFaces action.
    */
  def compareFaces(): Request[CompareFacesResponse, AWSError] = js.native
  def compareFaces(callback: js.Function2[/* err */ AWSError, /* data */ CompareFacesResponse, Unit]): Request[CompareFacesResponse, AWSError] = js.native
  /**
    * Compares a face in the source input image with each of the 100 largest faces detected in the target input image.   If the source image contains multiple faces, the service detects the largest face and compares it with each face detected in the target image.   CompareFaces uses machine learning algorithms, which are probabilistic. A false negative is an incorrect prediction that a face in the target image has a low similarity confidence score when compared to the face in the source image. To reduce the probability of false negatives, we recommend that you compare the target image against multiple source images. If you plan to use CompareFaces to make a decision that impacts an individual's rights, privacy, or access to services, we recommend that you pass the result to a human for review and further validation before taking action.  You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  In response, the operation returns an array of face matches ordered by similarity score in descending order. For each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, roll, and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the bounding box contains a face). The response also provides a similarity score, which indicates how closely the faces match.   By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You can change this value by specifying the SimilarityThreshold parameter.   CompareFaces also returns an array of faces that don't match the source image. For each face, it returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns information about the face in the source image, including the bounding box of the face and confidence value. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. Use QualityFilter to set the quality bar by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE. The default value is NONE.  If the image doesn't contain Exif metadata, CompareFaces returns orientation information for the source and target images. Use these values to display the images with the correct image orientation. If no faces are detected in the source or target images, CompareFaces returns an InvalidParameterException error.    This is a stateless API operation. That is, data returned by this operation doesn't persist.  For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:CompareFaces action.
    */
  def compareFaces(params: CompareFacesRequest): Request[CompareFacesResponse, AWSError] = js.native
  def compareFaces(
    params: CompareFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CompareFacesResponse, Unit]
  ): Request[CompareFacesResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Rekognition: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Copies a version of an Amazon Rekognition Custom Labels model from a source project to a destination project. The source and destination projects can be in different AWS accounts but must be in the same AWS Region. You can't copy a model to another AWS service.  To copy a model version to a different AWS account, you need to create a resource-based policy known as a project policy. You attach the project policy to the source project by calling PutProjectPolicy. The project policy gives permission to copy the model version from a trusting AWS account to a trusted account. For more information creating and attaching a project policy, see Attaching a project policy (SDK) in the Amazon Rekognition Custom Labels Developer Guide.  If you are copying a model version to a project in the same AWS account, you don't need to create a project policy.  To copy a model, the destination project, source project, and source model version must already exist.  Copying a model version takes a while to complete. To get the current status, call DescribeProjectVersions and check the value of Status in the ProjectVersionDescription object. The copy operation has finished when the value of Status is COPYING_COMPLETED. This operation requires permissions to perform the rekognition:CopyProjectVersion action.
    */
  def copyProjectVersion(): Request[CopyProjectVersionResponse, AWSError] = js.native
  def copyProjectVersion(callback: js.Function2[/* err */ AWSError, /* data */ CopyProjectVersionResponse, Unit]): Request[CopyProjectVersionResponse, AWSError] = js.native
  /**
    * Copies a version of an Amazon Rekognition Custom Labels model from a source project to a destination project. The source and destination projects can be in different AWS accounts but must be in the same AWS Region. You can't copy a model to another AWS service.  To copy a model version to a different AWS account, you need to create a resource-based policy known as a project policy. You attach the project policy to the source project by calling PutProjectPolicy. The project policy gives permission to copy the model version from a trusting AWS account to a trusted account. For more information creating and attaching a project policy, see Attaching a project policy (SDK) in the Amazon Rekognition Custom Labels Developer Guide.  If you are copying a model version to a project in the same AWS account, you don't need to create a project policy.  To copy a model, the destination project, source project, and source model version must already exist.  Copying a model version takes a while to complete. To get the current status, call DescribeProjectVersions and check the value of Status in the ProjectVersionDescription object. The copy operation has finished when the value of Status is COPYING_COMPLETED. This operation requires permissions to perform the rekognition:CopyProjectVersion action.
    */
  def copyProjectVersion(params: CopyProjectVersionRequest): Request[CopyProjectVersionResponse, AWSError] = js.native
  def copyProjectVersion(
    params: CopyProjectVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyProjectVersionResponse, Unit]
  ): Request[CopyProjectVersionResponse, AWSError] = js.native
  
  /**
    * Creates a collection in an AWS Region. You can add faces to the collection using the IndexFaces operation.  For example, you might create collections, one for each of your application users. A user can then index faces using the IndexFaces operation and persist results in a specific collection. Then, a user can search the collection for faces in the user-specific container.  When you create a collection, it is associated with the latest version of the face model version.  Collection names are case-sensitive.  This operation requires permissions to perform the rekognition:CreateCollection action. If you want to tag your collection, you also require permission to perform the rekognition:TagResource operation.
    */
  def createCollection(): Request[CreateCollectionResponse, AWSError] = js.native
  def createCollection(callback: js.Function2[/* err */ AWSError, /* data */ CreateCollectionResponse, Unit]): Request[CreateCollectionResponse, AWSError] = js.native
  /**
    * Creates a collection in an AWS Region. You can add faces to the collection using the IndexFaces operation.  For example, you might create collections, one for each of your application users. A user can then index faces using the IndexFaces operation and persist results in a specific collection. Then, a user can search the collection for faces in the user-specific container.  When you create a collection, it is associated with the latest version of the face model version.  Collection names are case-sensitive.  This operation requires permissions to perform the rekognition:CreateCollection action. If you want to tag your collection, you also require permission to perform the rekognition:TagResource operation.
    */
  def createCollection(params: CreateCollectionRequest): Request[CreateCollectionResponse, AWSError] = js.native
  def createCollection(
    params: CreateCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCollectionResponse, Unit]
  ): Request[CreateCollectionResponse, AWSError] = js.native
  
  /**
    * Creates a new Amazon Rekognition Custom Labels dataset. You can create a dataset by using an Amazon Sagemaker format manifest file or by copying an existing Amazon Rekognition Custom Labels dataset. To create a training dataset for a project, specify train for the value of DatasetType. To create the test dataset for a project, specify test for the value of DatasetType.  The response from CreateDataset is the Amazon Resource Name (ARN) for the dataset. Creating a dataset takes a while to complete. Use DescribeDataset to check the current status. The dataset created successfully if the value of Status is CREATE_COMPLETE.  To check if any non-terminal errors occurred, call ListDatasetEntries and check for the presence of errors lists in the JSON Lines. Dataset creation fails if a terminal error occurs (Status = CREATE_FAILED). Currently, you can't access the terminal error information.  For more information, see Creating dataset in the Amazon Rekognition Custom Labels Developer Guide. This operation requires permissions to perform the rekognition:CreateDataset action. If you want to copy an existing dataset, you also require permission to perform the rekognition:ListDatasetEntries action.
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Rekognition Custom Labels dataset. You can create a dataset by using an Amazon Sagemaker format manifest file or by copying an existing Amazon Rekognition Custom Labels dataset. To create a training dataset for a project, specify train for the value of DatasetType. To create the test dataset for a project, specify test for the value of DatasetType.  The response from CreateDataset is the Amazon Resource Name (ARN) for the dataset. Creating a dataset takes a while to complete. Use DescribeDataset to check the current status. The dataset created successfully if the value of Status is CREATE_COMPLETE.  To check if any non-terminal errors occurred, call ListDatasetEntries and check for the presence of errors lists in the JSON Lines. Dataset creation fails if a terminal error occurs (Status = CREATE_FAILED). Currently, you can't access the terminal error information.  For more information, see Creating dataset in the Amazon Rekognition Custom Labels Developer Guide. This operation requires permissions to perform the rekognition:CreateDataset action. If you want to copy an existing dataset, you also require permission to perform the rekognition:ListDatasetEntries action.
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    * This API operation initiates a Face Liveness session. It returns a SessionId, which you can use to start streaming Face Liveness video and get the results for a Face Liveness session. You can use the OutputConfig option in the Settings parameter to provide an Amazon S3 bucket location. The Amazon S3 bucket stores reference images and audit images. You can use AuditImagesLimit to limit the number of audit images returned. This number is between 0 and 4. By default, it is set to 0. The limit is best effort and based on the duration of the selfie-video. 
    */
  def createFaceLivenessSession(): Request[CreateFaceLivenessSessionResponse, AWSError] = js.native
  def createFaceLivenessSession(callback: js.Function2[/* err */ AWSError, /* data */ CreateFaceLivenessSessionResponse, Unit]): Request[CreateFaceLivenessSessionResponse, AWSError] = js.native
  /**
    * This API operation initiates a Face Liveness session. It returns a SessionId, which you can use to start streaming Face Liveness video and get the results for a Face Liveness session. You can use the OutputConfig option in the Settings parameter to provide an Amazon S3 bucket location. The Amazon S3 bucket stores reference images and audit images. You can use AuditImagesLimit to limit the number of audit images returned. This number is between 0 and 4. By default, it is set to 0. The limit is best effort and based on the duration of the selfie-video. 
    */
  def createFaceLivenessSession(params: CreateFaceLivenessSessionRequest): Request[CreateFaceLivenessSessionResponse, AWSError] = js.native
  def createFaceLivenessSession(
    params: CreateFaceLivenessSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFaceLivenessSessionResponse, Unit]
  ): Request[CreateFaceLivenessSessionResponse, AWSError] = js.native
  
  /**
    * Creates a new Amazon Rekognition Custom Labels project. A project is a group of resources (datasets, model versions) that you use to create and manage Amazon Rekognition Custom Labels models.  This operation requires permissions to perform the rekognition:CreateProject action.
    */
  def createProject(): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Rekognition Custom Labels project. A project is a group of resources (datasets, model versions) that you use to create and manage Amazon Rekognition Custom Labels models.  This operation requires permissions to perform the rekognition:CreateProject action.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]
  ): Request[CreateProjectResponse, AWSError] = js.native
  
  /**
    * Creates a new version of a model and begins training. Models are managed as part of an Amazon Rekognition Custom Labels project. The response from CreateProjectVersion is an Amazon Resource Name (ARN) for the version of the model.  Training uses the training and test datasets associated with the project. For more information, see Creating training and test dataset in the Amazon Rekognition Custom Labels Developer Guide.   You can train a model in a project that doesn't have associated datasets by specifying manifest files in the TrainingData and TestingData fields.  If you open the console after training a model with manifest files, Amazon Rekognition Custom Labels creates the datasets for you using the most recent manifest files. You can no longer train a model version for the project by specifying manifest files.  Instead of training with a project without associated datasets, we recommend that you use the manifest files to create training and test datasets for the project.  Training takes a while to complete. You can get the current status by calling DescribeProjectVersions. Training completed successfully if the value of the Status field is TRAINING_COMPLETED. If training fails, see Debugging a failed model training in the Amazon Rekognition Custom Labels developer guide.  Once training has successfully completed, call DescribeProjectVersions to get the training results and evaluate the model. For more information, see Improving a trained Amazon Rekognition Custom Labels model in the Amazon Rekognition Custom Labels developers guide.  After evaluating the model, you start the model by calling StartProjectVersion. This operation requires permissions to perform the rekognition:CreateProjectVersion action.
    */
  def createProjectVersion(): Request[CreateProjectVersionResponse, AWSError] = js.native
  def createProjectVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectVersionResponse, Unit]): Request[CreateProjectVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of a model and begins training. Models are managed as part of an Amazon Rekognition Custom Labels project. The response from CreateProjectVersion is an Amazon Resource Name (ARN) for the version of the model.  Training uses the training and test datasets associated with the project. For more information, see Creating training and test dataset in the Amazon Rekognition Custom Labels Developer Guide.   You can train a model in a project that doesn't have associated datasets by specifying manifest files in the TrainingData and TestingData fields.  If you open the console after training a model with manifest files, Amazon Rekognition Custom Labels creates the datasets for you using the most recent manifest files. You can no longer train a model version for the project by specifying manifest files.  Instead of training with a project without associated datasets, we recommend that you use the manifest files to create training and test datasets for the project.  Training takes a while to complete. You can get the current status by calling DescribeProjectVersions. Training completed successfully if the value of the Status field is TRAINING_COMPLETED. If training fails, see Debugging a failed model training in the Amazon Rekognition Custom Labels developer guide.  Once training has successfully completed, call DescribeProjectVersions to get the training results and evaluate the model. For more information, see Improving a trained Amazon Rekognition Custom Labels model in the Amazon Rekognition Custom Labels developers guide.  After evaluating the model, you start the model by calling StartProjectVersion. This operation requires permissions to perform the rekognition:CreateProjectVersion action.
    */
  def createProjectVersion(params: CreateProjectVersionRequest): Request[CreateProjectVersionResponse, AWSError] = js.native
  def createProjectVersion(
    params: CreateProjectVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectVersionResponse, Unit]
  ): Request[CreateProjectVersionResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces or to detect labels in a streaming video. Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. There are two different settings for stream processors in Amazon Rekognition: detecting faces and detecting labels.   If you are creating a stream processor for detecting faces, you provide as input a Kinesis video stream (Input) and a Kinesis data stream (Output) stream for receiving the output. You must use the FaceSearch option in Settings, specifying the collection that contains the faces you want to recognize. After you have finished analyzing a streaming video, use StopStreamProcessor to stop processing.   If you are creating a stream processor to detect labels, you provide as input a Kinesis video stream (Input), Amazon S3 bucket information (Output), and an Amazon SNS topic ARN (NotificationChannel). You can also provide a KMS key ID to encrypt the data sent to your Amazon S3 bucket. You specify what you want to detect by using the ConnectedHome option in settings, and selecting one of the following: PERSON, PET, PACKAGE, ALL You can also specify where in the frame you want Amazon Rekognition to monitor with RegionsOfInterest. When you run the StartStreamProcessor operation on a label detection stream processor, you input start and stop information to determine the length of the processing time.    Use Name to assign an identifier for the stream processor. You use Name to manage the stream processor. For example, you can start processing the source video by calling StartStreamProcessor with the Name field.  This operation requires permissions to perform the rekognition:CreateStreamProcessor action. If you want to tag your stream processor, you also require permission to perform the rekognition:TagResource operation.
    */
  def createStreamProcessor(): Request[CreateStreamProcessorResponse, AWSError] = js.native
  def createStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamProcessorResponse, Unit]): Request[CreateStreamProcessorResponse, AWSError] = js.native
  /**
    * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces or to detect labels in a streaming video. Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. There are two different settings for stream processors in Amazon Rekognition: detecting faces and detecting labels.   If you are creating a stream processor for detecting faces, you provide as input a Kinesis video stream (Input) and a Kinesis data stream (Output) stream for receiving the output. You must use the FaceSearch option in Settings, specifying the collection that contains the faces you want to recognize. After you have finished analyzing a streaming video, use StopStreamProcessor to stop processing.   If you are creating a stream processor to detect labels, you provide as input a Kinesis video stream (Input), Amazon S3 bucket information (Output), and an Amazon SNS topic ARN (NotificationChannel). You can also provide a KMS key ID to encrypt the data sent to your Amazon S3 bucket. You specify what you want to detect by using the ConnectedHome option in settings, and selecting one of the following: PERSON, PET, PACKAGE, ALL You can also specify where in the frame you want Amazon Rekognition to monitor with RegionsOfInterest. When you run the StartStreamProcessor operation on a label detection stream processor, you input start and stop information to determine the length of the processing time.    Use Name to assign an identifier for the stream processor. You use Name to manage the stream processor. For example, you can start processing the source video by calling StartStreamProcessor with the Name field.  This operation requires permissions to perform the rekognition:CreateStreamProcessor action. If you want to tag your stream processor, you also require permission to perform the rekognition:TagResource operation.
    */
  def createStreamProcessor(params: CreateStreamProcessorRequest): Request[CreateStreamProcessorResponse, AWSError] = js.native
  def createStreamProcessor(
    params: CreateStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamProcessorResponse, Unit]
  ): Request[CreateStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example, see Deleting a collection. This operation requires permissions to perform the rekognition:DeleteCollection action.
    */
  def deleteCollection(): Request[DeleteCollectionResponse, AWSError] = js.native
  def deleteCollection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCollectionResponse, Unit]): Request[DeleteCollectionResponse, AWSError] = js.native
  /**
    * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example, see Deleting a collection. This operation requires permissions to perform the rekognition:DeleteCollection action.
    */
  def deleteCollection(params: DeleteCollectionRequest): Request[DeleteCollectionResponse, AWSError] = js.native
  def deleteCollection(
    params: DeleteCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCollectionResponse, Unit]
  ): Request[DeleteCollectionResponse, AWSError] = js.native
  
  /**
    * Deletes an existing Amazon Rekognition Custom Labels dataset. Deleting a dataset might take while. Use DescribeDataset to check the current status. The dataset is still deleting if the value of Status is DELETE_IN_PROGRESS. If you try to access the dataset after it is deleted, you get a ResourceNotFoundException exception.  You can't delete a dataset while it is creating (Status = CREATE_IN_PROGRESS) or if the dataset is updating (Status = UPDATE_IN_PROGRESS). This operation requires permissions to perform the rekognition:DeleteDataset action.
    */
  def deleteDataset(): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]): Request[DeleteDatasetResponse, AWSError] = js.native
  /**
    * Deletes an existing Amazon Rekognition Custom Labels dataset. Deleting a dataset might take while. Use DescribeDataset to check the current status. The dataset is still deleting if the value of Status is DELETE_IN_PROGRESS. If you try to access the dataset after it is deleted, you get a ResourceNotFoundException exception.  You can't delete a dataset while it is creating (Status = CREATE_IN_PROGRESS) or if the dataset is updating (Status = UPDATE_IN_PROGRESS). This operation requires permissions to perform the rekognition:DeleteDataset action.
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]
  ): Request[DeleteDatasetResponse, AWSError] = js.native
  
  /**
    * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the collection. This operation requires permissions to perform the rekognition:DeleteFaces action.
    */
  def deleteFaces(): Request[DeleteFacesResponse, AWSError] = js.native
  def deleteFaces(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFacesResponse, Unit]): Request[DeleteFacesResponse, AWSError] = js.native
  /**
    * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the collection. This operation requires permissions to perform the rekognition:DeleteFaces action.
    */
  def deleteFaces(params: DeleteFacesRequest): Request[DeleteFacesResponse, AWSError] = js.native
  def deleteFaces(
    params: DeleteFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFacesResponse, Unit]
  ): Request[DeleteFacesResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Rekognition Custom Labels project. To delete a project you must first delete all models associated with the project. To delete a model, see DeleteProjectVersion.  DeleteProject is an asynchronous operation. To check if the project is deleted, call DescribeProjects. The project is deleted when the project no longer appears in the response. Be aware that deleting a given project will also delete any ProjectPolicies associated with that project. This operation requires permissions to perform the rekognition:DeleteProject action. 
    */
  def deleteProject(): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]): Request[DeleteProjectResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Rekognition Custom Labels project. To delete a project you must first delete all models associated with the project. To delete a model, see DeleteProjectVersion.  DeleteProject is an asynchronous operation. To check if the project is deleted, call DescribeProjects. The project is deleted when the project no longer appears in the response. Be aware that deleting a given project will also delete any ProjectPolicies associated with that project. This operation requires permissions to perform the rekognition:DeleteProject action. 
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]
  ): Request[DeleteProjectResponse, AWSError] = js.native
  
  /**
    * Deletes an existing project policy. To get a list of project policies attached to a project, call ListProjectPolicies. To attach a project policy to a project, call PutProjectPolicy. This operation requires permissions to perform the rekognition:DeleteProjectPolicy action.
    */
  def deleteProjectPolicy(): Request[DeleteProjectPolicyResponse, AWSError] = js.native
  def deleteProjectPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectPolicyResponse, Unit]): Request[DeleteProjectPolicyResponse, AWSError] = js.native
  /**
    * Deletes an existing project policy. To get a list of project policies attached to a project, call ListProjectPolicies. To attach a project policy to a project, call PutProjectPolicy. This operation requires permissions to perform the rekognition:DeleteProjectPolicy action.
    */
  def deleteProjectPolicy(params: DeleteProjectPolicyRequest): Request[DeleteProjectPolicyResponse, AWSError] = js.native
  def deleteProjectPolicy(
    params: DeleteProjectPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectPolicyResponse, Unit]
  ): Request[DeleteProjectPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Rekognition Custom Labels model.  You can't delete a model if it is running or if it is training. To check the status of a model, use the Status field returned from DescribeProjectVersions. To stop a running model call StopProjectVersion. If the model is training, wait until it finishes. This operation requires permissions to perform the rekognition:DeleteProjectVersion action. 
    */
  def deleteProjectVersion(): Request[DeleteProjectVersionResponse, AWSError] = js.native
  def deleteProjectVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectVersionResponse, Unit]): Request[DeleteProjectVersionResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Rekognition Custom Labels model.  You can't delete a model if it is running or if it is training. To check the status of a model, use the Status field returned from DescribeProjectVersions. To stop a running model call StopProjectVersion. If the model is training, wait until it finishes. This operation requires permissions to perform the rekognition:DeleteProjectVersion action. 
    */
  def deleteProjectVersion(params: DeleteProjectVersionRequest): Request[DeleteProjectVersionResponse, AWSError] = js.native
  def deleteProjectVersion(
    params: DeleteProjectVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectVersionResponse, Unit]
  ): Request[DeleteProjectVersionResponse, AWSError] = js.native
  
  /**
    * Deletes the stream processor identified by Name. You assign the value for Name when you create the stream processor with CreateStreamProcessor. You might not be able to use the same name for a stream processor for a few seconds after calling DeleteStreamProcessor.
    */
  def deleteStreamProcessor(): Request[DeleteStreamProcessorResponse, AWSError] = js.native
  def deleteStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamProcessorResponse, Unit]): Request[DeleteStreamProcessorResponse, AWSError] = js.native
  /**
    * Deletes the stream processor identified by Name. You assign the value for Name when you create the stream processor with CreateStreamProcessor. You might not be able to use the same name for a stream processor for a few seconds after calling DeleteStreamProcessor.
    */
  def deleteStreamProcessor(params: DeleteStreamProcessorRequest): Request[DeleteStreamProcessorResponse, AWSError] = js.native
  def deleteStreamProcessor(
    params: DeleteStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamProcessorResponse, Unit]
  ): Request[DeleteStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Describes the specified collection. You can use DescribeCollection to get information, such as the number of faces indexed into a collection and the version of the model used by the collection for face detection. For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
    */
  def describeCollection(): Request[DescribeCollectionResponse, AWSError] = js.native
  def describeCollection(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCollectionResponse, Unit]): Request[DescribeCollectionResponse, AWSError] = js.native
  /**
    * Describes the specified collection. You can use DescribeCollection to get information, such as the number of faces indexed into a collection and the version of the model used by the collection for face detection. For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
    */
  def describeCollection(params: DescribeCollectionRequest): Request[DescribeCollectionResponse, AWSError] = js.native
  def describeCollection(
    params: DescribeCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCollectionResponse, Unit]
  ): Request[DescribeCollectionResponse, AWSError] = js.native
  
  /**
    *  Describes an Amazon Rekognition Custom Labels dataset. You can get information such as the current status of a dataset and statistics about the images and labels in a dataset.  This operation requires permissions to perform the rekognition:DescribeDataset action.
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    *  Describes an Amazon Rekognition Custom Labels dataset. You can get information such as the current status of a dataset and statistics about the images and labels in a dataset.  This operation requires permissions to perform the rekognition:DescribeDataset action.
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  
  /**
    * Lists and describes the versions of a model in an Amazon Rekognition Custom Labels project. You can specify up to 10 model versions in ProjectVersionArns. If you don't specify a value, descriptions for all model versions in the project are returned. This operation requires permissions to perform the rekognition:DescribeProjectVersions action.
    */
  def describeProjectVersions(): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  def describeProjectVersions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  /**
    * Lists and describes the versions of a model in an Amazon Rekognition Custom Labels project. You can specify up to 10 model versions in ProjectVersionArns. If you don't specify a value, descriptions for all model versions in the project are returned. This operation requires permissions to perform the rekognition:DescribeProjectVersions action.
    */
  def describeProjectVersions(params: DescribeProjectVersionsRequest): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  def describeProjectVersions(
    params: DescribeProjectVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  
  /**
    * Gets information about your Amazon Rekognition Custom Labels projects.  This operation requires permissions to perform the rekognition:DescribeProjects action.
    */
  def describeProjects(): Request[DescribeProjectsResponse, AWSError] = js.native
  def describeProjects(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectsResponse, Unit]): Request[DescribeProjectsResponse, AWSError] = js.native
  /**
    * Gets information about your Amazon Rekognition Custom Labels projects.  This operation requires permissions to perform the rekognition:DescribeProjects action.
    */
  def describeProjects(params: DescribeProjectsRequest): Request[DescribeProjectsResponse, AWSError] = js.native
  def describeProjects(
    params: DescribeProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectsResponse, Unit]
  ): Request[DescribeProjectsResponse, AWSError] = js.native
  
  /**
    * Provides information about a stream processor created by CreateStreamProcessor. You can get information about the input and output streams, the input parameters for the face recognition being performed, and the current status of the stream processor.
    */
  def describeStreamProcessor(): Request[DescribeStreamProcessorResponse, AWSError] = js.native
  def describeStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamProcessorResponse, Unit]): Request[DescribeStreamProcessorResponse, AWSError] = js.native
  /**
    * Provides information about a stream processor created by CreateStreamProcessor. You can get information about the input and output streams, the input parameters for the face recognition being performed, and the current status of the stream processor.
    */
  def describeStreamProcessor(params: DescribeStreamProcessorRequest): Request[DescribeStreamProcessorResponse, AWSError] = js.native
  def describeStreamProcessor(
    params: DescribeStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamProcessorResponse, Unit]
  ): Request[DescribeStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Detects custom labels in a supplied image by using an Amazon Rekognition Custom Labels model.  You specify which version of a model version to use by using the ProjectVersionArn input parameter.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object that the model version detects on an image, the API returns a (CustomLabel) object in an array (CustomLabels). Each CustomLabel object provides the label name (Name), the level of confidence that the image contains the object (Confidence), and object location information, if it exists, for the label on the image (Geometry).  To filter labels that are returned, specify a value for MinConfidence. DetectCustomLabelsLabels only returns labels with a confidence that's higher than the specified value. The value of MinConfidence maps to the assumed threshold values created during training. For more information, see Assumed threshold in the Amazon Rekognition Custom Labels Developer Guide. Amazon Rekognition Custom Labels metrics expresses an assumed threshold as a floating point value between 0-1. The range of MinConfidence normalizes the threshold value to a percentage value (0-100). Confidence responses from DetectCustomLabels are also returned as a percentage. You can use MinConfidence to change the precision and recall or your model. For more information, see Analyzing an image in the Amazon Rekognition Custom Labels Developer Guide.  If you don't specify a value for MinConfidence, DetectCustomLabels returns labels based on the assumed threshold of each label. This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectCustomLabels action.  For more information, see Analyzing an image in the Amazon Rekognition Custom Labels Developer Guide. 
    */
  def detectCustomLabels(): Request[DetectCustomLabelsResponse, AWSError] = js.native
  def detectCustomLabels(callback: js.Function2[/* err */ AWSError, /* data */ DetectCustomLabelsResponse, Unit]): Request[DetectCustomLabelsResponse, AWSError] = js.native
  /**
    * Detects custom labels in a supplied image by using an Amazon Rekognition Custom Labels model.  You specify which version of a model version to use by using the ProjectVersionArn input parameter.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object that the model version detects on an image, the API returns a (CustomLabel) object in an array (CustomLabels). Each CustomLabel object provides the label name (Name), the level of confidence that the image contains the object (Confidence), and object location information, if it exists, for the label on the image (Geometry).  To filter labels that are returned, specify a value for MinConfidence. DetectCustomLabelsLabels only returns labels with a confidence that's higher than the specified value. The value of MinConfidence maps to the assumed threshold values created during training. For more information, see Assumed threshold in the Amazon Rekognition Custom Labels Developer Guide. Amazon Rekognition Custom Labels metrics expresses an assumed threshold as a floating point value between 0-1. The range of MinConfidence normalizes the threshold value to a percentage value (0-100). Confidence responses from DetectCustomLabels are also returned as a percentage. You can use MinConfidence to change the precision and recall or your model. For more information, see Analyzing an image in the Amazon Rekognition Custom Labels Developer Guide.  If you don't specify a value for MinConfidence, DetectCustomLabels returns labels based on the assumed threshold of each label. This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectCustomLabels action.  For more information, see Analyzing an image in the Amazon Rekognition Custom Labels Developer Guide. 
    */
  def detectCustomLabels(params: DetectCustomLabelsRequest): Request[DetectCustomLabelsResponse, AWSError] = js.native
  def detectCustomLabels(
    params: DetectCustomLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectCustomLabelsResponse, Unit]
  ): Request[DetectCustomLabelsResponse, AWSError] = js.native
  
  /**
    * Detects faces within an image that is provided as input.  DetectFaces detects the 100 largest faces in the image. For each face detected, the operation returns face details. These details include a bounding box of the face, a confidence value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth), pose, presence of facial occlusion, and so on. The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm might not detect the faces or might detect faces with lower confidence.  You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   This is a stateless API operation. That is, the operation does not persist any data.  This operation requires permissions to perform the rekognition:DetectFaces action. 
    */
  def detectFaces(): Request[DetectFacesResponse, AWSError] = js.native
  def detectFaces(callback: js.Function2[/* err */ AWSError, /* data */ DetectFacesResponse, Unit]): Request[DetectFacesResponse, AWSError] = js.native
  /**
    * Detects faces within an image that is provided as input.  DetectFaces detects the 100 largest faces in the image. For each face detected, the operation returns face details. These details include a bounding box of the face, a confidence value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth), pose, presence of facial occlusion, and so on. The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm might not detect the faces or might detect faces with lower confidence.  You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   This is a stateless API operation. That is, the operation does not persist any data.  This operation requires permissions to perform the rekognition:DetectFaces action. 
    */
  def detectFaces(params: DetectFacesRequest): Request[DetectFacesResponse, AWSError] = js.native
  def detectFaces(
    params: DetectFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectFacesResponse, Unit]
  ): Request[DetectFacesResponse, AWSError] = js.native
  
  /**
    * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape, evening, and nature.  For an example, see Analyzing images stored in an Amazon S3 bucket in the Amazon Rekognition Developer Guide. You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   Optional Parameters  You can specify one or both of the GENERAL_LABELS and IMAGE_PROPERTIES feature types when calling the DetectLabels API. Including GENERAL_LABELS will ensure the response includes the labels detected in the input image, while including IMAGE_PROPERTIES will ensure the response includes information about the image quality and color. When using GENERAL_LABELS and/or IMAGE_PROPERTIES you can provide filtering criteria to the Settings parameter. You can filter with sets of individual labels or with label categories. You can specify inclusive filters, exclusive filters, or a combination of inclusive and exclusive filters. For more information on filtering see Detecting Labels in an Image. You can specify MinConfidence to control the confidence threshold for the labels returned. The default is 55%. You can also add the MaxLabels parameter to limit the number of labels returned. The default and upper limit is 1000 labels.  Response Elements   For each object, scene, and concept the API returns one or more labels. The API returns the following types of information about labels:    Name - The name of the detected label.     Confidence - The level of confidence in the label assigned to a detected object.     Parents - The ancestor labels for a detected label. DetectLabels returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response includes the all ancestors for a label, where every ancestor is a unique label. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.     Aliases - Possible Aliases for the label.     Categories - The label categories that the detected label belongs to.     BoundingBox — Bounding boxes are described for all instances of detected common object labels, returned in an array of Instance objects. An Instance object contains a BoundingBox object, describing the location of the label on the input image. It also includes the confidence for the accuracy of the detected bounding box.     The API returns the following information regarding the image, as part of the ImageProperties structure:   Quality - Information about the Sharpness, Brightness, and Contrast of the input image, scored between 0 to 100. Image quality is returned for the entire image, as well as the background and the foreground.    Dominant Color - An array of the dominant colors in the image.    Foreground - Information about the sharpness, brightness, and dominant colors of the input image’s foreground.    Background - Information about the sharpness, brightness, and dominant colors of the input image’s background.   The list of returned labels will include at least one label for every detected object, along with information about that label. In the following example, suppose the input image has a lighthouse, the sea, and a rock. The response includes all three labels, one for each object, as well as the confidence in the label:  {Name: lighthouse, Confidence: 98.4629}   {Name: rock,Confidence: 79.2097}    {Name: sea,Confidence: 75.061}  The list of labels can include multiple labels for the same object. For example, if the input image shows a flower (for example, a tulip), the operation might return the following three labels.   {Name: flower,Confidence: 99.0562}   {Name: plant,Confidence: 99.0562}   {Name: tulip,Confidence: 99.0562}  In this example, the detection algorithm more precisely identifies the flower as a tulip.  If the object detected is a person, the operation doesn't provide the same facial details that the DetectFaces operation provides.  This is a stateless API operation that doesn't return any data. This operation requires permissions to perform the rekognition:DetectLabels action. 
    */
  def detectLabels(): Request[DetectLabelsResponse, AWSError] = js.native
  def detectLabels(callback: js.Function2[/* err */ AWSError, /* data */ DetectLabelsResponse, Unit]): Request[DetectLabelsResponse, AWSError] = js.native
  /**
    * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape, evening, and nature.  For an example, see Analyzing images stored in an Amazon S3 bucket in the Amazon Rekognition Developer Guide. You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   Optional Parameters  You can specify one or both of the GENERAL_LABELS and IMAGE_PROPERTIES feature types when calling the DetectLabels API. Including GENERAL_LABELS will ensure the response includes the labels detected in the input image, while including IMAGE_PROPERTIES will ensure the response includes information about the image quality and color. When using GENERAL_LABELS and/or IMAGE_PROPERTIES you can provide filtering criteria to the Settings parameter. You can filter with sets of individual labels or with label categories. You can specify inclusive filters, exclusive filters, or a combination of inclusive and exclusive filters. For more information on filtering see Detecting Labels in an Image. You can specify MinConfidence to control the confidence threshold for the labels returned. The default is 55%. You can also add the MaxLabels parameter to limit the number of labels returned. The default and upper limit is 1000 labels.  Response Elements   For each object, scene, and concept the API returns one or more labels. The API returns the following types of information about labels:    Name - The name of the detected label.     Confidence - The level of confidence in the label assigned to a detected object.     Parents - The ancestor labels for a detected label. DetectLabels returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response includes the all ancestors for a label, where every ancestor is a unique label. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.     Aliases - Possible Aliases for the label.     Categories - The label categories that the detected label belongs to.     BoundingBox — Bounding boxes are described for all instances of detected common object labels, returned in an array of Instance objects. An Instance object contains a BoundingBox object, describing the location of the label on the input image. It also includes the confidence for the accuracy of the detected bounding box.     The API returns the following information regarding the image, as part of the ImageProperties structure:   Quality - Information about the Sharpness, Brightness, and Contrast of the input image, scored between 0 to 100. Image quality is returned for the entire image, as well as the background and the foreground.    Dominant Color - An array of the dominant colors in the image.    Foreground - Information about the sharpness, brightness, and dominant colors of the input image’s foreground.    Background - Information about the sharpness, brightness, and dominant colors of the input image’s background.   The list of returned labels will include at least one label for every detected object, along with information about that label. In the following example, suppose the input image has a lighthouse, the sea, and a rock. The response includes all three labels, one for each object, as well as the confidence in the label:  {Name: lighthouse, Confidence: 98.4629}   {Name: rock,Confidence: 79.2097}    {Name: sea,Confidence: 75.061}  The list of labels can include multiple labels for the same object. For example, if the input image shows a flower (for example, a tulip), the operation might return the following three labels.   {Name: flower,Confidence: 99.0562}   {Name: plant,Confidence: 99.0562}   {Name: tulip,Confidence: 99.0562}  In this example, the detection algorithm more precisely identifies the flower as a tulip.  If the object detected is a person, the operation doesn't provide the same facial details that the DetectFaces operation provides.  This is a stateless API operation that doesn't return any data. This operation requires permissions to perform the rekognition:DetectLabels action. 
    */
  def detectLabels(params: DetectLabelsRequest): Request[DetectLabelsResponse, AWSError] = js.native
  def detectLabels(
    params: DetectLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectLabelsResponse, Unit]
  ): Request[DetectLabelsResponse, AWSError] = js.native
  
  /**
    * Detects unsafe content in a specified JPEG or PNG format image. Use DetectModerationLabels to moderate images depending on your requirements. For example, you might want to filter images that contain nudity, but not images containing suggestive content. To filter images, use the labels returned by DetectModerationLabels to determine which types of content are appropriate. For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file. 
    */
  def detectModerationLabels(): Request[DetectModerationLabelsResponse, AWSError] = js.native
  def detectModerationLabels(callback: js.Function2[/* err */ AWSError, /* data */ DetectModerationLabelsResponse, Unit]): Request[DetectModerationLabelsResponse, AWSError] = js.native
  /**
    * Detects unsafe content in a specified JPEG or PNG format image. Use DetectModerationLabels to moderate images depending on your requirements. For example, you might want to filter images that contain nudity, but not images containing suggestive content. To filter images, use the labels returned by DetectModerationLabels to determine which types of content are appropriate. For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file. 
    */
  def detectModerationLabels(params: DetectModerationLabelsRequest): Request[DetectModerationLabelsResponse, AWSError] = js.native
  def detectModerationLabels(
    params: DetectModerationLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectModerationLabelsResponse, Unit]
  ): Request[DetectModerationLabelsResponse, AWSError] = js.native
  
  /**
    * Detects Personal Protective Equipment (PPE) worn by people detected in an image. Amazon Rekognition can detect the following types of PPE.   Face cover   Hand cover   Head cover   You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. The image must be either a PNG or JPG formatted file.   DetectProtectiveEquipment detects PPE worn by up to 15 persons detected in an image. For each person detected in the image the API returns an array of body parts (face, head, left-hand, right-hand). For each body part, an array of detected items of PPE is returned, including an indicator of whether or not the PPE covers the body part. The API returns the confidence it has in each detection (person, PPE, body part and body part coverage). It also returns a bounding box (BoundingBox) for each detected person and each detected item of PPE.  You can optionally request a summary of detected PPE items with the SummarizationAttributes input parameter. The summary provides the following information.    The persons detected as wearing all of the types of PPE that you specify.   The persons detected as not wearing all of the types PPE that you specify.   The persons detected where PPE adornment could not be determined.    This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectProtectiveEquipment action. 
    */
  def detectProtectiveEquipment(): Request[DetectProtectiveEquipmentResponse, AWSError] = js.native
  def detectProtectiveEquipment(callback: js.Function2[/* err */ AWSError, /* data */ DetectProtectiveEquipmentResponse, Unit]): Request[DetectProtectiveEquipmentResponse, AWSError] = js.native
  /**
    * Detects Personal Protective Equipment (PPE) worn by people detected in an image. Amazon Rekognition can detect the following types of PPE.   Face cover   Hand cover   Head cover   You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. The image must be either a PNG or JPG formatted file.   DetectProtectiveEquipment detects PPE worn by up to 15 persons detected in an image. For each person detected in the image the API returns an array of body parts (face, head, left-hand, right-hand). For each body part, an array of detected items of PPE is returned, including an indicator of whether or not the PPE covers the body part. The API returns the confidence it has in each detection (person, PPE, body part and body part coverage). It also returns a bounding box (BoundingBox) for each detected person and each detected item of PPE.  You can optionally request a summary of detected PPE items with the SummarizationAttributes input parameter. The summary provides the following information.    The persons detected as wearing all of the types of PPE that you specify.   The persons detected as not wearing all of the types PPE that you specify.   The persons detected where PPE adornment could not be determined.    This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectProtectiveEquipment action. 
    */
  def detectProtectiveEquipment(params: DetectProtectiveEquipmentRequest): Request[DetectProtectiveEquipmentResponse, AWSError] = js.native
  def detectProtectiveEquipment(
    params: DetectProtectiveEquipmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectProtectiveEquipmentResponse, Unit]
  ): Request[DetectProtectiveEquipmentResponse, AWSError] = js.native
  
  /**
    * Detects text in the input image and converts it into machine-readable text. Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg formatted file.  The DetectText operation returns text in an array of TextDetection elements, TextDetections. Each TextDetection element provides information about a single word or line of text that was detected in the image.  A word is one or more script characters that are not separated by spaces. DetectText can detect up to 100 words in an image. A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when there is a large gap between words, relative to the length of the words. This means, depending on the gap between words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't represent the end of a line. If a sentence spans multiple lines, the DetectText operation returns multiple lines. To determine whether a TextDetection element is a line of text or a word, use the TextDetection object Type field.  To be detected, text must be within +/- 90 degrees orientation of the horizontal axis. For more information, see Detecting text in the Amazon Rekognition Developer Guide.
    */
  def detectText(): Request[DetectTextResponse, AWSError] = js.native
  def detectText(callback: js.Function2[/* err */ AWSError, /* data */ DetectTextResponse, Unit]): Request[DetectTextResponse, AWSError] = js.native
  /**
    * Detects text in the input image and converts it into machine-readable text. Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg formatted file.  The DetectText operation returns text in an array of TextDetection elements, TextDetections. Each TextDetection element provides information about a single word or line of text that was detected in the image.  A word is one or more script characters that are not separated by spaces. DetectText can detect up to 100 words in an image. A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when there is a large gap between words, relative to the length of the words. This means, depending on the gap between words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't represent the end of a line. If a sentence spans multiple lines, the DetectText operation returns multiple lines. To determine whether a TextDetection element is a line of text or a word, use the TextDetection object Type field.  To be detected, text must be within +/- 90 degrees orientation of the horizontal axis. For more information, see Detecting text in the Amazon Rekognition Developer Guide.
    */
  def detectText(params: DetectTextRequest): Request[DetectTextResponse, AWSError] = js.native
  def detectText(
    params: DetectTextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectTextResponse, Unit]
  ): Request[DetectTextResponse, AWSError] = js.native
  
  /**
    * Distributes the entries (images) in a training dataset across the training dataset and the test dataset for a project. DistributeDatasetEntries moves 20% of the training dataset images to the test dataset. An entry is a JSON Line that describes an image.  You supply the Amazon Resource Names (ARN) of a project's training dataset and test dataset. The training dataset must contain the images that you want to split. The test dataset must be empty. The datasets must belong to the same project. To create training and test datasets for a project, call CreateDataset. Distributing a dataset takes a while to complete. To check the status call DescribeDataset. The operation is complete when the Status field for the training dataset and the test dataset is UPDATE_COMPLETE. If the dataset split fails, the value of Status is UPDATE_FAILED. This operation requires permissions to perform the rekognition:DistributeDatasetEntries action.
    */
  def distributeDatasetEntries(): Request[DistributeDatasetEntriesResponse, AWSError] = js.native
  def distributeDatasetEntries(callback: js.Function2[/* err */ AWSError, /* data */ DistributeDatasetEntriesResponse, Unit]): Request[DistributeDatasetEntriesResponse, AWSError] = js.native
  /**
    * Distributes the entries (images) in a training dataset across the training dataset and the test dataset for a project. DistributeDatasetEntries moves 20% of the training dataset images to the test dataset. An entry is a JSON Line that describes an image.  You supply the Amazon Resource Names (ARN) of a project's training dataset and test dataset. The training dataset must contain the images that you want to split. The test dataset must be empty. The datasets must belong to the same project. To create training and test datasets for a project, call CreateDataset. Distributing a dataset takes a while to complete. To check the status call DescribeDataset. The operation is complete when the Status field for the training dataset and the test dataset is UPDATE_COMPLETE. If the dataset split fails, the value of Status is UPDATE_FAILED. This operation requires permissions to perform the rekognition:DistributeDatasetEntries action.
    */
  def distributeDatasetEntries(params: DistributeDatasetEntriesRequest): Request[DistributeDatasetEntriesResponse, AWSError] = js.native
  def distributeDatasetEntries(
    params: DistributeDatasetEntriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DistributeDatasetEntriesResponse, Unit]
  ): Request[DistributeDatasetEntriesResponse, AWSError] = js.native
  
  /**
    * Gets the name and additional information about a celebrity based on their Amazon Rekognition ID. The additional information is returned as an array of URLs. If there is no additional information about the celebrity, this list is empty. For more information, see Getting information about a celebrity in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:GetCelebrityInfo action. 
    */
  def getCelebrityInfo(): Request[GetCelebrityInfoResponse, AWSError] = js.native
  def getCelebrityInfo(callback: js.Function2[/* err */ AWSError, /* data */ GetCelebrityInfoResponse, Unit]): Request[GetCelebrityInfoResponse, AWSError] = js.native
  /**
    * Gets the name and additional information about a celebrity based on their Amazon Rekognition ID. The additional information is returned as an array of URLs. If there is no additional information about the celebrity, this list is empty. For more information, see Getting information about a celebrity in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:GetCelebrityInfo action. 
    */
  def getCelebrityInfo(params: GetCelebrityInfoRequest): Request[GetCelebrityInfoResponse, AWSError] = js.native
  def getCelebrityInfo(
    params: GetCelebrityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCelebrityInfoResponse, Unit]
  ): Request[GetCelebrityInfoResponse, AWSError] = js.native
  
  /**
    * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by StartCelebrityRecognition. Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to StartCelebrityRecognition which returns a job identifier (JobId).  When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartCelebrityRecognition. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.  GetCelebrityRecognition returns detected celebrities and the time(s) they are detected in an array (Celebrities) of CelebrityRecognition objects. Each CelebrityRecognition contains information about the celebrity in a CelebrityDetail object and the time, Timestamp, the celebrity was detected. This CelebrityDetail object stores information about the detected celebrity's face attributes, a face bounding box, known gender, the celebrity's name, and a confidence estimate.   GetCelebrityRecognition only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The BoundingBox field only applies to the detected face instance. The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Celebrities array is sorted by time (milliseconds from the start of the video). You can also sort the array by celebrity by specifying the value ID in the SortBy input parameter. The CelebrityDetail object includes the celebrity identifer and additional information urls. If you don't store the additional information urls, you can get them later by calling GetCelebrityInfo with the celebrity identifer. No information is returned for faces not recognized as celebrities. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetCelebrityDetection and populate the NextToken request parameter with the token value returned from the previous call to GetCelebrityRecognition.
    */
  def getCelebrityRecognition(): Request[GetCelebrityRecognitionResponse, AWSError] = js.native
  def getCelebrityRecognition(callback: js.Function2[/* err */ AWSError, /* data */ GetCelebrityRecognitionResponse, Unit]): Request[GetCelebrityRecognitionResponse, AWSError] = js.native
  /**
    * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by StartCelebrityRecognition. Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to StartCelebrityRecognition which returns a job identifier (JobId).  When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartCelebrityRecognition. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.  GetCelebrityRecognition returns detected celebrities and the time(s) they are detected in an array (Celebrities) of CelebrityRecognition objects. Each CelebrityRecognition contains information about the celebrity in a CelebrityDetail object and the time, Timestamp, the celebrity was detected. This CelebrityDetail object stores information about the detected celebrity's face attributes, a face bounding box, known gender, the celebrity's name, and a confidence estimate.   GetCelebrityRecognition only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The BoundingBox field only applies to the detected face instance. The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Celebrities array is sorted by time (milliseconds from the start of the video). You can also sort the array by celebrity by specifying the value ID in the SortBy input parameter. The CelebrityDetail object includes the celebrity identifer and additional information urls. If you don't store the additional information urls, you can get them later by calling GetCelebrityInfo with the celebrity identifer. No information is returned for faces not recognized as celebrities. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetCelebrityDetection and populate the NextToken request parameter with the token value returned from the previous call to GetCelebrityRecognition.
    */
  def getCelebrityRecognition(params: GetCelebrityRecognitionRequest): Request[GetCelebrityRecognitionResponse, AWSError] = js.native
  def getCelebrityRecognition(
    params: GetCelebrityRecognitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCelebrityRecognitionResponse, Unit]
  ): Request[GetCelebrityRecognitionResponse, AWSError] = js.native
  
  /**
    * Gets the inappropriate, unwanted, or offensive content analysis results for a Amazon Rekognition Video analysis started by StartContentModeration. For a list of moderation labels in Amazon Rekognition, see Using the image and video moderation APIs. Amazon Rekognition Video inappropriate or offensive content detection in a stored video is an asynchronous operation. You start analysis by calling StartContentModeration which returns a job identifier (JobId). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartContentModeration. To get the results of the content analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.  GetContentModeration returns detected inappropriate, unwanted, or offensive content moderation labels, and the time they are detected, in an array, ModerationLabels, of ContentModerationDetection objects.  By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You can also sort them by moderated label by specifying NAME for the SortBy input parameter.  Since video analysis can return a large number of results, use the MaxResults parameter to limit the number of labels returned in a single call to GetContentModeration. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetContentModeration and populate the NextToken request parameter with the value of NextToken returned from the previous call to GetContentModeration. For more information, see moderating content in the Amazon Rekognition Developer Guide.
    */
  def getContentModeration(): Request[GetContentModerationResponse, AWSError] = js.native
  def getContentModeration(callback: js.Function2[/* err */ AWSError, /* data */ GetContentModerationResponse, Unit]): Request[GetContentModerationResponse, AWSError] = js.native
  /**
    * Gets the inappropriate, unwanted, or offensive content analysis results for a Amazon Rekognition Video analysis started by StartContentModeration. For a list of moderation labels in Amazon Rekognition, see Using the image and video moderation APIs. Amazon Rekognition Video inappropriate or offensive content detection in a stored video is an asynchronous operation. You start analysis by calling StartContentModeration which returns a job identifier (JobId). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartContentModeration. To get the results of the content analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.  GetContentModeration returns detected inappropriate, unwanted, or offensive content moderation labels, and the time they are detected, in an array, ModerationLabels, of ContentModerationDetection objects.  By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You can also sort them by moderated label by specifying NAME for the SortBy input parameter.  Since video analysis can return a large number of results, use the MaxResults parameter to limit the number of labels returned in a single call to GetContentModeration. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetContentModeration and populate the NextToken request parameter with the value of NextToken returned from the previous call to GetContentModeration. For more information, see moderating content in the Amazon Rekognition Developer Guide.
    */
  def getContentModeration(params: GetContentModerationRequest): Request[GetContentModerationResponse, AWSError] = js.native
  def getContentModeration(
    params: GetContentModerationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContentModerationResponse, Unit]
  ): Request[GetContentModerationResponse, AWSError] = js.native
  
  /**
    * Gets face detection results for a Amazon Rekognition Video analysis started by StartFaceDetection. Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling StartFaceDetection which returns a job identifier (JobId). When the face detection operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceDetection. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection.  GetFaceDetection returns an array of detected faces (Faces) sorted by the time the faces were detected.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetFaceDetection and populate the NextToken request parameter with the token value returned from the previous call to GetFaceDetection.
    */
  def getFaceDetection(): Request[GetFaceDetectionResponse, AWSError] = js.native
  def getFaceDetection(callback: js.Function2[/* err */ AWSError, /* data */ GetFaceDetectionResponse, Unit]): Request[GetFaceDetectionResponse, AWSError] = js.native
  /**
    * Gets face detection results for a Amazon Rekognition Video analysis started by StartFaceDetection. Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling StartFaceDetection which returns a job identifier (JobId). When the face detection operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceDetection. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection.  GetFaceDetection returns an array of detected faces (Faces) sorted by the time the faces were detected.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetFaceDetection and populate the NextToken request parameter with the token value returned from the previous call to GetFaceDetection.
    */
  def getFaceDetection(params: GetFaceDetectionRequest): Request[GetFaceDetectionResponse, AWSError] = js.native
  def getFaceDetection(
    params: GetFaceDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFaceDetectionResponse, Unit]
  ): Request[GetFaceDetectionResponse, AWSError] = js.native
  
  /**
    * Retrieves the results of a specific Face Liveness session. It requires the sessionId as input, which was created using CreateFaceLivenessSession. Returns the corresponding Face Liveness confidence score, a reference image that includes a face bounding box, and audit images that also contain face bounding boxes. The Face Liveness confidence score ranges from 0 to 100. The reference image can optionally be returned.
    */
  def getFaceLivenessSessionResults(): Request[GetFaceLivenessSessionResultsResponse, AWSError] = js.native
  def getFaceLivenessSessionResults(callback: js.Function2[/* err */ AWSError, /* data */ GetFaceLivenessSessionResultsResponse, Unit]): Request[GetFaceLivenessSessionResultsResponse, AWSError] = js.native
  /**
    * Retrieves the results of a specific Face Liveness session. It requires the sessionId as input, which was created using CreateFaceLivenessSession. Returns the corresponding Face Liveness confidence score, a reference image that includes a face bounding box, and audit images that also contain face bounding boxes. The Face Liveness confidence score ranges from 0 to 100. The reference image can optionally be returned.
    */
  def getFaceLivenessSessionResults(params: GetFaceLivenessSessionResultsRequest): Request[GetFaceLivenessSessionResultsResponse, AWSError] = js.native
  def getFaceLivenessSessionResults(
    params: GetFaceLivenessSessionResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFaceLivenessSessionResultsResponse, Unit]
  ): Request[GetFaceLivenessSessionResultsResponse, AWSError] = js.native
  
  /**
    * Gets the face search results for Amazon Rekognition Video face search started by StartFaceSearch. The search returns faces in a collection that match the faces of persons detected in a video. It also includes the time(s) that faces are matched in the video. Face search in a video is an asynchronous operation. You start face search by calling to StartFaceSearch which returns a job identifier (JobId). When the search operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceSearch. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. The search results are retured in an array, Persons, of PersonMatch objects. EachPersonMatch element contains details about the matching faces in the input collection, person information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the person was matched in the video.   GetFaceSearch only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Persons array is sorted by the time, in milliseconds from the start of the video, persons are matched. You can also sort by persons by specifying INDEX for the SORTBY input parameter.
    */
  def getFaceSearch(): Request[GetFaceSearchResponse, AWSError] = js.native
  def getFaceSearch(callback: js.Function2[/* err */ AWSError, /* data */ GetFaceSearchResponse, Unit]): Request[GetFaceSearchResponse, AWSError] = js.native
  /**
    * Gets the face search results for Amazon Rekognition Video face search started by StartFaceSearch. The search returns faces in a collection that match the faces of persons detected in a video. It also includes the time(s) that faces are matched in the video. Face search in a video is an asynchronous operation. You start face search by calling to StartFaceSearch which returns a job identifier (JobId). When the search operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceSearch. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. The search results are retured in an array, Persons, of PersonMatch objects. EachPersonMatch element contains details about the matching faces in the input collection, person information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the person was matched in the video.   GetFaceSearch only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Persons array is sorted by the time, in milliseconds from the start of the video, persons are matched. You can also sort by persons by specifying INDEX for the SORTBY input parameter.
    */
  def getFaceSearch(params: GetFaceSearchRequest): Request[GetFaceSearchResponse, AWSError] = js.native
  def getFaceSearch(
    params: GetFaceSearchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFaceSearchResponse, Unit]
  ): Request[GetFaceSearchResponse, AWSError] = js.native
  
  /**
    * Gets the label detection results of a Amazon Rekognition Video analysis started by StartLabelDetection.  The label detection operation is started by a call to StartLabelDetection which returns a job identifier (JobId). When the label detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartlabelDetection.  To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection.  GetLabelDetection returns an array of detected labels (Labels) sorted by the time the labels were detected. You can also sort by the label name by specifying NAME for the SortBy input parameter. If there is no NAME specified, the default sort is by timestamp. You can select how results are aggregated by using the AggregateBy input parameter. The default aggregation method is TIMESTAMPS. You can also aggregate by SEGMENTS, which aggregates all instances of labels detected in a given segment.  The returned Labels array may include the following attributes:   Name - The name of the detected label.   Confidence - The level of confidence in the label assigned to a detected object.    Parents - The ancestor labels for a detected label. GetLabelDetection returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response includes the all ancestors for a label, where every ancestor is a unique label. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.     Aliases - Possible Aliases for the label.    Categories - The label categories that the detected label belongs to.   BoundingBox — Bounding boxes are described for all instances of detected common object labels, returned in an array of Instance objects. An Instance object contains a BoundingBox object, describing the location of the label on the input image. It also includes the confidence for the accuracy of the detected bounding box.   Timestamp - Time, in milliseconds from the start of the video, that the label was detected. For aggregation by SEGMENTS, the StartTimestampMillis, EndTimestampMillis, and DurationMillis structures are what define a segment. Although the “Timestamp” structure is still returned with each label, its value is set to be the same as StartTimestampMillis.   Timestamp and Bounding box information are returned for detected Instances, only if aggregation is done by TIMESTAMPS. If aggregating by SEGMENTS, information about detected instances isn’t returned.  The version of the label model used for the detection is also returned.  Note DominantColors isn't returned for Instances, although it is shown as part of the response in the sample seen below.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetlabelDetection and populate the NextToken request parameter with the token value returned from the previous call to GetLabelDetection.
    */
  def getLabelDetection(): Request[GetLabelDetectionResponse, AWSError] = js.native
  def getLabelDetection(callback: js.Function2[/* err */ AWSError, /* data */ GetLabelDetectionResponse, Unit]): Request[GetLabelDetectionResponse, AWSError] = js.native
  /**
    * Gets the label detection results of a Amazon Rekognition Video analysis started by StartLabelDetection.  The label detection operation is started by a call to StartLabelDetection which returns a job identifier (JobId). When the label detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartlabelDetection.  To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection.  GetLabelDetection returns an array of detected labels (Labels) sorted by the time the labels were detected. You can also sort by the label name by specifying NAME for the SortBy input parameter. If there is no NAME specified, the default sort is by timestamp. You can select how results are aggregated by using the AggregateBy input parameter. The default aggregation method is TIMESTAMPS. You can also aggregate by SEGMENTS, which aggregates all instances of labels detected in a given segment.  The returned Labels array may include the following attributes:   Name - The name of the detected label.   Confidence - The level of confidence in the label assigned to a detected object.    Parents - The ancestor labels for a detected label. GetLabelDetection returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response includes the all ancestors for a label, where every ancestor is a unique label. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.     Aliases - Possible Aliases for the label.    Categories - The label categories that the detected label belongs to.   BoundingBox — Bounding boxes are described for all instances of detected common object labels, returned in an array of Instance objects. An Instance object contains a BoundingBox object, describing the location of the label on the input image. It also includes the confidence for the accuracy of the detected bounding box.   Timestamp - Time, in milliseconds from the start of the video, that the label was detected. For aggregation by SEGMENTS, the StartTimestampMillis, EndTimestampMillis, and DurationMillis structures are what define a segment. Although the “Timestamp” structure is still returned with each label, its value is set to be the same as StartTimestampMillis.   Timestamp and Bounding box information are returned for detected Instances, only if aggregation is done by TIMESTAMPS. If aggregating by SEGMENTS, information about detected instances isn’t returned.  The version of the label model used for the detection is also returned.  Note DominantColors isn't returned for Instances, although it is shown as part of the response in the sample seen below.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetlabelDetection and populate the NextToken request parameter with the token value returned from the previous call to GetLabelDetection.
    */
  def getLabelDetection(params: GetLabelDetectionRequest): Request[GetLabelDetectionResponse, AWSError] = js.native
  def getLabelDetection(
    params: GetLabelDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLabelDetectionResponse, Unit]
  ): Request[GetLabelDetectionResponse, AWSError] = js.native
  
  /**
    * Gets the path tracking results of a Amazon Rekognition Video analysis started by StartPersonTracking. The person path tracking operation is started by a call to StartPersonTracking which returns a job identifier (JobId). When the operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartPersonTracking. To get the results of the person path tracking operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.  GetPersonTracking returns an array, Persons, of tracked persons and the time(s) their paths were tracked in the video.    GetPersonTracking only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned.  For more information, see FaceDetail in the Amazon Rekognition Developer Guide.  By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked persons by specifying INDEX for the SortBy input parameter. Use the MaxResults parameter to limit the number of items returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetPersonTracking and populate the NextToken request parameter with the token value returned from the previous call to GetPersonTracking.
    */
  def getPersonTracking(): Request[GetPersonTrackingResponse, AWSError] = js.native
  def getPersonTracking(callback: js.Function2[/* err */ AWSError, /* data */ GetPersonTrackingResponse, Unit]): Request[GetPersonTrackingResponse, AWSError] = js.native
  /**
    * Gets the path tracking results of a Amazon Rekognition Video analysis started by StartPersonTracking. The person path tracking operation is started by a call to StartPersonTracking which returns a job identifier (JobId). When the operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartPersonTracking. To get the results of the person path tracking operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.  GetPersonTracking returns an array, Persons, of tracked persons and the time(s) their paths were tracked in the video.    GetPersonTracking only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned.  For more information, see FaceDetail in the Amazon Rekognition Developer Guide.  By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked persons by specifying INDEX for the SortBy input parameter. Use the MaxResults parameter to limit the number of items returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetPersonTracking and populate the NextToken request parameter with the token value returned from the previous call to GetPersonTracking.
    */
  def getPersonTracking(params: GetPersonTrackingRequest): Request[GetPersonTrackingResponse, AWSError] = js.native
  def getPersonTracking(
    params: GetPersonTrackingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPersonTrackingResponse, Unit]
  ): Request[GetPersonTrackingResponse, AWSError] = js.native
  
  /**
    * Gets the segment detection results of a Amazon Rekognition Video analysis started by StartSegmentDetection. Segment detection with Amazon Rekognition Video is an asynchronous operation. You start segment detection by calling StartSegmentDetection which returns a job identifier (JobId). When the segment detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartSegmentDetection. To get the results of the segment detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetSegmentDetection and pass the job identifier (JobId) from the initial call of StartSegmentDetection.  GetSegmentDetection returns detected segments in an array (Segments) of SegmentDetection objects. Segments is sorted by the segment types specified in the SegmentTypes input parameter of StartSegmentDetection. Each element of the array includes the detected segment, the precentage confidence in the acuracy of the detected segment, the type of the segment, and the frame in which the segment was detected. Use SelectedSegmentTypes to find out the type of segment detection requested in the call to StartSegmentDetection. Use the MaxResults parameter to limit the number of segment detections returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetSegmentDetection and populate the NextToken request parameter with the token value returned from the previous call to GetSegmentDetection. For more information, see Detecting video segments in stored video in the Amazon Rekognition Developer Guide.
    */
  def getSegmentDetection(): Request[GetSegmentDetectionResponse, AWSError] = js.native
  def getSegmentDetection(callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentDetectionResponse, Unit]): Request[GetSegmentDetectionResponse, AWSError] = js.native
  /**
    * Gets the segment detection results of a Amazon Rekognition Video analysis started by StartSegmentDetection. Segment detection with Amazon Rekognition Video is an asynchronous operation. You start segment detection by calling StartSegmentDetection which returns a job identifier (JobId). When the segment detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartSegmentDetection. To get the results of the segment detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetSegmentDetection and pass the job identifier (JobId) from the initial call of StartSegmentDetection.  GetSegmentDetection returns detected segments in an array (Segments) of SegmentDetection objects. Segments is sorted by the segment types specified in the SegmentTypes input parameter of StartSegmentDetection. Each element of the array includes the detected segment, the precentage confidence in the acuracy of the detected segment, the type of the segment, and the frame in which the segment was detected. Use SelectedSegmentTypes to find out the type of segment detection requested in the call to StartSegmentDetection. Use the MaxResults parameter to limit the number of segment detections returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetSegmentDetection and populate the NextToken request parameter with the token value returned from the previous call to GetSegmentDetection. For more information, see Detecting video segments in stored video in the Amazon Rekognition Developer Guide.
    */
  def getSegmentDetection(params: GetSegmentDetectionRequest): Request[GetSegmentDetectionResponse, AWSError] = js.native
  def getSegmentDetection(
    params: GetSegmentDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentDetectionResponse, Unit]
  ): Request[GetSegmentDetectionResponse, AWSError] = js.native
  
  /**
    * Gets the text detection results of a Amazon Rekognition Video analysis started by StartTextDetection. Text detection with Amazon Rekognition Video is an asynchronous operation. You start text detection by calling StartTextDetection which returns a job identifier (JobId) When the text detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartTextDetection. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetTextDetection and pass the job identifier (JobId) from the initial call of StartLabelDetection.  GetTextDetection returns an array of detected text (TextDetections) sorted by the time the text was detected, up to 50 words per frame of video. Each element of the array includes the detected text, the precentage confidence in the acuracy of the detected text, the time the text was detected, bounding box information for where the text was located, and unique identifiers for words and their lines. Use MaxResults parameter to limit the number of text detections returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetTextDetection and populate the NextToken request parameter with the token value returned from the previous call to GetTextDetection.
    */
  def getTextDetection(): Request[GetTextDetectionResponse, AWSError] = js.native
  def getTextDetection(callback: js.Function2[/* err */ AWSError, /* data */ GetTextDetectionResponse, Unit]): Request[GetTextDetectionResponse, AWSError] = js.native
  /**
    * Gets the text detection results of a Amazon Rekognition Video analysis started by StartTextDetection. Text detection with Amazon Rekognition Video is an asynchronous operation. You start text detection by calling StartTextDetection which returns a job identifier (JobId) When the text detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartTextDetection. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetTextDetection and pass the job identifier (JobId) from the initial call of StartLabelDetection.  GetTextDetection returns an array of detected text (TextDetections) sorted by the time the text was detected, up to 50 words per frame of video. Each element of the array includes the detected text, the precentage confidence in the acuracy of the detected text, the time the text was detected, bounding box information for where the text was located, and unique identifiers for words and their lines. Use MaxResults parameter to limit the number of text detections returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetTextDetection and populate the NextToken request parameter with the token value returned from the previous call to GetTextDetection.
    */
  def getTextDetection(params: GetTextDetectionRequest): Request[GetTextDetectionResponse, AWSError] = js.native
  def getTextDetection(
    params: GetTextDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTextDetectionResponse, Unit]
  ): Request[GetTextDetectionResponse, AWSError] = js.native
  
  /**
    * Detects faces in the input image and adds them to the specified collection.  Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face match and search operations using the SearchFaces and SearchFacesByImage operations. For more information, see Adding faces to a collection in the Amazon Rekognition Developer Guide. To get the number of faces in a collection, call DescribeCollection.  If you're using version 1.0 of the face detection model, IndexFaces indexes the 15 largest faces in the input image. Later versions of the face detection model index the 100 largest faces in the input image.  If you're using version 4 or later of the face model, image orientation information is not returned in the OrientationCorrection field.  To determine which version of the model you're using, call DescribeCollection and supply the collection ID. You can also get the model version from the value of FaceModelVersion in the response from IndexFaces  For more information, see Model Versioning in the Amazon Rekognition Developer Guide. If you provide the optional ExternalImageId for the input image you provided, Amazon Rekognition associates this ID with all faces that it detects. When you call the ListFaces operation, the response returns the external ID. You can use this external image ID to create a client-side index to associate the faces with each image. You can then use the index to find all faces in an image. You can specify the maximum number of faces to index with the MaxFaces input parameter. This is useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those belonging to people standing in the background. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. By default, IndexFaces chooses the quality bar that's used to filter faces. You can also explicitly choose the quality bar. Use QualityFilter, to set the quality bar by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE.   To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   Information about faces detected in an image, but not indexed, is returned in an array of UnindexedFace objects, UnindexedFaces. Faces aren't indexed for reasons such as:   The number of faces detected exceeds the value of the MaxFaces request parameter.   The face is too small compared to the image dimensions.   The face is too blurry.   The image is too dark.   The face has an extreme pose.   The face doesn’t have enough detail to be suitable for face search.   In response, the IndexFaces operation returns an array of metadata for all detected faces, FaceRecords. This includes:    The bounding box, BoundingBox, of the detected face.    A confidence value, Confidence, which indicates the confidence that the bounding box contains a face.   A face ID, FaceId, assigned by the service for each face that's detected and stored.   An image ID, ImageId, assigned by the service for the input image.   If you request ALL or specific facial attributes (e.g., FACE_OCCLUDED) by using the detectionAttributes parameter, Amazon Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth), facial occlusion, and other facial attributes. If you provide the same image, specify the same collection, and use the same external ID in the IndexFaces operation, Amazon Rekognition doesn't save duplicate face metadata.  The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  This operation requires permissions to perform the rekognition:IndexFaces action.
    */
  def indexFaces(): Request[IndexFacesResponse, AWSError] = js.native
  def indexFaces(callback: js.Function2[/* err */ AWSError, /* data */ IndexFacesResponse, Unit]): Request[IndexFacesResponse, AWSError] = js.native
  /**
    * Detects faces in the input image and adds them to the specified collection.  Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face match and search operations using the SearchFaces and SearchFacesByImage operations. For more information, see Adding faces to a collection in the Amazon Rekognition Developer Guide. To get the number of faces in a collection, call DescribeCollection.  If you're using version 1.0 of the face detection model, IndexFaces indexes the 15 largest faces in the input image. Later versions of the face detection model index the 100 largest faces in the input image.  If you're using version 4 or later of the face model, image orientation information is not returned in the OrientationCorrection field.  To determine which version of the model you're using, call DescribeCollection and supply the collection ID. You can also get the model version from the value of FaceModelVersion in the response from IndexFaces  For more information, see Model Versioning in the Amazon Rekognition Developer Guide. If you provide the optional ExternalImageId for the input image you provided, Amazon Rekognition associates this ID with all faces that it detects. When you call the ListFaces operation, the response returns the external ID. You can use this external image ID to create a client-side index to associate the faces with each image. You can then use the index to find all faces in an image. You can specify the maximum number of faces to index with the MaxFaces input parameter. This is useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those belonging to people standing in the background. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. By default, IndexFaces chooses the quality bar that's used to filter faces. You can also explicitly choose the quality bar. Use QualityFilter, to set the quality bar by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE.   To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   Information about faces detected in an image, but not indexed, is returned in an array of UnindexedFace objects, UnindexedFaces. Faces aren't indexed for reasons such as:   The number of faces detected exceeds the value of the MaxFaces request parameter.   The face is too small compared to the image dimensions.   The face is too blurry.   The image is too dark.   The face has an extreme pose.   The face doesn’t have enough detail to be suitable for face search.   In response, the IndexFaces operation returns an array of metadata for all detected faces, FaceRecords. This includes:    The bounding box, BoundingBox, of the detected face.    A confidence value, Confidence, which indicates the confidence that the bounding box contains a face.   A face ID, FaceId, assigned by the service for each face that's detected and stored.   An image ID, ImageId, assigned by the service for the input image.   If you request ALL or specific facial attributes (e.g., FACE_OCCLUDED) by using the detectionAttributes parameter, Amazon Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth), facial occlusion, and other facial attributes. If you provide the same image, specify the same collection, and use the same external ID in the IndexFaces operation, Amazon Rekognition doesn't save duplicate face metadata.  The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  This operation requires permissions to perform the rekognition:IndexFaces action.
    */
  def indexFaces(params: IndexFacesRequest): Request[IndexFacesResponse, AWSError] = js.native
  def indexFaces(
    params: IndexFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ IndexFacesResponse, Unit]
  ): Request[IndexFacesResponse, AWSError] = js.native
  
  /**
    * Returns list of collection IDs in your account. If the result is truncated, the response also provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs. For an example, see Listing collections in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListCollections action.
    */
  def listCollections(): Request[ListCollectionsResponse, AWSError] = js.native
  def listCollections(callback: js.Function2[/* err */ AWSError, /* data */ ListCollectionsResponse, Unit]): Request[ListCollectionsResponse, AWSError] = js.native
  /**
    * Returns list of collection IDs in your account. If the result is truncated, the response also provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs. For an example, see Listing collections in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListCollections action.
    */
  def listCollections(params: ListCollectionsRequest): Request[ListCollectionsResponse, AWSError] = js.native
  def listCollections(
    params: ListCollectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCollectionsResponse, Unit]
  ): Request[ListCollectionsResponse, AWSError] = js.native
  
  /**
    *  Lists the entries (images) within a dataset. An entry is a JSON Line that contains the information for a single image, including the image location, assigned labels, and object location bounding boxes. For more information, see Creating a manifest file. JSON Lines in the response include information about non-terminal errors found in the dataset. Non terminal errors are reported in errors lists within each JSON Line. The same information is reported in the training and testing validation result manifests that Amazon Rekognition Custom Labels creates during model training.  You can filter the response in variety of ways, such as choosing which labels to return and returning JSON Lines created after a specific date.  This operation requires permissions to perform the rekognition:ListDatasetEntries action.
    */
  def listDatasetEntries(): Request[ListDatasetEntriesResponse, AWSError] = js.native
  def listDatasetEntries(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetEntriesResponse, Unit]): Request[ListDatasetEntriesResponse, AWSError] = js.native
  /**
    *  Lists the entries (images) within a dataset. An entry is a JSON Line that contains the information for a single image, including the image location, assigned labels, and object location bounding boxes. For more information, see Creating a manifest file. JSON Lines in the response include information about non-terminal errors found in the dataset. Non terminal errors are reported in errors lists within each JSON Line. The same information is reported in the training and testing validation result manifests that Amazon Rekognition Custom Labels creates during model training.  You can filter the response in variety of ways, such as choosing which labels to return and returning JSON Lines created after a specific date.  This operation requires permissions to perform the rekognition:ListDatasetEntries action.
    */
  def listDatasetEntries(params: ListDatasetEntriesRequest): Request[ListDatasetEntriesResponse, AWSError] = js.native
  def listDatasetEntries(
    params: ListDatasetEntriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetEntriesResponse, Unit]
  ): Request[ListDatasetEntriesResponse, AWSError] = js.native
  
  /**
    * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more information, see Labeling images.   Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more information, see Labeling images in the Amazon Rekognition Custom Labels Developer Guide. 
    */
  def listDatasetLabels(): Request[ListDatasetLabelsResponse, AWSError] = js.native
  def listDatasetLabels(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetLabelsResponse, Unit]): Request[ListDatasetLabelsResponse, AWSError] = js.native
  /**
    * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more information, see Labeling images.   Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more information, see Labeling images in the Amazon Rekognition Custom Labels Developer Guide. 
    */
  def listDatasetLabels(params: ListDatasetLabelsRequest): Request[ListDatasetLabelsResponse, AWSError] = js.native
  def listDatasetLabels(
    params: ListDatasetLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetLabelsResponse, Unit]
  ): Request[ListDatasetLabelsResponse, AWSError] = js.native
  
  /**
    * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing Faces in a Collection in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListFaces action.
    */
  def listFaces(): Request[ListFacesResponse, AWSError] = js.native
  def listFaces(callback: js.Function2[/* err */ AWSError, /* data */ ListFacesResponse, Unit]): Request[ListFacesResponse, AWSError] = js.native
  /**
    * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing Faces in a Collection in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListFaces action.
    */
  def listFaces(params: ListFacesRequest): Request[ListFacesResponse, AWSError] = js.native
  def listFaces(
    params: ListFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFacesResponse, Unit]
  ): Request[ListFacesResponse, AWSError] = js.native
  
  /**
    * Gets a list of the project policies attached to a project. To attach a project policy to a project, call PutProjectPolicy. To remove a project policy from a project, call DeleteProjectPolicy. This operation requires permissions to perform the rekognition:ListProjectPolicies action.
    */
  def listProjectPolicies(): Request[ListProjectPoliciesResponse, AWSError] = js.native
  def listProjectPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectPoliciesResponse, Unit]): Request[ListProjectPoliciesResponse, AWSError] = js.native
  /**
    * Gets a list of the project policies attached to a project. To attach a project policy to a project, call PutProjectPolicy. To remove a project policy from a project, call DeleteProjectPolicy. This operation requires permissions to perform the rekognition:ListProjectPolicies action.
    */
  def listProjectPolicies(params: ListProjectPoliciesRequest): Request[ListProjectPoliciesResponse, AWSError] = js.native
  def listProjectPolicies(
    params: ListProjectPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectPoliciesResponse, Unit]
  ): Request[ListProjectPoliciesResponse, AWSError] = js.native
  
  /**
    * Gets a list of stream processors that you have created with CreateStreamProcessor. 
    */
  def listStreamProcessors(): Request[ListStreamProcessorsResponse, AWSError] = js.native
  def listStreamProcessors(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamProcessorsResponse, Unit]): Request[ListStreamProcessorsResponse, AWSError] = js.native
  /**
    * Gets a list of stream processors that you have created with CreateStreamProcessor. 
    */
  def listStreamProcessors(params: ListStreamProcessorsRequest): Request[ListStreamProcessorsResponse, AWSError] = js.native
  def listStreamProcessors(
    params: ListStreamProcessorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamProcessorsResponse, Unit]
  ): Request[ListStreamProcessorsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of tags in an Amazon Rekognition collection, stream processor, or Custom Labels model.  This operation requires permissions to perform the rekognition:ListTagsForResource action. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  Returns a list of tags in an Amazon Rekognition collection, stream processor, or Custom Labels model.  This operation requires permissions to perform the rekognition:ListTagsForResource action. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Attaches a project policy to a Amazon Rekognition Custom Labels project in a trusting AWS account. A project policy specifies that a trusted AWS account can copy a model version from a trusting AWS account to a project in the trusted AWS account. To copy a model version you use the CopyProjectVersion operation. For more information about the format of a project policy document, see Attaching a project policy (SDK) in the Amazon Rekognition Custom Labels Developer Guide.  The response from PutProjectPolicy is a revision ID for the project policy. You can attach multiple project policies to a project. You can also update an existing project policy by specifying the policy revision ID of the existing policy. To remove a project policy from a project, call DeleteProjectPolicy. To get a list of project policies attached to a project, call ListProjectPolicies.  You copy a model version by calling CopyProjectVersion. This operation requires permissions to perform the rekognition:PutProjectPolicy action.
    */
  def putProjectPolicy(): Request[PutProjectPolicyResponse, AWSError] = js.native
  def putProjectPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutProjectPolicyResponse, Unit]): Request[PutProjectPolicyResponse, AWSError] = js.native
  /**
    * Attaches a project policy to a Amazon Rekognition Custom Labels project in a trusting AWS account. A project policy specifies that a trusted AWS account can copy a model version from a trusting AWS account to a project in the trusted AWS account. To copy a model version you use the CopyProjectVersion operation. For more information about the format of a project policy document, see Attaching a project policy (SDK) in the Amazon Rekognition Custom Labels Developer Guide.  The response from PutProjectPolicy is a revision ID for the project policy. You can attach multiple project policies to a project. You can also update an existing project policy by specifying the policy revision ID of the existing policy. To remove a project policy from a project, call DeleteProjectPolicy. To get a list of project policies attached to a project, call ListProjectPolicies.  You copy a model version by calling CopyProjectVersion. This operation requires permissions to perform the rekognition:PutProjectPolicy action.
    */
  def putProjectPolicy(params: PutProjectPolicyRequest): Request[PutProjectPolicyResponse, AWSError] = js.native
  def putProjectPolicy(
    params: PutProjectPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutProjectPolicyResponse, Unit]
  ): Request[PutProjectPolicyResponse, AWSError] = js.native
  
  /**
    * Returns an array of celebrities recognized in the input image. For more information, see Recognizing celebrities in the Amazon Rekognition Developer Guide.   RecognizeCelebrities returns the 64 largest faces in the image. It lists the recognized celebrities in the CelebrityFaces array and any unrecognized faces in the UnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose faces aren't among the largest 64 faces in the image. For each celebrity recognized, RecognizeCelebrities returns a Celebrity object. The Celebrity object contains the celebrity name, ID, URL links to additional information, match confidence, and a ComparedFace object that you can use to locate the celebrity's face on the image. Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your application must store this information and use the Celebrity ID property as a unique identifier for the celebrity. If you don't store the celebrity name or additional information URLs returned by RecognizeCelebrities, you will need the ID to identify the celebrity in a call to the GetCelebrityInfo operation. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.  For an example, see Recognizing celebrities in an image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:RecognizeCelebrities operation.
    */
  def recognizeCelebrities(): Request[RecognizeCelebritiesResponse, AWSError] = js.native
  def recognizeCelebrities(callback: js.Function2[/* err */ AWSError, /* data */ RecognizeCelebritiesResponse, Unit]): Request[RecognizeCelebritiesResponse, AWSError] = js.native
  /**
    * Returns an array of celebrities recognized in the input image. For more information, see Recognizing celebrities in the Amazon Rekognition Developer Guide.   RecognizeCelebrities returns the 64 largest faces in the image. It lists the recognized celebrities in the CelebrityFaces array and any unrecognized faces in the UnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose faces aren't among the largest 64 faces in the image. For each celebrity recognized, RecognizeCelebrities returns a Celebrity object. The Celebrity object contains the celebrity name, ID, URL links to additional information, match confidence, and a ComparedFace object that you can use to locate the celebrity's face on the image. Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your application must store this information and use the Celebrity ID property as a unique identifier for the celebrity. If you don't store the celebrity name or additional information URLs returned by RecognizeCelebrities, you will need the ID to identify the celebrity in a call to the GetCelebrityInfo operation. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.  For an example, see Recognizing celebrities in an image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:RecognizeCelebrities operation.
    */
  def recognizeCelebrities(params: RecognizeCelebritiesRequest): Request[RecognizeCelebritiesResponse, AWSError] = js.native
  def recognizeCelebrities(
    params: RecognizeCelebritiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RecognizeCelebritiesResponse, Unit]
  ): Request[RecognizeCelebritiesResponse, AWSError] = js.native
  
  /**
    * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID when you add a face to the collection using the IndexFaces operation. The operation compares the features of the input face with faces in the specified collection.   You can also search faces without indexing faces by using the SearchFacesByImage operation.   The operation response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the metadata, the response also includes a confidence value for each face match, indicating the confidence that the specific face matches the input face.  For an example, see Searching for a face using its face ID in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFaces action.
    */
  def searchFaces(): Request[SearchFacesResponse, AWSError] = js.native
  def searchFaces(callback: js.Function2[/* err */ AWSError, /* data */ SearchFacesResponse, Unit]): Request[SearchFacesResponse, AWSError] = js.native
  /**
    * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID when you add a face to the collection using the IndexFaces operation. The operation compares the features of the input face with faces in the specified collection.   You can also search faces without indexing faces by using the SearchFacesByImage operation.   The operation response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the metadata, the response also includes a confidence value for each face match, indicating the confidence that the specific face matches the input face.  For an example, see Searching for a face using its face ID in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFaces action.
    */
  def searchFaces(params: SearchFacesRequest): Request[SearchFacesResponse, AWSError] = js.native
  def searchFaces(
    params: SearchFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchFacesResponse, Unit]
  ): Request[SearchFacesResponse, AWSError] = js.native
  
  /**
    * For a given input image, first detects the largest face in the image, and then searches the specified collection for matching faces. The operation compares the features of the input face with faces in the specified collection.   To search for all faces in an input image, you might first call the IndexFaces operation, and then use the face IDs returned in subsequent calls to the SearchFaces operation.   You can also call the DetectFaces operation and use the bounding boxes in the response to make face crops, which then you can pass in to the SearchFacesByImage operation.   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   The response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match found. Along with the metadata, the response also includes a similarity indicating how similar the face is to the input face. In the response, the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the face that Amazon Rekognition used for the input image.  If no faces are detected in the input image, SearchFacesByImage returns an InvalidParameterException error.  For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. Use QualityFilter to set the quality bar for filtering by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE. The default value is NONE.  To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   This operation requires permissions to perform the rekognition:SearchFacesByImage action.
    */
  def searchFacesByImage(): Request[SearchFacesByImageResponse, AWSError] = js.native
  def searchFacesByImage(callback: js.Function2[/* err */ AWSError, /* data */ SearchFacesByImageResponse, Unit]): Request[SearchFacesByImageResponse, AWSError] = js.native
  /**
    * For a given input image, first detects the largest face in the image, and then searches the specified collection for matching faces. The operation compares the features of the input face with faces in the specified collection.   To search for all faces in an input image, you might first call the IndexFaces operation, and then use the face IDs returned in subsequent calls to the SearchFaces operation.   You can also call the DetectFaces operation and use the bounding boxes in the response to make face crops, which then you can pass in to the SearchFacesByImage operation.   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   The response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match found. Along with the metadata, the response also includes a similarity indicating how similar the face is to the input face. In the response, the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the face that Amazon Rekognition used for the input image.  If no faces are detected in the input image, SearchFacesByImage returns an InvalidParameterException error.  For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. Use QualityFilter to set the quality bar for filtering by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE. The default value is NONE.  To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   This operation requires permissions to perform the rekognition:SearchFacesByImage action.
    */
  def searchFacesByImage(params: SearchFacesByImageRequest): Request[SearchFacesByImageResponse, AWSError] = js.native
  def searchFacesByImage(
    params: SearchFacesByImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchFacesByImageResponse, Unit]
  ): Request[SearchFacesByImageResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous recognition of celebrities in a stored video. Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartCelebrityRecognition returns a job identifier (JobId) which you use to get the results of the analysis. When celebrity recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityRecognition and pass the job identifier (JobId) from the initial call to StartCelebrityRecognition.  For more information, see Recognizing celebrities in the Amazon Rekognition Developer Guide.
    */
  def startCelebrityRecognition(): Request[StartCelebrityRecognitionResponse, AWSError] = js.native
  def startCelebrityRecognition(callback: js.Function2[/* err */ AWSError, /* data */ StartCelebrityRecognitionResponse, Unit]): Request[StartCelebrityRecognitionResponse, AWSError] = js.native
  /**
    * Starts asynchronous recognition of celebrities in a stored video. Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartCelebrityRecognition returns a job identifier (JobId) which you use to get the results of the analysis. When celebrity recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityRecognition and pass the job identifier (JobId) from the initial call to StartCelebrityRecognition.  For more information, see Recognizing celebrities in the Amazon Rekognition Developer Guide.
    */
  def startCelebrityRecognition(params: StartCelebrityRecognitionRequest): Request[StartCelebrityRecognitionResponse, AWSError] = js.native
  def startCelebrityRecognition(
    params: StartCelebrityRecognitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCelebrityRecognitionResponse, Unit]
  ): Request[StartCelebrityRecognitionResponse, AWSError] = js.native
  
  /**
    *  Starts asynchronous detection of inappropriate, unwanted, or offensive content in a stored video. For a list of moderation labels in Amazon Rekognition, see Using the image and video moderation APIs. Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartContentModeration returns a job identifier (JobId) which you use to get the results of the analysis. When content analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the content analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Moderating content in the Amazon Rekognition Developer Guide.
    */
  def startContentModeration(): Request[StartContentModerationResponse, AWSError] = js.native
  def startContentModeration(callback: js.Function2[/* err */ AWSError, /* data */ StartContentModerationResponse, Unit]): Request[StartContentModerationResponse, AWSError] = js.native
  /**
    *  Starts asynchronous detection of inappropriate, unwanted, or offensive content in a stored video. For a list of moderation labels in Amazon Rekognition, see Using the image and video moderation APIs. Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartContentModeration returns a job identifier (JobId) which you use to get the results of the analysis. When content analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the content analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Moderating content in the Amazon Rekognition Developer Guide.
    */
  def startContentModeration(params: StartContentModerationRequest): Request[StartContentModerationResponse, AWSError] = js.native
  def startContentModeration(
    params: StartContentModerationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartContentModerationResponse, Unit]
  ): Request[StartContentModerationResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous detection of faces in a stored video. Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceDetection returns a job identifier (JobId) that you use to get the results of the operation. When face detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection. For more information, see Detecting faces in a stored video in the Amazon Rekognition Developer Guide.
    */
  def startFaceDetection(): Request[StartFaceDetectionResponse, AWSError] = js.native
  def startFaceDetection(callback: js.Function2[/* err */ AWSError, /* data */ StartFaceDetectionResponse, Unit]): Request[StartFaceDetectionResponse, AWSError] = js.native
  /**
    * Starts asynchronous detection of faces in a stored video. Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceDetection returns a job identifier (JobId) that you use to get the results of the operation. When face detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection. For more information, see Detecting faces in a stored video in the Amazon Rekognition Developer Guide.
    */
  def startFaceDetection(params: StartFaceDetectionRequest): Request[StartFaceDetectionResponse, AWSError] = js.native
  def startFaceDetection(
    params: StartFaceDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFaceDetectionResponse, Unit]
  ): Request[StartFaceDetectionResponse, AWSError] = js.native
  
  /**
    * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored video. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceSearch returns a job identifier (JobId) which you use to get the search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching stored videos for faces. 
    */
  def startFaceSearch(): Request[StartFaceSearchResponse, AWSError] = js.native
  def startFaceSearch(callback: js.Function2[/* err */ AWSError, /* data */ StartFaceSearchResponse, Unit]): Request[StartFaceSearchResponse, AWSError] = js.native
  /**
    * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored video. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceSearch returns a job identifier (JobId) which you use to get the search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching stored videos for faces. 
    */
  def startFaceSearch(params: StartFaceSearchRequest): Request[StartFaceSearchResponse, AWSError] = js.native
  def startFaceSearch(
    params: StartFaceSearchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFaceSearchResponse, Unit]
  ): Request[StartFaceSearchResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous detection of labels in a stored video. Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like landscape, evening, and nature; and activities like a person getting out of a car or a person skiing. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartLabelDetection returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection.  Optional Parameters   StartLabelDetection has the GENERAL_LABELS Feature applied by default. This feature allows you to provide filtering criteria to the Settings parameter. You can filter with sets of individual labels or with label categories. You can specify inclusive filters, exclusive filters, or a combination of inclusive and exclusive filters. For more information on filtering, see Detecting labels in a video. You can specify MinConfidence to control the confidence threshold for the labels returned. The default is 50.
    */
  def startLabelDetection(): Request[StartLabelDetectionResponse, AWSError] = js.native
  def startLabelDetection(callback: js.Function2[/* err */ AWSError, /* data */ StartLabelDetectionResponse, Unit]): Request[StartLabelDetectionResponse, AWSError] = js.native
  /**
    * Starts asynchronous detection of labels in a stored video. Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like landscape, evening, and nature; and activities like a person getting out of a car or a person skiing. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartLabelDetection returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection.  Optional Parameters   StartLabelDetection has the GENERAL_LABELS Feature applied by default. This feature allows you to provide filtering criteria to the Settings parameter. You can filter with sets of individual labels or with label categories. You can specify inclusive filters, exclusive filters, or a combination of inclusive and exclusive filters. For more information on filtering, see Detecting labels in a video. You can specify MinConfidence to control the confidence threshold for the labels returned. The default is 50.
    */
  def startLabelDetection(params: StartLabelDetectionRequest): Request[StartLabelDetectionResponse, AWSError] = js.native
  def startLabelDetection(
    params: StartLabelDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartLabelDetectionResponse, Unit]
  ): Request[StartLabelDetectionResponse, AWSError] = js.native
  
  /**
    * Starts the asynchronous tracking of a person's path in a stored video. Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartPersonTracking returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel.  To get the results of the person detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.
    */
  def startPersonTracking(): Request[StartPersonTrackingResponse, AWSError] = js.native
  def startPersonTracking(callback: js.Function2[/* err */ AWSError, /* data */ StartPersonTrackingResponse, Unit]): Request[StartPersonTrackingResponse, AWSError] = js.native
  /**
    * Starts the asynchronous tracking of a person's path in a stored video. Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartPersonTracking returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel.  To get the results of the person detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.
    */
  def startPersonTracking(params: StartPersonTrackingRequest): Request[StartPersonTrackingResponse, AWSError] = js.native
  def startPersonTracking(
    params: StartPersonTrackingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartPersonTrackingResponse, Unit]
  ): Request[StartPersonTrackingResponse, AWSError] = js.native
  
  /**
    * Starts the running of the version of a model. Starting a model takes a while to complete. To check the current state of the model, use DescribeProjectVersions. Once the model is running, you can detect custom labels in new images by calling DetectCustomLabels.  You are charged for the amount of time that the model is running. To stop a running model, call StopProjectVersion.  For more information, see Running a trained Amazon Rekognition Custom Labels model in the Amazon Rekognition Custom Labels Guide. This operation requires permissions to perform the rekognition:StartProjectVersion action.
    */
  def startProjectVersion(): Request[StartProjectVersionResponse, AWSError] = js.native
  def startProjectVersion(callback: js.Function2[/* err */ AWSError, /* data */ StartProjectVersionResponse, Unit]): Request[StartProjectVersionResponse, AWSError] = js.native
  /**
    * Starts the running of the version of a model. Starting a model takes a while to complete. To check the current state of the model, use DescribeProjectVersions. Once the model is running, you can detect custom labels in new images by calling DetectCustomLabels.  You are charged for the amount of time that the model is running. To stop a running model, call StopProjectVersion.  For more information, see Running a trained Amazon Rekognition Custom Labels model in the Amazon Rekognition Custom Labels Guide. This operation requires permissions to perform the rekognition:StartProjectVersion action.
    */
  def startProjectVersion(params: StartProjectVersionRequest): Request[StartProjectVersionResponse, AWSError] = js.native
  def startProjectVersion(
    params: StartProjectVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartProjectVersionResponse, Unit]
  ): Request[StartProjectVersionResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous detection of segment detection in a stored video. Amazon Rekognition Video can detect segments in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartSegmentDetection returns a job identifier (JobId) which you use to get the results of the operation. When segment detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. You can use the Filters (StartSegmentDetectionFilters) input parameter to specify the minimum detection confidence returned in the response. Within Filters, use ShotFilter (StartShotDetectionFilter) to filter detected shots. Use TechnicalCueFilter (StartTechnicalCueDetectionFilter) to filter technical cues.  To get the results of the segment detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetSegmentDetection and pass the job identifier (JobId) from the initial call to StartSegmentDetection.  For more information, see Detecting video segments in stored video in the Amazon Rekognition Developer Guide.
    */
  def startSegmentDetection(): Request[StartSegmentDetectionResponse, AWSError] = js.native
  def startSegmentDetection(callback: js.Function2[/* err */ AWSError, /* data */ StartSegmentDetectionResponse, Unit]): Request[StartSegmentDetectionResponse, AWSError] = js.native
  /**
    * Starts asynchronous detection of segment detection in a stored video. Amazon Rekognition Video can detect segments in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartSegmentDetection returns a job identifier (JobId) which you use to get the results of the operation. When segment detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. You can use the Filters (StartSegmentDetectionFilters) input parameter to specify the minimum detection confidence returned in the response. Within Filters, use ShotFilter (StartShotDetectionFilter) to filter detected shots. Use TechnicalCueFilter (StartTechnicalCueDetectionFilter) to filter technical cues.  To get the results of the segment detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetSegmentDetection and pass the job identifier (JobId) from the initial call to StartSegmentDetection.  For more information, see Detecting video segments in stored video in the Amazon Rekognition Developer Guide.
    */
  def startSegmentDetection(params: StartSegmentDetectionRequest): Request[StartSegmentDetectionResponse, AWSError] = js.native
  def startSegmentDetection(
    params: StartSegmentDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSegmentDetectionResponse, Unit]
  ): Request[StartSegmentDetectionResponse, AWSError] = js.native
  
  /**
    * Starts processing a stream processor. You create a stream processor by calling CreateStreamProcessor. To tell StartStreamProcessor which stream processor to start, use the value of the Name field specified in the call to CreateStreamProcessor. If you are using a label detection stream processor to detect labels, you need to provide a Start selector and a Stop selector to determine the length of the stream processing time.
    */
  def startStreamProcessor(): Request[StartStreamProcessorResponse, AWSError] = js.native
  def startStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ StartStreamProcessorResponse, Unit]): Request[StartStreamProcessorResponse, AWSError] = js.native
  /**
    * Starts processing a stream processor. You create a stream processor by calling CreateStreamProcessor. To tell StartStreamProcessor which stream processor to start, use the value of the Name field specified in the call to CreateStreamProcessor. If you are using a label detection stream processor to detect labels, you need to provide a Start selector and a Stop selector to determine the length of the stream processing time.
    */
  def startStreamProcessor(params: StartStreamProcessorRequest): Request[StartStreamProcessorResponse, AWSError] = js.native
  def startStreamProcessor(
    params: StartStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartStreamProcessorResponse, Unit]
  ): Request[StartStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous detection of text in a stored video. Amazon Rekognition Video can detect text in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartTextDetection returns a job identifier (JobId) which you use to get the results of the operation. When text detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetTextDetection and pass the job identifier (JobId) from the initial call to StartTextDetection. 
    */
  def startTextDetection(): Request[StartTextDetectionResponse, AWSError] = js.native
  def startTextDetection(callback: js.Function2[/* err */ AWSError, /* data */ StartTextDetectionResponse, Unit]): Request[StartTextDetectionResponse, AWSError] = js.native
  /**
    * Starts asynchronous detection of text in a stored video. Amazon Rekognition Video can detect text in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartTextDetection returns a job identifier (JobId) which you use to get the results of the operation. When text detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetTextDetection and pass the job identifier (JobId) from the initial call to StartTextDetection. 
    */
  def startTextDetection(params: StartTextDetectionRequest): Request[StartTextDetectionResponse, AWSError] = js.native
  def startTextDetection(
    params: StartTextDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTextDetectionResponse, Unit]
  ): Request[StartTextDetectionResponse, AWSError] = js.native
  
  /**
    * Stops a running model. The operation might take a while to complete. To check the current status, call DescribeProjectVersions.  This operation requires permissions to perform the rekognition:StopProjectVersion action.
    */
  def stopProjectVersion(): Request[StopProjectVersionResponse, AWSError] = js.native
  def stopProjectVersion(callback: js.Function2[/* err */ AWSError, /* data */ StopProjectVersionResponse, Unit]): Request[StopProjectVersionResponse, AWSError] = js.native
  /**
    * Stops a running model. The operation might take a while to complete. To check the current status, call DescribeProjectVersions.  This operation requires permissions to perform the rekognition:StopProjectVersion action.
    */
  def stopProjectVersion(params: StopProjectVersionRequest): Request[StopProjectVersionResponse, AWSError] = js.native
  def stopProjectVersion(
    params: StopProjectVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopProjectVersionResponse, Unit]
  ): Request[StopProjectVersionResponse, AWSError] = js.native
  
  /**
    * Stops a running stream processor that was created by CreateStreamProcessor.
    */
  def stopStreamProcessor(): Request[StopStreamProcessorResponse, AWSError] = js.native
  def stopStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ StopStreamProcessorResponse, Unit]): Request[StopStreamProcessorResponse, AWSError] = js.native
  /**
    * Stops a running stream processor that was created by CreateStreamProcessor.
    */
  def stopStreamProcessor(params: StopStreamProcessorRequest): Request[StopStreamProcessorResponse, AWSError] = js.native
  def stopStreamProcessor(
    params: StopStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopStreamProcessorResponse, Unit]
  ): Request[StopStreamProcessorResponse, AWSError] = js.native
  
  /**
    *  Adds one or more key-value tags to an Amazon Rekognition collection, stream processor, or Custom Labels model. For more information, see Tagging AWS Resources.  This operation requires permissions to perform the rekognition:TagResource action. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Adds one or more key-value tags to an Amazon Rekognition collection, stream processor, or Custom Labels model. For more information, see Tagging AWS Resources.  This operation requires permissions to perform the rekognition:TagResource action. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    *  Removes one or more tags from an Amazon Rekognition collection, stream processor, or Custom Labels model.  This operation requires permissions to perform the rekognition:UntagResource action. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Removes one or more tags from an Amazon Rekognition collection, stream processor, or Custom Labels model.  This operation requires permissions to perform the rekognition:UntagResource action. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Adds or updates one or more entries (images) in a dataset. An entry is a JSON Line which contains the information for a single image, including the image location, assigned labels, and object location bounding boxes. For more information, see Image-Level labels in manifest files and Object localization in manifest files in the Amazon Rekognition Custom Labels Developer Guide.  If the source-ref field in the JSON line references an existing image, the existing image in the dataset is updated. If source-ref field doesn't reference an existing image, the image is added as a new image to the dataset.  You specify the changes that you want to make in the Changes input parameter. There isn't a limit to the number JSON Lines that you can change, but the size of Changes must be less than 5MB.  UpdateDatasetEntries returns immediatly, but the dataset update might take a while to complete. Use DescribeDataset to check the current status. The dataset updated successfully if the value of Status is UPDATE_COMPLETE.  To check if any non-terminal errors occured, call ListDatasetEntries and check for the presence of errors lists in the JSON Lines. Dataset update fails if a terminal error occurs (Status = UPDATE_FAILED). Currently, you can't access the terminal error information from the Amazon Rekognition Custom Labels SDK.  This operation requires permissions to perform the rekognition:UpdateDatasetEntries action.
    */
  def updateDatasetEntries(): Request[UpdateDatasetEntriesResponse, AWSError] = js.native
  def updateDatasetEntries(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetEntriesResponse, Unit]): Request[UpdateDatasetEntriesResponse, AWSError] = js.native
  /**
    * Adds or updates one or more entries (images) in a dataset. An entry is a JSON Line which contains the information for a single image, including the image location, assigned labels, and object location bounding boxes. For more information, see Image-Level labels in manifest files and Object localization in manifest files in the Amazon Rekognition Custom Labels Developer Guide.  If the source-ref field in the JSON line references an existing image, the existing image in the dataset is updated. If source-ref field doesn't reference an existing image, the image is added as a new image to the dataset.  You specify the changes that you want to make in the Changes input parameter. There isn't a limit to the number JSON Lines that you can change, but the size of Changes must be less than 5MB.  UpdateDatasetEntries returns immediatly, but the dataset update might take a while to complete. Use DescribeDataset to check the current status. The dataset updated successfully if the value of Status is UPDATE_COMPLETE.  To check if any non-terminal errors occured, call ListDatasetEntries and check for the presence of errors lists in the JSON Lines. Dataset update fails if a terminal error occurs (Status = UPDATE_FAILED). Currently, you can't access the terminal error information from the Amazon Rekognition Custom Labels SDK.  This operation requires permissions to perform the rekognition:UpdateDatasetEntries action.
    */
  def updateDatasetEntries(params: UpdateDatasetEntriesRequest): Request[UpdateDatasetEntriesResponse, AWSError] = js.native
  def updateDatasetEntries(
    params: UpdateDatasetEntriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetEntriesResponse, Unit]
  ): Request[UpdateDatasetEntriesResponse, AWSError] = js.native
  
  /**
    *  Allows you to update a stream processor. You can change some settings and regions of interest and delete certain parameters. 
    */
  def updateStreamProcessor(): Request[UpdateStreamProcessorResponse, AWSError] = js.native
  def updateStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamProcessorResponse, Unit]): Request[UpdateStreamProcessorResponse, AWSError] = js.native
  /**
    *  Allows you to update a stream processor. You can change some settings and regions of interest and delete certain parameters. 
    */
  def updateStreamProcessor(params: UpdateStreamProcessorRequest): Request[UpdateStreamProcessorResponse, AWSError] = js.native
  def updateStreamProcessor(
    params: UpdateStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamProcessorResponse, Unit]
  ): Request[UpdateStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Waits for the projectVersionRunning state by periodically calling the underlying Rekognition.describeProjectVersionsoperation every 30 seconds (at most 40 times). Wait until the ProjectVersion is running.
    */
  @JSName("waitFor")
  def waitFor_projectVersionRunning(state: projectVersionRunning): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_projectVersionRunning(
    state: projectVersionRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  /**
    * Waits for the projectVersionRunning state by periodically calling the underlying Rekognition.describeProjectVersionsoperation every 30 seconds (at most 40 times). Wait until the ProjectVersion is running.
    */
  @JSName("waitFor")
  def waitFor_projectVersionRunning(state: projectVersionRunning, params: DescribeProjectVersionsRe): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_projectVersionRunning(
    state: projectVersionRunning,
    params: DescribeProjectVersionsRe,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  /**
    * Waits for the projectVersionTrainingCompleted state by periodically calling the underlying Rekognition.describeProjectVersionsoperation every 120 seconds (at most 360 times). Wait until the ProjectVersion training completes.
    */
  @JSName("waitFor")
  def waitFor_projectVersionTrainingCompleted(state: projectVersionTrainingCompleted): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_projectVersionTrainingCompleted(
    state: projectVersionTrainingCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  /**
    * Waits for the projectVersionTrainingCompleted state by periodically calling the underlying Rekognition.describeProjectVersionsoperation every 120 seconds (at most 360 times). Wait until the ProjectVersion training completes.
    */
  @JSName("waitFor")
  def waitFor_projectVersionTrainingCompleted(state: projectVersionTrainingCompleted, params: DescribeProjectVersionsRe): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_projectVersionTrainingCompleted(
    state: projectVersionTrainingCompleted,
    params: DescribeProjectVersionsRe,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
}
