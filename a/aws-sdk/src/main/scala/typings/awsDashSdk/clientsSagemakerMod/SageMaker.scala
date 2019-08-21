package typings.awsDashSdk.clientsSagemakerMod

import typings.awsDashSdk.Anon_Waiter
import typings.awsDashSdk.awsDashSdkStrings.endpointDeleted
import typings.awsDashSdk.awsDashSdkStrings.endpointInService
import typings.awsDashSdk.awsDashSdkStrings.notebookInstanceDeleted
import typings.awsDashSdk.awsDashSdkStrings.notebookInstanceInService
import typings.awsDashSdk.awsDashSdkStrings.notebookInstanceStopped
import typings.awsDashSdk.awsDashSdkStrings.trainingJobCompletedOrStopped
import typings.awsDashSdk.awsDashSdkStrings.transformJobCompletedOrStopped
import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SageMaker extends Service {
  @JSName("config")
  var config_SageMaker: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
    */
  def addTags(): Request[AddTagsOutput, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
    */
  def addTags(params: AddTagsInput): Request[AddTagsOutput, AWSError] = js.native
  def addTags(params: AddTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
    */
  def createAlgorithm(): Request[CreateAlgorithmOutput, AWSError] = js.native
  def createAlgorithm(callback: js.Function2[/* err */ AWSError, /* data */ CreateAlgorithmOutput, Unit]): Request[CreateAlgorithmOutput, AWSError] = js.native
  /**
    * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
    */
  def createAlgorithm(params: CreateAlgorithmInput): Request[CreateAlgorithmOutput, AWSError] = js.native
  def createAlgorithm(
    params: CreateAlgorithmInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAlgorithmOutput, Unit]
  ): Request[CreateAlgorithmOutput, AWSError] = js.native
  /**
    * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other Git repository.
    */
  def createCodeRepository(): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  def createCodeRepository(callback: js.Function2[/* err */ AWSError, /* data */ CreateCodeRepositoryOutput, Unit]): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  /**
    * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other Git repository.
    */
  def createCodeRepository(params: CreateCodeRepositoryInput): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  def createCodeRepository(
    params: CreateCodeRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCodeRepositoryOutput, Unit]
  ): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  /**
    * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def createCompilationJob(): Request[CreateCompilationJobResponse, AWSError] = js.native
  def createCompilationJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateCompilationJobResponse, Unit]): Request[CreateCompilationJobResponse, AWSError] = js.native
  /**
    * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def createCompilationJob(params: CreateCompilationJobRequest): Request[CreateCompilationJobResponse, AWSError] = js.native
  def createCompilationJob(
    params: CreateCompilationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCompilationJobResponse, Unit]
  ): Request[CreateCompilationJobResponse, AWSError] = js.native
  /**
    * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig.  The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
    */
  def createEndpoint(): Request[CreateEndpointOutput, AWSError] = js.native
  def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointOutput, Unit]): Request[CreateEndpointOutput, AWSError] = js.native
  /**
    * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig.  The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
    */
  def createEndpoint(params: CreateEndpointInput): Request[CreateEndpointOutput, AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointOutput, Unit]
  ): Request[CreateEndpointOutput, AWSError] = js.native
  /**
    * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
    */
  def createEndpointConfig(): Request[CreateEndpointConfigOutput, AWSError] = js.native
  def createEndpointConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointConfigOutput, Unit]): Request[CreateEndpointConfigOutput, AWSError] = js.native
  /**
    * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
    */
  def createEndpointConfig(params: CreateEndpointConfigInput): Request[CreateEndpointConfigOutput, AWSError] = js.native
  def createEndpointConfig(
    params: CreateEndpointConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointConfigOutput, Unit]
  ): Request[CreateEndpointConfigOutput, AWSError] = js.native
  /**
    * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
    */
  def createHyperParameterTuningJob(): Request[CreateHyperParameterTuningJobResponse, AWSError] = js.native
  def createHyperParameterTuningJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateHyperParameterTuningJobResponse, Unit]): Request[CreateHyperParameterTuningJobResponse, AWSError] = js.native
  /**
    * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
    */
  def createHyperParameterTuningJob(params: CreateHyperParameterTuningJobRequest): Request[CreateHyperParameterTuningJobResponse, AWSError] = js.native
  def createHyperParameterTuningJob(
    params: CreateHyperParameterTuningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHyperParameterTuningJobResponse, Unit]
  ): Request[CreateHyperParameterTuningJobResponse, AWSError] = js.native
  /**
    * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models. You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when want the data to stay within your organization or when a specific set of skills is required.   One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.    The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. For more information, see Using Automated Data Labeling. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
    */
  def createLabelingJob(): Request[CreateLabelingJobResponse, AWSError] = js.native
  def createLabelingJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelingJobResponse, Unit]): Request[CreateLabelingJobResponse, AWSError] = js.native
  /**
    * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models. You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when want the data to stay within your organization or when a specific set of skills is required.   One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.    The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. For more information, see Using Automated Data Labeling. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
    */
  def createLabelingJob(params: CreateLabelingJobRequest): Request[CreateLabelingJobResponse, AWSError] = js.native
  def createLabelingJob(
    params: CreateLabelingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelingJobResponse, Unit]
  ): Request[CreateLabelingJobResponse, AWSError] = js.native
  /**
    * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
    */
  def createModel(): Request[CreateModelOutput, AWSError] = js.native
  def createModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelOutput, Unit]): Request[CreateModelOutput, AWSError] = js.native
  /**
    * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
    */
  def createModel(params: CreateModelInput): Request[CreateModelOutput, AWSError] = js.native
  def createModel(
    params: CreateModelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelOutput, Unit]
  ): Request[CreateModelOutput, AWSError] = js.native
  /**
    * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker. To create a model package by specifying a Docker container that contains your inference code and the Amazon S3 location of your model artifacts, provide values for InferenceSpecification. To create a model from an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for SourceAlgorithmSpecification.
    */
  def createModelPackage(): Request[CreateModelPackageOutput, AWSError] = js.native
  def createModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelPackageOutput, Unit]): Request[CreateModelPackageOutput, AWSError] = js.native
  /**
    * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker. To create a model package by specifying a Docker container that contains your inference code and the Amazon S3 location of your model artifacts, provide values for InferenceSpecification. To create a model from an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for SourceAlgorithmSpecification.
    */
  def createModelPackage(params: CreateModelPackageInput): Request[CreateModelPackageOutput, AWSError] = js.native
  def createModelPackage(
    params: CreateModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelPackageOutput, Unit]
  ): Request[CreateModelPackageOutput, AWSError] = js.native
  /**
    * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). You can't change the name of a notebook instance after you create it. After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
    */
  def createNotebookInstance(): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  def createNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookInstanceOutput, Unit]): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  /**
    * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). You can't change the name of a notebook instance after you create it. After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
    */
  def createNotebookInstance(params: CreateNotebookInstanceInput): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  def createNotebookInstance(
    params: CreateNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookInstanceOutput, Unit]
  ): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  /**
    * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def createNotebookInstanceLifecycleConfig(): Request[CreateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def createNotebookInstanceLifecycleConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[CreateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  /**
    * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def createNotebookInstanceLifecycleConfig(params: CreateNotebookInstanceLifecycleConfigInput): Request[CreateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def createNotebookInstanceLifecycleConfig(
    params: CreateNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[CreateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  /**
    * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the notebook instance.For example, you can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.  The URL that you get from a call to is valid only for 5 minutes. If you try to use the URL after the 5-minute limit expires, you are directed to the AWS console sign-in page. 
    */
  def createPresignedNotebookInstanceUrl(): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  def createPresignedNotebookInstanceUrl(
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedNotebookInstanceUrlOutput, Unit]
  ): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  /**
    * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the notebook instance.For example, you can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.  The URL that you get from a call to is valid only for 5 minutes. If you try to use the URL after the 5-minute limit expires, you are directed to the AWS console sign-in page. 
    */
  def createPresignedNotebookInstanceUrl(params: CreatePresignedNotebookInstanceUrlInput): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  def createPresignedNotebookInstanceUrl(
    params: CreatePresignedNotebookInstanceUrlInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedNotebookInstanceUrlOutput, Unit]
  ): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  /**
    * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to enable the estimation of model parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     EnableManagedSpotTraining - Optimize the cost of training machine learning models by up to 80% by using Amazon EC2 Spot instances. For more information, see Managed Spot Training.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - To help cap training costs, use MaxRuntimeInSeconds to set a time limit for training. Use MaxWaitTimeInSeconds to specify how long you are willing to to wait for a managed spot training job to complete.     For more information about Amazon SageMaker, see How It Works. 
    */
  def createTrainingJob(): Request[CreateTrainingJobResponse, AWSError] = js.native
  def createTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrainingJobResponse, Unit]): Request[CreateTrainingJobResponse, AWSError] = js.native
  /**
    * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to enable the estimation of model parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     EnableManagedSpotTraining - Optimize the cost of training machine learning models by up to 80% by using Amazon EC2 Spot instances. For more information, see Managed Spot Training.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - To help cap training costs, use MaxRuntimeInSeconds to set a time limit for training. Use MaxWaitTimeInSeconds to specify how long you are willing to to wait for a managed spot training job to complete.     For more information about Amazon SageMaker, see How It Works. 
    */
  def createTrainingJob(params: CreateTrainingJobRequest): Request[CreateTrainingJobResponse, AWSError] = js.native
  def createTrainingJob(
    params: CreateTrainingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrainingJobResponse, Unit]
  ): Request[CreateTrainingJobResponse, AWSError] = js.native
  /**
    * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
    */
  def createTransformJob(): Request[CreateTransformJobResponse, AWSError] = js.native
  def createTransformJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateTransformJobResponse, Unit]): Request[CreateTransformJobResponse, AWSError] = js.native
  /**
    * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
    */
  def createTransformJob(params: CreateTransformJobRequest): Request[CreateTransformJobResponse, AWSError] = js.native
  def createTransformJob(
    params: CreateTransformJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransformJobResponse, Unit]
  ): Request[CreateTransformJobResponse, AWSError] = js.native
  /**
    * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
    */
  def createWorkteam(): Request[CreateWorkteamResponse, AWSError] = js.native
  def createWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkteamResponse, Unit]): Request[CreateWorkteamResponse, AWSError] = js.native
  /**
    * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
    */
  def createWorkteam(params: CreateWorkteamRequest): Request[CreateWorkteamResponse, AWSError] = js.native
  def createWorkteam(
    params: CreateWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkteamResponse, Unit]
  ): Request[CreateWorkteamResponse, AWSError] = js.native
  /**
    * Removes the specified algorithm from your account.
    */
  def deleteAlgorithm(): Request[js.Object, AWSError] = js.native
  def deleteAlgorithm(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified algorithm from your account.
    */
  def deleteAlgorithm(params: DeleteAlgorithmInput): Request[js.Object, AWSError] = js.native
  def deleteAlgorithm(
    params: DeleteAlgorithmInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Git repository from your account.
    */
  def deleteCodeRepository(): Request[js.Object, AWSError] = js.native
  def deleteCodeRepository(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Git repository from your account.
    */
  def deleteCodeRepository(params: DeleteCodeRepositoryInput): Request[js.Object, AWSError] = js.native
  def deleteCodeRepository(
    params: DeleteCodeRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
    */
  def deleteEndpoint(): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
    */
  def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
    */
  def deleteEndpointConfig(): Request[js.Object, AWSError] = js.native
  def deleteEndpointConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
    */
  def deleteEndpointConfig(params: DeleteEndpointConfigInput): Request[js.Object, AWSError] = js.native
  def deleteEndpointConfig(
    params: DeleteEndpointConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
    */
  def deleteModel(): Request[js.Object, AWSError] = js.native
  def deleteModel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
    */
  def deleteModel(params: DeleteModelInput): Request[js.Object, AWSError] = js.native
  def deleteModel(params: DeleteModelInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
    */
  def deleteModelPackage(): Request[js.Object, AWSError] = js.native
  def deleteModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
    */
  def deleteModelPackage(params: DeleteModelPackageInput): Request[js.Object, AWSError] = js.native
  def deleteModelPackage(
    params: DeleteModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
    */
  def deleteNotebookInstance(): Request[js.Object, AWSError] = js.native
  def deleteNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
    */
  def deleteNotebookInstance(params: DeleteNotebookInstanceInput): Request[js.Object, AWSError] = js.native
  def deleteNotebookInstance(
    params: DeleteNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a notebook instance lifecycle configuration.
    */
  def deleteNotebookInstanceLifecycleConfig(): Request[js.Object, AWSError] = js.native
  def deleteNotebookInstanceLifecycleConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a notebook instance lifecycle configuration.
    */
  def deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput): Request[js.Object, AWSError] = js.native
  def deleteNotebookInstanceLifecycleConfig(
    params: DeleteNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
    */
  def deleteTags(): Request[DeleteTagsOutput, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsOutput, Unit]): Request[DeleteTagsOutput, AWSError] = js.native
  /**
    * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
    */
  def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput, AWSError] = js.native
  def deleteTags(
    params: DeleteTagsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsOutput, Unit]
  ): Request[DeleteTagsOutput, AWSError] = js.native
  /**
    * Deletes an existing work team. This operation can't be undone.
    */
  def deleteWorkteam(): Request[DeleteWorkteamResponse, AWSError] = js.native
  def deleteWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkteamResponse, Unit]): Request[DeleteWorkteamResponse, AWSError] = js.native
  /**
    * Deletes an existing work team. This operation can't be undone.
    */
  def deleteWorkteam(params: DeleteWorkteamRequest): Request[DeleteWorkteamResponse, AWSError] = js.native
  def deleteWorkteam(
    params: DeleteWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkteamResponse, Unit]
  ): Request[DeleteWorkteamResponse, AWSError] = js.native
  /**
    * Returns a description of the specified algorithm that is in your account.
    */
  def describeAlgorithm(): Request[DescribeAlgorithmOutput, AWSError] = js.native
  def describeAlgorithm(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlgorithmOutput, Unit]): Request[DescribeAlgorithmOutput, AWSError] = js.native
  /**
    * Returns a description of the specified algorithm that is in your account.
    */
  def describeAlgorithm(params: DescribeAlgorithmInput): Request[DescribeAlgorithmOutput, AWSError] = js.native
  def describeAlgorithm(
    params: DescribeAlgorithmInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlgorithmOutput, Unit]
  ): Request[DescribeAlgorithmOutput, AWSError] = js.native
  /**
    * Gets details about the specified Git repository.
    */
  def describeCodeRepository(): Request[DescribeCodeRepositoryOutput, AWSError] = js.native
  def describeCodeRepository(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeRepositoryOutput, Unit]): Request[DescribeCodeRepositoryOutput, AWSError] = js.native
  /**
    * Gets details about the specified Git repository.
    */
  def describeCodeRepository(params: DescribeCodeRepositoryInput): Request[DescribeCodeRepositoryOutput, AWSError] = js.native
  def describeCodeRepository(
    params: DescribeCodeRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeRepositoryOutput, Unit]
  ): Request[DescribeCodeRepositoryOutput, AWSError] = js.native
  /**
    * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def describeCompilationJob(): Request[DescribeCompilationJobResponse, AWSError] = js.native
  def describeCompilationJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCompilationJobResponse, Unit]): Request[DescribeCompilationJobResponse, AWSError] = js.native
  /**
    * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def describeCompilationJob(params: DescribeCompilationJobRequest): Request[DescribeCompilationJobResponse, AWSError] = js.native
  def describeCompilationJob(
    params: DescribeCompilationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCompilationJobResponse, Unit]
  ): Request[DescribeCompilationJobResponse, AWSError] = js.native
  /**
    * Returns the description of an endpoint.
    */
  def describeEndpoint(): Request[DescribeEndpointOutput, AWSError] = js.native
  def describeEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Returns the description of an endpoint.
    */
  def describeEndpoint(params: DescribeEndpointInput): Request[DescribeEndpointOutput, AWSError] = js.native
  def describeEndpoint(
    params: DescribeEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
    */
  def describeEndpointConfig(): Request[DescribeEndpointConfigOutput, AWSError] = js.native
  def describeEndpointConfig(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointConfigOutput, Unit]): Request[DescribeEndpointConfigOutput, AWSError] = js.native
  /**
    * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
    */
  def describeEndpointConfig(params: DescribeEndpointConfigInput): Request[DescribeEndpointConfigOutput, AWSError] = js.native
  def describeEndpointConfig(
    params: DescribeEndpointConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointConfigOutput, Unit]
  ): Request[DescribeEndpointConfigOutput, AWSError] = js.native
  /**
    * Gets a description of a hyperparameter tuning job.
    */
  def describeHyperParameterTuningJob(): Request[DescribeHyperParameterTuningJobResponse, AWSError] = js.native
  def describeHyperParameterTuningJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHyperParameterTuningJobResponse, Unit]
  ): Request[DescribeHyperParameterTuningJobResponse, AWSError] = js.native
  /**
    * Gets a description of a hyperparameter tuning job.
    */
  def describeHyperParameterTuningJob(params: DescribeHyperParameterTuningJobRequest): Request[DescribeHyperParameterTuningJobResponse, AWSError] = js.native
  def describeHyperParameterTuningJob(
    params: DescribeHyperParameterTuningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHyperParameterTuningJobResponse, Unit]
  ): Request[DescribeHyperParameterTuningJobResponse, AWSError] = js.native
  /**
    * Gets information about a labeling job.
    */
  def describeLabelingJob(): Request[DescribeLabelingJobResponse, AWSError] = js.native
  def describeLabelingJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLabelingJobResponse, Unit]): Request[DescribeLabelingJobResponse, AWSError] = js.native
  /**
    * Gets information about a labeling job.
    */
  def describeLabelingJob(params: DescribeLabelingJobRequest): Request[DescribeLabelingJobResponse, AWSError] = js.native
  def describeLabelingJob(
    params: DescribeLabelingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLabelingJobResponse, Unit]
  ): Request[DescribeLabelingJobResponse, AWSError] = js.native
  /**
    * Describes a model that you created using the CreateModel API.
    */
  def describeModel(): Request[DescribeModelOutput, AWSError] = js.native
  def describeModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelOutput, Unit]): Request[DescribeModelOutput, AWSError] = js.native
  /**
    * Describes a model that you created using the CreateModel API.
    */
  def describeModel(params: DescribeModelInput): Request[DescribeModelOutput, AWSError] = js.native
  def describeModel(
    params: DescribeModelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelOutput, Unit]
  ): Request[DescribeModelOutput, AWSError] = js.native
  /**
    * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list them on AWS Marketplace. To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
    */
  def describeModelPackage(): Request[DescribeModelPackageOutput, AWSError] = js.native
  def describeModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackageOutput, Unit]): Request[DescribeModelPackageOutput, AWSError] = js.native
  /**
    * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list them on AWS Marketplace. To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
    */
  def describeModelPackage(params: DescribeModelPackageInput): Request[DescribeModelPackageOutput, AWSError] = js.native
  def describeModelPackage(
    params: DescribeModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackageOutput, Unit]
  ): Request[DescribeModelPackageOutput, AWSError] = js.native
  /**
    * Returns information about a notebook instance.
    */
  def describeNotebookInstance(): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  def describeNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Returns information about a notebook instance.
    */
  def describeNotebookInstance(params: DescribeNotebookInstanceInput): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  def describeNotebookInstance(
    params: DescribeNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def describeNotebookInstanceLifecycleConfig(): Request[DescribeNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def describeNotebookInstanceLifecycleConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[DescribeNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  /**
    * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def describeNotebookInstanceLifecycleConfig(params: DescribeNotebookInstanceLifecycleConfigInput): Request[DescribeNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def describeNotebookInstanceLifecycleConfig(
    params: DescribeNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[DescribeNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  /**
    * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
    */
  def describeSubscribedWorkteam(): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  def describeSubscribedWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscribedWorkteamResponse, Unit]): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  /**
    * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
    */
  def describeSubscribedWorkteam(params: DescribeSubscribedWorkteamRequest): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  def describeSubscribedWorkteam(
    params: DescribeSubscribedWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscribedWorkteamResponse, Unit]
  ): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  /**
    * Returns information about a training job.
    */
  def describeTrainingJob(): Request[DescribeTrainingJobResponse, AWSError] = js.native
  def describeTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrainingJobResponse, Unit]): Request[DescribeTrainingJobResponse, AWSError] = js.native
  /**
    * Returns information about a training job.
    */
  def describeTrainingJob(params: DescribeTrainingJobRequest): Request[DescribeTrainingJobResponse, AWSError] = js.native
  def describeTrainingJob(
    params: DescribeTrainingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrainingJobResponse, Unit]
  ): Request[DescribeTrainingJobResponse, AWSError] = js.native
  /**
    * Returns information about a transform job.
    */
  def describeTransformJob(): Request[DescribeTransformJobResponse, AWSError] = js.native
  def describeTransformJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransformJobResponse, Unit]): Request[DescribeTransformJobResponse, AWSError] = js.native
  /**
    * Returns information about a transform job.
    */
  def describeTransformJob(params: DescribeTransformJobRequest): Request[DescribeTransformJobResponse, AWSError] = js.native
  def describeTransformJob(
    params: DescribeTransformJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransformJobResponse, Unit]
  ): Request[DescribeTransformJobResponse, AWSError] = js.native
  /**
    * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
    */
  def describeWorkteam(): Request[DescribeWorkteamResponse, AWSError] = js.native
  def describeWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkteamResponse, Unit]): Request[DescribeWorkteamResponse, AWSError] = js.native
  /**
    * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
    */
  def describeWorkteam(params: DescribeWorkteamRequest): Request[DescribeWorkteamResponse, AWSError] = js.native
  def describeWorkteam(
    params: DescribeWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkteamResponse, Unit]
  ): Request[DescribeWorkteamResponse, AWSError] = js.native
  /**
    * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of possible matches for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
    */
  def getSearchSuggestions(): Request[GetSearchSuggestionsResponse, AWSError] = js.native
  def getSearchSuggestions(callback: js.Function2[/* err */ AWSError, /* data */ GetSearchSuggestionsResponse, Unit]): Request[GetSearchSuggestionsResponse, AWSError] = js.native
  /**
    * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of possible matches for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
    */
  def getSearchSuggestions(params: GetSearchSuggestionsRequest): Request[GetSearchSuggestionsResponse, AWSError] = js.native
  def getSearchSuggestions(
    params: GetSearchSuggestionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSearchSuggestionsResponse, Unit]
  ): Request[GetSearchSuggestionsResponse, AWSError] = js.native
  /**
    * Lists the machine learning algorithms that have been created.
    */
  def listAlgorithms(): Request[ListAlgorithmsOutput, AWSError] = js.native
  def listAlgorithms(callback: js.Function2[/* err */ AWSError, /* data */ ListAlgorithmsOutput, Unit]): Request[ListAlgorithmsOutput, AWSError] = js.native
  /**
    * Lists the machine learning algorithms that have been created.
    */
  def listAlgorithms(params: ListAlgorithmsInput): Request[ListAlgorithmsOutput, AWSError] = js.native
  def listAlgorithms(
    params: ListAlgorithmsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAlgorithmsOutput, Unit]
  ): Request[ListAlgorithmsOutput, AWSError] = js.native
  /**
    * Gets a list of the Git repositories in your account.
    */
  def listCodeRepositories(): Request[ListCodeRepositoriesOutput, AWSError] = js.native
  def listCodeRepositories(callback: js.Function2[/* err */ AWSError, /* data */ ListCodeRepositoriesOutput, Unit]): Request[ListCodeRepositoriesOutput, AWSError] = js.native
  /**
    * Gets a list of the Git repositories in your account.
    */
  def listCodeRepositories(params: ListCodeRepositoriesInput): Request[ListCodeRepositoriesOutput, AWSError] = js.native
  def listCodeRepositories(
    params: ListCodeRepositoriesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCodeRepositoriesOutput, Unit]
  ): Request[ListCodeRepositoriesOutput, AWSError] = js.native
  /**
    * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
    */
  def listCompilationJobs(): Request[ListCompilationJobsResponse, AWSError] = js.native
  def listCompilationJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListCompilationJobsResponse, Unit]): Request[ListCompilationJobsResponse, AWSError] = js.native
  /**
    * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
    */
  def listCompilationJobs(params: ListCompilationJobsRequest): Request[ListCompilationJobsResponse, AWSError] = js.native
  def listCompilationJobs(
    params: ListCompilationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCompilationJobsResponse, Unit]
  ): Request[ListCompilationJobsResponse, AWSError] = js.native
  /**
    * Lists endpoint configurations.
    */
  def listEndpointConfigs(): Request[ListEndpointConfigsOutput, AWSError] = js.native
  def listEndpointConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointConfigsOutput, Unit]): Request[ListEndpointConfigsOutput, AWSError] = js.native
  /**
    * Lists endpoint configurations.
    */
  def listEndpointConfigs(params: ListEndpointConfigsInput): Request[ListEndpointConfigsOutput, AWSError] = js.native
  def listEndpointConfigs(
    params: ListEndpointConfigsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointConfigsOutput, Unit]
  ): Request[ListEndpointConfigsOutput, AWSError] = js.native
  /**
    * Lists endpoints.
    */
  def listEndpoints(): Request[ListEndpointsOutput, AWSError] = js.native
  def listEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsOutput, Unit]): Request[ListEndpointsOutput, AWSError] = js.native
  /**
    * Lists endpoints.
    */
  def listEndpoints(params: ListEndpointsInput): Request[ListEndpointsOutput, AWSError] = js.native
  def listEndpoints(
    params: ListEndpointsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsOutput, Unit]
  ): Request[ListEndpointsOutput, AWSError] = js.native
  /**
    * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
    */
  def listHyperParameterTuningJobs(): Request[ListHyperParameterTuningJobsResponse, AWSError] = js.native
  def listHyperParameterTuningJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListHyperParameterTuningJobsResponse, Unit]): Request[ListHyperParameterTuningJobsResponse, AWSError] = js.native
  /**
    * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
    */
  def listHyperParameterTuningJobs(params: ListHyperParameterTuningJobsRequest): Request[ListHyperParameterTuningJobsResponse, AWSError] = js.native
  def listHyperParameterTuningJobs(
    params: ListHyperParameterTuningJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHyperParameterTuningJobsResponse, Unit]
  ): Request[ListHyperParameterTuningJobsResponse, AWSError] = js.native
  /**
    * Gets a list of labeling jobs.
    */
  def listLabelingJobs(): Request[ListLabelingJobsResponse, AWSError] = js.native
  def listLabelingJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListLabelingJobsResponse, Unit]): Request[ListLabelingJobsResponse, AWSError] = js.native
  /**
    * Gets a list of labeling jobs.
    */
  def listLabelingJobs(params: ListLabelingJobsRequest): Request[ListLabelingJobsResponse, AWSError] = js.native
  def listLabelingJobs(
    params: ListLabelingJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLabelingJobsResponse, Unit]
  ): Request[ListLabelingJobsResponse, AWSError] = js.native
  /**
    * Gets a list of labeling jobs assigned to a specified work team.
    */
  def listLabelingJobsForWorkteam(): Request[ListLabelingJobsForWorkteamResponse, AWSError] = js.native
  def listLabelingJobsForWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ ListLabelingJobsForWorkteamResponse, Unit]): Request[ListLabelingJobsForWorkteamResponse, AWSError] = js.native
  /**
    * Gets a list of labeling jobs assigned to a specified work team.
    */
  def listLabelingJobsForWorkteam(params: ListLabelingJobsForWorkteamRequest): Request[ListLabelingJobsForWorkteamResponse, AWSError] = js.native
  def listLabelingJobsForWorkteam(
    params: ListLabelingJobsForWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLabelingJobsForWorkteamResponse, Unit]
  ): Request[ListLabelingJobsForWorkteamResponse, AWSError] = js.native
  /**
    * Lists the model packages that have been created.
    */
  def listModelPackages(): Request[ListModelPackagesOutput, AWSError] = js.native
  def listModelPackages(callback: js.Function2[/* err */ AWSError, /* data */ ListModelPackagesOutput, Unit]): Request[ListModelPackagesOutput, AWSError] = js.native
  /**
    * Lists the model packages that have been created.
    */
  def listModelPackages(params: ListModelPackagesInput): Request[ListModelPackagesOutput, AWSError] = js.native
  def listModelPackages(
    params: ListModelPackagesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelPackagesOutput, Unit]
  ): Request[ListModelPackagesOutput, AWSError] = js.native
  /**
    * Lists models created with the CreateModel API.
    */
  def listModels(): Request[ListModelsOutput, AWSError] = js.native
  def listModels(callback: js.Function2[/* err */ AWSError, /* data */ ListModelsOutput, Unit]): Request[ListModelsOutput, AWSError] = js.native
  /**
    * Lists models created with the CreateModel API.
    */
  def listModels(params: ListModelsInput): Request[ListModelsOutput, AWSError] = js.native
  def listModels(
    params: ListModelsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelsOutput, Unit]
  ): Request[ListModelsOutput, AWSError] = js.native
  /**
    * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def listNotebookInstanceLifecycleConfigs(): Request[ListNotebookInstanceLifecycleConfigsOutput, AWSError] = js.native
  def listNotebookInstanceLifecycleConfigs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstanceLifecycleConfigsOutput, Unit]
  ): Request[ListNotebookInstanceLifecycleConfigsOutput, AWSError] = js.native
  /**
    * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def listNotebookInstanceLifecycleConfigs(params: ListNotebookInstanceLifecycleConfigsInput): Request[ListNotebookInstanceLifecycleConfigsOutput, AWSError] = js.native
  def listNotebookInstanceLifecycleConfigs(
    params: ListNotebookInstanceLifecycleConfigsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstanceLifecycleConfigsOutput, Unit]
  ): Request[ListNotebookInstanceLifecycleConfigsOutput, AWSError] = js.native
  /**
    * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
    */
  def listNotebookInstances(): Request[ListNotebookInstancesOutput, AWSError] = js.native
  def listNotebookInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstancesOutput, Unit]): Request[ListNotebookInstancesOutput, AWSError] = js.native
  /**
    * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
    */
  def listNotebookInstances(params: ListNotebookInstancesInput): Request[ListNotebookInstancesOutput, AWSError] = js.native
  def listNotebookInstances(
    params: ListNotebookInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstancesOutput, Unit]
  ): Request[ListNotebookInstancesOutput, AWSError] = js.native
  /**
    * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listSubscribedWorkteams(): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  def listSubscribedWorkteams(callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribedWorkteamsResponse, Unit]): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  /**
    * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listSubscribedWorkteams(params: ListSubscribedWorkteamsRequest): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  def listSubscribedWorkteams(
    params: ListSubscribedWorkteamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribedWorkteamsResponse, Unit]
  ): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  /**
    * Returns the tags for the specified Amazon SageMaker resource.
    */
  def listTags(): Request[ListTagsOutput, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsOutput, Unit]): Request[ListTagsOutput, AWSError] = js.native
  /**
    * Returns the tags for the specified Amazon SageMaker resource.
    */
  def listTags(params: ListTagsInput): Request[ListTagsOutput, AWSError] = js.native
  def listTags(params: ListTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ ListTagsOutput, Unit]): Request[ListTagsOutput, AWSError] = js.native
  /**
    * Lists training jobs.
    */
  def listTrainingJobs(): Request[ListTrainingJobsResponse, AWSError] = js.native
  def listTrainingJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTrainingJobsResponse, Unit]): Request[ListTrainingJobsResponse, AWSError] = js.native
  /**
    * Lists training jobs.
    */
  def listTrainingJobs(params: ListTrainingJobsRequest): Request[ListTrainingJobsResponse, AWSError] = js.native
  def listTrainingJobs(
    params: ListTrainingJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrainingJobsResponse, Unit]
  ): Request[ListTrainingJobsResponse, AWSError] = js.native
  /**
    * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
    */
  def listTrainingJobsForHyperParameterTuningJob(): Request[ListTrainingJobsForHyperParameterTuningJobResponse, AWSError] = js.native
  def listTrainingJobsForHyperParameterTuningJob(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListTrainingJobsForHyperParameterTuningJobResponse, 
      Unit
    ]
  ): Request[ListTrainingJobsForHyperParameterTuningJobResponse, AWSError] = js.native
  /**
    * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
    */
  def listTrainingJobsForHyperParameterTuningJob(params: ListTrainingJobsForHyperParameterTuningJobRequest): Request[ListTrainingJobsForHyperParameterTuningJobResponse, AWSError] = js.native
  def listTrainingJobsForHyperParameterTuningJob(
    params: ListTrainingJobsForHyperParameterTuningJobRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListTrainingJobsForHyperParameterTuningJobResponse, 
      Unit
    ]
  ): Request[ListTrainingJobsForHyperParameterTuningJobResponse, AWSError] = js.native
  /**
    * Lists transform jobs.
    */
  def listTransformJobs(): Request[ListTransformJobsResponse, AWSError] = js.native
  def listTransformJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTransformJobsResponse, Unit]): Request[ListTransformJobsResponse, AWSError] = js.native
  /**
    * Lists transform jobs.
    */
  def listTransformJobs(params: ListTransformJobsRequest): Request[ListTransformJobsResponse, AWSError] = js.native
  def listTransformJobs(
    params: ListTransformJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTransformJobsResponse, Unit]
  ): Request[ListTransformJobsResponse, AWSError] = js.native
  /**
    * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listWorkteams(): Request[ListWorkteamsResponse, AWSError] = js.native
  def listWorkteams(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkteamsResponse, Unit]): Request[ListWorkteamsResponse, AWSError] = js.native
  /**
    * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listWorkteams(params: ListWorkteamsRequest): Request[ListWorkteamsResponse, AWSError] = js.native
  def listWorkteams(
    params: ListWorkteamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkteamsResponse, Unit]
  ): Request[ListWorkteamsResponse, AWSError] = js.native
  /**
    * Renders the UI template so that you can preview the worker's experience. 
    */
  def renderUiTemplate(): Request[RenderUiTemplateResponse, AWSError] = js.native
  def renderUiTemplate(callback: js.Function2[/* err */ AWSError, /* data */ RenderUiTemplateResponse, Unit]): Request[RenderUiTemplateResponse, AWSError] = js.native
  /**
    * Renders the UI template so that you can preview the worker's experience. 
    */
  def renderUiTemplate(params: RenderUiTemplateRequest): Request[RenderUiTemplateResponse, AWSError] = js.native
  def renderUiTemplate(
    params: RenderUiTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RenderUiTemplateResponse, Unit]
  ): Request[RenderUiTemplateResponse, AWSError] = js.native
  /**
    * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. You can sort the search results by any resource property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
    */
  def search(): Request[SearchResponse, AWSError] = js.native
  def search(callback: js.Function2[/* err */ AWSError, /* data */ SearchResponse, Unit]): Request[SearchResponse, AWSError] = js.native
  /**
    * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. You can sort the search results by any resource property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
    */
  def search(params: SearchRequest): Request[SearchResponse, AWSError] = js.native
  def search(params: SearchRequest, callback: js.Function2[/* err */ AWSError, /* data */ SearchResponse, Unit]): Request[SearchResponse, AWSError] = js.native
  /**
    * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
    */
  def startNotebookInstance(): Request[js.Object, AWSError] = js.native
  def startNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
    */
  def startNotebookInstance(params: StartNotebookInstanceInput): Request[js.Object, AWSError] = js.native
  def startNotebookInstance(
    params: StartNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn't stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
    */
  def stopCompilationJob(): Request[js.Object, AWSError] = js.native
  def stopCompilationJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn't stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
    */
  def stopCompilationJob(params: StopCompilationJobRequest): Request[js.Object, AWSError] = js.native
  def stopCompilationJob(
    params: StopCompilationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
    */
  def stopHyperParameterTuningJob(): Request[js.Object, AWSError] = js.native
  def stopHyperParameterTuningJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
    */
  def stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest): Request[js.Object, AWSError] = js.native
  def stopHyperParameterTuningJob(
    params: StopHyperParameterTuningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
    */
  def stopLabelingJob(): Request[js.Object, AWSError] = js.native
  def stopLabelingJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
    */
  def stopLabelingJob(params: StopLabelingJobRequest): Request[js.Object, AWSError] = js.native
  def stopLabelingJob(
    params: StopLabelingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML compute instance when you call StopNotebookInstance. To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
    */
  def stopNotebookInstance(): Request[js.Object, AWSError] = js.native
  def stopNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML compute instance when you call StopNotebookInstance. To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
    */
  def stopNotebookInstance(params: StopNotebookInstanceInput): Request[js.Object, AWSError] = js.native
  def stopNotebookInstance(
    params: StopNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
    */
  def stopTrainingJob(): Request[js.Object, AWSError] = js.native
  def stopTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
    */
  def stopTrainingJob(params: StopTrainingJobRequest): Request[js.Object, AWSError] = js.native
  def stopTrainingJob(
    params: StopTrainingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
    */
  def stopTransformJob(): Request[js.Object, AWSError] = js.native
  def stopTransformJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
    */
  def stopTransformJob(params: StopTransformJobRequest): Request[js.Object, AWSError] = js.native
  def stopTransformJob(
    params: StopTransformJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the specified Git repository with the specified values.
    */
  def updateCodeRepository(): Request[UpdateCodeRepositoryOutput, AWSError] = js.native
  def updateCodeRepository(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCodeRepositoryOutput, Unit]): Request[UpdateCodeRepositoryOutput, AWSError] = js.native
  /**
    * Updates the specified Git repository with the specified values.
    */
  def updateCodeRepository(params: UpdateCodeRepositoryInput): Request[UpdateCodeRepositoryOutput, AWSError] = js.native
  def updateCodeRepository(
    params: UpdateCodeRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCodeRepositoryOutput, Unit]
  ): Request[UpdateCodeRepositoryOutput, AWSError] = js.native
  /**
    * Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig. 
    */
  def updateEndpoint(): Request[UpdateEndpointOutput, AWSError] = js.native
  def updateEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointOutput, Unit]): Request[UpdateEndpointOutput, AWSError] = js.native
  /**
    * Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig. 
    */
  def updateEndpoint(params: UpdateEndpointInput): Request[UpdateEndpointOutput, AWSError] = js.native
  def updateEndpoint(
    params: UpdateEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointOutput, Unit]
  ): Request[UpdateEndpointOutput, AWSError] = js.native
  /**
    * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
    */
  def updateEndpointWeightsAndCapacities(): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  def updateEndpointWeightsAndCapacities(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointWeightsAndCapacitiesOutput, Unit]
  ): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  /**
    * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
    */
  def updateEndpointWeightsAndCapacities(params: UpdateEndpointWeightsAndCapacitiesInput): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  def updateEndpointWeightsAndCapacities(
    params: UpdateEndpointWeightsAndCapacitiesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointWeightsAndCapacitiesOutput, Unit]
  ): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  /**
    * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements.
    */
  def updateNotebookInstance(): Request[UpdateNotebookInstanceOutput, AWSError] = js.native
  def updateNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookInstanceOutput, Unit]): Request[UpdateNotebookInstanceOutput, AWSError] = js.native
  /**
    * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements.
    */
  def updateNotebookInstance(params: UpdateNotebookInstanceInput): Request[UpdateNotebookInstanceOutput, AWSError] = js.native
  def updateNotebookInstance(
    params: UpdateNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookInstanceOutput, Unit]
  ): Request[UpdateNotebookInstanceOutput, AWSError] = js.native
  /**
    * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def updateNotebookInstanceLifecycleConfig(): Request[UpdateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def updateNotebookInstanceLifecycleConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[UpdateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  /**
    * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def updateNotebookInstanceLifecycleConfig(params: UpdateNotebookInstanceLifecycleConfigInput): Request[UpdateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def updateNotebookInstanceLifecycleConfig(
    params: UpdateNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[UpdateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  /**
    * Updates an existing work team with new member definitions or description.
    */
  def updateWorkteam(): Request[UpdateWorkteamResponse, AWSError] = js.native
  def updateWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkteamResponse, Unit]): Request[UpdateWorkteamResponse, AWSError] = js.native
  /**
    * Updates an existing work team with new member definitions or description.
    */
  def updateWorkteam(params: UpdateWorkteamRequest): Request[UpdateWorkteamResponse, AWSError] = js.native
  def updateWorkteam(
    params: UpdateWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkteamResponse, Unit]
  ): Request[UpdateWorkteamResponse, AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: endpointDeleted): Request[DescribeEndpointOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: endpointDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: endpointDeleted, params: DescribeEndpointInput with Anon_Waiter): Request[DescribeEndpointOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: endpointDeleted,
    params: DescribeEndpointInput with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_endpointInService(state: endpointInService): Request[DescribeEndpointOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: endpointInService,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_endpointInService(state: endpointInService, params: DescribeEndpointInput with Anon_Waiter): Request[DescribeEndpointOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: endpointInService,
    params: DescribeEndpointInput with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(state: notebookInstanceDeleted): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: notebookInstanceDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(state: notebookInstanceDeleted, params: DescribeNotebookInstanceInput with Anon_Waiter): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: notebookInstanceDeleted,
    params: DescribeNotebookInstanceInput with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(state: notebookInstanceInService): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: notebookInstanceInService,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(state: notebookInstanceInService, params: DescribeNotebookInstanceInput with Anon_Waiter): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: notebookInstanceInService,
    params: DescribeNotebookInstanceInput with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(state: notebookInstanceStopped): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: notebookInstanceStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(state: notebookInstanceStopped, params: DescribeNotebookInstanceInput with Anon_Waiter): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: notebookInstanceStopped,
    params: DescribeNotebookInstanceInput with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
    */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(state: trainingJobCompletedOrStopped): Request[DescribeTrainingJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: trainingJobCompletedOrStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrainingJobResponse, Unit]
  ): Request[DescribeTrainingJobResponse, AWSError] = js.native
  /**
    * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
    */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(state: trainingJobCompletedOrStopped, params: DescribeTrainingJobRequest with Anon_Waiter): Request[DescribeTrainingJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: trainingJobCompletedOrStopped,
    params: DescribeTrainingJobRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrainingJobResponse, Unit]
  ): Request[DescribeTrainingJobResponse, AWSError] = js.native
  /**
    * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(state: transformJobCompletedOrStopped): Request[DescribeTransformJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: transformJobCompletedOrStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransformJobResponse, Unit]
  ): Request[DescribeTransformJobResponse, AWSError] = js.native
  /**
    * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(state: transformJobCompletedOrStopped, params: DescribeTransformJobRequest with Anon_Waiter): Request[DescribeTransformJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: transformJobCompletedOrStopped,
    params: DescribeTransformJobRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransformJobResponse, Unit]
  ): Request[DescribeTransformJobResponse, AWSError] = js.native
}

