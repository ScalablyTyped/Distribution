package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/sagemaker", "SageMaker")
@js.native
object SageMakerNs extends js.Object {
  
  trait AddTagsInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource that you want to tag.
         */
    var ResourceArn: ResourceArn
    /**
         * An array of Tag objects. Each tag is a key-value pair. Only the key parameter is required. If you don't specify a value, Amazon SageMaker sets the value to an empty string. 
         */
    var Tags: TagList
  }
  
  
  trait AddTagsOutput extends js.Object {
    /**
         * A list of tags associated with the Amazon SageMaker resource.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait AlgorithmSpecification extends js.Object {
    /**
         * The name of the algorithm resource to use for the training job. This must be an algorithm resource that you created or subscribe to on AWS Marketplace. If you specify a value for this parameter, you can't specify a value for TrainingImage.
         */
    var AlgorithmName: js.UndefOr[ArnOrName] = js.undefined
    /**
         * A list of metric definition objects. Each object specifies the metric name and regular expressions used to parse algorithm logs. Amazon SageMaker publishes each metric to Amazon CloudWatch.
         */
    var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined
    /**
         * The registry path of the Docker image that contains the training algorithm. For information about docker registry paths for built-in algorithms, see Algorithms Provided by Amazon SageMaker: Common Parameters.
         */
    var TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined
    /**
         * The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support, see Algorithms. If an algorithm supports the File input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an algorithm supports the Pipe input mode, Amazon SageMaker streams data directly from S3 to the container.   In File mode, make sure you provision ML storage volume with sufficient capacity to accommodate the data download from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm container use ML storage volume to also store intermediate information, if any.   For distributed algorithms using File mode, training data is distributed uniformly, and your training duration is predictable if the input data objects size is approximately same. Amazon SageMaker does not split the files any further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is also skewed where one host in a training cluster is overloaded, thus becoming bottleneck in training. 
         */
    var TrainingInputMode: TrainingInputMode
  }
  
  
  trait AlgorithmStatusDetails extends js.Object {
    /**
         * The status of the scan of the algorithm's Docker image container.
         */
    var ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined
    /**
         * The status of the validation of the algorithm.
         */
    var ValidationStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined
  }
  
  
  trait AlgorithmStatusItem extends js.Object {
    /**
         * The reason for failure, if the overall status is a failed state.
         */
    var FailureReason: js.UndefOr[String] = js.undefined
    /**
         * The name of the algorithm for which the overall status is being repoorted.
         */
    var Name: EntityName
    /**
         * The current status.
         */
    var Status: DetailedAlgorithmStatus
  }
  
  
  trait AlgorithmSummary extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the algorithm.
         */
    var AlgorithmArn: AlgorithmArn
    /**
         * A brief statement describing the algorithm.
         */
    var AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined
    /**
         * The name of the algorithm which is described by the summary.
         */
    var AlgorithmName: EntityName
    /**
         * The overall status of the algorithm.
         */
    var AlgorithmStatus: AlgorithmStatus
    /**
         * A timestamp that shows when the algorithm was created.
         */
    var CreationTime: CreationTime
  }
  
  
  trait AlgorithmValidationProfile extends js.Object {
    /**
         * The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
         */
    var ProfileName: EntityName
    /**
         * The TrainingJobDefinition object that describes the training job that Amazon SageMaker runs to validate your algorithm.
         */
    var TrainingJobDefinition: TrainingJobDefinition
    /**
         * The TransformJobDefinition object that describes the transform job that Amazon SageMaker runs to validate your algorithm.
         */
    var TransformJobDefinition: js.UndefOr[TransformJobDefinition] = js.undefined
  }
  
  
  trait AlgorithmValidationSpecification extends js.Object {
    /**
         * An array of AlgorithmValidationProfile objects, each of which specifies a training job and batch transform job that Amazon SageMaker runs to validate your algorithm.
         */
    var ValidationProfiles: AlgorithmValidationProfiles
    /**
         * The IAM roles that Amazon SageMaker uses to run the training jobs.
         */
    var ValidationRole: RoleArn
  }
  
  
  trait AnnotationConsolidationConfig extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of a Lambda function implements the logic for annotation consolidation. Amazon SageMaker Ground Truth provides three annotation consolidation functions that you can choose to use. They are:    Bounding box - Finds the most similar boxes from different workers based on the Jaccard index of the boxes.  arn:aws:lambda:region:432418664414:function:ACS-BoundingBox     Image classification - Uses a variant of the Expectation Maximization approach to estimate the true class of an image based on annotations from individual workers.  arn:aws:lambda:region:432418664414:function:ACS-ImageMultiClass     Text classification - Uses a variant of the Expectation Maximization approach to estimate the true class of text based on annotations from individual workers.  arn:aws:lambda:region:432418664414:function:ACS-TextMultiClass    For more information, see Annotation Consolidation.
         */
    var AnnotationConsolidationLambdaArn: LambdaFunctionArn
  }
  
  
  trait CategoricalParameterRange extends js.Object {
    /**
         * The name of the categorical hyperparameter to tune.
         */
    var Name: ParameterKey
    /**
         * A list of the categories for the hyperparameter.
         */
    var Values: ParameterValues
  }
  
  
  trait CategoricalParameterRangeSpecification extends js.Object {
    /**
         * The allowed categories for the hyperparameter.
         */
    var Values: ParameterValues
  }
  
  
  trait Channel extends js.Object {
    /**
         * The name of the channel. 
         */
    var ChannelName: ChannelName
    /**
         * If training data is compressed, the compression type. The default value is None. CompressionType is used only in Pipe input mode. In File mode, leave this field unset or set it to None.
         */
    var CompressionType: js.UndefOr[CompressionType] = js.undefined
    /**
         * The MIME type of the data.
         */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
         * The location of the channel data.
         */
    var DataSource: DataSource
    /**
         * (Optional) The input mode to use for the data channel in a training job. If you don't set a value for InputMode, Amazon SageMaker uses the value set for TrainingInputMode. Use this parameter to override the TrainingInputMode setting in a AlgorithmSpecification request when you have a channel that needs a different input mode from the training job's general setting. To download the data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume, and mount the directory to a Docker volume, use File input mode. To stream data directly from Amazon S3 to the container, choose Pipe input mode. To use a model for incremental training, choose File input model.
         */
    var InputMode: js.UndefOr[TrainingInputMode] = js.undefined
    /**
         *  Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is already in RecordIO format, you don't need to set this attribute. For more information, see Create a Dataset Using RecordIO.  In File mode, leave this field unset or set it to None.
         */
    var RecordWrapperType: js.UndefOr[RecordWrapper] = js.undefined
    /**
         * A configuration for a shuffle option for input data in a channel. If you use S3Prefix for S3DataType, this shuffles the results of the S3 key prefix matches. If you use ManifestFile, the order of the S3 object references in the ManifestFile is shuffled. If you use AugmentedManifestFile, the order of the JSON lines in the AugmentedManifestFile is shuffled. The shuffling order is determined using the Seed value. For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that the order of the training data is different for each epoch, it helps reduce bias and possible overfitting. In a multi-node training job when ShuffleConfig is combined with S3DataDistributionType of ShardedByS3Key, the data is shuffled across nodes so that the content sent to a particular node on the first epoch might be sent to a different node on the second epoch.
         */
    var ShuffleConfig: js.UndefOr[ShuffleConfig] = js.undefined
  }
  
  
  trait ChannelSpecification extends js.Object {
    /**
         * A brief description of the channel.
         */
    var Description: js.UndefOr[EntityDescription] = js.undefined
    /**
         * Indicates whether the channel is required by the algorithm.
         */
    var IsRequired: js.UndefOr[Boolean] = js.undefined
    /**
         * The name of the channel./sagemaker/eia
         */
    var Name: ChannelName
    /**
         * The allowed compression types, if data compression is used.
         */
    var SupportedCompressionTypes: js.UndefOr[CompressionTypes] = js.undefined
    /**
         * The supported MIME types for the data.
         */
    var SupportedContentTypes: ContentTypes
    /**
         * The allowed input mode, either FILE or PIPE. In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
         */
    var SupportedInputModes: InputModes
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CodeRepositorySummary extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the git repository.
         */
    var CodeRepositoryArn: CodeRepositoryArn
    /**
         * The name of the git repository.
         */
    var CodeRepositoryName: EntityName
    /**
         * The date and time that the git repository was created.
         */
    var CreationTime: CreationTime
    /**
         * Configuration details for the git repository, including the URL where it is located and the ARN of the AWS Secrets Manager secret that contains the credentials used to access the repository.
         */
    var GitConfig: js.UndefOr[GitConfig] = js.undefined
    /**
         * The date and time that the git repository was last modified.
         */
    var LastModifiedTime: LastModifiedTime
  }
  
  
  trait CognitoMemberDefinition extends js.Object {
    /**
         * An identifier for an application client. You must create the app client ID using Amazon Cognito.
         */
    var ClientId: CognitoClientId
    /**
         * An identifier for a user group.
         */
    var UserGroup: CognitoUserGroup
    /**
         * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
         */
    var UserPool: CognitoUserPool
  }
  
  
  trait CompilationJobSummary extends js.Object {
    /**
         * The time when the model compilation job completed.
         */
    var CompilationEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the model compilation job.
         */
    var CompilationJobArn: CompilationJobArn
    /**
         * The name of the model compilation job that you want a summary for.
         */
    var CompilationJobName: EntityName
    /**
         * The status of the model compilation job.
         */
    var CompilationJobStatus: CompilationJobStatus
    /**
         * The type of device that the model will run on after compilation has completed.
         */
    var CompilationTargetDevice: TargetDevice
    /**
         * The time when the model compilation job was created.
         */
    var CreationTime: CreationTime
    /**
         * The time when the model compilation job was last modified.
         */
    var LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
  }
  
  
  trait ContainerDefinition extends js.Object {
    /**
         * The DNS host name for the container after Amazon SageMaker deploys it.
         */
    var ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined
    /**
         * The environment variables to set in the Docker container. Each key and value in the Environment string to string map can have length of up to 1024. We support up to 16 entries in the map. 
         */
    var Environment: js.UndefOr[EnvironmentMap] = js.undefined
    /**
         * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker 
         */
    var Image: js.UndefOr[Image] = js.undefined
    /**
         * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).  If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
         */
    var ModelDataUrl: js.UndefOr[Url] = js.undefined
    /**
         * The name of the model package in this container.
         */
    var ModelPackageName: js.UndefOr[ArnOrName] = js.undefined
  }
  
  
  trait ContinuousParameterRange extends js.Object {
    /**
         * The maximum value for the hyperparameter. The tuning job uses floating-point values between MinValue value and this value for tuning.
         */
    var MaxValue: ParameterValue
    /**
         * The minimum value for the hyperparameter. The tuning job uses floating-point values between this value and MaxValuefor tuning.
         */
    var MinValue: ParameterValue
    /**
         * The name of the continuous hyperparameter to tune.
         */
    var Name: ParameterKey
  }
  
  
  trait ContinuousParameterRangeSpecification extends js.Object {
    /**
         * The maximum floating-point value allowed.
         */
    var MaxValue: ParameterValue
    /**
         * The minimum floating-point value allowed.
         */
    var MinValue: ParameterValue
  }
  
  
  trait CreateAlgorithmInput extends js.Object {
    /**
         * A description of the algorithm.
         */
    var AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined
    /**
         * The name of the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
         */
    var AlgorithmName: EntityName
    /**
         * Whether to certify the algorithm so that it can be listed in AWS Marektplace.
         */
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined
    /**
         * Specifies details about inference jobs that the algorithm runs, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the algorithm supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the algorithm supports for inference.  
         */
    var InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined
    /**
         * Specifies details about training jobs run by this algorithm, including the following:   The Amazon ECR path of the container and the version digest of the algorithm.   The hyperparameters that the algorithm supports.   The instance types that the algorithm supports for training.   Whether the algorithm supports distributed training.   The metrics that the algorithm emits to Amazon CloudWatch.   Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.   The input channels that the algorithm supports for training data. For example, an algorithm might support train, validation, and test channels.  
         */
    var TrainingSpecification: TrainingSpecification
    /**
         * Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the algorithm's training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to test the algorithm's inference code.
         */
    var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined
  }
  
  
  trait CreateAlgorithmOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the new algorithm.
         */
    var AlgorithmArn: AlgorithmArn
  }
  
  
  trait CreateCodeRepositoryInput extends js.Object {
    /**
         * The name of the git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
         */
    var CodeRepositoryName: EntityName
    /**
         * Specifies details about the repository, including the URL where the repository is located, the default branch, and credentials to use to access the repository.
         */
    var GitConfig: GitConfig
  }
  
  
  trait CreateCodeRepositoryOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the new repository.
         */
    var CodeRepositoryArn: CodeRepositoryArn
  }
  
  
  trait CreateCompilationJobRequest extends js.Object {
    /**
         * A name for the model compilation job. The name must be unique within the AWS Region and within your AWS account. 
         */
    var CompilationJobName: EntityName
    /**
         * Provides information about the location of input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
         */
    var InputConfig: InputConfig
    /**
         * Provides information about the output location for the compiled model and the target device the model runs on.
         */
    var OutputConfig: OutputConfig
    /**
         * The Amazon Resource Name (ARN) of an IIAMAM role that enables Amazon SageMaker to perform tasks on your behalf.  During model compilation, Amazon SageMaker needs your permission to:   Read input data from an S3 bucket   Write model artifacts to an S3 bucket   Write logs to Amazon CloudWatch Logs   Publish metrics to Amazon CloudWatch   You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. For more information, see Amazon SageMaker Roles. 
         */
    var RoleArn: RoleArn
    /**
         * The duration allowed for model compilation.
         */
    var StoppingCondition: StoppingCondition
  }
  
  
  trait CreateCompilationJobResponse extends js.Object {
    /**
         * If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the following data in JSON format:    CompilationJobArn: The Amazon Resource Name (ARN) of the compiled job.  
         */
    var CompilationJobArn: CompilationJobArn
  }
  
  
  trait CreateEndpointConfigInput extends js.Object {
    /**
         * The name of the endpoint configuration. You specify this name in a CreateEndpoint request. 
         */
    var EndpointConfigName: EndpointConfigName
    /**
         * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
         */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
         * An array of ProductionVariant objects, one for each model that you want to host at this endpoint.
         */
    var ProductionVariants: ProductionVariantList
    /**
         * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateEndpointConfigOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the endpoint configuration. 
         */
    var EndpointConfigArn: EndpointConfigArn
  }
  
  
  trait CreateEndpointInput extends js.Object {
    /**
         * The name of an endpoint configuration. For more information, see CreateEndpointConfig. 
         */
    var EndpointConfigName: EndpointConfigName
    /**
         * The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
         */
    var EndpointName: EndpointName
    /**
         * An array of key-value pairs. For more information, see Using Cost Allocation Tagsin the AWS Billing and Cost Management User Guide. 
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateEndpointOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the endpoint.
         */
    var EndpointArn: EndpointArn
  }
  
  
  trait CreateHyperParameterTuningJobRequest extends js.Object {
    /**
         * The HyperParameterTuningJobConfig object that describes the tuning job, including the search strategy, the objective metric used to evaluate training jobs, ranges of parameters to search, and resource limits for the tuning job. For more information, see automatic-model-tuning 
         */
    var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
    /**
         * The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning job launches. The name must be unique within the same AWS account and AWS Region. The name must have { } to { } characters. Valid characters are a-z, A-Z, 0-9, and : + = @ _ % - (hyphen). The name is not case sensitive.
         */
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    /**
         * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by purpose, owner, or environment. For more information, see AWS Tagging Strategies. Tags that you specify for the tuning job are also added to all training jobs that the tuning job launches.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The HyperParameterTrainingJobDefinition object that describes the training jobs that this tuning job launches, including static hyperparameters, input data configuration, output data configuration, resource configuration, and stopping condition.
         */
    var TrainingJobDefinition: HyperParameterTrainingJobDefinition
    /**
         * Specifies configuration for starting the hyperparameter tuning job using one or more previous tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job. All training jobs launched by the new hyperparameter tuning job are evaluated by using the objective metric. If you specify IDENTICAL_DATA_AND_ALGORITHM as the WarmStartType for the warm start configuration, the training job that performs the best in the new tuning job is compared to the best training jobs from the parent tuning jobs. From these, the training job that performs the best as measured by the objective metric is returned as the overall best training job.  All training jobs launched by parent hyperparameter tuning jobs and the new hyperparameter tuning jobs count against the limit of training jobs for the tuning job. 
         */
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined
  }
  
  
  trait CreateHyperParameterTuningJobResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter tuning job when you create it.
         */
    var HyperParameterTuningJobArn: HyperParameterTuningJobArn
  }
  
  
  trait CreateLabelingJobRequest extends js.Object {
    /**
         * Configures the information required for human workers to complete a labeling task.
         */
    var HumanTaskConfig: HumanTaskConfig
    /**
         * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the manifest file that describes the data objects.
         */
    var InputConfig: LabelingJobInputConfig
    /**
         * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair formed with the label that a worker assigns to the object. The name can't end with "-metadata" or "-ref".
         */
    var LabelAttributeName: LabelAttributeName
    /**
         * The S3 URL of the file that defines the categories used to label the data objects.
         */
    var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined
    /**
         * Configures the information required to perform automated data labeling.
         */
    var LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig] = js.undefined
    /**
         * The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
         */
    var LabelingJobName: LabelingJobName
    /**
         * The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the output data, if any.
         */
    var OutputConfig: LabelingJobOutputConfig
    /**
         * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete data labeling.
         */
    var RoleArn: RoleArn
    /**
         * A set of conditions for stopping the labeling job. If any of the conditions are met, the job is automatically stopped. You can use these conditions to control the cost of data labeling.
         */
    var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined
    /**
         * An array of key/value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateLabelingJobResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to identify the labeling job.
         */
    var LabelingJobArn: LabelingJobArn
  }
  
  
  trait CreateModelInput extends js.Object {
    /**
         * Specifies the containers in the inference pipeline.
         */
    var Containers: js.UndefOr[ContainerDefinitionList] = js.undefined
    /**
         * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.  The Semantic Segmentation built-in algorithm does not support network isolation. 
         */
    var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML compute instances is part of model hosting. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
         */
    var ExecutionRoleArn: RoleArn
    /**
         * The name of the new model.
         */
    var ModelName: ModelName
    /**
         * The location of the primary docker image containing inference code, associated artifacts, and custom environment map that the inference code uses when the model is deployed for predictions. 
         */
    var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined
    /**
         * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A VpcConfig object that specifies the VPC that you want your model to connect to. Control access to and from your model container by configuring the VPC. VpcConfig is used in hosting services and in batch transform. For more information, see Protect Endpoints by Using an Amazon Virtual Private Cloud and Protect Data in Batch Transform Jobs by Using an Amazon Virtual Private Cloud.
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait CreateModelOutput extends js.Object {
    /**
         * The ARN of the model created in Amazon SageMaker.
         */
    var ModelArn: ModelArn
  }
  
  
  trait CreateModelPackageInput extends js.Object {
    /**
         * Whether to certify the model package for listing on AWS Marketplace.
         */
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined
    /**
         * Specifies details about inference jobs that can be run with models based on this model package, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the model package supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the model package supports for inference.  
         */
    var InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined
    /**
         * A description of the model package.
         */
    var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
    /**
         * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
         */
    var ModelPackageName: EntityName
    /**
         * Details about the algorithm that was used to create the model package.
         */
    var SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined
    /**
         * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
         */
    var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
  }
  
  
  trait CreateModelPackageOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the new model package.
         */
    var ModelPackageArn: ModelPackageArn
  }
  
  
  trait CreateNotebookInstanceInput extends js.Object {
    /**
         * A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only one instance type can be associated with a notebook intance. For more information, see Using Elastic Inference in Amazon SageMaker.
         */
    var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined
    /**
         * An array of up to 3 git repositories to associate with the notebook instance. These can be either the names of git repositories stored as resources in your account, or the URL of git repositories in AWS CodeCommit or in any other git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
         */
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined
    /**
         * A git repository to associate with the notebook instance as its default code repository. This can be either the name of a git repository stored as a resource in your account, or the URL of a git repository in AWS CodeCommit or in any other git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
         */
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
    /**
         * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to Disabled this notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC. For more information, see Notebook Instances Are Internet-Enabled by Default. You can set the value of this parameter to Disabled only if you set a value for the SubnetId parameter.
         */
    var DirectInternetAccess: js.UndefOr[DirectInternetAccess] = js.undefined
    /**
         * The type of ML compute instance to launch for the notebook instance.
         */
    var InstanceType: InstanceType
    /**
         *  If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that is attached to your notebook instance. 
         */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
         * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
         */
    var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
    /**
         * The name of the new notebook instance.
         */
    var NotebookInstanceName: NotebookInstanceName
    /**
         *  When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can perform these tasks. The policy must allow the Amazon SageMaker service principal (sagemaker.amazonaws.com) permissions to assume this role. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
         */
    var RoleArn: RoleArn
    /**
         * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in the subnet. 
         */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    /**
         * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute instance. 
         */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
    /**
         * A list of tags to associate with the notebook instance. You can add tags later by using the CreateTags API.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
         */
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
  }
  
  
  trait CreateNotebookInstanceLifecycleConfigInput extends js.Object {
    /**
         * The name of the lifecycle configuration.
         */
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    /**
         * A shell script that runs only once, when you create a notebook instance. The shell script must be a base64-encoded string.
         */
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
    /**
         * A shell script that runs every time you start a notebook instance, including when you create the notebook instance. The shell script must be a base64-encoded string.
         */
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
  }
  
  
  trait CreateNotebookInstanceLifecycleConfigOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the lifecycle configuration.
         */
    var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn] = js.undefined
  }
  
  
  trait CreateNotebookInstanceOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the notebook instance. 
         */
    var NotebookInstanceArn: js.UndefOr[NotebookInstanceArn] = js.undefined
  }
  
  
  trait CreatePresignedNotebookInstanceUrlInput extends js.Object {
    /**
         * The name of the notebook instance.
         */
    var NotebookInstanceName: NotebookInstanceName
    /**
         * The duration of the session, in seconds. The default is 12 hours.
         */
    var SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds] = js.undefined
  }
  
  
  trait CreatePresignedNotebookInstanceUrlOutput extends js.Object {
    /**
         * A JSON object that contains the URL string. 
         */
    var AuthorizedUrl: js.UndefOr[NotebookInstanceUrl] = js.undefined
  }
  
  
  trait CreateTrainingJobRequest extends js.Object {
    /**
         * The registry path of the Docker image that contains the training algorithm and algorithm-specific metadata, including the input mode. For more information about algorithms provided by Amazon SageMaker, see Algorithms. For information about providing your own algorithms, see Using Your Own Algorithms with Amazon SageMaker. 
         */
    var AlgorithmSpecification: AlgorithmSpecification
    /**
         * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers within a training cluster for distributed training. If network isolation is used for training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the specifed VPC, but the training container does not have network access.  The Semantic Segmentation built-in algorithm does not support network isolation. 
         */
    var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
    /**
         * Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you start the learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.  You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and value is limited to 256 characters, as specified by the Length Constraint. 
         */
    var HyperParameters: js.UndefOr[HyperParameters] = js.undefined
    /**
         * An array of Channel objects. Each channel is a named input source. InputDataConfig describes the input data and its location.  Algorithms can accept input data from one or more channels. For example, an algorithm might have two channels of input data, training_data and validation_data. The configuration for each channel provides the S3 location where the input data is stored. It also provides information about the stored data: the MIME type, compression method, and whether the data is wrapped in RecordIO format.  Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files from an S3 bucket to a local directory in the Docker container, or makes it available as input streams. 
         */
    var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
    /**
         * Specifies the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts. 
         */
    var OutputDataConfig: OutputDataConfig
    /**
         * The resources, including the ML compute instances and ML storage volumes, to use for model training.  ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML storage volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the training data, choose File as the TrainingInputMode in the algorithm specification. For distributed training algorithms, specify an instance count greater than 1.
         */
    var ResourceConfig: ResourceConfig
    /**
         * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform tasks on your behalf.  During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket, download a Docker image that contains training code, write model artifacts to an S3 bucket, write logs to Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these tasks to an IAM role. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
         */
    var RoleArn: RoleArn
    /**
         * Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.  When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided by Amazon SageMaker save the intermediate results of the job. This intermediate data is a valid model artifact. You can use it to create a model using the CreateModel API. 
         */
    var StoppingCondition: StoppingCondition
    /**
         * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The name of the training job. The name must be unique within an AWS Region in an AWS account. 
         */
    var TrainingJobName: TrainingJobName
    /**
         * A VpcConfig object that specifies the VPC that you want your training job to connect to. Control access to and from your training container by configuring the VPC. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait CreateTrainingJobResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the training job.
         */
    var TrainingJobArn: TrainingJobArn
  }
  
  
  trait CreateTransformJobRequest extends js.Object {
    /**
         * Determines the number of records included in a single mini-batch. SingleRecord means only one record is used per mini-batch. MultiRecord means a mini-batch is set to contain as many records that can fit within the MaxPayloadInMB limit. Batch transform will automatically split your input data into whatever payload size is specified if you set SplitType to Line and BatchStrategy to MultiRecord. There's no need to split the dataset into smaller files or to use larger payload sizes unless the records in your dataset are very large.
         */
    var BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined
    /**
         * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
         */
    var Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined
    /**
         * The maximum number of parallel requests that can be sent to each instance in a transform job. This is good for algorithms that implement multiple workers on larger instances . The default value is 1. To allow Amazon SageMaker to determine the appropriate number for MaxConcurrentTransforms, set the value to 0.
         */
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined
    /**
         * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata). The value in MaxPayloadInMB must be greater or equal to the size of a single record. You can approximate the size of a record by dividing the size of your dataset by the number of records. Then multiply this value by the number of records you want in a mini-batch. We recommend to enter a slightly larger value than this to ensure the records fit within the maximum payload size. The default value is 6 MB.  For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value to 0. This feature only works in supported algorithms. Currently, Amazon SageMaker built-in algorithms do not support this feature.
         */
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined
    /**
         * The name of the model that you want to use for the transform job. ModelName must be the name of an existing Amazon SageMaker model within an AWS Region in an AWS account.
         */
    var ModelName: ModelName
    /**
         * An array of key-value pairs. Adding tags is optional. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * Describes the input source and the way the transform job consumes it.
         */
    var TransformInput: TransformInput
    /**
         * The name of the transform job. The name must be unique within an AWS Region in an AWS account. 
         */
    var TransformJobName: TransformJobName
    /**
         * Describes the results of the transform job.
         */
    var TransformOutput: TransformOutput
    /**
         * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
         */
    var TransformResources: TransformResources
  }
  
  
  trait CreateTransformJobResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the transform job.
         */
    var TransformJobArn: TransformJobArn
  }
  
  
  trait CreateWorkteamRequest extends js.Object {
    /**
         * A description of the work team.
         */
    var Description: String200
    /**
         * A list of MemberDefinition objects that contains objects that identify the Amazon Cognito user pool that makes up the work team. For more information, see Amazon Cognito User Pools. All of the CognitoMemberDefinition objects that make up the member definition must have the same ClientId and UserPool values.
         */
    var MemberDefinitions: MemberDefinitions
    /**
         * 
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The name of the work team. Use this name to identify the work team.
         */
    var WorkteamName: WorkteamName
  }
  
  
  trait CreateWorkteamResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
         */
    var WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined
  }
  
  
  trait DataSource extends js.Object {
    /**
         * The S3 location of the data source that is associated with a channel.
         */
    var S3DataSource: S3DataSource
  }
  
  
  trait DeleteAlgorithmInput extends js.Object {
    /**
         * The name of the algorithm to delete.
         */
    var AlgorithmName: EntityName
  }
  
  
  trait DeleteCodeRepositoryInput extends js.Object {
    /**
         * The name of the git repository to delete.
         */
    var CodeRepositoryName: EntityName
  }
  
  
  trait DeleteEndpointConfigInput extends js.Object {
    /**
         * The name of the endpoint configuration that you want to delete.
         */
    var EndpointConfigName: EndpointConfigName
  }
  
  
  trait DeleteEndpointInput extends js.Object {
    /**
         * The name of the endpoint that you want to delete.
         */
    var EndpointName: EndpointName
  }
  
  
  trait DeleteModelInput extends js.Object {
    /**
         * The name of the model to delete.
         */
    var ModelName: ModelName
  }
  
  
  trait DeleteModelPackageInput extends js.Object {
    /**
         * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
         */
    var ModelPackageName: EntityName
  }
  
  
  trait DeleteNotebookInstanceInput extends js.Object {
    /**
         * The name of the Amazon SageMaker notebook instance to delete.
         */
    var NotebookInstanceName: NotebookInstanceName
  }
  
  
  trait DeleteNotebookInstanceLifecycleConfigInput extends js.Object {
    /**
         * The name of the lifecycle configuration to delete.
         */
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  }
  
  
  trait DeleteTagsInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource whose tags you want to delete.
         */
    var ResourceArn: ResourceArn
    /**
         * An array or one or more tag keys to delete.
         */
    var TagKeys: TagKeyList
  }
  
  
  trait DeleteTagsOutput extends js.Object
  
  
  trait DeleteWorkteamRequest extends js.Object {
    /**
         * The name of the work team to delete.
         */
    var WorkteamName: WorkteamName
  }
  
  
  trait DeleteWorkteamResponse extends js.Object {
    /**
         * Returns true if the work team was successfully deleted; otherwise, returns false.
         */
    var Success: Success
  }
  
  
  trait DeployedImage extends js.Object {
    /**
         * The date and time when the image path for the model resolved to the ResolvedImage 
         */
    var ResolutionTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The specific digest path of the image hosted in this ProductionVariant.
         */
    var ResolvedImage: js.UndefOr[Image] = js.undefined
    /**
         * The image path you specified when you created the model.
         */
    var SpecifiedImage: js.UndefOr[Image] = js.undefined
  }
  
  
  trait DescribeAlgorithmInput extends js.Object {
    /**
         * The name of the algorithm to describe.
         */
    var AlgorithmName: ArnOrName
  }
  
  
  trait DescribeAlgorithmOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the algorithm.&gt;
         */
    var AlgorithmArn: AlgorithmArn
    /**
         * A brief summary about the algorithm.
         */
    var AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined
    /**
         * The name of the algorithm being described.
         */
    var AlgorithmName: EntityName
    /**
         * The current status of the algorithm.
         */
    var AlgorithmStatus: AlgorithmStatus
    /**
         * Details about the current status of the algorithm.
         */
    var AlgorithmStatusDetails: AlgorithmStatusDetails
    /**
         * Whether the algorithm is certified to be listed in AWS Marektplace.
         */
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined
    /**
         * A timestamp specifying when the algorithm was created.
         */
    var CreationTime: CreationTime
    /**
         * Details about inference jobs that the algorithm runs.
         */
    var InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined
    /**
         * The product identifier of the algorithm.
         */
    var ProductId: js.UndefOr[ProductId] = js.undefined
    /**
         * Details about training jobs run by this algorithm.
         */
    var TrainingSpecification: TrainingSpecification
    /**
         * Details about configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
         */
    var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined
  }
  
  
  trait DescribeCodeRepositoryInput extends js.Object {
    /**
         * The name of the git repository to describe.
         */
    var CodeRepositoryName: EntityName
  }
  
  
  trait DescribeCodeRepositoryOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the git repository.
         */
    var CodeRepositoryArn: CodeRepositoryArn
    /**
         * The name of the git repository.
         */
    var CodeRepositoryName: EntityName
    /**
         * The date and time that the repository was created.
         */
    var CreationTime: CreationTime
    /**
         * Configuration details about the repository, including the URL where the repository is located, the default branch, and the Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the repository.
         */
    var GitConfig: js.UndefOr[GitConfig] = js.undefined
    /**
         * The date and time that the repository was last changed.
         */
    var LastModifiedTime: LastModifiedTime
  }
  
  
  trait DescribeCompilationJobRequest extends js.Object {
    /**
         * The name of the model compilation job that you want information about.
         */
    var CompilationJobName: EntityName
  }
  
  
  trait DescribeCompilationJobResponse extends js.Object {
    /**
         * The time when the model compilation job on a compilation job instance ended. For a successful or stopped job, this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon SageMaker detected that the job failed. 
         */
    var CompilationEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model compilation job.
         */
    var CompilationJobArn: CompilationJobArn
    /**
         * The name of the model compilation job.
         */
    var CompilationJobName: EntityName
    /**
         * The status of the model compilation job.
         */
    var CompilationJobStatus: CompilationJobStatus
    /**
         * The time when the model compilation job started the CompilationJob instances.  You are billed for the time between this timestamp and the timestamp in the DescribeCompilationJobResponse$CompilationEndTime field. In Amazon CloudWatch Logs, the start time might be later than this time. That's because it takes time to download the compilation job, which depends on the size of the compilation job container. 
         */
    var CompilationStartTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The time that the model compilation job was created.
         */
    var CreationTime: CreationTime
    /**
         * If a model compilation job failed, the reason it failed. 
         */
    var FailureReason: FailureReason
    /**
         * Information about the location in Amazon S3 of the input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
         */
    var InputConfig: InputConfig
    /**
         * The time that the status of the model compilation job was last modified.
         */
    var LastModifiedTime: LastModifiedTime
    /**
         * Information about the location in Amazon S3 that has been configured for storing the model artifacts used in the compilation job.
         */
    var ModelArtifacts: ModelArtifacts
    /**
         * Information about the output location for the compiled model and the target device that the model runs on.
         */
    var OutputConfig: OutputConfig
    /**
         * The Amazon Resource Name (ARN) of the model compilation job.
         */
    var RoleArn: RoleArn
    /**
         * The duration allowed for model compilation.
         */
    var StoppingCondition: StoppingCondition
  }
  
  
  trait DescribeEndpointConfigInput extends js.Object {
    /**
         * The name of the endpoint configuration.
         */
    var EndpointConfigName: EndpointConfigName
  }
  
  
  trait DescribeEndpointConfigOutput extends js.Object {
    /**
         * A timestamp that shows when the endpoint configuration was created.
         */
    var CreationTime: Timestamp
    /**
         * The Amazon Resource Name (ARN) of the endpoint configuration.
         */
    var EndpointConfigArn: EndpointConfigArn
    /**
         * Name of the Amazon SageMaker endpoint configuration.
         */
    var EndpointConfigName: EndpointConfigName
    /**
         * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance.
         */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
         * An array of ProductionVariant objects, one for each model that you want to host at this endpoint.
         */
    var ProductionVariants: ProductionVariantList
  }
  
  
  trait DescribeEndpointInput extends js.Object {
    /**
         * The name of the endpoint.
         */
    var EndpointName: EndpointName
  }
  
  
  trait DescribeEndpointOutput extends js.Object {
    /**
         * A timestamp that shows when the endpoint was created.
         */
    var CreationTime: Timestamp
    /**
         * The Amazon Resource Name (ARN) of the endpoint.
         */
    var EndpointArn: EndpointArn
    /**
         * The name of the endpoint configuration associated with this endpoint.
         */
    var EndpointConfigName: EndpointConfigName
    /**
         * Name of the endpoint.
         */
    var EndpointName: EndpointName
    /**
         * The status of the endpoint.    OutOfService: Endpoint is not available to take incoming requests.    Creating: CreateEndpoint is executing.    Updating: UpdateEndpoint or UpdateEndpointWeightsAndCapacities is executing.    SystemUpdating: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled until it has completed. This maintenance operation does not change any customer-specified values such as VPC config, KMS encryption, model, instance type, or instance count.    RollingBack: Endpoint fails to scale up or down or change its variant weight and is in the process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an InService status. This transitional status only applies to an endpoint that has autoscaling enabled and is undergoing variant weight or capacity changes as part of an UpdateEndpointWeightsAndCapacities call or when the UpdateEndpointWeightsAndCapacities operation is called explicitly.    InService: Endpoint is available to process incoming requests.    Deleting: DeleteEndpoint is executing.    Failed: Endpoint could not be created, updated, or re-scaled. Use DescribeEndpointOutput$FailureReason for information about the failure. DeleteEndpoint is the only operation that can be performed on a failed endpoint.  
         */
    var EndpointStatus: EndpointStatus
    /**
         * If the status of the endpoint is Failed, the reason why it failed. 
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * A timestamp that shows when the endpoint was last modified.
         */
    var LastModifiedTime: Timestamp
    /**
         *  An array of ProductionVariantSummary objects, one for each model hosted behind this endpoint. 
         */
    var ProductionVariants: js.UndefOr[ProductionVariantSummaryList] = js.undefined
  }
  
  
  trait DescribeHyperParameterTuningJobRequest extends js.Object {
    /**
         * The name of the tuning job to describe.
         */
    var HyperParameterTuningJobName: HyperParameterTuningJobName
  }
  
  
  trait DescribeHyperParameterTuningJobResponse extends js.Object {
    /**
         * A TrainingJobSummary object that describes the training job that completed with the best current HyperParameterTuningJobObjective.
         */
    var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined
    /**
         * The date and time that the tuning job started.
         */
    var CreationTime: Timestamp
    /**
         * If the tuning job failed, the reason it failed.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The date and time that the tuning job ended.
         */
    var HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the tuning job.
         */
    var HyperParameterTuningJobArn: HyperParameterTuningJobArn
    /**
         * The HyperParameterTuningJobConfig object that specifies the configuration of the tuning job.
         */
    var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
    /**
         * The name of the tuning job.
         */
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    /**
         * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
         */
    var HyperParameterTuningJobStatus: HyperParameterTuningJobStatus
    /**
         * The date and time that the status of the tuning job was modified. 
         */
    var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The ObjectiveStatusCounters object that specifies the number of training jobs, categorized by the status of their final objective metric, that this tuning job launched.
         */
    var ObjectiveStatusCounters: ObjectiveStatusCounters
    /**
         * If the hyperparameter tuning job is an warm start tuning job with a WarmStartType of IDENTICAL_DATA_AND_ALGORITHM, this is the TrainingJobSummary for the training job with the best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for the warm start tuning job.
         */
    var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined
    /**
         * The HyperParameterTrainingJobDefinition object that specifies the definition of the training jobs that this tuning job launches.
         */
    var TrainingJobDefinition: HyperParameterTrainingJobDefinition
    /**
         * The TrainingJobStatusCounters object that specifies the number of training jobs, categorized by status, that this tuning job launched.
         */
    var TrainingJobStatusCounters: TrainingJobStatusCounters
    /**
         * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job.
         */
    var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined
  }
  
  
  trait DescribeLabelingJobRequest extends js.Object {
    /**
         * The name of the labeling job to return information for.
         */
    var LabelingJobName: LabelingJobName
  }
  
  
  trait DescribeLabelingJobResponse extends js.Object {
    /**
         * The date and time that the labeling job was created.
         */
    var CreationTime: Timestamp
    /**
         * If the job failed, the reason that it failed. 
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * Configuration information required for human workers to complete a labeling task.
         */
    var HumanTaskConfig: HumanTaskConfig
    /**
         * Input configuration information for the labeling job, such as the Amazon S3 location of the data objects and the location of the manifest file that describes the data objects.
         */
    var InputConfig: LabelingJobInputConfig
    /**
         * A unique identifier for work done as part of a labeling job.
         */
    var JobReferenceCode: JobReferenceCode
    /**
         * The attribute used as the label in the output manifest file.
         */
    var LabelAttributeName: js.UndefOr[LabelAttributeName] = js.undefined
    /**
         * The S3 location of the JSON file that defines the categories used to label data objects.
         */
    var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined
    /**
         * Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by machine, the number of objects than couldn't be labeled, and the total number of objects labeled. 
         */
    var LabelCounters: LabelCounters
    /**
         * Configuration information for automated data labeling.
         */
    var LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the labeling job.
         */
    var LabelingJobArn: LabelingJobArn
    /**
         * The name assigned to the labeling job when it was created.
         */
    var LabelingJobName: LabelingJobName
    /**
         * The location of the output produced by the labeling job.
         */
    var LabelingJobOutput: js.UndefOr[LabelingJobOutput] = js.undefined
    /**
         * The processing status of the labeling job. 
         */
    var LabelingJobStatus: LabelingJobStatus
    /**
         * The date and time that the labeling job was last updated.
         */
    var LastModifiedTime: Timestamp
    /**
         * The location of the job's output data and the AWS Key Management Service key ID for the key used to encrypt the output data, if any.
         */
    var OutputConfig: LabelingJobOutputConfig
    /**
         * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data labeling.
         */
    var RoleArn: RoleArn
    /**
         * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped.
         */
    var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined
    /**
         * An array of key/value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait DescribeModelInput extends js.Object {
    /**
         * The name of the model.
         */
    var ModelName: ModelName
  }
  
  
  trait DescribeModelOutput extends js.Object {
    /**
         * The containers in the inference pipeline.
         */
    var Containers: js.UndefOr[ContainerDefinitionList] = js.undefined
    /**
         * A timestamp that shows when the model was created.
         */
    var CreationTime: Timestamp
    /**
         * If True, no inbound or outbound network calls can be made to or from the model container.  The Semantic Segmentation built-in algorithm does not support network isolation. 
         */
    var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
         */
    var ExecutionRoleArn: RoleArn
    /**
         * The Amazon Resource Name (ARN) of the model.
         */
    var ModelArn: ModelArn
    /**
         * Name of the Amazon SageMaker model.
         */
    var ModelName: ModelName
    /**
         * The location of the primary inference code, associated artifacts, and custom environment map that the inference code uses when it is deployed in production. 
         */
    var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined
    /**
         * A VpcConfig object that specifies the VPC that this model has access to. For more information, see Protect Endpoints by Using an Amazon Virtual Private Cloud 
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait DescribeModelPackageInput extends js.Object {
    /**
         * The name of the model package to describe.
         */
    var ModelPackageName: ArnOrName
  }
  
  
  trait DescribeModelPackageOutput extends js.Object {
    /**
         * Whether the model package is certified for listing on AWS Marketplace.
         */
    var CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined
    /**
         * A timestamp specifying when the model package was created.
         */
    var CreationTime: CreationTime
    /**
         * Details about inference jobs that can be run with models based on this model package.
         */
    var InferenceSpecification: js.UndefOr[InferenceSpecification] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the model package.
         */
    var ModelPackageArn: ModelPackageArn
    /**
         * A brief summary about the model package.
         */
    var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
    /**
         * The name of the model package being described.
         */
    var ModelPackageName: EntityName
    /**
         * The current status of the model package.
         */
    var ModelPackageStatus: ModelPackageStatus
    /**
         * Details about the current status of the model package.
         */
    var ModelPackageStatusDetails: ModelPackageStatusDetails
    /**
         * Details about the algorithm that was used to create the model package.
         */
    var SourceAlgorithmSpecification: js.UndefOr[SourceAlgorithmSpecification] = js.undefined
    /**
         * Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
         */
    var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
  }
  
  
  trait DescribeNotebookInstanceInput extends js.Object {
    /**
         * The name of the notebook instance that you want information about.
         */
    var NotebookInstanceName: NotebookInstanceName
  }
  
  
  trait DescribeNotebookInstanceLifecycleConfigInput extends js.Object {
    /**
         * The name of the lifecycle configuration to describe.
         */
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  }
  
  
  trait DescribeNotebookInstanceLifecycleConfigOutput extends js.Object {
    /**
         * A timestamp that tells when the lifecycle configuration was created.
         */
    var CreationTime: js.UndefOr[CreationTime] = js.undefined
    /**
         * A timestamp that tells when the lifecycle configuration was last modified.
         */
    var LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the lifecycle configuration.
         */
    var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn] = js.undefined
    /**
         * The name of the lifecycle configuration.
         */
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
    /**
         * The shell script that runs only once, when you create a notebook instance.
         */
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
    /**
         * The shell script that runs every time you start a notebook instance, including when you create the notebook instance.
         */
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
  }
  
  
  trait DescribeNotebookInstanceOutput extends js.Object {
    /**
         * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
         */
    var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined
    /**
         * An array of up to 3 git repositories associated with the notebook instance. These can be either the names of git repositories stored as resources in your account, or the URL of git repositories in AWS CodeCommit or in any other git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
         */
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined
    /**
         * A timestamp. Use this parameter to return the time when the notebook instance was created
         */
    var CreationTime: js.UndefOr[CreationTime] = js.undefined
    /**
         * The git repository associated with the notebook instance as its default code repository. This can be either the name of a git repository stored as a resource in your account, or the URL of a git repository in AWS CodeCommit or in any other git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
         */
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
    /**
         * Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set to Disabled, he notebook instance does not have internet access, and cannot connect to Amazon SageMaker training and endpoint services. For more information, see Notebook Instances Are Internet-Enabled by Default.
         */
    var DirectInternetAccess: js.UndefOr[DirectInternetAccess] = js.undefined
    /**
         * If status is failed, the reason it failed.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The type of ML compute instance running on the notebook instance.
         */
    var InstanceType: js.UndefOr[InstanceType] = js.undefined
    /**
         *  AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance. 
         */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
         * A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified. 
         */
    var LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         *  Network interface IDs that Amazon SageMaker created at the time of creating the instance. 
         */
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the notebook instance.
         */
    var NotebookInstanceArn: js.UndefOr[NotebookInstanceArn] = js.undefined
    /**
         * Returns the name of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance 
         */
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
    /**
         *  Name of the Amazon SageMaker notebook instance. 
         */
    var NotebookInstanceName: js.UndefOr[NotebookInstanceName] = js.undefined
    /**
         * The status of the notebook instance.
         */
    var NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus] = js.undefined
    /**
         *  Amazon Resource Name (ARN) of the IAM role associated with the instance. 
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         * The IDs of the VPC security groups.
         */
    var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.undefined
    /**
         * The ID of the VPC subnet.
         */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
    /**
         * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance. 
         */
    var Url: js.UndefOr[NotebookInstanceUrl] = js.undefined
    /**
         * The size, in GB, of the ML storage volume attached to the notebook instance.
         */
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
  }
  
  
  trait DescribeSubscribedWorkteamRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the subscribed work team to describe.
         */
    var WorkteamArn: WorkteamArn
  }
  
  
  trait DescribeSubscribedWorkteamResponse extends js.Object {
    /**
         * A Workteam instance that contains information about the work team.
         */
    var SubscribedWorkteam: SubscribedWorkteam
  }
  
  
  trait DescribeTrainingJobRequest extends js.Object {
    /**
         * The name of the training job.
         */
    var TrainingJobName: TrainingJobName
  }
  
  
  trait DescribeTrainingJobResponse extends js.Object {
    /**
         * Information about the algorithm used for training, and algorithm metadata. 
         */
    var AlgorithmSpecification: AlgorithmSpecification
    /**
         * A timestamp that indicates when the training job was created.
         */
    var CreationTime: Timestamp
    /**
         * If True, inbound or outbound network calls can be made, except for calls between peers within a training cluster for distributed training. If network isolation is used for training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the specifed VPC, but the training container does not have network access.  The Semantic Segmentation built-in algorithm does not support network isolation. 
         */
    var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
    /**
         * If the training job failed, the reason it failed. 
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * A collection of MetricData objects that specify the names, values, and dates and times that the training algorithm emitted to Amazon CloudWatch.
         */
    var FinalMetricDataList: js.UndefOr[FinalMetricDataList] = js.undefined
    /**
         * Algorithm-specific parameters. 
         */
    var HyperParameters: js.UndefOr[HyperParameters] = js.undefined
    /**
         * An array of Channel objects that describes each data input channel. 
         */
    var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or training job.
         */
    var LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined
    /**
         * A timestamp that indicates when the status of the training job was last modified.
         */
    var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Information about the Amazon S3 location that is configured for storing model artifacts. 
         */
    var ModelArtifacts: ModelArtifacts
    /**
         * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates subfolders for model artifacts. 
         */
    var OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
    /**
         * Resources, including ML compute instances and ML storage volumes, that are configured for model training. 
         */
    var ResourceConfig: ResourceConfig
    /**
         * The AWS Identity and Access Management (IAM) role configured for the training job. 
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         *  Provides detailed information about the state of the training job. For detailed information on the secondary status of the training job, see StatusMessage under SecondaryStatusTransition. Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:  InProgress     Starting - Starting the training job.    Downloading - An optional stage for algorithms that support File training input mode. It indicates that data is being downloaded to the ML storage volumes.    Training - Training is in progress.    Uploading - Training is complete and the model artifacts are being uploaded to the S3 location.    Completed     Completed - The training job has completed.    Failed     Failed - The training job has failed. The reason for the failure is returned in the FailureReason field of DescribeTrainingJobResponse.    Stopped     MaxRuntimeExceeded - The job stopped because it exceeded the maximum allowed runtime.    Stopped - The training job has stopped.    Stopping     Stopping - Stopping the training job.      Valid values for SecondaryStatus are subject to change.   We no longer support the following secondary statuses:    LaunchingMLInstances     PreparingTrainingStack     DownloadingTrainingImage   
         */
    var SecondaryStatus: SecondaryStatus
    /**
         * A history of all of the secondary statuses that the training job has transitioned through.
         */
    var SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions] = js.undefined
    /**
         * The condition under which to stop the training job. 
         */
    var StoppingCondition: StoppingCondition
    /**
         * Indicates the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job failure.
         */
    var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the training job.
         */
    var TrainingJobArn: TrainingJobArn
    /**
         *  Name of the model training job. 
         */
    var TrainingJobName: TrainingJobName
    /**
         * The status of the training job. Amazon SageMaker provides the following training job statuses:    InProgress - The training is in progress.    Completed - The training job has completed.    Failed - The training job has failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeTrainingJobResponse call.    Stopping - The training job is stopping.    Stopped - The training job has stopped.   For more detailed information, see SecondaryStatus. 
         */
    var TrainingJobStatus: TrainingJobStatus
    /**
         * Indicates the time when the training job starts on training instances. You are billed for the time interval between this time and the value of TrainingEndTime. The start time in CloudWatch Logs might be later than this time. The difference is due to the time it takes to download the training data and to the size of the training container.
         */
    var TrainingStartTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a hyperparameter tuning job.
         */
    var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined
    /**
         * A VpcConfig object that specifies the VPC that this training job has access to. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait DescribeTransformJobRequest extends js.Object {
    /**
         * The name of the transform job that you want to view details of.
         */
    var TransformJobName: TransformJobName
  }
  
  
  trait DescribeTransformJobResponse extends js.Object {
    /**
         * SingleRecord means only one record was used per a batch. MultiRecord means batches contained as many records that could possibly fit within the MaxPayloadInMB limit.
         */
    var BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined
    /**
         * A timestamp that shows when the transform Job was created.
         */
    var CreationTime: Timestamp
    /**
         * 
         */
    var Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined
    /**
         * If the transform job failed, the reason that it failed.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or training job.
         */
    var LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined
    /**
         * The maximum number of parallel requests on each instance node that can be launched in a transform job. The default value is 1.
         */
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined
    /**
         * The maximum payload size , in MB used in the transform job.
         */
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined
    /**
         * The name of the model used in the transform job.
         */
    var ModelName: ModelName
    /**
         * Indicates when the transform job is Completed, Stopped, or Failed. You are billed for the time interval between this time and the value of TransformStartTime.
         */
    var TransformEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Describes the dataset to be transformed and the Amazon S3 location where it is stored.
         */
    var TransformInput: TransformInput
    /**
         * The Amazon Resource Name (ARN) of the transform job.
         */
    var TransformJobArn: TransformJobArn
    /**
         * The name of the transform job.
         */
    var TransformJobName: TransformJobName
    /**
         * The status of the transform job. If the transform job failed, the reason is returned in the FailureReason field.
         */
    var TransformJobStatus: TransformJobStatus
    /**
         * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
         */
    var TransformOutput: js.UndefOr[TransformOutput] = js.undefined
    /**
         * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
         */
    var TransformResources: TransformResources
    /**
         * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time and the value of TransformEndTime.
         */
    var TransformStartTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait DescribeWorkteamRequest extends js.Object {
    /**
         * The name of the work team to return a description of.
         */
    var WorkteamName: WorkteamName
  }
  
  
  trait DescribeWorkteamResponse extends js.Object {
    /**
         * A Workteam instance that contains information about the work team. 
         */
    var Workteam: Workteam
  }
  
  
  trait DesiredWeightAndCapacity extends js.Object {
    /**
         * The variant's capacity.
         */
    var DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined
    /**
         * The variant's weight.
         */
    var DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
    /**
         * The name of the variant to update.
         */
    var VariantName: VariantName
  }
  
  
  trait EndpointConfigSummary extends js.Object {
    /**
         * A timestamp that shows when the endpoint configuration was created.
         */
    var CreationTime: Timestamp
    /**
         * The Amazon Resource Name (ARN) of the endpoint configuration.
         */
    var EndpointConfigArn: EndpointConfigArn
    /**
         * The name of the endpoint configuration.
         */
    var EndpointConfigName: EndpointConfigName
  }
  
  
  trait EndpointSummary extends js.Object {
    /**
         * A timestamp that shows when the endpoint was created.
         */
    var CreationTime: Timestamp
    /**
         * The Amazon Resource Name (ARN) of the endpoint.
         */
    var EndpointArn: EndpointArn
    /**
         * The name of the endpoint.
         */
    var EndpointName: EndpointName
    /**
         * The status of the endpoint.    OutOfService: Endpoint is not available to take incoming requests.    Creating: CreateEndpoint is executing.    Updating: UpdateEndpoint or UpdateEndpointWeightsAndCapacities is executing.    SystemUpdating: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled until it has completed. This mainenance operation does not change any customer-specified values such as VPC config, KMS encryption, model, instance type, or instance count.    RollingBack: Endpoint fails to scale up or down or change its variant weight and is in the process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an InService status. This transitional status only applies to an endpoint that has autoscaling enabled and is undergoing variant weight or capacity changes as part of an UpdateEndpointWeightsAndCapacities call or when the UpdateEndpointWeightsAndCapacities operation is called explicitly.    InService: Endpoint is available to process incoming requests.    Deleting: DeleteEndpoint is executing.    Failed: Endpoint could not be created, updated, or re-scaled. Use DescribeEndpointOutput$FailureReason for information about the failure. DeleteEndpoint is the only operation that can be performed on a failed endpoint.   To get a list of endpoints with a specified status, use the ListEndpointsInput$StatusEquals filter.
         */
    var EndpointStatus: EndpointStatus
    /**
         * A timestamp that shows when the endpoint was last modified.
         */
    var LastModifiedTime: Timestamp
  }
  
  
  trait EnvironmentMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[EnvironmentValue]
  
  
  trait Filter extends js.Object {
    /**
         * A property name. For example, TrainingJobName. See TrainingJob properties for the list of valid property names for each supported resource.
         */
    var Name: ResourcePropertyName
    /**
         * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following values:  Equals  The specified resource in Name equals the specified Value.  NotEquals  The specified resource in Name does not equal the specified Value.  GreaterThan  The specified resource in Name is greater than the specified Value. Not supported for text-based properties.  GreaterThanOrEqualTo  The specified resource in Name is greater than or equal to the specified Value. Not supported for text-based properties.  LessThan  The specified resource in Name is less than the specified Value. Not supported for text-based properties.  LessThanOrEqualTo  The specified resource in Name is less than or equal to the specified Value. Not supported for text-based properties.  Contains  Only supported for text-based properties. The word-list of the property contains the specified Value.  
         */
    var Operator: js.UndefOr[Operator] = js.undefined
    /**
         * A value used with Resource and Operator to determin if objects statisfy the filter's condition. For numerical properties, Value must be an integer or floating-point decimal. For timestamp properties, Value must be an ISO 8601 date-time string of the following format: YYYY-mm-dd'T'HH:MM:SS.
         */
    var Value: js.UndefOr[FilterValue] = js.undefined
  }
  
  
  trait FinalHyperParameterTuningJobObjectiveMetric extends js.Object {
    /**
         * The name of the objective metric.
         */
    var MetricName: MetricName
    /**
         * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
         */
    var Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.undefined
    /**
         * The value of the objective metric.
         */
    var Value: MetricValue
  }
  
  
  trait GetSearchSuggestionsRequest extends js.Object {
    /**
         * The name of the Amazon SageMaker resource to Search for. The only valid Resource value is TrainingJob.
         */
    var Resource: ResourceType
    /**
         * Limits the property names that are included in the response.
         */
    var SuggestionQuery: js.UndefOr[SuggestionQuery] = js.undefined
  }
  
  
  trait GetSearchSuggestionsResponse extends js.Object {
    /**
         * A list of property names for a Resource that match a SuggestionQuery.
         */
    var PropertyNameSuggestions: js.UndefOr[PropertyNameSuggestionList] = js.undefined
  }
  
  
  trait GitConfig extends js.Object {
    /**
         * The default brach for the git repository.
         */
    var Branch: js.UndefOr[Branch] = js.undefined
    /**
         * The URL where the git repository is located.
         */
    var RepositoryUrl: Url
    /**
         * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
         */
    var SecretArn: js.UndefOr[SecretArn] = js.undefined
  }
  
  
  trait GitConfigForUpdate extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
         */
    var SecretArn: js.UndefOr[SecretArn] = js.undefined
  }
  
  
  trait HumanTaskConfig extends js.Object {
    /**
         * Configures how labels are consolidated across human workers.
         */
    var AnnotationConsolidationConfig: AnnotationConsolidationConfig
    /**
         * Defines the maximum number of data objects that can be labeled by human workers at the same time. Each object may have more than one worker at one time.
         */
    var MaxConcurrentTaskCount: js.UndefOr[MaxConcurrentTaskCount] = js.undefined
    /**
         * The number of human workers that will label an object. 
         */
    var NumberOfHumanWorkersPerDataObject: NumberOfHumanWorkersPerDataObject
    /**
         * The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human worker. Use this function to provide input to a custom labeling job.
         */
    var PreHumanTaskLambdaArn: LambdaFunctionArn
    /**
         * The price that you pay for each task performed by a public worker.
         */
    var PublicWorkforceTaskPrice: js.UndefOr[PublicWorkforceTaskPrice] = js.undefined
    /**
         * The length of time that a task remains available for labelling by human workers.
         */
    var TaskAvailabilityLifetimeInSeconds: js.UndefOr[TaskAvailabilityLifetimeInSeconds] = js.undefined
    /**
         * A description of the task for your human workers.
         */
    var TaskDescription: TaskDescription
    /**
         * Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
         */
    var TaskKeywords: js.UndefOr[TaskKeywords] = js.undefined
    /**
         * The amount of time that a worker has to complete a task.
         */
    var TaskTimeLimitInSeconds: TaskTimeLimitInSeconds
    /**
         * A title for the task for your human workers.
         */
    var TaskTitle: TaskTitle
    /**
         * Information about the user interface that workers use to complete the labeling task.
         */
    var UiConfig: UiConfig
    /**
         * The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
         */
    var WorkteamArn: WorkteamArn
  }
  
  
  trait HyperParameterAlgorithmSpecification extends js.Object {
    /**
         * The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for this parameter, do not specify a value for TrainingImage.
         */
    var AlgorithmName: js.UndefOr[ArnOrName] = js.undefined
    /**
         * An array of MetricDefinition objects that specify the metrics that the algorithm emits.
         */
    var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined
    /**
         *  The registry path of the Docker image that contains the training algorithm. For information about Docker registry paths for built-in algorithms, see Algorithms Provided by Amazon SageMaker: Common Parameters.
         */
    var TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined
    /**
         * The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads the training data from Amazon S3 to the storage volume that is attached to the training instance and mounts the directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker streams data directly from Amazon S3 to the container.  If you specify File mode, make sure that you provision the storage volume that is attached to the training instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model artifacts, and intermediate information.  For more information about input modes, see Algorithms. 
         */
    var TrainingInputMode: TrainingInputMode
  }
  
  
  trait HyperParameterSpecification extends js.Object {
    /**
         * The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be required.
         */
    var DefaultValue: js.UndefOr[ParameterValue] = js.undefined
    /**
         * A brief description of the hyperparameter.
         */
    var Description: js.UndefOr[EntityDescription] = js.undefined
    /**
         * Indicates whether this hyperparameter is required.
         */
    var IsRequired: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
         */
    var IsTunable: js.UndefOr[Boolean] = js.undefined
    /**
         * The name of this hyperparameter. The name must be unique.
         */
    var Name: ParameterName
    /**
         * The allowed range for this hyperparameter.
         */
    var Range: js.UndefOr[ParameterRange] = js.undefined
    /**
         * The type of this hyperparameter. The valid types are Integer, Continuous, Categorical, and FreeText.
         */
    var Type: ParameterType
  }
  
  
  trait HyperParameterTrainingJobDefinition extends js.Object {
    /**
         * The HyperParameterAlgorithmSpecification object that specifies the algorithm to use for the training jobs that the tuning job launches.
         */
    var AlgorithmSpecification: HyperParameterAlgorithmSpecification
    /**
         * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers within a training cluster for distributed training. If network isolation is used for training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the specifed VPC, but the training container does not have network access.  The Semantic Segmentation built-in algorithm does not support network isolation. 
         */
    var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
    /**
         * An array of Channel objects that specify the input for the training jobs that the tuning job launches.
         */
    var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
    /**
         * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning job launches.
         */
    var OutputDataConfig: OutputDataConfig
    /**
         * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning job launches. Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose File as the TrainingInputMode in the algorithm specification. For distributed training algorithms, specify an instance count greater than 1.
         */
    var ResourceConfig: ResourceConfig
    /**
         * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
         */
    var RoleArn: RoleArn
    /**
         * Specifies the values of hyperparameters that do not change for the tuning job.
         */
    var StaticHyperParameters: js.UndefOr[HyperParameters] = js.undefined
    /**
         * Sets a maximum duration for the training jobs that the tuning job launches. Use this parameter to limit model training costs.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts. When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided by Amazon SageMaker save the intermediate results of the job.
         */
    var StoppingCondition: StoppingCondition
    /**
         * The VpcConfig object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait HyperParameterTrainingJobSummary extends js.Object {
    /**
         * The date and time that the training job was created.
         */
    var CreationTime: Timestamp
    /**
         * The reason that the training job failed. 
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The FinalHyperParameterTuningJobObjectiveMetric object that specifies the value of the objective metric of the tuning job that launched this training job.
         */
    var FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[FinalHyperParameterTuningJobObjectiveMetric] = js.undefined
    /**
         * The status of the objective metric for the training job:   Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.     Pending: The training job is in progress and evaluation of its final objective metric is pending.     Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.  
         */
    var ObjectiveStatus: js.UndefOr[ObjectiveStatus] = js.undefined
    /**
         * The date and time that the training job ended.
         */
    var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the training job.
         */
    var TrainingJobArn: TrainingJobArn
    /**
         * The name of the training job.
         */
    var TrainingJobName: TrainingJobName
    /**
         * The status of the training job.
         */
    var TrainingJobStatus: TrainingJobStatus
    /**
         * The date and time that the training job started.
         */
    var TrainingStartTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * A list of the hyperparameters for which you specified ranges to search.
         */
    var TunedHyperParameters: HyperParameters
    /**
         * The name of the hyperparameter tuning job that launched this training job.
         */
    var TuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined
  }
  
  
  trait HyperParameterTuningJobConfig extends js.Object {
    /**
         * The HyperParameterTuningJobObjective object that specifies the objective metric for this tuning job.
         */
    var HyperParameterTuningJobObjective: HyperParameterTuningJobObjective
    /**
         * The ParameterRanges object that specifies the ranges of hyperparameters that this tuning job searches.
         */
    var ParameterRanges: ParameterRanges
    /**
         * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
         */
    var ResourceLimits: ResourceLimits
    /**
         * Specifies the search strategy for hyperparameters. Currently, the only valid value is Bayesian.
         */
    var Strategy: HyperParameterTuningJobStrategyType
    /**
         * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. One of the following values:  OFF  Training jobs launched by the hyperparameter tuning job do not use early stopping.  AUTO  Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are no longer improving as measured by the objective metric of the tuning job.  
         */
    var TrainingJobEarlyStoppingType: js.UndefOr[TrainingJobEarlyStoppingType] = js.undefined
  }
  
  
  trait HyperParameterTuningJobObjective extends js.Object {
    /**
         * The name of the metric to use for the objective metric.
         */
    var MetricName: MetricName
    /**
         * Whether to minimize or maximize the objective metric.
         */
    var Type: HyperParameterTuningJobObjectiveType
  }
  
  
  trait HyperParameterTuningJobSummary extends js.Object {
    /**
         * The date and time that the tuning job was created.
         */
    var CreationTime: Timestamp
    /**
         * The date and time that the tuning job ended.
         */
    var HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the tuning job.
         */
    var HyperParameterTuningJobArn: HyperParameterTuningJobArn
    /**
         * The name of the tuning job.
         */
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    /**
         * The status of the tuning job.
         */
    var HyperParameterTuningJobStatus: HyperParameterTuningJobStatus
    /**
         * The date and time that the tuning job was modified.
         */
    var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The ObjectiveStatusCounters object that specifies the numbers of training jobs, categorized by objective metric status, that this tuning job launched.
         */
    var ObjectiveStatusCounters: ObjectiveStatusCounters
    /**
         * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs allowed for this tuning job.
         */
    var ResourceLimits: js.UndefOr[ResourceLimits] = js.undefined
    /**
         * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each iteration. Currently, the only valid value is Bayesian.
         */
    var Strategy: HyperParameterTuningJobStrategyType
    /**
         * The TrainingJobStatusCounters object that specifies the numbers of training jobs, categorized by status, that this tuning job launched.
         */
    var TrainingJobStatusCounters: TrainingJobStatusCounters
  }
  
  
  trait HyperParameterTuningJobWarmStartConfig extends js.Object {
    /**
         * An array of hyperparameter tuning jobs that are used as the starting point for the new hyperparameter tuning job. For more information about warm starting a hyperparameter tuning job, see Using a Previous Hyperparameter Tuning Job as a Starting Point. Hyperparameter tuning jobs created before October 1, 2018 cannot be used as parent jobs for warm start tuning jobs.
         */
    var ParentHyperParameterTuningJobs: ParentHyperParameterTuningJobs
    /**
         * Specifies one of the following:  IDENTICAL_DATA_AND_ALGORITHM  The new hyperparameter tuning job uses the same input data and training image as the parent tuning jobs. You can change the hyperparameter ranges to search and the maximum number of training jobs that the hyperparameter tuning job launches. You cannot use a new version of the training algorithm, unless the changes in the new version do not affect the algorithm itself. For example, changes that improve logging or adding support for a different data format are allowed. You can also change hyperparameters from tunable to static, and from static to tunable, but the total number of static plus tunable hyperparameters must remain the same as it is in all parent jobs. The objective metric for the new tuning job must be the same as for all parent jobs.  TRANSFER_LEARNING  The new hyperparameter tuning job can include input data, hyperparameter ranges, maximum number of concurrent training jobs, and maximum number of training jobs that are different than those of its parent hyperparameter tuning jobs. The training image can also be a different version from the version used in the parent hyperparameter tuning job. You can also change hyperparameters from tunable to static, and from static to tunable, but the total number of static plus tunable hyperparameters must remain the same as it is in all parent jobs. The objective metric for the new tuning job must be the same as for all parent jobs.  
         */
    var WarmStartType: HyperParameterTuningJobWarmStartType
  }
  
  
  trait HyperParameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ParameterValue]
  
  
  trait InferenceSpecification extends js.Object {
    /**
         * The Amazon ECR registry path of the Docker image that contains the inference code.
         */
    var Containers: ModelPackageContainerDefinitionList
    /**
         * The supported MIME types for the input data.
         */
    var SupportedContentTypes: ContentTypes
    /**
         * A list of the instance types that are used to generate inferences in real-time.
         */
    var SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes
    /**
         * The supported MIME types for the output data.
         */
    var SupportedResponseMIMETypes: ResponseMIMETypes
    /**
         * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
         */
    var SupportedTransformInstanceTypes: TransformInstanceTypes
  }
  
  
  trait InputConfig extends js.Object {
    /**
         * Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary form. The data inputs are InputConfig$Framework specific.     TENSORFLOW, MXNET and ONNX: You must specify the name and shape of the expected data inputs in order using a dictionary format for your trained model.   Example of one input: {‘data’:[1,3,1024,1024]}}    Example for two inputs: {‘var1’: [1,1,28,28], ‘var2’:[1,1,28,28]}       PYTORCH: You can either specify the name and shape of expected data inputs in order using a dictionary format for your trained model or you can specify the shape only using a list format.   Example of one input in dictionary format: {‘input0’:[1,3,224,234]}    Example of one input in list format: [1,3,224,224]    Example of two inputs in dictionary format: {‘input0’:[1,3,224,234], 'input1':[1,3,224,224]}    Example of two inputs in list format: [[1,3,224,224], [1,3,224,224]]       XGBOOST: input data name and shape are not needed.  
         */
    var DataInputConfig: DataInputConfig
    /**
         * Identifies the framework in which the model was trained. For example: TENSORFLOW.
         */
    var Framework: Framework
    /**
         * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
         */
    var S3Uri: S3Uri
  }
  
  
  trait IntegerParameterRange extends js.Object {
    /**
         * The maximum value of the hyperparameter to search.
         */
    var MaxValue: ParameterValue
    /**
         * The minimum value of the hyperparameter to search.
         */
    var MinValue: ParameterValue
    /**
         * The name of the hyperparameter to search.
         */
    var Name: ParameterKey
  }
  
  
  trait IntegerParameterRangeSpecification extends js.Object {
    /**
         * The maximum integer value allowed.
         */
    var MaxValue: ParameterValue
    /**
         * The minimum integer value allowed.
         */
    var MinValue: ParameterValue
  }
  
  
  trait LabelCounters extends js.Object {
    /**
         * The total number of objects that could not be labeled due to an error.
         */
    var FailedNonRetryableError: js.UndefOr[LabelCounter] = js.undefined
    /**
         * The total number of objects labeled by a human worker.
         */
    var HumanLabeled: js.UndefOr[LabelCounter] = js.undefined
    /**
         * The total number of objects labeled by automated data labeling.
         */
    var MachineLabeled: js.UndefOr[LabelCounter] = js.undefined
    /**
         * The total number of objects labeled.
         */
    var TotalLabeled: js.UndefOr[LabelCounter] = js.undefined
    /**
         * The total number of objects not yet labeled.
         */
    var Unlabeled: js.UndefOr[LabelCounter] = js.undefined
  }
  
  
  trait LabelCountersForWorkteam extends js.Object {
    /**
         * The total number of data objects labeled by a human worker.
         */
    var HumanLabeled: js.UndefOr[LabelCounter] = js.undefined
    /**
         * The total number of data objects that need to be labeled by a human worker.
         */
    var PendingHuman: js.UndefOr[LabelCounter] = js.undefined
    /**
         * The total number of tasks in the labeling job.
         */
    var Total: js.UndefOr[LabelCounter] = js.undefined
  }
  
  
  trait LabelingJobAlgorithmsConfig extends js.Object {
    /**
         * At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the final model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by providing the ARN of the model here. 
         */
    var InitialActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined
    /**
         * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the following ARNs:    Image classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/image-classification     Text classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/text-classification     Object detection   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/object-detection   
         */
    var LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn
    /**
         * Provides configuration information for a labeling job.
         */
    var LabelingJobResourceConfig: js.UndefOr[LabelingJobResourceConfig] = js.undefined
  }
  
  
  trait LabelingJobDataAttributes extends js.Object {
    /**
         * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this information.
         */
    var ContentClassifiers: js.UndefOr[ContentClassifiers] = js.undefined
  }
  
  
  trait LabelingJobDataSource extends js.Object {
    /**
         * The Amazon S3 location of the input data objects.
         */
    var S3DataSource: LabelingJobS3DataSource
  }
  
  
  trait LabelingJobForWorkteamSummary extends js.Object {
    /**
         * The date and time that the labeling job was created.
         */
    var CreationTime: Timestamp
    /**
         * A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
         */
    var JobReferenceCode: JobReferenceCode
    /**
         * Provides information about the progress of a labeling job.
         */
    var LabelCounters: js.UndefOr[LabelCountersForWorkteam] = js.undefined
    /**
         * The name of the labeling job that the work team is assigned to.
         */
    var LabelingJobName: js.UndefOr[LabelingJobName] = js.undefined
    /**
         * 
         */
    var WorkRequesterAccountId: AccountId
  }
  
  
  trait LabelingJobInputConfig extends js.Object {
    /**
         * Attributes of the data specified by the customer.
         */
    var DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.undefined
    /**
         * The location of the input data.
         */
    var DataSource: LabelingJobDataSource
  }
  
  
  trait LabelingJobOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated data labeling. 
         */
    var FinalActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined
    /**
         * The Amazon S3 bucket location of the manifest file for labeled data. 
         */
    var OutputDatasetS3Uri: S3Uri
  }
  
  
  trait LabelingJobOutputConfig extends js.Object {
    /**
         * The AWS Key Management Service ID of the key used to encrypt the output data, if any.
         */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
         * The Amazon S3 location to write output data.
         */
    var S3OutputPath: S3Uri
  }
  
  
  trait LabelingJobResourceConfig extends js.Object {
    /**
         * The AWS Key Management Service key ID for the key used to encrypt the output data, if any.
         */
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  }
  
  
  trait LabelingJobS3DataSource extends js.Object {
    /**
         * The Amazon S3 location of the manifest file that describes the input data objects.
         */
    var ManifestS3Uri: S3Uri
  }
  
  
  trait LabelingJobStoppingConditions extends js.Object {
    /**
         * The maximum number of objects that can be labeled by human workers.
         */
    var MaxHumanLabeledObjectCount: js.UndefOr[MaxHumanLabeledObjectCount] = js.undefined
    /**
         * The maximum number of input data objects that should be labeled.
         */
    var MaxPercentageOfInputDatasetLabeled: js.UndefOr[MaxPercentageOfInputDatasetLabeled] = js.undefined
  }
  
  
  trait LabelingJobSummary extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual workers into a label for a data object. For more information, see Annotation Consolidation.
         */
    var AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn] = js.undefined
    /**
         * The date and time that the job was created (timestamp).
         */
    var CreationTime: Timestamp
    /**
         * If the LabelingJobStatus field is Failed, this field contains a description of the error.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * Input configuration for the labeling job.
         */
    var InputConfig: js.UndefOr[LabelingJobInputConfig] = js.undefined
    /**
         * Counts showing the progress of the labeling job.
         */
    var LabelCounters: LabelCounters
    /**
         * The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
         */
    var LabelingJobArn: LabelingJobArn
    /**
         * The name of the labeling job.
         */
    var LabelingJobName: LabelingJobName
    /**
         * The location of the output produced by the labeling job.
         */
    var LabelingJobOutput: js.UndefOr[LabelingJobOutput] = js.undefined
    /**
         * The current status of the labeling job. 
         */
    var LabelingJobStatus: LabelingJobStatus
    /**
         * The date and time that the job was last modified (timestamp).
         */
    var LastModifiedTime: Timestamp
    /**
         * The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent to a worker.
         */
    var PreHumanTaskLambdaArn: LambdaFunctionArn
    /**
         * The Amazon Resource Name (ARN) of the work team assigned to the job.
         */
    var WorkteamArn: WorkteamArn
  }
  
  
  trait ListAlgorithmsInput extends js.Object {
    /**
         * A filter that returns only algorithms created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns only algorithms created before the specified time (timestamp).
         */
    var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
    /**
         * The maximum number of algorithms to return in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the algorithm name. This filter returns only algorithms whose name contains the specified string.
         */
    var NameContains: js.UndefOr[NameContains] = js.undefined
    /**
         * If the response to a previous ListAlgorithms request was truncated, the response includes a NextToken. To retrieve the next set of algorithms, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The parameter by which to sort the results. The default is CreationTime.
         */
    var SortBy: js.UndefOr[AlgorithmSortBy] = js.undefined
    /**
         * The sort order for the results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  
  trait ListAlgorithmsOutput extends js.Object {
    /**
         * &gt;An array of AlgorithmSummary objects, each of which lists an algorithm.
         */
    var AlgorithmSummaryList: AlgorithmSummaryList
    /**
         * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms, use it in the subsequent request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListCodeRepositoriesInput extends js.Object {
    /**
         * A filter that returns only git repositories that were created after the specified time.
         */
    var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns only git repositories that were created before the specified time.
         */
    var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns only git repositories that were last modified after the specified time.
         */
    var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only git repositories that were last modified before the specified time.
         */
    var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * The maximum number of git repositories to return in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the git repositories name. This filter returns only repositories whose name contains the specified string.
         */
    var NameContains: js.UndefOr[CodeRepositoryNameContains] = js.undefined
    /**
         * If the result of a ListCodeRepositoriesOutput request was truncated, the response includes a NextToken. To get the next set of git repositories, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The field to sort results by. The default is Name.
         */
    var SortBy: js.UndefOr[CodeRepositorySortBy] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[CodeRepositorySortOrder] = js.undefined
  }
  
  
  trait ListCodeRepositoriesOutput extends js.Object {
    /**
         * Gets a list of summaries of the git repositories. Each summary specifies the following values for the repository:    Name   Amazon Resource Name (ARN)   Creation time   Last modified time   Configuration information, including the URL location of the repository and the ARN of the AWS Secrets Manager secret that contains the credentials used to access the repository.     
         */
    var CodeRepositorySummaryList: CodeRepositorySummaryList
    /**
         * If the result of a ListCodeRepositoriesOutput request was truncated, the response includes a NextToken. To get the next set of git repositories, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListCompilationJobsRequest extends js.Object {
    /**
         * A filter that returns the model compilation jobs that were created after a specified time. 
         */
    var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns the model compilation jobs that were created before a specified time.
         */
    var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns the model compilation jobs that were modified after a specified time.
         */
    var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         * A filter that returns the model compilation jobs that were modified before a specified time.
         */
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         * The maximum number of model compilation jobs to return in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A filter that returns the model compilation jobs whose name contains a specified string.
         */
    var NameContains: js.UndefOr[NameContains] = js.undefined
    /**
         * If the result of the previous ListCompilationJobs request was truncated, the response includes a NextToken. To retrieve the next set of model compilation jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A filter that retrieves model compilation jobs with a specific DescribeCompilationJobResponse$CompilationJobStatus status.
         */
    var StatusEquals: js.UndefOr[CompilationJobStatus] = js.undefined
  }
  
  
  trait ListCompilationJobsResponse extends js.Object {
    /**
         * An array of CompilationJobSummary objects, each describing a model compilation job. 
         */
    var CompilationJobSummaries: CompilationJobSummaries
    /**
         * If the response is truncated, Amazon SageMaker returns this NextToken. To retrieve the next set of model compilation jobs, use this token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListEndpointConfigsInput extends js.Object {
    /**
         * A filter that returns only endpoint configurations created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only endpoint configurations created before the specified time (timestamp).
         */
    var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * The maximum number of training jobs to return in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the endpoint configuration name. This filter returns only endpoint configurations whose name contains the specified string. 
         */
    var NameContains: js.UndefOr[EndpointConfigNameContains] = js.undefined
    /**
         * If the result of the previous ListEndpointConfig request was truncated, the response includes a NextToken. To retrieve the next set of endpoint configurations, use the token in the next request. 
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The field to sort results by. The default is CreationTime.
         */
    var SortBy: js.UndefOr[EndpointConfigSortKey] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[OrderKey] = js.undefined
  }
  
  
  trait ListEndpointConfigsOutput extends js.Object {
    /**
         * An array of endpoint configurations.
         */
    var EndpointConfigs: EndpointConfigSummaryList
    /**
         *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint configurations, use it in the subsequent request 
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListEndpointsInput extends js.Object {
    /**
         * A filter that returns only endpoints that were created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only endpoints that were created before the specified time (timestamp).
         */
    var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         *  A filter that returns only endpoints that were modified after the specified timestamp. 
         */
    var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         *  A filter that returns only endpoints that were modified before the specified timestamp. 
         */
    var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * The maximum number of endpoints to return in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in endpoint names. This filter returns only endpoints whose name contains the specified string.
         */
    var NameContains: js.UndefOr[EndpointNameContains] = js.undefined
    /**
         * If the result of a ListEndpoints request was truncated, the response includes a NextToken. To retrieve the next set of endpoints, use the token in the next request.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * Sorts the list of results. The default is CreationTime.
         */
    var SortBy: js.UndefOr[EndpointSortKey] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[OrderKey] = js.undefined
    /**
         *  A filter that returns only endpoints with the specified status.
         */
    var StatusEquals: js.UndefOr[EndpointStatus] = js.undefined
  }
  
  
  trait ListEndpointsOutput extends js.Object {
    /**
         *  An array or endpoint objects. 
         */
    var Endpoints: EndpointSummaryList
    /**
         *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request. 
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListHyperParameterTuningJobsRequest extends js.Object {
    /**
         * A filter that returns only tuning jobs that were created after the specified time.
         */
    var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only tuning jobs that were created before the specified time.
         */
    var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only tuning jobs that were modified after the specified time.
         */
    var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only tuning jobs that were modified before the specified time.
         */
    var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * The maximum number of tuning jobs to return. The default value is 10.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the tuning job name. This filter returns only tuning jobs whose name contains the specified string.
         */
    var NameContains: js.UndefOr[NameContains] = js.undefined
    /**
         * If the result of the previous ListHyperParameterTuningJobs request was truncated, the response includes a NextToken. To retrieve the next set of tuning jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The field to sort results by. The default is Name.
         */
    var SortBy: js.UndefOr[HyperParameterTuningJobSortByOptions] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
    /**
         * A filter that returns only tuning jobs with the specified status.
         */
    var StatusEquals: js.UndefOr[HyperParameterTuningJobStatus] = js.undefined
  }
  
  
  trait ListHyperParameterTuningJobsResponse extends js.Object {
    /**
         * A list of HyperParameterTuningJobSummary objects that describe the tuning jobs that the ListHyperParameterTuningJobs request returned.
         */
    var HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries
    /**
         * If the result of this ListHyperParameterTuningJobs request was truncated, the response includes a NextToken. To retrieve the next set of tuning jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListLabelingJobsForWorkteamRequest extends js.Object {
    /**
         * A filter that returns only labeling jobs created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only labeling jobs created before the specified time (timestamp).
         */
    var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter the limits jobs to only the ones whose job reference code contains the specified string.
         */
    var JobReferenceCodeContains: js.UndefOr[JobReferenceCodeContains] = js.undefined
    /**
         * The maximum number of labeling jobs to return in each page of the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * If the result of the previous ListLabelingJobsForWorkteam request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The field to sort results by. The default is CreationTime.
         */
    var SortBy: js.UndefOr[ListLabelingJobsForWorkteamSortByOptions] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the work team for which you want to see labeling jobs for.
         */
    var WorkteamArn: WorkteamArn
  }
  
  
  trait ListLabelingJobsForWorkteamResponse extends js.Object {
    /**
         * An array of LabelingJobSummary objects, each describing a labeling job.
         */
    var LabelingJobSummaryList: LabelingJobForWorkteamSummaryList
    /**
         * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListLabelingJobsRequest extends js.Object {
    /**
         * A filter that returns only labeling jobs created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only labeling jobs created before the specified time (timestamp).
         */
    var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only labeling jobs modified after the specified time (timestamp).
         */
    var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only labeling jobs modified before the specified time (timestamp).
         */
    var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * The maximum number of labeling jobs to return in each page of the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the labeling job name. This filter returns only labeling jobs whose name contains the specified string.
         */
    var NameContains: js.UndefOr[NameContains] = js.undefined
    /**
         * If the result of the previous ListLabelingJobs request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The field to sort results by. The default is CreationTime.
         */
    var SortBy: js.UndefOr[SortBy] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
    /**
         * A filter that retrieves only labeling jobs with a specific status.
         */
    var StatusEquals: js.UndefOr[LabelingJobStatus] = js.undefined
  }
  
  
  trait ListLabelingJobsResponse extends js.Object {
    /**
         * An array of LabelingJobSummary objects, each describing a labeling job.
         */
    var LabelingJobSummaryList: js.UndefOr[LabelingJobSummaryList] = js.undefined
    /**
         * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListModelPackagesInput extends js.Object {
    /**
         * A filter that returns only model packages created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns only model packages created before the specified time (timestamp).
         */
    var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
    /**
         * The maximum number of model packages to return in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the model package name. This filter returns only model packages whose name contains the specified string.
         */
    var NameContains: js.UndefOr[NameContains] = js.undefined
    /**
         * If the response to a previous ListModelPackages request was truncated, the response includes a NextToken. To retrieve the next set of model packages, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The parameter by which to sort the results. The default is CreationTime.
         */
    var SortBy: js.UndefOr[ModelPackageSortBy] = js.undefined
    /**
         * The sort order for the results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  
  trait ListModelPackagesOutput extends js.Object {
    /**
         * An array of ModelPackageSummary objects, each of which lists a model package.
         */
    var ModelPackageSummaryList: ModelPackageSummaryList
    /**
         * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of model packages, use it in the subsequent request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListModelsInput extends js.Object {
    /**
         * A filter that returns only models created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only models created before the specified time (timestamp).
         */
    var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * The maximum number of models to return in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the training job name. This filter returns only models in the training job whose name contains the specified string.
         */
    var NameContains: js.UndefOr[ModelNameContains] = js.undefined
    /**
         * If the response to a previous ListModels request was truncated, the response includes a NextToken. To retrieve the next set of models, use the token in the next request.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * Sorts the list of results. The default is CreationTime.
         */
    var SortBy: js.UndefOr[ModelSortKey] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[OrderKey] = js.undefined
  }
  
  
  trait ListModelsOutput extends js.Object {
    /**
         * An array of ModelSummary objects, each of which lists a model.
         */
    var Models: ModelSummaryList
    /**
         *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use it in the subsequent request. 
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListNotebookInstanceLifecycleConfigsInput extends js.Object {
    /**
         * A filter that returns only lifecycle configurations that were created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns only lifecycle configurations that were created before the specified time (timestamp).
         */
    var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns only lifecycle configurations that were modified after the specified time (timestamp).
         */
    var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         * A filter that returns only lifecycle configurations that were modified before the specified time (timestamp).
         */
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         * The maximum number of lifecycle configurations to return in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the lifecycle configuration name. This filter returns only lifecycle configurations whose name contains the specified string.
         */
    var NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains] = js.undefined
    /**
         * If the result of a ListNotebookInstanceLifecycleConfigs request was truncated, the response includes a NextToken. To get the next set of lifecycle configurations, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Sorts the list of results. The default is CreationTime.
         */
    var SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey] = js.undefined
    /**
         * The sort order for results.
         */
    var SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder] = js.undefined
  }
  
  
  trait ListNotebookInstanceLifecycleConfigsOutput extends js.Object {
    /**
         * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle configurations, use it in the next request. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * An array of NotebookInstanceLifecycleConfiguration objects, each listing a lifecycle configuration.
         */
    var NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList] = js.undefined
  }
  
  
  trait ListNotebookInstancesInput extends js.Object {
    /**
         * A filter that returns only notebook instances with associated with the specified git respository.
         */
    var AdditionalCodeRepositoryEquals: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
    /**
         * A filter that returns only notebook instances that were created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns only notebook instances that were created before the specified time (timestamp). 
         */
    var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
    /**
         * A string in the name or URL of a git repository associated with this notebook instance. This filter returns only notebook instances associated with a git repository with a name that contains the specified string.
         */
    var DefaultCodeRepositoryContains: js.UndefOr[CodeRepositoryContains] = js.undefined
    /**
         * A filter that returns only notebook instances that were modified after the specified time (timestamp).
         */
    var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         * A filter that returns only notebook instances that were modified before the specified time (timestamp).
         */
    var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         * The maximum number of notebook instances to return.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the notebook instances' name. This filter returns only notebook instances whose name contains the specified string.
         */
    var NameContains: js.UndefOr[NotebookInstanceNameContains] = js.undefined
    /**
         *  If the previous call to the ListNotebookInstances is truncated, the response includes a NextToken. You can use this token in your subsequent ListNotebookInstances request to fetch the next set of notebook instances.    You might specify a filter or a sort order in your request. When response is truncated, you must use the same values for the filer and sort order in the next request.  
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A string in the name of a notebook instances lifecycle configuration associated with this notebook instance. This filter returns only notebook instances associated with a lifecycle configuration with a name that contains the specified string.
         */
    var NotebookInstanceLifecycleConfigNameContains: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
    /**
         * The field to sort results by. The default is Name.
         */
    var SortBy: js.UndefOr[NotebookInstanceSortKey] = js.undefined
    /**
         * The sort order for results. 
         */
    var SortOrder: js.UndefOr[NotebookInstanceSortOrder] = js.undefined
    /**
         * A filter that returns only notebook instances with the specified status.
         */
    var StatusEquals: js.UndefOr[NotebookInstanceStatus] = js.undefined
  }
  
  
  trait ListNotebookInstancesOutput extends js.Object {
    /**
         * If the response to the previous ListNotebookInstances request was truncated, Amazon SageMaker returns this token. To retrieve the next set of notebook instances, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * An array of NotebookInstanceSummary objects, one for each notebook instance.
         */
    var NotebookInstances: js.UndefOr[NotebookInstanceSummaryList] = js.undefined
  }
  
  
  trait ListSubscribedWorkteamsRequest extends js.Object {
    /**
         * The maximum number of work teams to return in each page of the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the work team name. This filter returns only work teams whose name contains the specified string.
         */
    var NameContains: js.UndefOr[WorkteamName] = js.undefined
    /**
         * If the result of the previous ListSubscribedWorkteams request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListSubscribedWorkteamsResponse extends js.Object {
    /**
         * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of work teams, use it in the subsequent request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * An array of Workteam objects, each describing a work team.
         */
    var SubscribedWorkteams: SubscribedWorkteams
  }
  
  
  trait ListTagsInput extends js.Object {
    /**
         * Maximum number of tags to return.
         */
    var MaxResults: js.UndefOr[ListTagsMaxResults] = js.undefined
    /**
         *  If the response to the previous ListTags request is truncated, Amazon SageMaker returns this token. To retrieve the next set of tags, use it in the subsequent request. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait ListTagsOutput extends js.Object {
    /**
         *  If response is truncated, Amazon SageMaker includes a token in the response. You can use this token in your subsequent request to fetch next set of tokens. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * An array of Tag objects, each with a tag key and a value.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait ListTrainingJobsForHyperParameterTuningJobRequest extends js.Object {
    /**
         * The name of the tuning job whose training jobs you want to list.
         */
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    /**
         * The maximum number of training jobs to return. The default value is 10.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * If the result of the previous ListTrainingJobsForHyperParameterTuningJob request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The field to sort results by. The default is Name. If the value of this field is FinalObjectiveMetricValue, any training jobs that did not return an objective metric are not listed.
         */
    var SortBy: js.UndefOr[TrainingJobSortByOptions] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
    /**
         * A filter that returns only training jobs with the specified status.
         */
    var StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined
  }
  
  
  trait ListTrainingJobsForHyperParameterTuningJobResponse extends js.Object {
    /**
         * If the result of this ListTrainingJobsForHyperParameterTuningJob request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of TrainingJobSummary objects that describe the training jobs that the ListTrainingJobsForHyperParameterTuningJob request returned.
         */
    var TrainingJobSummaries: HyperParameterTrainingJobSummaries
  }
  
  
  trait ListTrainingJobsRequest extends js.Object {
    /**
         * A filter that returns only training jobs created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only training jobs created before the specified time (timestamp).
         */
    var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only training jobs modified after the specified time (timestamp).
         */
    var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only training jobs modified before the specified time (timestamp).
         */
    var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * The maximum number of training jobs to return in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the training job name. This filter returns only training jobs whose name contains the specified string.
         */
    var NameContains: js.UndefOr[NameContains] = js.undefined
    /**
         * If the result of the previous ListTrainingJobs request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The field to sort results by. The default is CreationTime.
         */
    var SortBy: js.UndefOr[SortBy] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
    /**
         * A filter that retrieves only training jobs with a specific status.
         */
    var StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined
  }
  
  
  trait ListTrainingJobsResponse extends js.Object {
    /**
         * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * An array of TrainingJobSummary objects, each listing a training job.
         */
    var TrainingJobSummaries: TrainingJobSummaries
  }
  
  
  trait ListTransformJobsRequest extends js.Object {
    /**
         * A filter that returns only transform jobs created after the specified time.
         */
    var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only transform jobs created before the specified time.
         */
    var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only transform jobs modified after the specified time.
         */
    var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * A filter that returns only transform jobs modified before the specified time.
         */
    var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
    /**
         * The maximum number of transform jobs to return in the response. The default value is 10.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the transform job name. This filter returns only transform jobs whose name contains the specified string.
         */
    var NameContains: js.UndefOr[NameContains] = js.undefined
    /**
         * If the result of the previous ListTransformJobs request was truncated, the response includes a NextToken. To retrieve the next set of transform jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The field to sort results by. The default is CreationTime.
         */
    var SortBy: js.UndefOr[SortBy] = js.undefined
    /**
         * The sort order for results. The default is Descending.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
    /**
         * A filter that retrieves only transform jobs with a specific status.
         */
    var StatusEquals: js.UndefOr[TransformJobStatus] = js.undefined
  }
  
  
  trait ListTransformJobsResponse extends js.Object {
    /**
         * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs, use it in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * An array of TransformJobSummary objects.
         */
    var TransformJobSummaries: TransformJobSummaries
  }
  
  
  trait ListWorkteamsRequest extends js.Object {
    /**
         * The maximum number of work teams to return in each page of the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * A string in the work team's name. This filter returns only work teams whose name contains the specified string.
         */
    var NameContains: js.UndefOr[WorkteamName] = js.undefined
    /**
         * If the result of the previous ListWorkteams request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The field to sort results by. The default is CreationTime.
         */
    var SortBy: js.UndefOr[ListWorkteamsSortByOptions] = js.undefined
    /**
         * The sort order for results. The default is Ascending.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  
  trait ListWorkteamsResponse extends js.Object {
    /**
         * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of work teams, use it in the subsequent request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * An array of Workteam objects, each describing a work team.
         */
    var Workteams: Workteams
  }
  
  
  trait MemberDefinition extends js.Object {
    /**
         * The Amazon Cognito user group that is part of the work team.
         */
    var CognitoMemberDefinition: js.UndefOr[CognitoMemberDefinition] = js.undefined
  }
  
  
  trait MetricData extends js.Object {
    /**
         * The name of the metric.
         */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
         * The date and time that the algorithm emitted the metric.
         */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * The value of the metric.
         */
    var Value: js.UndefOr[Float] = js.undefined
  }
  
  
  trait MetricDefinition extends js.Object {
    /**
         * The name of the metric.
         */
    var Name: MetricName
    /**
         * A regular expression that searches the output of a training job and gets the value of the metric. For more information about using regular expressions to define metrics, see Defining Objective Metrics.
         */
    var Regex: MetricRegex
  }
  
  
  trait ModelArtifacts extends js.Object {
    /**
         * The path of the S3 object that contains the model artifacts. For example, s3://bucket-name/keynameprefix/model.tar.gz.
         */
    var S3ModelArtifacts: S3Uri
  }
  
  
  trait ModelPackageContainerDefinition extends js.Object {
    /**
         * The DNS host name for the Docker container.
         */
    var ContainerHostname: js.UndefOr[ContainerHostname] = js.undefined
    /**
         * The Amazon EC2 Container Registry path where inference code is stored. If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
         */
    var Image: Image
    /**
         * An MD5 hash of the training algorithm that identifies the Docker image used for training.
         */
    var ImageDigest: js.UndefOr[ImageDigest] = js.undefined
    /**
         * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
         */
    var ModelDataUrl: js.UndefOr[Url] = js.undefined
    /**
         * The ID of the model package.
         */
    var ProductId: js.UndefOr[ProductId] = js.undefined
  }
  
  
  trait ModelPackageStatusDetails extends js.Object {
    /**
         * The status of the scan of the Docker image container for the model package.
         */
    var ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList] = js.undefined
    /**
         * The status of the validation of the model package.
         */
    var ValidationStatuses: ModelPackageStatusItemList
  }
  
  
  trait ModelPackageStatusItem extends js.Object {
    /**
         * The reason for failure, if the overall status is a failed state.
         */
    var FailureReason: js.UndefOr[String] = js.undefined
    /**
         * The name of the model package for which the overall status is being repoorted.
         */
    var Name: EntityName
    /**
         * The current status.
         */
    var Status: DetailedModelPackageStatus
  }
  
  
  trait ModelPackageSummary extends js.Object {
    /**
         * A timestamp that shows when the model package was created.
         */
    var CreationTime: CreationTime
    /**
         * The Amazon Resource Name (ARN) of the model package.
         */
    var ModelPackageArn: ModelPackageArn
    /**
         * A brief statement describing the model package.
         */
    var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
    /**
         * The name of the model package.
         */
    var ModelPackageName: EntityName
    /**
         * The overall status of the model package.
         */
    var ModelPackageStatus: ModelPackageStatus
  }
  
  
  trait ModelPackageValidationProfile extends js.Object {
    /**
         * The name of the profile for the model package.
         */
    var ProfileName: EntityName
    /**
         * The TransformJobDefinition object that describes the transform job used for the validation of the model package.
         */
    var TransformJobDefinition: TransformJobDefinition
  }
  
  
  trait ModelPackageValidationSpecification extends js.Object {
    /**
         * An array of ModelPackageValidationProfile objects, each of which specifies a batch transform job that Amazon SageMaker runs to validate your model package.
         */
    var ValidationProfiles: ModelPackageValidationProfiles
    /**
         * The IAM roles to be used for the validation of a model package.
         */
    var ValidationRole: RoleArn
  }
  
  
  trait ModelSummary extends js.Object {
    /**
         * A timestamp that indicates when the model was created.
         */
    var CreationTime: Timestamp
    /**
         * The Amazon Resource Name (ARN) of the model.
         */
    var ModelArn: ModelArn
    /**
         * The name of the model that you want a summary for.
         */
    var ModelName: ModelName
  }
  
  
  trait NestedFilters extends js.Object {
    /**
         * A list of filters. Each filter acts on a property. For example, a NestedFilters call might include a filter on the PropertyName parameter fof the InputDataConfig property: InputDataConfig.DataSource.S3DataSource.S3Uri.
         */
    var Filters: FilterList
    /**
         * .The name of the property used in the nested filters.
         */
    var NestedPropertyName: ResourcePropertyName
  }
  
  
  trait NotebookInstanceLifecycleConfigSummary extends js.Object {
    /**
         * A timestamp that tells when the lifecycle configuration was created.
         */
    var CreationTime: js.UndefOr[CreationTime] = js.undefined
    /**
         * A timestamp that tells when the lifecycle configuration was last modified.
         */
    var LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the lifecycle configuration.
         */
    var NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn
    /**
         * The name of the lifecycle configuration.
         */
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  }
  
  
  trait NotebookInstanceLifecycleHook extends js.Object {
    /**
         * A base64-encoded string that contains a shell script for a notebook instance lifecycle configuration.
         */
    var Content: js.UndefOr[NotebookInstanceLifecycleConfigContent] = js.undefined
  }
  
  
  trait NotebookInstanceSummary extends js.Object {
    /**
         * An array of up to 3 git repositories associated with the notebook instance. These can be either the names of git repositories stored as resources in your account, or the URL of git repositories in AWS CodeCommit or in any other git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
         */
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined
    /**
         * A timestamp that shows when the notebook instance was created.
         */
    var CreationTime: js.UndefOr[CreationTime] = js.undefined
    /**
         * The git repository associated with the notebook instance as its default code repository. This can be either the name of a git repository stored as a resource in your account, or the URL of a git repository in AWS CodeCommit or in any other git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
         */
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
    /**
         * The type of ML compute instance that the notebook instance is running on.
         */
    var InstanceType: js.UndefOr[InstanceType] = js.undefined
    /**
         * A timestamp that shows when the notebook instance was last modified.
         */
    var LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the notebook instance.
         */
    var NotebookInstanceArn: NotebookInstanceArn
    /**
         * The name of a notebook instance lifecycle configuration associated with this notebook instance. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
         */
    var NotebookInstanceLifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
    /**
         * The name of the notebook instance that you want a summary for.
         */
    var NotebookInstanceName: NotebookInstanceName
    /**
         * The status of the notebook instance.
         */
    var NotebookInstanceStatus: js.UndefOr[NotebookInstanceStatus] = js.undefined
    /**
         * The URL that you use to connect to the Jupyter instance running in your notebook instance. 
         */
    var Url: js.UndefOr[NotebookInstanceUrl] = js.undefined
  }
  
  
  trait ObjectiveStatusCounters extends js.Object {
    /**
         * The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.
         */
    var Failed: js.UndefOr[ObjectiveStatusCounter] = js.undefined
    /**
         * The number of training jobs that are in progress and pending evaluation of their final objective metric.
         */
    var Pending: js.UndefOr[ObjectiveStatusCounter] = js.undefined
    /**
         * The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.
         */
    var Succeeded: js.UndefOr[ObjectiveStatusCounter] = js.undefined
  }
  
  
  trait OutputConfig extends js.Object {
    /**
         * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example, s3://bucket-name/key-name-prefix.
         */
    var S3OutputLocation: S3Uri
    /**
         * Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
         */
    var TargetDevice: TargetDevice
  }
  
  
  trait OutputDataConfig extends js.Object {
    /**
         * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption. The KmsKeyId can be any of the following formats:    // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"    // KMS Key Alias  "alias/ExampleAlias"    // Amazon Resource Name (ARN) of a KMS Key Alias  "arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"    If you don't provide the KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more information, see KMS-Managed Encryption Keys in Amazon Simple Storage Service Developer Guide.   The KMS key policy must grant permission to the IAM role that you specify in your CreateTrainingJob request. Using Key Policies in AWS KMS in the AWS Key Management Service Developer Guide.  
         */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
         * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example, s3://bucket-name/key-name-prefix. 
         */
    var S3OutputPath: S3Uri
  }
  
  
  trait ParameterRange extends js.Object {
    /**
         * A CategoricalParameterRangeSpecification object that defines the possible values for a categorical hyperparameter.
         */
    var CategoricalParameterRangeSpecification: js.UndefOr[CategoricalParameterRangeSpecification] = js.undefined
    /**
         * A ContinuousParameterRangeSpecification object that defines the possible values for a continuous hyperparameter.
         */
    var ContinuousParameterRangeSpecification: js.UndefOr[ContinuousParameterRangeSpecification] = js.undefined
    /**
         * A IntegerParameterRangeSpecification object that defines the possible values for an integer hyperparameter.
         */
    var IntegerParameterRangeSpecification: js.UndefOr[IntegerParameterRangeSpecification] = js.undefined
  }
  
  
  trait ParameterRanges extends js.Object {
    /**
         * The array of CategoricalParameterRange objects that specify ranges of categorical hyperparameters that a hyperparameter tuning job searches.
         */
    var CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges] = js.undefined
    /**
         * The array of ContinuousParameterRange objects that specify ranges of continuous hyperparameters that a hyperparameter tuning job searches.
         */
    var ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges] = js.undefined
    /**
         * The array of IntegerParameterRange objects that specify ranges of integer hyperparameters that a hyperparameter tuning job searches.
         */
    var IntegerParameterRanges: js.UndefOr[IntegerParameterRanges] = js.undefined
  }
  
  
  trait ParentHyperParameterTuningJob extends js.Object {
    /**
         * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
         */
    var HyperParameterTuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined
  }
  
  
  trait ProductionVariant extends js.Object {
    /**
         * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand GPU computing for inference. For more information, see Using Elastic Inference in Amazon SageMaker. For more information, see Using Elastic Inference in Amazon SageMaker.
         */
    var AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType] = js.undefined
    /**
         * Number of instances to launch initially.
         */
    var InitialInstanceCount: TaskCount
    /**
         * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. The traffic to a production variant is determined by the ratio of the VariantWeight to the sum of all VariantWeight values across all ProductionVariants. If unspecified, it defaults to 1.0. 
         */
    var InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined
    /**
         * The ML compute instance type.
         */
    var InstanceType: ProductionVariantInstanceType
    /**
         * The name of the model that you want to host. This is the name that you specified when creating the model.
         */
    var ModelName: ModelName
    /**
         * The name of the production variant.
         */
    var VariantName: VariantName
  }
  
  
  trait ProductionVariantSummary extends js.Object {
    /**
         * The number of instances associated with the variant.
         */
    var CurrentInstanceCount: js.UndefOr[TaskCount] = js.undefined
    /**
         * The weight associated with the variant.
         */
    var CurrentWeight: js.UndefOr[VariantWeight] = js.undefined
    /**
         * An array of DeployedImage objects that specify the Amazon EC2 Container Registry paths of the inference images deployed on instances of this ProductionVariant.
         */
    var DeployedImages: js.UndefOr[DeployedImages] = js.undefined
    /**
         * The number of instances requested in the UpdateEndpointWeightsAndCapacities request. 
         */
    var DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined
    /**
         * The requested weight, as specified in the UpdateEndpointWeightsAndCapacities request. 
         */
    var DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
    /**
         * The name of the variant.
         */
    var VariantName: VariantName
  }
  
  
  trait PropertyNameQuery extends js.Object {
    /**
         * The hyperparameter, metric, and tag key property names that begin with the specified hint.
         */
    var PropertyNameHint: PropertyNameHint
  }
  
  
  trait PropertyNameSuggestion extends js.Object {
    /**
         * A suggested property name.
         */
    var PropertyName: js.UndefOr[ResourcePropertyName] = js.undefined
  }
  
  
  trait PublicWorkforceTaskPrice extends js.Object {
    /**
         * Defines the amount of money paid to a worker in United States dollars.
         */
    var AmountInUsd: js.UndefOr[USD] = js.undefined
  }
  
  
  trait RenderUiTemplateRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
         */
    var RoleArn: RoleArn
    /**
         * A RenderableTask object containing a representative task to render.
         */
    var Task: RenderableTask
    /**
         * A Tempateobject containing the worker UI template to render.
         */
    var UiTemplate: UiTemplate
  }
  
  
  trait RenderUiTemplateResponse extends js.Object {
    /**
         * A list of one or more RenderingError objects if any were encountered while rendering the template. If there were no errors, the list is empty.
         */
    var Errors: RenderingErrorList
    /**
         * A Liquid template that renders the HTML for the worker UI.
         */
    var RenderedContent: String
  }
  
  
  trait RenderableTask extends js.Object {
    /**
         * A JSON object that contains values for the variables defined in the template. It is made available to the template under the substitution variable task.input. For example, if you define a variable task.input.text in your template, you can supply the variable in the JSON object as "text": "sample text".
         */
    var Input: TaskInput
  }
  
  
  trait RenderingError extends js.Object {
    /**
         * A unique identifier for a specific class of errors.
         */
    var Code: String
    /**
         * A human-readable message describing the error.
         */
    var Message: String
  }
  
  
  trait ResourceConfig extends js.Object {
    /**
         * The number of ML compute instances to use. For distributed training, provide a value greater than 1. 
         */
    var InstanceCount: TrainingInstanceCount
    /**
         * The ML compute instance type. 
         */
    var InstanceType: TrainingInstanceType
    /**
         * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the training job. The VolumeKmsKeyId can be any of the following formats:   // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
         */
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
         * The size of the ML storage volume that you want to provision.  ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML storage volume for scratch space. If you want to store the training data in the ML storage volume, choose File as the TrainingInputMode in the algorithm specification.  You must specify sufficient ML storage for your scenario.    Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage volume type.  
         */
    var VolumeSizeInGB: VolumeSizeInGB
  }
  
  
  trait ResourceLimits extends js.Object {
    /**
         * The maximum number of training jobs that a hyperparameter tuning job can launch.
         */
    var MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs
    /**
         * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
         */
    var MaxParallelTrainingJobs: MaxParallelTrainingJobs
  }
  
  
  trait S3DataSource extends js.Object {
    /**
         * A list of one or more attribute names to use that are found in a specified augmented manifest file.
         */
    var AttributeNames: js.UndefOr[AttributeNames] = js.undefined
    /**
         * If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched for model training, specify FullyReplicated.  If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched for model training, specify ShardedByS3Key. If there are n ML compute instances launched for a training job, each instance gets approximately 1/n of the number of S3 objects. In this case, model training on each machine uses only the subset of training data.  Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't get any data and you will pay for nodes that aren't getting any training data. This applies in both File and Pipemodes. Keep this in mind when developing algorithms.  In distributed training, where you use multiple ML compute EC2 instances, you might choose ShardedByS3Key. If the algorithm requires copying training data to the ML storage volume (when TrainingInputMode is set to File), this copies 1/n of the number of objects. 
         */
    var S3DataDistributionType: js.UndefOr[S3DataDistribution] = js.undefined
    /**
         * If you choose S3Prefix, S3Uri identifies a key name prefix. Amazon SageMaker uses all objects that match the specified key name prefix for model training.  If you choose ManifestFile, S3Uri identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to use for model training.  If you choose AugmentedManifestFile, S3Uri identifies an object that is an augmented manifest file in JSON lines format. This file contains the data you want to use for model training. AugmentedManifestFile can only be used if the Channel's input mode is Pipe.
         */
    var S3DataType: S3DataType
    /**
         * Depending on the value specified for the S3DataType, identifies either a key name prefix or a manifest. For example:     A key name prefix might look like this: s3://bucketname/exampleprefix.     A manifest might look like this: s3://bucketname/example.manifest   The manifest is an S3 object which is a JSON file with the following format:   [    {"prefix": "s3://customer_bucket/some/prefix/"},    "relative/path/to/custdata-1",    "relative/path/custdata-2",    ...    ]   The preceding JSON matches the following s3Uris:   s3://customer_bucket/some/prefix/relative/path/to/custdata-1   s3://customer_bucket/some/prefix/relative/path/custdata-1   ...  The complete set of s3uris in this manifest is the input data for the channel for this datasource. The object that each s3uris points to must be readable by the IAM role that Amazon SageMaker uses to perform tasks on your behalf.   
         */
    var S3Uri: S3Uri
  }
  
  
  trait SearchExpression extends js.Object {
    /**
         * A list of filter objects.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * A list of nested filter objects.
         */
    var NestedFilters: js.UndefOr[NestedFiltersList] = js.undefined
    /**
         * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists to be satisfied for the entire search expression to be true, specify And. If only a single conditional statement needs to be true for the entire search expression to be true, specify Or.
         */
    var Operator: js.UndefOr[BooleanOperator] = js.undefined
    /**
         * A list of search expression objects.
         */
    var SubExpressions: js.UndefOr[SearchExpressionList] = js.undefined
  }
  
  
  trait SearchRecord extends js.Object {
    /**
         * A TrainingJob object that is returned as part of a Search request.
         */
    var TrainingJob: js.UndefOr[TrainingJob] = js.undefined
  }
  
  
  trait SearchRequest extends js.Object {
    /**
         * The maximum number of results to return in a SearchResponse.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * If more than MaxResults resource objects match the specified SearchExpression, the SearchResponse includes a NextToken. The NextToken can be passed to the next SearchRequest to continue retrieving results for the specified SearchExpression and Sort parameters.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The name of the Amazon SageMaker resource to search for. Currently, the only valid Resource value is TrainingJob.
         */
    var Resource: ResourceType
    /**
         * A Boolean conditional statement. Resource objects must satisfy this condition to be included in search results.
         */
    var SearchExpression: js.UndefOr[SearchExpression] = js.undefined
    /**
         * The name of the resource property used to sort the SearchResults.
         */
    var SortBy: js.UndefOr[ResourcePropertyName] = js.undefined
    /**
         * How SearchResults are ordered. Valid values are Ascending or Descending.
         */
    var SortOrder: js.UndefOr[SearchSortOrder] = js.undefined
  }
  
  
  trait SearchResponse extends js.Object {
    /**
         * If the result of the previous Search request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of SearchResult objects.
         */
    var Results: js.UndefOr[SearchResultsList] = js.undefined
  }
  
  
  trait SecondaryStatusTransition extends js.Object {
    /**
         * A timestamp that shows when the training job transitioned out of this secondary status state into another secondary status state or when the training job has ended.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * A timestamp that shows when the training job transitioned to the current secondary status state.
         */
    var StartTime: Timestamp
    /**
         * Contains a secondary status information from a training job. Status might be one of the following secondary statuses:  InProgress     Starting - Starting the training job.    Downloading - An optional stage for algorithms that support File training input mode. It indicates that data is being downloaded to the ML storage volumes.    Training - Training is in progress.    Uploading - Training is complete and the model artifacts are being uploaded to the S3 location.    Completed     Completed - The training job has completed.    Failed     Failed - The training job has failed. The reason for the failure is returned in the FailureReason field of DescribeTrainingJobResponse.    Stopped     MaxRuntimeExceeded - The job stopped because it exceeded the maximum allowed runtime.    Stopped - The training job has stopped.    Stopping     Stopping - Stopping the training job.     We no longer support the following secondary statuses:    LaunchingMLInstances     PreparingTrainingStack     DownloadingTrainingImage   
         */
    var Status: SecondaryStatus
    /**
         * A detailed description of the progress within a secondary status.  Amazon SageMaker provides secondary statuses and status messages that apply to each of them:  Starting    Starting the training job.   Launching requested ML instances.   Insufficient capacity error from EC2 while launching instances, retrying!   Launched instance was unhealthy, replacing it!   Preparing the instances for training.    Training    Downloading the training image.   Training image download completed. Training in progress.      Status messages are subject to change. Therefore, we recommend not including them in code that programmatically initiates actions. For examples, don't use status messages in if statements.  To have an overview of your training job's progress, view TrainingJobStatus and SecondaryStatus in DescribeTrainingJobResponse, and StatusMessage together. For example, at the start of a training job, you might see the following:    TrainingJobStatus - InProgress    SecondaryStatus - Training    StatusMessage - Downloading the training image  
         */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
  }
  
  
  trait ShuffleConfig extends js.Object {
    /**
         * Determines the shuffling order in ShuffleConfig. value.
         */
    var Seed: Seed
  }
  
  
  trait SourceAlgorithm extends js.Object {
    /**
         * The name of an algorithm that was used to create the model package. The algorithm must be either an algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
         */
    var AlgorithmName: ArnOrName
    /**
         * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
         */
    var ModelDataUrl: js.UndefOr[Url] = js.undefined
  }
  
  
  trait SourceAlgorithmSpecification extends js.Object {
    /**
         * A list of the algorithms that were used to create a model package.
         */
    var SourceAlgorithms: SourceAlgorithmList
  }
  
  
  trait StartNotebookInstanceInput extends js.Object {
    /**
         * The name of the notebook instance to start.
         */
    var NotebookInstanceName: NotebookInstanceName
  }
  
  
  trait StopCompilationJobRequest extends js.Object {
    /**
         * The name of the model compilation job to stop.
         */
    var CompilationJobName: EntityName
  }
  
  
  trait StopHyperParameterTuningJobRequest extends js.Object {
    /**
         * The name of the tuning job to stop.
         */
    var HyperParameterTuningJobName: HyperParameterTuningJobName
  }
  
  
  trait StopLabelingJobRequest extends js.Object {
    /**
         * The name of the labeling job to stop.
         */
    var LabelingJobName: LabelingJobName
  }
  
  
  trait StopNotebookInstanceInput extends js.Object {
    /**
         * The name of the notebook instance to terminate.
         */
    var NotebookInstanceName: NotebookInstanceName
  }
  
  
  trait StopTrainingJobRequest extends js.Object {
    /**
         * The name of the training job to stop.
         */
    var TrainingJobName: TrainingJobName
  }
  
  
  trait StopTransformJobRequest extends js.Object {
    /**
         * The name of the transform job to stop.
         */
    var TransformJobName: TransformJobName
  }
  
  
  trait StoppingCondition extends js.Object {
    /**
         * The maximum length of time, in seconds, that the training or compilation job can run. If the job does not complete during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. Maximum value is 5 days.
         */
    var MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds] = js.undefined
  }
  
  
  trait SubscribedWorkteam extends js.Object {
    /**
         * 
         */
    var ListingId: js.UndefOr[String] = js.undefined
    /**
         * The description of the vendor from the Amazon Marketplace.
         */
    var MarketplaceDescription: js.UndefOr[String200] = js.undefined
    /**
         * The title of the service provided by the vendor in the Amazon Marketplace.
         */
    var MarketplaceTitle: js.UndefOr[String200] = js.undefined
    /**
         * The name of the vendor in the Amazon Marketplace.
         */
    var SellerName: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
         */
    var WorkteamArn: WorkteamArn
  }
  
  
  trait SuggestionQuery extends js.Object {
    /**
         * Defines a property name hint. Only property names that match the specified hint are included in the response.
         */
    var PropertyNameQuery: js.UndefOr[PropertyNameQuery] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * The tag key.
         */
    var Key: TagKey
    /**
         * The tag value.
         */
    var Value: TagValue
  }
  
  
  trait TrainingJob extends js.Object {
    /**
         * Information about the algorithm used for training, and algorithm metadata.
         */
    var AlgorithmSpecification: js.UndefOr[AlgorithmSpecification] = js.undefined
    /**
         * A timestamp that indicates when the training job was created.
         */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * If the TrainingJob was created with network isolation, the value is set to true. If network isolation is enabled, nodes can't communicate beyond the VPC they run in.
         */
    var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
    /**
         * If the training job failed, the reason it failed.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * A list of final metric values that are set when the Training Job completes. Used only if the training job was configured to use metrics.
         */
    var FinalMetricDataList: js.UndefOr[FinalMetricDataList] = js.undefined
    /**
         * Algorithm-specific parameters.
         */
    var HyperParameters: js.UndefOr[HyperParameters] = js.undefined
    /**
         * An array of Channel objects that describes each data input channel.
         */
    var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the labeling job.
         */
    var LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined
    /**
         * A timestamp that indicates when the status of the training job was last modified.
         */
    var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Information about the Amazon S3 location that is configured for storing model artifacts.
         */
    var ModelArtifacts: js.UndefOr[ModelArtifacts] = js.undefined
    /**
         * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates subfolders for model artifacts.
         */
    var OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
    /**
         * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
         */
    var ResourceConfig: js.UndefOr[ResourceConfig] = js.undefined
    /**
         * The AWS Identity and Access Management (IAM) role configured for the training job.
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         *  Provides detailed information about the state of the training job. For detailed information about the secondary status of the training job, see StatusMessage under SecondaryStatusTransition. Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:  InProgress     Starting - Starting the training job.    Downloading - An optional stage for algorithms that support File training input mode. It indicates that data is being downloaded to the ML storage volumes.    Training - Training is in progress.    Uploading - Training is complete and the model artifacts are being uploaded to the S3 location.    Completed     Completed - The training job has completed.    Failed     Failed - The training job has failed. The reason for the failure is returned in the FailureReason field of DescribeTrainingJobResponse.    Stopped     MaxRuntimeExceeded - The job stopped because it exceeded the maximum allowed runtime.    Stopped - The training job has stopped.    Stopping     Stopping - Stopping the training job.      Valid values for SecondaryStatus are subject to change.   We no longer support the following secondary statuses:    LaunchingMLInstances     PreparingTrainingStack     DownloadingTrainingImage   
         */
    var SecondaryStatus: js.UndefOr[SecondaryStatus] = js.undefined
    /**
         * A history of all of the secondary statuses that the training job has transitioned through.
         */
    var SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions] = js.undefined
    /**
         * The condition under which to stop the training job.
         */
    var StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined
    /**
         * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * Indicates the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job failure.
         */
    var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the training job.
         */
    var TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined
    /**
         * The name of the training job.
         */
    var TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined
    /**
         * The status of the training job. Training job statuses are:    InProgress - The training is in progress.    Completed - The training job has completed.    Failed - The training job has failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeTrainingJobResponse call.    Stopping - The training job is stopping.    Stopped - The training job has stopped.   For more detailed information, see SecondaryStatus. 
         */
    var TrainingJobStatus: js.UndefOr[TrainingJobStatus] = js.undefined
    /**
         * Indicates the time when the training job starts on training instances. You are billed for the time interval between this time and the value of TrainingEndTime. The start time in CloudWatch Logs might be later than this time. The difference is due to the time it takes to download the training data and to the size of the training container.
         */
    var TrainingStartTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a hyperparameter tuning job.
         */
    var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined
    /**
         * A VpcConfig object that specifies the VPC that this training job has access to. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait TrainingJobDefinition extends js.Object {
    /**
         * The hyperparameters used for the training job.
         */
    var HyperParameters: js.UndefOr[HyperParameters] = js.undefined
    /**
         * An array of Channel objects, each of which specifies an input source.
         */
    var InputDataConfig: InputDataConfig
    /**
         * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts.
         */
    var OutputDataConfig: OutputDataConfig
    /**
         * The resources, including the ML compute instances and ML storage volumes, to use for model training.
         */
    var ResourceConfig: ResourceConfig
    /**
         * Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.
         */
    var StoppingCondition: StoppingCondition
    /**
         * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms support, see Algorithms. If an algorithm supports the File input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an algorithm supports the Pipe input mode, Amazon SageMaker streams data directly from S3 to the container.
         */
    var TrainingInputMode: TrainingInputMode
  }
  
  
  trait TrainingJobStatusCounters extends js.Object {
    /**
         * The number of completed training jobs launched by the hyperparameter tuning job.
         */
    var Completed: js.UndefOr[TrainingJobStatusCounter] = js.undefined
    /**
         * The number of in-progress training jobs launched by a hyperparameter tuning job.
         */
    var InProgress: js.UndefOr[TrainingJobStatusCounter] = js.undefined
    /**
         * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed because a client error occurred.
         */
    var NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined
    /**
         * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it failed because an internal service error occurred.
         */
    var RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined
    /**
         * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
         */
    var Stopped: js.UndefOr[TrainingJobStatusCounter] = js.undefined
  }
  
  
  trait TrainingJobSummary extends js.Object {
    /**
         * A timestamp that shows when the training job was created.
         */
    var CreationTime: Timestamp
    /**
         *  Timestamp when the training job was last modified. 
         */
    var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * A timestamp that shows when the training job ended. This field is set only if the training job has one of the terminal statuses (Completed, Failed, or Stopped). 
         */
    var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the training job.
         */
    var TrainingJobArn: TrainingJobArn
    /**
         * The name of the training job that you want a summary for.
         */
    var TrainingJobName: TrainingJobName
    /**
         * The status of the training job.
         */
    var TrainingJobStatus: TrainingJobStatus
  }
  
  
  trait TrainingSpecification extends js.Object {
    /**
         * A list of MetricDefinition objects, which are used for parsing metrics generated by the algorithm.
         */
    var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined
    /**
         * A list of the HyperParameterSpecification objects, that define the supported hyperparameters. This is required if the algorithm supports automatic model tuning.&gt;
         */
    var SupportedHyperParameters: js.UndefOr[HyperParameterSpecifications] = js.undefined
    /**
         * A list of the instance types that this algorithm can use for training.
         */
    var SupportedTrainingInstanceTypes: TrainingInstanceTypes
    /**
         * A list of the metrics that the alogorithm emits that can be used as the objective metric in a hyperparameter tuning job.
         */
    var SupportedTuningJobObjectiveMetrics: js.UndefOr[HyperParameterTuningJobObjectives] = js.undefined
    /**
         * Indicates whether the algorithm supports distributed training. If set to false, buyers can’t request more than one instance during training.
         */
    var SupportsDistributedTraining: js.UndefOr[Boolean] = js.undefined
    /**
         * A list of ChannelSpecification objects, which specify the input sources to be used by the algorithm.
         */
    var TrainingChannels: ChannelSpecifications
    /**
         * The Amazon Amazon ECR registry path of the Docker image that contains the training algorithm.
         */
    var TrainingImage: Image
    /**
         * An MD5 hash of the training algorithm that identifies the Docker image used for training.
         */
    var TrainingImageDigest: js.UndefOr[ImageDigest] = js.undefined
  }
  
  
  trait TransformDataSource extends js.Object {
    /**
         * The S3 location of the data source that is associated with a channel.
         */
    var S3DataSource: TransformS3DataSource
  }
  
  
  trait TransformEnvironmentMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TransformEnvironmentValue]
  
  
  trait TransformInput extends js.Object {
    /**
         * Compressing data helps save on storage space. If your transform data is compressed, specify the compression type. Amazon SageMaker automatically decompresses the data for the transform job accordingly. The default value is None.
         */
    var CompressionType: js.UndefOr[CompressionType] = js.undefined
    /**
         * The multipurpose internet mail extension (MIME) type of the data. Amazon SageMaker uses the MIME type with each http call to transfer data to the transform job.
         */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
         * Describes the location of the channel data, meaning the S3 location of the input data that the model can consume.
         */
    var DataSource: TransformDataSource
    /**
         * The method to use to split the transform job's data into smaller batches. The default value is None. If you don't want to split the data, specify None. If you want to split records on a newline character boundary, specify Line. To split records according to the RecordIO format, specify RecordIO. Amazon SageMaker will send maximum number of records per batch in each request up to the MaxPayloadInMB limit. For more information, see RecordIO data format.  For information about the RecordIO format, see Data Format. 
         */
    var SplitType: js.UndefOr[SplitType] = js.undefined
  }
  
  
  trait TransformJobDefinition extends js.Object {
    /**
         * A string that determines the number of records included in a single mini-batch.  SingleRecord means only one record is used per mini-batch. MultiRecord means a mini-batch is set to contain as many records that can fit within the MaxPayloadInMB limit.
         */
    var BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined
    /**
         * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
         */
    var Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined
    /**
         * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value is 1.
         */
    var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined
    /**
         * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
         */
    var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined
    /**
         * A description of the input source and the way the transform job consumes it.
         */
    var TransformInput: TransformInput
    /**
         * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
         */
    var TransformOutput: TransformOutput
    /**
         * Identifies the ML compute instances for the transform job.
         */
    var TransformResources: TransformResources
  }
  
  
  trait TransformJobSummary extends js.Object {
    /**
         * A timestamp that shows when the transform Job was created.
         */
    var CreationTime: Timestamp
    /**
         * If the transform job failed, the reason it failed.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * Indicates when the transform job was last modified.
         */
    var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that the job failed.
         */
    var TransformEndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the transform job.
         */
    var TransformJobArn: TransformJobArn
    /**
         * The name of the transform job.
         */
    var TransformJobName: TransformJobName
    /**
         * The status of the transform job.
         */
    var TransformJobStatus: TransformJobStatus
  }
  
  
  trait TransformOutput extends js.Object {
    /**
         * The MIME type used to specify the output data. Amazon SageMaker uses the MIME type with each http call to transfer data from the transform job.
         */
    var Accept: js.UndefOr[Accept] = js.undefined
    /**
         * Defines how to assemble the results of the transform job as a single S3 object. You should select a format that is most convenient to you. To concatenate the results in binary format, specify None. To add a newline character at the end of every transformed record, specify Line.
         */
    var AssembleWith: js.UndefOr[AssemblyType] = js.undefined
    /**
         * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption. The KmsKeyId can be any of the following formats:    // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"    // KMS Key Alias  "alias/ExampleAlias"    // Amazon Resource Name (ARN) of a KMS Key Alias  "arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"    If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more information, see KMS-Managed Encryption Keys in the Amazon Simple Storage Service Developer Guide.  The KMS key policy must grant permission to the IAM role that you specify in your CreateTramsformJob request. For more information, see Using Key Policies in AWS KMS in the AWS Key Management Service Developer Guide.
         */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
         * The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job. For example, s3://bucket-name/key-name-prefix. For every S3 object used as input for the transform job, the transformed data is stored in a corresponding subfolder in the location under the output prefix. For example, the input data s3://bucket-name/input-name-prefix/dataset01/data.csv will have the transformed data stored at s3://bucket-name/key-name-prefix/dataset01/, based on the original name, as a series of .part files (.part0001, part0002, etc).
         */
    var S3OutputPath: S3Uri
  }
  
  
  trait TransformResources extends js.Object {
    /**
         * The number of ML compute instances to use in the transform job. For distributed transform, provide a value greater than 1. The default value is 1.
         */
    var InstanceCount: TransformInstanceCount
    /**
         * The ML compute instance type for the transform job. For using built-in algorithms to transform moderately sized datasets, ml.m4.xlarge or ml.m5.large should suffice. There is no default value for InstanceType.
         */
    var InstanceType: TransformInstanceType
    /**
         * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the batch transform job. The VolumeKmsKeyId can be any of the following formats:   // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
         */
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  }
  
  
  trait TransformS3DataSource extends js.Object {
    /**
         * If you choose S3Prefix, S3Uri identifies a key name prefix. Amazon SageMaker uses all objects with the specified key name prefix for batch transform.  If you choose ManifestFile, S3Uri identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to use for batch transform. 
         */
    var S3DataType: S3DataType
    /**
         * Depending on the value specified for the S3DataType, identifies either a key name prefix or a manifest. For example:    A key name prefix might look like this: s3://bucketname/exampleprefix.     A manifest might look like this: s3://bucketname/example.manifest   The manifest is an S3 object which is a JSON file with the following format:   [    {"prefix": "s3://customer_bucket/some/prefix/"},    "relative/path/to/custdata-1",    "relative/path/custdata-2",    ...    ]   The preceding JSON matches the following S3Uris:   s3://customer_bucket/some/prefix/relative/path/to/custdata-1   s3://customer_bucket/some/prefix/relative/path/custdata-1   ...   The complete set of S3Uris in this manifest constitutes the input data for the channel for this datasource. The object that each S3Uris points to must be readable by the IAM role that Amazon SageMaker uses to perform tasks on your behalf.  
         */
    var S3Uri: S3Uri
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
       */
    def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
       */
    def addTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
       */
    def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
       */
    def addTags(
      params: AddTagsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
       */
    def createAlgorithm(): awsDashSdkLib.libRequestMod.Request[CreateAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
       */
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
    /**
       * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
       */
    def createAlgorithm(
      params: CreateAlgorithmInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAlgorithmOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use git source control for the notebooks you create. The git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other git repository.
       */
    def createCodeRepository(): awsDashSdkLib.libRequestMod.Request[CreateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use git source control for the notebooks you create. The git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other git repository.
       */
    def createCodeRepository(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCodeRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use git source control for the notebooks you create. The git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other git repository.
       */
    def createCodeRepository(params: CreateCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[CreateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use git source control for the notebooks you create. The git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other git repository.
       */
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
    /**
       * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
       */
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
    /**
       * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
       */
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
    /**
       * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
       */
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
    /**
       * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.    Use this API only for hosting models using Amazon SageMaker hosting services.   The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon SageMaker.  If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
       */
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
    /**
       * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
       */
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
    /**
       * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define one or more ProductionVariants, each of which identifies a model. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B. 
       */
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
    /**
       * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
       */
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
    /**
       * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
       */
    def createHyperParameterTuningJob(
      params: CreateHyperParameterTuningJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHyperParameterTuningJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a job that uses human workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when the data is highly confidential or a specific set of skills is required.   One or more vendors that you select from the Amazon Marketplace. Vendors provide expertise in specific areas. Vendors are selected by AWS and meet a minimum standard of data security requirements.   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
       */
    def createLabelingJob(): awsDashSdkLib.libRequestMod.Request[CreateLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a job that uses human workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when the data is highly confidential or a specific set of skills is required.   One or more vendors that you select from the Amazon Marketplace. Vendors provide expertise in specific areas. Vendors are selected by AWS and meet a minimum standard of data security requirements.   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
       */
    def createLabelingJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLabelingJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a job that uses human workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when the data is highly confidential or a specific set of skills is required.   One or more vendors that you select from the Amazon Marketplace. Vendors provide expertise in specific areas. Vendors are selected by AWS and meet a minimum standard of data security requirements.   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
       */
    def createLabelingJob(params: CreateLabelingJobRequest): awsDashSdkLib.libRequestMod.Request[CreateLabelingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a job that uses human workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when the data is highly confidential or a specific set of skills is required.   One or more vendors that you select from the Amazon Marketplace. Vendors provide expertise in specific areas. Vendors are selected by AWS and meet a minimum standard of data security requirements.   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
       */
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
    /**
       * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
       */
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
    /**
       * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the docker image containing inference code, artifacts (from prior training), and custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
       */
    def createModel(
      params: CreateModelInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
       */
    def createModelPackage(): awsDashSdkLib.libRequestMod.Request[CreateModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
       */
    def createModelPackage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateModelPackageOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
       */
    def createModelPackage(params: CreateModelPackageInput): awsDashSdkLib.libRequestMod.Request[CreateModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
       */
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
    /**
       * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
       */
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
    /**
       * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
       */
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
    /**
       * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
       */
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
    /**
       * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
       */
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
    /**
       * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.
       */
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
    /**
       * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.
       */
    def createPresignedNotebookInstanceUrl(
      params: CreatePresignedNotebookInstanceUrlInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePresignedNotebookInstanceUrlOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePresignedNotebookInstanceUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a deep learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
       */
    def createTrainingJob(): awsDashSdkLib.libRequestMod.Request[CreateTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a deep learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
       */
    def createTrainingJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrainingJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a deep learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
       */
    def createTrainingJob(params: CreateTrainingJobRequest): awsDashSdkLib.libRequestMod.Request[CreateTrainingJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a deep learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to influence the quality of the final model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.    OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - Sets a duration for training. Use this parameter to cap model training costs.     For more information about Amazon SageMaker, see How It Works. 
       */
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
    /**
       * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
       */
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
    /**
       * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.    For more information about how batch transformation works Amazon SageMaker, see How It Works. 
       */
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
    /**
       * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
       */
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
    /**
       * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
       */
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
    /**
       * Removes the specified algorithm from your account.
       */
    def deleteAlgorithm(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified algorithm from your account.
       */
    def deleteAlgorithm(params: DeleteAlgorithmInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified algorithm from your account.
       */
    def deleteAlgorithm(
      params: DeleteAlgorithmInput,
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
    def deleteCodeRepository(params: DeleteCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified git repository from your account.
       */
    def deleteCodeRepository(
      params: DeleteCodeRepositoryInput,
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
    def deleteEndpoint(params: DeleteEndpointInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
       */
    def deleteEndpoint(
      params: DeleteEndpointInput,
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
    def deleteEndpointConfig(params: DeleteEndpointConfigInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
       */
    def deleteEndpointConfig(
      params: DeleteEndpointConfigInput,
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
    def deleteModel(params: DeleteModelInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
       */
    def deleteModel(
      params: DeleteModelInput,
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
    def deleteModelPackage(params: DeleteModelPackageInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
       */
    def deleteModelPackage(
      params: DeleteModelPackageInput,
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
    def deleteNotebookInstance(params: DeleteNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
       */
    def deleteNotebookInstance(
      params: DeleteNotebookInstanceInput,
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
    def deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a notebook instance lifecycle configuration.
       */
    def deleteNotebookInstanceLifecycleConfig(
      params: DeleteNotebookInstanceLifecycleConfigInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
       */
    def deleteTags(): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
       */
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
    /**
       * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
       */
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
    /**
       * Deletes an existing work team. This operation can't be undone.
       */
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
    /**
       * Deletes an existing work team. This operation can't be undone.
       */
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
    /**
       * Returns a description of the specified algorithm that is in your account.
       */
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
    /**
       * Returns a description of the specified algorithm that is in your account.
       */
    def describeAlgorithm(
      params: DescribeAlgorithmInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAlgorithmOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlgorithmOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets details about the specified git repository.
       */
    def describeCodeRepository(): awsDashSdkLib.libRequestMod.Request[DescribeCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets details about the specified git repository.
       */
    def describeCodeRepository(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCodeRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets details about the specified git repository.
       */
    def describeCodeRepository(params: DescribeCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[DescribeCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets details about the specified git repository.
       */
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
    /**
       * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
       */
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
    /**
       * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
       */
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
    /**
       * Returns the description of an endpoint.
       */
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
    /**
       * Returns the description of an endpoint.
       */
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
    /**
       * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
       */
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
    /**
       * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
       */
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
    /**
       * Gets a description of a hyperparameter tuning job.
       */
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
    /**
       * Gets a description of a hyperparameter tuning job.
       */
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
    /**
       * Gets information about a labeling job.
       */
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
    /**
       * Gets information about a labeling job.
       */
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
    /**
       * Describes a model that you created using the CreateModel API.
       */
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
    /**
       * Describes a model that you created using the CreateModel API.
       */
    def describeModel(
      params: DescribeModelInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
       */
    def describeModelPackage(): awsDashSdkLib.libRequestMod.Request[DescribeModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
       */
    def describeModelPackage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeModelPackageOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
       */
    def describeModelPackage(params: DescribeModelPackageInput): awsDashSdkLib.libRequestMod.Request[DescribeModelPackageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
       */
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
    /**
       * Returns information about a notebook instance.
       */
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
    /**
       * Returns information about a notebook instance.
       */
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
    /**
       * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
       */
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
    /**
       * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
       */
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
    /**
       * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
       */
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
    /**
       * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
       */
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
    /**
       * Returns information about a training job.
       */
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
    /**
       * Returns information about a training job.
       */
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
    /**
       * Returns information about a transform job.
       */
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
    /**
       * Returns information about a transform job.
       */
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
    /**
       * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
       */
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
    /**
       * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
       */
    def describeWorkteam(
      params: DescribeWorkteamRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkteamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkteamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns suggestions for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
       */
    def getSearchSuggestions(): awsDashSdkLib.libRequestMod.Request[GetSearchSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns suggestions for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
       */
    def getSearchSuggestions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSearchSuggestionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSearchSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns suggestions for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
       */
    def getSearchSuggestions(params: GetSearchSuggestionsRequest): awsDashSdkLib.libRequestMod.Request[GetSearchSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns suggestions for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
       */
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
    /**
       * Lists the machine learning algorithms that have been created.
       */
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
    /**
       * Lists the machine learning algorithms that have been created.
       */
    def listAlgorithms(
      params: ListAlgorithmsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAlgorithmsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAlgorithmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of the git repositories in your account.
       */
    def listCodeRepositories(): awsDashSdkLib.libRequestMod.Request[ListCodeRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of the git repositories in your account.
       */
    def listCodeRepositories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCodeRepositoriesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCodeRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of the git repositories in your account.
       */
    def listCodeRepositories(params: ListCodeRepositoriesInput): awsDashSdkLib.libRequestMod.Request[ListCodeRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of the git repositories in your account.
       */
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
    /**
       * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
       */
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
    /**
       * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
       */
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
    /**
       * Lists endpoint configurations.
       */
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
    /**
       * Lists endpoint configurations.
       */
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
    /**
       * Lists endpoints.
       */
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
    /**
       * Lists endpoints.
       */
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
    /**
       * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
       */
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
    /**
       * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
       */
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
    /**
       * Gets a list of labeling jobs.
       */
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
    /**
       * Gets a list of labeling jobs.
       */
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
    /**
       * Gets a list of labeling jobs assigned to a specified work team.
       */
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
    /**
       * Gets a list of labeling jobs assigned to a specified work team.
       */
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
    /**
       * Lists the model packages that have been created.
       */
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
    /**
       * Lists the model packages that have been created.
       */
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
    /**
       * Lists models created with the CreateModel API.
       */
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
    /**
       * Lists models created with the CreateModel API.
       */
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
    /**
       * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
       */
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
    /**
       * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
       */
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
    /**
       * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
       */
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
    /**
       * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
       */
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
    /**
       * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
       */
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
    /**
       * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
       */
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
    /**
       * Returns the tags for the specified Amazon SageMaker resource.
       */
    def listTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the tags for the specified Amazon SageMaker resource.
       */
    def listTags(params: ListTagsInput): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the tags for the specified Amazon SageMaker resource.
       */
    def listTags(
      params: ListTagsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists training jobs.
       */
    def listTrainingJobs(): awsDashSdkLib.libRequestMod.Request[ListTrainingJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists training jobs.
       */
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
    /**
       * Lists training jobs.
       */
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
    /**
       * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
       */
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
    /**
       * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
       */
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
    /**
       * Lists transform jobs.
       */
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
    /**
       * Lists transform jobs.
       */
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
    /**
       * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
       */
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
    /**
       * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
       */
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
    /**
       * Renders the UI template so that you can preview the worker's experience. 
       */
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
    /**
       * Renders the UI template so that you can preview the worker's experience. 
       */
    def renderUiTemplate(
      params: RenderUiTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RenderUiTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RenderUiTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. The search results can be sorted by any resrouce property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
       */
    def search(): awsDashSdkLib.libRequestMod.Request[SearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. The search results can be sorted by any resrouce property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
       */
    def search(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SearchResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. The search results can be sorted by any resrouce property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
       */
    def search(params: SearchRequest): awsDashSdkLib.libRequestMod.Request[SearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of SearchResult objects in the response. The search results can be sorted by any resrouce property in a ascending or descending order. You can query against the following value types: numerical, text, Booleans, and timestamps.
       */
    def search(
      params: SearchRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SearchResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def startNotebookInstance(params: StartNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
       */
    def startNotebookInstance(
      params: StartNotebookInstanceInput,
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
    def stopCompilationJob(params: StopCompilationJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn’t stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
       */
    def stopCompilationJob(
      params: StopCompilationJobRequest,
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
    def stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
       */
    def stopHyperParameterTuningJob(
      params: StopHyperParameterTuningJobRequest,
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
    def stopLabelingJob(params: StopLabelingJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
       */
    def stopLabelingJob(
      params: StopLabelingJobRequest,
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
    def stopNotebookInstance(params: StopNotebookInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume.  To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
       */
    def stopNotebookInstance(
      params: StopNotebookInstanceInput,
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
    def stopTrainingJob(params: StopTrainingJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  Training algorithms provided by Amazon SageMaker save the intermediate results of a model training job. This intermediate data is a valid model artifact. You can use the model artifacts that are saved when Amazon SageMaker stops a training job to create a model.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
       */
    def stopTrainingJob(
      params: StopTrainingJobRequest,
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
    def stopTransformJob(params: StopTransformJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
       */
    def stopTransformJob(
      params: StopTransformJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified git repository with the specified values.
       */
    def updateCodeRepository(): awsDashSdkLib.libRequestMod.Request[UpdateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified git repository with the specified values.
       */
    def updateCodeRepository(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCodeRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified git repository with the specified values.
       */
    def updateCodeRepository(params: UpdateCodeRepositoryInput): awsDashSdkLib.libRequestMod.Request[UpdateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified git repository with the specified values.
       */
    def updateCodeRepository(
      params: UpdateCodeRepositoryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCodeRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCodeRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
       */
    def updateEndpoint(): awsDashSdkLib.libRequestMod.Request[UpdateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
       */
    def updateEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEndpointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
       */
    def updateEndpoint(params: UpdateEndpointInput): awsDashSdkLib.libRequestMod.Request[UpdateEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You cannot update an endpoint with the current EndpointConfig. To update an endpoint, you must create a new EndpointConfig. 
       */
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
    /**
       * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
       */
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
    /**
       * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
       */
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
    /**
       * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC security groups.
       */
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
    /**
       * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC security groups.
       */
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
    /**
       * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
       */
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
    /**
       * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
       */
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
    /**
       * Updates an existing work team with new member definitions or description.
       */
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
    /**
       * Updates an existing work team with new member definitions or description.
       */
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
    /**
       * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
       */
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
    /**
       * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
       */
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
    /**
       * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
       */
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
    /**
       * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
       */
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
    /**
       * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
       */
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
    /**
       * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
       */
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
    /**
       * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
       */
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
    /**
       * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
       */
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
    /**
       * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
       */
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
    /**
       * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
       */
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
    /**
       * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
       */
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
    /**
       * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
       */
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
    /**
       * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
       */
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
    /**
       * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
       */
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
  
  
  trait USD extends js.Object {
    /**
         * The fractional portion, in cents, of the amount. 
         */
    var Cents: js.UndefOr[Cents] = js.undefined
    /**
         * The whole number of dollars in the amount.
         */
    var Dollars: js.UndefOr[Dollars] = js.undefined
    /**
         * Fractions of a cent, in tenths.
         */
    var TenthFractionsOfACent: js.UndefOr[TenthFractionsOfACent] = js.undefined
  }
  
  
  trait UiConfig extends js.Object {
    /**
         * The Amazon S3 bucket location of the UI template.
         */
    var UiTemplateS3Uri: S3Uri
  }
  
  
  trait UiTemplate extends js.Object {
    /**
         * The content of the Liquid template for the worker user interface.
         */
    var Content: TemplateContent
  }
  
  
  trait UpdateCodeRepositoryInput extends js.Object {
    /**
         * The name of the git repository to update.
         */
    var CodeRepositoryName: EntityName
    /**
         * The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
         */
    var GitConfig: js.UndefOr[GitConfigForUpdate] = js.undefined
  }
  
  
  trait UpdateCodeRepositoryOutput extends js.Object {
    /**
         * The ARN of the git repository.
         */
    var CodeRepositoryArn: CodeRepositoryArn
  }
  
  
  trait UpdateEndpointInput extends js.Object {
    /**
         * The name of the new endpoint configuration.
         */
    var EndpointConfigName: EndpointConfigName
    /**
         * The name of the endpoint whose configuration you want to update.
         */
    var EndpointName: EndpointName
  }
  
  
  trait UpdateEndpointOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the endpoint.
         */
    var EndpointArn: EndpointArn
  }
  
  
  trait UpdateEndpointWeightsAndCapacitiesInput extends js.Object {
    /**
         * An object that provides new capacity and weight values for a variant.
         */
    var DesiredWeightsAndCapacities: DesiredWeightAndCapacityList
    /**
         * The name of an existing Amazon SageMaker endpoint.
         */
    var EndpointName: EndpointName
  }
  
  
  trait UpdateEndpointWeightsAndCapacitiesOutput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the updated endpoint.
         */
    var EndpointArn: EndpointArn
  }
  
  
  trait UpdateNotebookInstanceInput extends js.Object {
    /**
         * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
         */
    var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined
    /**
         * An array of up to 3 git repositories to associate with the notebook instance. These can be either the names of git repositories stored as resources in your account, or the URL of git repositories in AWS CodeCommit or in any other git repository.. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
         */
    var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined
    /**
         * The git repository to associate with the notebook instance as its default code repository. This can be either the name of a git repository stored as a resource in your account, or the URL of a git repository in AWS CodeCommit or in any other git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
         */
    var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
    /**
         * A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
         */
    var DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes] = js.undefined
    /**
         * A list of names or URLs of the default git repositories to remove from this notebook instance.
         */
    var DisassociateAdditionalCodeRepositories: js.UndefOr[DisassociateAdditionalCodeRepositories] = js.undefined
    /**
         * The name or URL of the default git repository to remove from this notebook instance.
         */
    var DisassociateDefaultCodeRepository: js.UndefOr[DisassociateDefaultCodeRepository] = js.undefined
    /**
         * Set to true to remove the notebook instance lifecycle configuration currently associated with the notebook instance.
         */
    var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.undefined
    /**
         * The Amazon ML compute instance type.
         */
    var InstanceType: js.UndefOr[InstanceType] = js.undefined
    /**
         * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
         */
    var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
    /**
         * The name of the notebook instance to update.
         */
    var NotebookInstanceName: NotebookInstanceName
    /**
         * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
         */
    var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
  }
  
  
  trait UpdateNotebookInstanceLifecycleConfigInput extends js.Object {
    /**
         * The name of the lifecycle configuration.
         */
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    /**
         * The shell script that runs only once, when you create a notebook instance
         */
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
    /**
         * The shell script that runs every time you start a notebook instance, including when you create the notebook instance.
         */
    var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
  }
  
  
  trait UpdateNotebookInstanceLifecycleConfigOutput extends js.Object
  
  
  trait UpdateNotebookInstanceOutput extends js.Object
  
  
  trait UpdateWorkteamRequest extends js.Object {
    /**
         * An updated description for the work team.
         */
    var Description: js.UndefOr[String200] = js.undefined
    /**
         * A list of MemberDefinition objects that contain the updated work team members.
         */
    var MemberDefinitions: js.UndefOr[MemberDefinitions] = js.undefined
    /**
         * The name of the work team to update.
         */
    var WorkteamName: WorkteamName
  }
  
  
  trait UpdateWorkteamResponse extends js.Object {
    /**
         * A Workteam object that describes the updated work team.
         */
    var Workteam: Workteam
  }
  
  
  trait VpcConfig extends js.Object {
    /**
         * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
         */
    var SecurityGroupIds: VpcSecurityGroupIds
    /**
         * The ID of the subnets in the VPC to which you want to connect your training job or model. 
         */
    var Subnets: Subnets
  }
  
  
  trait Workteam extends js.Object {
    /**
         * The date and time that the work team was created (timestamp).
         */
    var CreateDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * A description of the work team.
         */
    var Description: String200
    /**
         * The date and time that the work team was last updated (timestamp).
         */
    var LastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Cognito user groups that make up the work team.
         */
    var MemberDefinitions: MemberDefinitions
    /**
         * The Amazon Marketplace identifier for a vendor's work team.
         */
    var ProductListingIds: js.UndefOr[ProductListings] = js.undefined
    /**
         * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
         */
    var SubDomain: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that identifies the work team.
         */
    var WorkteamArn: WorkteamArn
    /**
         * The name of the work team.
         */
    var WorkteamName: WorkteamName
  }
  
  val TypesNs: this.type = js.native
  type Accept = java.lang.String
  type AccountId = java.lang.String
  type AdditionalCodeRepositoryNamesOrUrls = js.Array[CodeRepositoryNameOrUrl]
  type AlgorithmArn = java.lang.String
  type AlgorithmImage = java.lang.String
  type AlgorithmSortBy = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | java.lang.String
  type AlgorithmStatus = awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Deleting | java.lang.String
  type AlgorithmStatusItemList = js.Array[AlgorithmStatusItem]
  type AlgorithmSummaryList = js.Array[AlgorithmSummary]
  type AlgorithmValidationProfiles = js.Array[AlgorithmValidationProfile]
  type ArnOrName = java.lang.String
  type AssemblyType = awsDashSdkLib.awsDashSdkLibStrings.None | awsDashSdkLib.awsDashSdkLibStrings.Line | java.lang.String
  type AttributeName = java.lang.String
  type AttributeNames = js.Array[AttributeName]
  type BatchStrategy = awsDashSdkLib.awsDashSdkLibStrings.MultiRecord | awsDashSdkLib.awsDashSdkLibStrings.SingleRecord | java.lang.String
  type Boolean = scala.Boolean
  type BooleanOperator = awsDashSdkLib.awsDashSdkLibStrings.And | awsDashSdkLib.awsDashSdkLibStrings.Or | java.lang.String
  type Branch = java.lang.String
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type Cents = scala.Double
  type CertifyForMarketplace = scala.Boolean
  type ChannelName = java.lang.String
  type ChannelSpecifications = js.Array[ChannelSpecification]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CodeRepositoryArn = java.lang.String
  type CodeRepositoryContains = java.lang.String
  type CodeRepositoryNameContains = java.lang.String
  type CodeRepositoryNameOrUrl = java.lang.String
  type CodeRepositorySortBy = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | awsDashSdkLib.awsDashSdkLibStrings.LastModifiedTime | java.lang.String
  type CodeRepositorySortOrder = awsDashSdkLib.awsDashSdkLibStrings.Ascending | awsDashSdkLib.awsDashSdkLibStrings.Descending | java.lang.String
  type CodeRepositorySummaryList = js.Array[CodeRepositorySummary]
  type CognitoClientId = java.lang.String
  type CognitoUserGroup = java.lang.String
  type CognitoUserPool = java.lang.String
  type CompilationJobArn = java.lang.String
  type CompilationJobStatus = awsDashSdkLib.awsDashSdkLibStrings.INPROGRESS | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.STARTING | awsDashSdkLib.awsDashSdkLibStrings.STOPPING | awsDashSdkLib.awsDashSdkLibStrings.STOPPED | java.lang.String
  type CompilationJobSummaries = js.Array[CompilationJobSummary]
  type CompressionType = awsDashSdkLib.awsDashSdkLibStrings.None | awsDashSdkLib.awsDashSdkLibStrings.Gzip | java.lang.String
  type CompressionTypes = js.Array[CompressionType]
  type ContainerDefinitionList = js.Array[ContainerDefinition]
  type ContainerHostname = java.lang.String
  type ContentClassifier = awsDashSdkLib.awsDashSdkLibStrings.FreeOfPersonallyIdentifiableInformation | awsDashSdkLib.awsDashSdkLibStrings.FreeOfAdultContent | java.lang.String
  type ContentClassifiers = js.Array[ContentClassifier]
  type ContentType = java.lang.String
  type ContentTypes = js.Array[ContentType]
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type CreationTime = stdLib.Date
  type DataInputConfig = java.lang.String
  type DeployedImages = js.Array[DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[DesiredWeightAndCapacity]
  type DetailedAlgorithmStatus = awsDashSdkLib.awsDashSdkLibStrings.NotStarted | awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type DetailedModelPackageStatus = awsDashSdkLib.awsDashSdkLibStrings.NotStarted | awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type DirectInternetAccess = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Disabled | java.lang.String
  type DisassociateAdditionalCodeRepositories = scala.Boolean
  type DisassociateDefaultCodeRepository = scala.Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = scala.Boolean
  type DisassociateNotebookInstanceLifecycleConfig = scala.Boolean
  type Dollars = scala.Double
  type EndpointArn = java.lang.String
  type EndpointConfigArn = java.lang.String
  type EndpointConfigName = java.lang.String
  type EndpointConfigNameContains = java.lang.String
  type EndpointConfigSortKey = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | java.lang.String
  type EndpointConfigSummaryList = js.Array[EndpointConfigSummary]
  type EndpointName = java.lang.String
  type EndpointNameContains = java.lang.String
  type EndpointSortKey = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | awsDashSdkLib.awsDashSdkLibStrings.Status | java.lang.String
  type EndpointStatus = awsDashSdkLib.awsDashSdkLibStrings.OutOfService | awsDashSdkLib.awsDashSdkLibStrings.Creating | awsDashSdkLib.awsDashSdkLibStrings.Updating | awsDashSdkLib.awsDashSdkLibStrings.SystemUpdating | awsDashSdkLib.awsDashSdkLibStrings.RollingBack | awsDashSdkLib.awsDashSdkLibStrings.InService | awsDashSdkLib.awsDashSdkLibStrings.Deleting | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type EndpointSummaryList = js.Array[EndpointSummary]
  type EntityDescription = java.lang.String
  type EntityName = java.lang.String
  type EnvironmentKey = java.lang.String
  type EnvironmentValue = java.lang.String
  type FailureReason = java.lang.String
  type FilterList = js.Array[Filter]
  type FilterValue = java.lang.String
  type FinalMetricDataList = js.Array[MetricData]
  type Float = scala.Double
  type Framework = awsDashSdkLib.awsDashSdkLibStrings.TENSORFLOW | awsDashSdkLib.awsDashSdkLibStrings.MXNET | awsDashSdkLib.awsDashSdkLibStrings.ONNX | awsDashSdkLib.awsDashSdkLibStrings.PYTORCH | awsDashSdkLib.awsDashSdkLibStrings.XGBOOST | java.lang.String
  type HyperParameterSpecifications = js.Array[HyperParameterSpecification]
  type HyperParameterTrainingJobSummaries = js.Array[HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = java.lang.String
  type HyperParameterTuningJobName = java.lang.String
  type HyperParameterTuningJobObjectiveType = awsDashSdkLib.awsDashSdkLibStrings.Maximize | awsDashSdkLib.awsDashSdkLibStrings.Minimize | java.lang.String
  type HyperParameterTuningJobObjectives = js.Array[HyperParameterTuningJobObjective]
  type HyperParameterTuningJobSortByOptions = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.Status | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | java.lang.String
  type HyperParameterTuningJobStatus = awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Stopped | awsDashSdkLib.awsDashSdkLibStrings.Stopping | java.lang.String
  type HyperParameterTuningJobStrategyType = awsDashSdkLib.awsDashSdkLibStrings.Bayesian | java.lang.String
  type HyperParameterTuningJobSummaries = js.Array[HyperParameterTuningJobSummary]
  type HyperParameterTuningJobWarmStartType = awsDashSdkLib.awsDashSdkLibStrings.IdenticalDataAndAlgorithm | awsDashSdkLib.awsDashSdkLibStrings.TransferLearning | java.lang.String
  type Image = java.lang.String
  type ImageDigest = java.lang.String
  type InputDataConfig = js.Array[Channel]
  type InputModes = js.Array[TrainingInputMode]
  type InstanceType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTmedium | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt3DOTmedium | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt3DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt3DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt3DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOT9xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOT18xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge | java.lang.String
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type JobReferenceCode = java.lang.String
  type JobReferenceCodeContains = java.lang.String
  type KmsKeyId = java.lang.String
  type LabelAttributeName = java.lang.String
  type LabelCounter = scala.Double
  type LabelingJobAlgorithmSpecificationArn = java.lang.String
  type LabelingJobArn = java.lang.String
  type LabelingJobForWorkteamSummaryList = js.Array[LabelingJobForWorkteamSummary]
  type LabelingJobName = java.lang.String
  type LabelingJobStatus = awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Stopping | awsDashSdkLib.awsDashSdkLibStrings.Stopped | java.lang.String
  type LabelingJobSummaryList = js.Array[LabelingJobSummary]
  type LambdaFunctionArn = java.lang.String
  type LastModifiedTime = stdLib.Date
  type ListLabelingJobsForWorkteamSortByOptions = awsDashSdkLib.awsDashSdkLibStrings.CreationTime | java.lang.String
  type ListTagsMaxResults = scala.Double
  type ListWorkteamsSortByOptions = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreateDate | java.lang.String
  type MaxConcurrentTaskCount = scala.Double
  type MaxConcurrentTransforms = scala.Double
  type MaxHumanLabeledObjectCount = scala.Double
  type MaxNumberOfTrainingJobs = scala.Double
  type MaxParallelTrainingJobs = scala.Double
  type MaxPayloadInMB = scala.Double
  type MaxPercentageOfInputDatasetLabeled = scala.Double
  type MaxResults = scala.Double
  type MaxRuntimeInSeconds = scala.Double
  type MemberDefinitions = js.Array[MemberDefinition]
  type MetricDefinitionList = js.Array[MetricDefinition]
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = scala.Double
  type ModelArn = java.lang.String
  type ModelName = java.lang.String
  type ModelNameContains = java.lang.String
  type ModelPackageArn = java.lang.String
  type ModelPackageContainerDefinitionList = js.Array[ModelPackageContainerDefinition]
  type ModelPackageSortBy = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | java.lang.String
  type ModelPackageStatus = awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Deleting | java.lang.String
  type ModelPackageStatusItemList = js.Array[ModelPackageStatusItem]
  type ModelPackageSummaryList = js.Array[ModelPackageSummary]
  type ModelPackageValidationProfiles = js.Array[ModelPackageValidationProfile]
  type ModelSortKey = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | java.lang.String
  type ModelSummaryList = js.Array[ModelSummary]
  type NameContains = java.lang.String
  type NestedFiltersList = js.Array[NestedFilters]
  type NetworkInterfaceId = java.lang.String
  type NextToken = java.lang.String
  type NotebookInstanceAcceleratorType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTmedium | awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTxlarge | java.lang.String
  type NotebookInstanceAcceleratorTypes = js.Array[NotebookInstanceAcceleratorType]
  type NotebookInstanceArn = java.lang.String
  type NotebookInstanceLifecycleConfigArn = java.lang.String
  type NotebookInstanceLifecycleConfigContent = java.lang.String
  type NotebookInstanceLifecycleConfigList = js.Array[NotebookInstanceLifecycleHook]
  type NotebookInstanceLifecycleConfigName = java.lang.String
  type NotebookInstanceLifecycleConfigNameContains = java.lang.String
  type NotebookInstanceLifecycleConfigSortKey = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | awsDashSdkLib.awsDashSdkLibStrings.LastModifiedTime | java.lang.String
  type NotebookInstanceLifecycleConfigSortOrder = awsDashSdkLib.awsDashSdkLibStrings.Ascending | awsDashSdkLib.awsDashSdkLibStrings.Descending | java.lang.String
  type NotebookInstanceLifecycleConfigSummaryList = js.Array[NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName = java.lang.String
  type NotebookInstanceNameContains = java.lang.String
  type NotebookInstanceSortKey = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | awsDashSdkLib.awsDashSdkLibStrings.Status | java.lang.String
  type NotebookInstanceSortOrder = awsDashSdkLib.awsDashSdkLibStrings.Ascending | awsDashSdkLib.awsDashSdkLibStrings.Descending | java.lang.String
  type NotebookInstanceStatus = awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.InService | awsDashSdkLib.awsDashSdkLibStrings.Stopping | awsDashSdkLib.awsDashSdkLibStrings.Stopped | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Deleting | awsDashSdkLib.awsDashSdkLibStrings.Updating | java.lang.String
  type NotebookInstanceSummaryList = js.Array[NotebookInstanceSummary]
  type NotebookInstanceUrl = java.lang.String
  type NotebookInstanceVolumeSizeInGB = scala.Double
  type NumberOfHumanWorkersPerDataObject = scala.Double
  type ObjectiveStatus = awsDashSdkLib.awsDashSdkLibStrings.Succeeded | awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type ObjectiveStatusCounter = scala.Double
  type Operator = awsDashSdkLib.awsDashSdkLibStrings.Equals | awsDashSdkLib.awsDashSdkLibStrings.NotEquals | awsDashSdkLib.awsDashSdkLibStrings.GreaterThan | awsDashSdkLib.awsDashSdkLibStrings.GreaterThanOrEqualTo | awsDashSdkLib.awsDashSdkLibStrings.LessThan | awsDashSdkLib.awsDashSdkLibStrings.LessThanOrEqualTo | awsDashSdkLib.awsDashSdkLibStrings.Contains | java.lang.String
  type OrderKey = awsDashSdkLib.awsDashSdkLibStrings.Ascending | awsDashSdkLib.awsDashSdkLibStrings.Descending | java.lang.String
  type PaginationToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterName = java.lang.String
  type ParameterType = awsDashSdkLib.awsDashSdkLibStrings.Integer | awsDashSdkLib.awsDashSdkLibStrings.Continuous | awsDashSdkLib.awsDashSdkLibStrings.Categorical | awsDashSdkLib.awsDashSdkLibStrings.FreeText | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValues = js.Array[ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[ParentHyperParameterTuningJob]
  type ProductId = java.lang.String
  type ProductListings = js.Array[String]
  type ProductionVariantAcceleratorType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTmedium | awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTxlarge | java.lang.String
  type ProductionVariantInstanceType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTmedium | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge | java.lang.String
  type ProductionVariantList = js.Array[ProductionVariant]
  type ProductionVariantSummaryList = js.Array[ProductionVariantSummary]
  type PropertyNameHint = java.lang.String
  type PropertyNameSuggestionList = js.Array[PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes = js.Array[ProductionVariantInstanceType]
  type RecordWrapper = awsDashSdkLib.awsDashSdkLibStrings.None | awsDashSdkLib.awsDashSdkLibStrings.RecordIO | java.lang.String
  type RenderingErrorList = js.Array[RenderingError]
  type ResourceArn = java.lang.String
  type ResourcePropertyName = java.lang.String
  type ResourceType = awsDashSdkLib.awsDashSdkLibStrings.TrainingJob | java.lang.String
  type ResponseMIMEType = java.lang.String
  type ResponseMIMETypes = js.Array[ResponseMIMEType]
  type RoleArn = java.lang.String
  type S3DataDistribution = awsDashSdkLib.awsDashSdkLibStrings.FullyReplicated | awsDashSdkLib.awsDashSdkLibStrings.ShardedByS3Key | java.lang.String
  type S3DataType = awsDashSdkLib.awsDashSdkLibStrings.ManifestFile | awsDashSdkLib.awsDashSdkLibStrings.S3Prefix | awsDashSdkLib.awsDashSdkLibStrings.AugmentedManifestFile | java.lang.String
  type S3Uri = java.lang.String
  type SearchExpressionList = js.Array[SearchExpression]
  type SearchResultsList = js.Array[SearchRecord]
  type SearchSortOrder = awsDashSdkLib.awsDashSdkLibStrings.Ascending | awsDashSdkLib.awsDashSdkLibStrings.Descending | java.lang.String
  type SecondaryStatus = awsDashSdkLib.awsDashSdkLibStrings.Starting | awsDashSdkLib.awsDashSdkLibStrings.LaunchingMLInstances | awsDashSdkLib.awsDashSdkLibStrings.PreparingTrainingStack | awsDashSdkLib.awsDashSdkLibStrings.Downloading | awsDashSdkLib.awsDashSdkLibStrings.DownloadingTrainingImage | awsDashSdkLib.awsDashSdkLibStrings.Training | awsDashSdkLib.awsDashSdkLibStrings.Uploading | awsDashSdkLib.awsDashSdkLibStrings.Stopping | awsDashSdkLib.awsDashSdkLibStrings.Stopped | awsDashSdkLib.awsDashSdkLibStrings.MaxRuntimeExceeded | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type SecondaryStatusTransitions = js.Array[SecondaryStatusTransition]
  type SecretArn = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type Seed = scala.Double
  type SessionExpirationDurationInSeconds = scala.Double
  type SortBy = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | awsDashSdkLib.awsDashSdkLibStrings.Status | java.lang.String
  type SortOrder = awsDashSdkLib.awsDashSdkLibStrings.Ascending | awsDashSdkLib.awsDashSdkLibStrings.Descending | java.lang.String
  type SourceAlgorithmList = js.Array[SourceAlgorithm]
  type SplitType = awsDashSdkLib.awsDashSdkLibStrings.None | awsDashSdkLib.awsDashSdkLibStrings.Line | awsDashSdkLib.awsDashSdkLibStrings.RecordIO | java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type String200 = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[SubnetId]
  type SubscribedWorkteams = js.Array[SubscribedWorkteam]
  type Success = scala.Boolean
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TargetDevice = awsDashSdkLib.awsDashSdkLibStrings.ml_m4 | awsDashSdkLib.awsDashSdkLibStrings.ml_m5 | awsDashSdkLib.awsDashSdkLibStrings.ml_c4 | awsDashSdkLib.awsDashSdkLibStrings.ml_c5 | awsDashSdkLib.awsDashSdkLibStrings.ml_p2 | awsDashSdkLib.awsDashSdkLibStrings.ml_p3 | awsDashSdkLib.awsDashSdkLibStrings.jetson_tx1 | awsDashSdkLib.awsDashSdkLibStrings.jetson_tx2 | awsDashSdkLib.awsDashSdkLibStrings.rasp3b | awsDashSdkLib.awsDashSdkLibStrings.deeplens | java.lang.String
  type TaskAvailabilityLifetimeInSeconds = scala.Double
  type TaskCount = scala.Double
  type TaskDescription = java.lang.String
  type TaskInput = java.lang.String
  type TaskKeyword = java.lang.String
  type TaskKeywords = js.Array[TaskKeyword]
  type TaskTimeLimitInSeconds = scala.Double
  type TaskTitle = java.lang.String
  type TemplateContent = java.lang.String
  type TenthFractionsOfACent = scala.Double
  type Timestamp = stdLib.Date
  type TrainingInputMode = awsDashSdkLib.awsDashSdkLibStrings.Pipe | awsDashSdkLib.awsDashSdkLibStrings.File | java.lang.String
  type TrainingInstanceCount = scala.Double
  type TrainingInstanceType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge | java.lang.String
  type TrainingInstanceTypes = js.Array[TrainingInstanceType]
  type TrainingJobArn = java.lang.String
  type TrainingJobEarlyStoppingType = awsDashSdkLib.awsDashSdkLibStrings.Off | awsDashSdkLib.awsDashSdkLibStrings.Auto | java.lang.String
  type TrainingJobName = java.lang.String
  type TrainingJobSortByOptions = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | awsDashSdkLib.awsDashSdkLibStrings.Status | awsDashSdkLib.awsDashSdkLibStrings.FinalObjectiveMetricValue | java.lang.String
  type TrainingJobStatus = awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Stopping | awsDashSdkLib.awsDashSdkLibStrings.Stopped | java.lang.String
  type TrainingJobStatusCounter = scala.Double
  type TrainingJobSummaries = js.Array[TrainingJobSummary]
  type TransformEnvironmentKey = java.lang.String
  type TransformEnvironmentValue = java.lang.String
  type TransformInstanceCount = scala.Double
  type TransformInstanceType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge | java.lang.String
  type TransformInstanceTypes = js.Array[TransformInstanceType]
  type TransformJobArn = java.lang.String
  type TransformJobName = java.lang.String
  type TransformJobStatus = awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Stopping | awsDashSdkLib.awsDashSdkLibStrings.Stopped | java.lang.String
  type TransformJobSummaries = js.Array[TransformJobSummary]
  type Url = java.lang.String
  type VariantName = java.lang.String
  type VariantWeight = scala.Double
  type VolumeSizeInGB = scala.Double
  type VpcSecurityGroupIds = js.Array[SecurityGroupId]
  type WorkteamArn = java.lang.String
  type WorkteamName = java.lang.String
  type Workteams = js.Array[Workteam]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-07-24` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

