package typings.awsSdk.clientsLookoutvisionMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookoutVision extends Service {
  
  @JSName("config")
  var config_LookoutVision: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new dataset in an Amazon Lookout for Vision project. CreateDataset can create a training or a test dataset from a valid dataset source (DatasetSource). If you want a single dataset project, specify train for the value of DatasetType. To have a project with separate training and test datasets, call CreateDataset twice. On the first call, specify train for the value of DatasetType. On the second call, specify test for the value of DatasetType.  This operation requires permissions to perform the lookoutvision:CreateDataset operation.
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates a new dataset in an Amazon Lookout for Vision project. CreateDataset can create a training or a test dataset from a valid dataset source (DatasetSource). If you want a single dataset project, specify train for the value of DatasetType. To have a project with separate training and test datasets, call CreateDataset twice. On the first call, specify train for the value of DatasetType. On the second call, specify test for the value of DatasetType.  This operation requires permissions to perform the lookoutvision:CreateDataset operation.
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    * Creates a new version of a model within an an Amazon Lookout for Vision project. CreateModel is an asynchronous operation in which Amazon Lookout for Vision trains, tests, and evaluates a new version of a model.  To get the current status, check the Status field returned in the response from DescribeModel. If the project has a single dataset, Amazon Lookout for Vision internally splits the dataset to create a training and a test dataset. If the project has a training and a test dataset, Lookout for Vision uses the respective datasets to train and test the model.  After training completes, the evaluation metrics are stored at the location specified in OutputConfig.  This operation requires permissions to perform the lookoutvision:CreateModel operation. If you want to tag your model, you also require permission to the lookoutvision:TagResource operation.
    */
  def createModel(): Request[CreateModelResponse, AWSError] = js.native
  def createModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelResponse, Unit]): Request[CreateModelResponse, AWSError] = js.native
  /**
    * Creates a new version of a model within an an Amazon Lookout for Vision project. CreateModel is an asynchronous operation in which Amazon Lookout for Vision trains, tests, and evaluates a new version of a model.  To get the current status, check the Status field returned in the response from DescribeModel. If the project has a single dataset, Amazon Lookout for Vision internally splits the dataset to create a training and a test dataset. If the project has a training and a test dataset, Lookout for Vision uses the respective datasets to train and test the model.  After training completes, the evaluation metrics are stored at the location specified in OutputConfig.  This operation requires permissions to perform the lookoutvision:CreateModel operation. If you want to tag your model, you also require permission to the lookoutvision:TagResource operation.
    */
  def createModel(params: CreateModelRequest): Request[CreateModelResponse, AWSError] = js.native
  def createModel(
    params: CreateModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelResponse, Unit]
  ): Request[CreateModelResponse, AWSError] = js.native
  
  /**
    * Creates an empty Amazon Lookout for Vision project. After you create the project, add a dataset by calling CreateDataset. This operation requires permissions to perform the lookoutvision:CreateProject operation.
    */
  def createProject(): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Creates an empty Amazon Lookout for Vision project. After you create the project, add a dataset by calling CreateDataset. This operation requires permissions to perform the lookoutvision:CreateProject operation.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]
  ): Request[CreateProjectResponse, AWSError] = js.native
  
  /**
    * Deletes an existing Amazon Lookout for Vision dataset.  If your the project has a single dataset, you must create a new dataset before you can create a model. If you project has a training dataset and a test dataset consider the following.    If you delete the test dataset, your project reverts to a single dataset project. If you then train the model, Amazon Lookout for Vision internally splits the remaining dataset into a training and test dataset.   If you delete the training dataset, you must create a training dataset before you can create a model.   This operation requires permissions to perform the lookoutvision:DeleteDataset operation.
    */
  def deleteDataset(): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]): Request[DeleteDatasetResponse, AWSError] = js.native
  /**
    * Deletes an existing Amazon Lookout for Vision dataset.  If your the project has a single dataset, you must create a new dataset before you can create a model. If you project has a training dataset and a test dataset consider the following.    If you delete the test dataset, your project reverts to a single dataset project. If you then train the model, Amazon Lookout for Vision internally splits the remaining dataset into a training and test dataset.   If you delete the training dataset, you must create a training dataset before you can create a model.   This operation requires permissions to perform the lookoutvision:DeleteDataset operation.
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]
  ): Request[DeleteDatasetResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Lookout for Vision model. You can't delete a running model. To stop a running model, use the StopModel operation. It might take a few seconds to delete a model. To determine if a model has been deleted, call ListModels and check if the version of the model (ModelVersion) is in the Models array.   This operation requires permissions to perform the lookoutvision:DeleteModel operation.
    */
  def deleteModel(): Request[DeleteModelResponse, AWSError] = js.native
  def deleteModel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteModelResponse, Unit]): Request[DeleteModelResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Lookout for Vision model. You can't delete a running model. To stop a running model, use the StopModel operation. It might take a few seconds to delete a model. To determine if a model has been deleted, call ListModels and check if the version of the model (ModelVersion) is in the Models array.   This operation requires permissions to perform the lookoutvision:DeleteModel operation.
    */
  def deleteModel(params: DeleteModelRequest): Request[DeleteModelResponse, AWSError] = js.native
  def deleteModel(
    params: DeleteModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteModelResponse, Unit]
  ): Request[DeleteModelResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Lookout for Vision project. To delete a project, you must first delete each version of the model associated with the project. To delete a model use the DeleteModel operation. You also have to delete the dataset(s) associated with the model. For more information, see DeleteDataset. The images referenced by the training and test datasets aren't deleted.  This operation requires permissions to perform the lookoutvision:DeleteProject operation.
    */
  def deleteProject(): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]): Request[DeleteProjectResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Lookout for Vision project. To delete a project, you must first delete each version of the model associated with the project. To delete a model use the DeleteModel operation. You also have to delete the dataset(s) associated with the model. For more information, see DeleteDataset. The images referenced by the training and test datasets aren't deleted.  This operation requires permissions to perform the lookoutvision:DeleteProject operation.
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]
  ): Request[DeleteProjectResponse, AWSError] = js.native
  
  /**
    * Describe an Amazon Lookout for Vision dataset. This operation requires permissions to perform the lookoutvision:DescribeDataset operation.
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Describe an Amazon Lookout for Vision dataset. This operation requires permissions to perform the lookoutvision:DescribeDataset operation.
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  
  /**
    * Describes a version of an Amazon Lookout for Vision model. This operation requires permissions to perform the lookoutvision:DescribeModel operation.
    */
  def describeModel(): Request[DescribeModelResponse, AWSError] = js.native
  def describeModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelResponse, Unit]): Request[DescribeModelResponse, AWSError] = js.native
  /**
    * Describes a version of an Amazon Lookout for Vision model. This operation requires permissions to perform the lookoutvision:DescribeModel operation.
    */
  def describeModel(params: DescribeModelRequest): Request[DescribeModelResponse, AWSError] = js.native
  def describeModel(
    params: DescribeModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelResponse, Unit]
  ): Request[DescribeModelResponse, AWSError] = js.native
  
  /**
    * Describes an Amazon Lookout for Vision model packaging job.  This operation requires permissions to perform the lookoutvision:DescribeModelPackagingJob operation. For more information, see Using your Amazon Lookout for Vision model on an edge device in the Amazon Lookout for Vision Developer Guide. 
    */
  def describeModelPackagingJob(): Request[DescribeModelPackagingJobResponse, AWSError] = js.native
  def describeModelPackagingJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackagingJobResponse, Unit]): Request[DescribeModelPackagingJobResponse, AWSError] = js.native
  /**
    * Describes an Amazon Lookout for Vision model packaging job.  This operation requires permissions to perform the lookoutvision:DescribeModelPackagingJob operation. For more information, see Using your Amazon Lookout for Vision model on an edge device in the Amazon Lookout for Vision Developer Guide. 
    */
  def describeModelPackagingJob(params: DescribeModelPackagingJobRequest): Request[DescribeModelPackagingJobResponse, AWSError] = js.native
  def describeModelPackagingJob(
    params: DescribeModelPackagingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackagingJobResponse, Unit]
  ): Request[DescribeModelPackagingJobResponse, AWSError] = js.native
  
  /**
    * Describes an Amazon Lookout for Vision project. This operation requires permissions to perform the lookoutvision:DescribeProject operation.
    */
  def describeProject(): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]): Request[DescribeProjectResponse, AWSError] = js.native
  /**
    * Describes an Amazon Lookout for Vision project. This operation requires permissions to perform the lookoutvision:DescribeProject operation.
    */
  def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(
    params: DescribeProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]
  ): Request[DescribeProjectResponse, AWSError] = js.native
  
  /**
    * Detects anomalies in an image that you supply.  The response from DetectAnomalies includes a boolean prediction that the image contains one or more anomalies and a confidence value for the prediction. If the model is an image segmentation model, the response also includes segmentation information for each type of anomaly found in the image.  Before calling DetectAnomalies, you must first start your model with the StartModel operation. You are charged for the amount of time, in minutes, that a model runs and for the number of anomaly detection units that your model uses. If you are not using a model, use the StopModel operation to stop your model.   For more information, see Detecting anomalies in an image in the Amazon Lookout for Vision developer guide. This operation requires permissions to perform the lookoutvision:DetectAnomalies operation.
    */
  def detectAnomalies(): Request[DetectAnomaliesResponse, AWSError] = js.native
  def detectAnomalies(callback: js.Function2[/* err */ AWSError, /* data */ DetectAnomaliesResponse, Unit]): Request[DetectAnomaliesResponse, AWSError] = js.native
  /**
    * Detects anomalies in an image that you supply.  The response from DetectAnomalies includes a boolean prediction that the image contains one or more anomalies and a confidence value for the prediction. If the model is an image segmentation model, the response also includes segmentation information for each type of anomaly found in the image.  Before calling DetectAnomalies, you must first start your model with the StartModel operation. You are charged for the amount of time, in minutes, that a model runs and for the number of anomaly detection units that your model uses. If you are not using a model, use the StopModel operation to stop your model.   For more information, see Detecting anomalies in an image in the Amazon Lookout for Vision developer guide. This operation requires permissions to perform the lookoutvision:DetectAnomalies operation.
    */
  def detectAnomalies(params: DetectAnomaliesRequest): Request[DetectAnomaliesResponse, AWSError] = js.native
  def detectAnomalies(
    params: DetectAnomaliesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectAnomaliesResponse, Unit]
  ): Request[DetectAnomaliesResponse, AWSError] = js.native
  
  /**
    * Lists the JSON Lines within a dataset. An Amazon Lookout for Vision JSON Line contains the anomaly information for a single image, including the image location and the assigned label. This operation requires permissions to perform the lookoutvision:ListDatasetEntries operation.
    */
  def listDatasetEntries(): Request[ListDatasetEntriesResponse, AWSError] = js.native
  def listDatasetEntries(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetEntriesResponse, Unit]): Request[ListDatasetEntriesResponse, AWSError] = js.native
  /**
    * Lists the JSON Lines within a dataset. An Amazon Lookout for Vision JSON Line contains the anomaly information for a single image, including the image location and the assigned label. This operation requires permissions to perform the lookoutvision:ListDatasetEntries operation.
    */
  def listDatasetEntries(params: ListDatasetEntriesRequest): Request[ListDatasetEntriesResponse, AWSError] = js.native
  def listDatasetEntries(
    params: ListDatasetEntriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetEntriesResponse, Unit]
  ): Request[ListDatasetEntriesResponse, AWSError] = js.native
  
  /**
    *  Lists the model packaging jobs created for an Amazon Lookout for Vision project.  This operation requires permissions to perform the lookoutvision:ListModelPackagingJobs operation.  For more information, see Using your Amazon Lookout for Vision model on an edge device in the Amazon Lookout for Vision Developer Guide. 
    */
  def listModelPackagingJobs(): Request[ListModelPackagingJobsResponse, AWSError] = js.native
  def listModelPackagingJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListModelPackagingJobsResponse, Unit]): Request[ListModelPackagingJobsResponse, AWSError] = js.native
  /**
    *  Lists the model packaging jobs created for an Amazon Lookout for Vision project.  This operation requires permissions to perform the lookoutvision:ListModelPackagingJobs operation.  For more information, see Using your Amazon Lookout for Vision model on an edge device in the Amazon Lookout for Vision Developer Guide. 
    */
  def listModelPackagingJobs(params: ListModelPackagingJobsRequest): Request[ListModelPackagingJobsResponse, AWSError] = js.native
  def listModelPackagingJobs(
    params: ListModelPackagingJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelPackagingJobsResponse, Unit]
  ): Request[ListModelPackagingJobsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a model in an Amazon Lookout for Vision project. The ListModels operation is eventually consistent. Recent calls to CreateModel might take a while to appear in the response from ListProjects. This operation requires permissions to perform the lookoutvision:ListModels operation.
    */
  def listModels(): Request[ListModelsResponse, AWSError] = js.native
  def listModels(callback: js.Function2[/* err */ AWSError, /* data */ ListModelsResponse, Unit]): Request[ListModelsResponse, AWSError] = js.native
  /**
    * Lists the versions of a model in an Amazon Lookout for Vision project. The ListModels operation is eventually consistent. Recent calls to CreateModel might take a while to appear in the response from ListProjects. This operation requires permissions to perform the lookoutvision:ListModels operation.
    */
  def listModels(params: ListModelsRequest): Request[ListModelsResponse, AWSError] = js.native
  def listModels(
    params: ListModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelsResponse, Unit]
  ): Request[ListModelsResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon Lookout for Vision projects in your AWS account that are in the AWS Region in which you call ListProjects. The ListProjects operation is eventually consistent. Recent calls to CreateProject and DeleteProject might take a while to appear in the response from ListProjects. This operation requires permissions to perform the lookoutvision:ListProjects operation.
    */
  def listProjects(): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]): Request[ListProjectsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Lookout for Vision projects in your AWS account that are in the AWS Region in which you call ListProjects. The ListProjects operation is eventually consistent. Recent calls to CreateProject and DeleteProject might take a while to appear in the response from ListProjects. This operation requires permissions to perform the lookoutvision:ListProjects operation.
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]
  ): Request[ListProjectsResponse, AWSError] = js.native
  
  /**
    * Returns a list of tags attached to the specified Amazon Lookout for Vision model. This operation requires permissions to perform the lookoutvision:ListTagsForResource operation.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of tags attached to the specified Amazon Lookout for Vision model. This operation requires permissions to perform the lookoutvision:ListTagsForResource operation.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Starts the running of the version of an Amazon Lookout for Vision model. Starting a model takes a while to complete. To check the current state of the model, use DescribeModel. A model is ready to use when its status is HOSTED. Once the model is running, you can detect custom labels in new images by calling DetectAnomalies.  You are charged for the amount of time that the model is running. To stop a running model, call StopModel.  This operation requires permissions to perform the lookoutvision:StartModel operation.
    */
  def startModel(): Request[StartModelResponse, AWSError] = js.native
  def startModel(callback: js.Function2[/* err */ AWSError, /* data */ StartModelResponse, Unit]): Request[StartModelResponse, AWSError] = js.native
  /**
    * Starts the running of the version of an Amazon Lookout for Vision model. Starting a model takes a while to complete. To check the current state of the model, use DescribeModel. A model is ready to use when its status is HOSTED. Once the model is running, you can detect custom labels in new images by calling DetectAnomalies.  You are charged for the amount of time that the model is running. To stop a running model, call StopModel.  This operation requires permissions to perform the lookoutvision:StartModel operation.
    */
  def startModel(params: StartModelRequest): Request[StartModelResponse, AWSError] = js.native
  def startModel(
    params: StartModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartModelResponse, Unit]
  ): Request[StartModelResponse, AWSError] = js.native
  
  /**
    * Starts an Amazon Lookout for Vision model packaging job. A model packaging job creates an AWS IoT Greengrass component for a Lookout for Vision model. You can use the component to deploy your model to an edge device managed by Greengrass.  Use the DescribeModelPackagingJob API to determine the current status of the job. The model packaging job is complete if the value of Status is SUCCEEDED. To deploy the component to the target device, use the component name and component version with the AWS IoT Greengrass CreateDeployment API. This operation requires the following permissions:    lookoutvision:StartModelPackagingJob     s3:PutObject     s3:GetBucketLocation     greengrass:CreateComponentVersion     greengrass:DescribeComponent    (Optional) greengrass:TagResource. Only required if you want to tag the component.   For more information, see Using your Amazon Lookout for Vision model on an edge device in the Amazon Lookout for Vision Developer Guide. 
    */
  def startModelPackagingJob(): Request[StartModelPackagingJobResponse, AWSError] = js.native
  def startModelPackagingJob(callback: js.Function2[/* err */ AWSError, /* data */ StartModelPackagingJobResponse, Unit]): Request[StartModelPackagingJobResponse, AWSError] = js.native
  /**
    * Starts an Amazon Lookout for Vision model packaging job. A model packaging job creates an AWS IoT Greengrass component for a Lookout for Vision model. You can use the component to deploy your model to an edge device managed by Greengrass.  Use the DescribeModelPackagingJob API to determine the current status of the job. The model packaging job is complete if the value of Status is SUCCEEDED. To deploy the component to the target device, use the component name and component version with the AWS IoT Greengrass CreateDeployment API. This operation requires the following permissions:    lookoutvision:StartModelPackagingJob     s3:PutObject     s3:GetBucketLocation     greengrass:CreateComponentVersion     greengrass:DescribeComponent    (Optional) greengrass:TagResource. Only required if you want to tag the component.   For more information, see Using your Amazon Lookout for Vision model on an edge device in the Amazon Lookout for Vision Developer Guide. 
    */
  def startModelPackagingJob(params: StartModelPackagingJobRequest): Request[StartModelPackagingJobResponse, AWSError] = js.native
  def startModelPackagingJob(
    params: StartModelPackagingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartModelPackagingJobResponse, Unit]
  ): Request[StartModelPackagingJobResponse, AWSError] = js.native
  
  /**
    * Stops the hosting of a running model. The operation might take a while to complete. To check the current status, call DescribeModel.  After the model hosting stops, the Status of the model is TRAINED. This operation requires permissions to perform the lookoutvision:StopModel operation.
    */
  def stopModel(): Request[StopModelResponse, AWSError] = js.native
  def stopModel(callback: js.Function2[/* err */ AWSError, /* data */ StopModelResponse, Unit]): Request[StopModelResponse, AWSError] = js.native
  /**
    * Stops the hosting of a running model. The operation might take a while to complete. To check the current status, call DescribeModel.  After the model hosting stops, the Status of the model is TRAINED. This operation requires permissions to perform the lookoutvision:StopModel operation.
    */
  def stopModel(params: StopModelRequest): Request[StopModelResponse, AWSError] = js.native
  def stopModel(
    params: StopModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopModelResponse, Unit]
  ): Request[StopModelResponse, AWSError] = js.native
  
  /**
    * Adds one or more key-value tags to an Amazon Lookout for Vision model. For more information, see Tagging a model in the Amazon Lookout for Vision Developer Guide.  This operation requires permissions to perform the lookoutvision:TagResource operation.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more key-value tags to an Amazon Lookout for Vision model. For more information, see Tagging a model in the Amazon Lookout for Vision Developer Guide.  This operation requires permissions to perform the lookoutvision:TagResource operation.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from an Amazon Lookout for Vision model. For more information, see Tagging a model in the Amazon Lookout for Vision Developer Guide.  This operation requires permissions to perform the lookoutvision:UntagResource operation.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from an Amazon Lookout for Vision model. For more information, see Tagging a model in the Amazon Lookout for Vision Developer Guide.  This operation requires permissions to perform the lookoutvision:UntagResource operation.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Adds or updates one or more JSON Line entries in a dataset. A JSON Line includes information about an image used for training or testing an Amazon Lookout for Vision model. To update an existing JSON Line, use the source-ref field to identify the JSON Line. The JSON line that you supply replaces the existing JSON line. Any existing annotations that are not in the new JSON line are removed from the dataset.  For more information, see Defining JSON lines for anomaly classification in the Amazon Lookout for Vision Developer Guide.   The images you reference in the source-ref field of a JSON line, must be in the same S3 bucket as the existing images in the dataset.   Updating a dataset might take a while to complete. To check the current status, call DescribeDataset and check the Status field in the response. This operation requires permissions to perform the lookoutvision:UpdateDatasetEntries operation.
    */
  def updateDatasetEntries(): Request[UpdateDatasetEntriesResponse, AWSError] = js.native
  def updateDatasetEntries(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetEntriesResponse, Unit]): Request[UpdateDatasetEntriesResponse, AWSError] = js.native
  /**
    * Adds or updates one or more JSON Line entries in a dataset. A JSON Line includes information about an image used for training or testing an Amazon Lookout for Vision model. To update an existing JSON Line, use the source-ref field to identify the JSON Line. The JSON line that you supply replaces the existing JSON line. Any existing annotations that are not in the new JSON line are removed from the dataset.  For more information, see Defining JSON lines for anomaly classification in the Amazon Lookout for Vision Developer Guide.   The images you reference in the source-ref field of a JSON line, must be in the same S3 bucket as the existing images in the dataset.   Updating a dataset might take a while to complete. To check the current status, call DescribeDataset and check the Status field in the response. This operation requires permissions to perform the lookoutvision:UpdateDatasetEntries operation.
    */
  def updateDatasetEntries(params: UpdateDatasetEntriesRequest): Request[UpdateDatasetEntriesResponse, AWSError] = js.native
  def updateDatasetEntries(
    params: UpdateDatasetEntriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetEntriesResponse, Unit]
  ): Request[UpdateDatasetEntriesResponse, AWSError] = js.native
}
