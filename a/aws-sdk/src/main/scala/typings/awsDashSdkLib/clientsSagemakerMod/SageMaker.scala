package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SageMaker
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SageMaker: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
    */
  def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
    */
  def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTags(
    params: AddTagsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
    */
  def createAlgorithm(): awsDashSdkLib.libRequestMod.Request[CreateAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAlgorithm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAlgorithmOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
    */
  def createAlgorithm(params: CreateAlgorithmInput): awsDashSdkLib.libRequestMod.Request[CreateAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAlgorithm(
    params: CreateAlgorithmInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAlgorithmOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other Git repository.
    */
  def createCodeRepository(): awsDashSdkLib.libRequestMod.Request[CreateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCodeRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other Git repository.
    */
  def createCodeRepository(params: CreateCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[CreateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCodeRepository(
    params: CreateCodeRepositoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def createCompilationJob(): awsDashSdkLib.libRequestMod.Request[CreateCompilationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCompilationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCompilationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCompilationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def createCompilationJob(params: CreateCompilationJobRequest): awsDashSdkLib.libRequestMod.Request[CreateCompilationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCompilationJob(
    params: CreateCompilationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCompilationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCompilationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
    */
  def createEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
    */
  def createEndpoint(params: CreateEndpointInput): awsDashSdkLib.libRequestMod.Request[CreateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
    */
  def createEndpointConfig(): awsDashSdkLib.libRequestMod.Request[CreateEndpointConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEndpointConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEndpointConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEndpointConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
    */
  def createEndpointConfig(params: CreateEndpointConfigInput): awsDashSdkLib.libRequestMod.Request[CreateEndpointConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEndpointConfig(
    params: CreateEndpointConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEndpointConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEndpointConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
    */
  def createHyperParameterTuningJob(): awsDashSdkLib.libRequestMod.Request[CreateHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHyperParameterTuningJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
    */
  def createHyperParameterTuningJob(params: CreateHyperParameterTuningJobRequest): awsDashSdkLib.libRequestMod.Request[CreateHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHyperParameterTuningJob(
    params: CreateHyperParameterTuningJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models. You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when want the data to stay within your organization or when a specific set of skills is required.   One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.    The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. For more information, see Using Automated Data Labeling. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
    */
  def createLabelingJob(): awsDashSdkLib.libRequestMod.Request[CreateLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLabelingJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLabelingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models. You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when want the data to stay within your organization or when a specific set of skills is required.   One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.    The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. For more information, see Using Automated Data Labeling. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
    */
  def createLabelingJob(params: CreateLabelingJobRequest): awsDashSdkLib.libRequestMod.Request[CreateLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLabelingJob(
    params: CreateLabelingJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLabelingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
    */
  def createModel(): awsDashSdkLib.libRequestMod.Request[CreateModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
    */
  def createModel(params: CreateModelInput): awsDashSdkLib.libRequestMod.Request[CreateModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createModel(
    params: CreateModelInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker. To create a model package by specifying a Docker container that contains your inference code and the Amazon S3 location of your model artifacts, provide values for InferenceSpecification. To create a model from an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for SourceAlgorithmSpecification.
    */
  def createModelPackage(): awsDashSdkLib.libRequestMod.Request[CreateModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createModelPackage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateModelPackageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker. To create a model package by specifying a Docker container that contains your inference code and the Amazon S3 location of your model artifacts, provide values for InferenceSpecification. To create a model from an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for SourceAlgorithmSpecification.
    */
  def createModelPackage(params: CreateModelPackageInput): awsDashSdkLib.libRequestMod.Request[CreateModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createModelPackage(
    params: CreateModelPackageInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateModelPackageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
    */
  def createNotebookInstance(): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNotebookInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
    */
  def createNotebookInstance(params: CreateNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNotebookInstance(
    params: CreateNotebookInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def createNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNotebookInstanceLifecycleConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def createNotebookInstanceLifecycleConfig(params: CreateNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNotebookInstanceLifecycleConfig(
    params: CreateNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.
    */
  def createPresignedNotebookInstanceUrl(): awsDashSdkLib.libRequestMod.Request[CreatePresignedNotebookInstanceUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPresignedNotebookInstanceUrl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePresignedNotebookInstanceUrlOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePresignedNotebookInstanceUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.
    */
  def createPresignedNotebookInstanceUrl(params: CreatePresignedNotebookInstanceUrlInput): awsDashSdkLib.libRequestMod.Request[CreatePresignedNotebookInstanceUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPresignedNotebookInstanceUrl(
    params: CreatePresignedNotebookInstanceUrlInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePresignedNotebookInstanceUrlOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePresignedNotebookInstanceUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
    */
  def createTrainingJob(): awsDashSdkLib.libRequestMod.Request[CreateTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrainingJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
    */
  def createTrainingJob(params: CreateTrainingJobRequest): awsDashSdkLib.libRequestMod.Request[CreateTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrainingJob(
    params: CreateTrainingJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
    */
  def createTransformJob(): awsDashSdkLib.libRequestMod.Request[CreateTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTransformJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
    */
  def createTransformJob(params: CreateTransformJobRequest): awsDashSdkLib.libRequestMod.Request[CreateTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTransformJob(
    params: CreateTransformJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
    */
  def createWorkteam(): awsDashSdkLib.libRequestMod.Request[CreateWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
    */
  def createWorkteam(params: CreateWorkteamRequest): awsDashSdkLib.libRequestMod.Request[CreateWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWorkteam(
    params: CreateWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified algorithm from your account.
    */
  def deleteAlgorithm(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAlgorithm(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified algorithm from your account.
    */
  def deleteAlgorithm(params: DeleteAlgorithmInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAlgorithm(
    params: DeleteAlgorithmInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Git repository from your account.
    */
  def deleteCodeRepository(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCodeRepository(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Git repository from your account.
    */
  def deleteCodeRepository(params: DeleteCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCodeRepository(
    params: DeleteCodeRepositoryInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
    */
  def deleteEndpoint(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpoint(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
    */
  def deleteEndpoint(params: DeleteEndpointInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
    */
  def deleteEndpointConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpointConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
    */
  def deleteEndpointConfig(params: DeleteEndpointConfigInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpointConfig(
    params: DeleteEndpointConfigInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
    */
  def deleteModel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteModel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
    */
  def deleteModel(params: DeleteModelInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteModel(
    params: DeleteModelInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
    */
  def deleteModelPackage(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteModelPackage(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
    */
  def deleteModelPackage(params: DeleteModelPackageInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteModelPackage(
    params: DeleteModelPackageInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
    */
  def deleteNotebookInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotebookInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
    */
  def deleteNotebookInstance(params: DeleteNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotebookInstance(
    params: DeleteNotebookInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a notebook instance lifecycle configuration.
    */
  def deleteNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotebookInstanceLifecycleConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a notebook instance lifecycle configuration.
    */
  def deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotebookInstanceLifecycleConfig(
    params: DeleteNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
    */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
    */
  def deleteTags(params: DeleteTagsInput): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    params: DeleteTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing work team. This operation can't be undone.
    */
  def deleteWorkteam(): awsDashSdkLib.libRequestMod.Request[DeleteWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing work team. This operation can't be undone.
    */
  def deleteWorkteam(params: DeleteWorkteamRequest): awsDashSdkLib.libRequestMod.Request[DeleteWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWorkteam(
    params: DeleteWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of the specified algorithm that is in your account.
    */
  def describeAlgorithm(): awsDashSdkLib.libRequestMod.Request[DescribeAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAlgorithm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAlgorithmOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of the specified algorithm that is in your account.
    */
  def describeAlgorithm(params: DescribeAlgorithmInput): awsDashSdkLib.libRequestMod.Request[DescribeAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAlgorithm(
    params: DescribeAlgorithmInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAlgorithmOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets details about the specified Git repository.
    */
  def describeCodeRepository(): awsDashSdkLib.libRequestMod.Request[DescribeCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCodeRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets details about the specified Git repository.
    */
  def describeCodeRepository(params: DescribeCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[DescribeCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCodeRepository(
    params: DescribeCodeRepositoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def describeCompilationJob(): awsDashSdkLib.libRequestMod.Request[DescribeCompilationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCompilationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCompilationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCompilationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def describeCompilationJob(params: DescribeCompilationJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeCompilationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCompilationJob(
    params: DescribeCompilationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCompilationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCompilationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the description of an endpoint.
    */
  def describeEndpoint(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the description of an endpoint.
    */
  def describeEndpoint(params: DescribeEndpointInput): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpoint(
    params: DescribeEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
    */
  def describeEndpointConfig(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpointConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
    */
  def describeEndpointConfig(params: DescribeEndpointConfigInput): awsDashSdkLib.libRequestMod.Request[DescribeEndpointConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpointConfig(
    params: DescribeEndpointConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a description of a hyperparameter tuning job.
    */
  def describeHyperParameterTuningJob(): awsDashSdkLib.libRequestMod.Request[DescribeHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHyperParameterTuningJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a description of a hyperparameter tuning job.
    */
  def describeHyperParameterTuningJob(params: DescribeHyperParameterTuningJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHyperParameterTuningJob(
    params: DescribeHyperParameterTuningJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a labeling job.
    */
  def describeLabelingJob(): awsDashSdkLib.libRequestMod.Request[DescribeLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLabelingJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLabelingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a labeling job.
    */
  def describeLabelingJob(params: DescribeLabelingJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLabelingJob(
    params: DescribeLabelingJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLabelingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a model that you created using the CreateModel API.
    */
  def describeModel(): awsDashSdkLib.libRequestMod.Request[DescribeModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a model that you created using the CreateModel API.
    */
  def describeModel(params: DescribeModelInput): awsDashSdkLib.libRequestMod.Request[DescribeModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeModel(
    params: DescribeModelInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list them on AWS Marketplace. To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
    */
  def describeModelPackage(): awsDashSdkLib.libRequestMod.Request[DescribeModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeModelPackage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeModelPackageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list them on AWS Marketplace. To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
    */
  def describeModelPackage(params: DescribeModelPackageInput): awsDashSdkLib.libRequestMod.Request[DescribeModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeModelPackage(
    params: DescribeModelPackageInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeModelPackageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a notebook instance.
    */
  def describeNotebookInstance(): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotebookInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a notebook instance.
    */
  def describeNotebookInstance(params: DescribeNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotebookInstance(
    params: DescribeNotebookInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def describeNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotebookInstanceLifecycleConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def describeNotebookInstanceLifecycleConfig(params: DescribeNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotebookInstanceLifecycleConfig(
    params: DescribeNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
    */
  def describeSubscribedWorkteam(): awsDashSdkLib.libRequestMod.Request[DescribeSubscribedWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSubscribedWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSubscribedWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSubscribedWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
    */
  def describeSubscribedWorkteam(params: DescribeSubscribedWorkteamRequest): awsDashSdkLib.libRequestMod.Request[DescribeSubscribedWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSubscribedWorkteam(
    params: DescribeSubscribedWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSubscribedWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSubscribedWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a training job.
    */
  def describeTrainingJob(): awsDashSdkLib.libRequestMod.Request[DescribeTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTrainingJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a training job.
    */
  def describeTrainingJob(params: DescribeTrainingJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTrainingJob(
    params: DescribeTrainingJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a transform job.
    */
  def describeTransformJob(): awsDashSdkLib.libRequestMod.Request[DescribeTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTransformJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a transform job.
    */
  def describeTransformJob(params: DescribeTransformJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTransformJob(
    params: DescribeTransformJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
    */
  def describeWorkteam(): awsDashSdkLib.libRequestMod.Request[DescribeWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
    */
  def describeWorkteam(params: DescribeWorkteamRequest): awsDashSdkLib.libRequestMod.Request[DescribeWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeWorkteam(
    params: DescribeWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of possible matches for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
    */
  def getSearchSuggestions(): awsDashSdkLib.libRequestMod.Request[GetSearchSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSearchSuggestions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSearchSuggestionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSearchSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of possible matches for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
    */
  def getSearchSuggestions(params: GetSearchSuggestionsRequest): awsDashSdkLib.libRequestMod.Request[GetSearchSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSearchSuggestions(
    params: GetSearchSuggestionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSearchSuggestionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSearchSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the machine learning algorithms that have been created.
    */
  def listAlgorithms(): awsDashSdkLib.libRequestMod.Request[ListAlgorithmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAlgorithms(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAlgorithmsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAlgorithmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the machine learning algorithms that have been created.
    */
  def listAlgorithms(params: ListAlgorithmsInput): awsDashSdkLib.libRequestMod.Request[ListAlgorithmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAlgorithms(
    params: ListAlgorithmsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAlgorithmsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAlgorithmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the Git repositories in your account.
    */
  def listCodeRepositories(): awsDashSdkLib.libRequestMod.Request[ListCodeRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCodeRepositories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCodeRepositoriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCodeRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the Git repositories in your account.
    */
  def listCodeRepositories(params: ListCodeRepositoriesInput): awsDashSdkLib.libRequestMod.Request[ListCodeRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCodeRepositories(
    params: ListCodeRepositoriesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCodeRepositoriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCodeRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
    */
  def listCompilationJobs(): awsDashSdkLib.libRequestMod.Request[ListCompilationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCompilationJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCompilationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCompilationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
    */
  def listCompilationJobs(params: ListCompilationJobsRequest): awsDashSdkLib.libRequestMod.Request[ListCompilationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCompilationJobs(
    params: ListCompilationJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCompilationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCompilationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists endpoint configurations.
    */
  def listEndpointConfigs(): awsDashSdkLib.libRequestMod.Request[ListEndpointConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEndpointConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEndpointConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEndpointConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists endpoint configurations.
    */
  def listEndpointConfigs(params: ListEndpointConfigsInput): awsDashSdkLib.libRequestMod.Request[ListEndpointConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEndpointConfigs(
    params: ListEndpointConfigsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEndpointConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEndpointConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists endpoints.
    */
  def listEndpoints(): awsDashSdkLib.libRequestMod.Request[ListEndpointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEndpointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEndpointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists endpoints.
    */
  def listEndpoints(params: ListEndpointsInput): awsDashSdkLib.libRequestMod.Request[ListEndpointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEndpoints(
    params: ListEndpointsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEndpointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEndpointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
    */
  def listHyperParameterTuningJobs(): awsDashSdkLib.libRequestMod.Request[ListHyperParameterTuningJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHyperParameterTuningJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHyperParameterTuningJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHyperParameterTuningJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
    */
  def listHyperParameterTuningJobs(params: ListHyperParameterTuningJobsRequest): awsDashSdkLib.libRequestMod.Request[ListHyperParameterTuningJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHyperParameterTuningJobs(
    params: ListHyperParameterTuningJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHyperParameterTuningJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHyperParameterTuningJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of labeling jobs.
    */
  def listLabelingJobs(): awsDashSdkLib.libRequestMod.Request[ListLabelingJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLabelingJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLabelingJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLabelingJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of labeling jobs.
    */
  def listLabelingJobs(params: ListLabelingJobsRequest): awsDashSdkLib.libRequestMod.Request[ListLabelingJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLabelingJobs(
    params: ListLabelingJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLabelingJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLabelingJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of labeling jobs assigned to a specified work team.
    */
  def listLabelingJobsForWorkteam(): awsDashSdkLib.libRequestMod.Request[ListLabelingJobsForWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLabelingJobsForWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLabelingJobsForWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLabelingJobsForWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of labeling jobs assigned to a specified work team.
    */
  def listLabelingJobsForWorkteam(params: ListLabelingJobsForWorkteamRequest): awsDashSdkLib.libRequestMod.Request[ListLabelingJobsForWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLabelingJobsForWorkteam(
    params: ListLabelingJobsForWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLabelingJobsForWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLabelingJobsForWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the model packages that have been created.
    */
  def listModelPackages(): awsDashSdkLib.libRequestMod.Request[ListModelPackagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listModelPackages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListModelPackagesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListModelPackagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the model packages that have been created.
    */
  def listModelPackages(params: ListModelPackagesInput): awsDashSdkLib.libRequestMod.Request[ListModelPackagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listModelPackages(
    params: ListModelPackagesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListModelPackagesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListModelPackagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists models created with the CreateModel API.
    */
  def listModels(): awsDashSdkLib.libRequestMod.Request[ListModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listModels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListModelsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists models created with the CreateModel API.
    */
  def listModels(params: ListModelsInput): awsDashSdkLib.libRequestMod.Request[ListModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listModels(
    params: ListModelsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListModelsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def listNotebookInstanceLifecycleConfigs(): awsDashSdkLib.libRequestMod.Request[ListNotebookInstanceLifecycleConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNotebookInstanceLifecycleConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNotebookInstanceLifecycleConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNotebookInstanceLifecycleConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def listNotebookInstanceLifecycleConfigs(params: ListNotebookInstanceLifecycleConfigsInput): awsDashSdkLib.libRequestMod.Request[ListNotebookInstanceLifecycleConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNotebookInstanceLifecycleConfigs(
    params: ListNotebookInstanceLifecycleConfigsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNotebookInstanceLifecycleConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNotebookInstanceLifecycleConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
    */
  def listNotebookInstances(): awsDashSdkLib.libRequestMod.Request[ListNotebookInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNotebookInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNotebookInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNotebookInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
    */
  def listNotebookInstances(params: ListNotebookInstancesInput): awsDashSdkLib.libRequestMod.Request[ListNotebookInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNotebookInstances(
    params: ListNotebookInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNotebookInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNotebookInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listSubscribedWorkteams(): awsDashSdkLib.libRequestMod.Request[ListSubscribedWorkteamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSubscribedWorkteams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSubscribedWorkteamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSubscribedWorkteamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listSubscribedWorkteams(params: ListSubscribedWorkteamsRequest): awsDashSdkLib.libRequestMod.Request[ListSubscribedWorkteamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSubscribedWorkteams(
    params: ListSubscribedWorkteamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSubscribedWorkteamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSubscribedWorkteamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the tags for the specified Amazon SageMaker resource.
    */
  def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the tags for the specified Amazon SageMaker resource.
    */
  def listTags(params: ListTagsInput): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    params: ListTagsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists training jobs.
    */
  def listTrainingJobs(): awsDashSdkLib.libRequestMod.Request[ListTrainingJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrainingJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrainingJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrainingJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists training jobs.
    */
  def listTrainingJobs(params: ListTrainingJobsRequest): awsDashSdkLib.libRequestMod.Request[ListTrainingJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrainingJobs(
    params: ListTrainingJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrainingJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrainingJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
    */
  def listTrainingJobsForHyperParameterTuningJob(): awsDashSdkLib.libRequestMod.Request[
    ListTrainingJobsForHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTrainingJobsForHyperParameterTuningJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrainingJobsForHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListTrainingJobsForHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
    */
  def listTrainingJobsForHyperParameterTuningJob(params: ListTrainingJobsForHyperParameterTuningJobRequest): awsDashSdkLib.libRequestMod.Request[
    ListTrainingJobsForHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTrainingJobsForHyperParameterTuningJob(
    params: ListTrainingJobsForHyperParameterTuningJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrainingJobsForHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListTrainingJobsForHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists transform jobs.
    */
  def listTransformJobs(): awsDashSdkLib.libRequestMod.Request[ListTransformJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTransformJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTransformJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTransformJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists transform jobs.
    */
  def listTransformJobs(params: ListTransformJobsRequest): awsDashSdkLib.libRequestMod.Request[ListTransformJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTransformJobs(
    params: ListTransformJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTransformJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTransformJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listWorkteams(): awsDashSdkLib.libRequestMod.Request[ListWorkteamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWorkteams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWorkteamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWorkteamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listWorkteams(params: ListWorkteamsRequest): awsDashSdkLib.libRequestMod.Request[ListWorkteamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWorkteams(
    params: ListWorkteamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWorkteamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWorkteamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Renders the UI template so that you can preview the worker's experience. 
    */
  def renderUiTemplate(): awsDashSdkLib.libRequestMod.Request[RenderUiTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def renderUiTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RenderUiTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RenderUiTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Renders the UI template so that you can preview the worker's experience. 
    */
  def renderUiTemplate(params: RenderUiTemplateRequest): awsDashSdkLib.libRequestMod.Request[RenderUiTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def renderUiTemplate(
    params: RenderUiTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RenderUiTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RenderUiTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. You can sort the search results by any resource property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
    */
  def search(): awsDashSdkLib.libRequestMod.Request[SearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def search(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SearchResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. You can sort the search results by any resource property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
    */
  def search(params: SearchRequest): awsDashSdkLib.libRequestMod.Request[SearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def search(
    params: SearchRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SearchResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
    */
  def startNotebookInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startNotebookInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
    */
  def startNotebookInstance(params: StartNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startNotebookInstance(
    params: StartNotebookInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn't stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
    */
  def stopCompilationJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopCompilationJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn't stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
    */
  def stopCompilationJob(params: StopCompilationJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopCompilationJob(
    params: StopCompilationJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
    */
  def stopHyperParameterTuningJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopHyperParameterTuningJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
    */
  def stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopHyperParameterTuningJob(
    params: StopHyperParameterTuningJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
    */
  def stopLabelingJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopLabelingJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
    */
  def stopLabelingJob(params: StopLabelingJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopLabelingJob(
    params: StopLabelingJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume.  To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
    */
  def stopNotebookInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopNotebookInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume.  To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
    */
  def stopNotebookInstance(params: StopNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopNotebookInstance(
    params: StopNotebookInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
    */
  def stopTrainingJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTrainingJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
    */
  def stopTrainingJob(params: StopTrainingJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTrainingJob(
    params: StopTrainingJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
    */
  def stopTransformJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTransformJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
    */
  def stopTransformJob(params: StopTransformJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTransformJob(
    params: StopTransformJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified Git repository with the specified values.
    */
  def updateCodeRepository(): awsDashSdkLib.libRequestMod.Request[UpdateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCodeRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified Git repository with the specified values.
    */
  def updateCodeRepository(params: UpdateCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[UpdateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCodeRepository(
    params: UpdateCodeRepositoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
    */
  def updateEndpoint(): awsDashSdkLib.libRequestMod.Request[UpdateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
    */
  def updateEndpoint(params: UpdateEndpointInput): awsDashSdkLib.libRequestMod.Request[UpdateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpoint(
    params: UpdateEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
    */
  def updateEndpointWeightsAndCapacities(): awsDashSdkLib.libRequestMod.Request[UpdateEndpointWeightsAndCapacitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpointWeightsAndCapacities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointWeightsAndCapacitiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointWeightsAndCapacitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
    */
  def updateEndpointWeightsAndCapacities(params: UpdateEndpointWeightsAndCapacitiesInput): awsDashSdkLib.libRequestMod.Request[UpdateEndpointWeightsAndCapacitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpointWeightsAndCapacities(
    params: UpdateEndpointWeightsAndCapacitiesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointWeightsAndCapacitiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointWeightsAndCapacitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC security groups.
    */
  def updateNotebookInstance(): awsDashSdkLib.libRequestMod.Request[UpdateNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNotebookInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC security groups.
    */
  def updateNotebookInstance(params: UpdateNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[UpdateNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNotebookInstance(
    params: UpdateNotebookInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def updateNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[UpdateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNotebookInstanceLifecycleConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def updateNotebookInstanceLifecycleConfig(params: UpdateNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[UpdateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNotebookInstanceLifecycleConfig(
    params: UpdateNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing work team with new member definitions or description.
    */
  def updateWorkteam(): awsDashSdkLib.libRequestMod.Request[UpdateWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing work team with new member definitions or description.
    */
  def updateWorkteam(params: UpdateWorkteamRequest): awsDashSdkLib.libRequestMod.Request[UpdateWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWorkteam(
    params: UpdateWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
    params: DescribeEndpointInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
    params: DescribeEndpointInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_endpointInService(state: awsDashSdkLib.awsDashSdkLibStrings.endpointInService): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointInService,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointInService,
    params: DescribeEndpointInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointInService,
    params: DescribeEndpointInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceDeleted): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceDeleted,
    params: DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceDeleted,
    params: DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceInService): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceInService,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceInService,
    params: DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceInService,
    params: DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceStopped): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceStopped,
    params: DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceStopped,
    params: DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
    */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(state: awsDashSdkLib.awsDashSdkLibStrings.trainingJobCompletedOrStopped): awsDashSdkLib.libRequestMod.Request[DescribeTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.trainingJobCompletedOrStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
    */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.trainingJobCompletedOrStopped,
    params: DescribeTrainingJobRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.trainingJobCompletedOrStopped,
    params: DescribeTrainingJobRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(state: awsDashSdkLib.awsDashSdkLibStrings.transformJobCompletedOrStopped): awsDashSdkLib.libRequestMod.Request[DescribeTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.transformJobCompletedOrStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.transformJobCompletedOrStopped,
    params: DescribeTransformJobRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.transformJobCompletedOrStopped,
    params: DescribeTransformJobRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTransformJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

