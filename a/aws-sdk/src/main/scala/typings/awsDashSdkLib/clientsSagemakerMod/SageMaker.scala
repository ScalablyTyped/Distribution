package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SageMaker
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SageMaker: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ClientConfiguration = js.native
  /**
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
     */
  def addTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
     */
  def addTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
     */
  def addTags(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.AddTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
     */
  def addTags(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.AddTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     */
  def createAlgorithm(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateAlgorithmOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     */
  def createAlgorithm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateAlgorithmOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateAlgorithmOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     */
  def createAlgorithm(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateAlgorithmInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateAlgorithmOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     */
  def createAlgorithm(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateAlgorithmInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateAlgorithmOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateAlgorithmOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use git source control for the notebooks you create. The git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other git repository.
     */
  def createCodeRepository(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use git source control for the notebooks you create. The git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other git repository.
     */
  def createCodeRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use git source control for the notebooks you create. The git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other git repository.
     */
  def createCodeRepository(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use git source control for the notebooks you create. The git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other git repository.
     */
  def createCodeRepository(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCodeRepositoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
     */
  def createCompilationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCompilationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
     */
  def createCompilationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCompilationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCompilationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
     */
  def createCompilationJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCompilationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCompilationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
     */
  def createCompilationJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCompilationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCompilationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateCompilationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
     */
  def createEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
     */
  def createEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
     */
  def createEndpoint(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
     */
  def createEndpoint(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
     */
  def createEndpointConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
     */
  def createEndpointConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
     */
  def createEndpointConfig(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointConfigInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
     */
  def createEndpointConfig(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateEndpointConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
     */
  def createHyperParameterTuningJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
     */
  def createHyperParameterTuningJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
     */
  def createHyperParameterTuningJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateHyperParameterTuningJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
     */
  def createHyperParameterTuningJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateHyperParameterTuningJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job that uses human workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when the data is highly confidential or a specific set of skills is required.   One or more vendors that you select from the Amazon Marketplace. Vendors provide expertise in specific areas. Vendors are selected by AWS and meet a minimum standard of data security requirements.   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
     */
  def createLabelingJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateLabelingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job that uses human workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when the data is highly confidential or a specific set of skills is required.   One or more vendors that you select from the Amazon Marketplace. Vendors provide expertise in specific areas. Vendors are selected by AWS and meet a minimum standard of data security requirements.   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
     */
  def createLabelingJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateLabelingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateLabelingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job that uses human workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when the data is highly confidential or a specific set of skills is required.   One or more vendors that you select from the Amazon Marketplace. Vendors provide expertise in specific areas. Vendors are selected by AWS and meet a minimum standard of data security requirements.   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
     */
  def createLabelingJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateLabelingJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateLabelingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a job that uses human workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when the data is highly confidential or a specific set of skills is required.   One or more vendors that you select from the Amazon Marketplace. Vendors provide expertise in specific areas. Vendors are selected by AWS and meet a minimum standard of data security requirements.   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
     */
  def createLabelingJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateLabelingJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateLabelingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateLabelingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
     */
  def createModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
     */
  def createModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
     */
  def createModel(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
     */
  def createModel(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def createModelPackage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelPackageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def createModelPackage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelPackageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelPackageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def createModelPackage(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelPackageInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelPackageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def createModelPackage(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelPackageInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelPackageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateModelPackageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
     */
  def createNotebookInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
     */
  def createNotebookInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
     */
  def createNotebookInstance(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
     */
  def createNotebookInstance(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
     */
  def createNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
     */
  def createNotebookInstanceLifecycleConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
     */
  def createNotebookInstanceLifecycleConfig(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
     */
  def createNotebookInstanceLifecycleConfig(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.
     */
  def createPresignedNotebookInstanceUrl(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreatePresignedNotebookInstanceUrlOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.
     */
  def createPresignedNotebookInstanceUrl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreatePresignedNotebookInstanceUrlOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreatePresignedNotebookInstanceUrlOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.
     */
  def createPresignedNotebookInstanceUrl(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreatePresignedNotebookInstanceUrlInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreatePresignedNotebookInstanceUrlOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.
     */
  def createPresignedNotebookInstanceUrl(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreatePresignedNotebookInstanceUrlInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreatePresignedNotebookInstanceUrlOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreatePresignedNotebookInstanceUrlOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a deep learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
     */
  def createTrainingJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a deep learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
     */
  def createTrainingJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a deep learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
     */
  def createTrainingJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTrainingJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a deep learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
     */
  def createTrainingJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTrainingJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
     */
  def createTransformJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
     */
  def createTransformJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
     */
  def createTransformJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTransformJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
     */
  def createTransformJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTransformJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
     */
  def createWorkteam(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
     */
  def createWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
     */
  def createWorkteam(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateWorkteamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
     */
  def createWorkteam(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.CreateWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified algorithm from your account.
     */
  def deleteAlgorithm(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified algorithm from your account.
     */
  def deleteAlgorithm(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified algorithm from your account.
     */
  def deleteAlgorithm(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteAlgorithmInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified algorithm from your account.
     */
  def deleteAlgorithm(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteAlgorithmInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified git repository from your account.
     */
  def deleteCodeRepository(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified git repository from your account.
     */
  def deleteCodeRepository(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified git repository from your account.
     */
  def deleteCodeRepository(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified git repository from your account.
     */
  def deleteCodeRepository(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteCodeRepositoryInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
     */
  def deleteEndpoint(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
     */
  def deleteEndpoint(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
     */
  def deleteEndpoint(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteEndpointInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
     */
  def deleteEndpoint(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteEndpointInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
     */
  def deleteEndpointConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
     */
  def deleteEndpointConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
     */
  def deleteEndpointConfig(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteEndpointConfigInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
     */
  def deleteEndpointConfig(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteEndpointConfigInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
     */
  def deleteModel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
     */
  def deleteModel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
     */
  def deleteModel(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteModelInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
     */
  def deleteModel(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteModelInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def deleteModelPackage(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def deleteModelPackage(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def deleteModelPackage(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteModelPackageInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def deleteModelPackage(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteModelPackageInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
     */
  def deleteNotebookInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
     */
  def deleteNotebookInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
     */
  def deleteNotebookInstance(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
     */
  def deleteNotebookInstance(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteNotebookInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a notebook instance lifecycle configuration.
     */
  def deleteNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a notebook instance lifecycle configuration.
     */
  def deleteNotebookInstanceLifecycleConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a notebook instance lifecycle configuration.
     */
  def deleteNotebookInstanceLifecycleConfig(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a notebook instance lifecycle configuration.
     */
  def deleteNotebookInstanceLifecycleConfig(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
     */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
     */
  def deleteTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
     */
  def deleteTags(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
     */
  def deleteTags(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing work team. This operation can't be undone.
     */
  def deleteWorkteam(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing work team. This operation can't be undone.
     */
  def deleteWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing work team. This operation can't be undone.
     */
  def deleteWorkteam(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteWorkteamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing work team. This operation can't be undone.
     */
  def deleteWorkteam(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DeleteWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the specified algorithm that is in your account.
     */
  def describeAlgorithm(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeAlgorithmOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the specified algorithm that is in your account.
     */
  def describeAlgorithm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeAlgorithmOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeAlgorithmOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the specified algorithm that is in your account.
     */
  def describeAlgorithm(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeAlgorithmInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeAlgorithmOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the specified algorithm that is in your account.
     */
  def describeAlgorithm(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeAlgorithmInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeAlgorithmOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeAlgorithmOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about the specified git repository.
     */
  def describeCodeRepository(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about the specified git repository.
     */
  def describeCodeRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about the specified git repository.
     */
  def describeCodeRepository(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about the specified git repository.
     */
  def describeCodeRepository(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCodeRepositoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
     */
  def describeCompilationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCompilationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
     */
  def describeCompilationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCompilationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCompilationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
     */
  def describeCompilationJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCompilationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCompilationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
     */
  def describeCompilationJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCompilationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCompilationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeCompilationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the description of an endpoint.
     */
  def describeEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the description of an endpoint.
     */
  def describeEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the description of an endpoint.
     */
  def describeEndpoint(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the description of an endpoint.
     */
  def describeEndpoint(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
     */
  def describeEndpointConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
     */
  def describeEndpointConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
     */
  def describeEndpointConfig(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointConfigInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
     */
  def describeEndpointConfig(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a description of a hyperparameter tuning job.
     */
  def describeHyperParameterTuningJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a description of a hyperparameter tuning job.
     */
  def describeHyperParameterTuningJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a description of a hyperparameter tuning job.
     */
  def describeHyperParameterTuningJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeHyperParameterTuningJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a description of a hyperparameter tuning job.
     */
  def describeHyperParameterTuningJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeHyperParameterTuningJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a labeling job.
     */
  def describeLabelingJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeLabelingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a labeling job.
     */
  def describeLabelingJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeLabelingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeLabelingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a labeling job.
     */
  def describeLabelingJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeLabelingJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeLabelingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a labeling job.
     */
  def describeLabelingJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeLabelingJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeLabelingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeLabelingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a model that you created using the CreateModel API.
     */
  def describeModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a model that you created using the CreateModel API.
     */
  def describeModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a model that you created using the CreateModel API.
     */
  def describeModel(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a model that you created using the CreateModel API.
     */
  def describeModel(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def describeModelPackage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelPackageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def describeModelPackage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelPackageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelPackageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def describeModelPackage(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelPackageInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelPackageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     */
  def describeModelPackage(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelPackageInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelPackageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeModelPackageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a notebook instance.
     */
  def describeNotebookInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a notebook instance.
     */
  def describeNotebookInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a notebook instance.
     */
  def describeNotebookInstance(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a notebook instance.
     */
  def describeNotebookInstance(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
     */
  def describeNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
     */
  def describeNotebookInstanceLifecycleConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
     */
  def describeNotebookInstanceLifecycleConfig(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
     */
  def describeNotebookInstanceLifecycleConfig(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
     */
  def describeSubscribedWorkteam(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeSubscribedWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
     */
  def describeSubscribedWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeSubscribedWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeSubscribedWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
     */
  def describeSubscribedWorkteam(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeSubscribedWorkteamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeSubscribedWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
     */
  def describeSubscribedWorkteam(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeSubscribedWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeSubscribedWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeSubscribedWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a training job.
     */
  def describeTrainingJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a training job.
     */
  def describeTrainingJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a training job.
     */
  def describeTrainingJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a training job.
     */
  def describeTrainingJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a transform job.
     */
  def describeTransformJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a transform job.
     */
  def describeTransformJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a transform job.
     */
  def describeTransformJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a transform job.
     */
  def describeTransformJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
     */
  def describeWorkteam(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
     */
  def describeWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
     */
  def describeWorkteam(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeWorkteamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
     */
  def describeWorkteam(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns suggestions for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
     */
  def getSearchSuggestions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.GetSearchSuggestionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns suggestions for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
     */
  def getSearchSuggestions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.GetSearchSuggestionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.GetSearchSuggestionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns suggestions for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
     */
  def getSearchSuggestions(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.GetSearchSuggestionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.GetSearchSuggestionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns suggestions for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
     */
  def getSearchSuggestions(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.GetSearchSuggestionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.GetSearchSuggestionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.GetSearchSuggestionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the machine learning algorithms that have been created.
     */
  def listAlgorithms(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListAlgorithmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the machine learning algorithms that have been created.
     */
  def listAlgorithms(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListAlgorithmsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListAlgorithmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the machine learning algorithms that have been created.
     */
  def listAlgorithms(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListAlgorithmsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListAlgorithmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the machine learning algorithms that have been created.
     */
  def listAlgorithms(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListAlgorithmsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListAlgorithmsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListAlgorithmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the git repositories in your account.
     */
  def listCodeRepositories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCodeRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the git repositories in your account.
     */
  def listCodeRepositories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCodeRepositoriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCodeRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the git repositories in your account.
     */
  def listCodeRepositories(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCodeRepositoriesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCodeRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the git repositories in your account.
     */
  def listCodeRepositories(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCodeRepositoriesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCodeRepositoriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCodeRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
     */
  def listCompilationJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCompilationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
     */
  def listCompilationJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCompilationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCompilationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
     */
  def listCompilationJobs(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCompilationJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCompilationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
     */
  def listCompilationJobs(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCompilationJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCompilationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListCompilationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists endpoint configurations.
     */
  def listEndpointConfigs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists endpoint configurations.
     */
  def listEndpointConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists endpoint configurations.
     */
  def listEndpointConfigs(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointConfigsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists endpoint configurations.
     */
  def listEndpointConfigs(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointConfigsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists endpoints.
     */
  def listEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists endpoints.
     */
  def listEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists endpoints.
     */
  def listEndpoints(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists endpoints.
     */
  def listEndpoints(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListEndpointsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
     */
  def listHyperParameterTuningJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListHyperParameterTuningJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
     */
  def listHyperParameterTuningJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListHyperParameterTuningJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListHyperParameterTuningJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
     */
  def listHyperParameterTuningJobs(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListHyperParameterTuningJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListHyperParameterTuningJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
     */
  def listHyperParameterTuningJobs(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListHyperParameterTuningJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListHyperParameterTuningJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListHyperParameterTuningJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of labeling jobs.
     */
  def listLabelingJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of labeling jobs.
     */
  def listLabelingJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of labeling jobs.
     */
  def listLabelingJobs(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of labeling jobs.
     */
  def listLabelingJobs(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of labeling jobs assigned to a specified work team.
     */
  def listLabelingJobsForWorkteam(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsForWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of labeling jobs assigned to a specified work team.
     */
  def listLabelingJobsForWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsForWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsForWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of labeling jobs assigned to a specified work team.
     */
  def listLabelingJobsForWorkteam(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsForWorkteamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsForWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of labeling jobs assigned to a specified work team.
     */
  def listLabelingJobsForWorkteam(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsForWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsForWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListLabelingJobsForWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the model packages that have been created.
     */
  def listModelPackages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelPackagesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the model packages that have been created.
     */
  def listModelPackages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelPackagesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelPackagesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the model packages that have been created.
     */
  def listModelPackages(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelPackagesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelPackagesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the model packages that have been created.
     */
  def listModelPackages(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelPackagesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelPackagesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelPackagesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists models created with the CreateModel API.
     */
  def listModels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists models created with the CreateModel API.
     */
  def listModels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists models created with the CreateModel API.
     */
  def listModels(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists models created with the CreateModel API.
     */
  def listModels(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
     */
  def listNotebookInstanceLifecycleConfigs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstanceLifecycleConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
     */
  def listNotebookInstanceLifecycleConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstanceLifecycleConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstanceLifecycleConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
     */
  def listNotebookInstanceLifecycleConfigs(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstanceLifecycleConfigsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstanceLifecycleConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
     */
  def listNotebookInstanceLifecycleConfigs(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstanceLifecycleConfigsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstanceLifecycleConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstanceLifecycleConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
     */
  def listNotebookInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
     */
  def listNotebookInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
     */
  def listNotebookInstances(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
     */
  def listNotebookInstances(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListNotebookInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
     */
  def listSubscribedWorkteams(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListSubscribedWorkteamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
     */
  def listSubscribedWorkteams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListSubscribedWorkteamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListSubscribedWorkteamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
     */
  def listSubscribedWorkteams(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListSubscribedWorkteamsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListSubscribedWorkteamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
     */
  def listSubscribedWorkteams(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListSubscribedWorkteamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListSubscribedWorkteamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListSubscribedWorkteamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the tags for the specified Amazon SageMaker resource.
     */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the tags for the specified Amazon SageMaker resource.
     */
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the tags for the specified Amazon SageMaker resource.
     */
  def listTags(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the tags for the specified Amazon SageMaker resource.
     */
  def listTags(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists training jobs.
     */
  def listTrainingJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists training jobs.
     */
  def listTrainingJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists training jobs.
     */
  def listTrainingJobs(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists training jobs.
     */
  def listTrainingJobs(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
     */
  def listTrainingJobsForHyperParameterTuningJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsForHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
     */
  def listTrainingJobsForHyperParameterTuningJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsForHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsForHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
     */
  def listTrainingJobsForHyperParameterTuningJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsForHyperParameterTuningJobRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsForHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
     */
  def listTrainingJobsForHyperParameterTuningJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsForHyperParameterTuningJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsForHyperParameterTuningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTrainingJobsForHyperParameterTuningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists transform jobs.
     */
  def listTransformJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTransformJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists transform jobs.
     */
  def listTransformJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTransformJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTransformJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists transform jobs.
     */
  def listTransformJobs(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTransformJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTransformJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists transform jobs.
     */
  def listTransformJobs(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTransformJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTransformJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListTransformJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
     */
  def listWorkteams(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListWorkteamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
     */
  def listWorkteams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListWorkteamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListWorkteamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
     */
  def listWorkteams(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListWorkteamsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListWorkteamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
     */
  def listWorkteams(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListWorkteamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListWorkteamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.ListWorkteamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Renders the UI template so that you can preview the worker's experience. 
     */
  def renderUiTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.RenderUiTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Renders the UI template so that you can preview the worker's experience. 
     */
  def renderUiTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.RenderUiTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.RenderUiTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Renders the UI template so that you can preview the worker's experience. 
     */
  def renderUiTemplate(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.RenderUiTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.RenderUiTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Renders the UI template so that you can preview the worker's experience. 
     */
  def renderUiTemplate(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.RenderUiTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.RenderUiTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.RenderUiTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. The search results can be sorted by any resrouce property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
     */
  def search(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.SearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. The search results can be sorted by any resrouce property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
     */
  def search(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.SearchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.SearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. The search results can be sorted by any resrouce property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
     */
  def search(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.SearchRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.SearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. The search results can be sorted by any resrouce property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
     */
  def search(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.SearchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.SearchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.SearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
     */
  def startNotebookInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
     */
  def startNotebookInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
     */
  def startNotebookInstance(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StartNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
     */
  def startNotebookInstance(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StartNotebookInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn’t stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
     */
  def stopCompilationJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn’t stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
     */
  def stopCompilationJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn’t stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
     */
  def stopCompilationJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopCompilationJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn’t stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
     */
  def stopCompilationJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopCompilationJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
     */
  def stopHyperParameterTuningJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
     */
  def stopHyperParameterTuningJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
     */
  def stopHyperParameterTuningJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopHyperParameterTuningJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
     */
  def stopHyperParameterTuningJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopHyperParameterTuningJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
     */
  def stopLabelingJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
     */
  def stopLabelingJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
     */
  def stopLabelingJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopLabelingJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
     */
  def stopLabelingJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopLabelingJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume.  To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
     */
  def stopNotebookInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume.  To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
     */
  def stopNotebookInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume.  To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
     */
  def stopNotebookInstance(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume.  To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
     */
  def stopNotebookInstance(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopNotebookInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  Training algorithms provided by Amazon SageMaker save the intermediate results of a model training job. This intermediate data is a valid model artifact. You can use the model artifacts that are saved when Amazon SageMaker stops a training job to create a model.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
     */
  def stopTrainingJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  Training algorithms provided by Amazon SageMaker save the intermediate results of a model training job. This intermediate data is a valid model artifact. You can use the model artifacts that are saved when Amazon SageMaker stops a training job to create a model.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
     */
  def stopTrainingJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  Training algorithms provided by Amazon SageMaker save the intermediate results of a model training job. This intermediate data is a valid model artifact. You can use the model artifacts that are saved when Amazon SageMaker stops a training job to create a model.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
     */
  def stopTrainingJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopTrainingJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  Training algorithms provided by Amazon SageMaker save the intermediate results of a model training job. This intermediate data is a valid model artifact. You can use the model artifacts that are saved when Amazon SageMaker stops a training job to create a model.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
     */
  def stopTrainingJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopTrainingJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
     */
  def stopTransformJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
     */
  def stopTransformJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
     */
  def stopTransformJob(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopTransformJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
     */
  def stopTransformJob(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.StopTransformJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified git repository with the specified values.
     */
  def updateCodeRepository(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified git repository with the specified values.
     */
  def updateCodeRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified git repository with the specified values.
     */
  def updateCodeRepository(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified git repository with the specified values.
     */
  def updateCodeRepository(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateCodeRepositoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateCodeRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateCodeRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
     */
  def updateEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
     */
  def updateEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
     */
  def updateEndpoint(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
     */
  def updateEndpoint(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
     */
  def updateEndpointWeightsAndCapacities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointWeightsAndCapacitiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
     */
  def updateEndpointWeightsAndCapacities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointWeightsAndCapacitiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointWeightsAndCapacitiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
     */
  def updateEndpointWeightsAndCapacities(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointWeightsAndCapacitiesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointWeightsAndCapacitiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
     */
  def updateEndpointWeightsAndCapacities(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointWeightsAndCapacitiesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointWeightsAndCapacitiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateEndpointWeightsAndCapacitiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC security groups.
     */
  def updateNotebookInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC security groups.
     */
  def updateNotebookInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC security groups.
     */
  def updateNotebookInstance(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC security groups.
     */
  def updateNotebookInstance(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
     */
  def updateNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
     */
  def updateNotebookInstanceLifecycleConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
     */
  def updateNotebookInstanceLifecycleConfig(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
     */
  def updateNotebookInstanceLifecycleConfig(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceLifecycleConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateNotebookInstanceLifecycleConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing work team with new member definitions or description.
     */
  def updateWorkteam(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing work team with new member definitions or description.
     */
  def updateWorkteam(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing work team with new member definitions or description.
     */
  def updateWorkteam(params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateWorkteamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing work team with new member definitions or description.
     */
  def updateWorkteam(
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateWorkteamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateWorkteamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.UpdateWorkteamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
     */
  @JSName("waitFor")
  def waitFor_endpointInService(state: awsDashSdkLib.awsDashSdkLibStrings.endpointInService): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
     */
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointInService,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
     */
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointInService,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
     */
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.endpointInService,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceDeleted,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceDeleted,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceInService): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceInService,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceInService,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceInService,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceStopped): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceStopped,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.notebookInstanceStopped,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeNotebookInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
     */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(state: awsDashSdkLib.awsDashSdkLibStrings.trainingJobCompletedOrStopped): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
     */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.trainingJobCompletedOrStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
     */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.trainingJobCompletedOrStopped,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
     */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.trainingJobCompletedOrStopped,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTrainingJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(state: awsDashSdkLib.awsDashSdkLibStrings.transformJobCompletedOrStopped): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.transformJobCompletedOrStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.transformJobCompletedOrStopped,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
     */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.transformJobCompletedOrStopped,
    params: awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerMod.SageMakerNs.DescribeTransformJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

