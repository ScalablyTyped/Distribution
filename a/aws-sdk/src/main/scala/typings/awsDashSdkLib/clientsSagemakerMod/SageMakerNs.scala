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
         * The registry path of the Docker image that contains the training algorithm. For information about docker registry paths for built-in algorithms, see sagemaker-algo-docker-registry-paths.
         */
    var TrainingImage: AlgorithmImage
    /**
         * The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support, see Algorithms. If an algorithm supports the File input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an algorithm supports the Pipe input mode, Amazon SageMaker streams data directly from S3 to the container.   In File mode, make sure you provision ML storage volume with sufficient capacity to accommodate the data download from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm container use ML storage volume to also store intermediate information, if any.   For distributed algorithms using File mode, training data is distributed uniformly, and your training duration is predictable if the input data objects size is approximately same. Amazon SageMaker does not split the files any further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is also skewed where one host in a training cluster is overloaded, thus becoming bottleneck in training. 
         */
    var TrainingInputMode: TrainingInputMode
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
         *  Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO format, in which case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is already in RecordIO format, you don't need to set this attribute. For more information, see Create a Dataset Using RecordIO.  In FILE mode, leave this field unset or set it to None. 
         */
    var RecordWrapperType: js.UndefOr[RecordWrapper] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
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
    var Image: Image
    /**
         * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).  If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.
         */
    var ModelDataUrl: js.UndefOr[Url] = js.undefined
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
         * The HyperParameterTuningJobConfig object that describes the tuning job, including the search strategy, metric used to evaluate training jobs, ranges of parameters to search, and resource limits for the tuning job.
         */
    var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
    /**
         * The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning job launches. The name must be unique within the same AWS account and AWS Region. Names are not case sensitive, and must be between 1-32 characters.
         */
    var HyperParameterTuningJobName: HyperParameterTuningJobName
    /**
         * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by purpose, owner, or environment. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The HyperParameterTrainingJobDefinition object that describes the training jobs that this tuning job launches, including static hyperparameters, input data configuration, output data configuration, resource configuration, and stopping condition.
         */
    var TrainingJobDefinition: HyperParameterTrainingJobDefinition
  }
  
  
  trait CreateHyperParameterTuningJobResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the tuning job.
         */
    var HyperParameterTuningJobArn: HyperParameterTuningJobArn
  }
  
  
  trait CreateModelInput extends js.Object {
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
    var PrimaryContainer: ContainerDefinition
    /**
         * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A VpcConfig object that specifies the VPC that you want your model to connect to. Control access to and from your model container by configuring the VPC. VpcConfig is currently used in hosting services but not in batch transform. For more information, see host-vpc.
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait CreateModelOutput extends js.Object {
    /**
         * The ARN of the model created in Amazon SageMaker.
         */
    var ModelArn: ModelArn
  }
  
  
  trait CreateNotebookInstanceInput extends js.Object {
    /**
         * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to Disabled this notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC. For more information, see appendix-notebook-and-internet-access. You can set the value of this parameter to Disabled only if you set a value for the SubnetId parameter.
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
         * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see notebook-lifecycle-config.
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
  }
  
  
  trait CreateNotebookInstanceLifecycleConfigInput extends js.Object {
    /**
         * The name of the lifecycle configuration.
         */
    var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    /**
         * A shell script that runs only once, when you create a notebook instance.
         */
    var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
    /**
         * A shell script that runs every time you start a notebook instance, including when you create the notebook instance.
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
         * The registry path of the Docker image that contains the training algorithm and algorithm-specific metadata, including the input mode. For more information about algorithms provided by Amazon SageMaker, see Algorithms. For information about providing your own algorithms, see your-algorithms. 
         */
    var AlgorithmSpecification: AlgorithmSpecification
    /**
         * Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you start the learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.  You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and value is limited to 256 characters, as specified by the Length Constraint. 
         */
    var HyperParameters: js.UndefOr[HyperParameters] = js.undefined
    /**
         * An array of Channel objects. Each channel is a named input source. InputDataConfig describes the input data and its location.  Algorithms can accept input data from one or more channels. For example, an algorithm might have two channels of input data, training_data and validation_data. The configuration for each channel provides the S3 location where the input data is stored. It also provides information about the stored data: the MIME type, compression method, and whether the data is wrapped in RecordIO format.  Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files from an S3 bucket to a local directory in the Docker container, or makes it available as input streams. 
         */
    var InputDataConfig: InputDataConfig
    /**
         * Specifies the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts. 
         */
    var OutputDataConfig: OutputDataConfig
    /**
         * The resources, including the ML compute instances and ML storage volumes, to use for model training.  ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML storage volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the training data, choose File as the TrainingInputMode in the algorithm specification. For distributed training algorithms, specify an instance count greater than 1.
         */
    var ResourceConfig: ResourceConfig
    /**
         * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.  During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket, download a Docker image that contains training code, write model artifacts to an S3 bucket, write logs to Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these tasks to an IAM role. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
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
         * A VpcConfig object that specifies the VPC that you want your training job to connect to. Control access to and from your training container by configuring the VPC. For more information, see train-vpc 
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
         * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata). The value in MaxPayloadInMB must be greater or equal to the size of a single record. You can approximate the size of a record by dividing the size of your dataset by the number of records. Then multiply this value by the number of records you want in a mini-batch. It is recommended to enter a value slightly larger than this to ensure the records fit within the maximum payload size. The default value is 6 MB. For an unlimited payload size, set the value to 0.
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
  
  
  trait DataSource extends js.Object {
    /**
         * The S3 location of the data source that is associated with a channel.
         */
    var S3DataSource: S3DataSource
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
         * The status of the endpoint.
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
         * The HyperParameterTrainingJobDefinition object that specifies the definition of the training jobs that this tuning job launches.
         */
    var TrainingJobDefinition: HyperParameterTrainingJobDefinition
    /**
         * The TrainingJobStatusCounters object that specifies the number of training jobs, categorized by status, that this tuning job launched.
         */
    var TrainingJobStatusCounters: TrainingJobStatusCounters
  }
  
  
  trait DescribeModelInput extends js.Object {
    /**
         * The name of the model.
         */
    var ModelName: ModelName
  }
  
  
  trait DescribeModelOutput extends js.Object {
    /**
         * A timestamp that shows when the model was created.
         */
    var CreationTime: Timestamp
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
    var PrimaryContainer: ContainerDefinition
    /**
         * A VpcConfig object that specifies the VPC that this model has access to. For more information, see host-vpc 
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
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
         * A timestamp. Use this parameter to return the time when the notebook instance was created
         */
    var CreationTime: js.UndefOr[CreationTime] = js.undefined
    /**
         * Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set to Disabled, he notebook instance does not have internet access, and cannot connect to Amazon SageMaker training and endpoint services. For more information, see appendix-notebook-and-internet-access.
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
         * Returns the name of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
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
         * If the training job failed, the reason it failed. 
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * Algorithm-specific parameters. 
         */
    var HyperParameters: js.UndefOr[HyperParameters] = js.undefined
    /**
         * An array of Channel objects that describes each data input channel. 
         */
    var InputDataConfig: InputDataConfig
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
         *  Provides granular information about the system state. For more information, see TrainingJobStatus.     Starting - starting the training job.    Downloading - downloading the input data.    Training - model training is in progress.    Uploading - uploading the trained model.    Stopping - stopping the training job.    Stopped - the training job has stopped.    MaxRuntimeExceeded - the training job exceeded the specified max run time and has been stopped.    Completed - the training job has completed.    Failed - the training job has failed. The failure reason is stored in the FailureReason field of DescribeTrainingJobResponse.    The valid values for SecondaryStatus are subject to change. They primarily provide information on the progress of the training job. 
         */
    var SecondaryStatus: SecondaryStatus
    /**
         * To give an overview of the training job lifecycle, SecondaryStatusTransitions is a log of time-ordered secondary statuses that a training job has transitioned.
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
         * The status of the training job.  For the InProgress status, Amazon SageMaker can return these secondary statuses:   Starting - Preparing for training.   Downloading - Optional stage for algorithms that support File training input mode. It indicates data is being downloaded to ML storage volumes.   Training - Training is in progress.   Uploading - Training is complete and model upload is in progress.   For the Stopped training status, Amazon SageMaker can return these secondary statuses:   MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.  
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
         * A VpcConfig object that specifies the VPC that this training job has access to. For more information, see train-vpc.
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
         * The status of the endpoint.
         */
    var EndpointStatus: EndpointStatus
    /**
         * A timestamp that shows when the endpoint was last modified.
         */
    var LastModifiedTime: Timestamp
  }
  
  
  trait EnvironmentMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[EnvironmentValue]
  
  
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
  
  
  trait HyperParameterAlgorithmSpecification extends js.Object {
    /**
         * An array of MetricDefinition objects that specify the metrics that the algorithm emits.
         */
    var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined
    /**
         *  The registry path of the Docker image that contains the training algorithm. For information about Docker registry paths for built-in algorithms, see sagemaker-algo-docker-registry-paths.
         */
    var TrainingImage: AlgorithmImage
    /**
         * The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads the training data from Amazon S3 to the storage volume that is attached to the training instance and mounts the directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker streams data directly from Amazon S3 to the container.  If you specify File mode, make sure that you provision the storage volume that is attached to the training instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model artifacts, and intermediate information.  For more information about input modes, see Algorithms. 
         */
    var TrainingInputMode: TrainingInputMode
  }
  
  
  trait HyperParameterTrainingJobDefinition extends js.Object {
    /**
         * The HyperParameterAlgorithmSpecification object that specifies the algorithm to use for the training jobs that the tuning job launches.
         */
    var AlgorithmSpecification: HyperParameterAlgorithmSpecification
    /**
         * An array of Channel objects that specify the input for the training jobs that the tuning job launches.
         */
    var InputDataConfig: InputDataConfig
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
         * The VpcConfig object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For more information, see train-vpc.
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
  
  
  trait HyperParameters
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ParameterValue]
  
  
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
         * A filter that returns only notebook instances that were created after the specified time (timestamp).
         */
    var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
    /**
         * A filter that returns only notebook instances that were created before the specified time (timestamp). 
         */
    var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
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
  
  
  trait MetricDefinition extends js.Object {
    /**
         * The name of the metric.
         */
    var Name: MetricName
    /**
         * A regular expression that searches the output of a training job and gets the value of the metric. For more information about using regular expressions to define metrics, see automatic-model-tuning-define-metrics.
         */
    var Regex: MetricRegex
  }
  
  
  trait ModelArtifacts extends js.Object {
    /**
         * The path of the S3 object that contains the model artifacts. For example, s3://bucket-name/keynameprefix/model.tar.gz.
         */
    var S3ModelArtifacts: S3Uri
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
         * A timestamp that shows when the notebook instance was created.
         */
    var CreationTime: js.UndefOr[CreationTime] = js.undefined
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
         * The name of a notebook instance lifecycle configuration associated with this notebook instance. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
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
  
  
  trait OutputDataConfig extends js.Object {
    /**
         * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.   If you don't provide the KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more information, see KMS-Managed Encryption Keys in Amazon Simple Storage Service developer guide.    The KMS key policy must grant permission to the IAM role you specify in your CreateTrainingJob request. Using Key Policies in AWS KMS in the AWS Key Management Service Developer Guide.  
         */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
         * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example, s3://bucket-name/key-name-prefix. 
         */
    var S3OutputPath: S3Uri
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
  
  
  trait ProductionVariant extends js.Object {
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
         * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the training job.
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
         * If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched for model training, specify FullyReplicated.  If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched for model training, specify ShardedByS3Key. If there are n ML compute instances launched for a training job, each instance gets approximately 1/n of the number of S3 objects. In this case, model training on each machine uses only the subset of training data.  Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't get any data and you will pay for nodes that aren't getting any training data. This applies in both FILE and PIPE modes. Keep this in mind when developing algorithms.  In distributed training, where you use multiple ML compute EC2 instances, you might choose ShardedByS3Key. If the algorithm requires copying training data to the ML storage volume (when TrainingInputMode is set to File), this copies 1/n of the number of objects. 
         */
    var S3DataDistributionType: js.UndefOr[S3DataDistribution] = js.undefined
    /**
         * If you choose S3Prefix, S3Uri identifies a key name prefix. Amazon SageMaker uses all objects with the specified key name prefix for model training.  If you choose ManifestFile, S3Uri identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to use for model training. 
         */
    var S3DataType: S3DataType
    /**
         * Depending on the value specified for the S3DataType, identifies either a key name prefix or a manifest. For example:     A key name prefix might look like this: s3://bucketname/exampleprefix.     A manifest might look like this: s3://bucketname/example.manifest   The manifest is an S3 object which is a JSON file with the following format:   [    {"prefix": "s3://customer_bucket/some/prefix/"},    "relative/path/to/custdata-1",    "relative/path/custdata-2",    ...    ]   The preceding JSON matches the following s3Uris:   s3://customer_bucket/some/prefix/relative/path/to/custdata-1   s3://customer_bucket/some/prefix/relative/path/custdata-1   ...   The complete set of s3uris in this manifest constitutes the input data for the channel for this datasource. The object that each s3uris points to must readable by the IAM role that Amazon SageMaker uses to perform tasks on your behalf.   
         */
    var S3Uri: S3Uri
  }
  
  
  trait SecondaryStatusTransition extends js.Object {
    /**
         * A timestamp that shows when the secondary status has ended and the job has transitioned into another secondary status. The EndTime timestamp is also set after the training job has ended.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * A timestamp that shows when the training job has entered this secondary status.
         */
    var StartTime: Timestamp
    /**
         * Provides granular information about the system state. For more information, see SecondaryStatus under the DescribeTrainingJob response elements.
         */
    var Status: SecondaryStatus
    /**
         * Shows a brief description and other information about the secondary status. For example, the LaunchingMLInstances secondary status could show a status message of "Insufficent capacity error while launching instances".
         */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
  }
  
  
  trait StartNotebookInstanceInput extends js.Object {
    /**
         * The name of the notebook instance to start.
         */
    var NotebookInstanceName: NotebookInstanceName
  }
  
  
  trait StopHyperParameterTuningJobRequest extends js.Object {
    /**
         * The name of the tuning job to stop.
         */
    var HyperParameterTuningJobName: HyperParameterTuningJobName
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
         * The maximum length of time, in seconds, that the training job can run. If model training does not complete during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. Maximum value is 5 days.
         */
    var MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds] = js.undefined
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
  
  
  trait TrainingJobStatusCounters extends js.Object {
    /**
         * The number of completed training jobs launched by a hyperparameter tuning job.
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
  
  
  trait TransformDataSource extends js.Object {
    /**
         * The S3 location of the data source that is associated with a channel.
         */
    var S3DataSource: TransformS3DataSource
  }
  
  
  trait TransformEnvironmentMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[TransformEnvironmentValue]
  
  
  trait TransformInput extends js.Object {
    /**
         * Compressing data helps save on storage space. If your transform data is compressed, specify the compression type.and Amazon SageMaker will automatically decompress the data for the transform job accordingly. The default value is None.
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
         * Defines how to assemble the results of the transform job as a single S3 object. You should select a format that is most convenient to you. To concatenate the results in binary format, specify None. To add a newline character at the end of every transformed record, specify Line. To assemble the output in RecordIO format, specify RecordIO. The default value is None. For information about the RecordIO format, see Data Format.
         */
    var AssembleWith: js.UndefOr[AssemblyType] = js.undefined
    /**
         * The AWS Key Management Service (AWS KMS) key for Amazon S3 server-side encryption that Amazon SageMaker uses to encrypt the transformed data. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more information, see KMS-Managed Encryption Keys in the Amazon Simple Storage Service Developer Guide.  The KMS key policy must grant permission to the IAM role that you specify in your CreateTramsformJob request. For more information, see Using Key Policies in AWS KMS in the AWS Key Management Service Developer Guide.
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
         * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the batch transform job.
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
       * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, models, endpoint configurations, and endpoints.  Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
       */
    def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, models, endpoint configurations, and endpoints.  Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
       */
    def addTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, models, endpoint configurations, and endpoints.  Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
       */
    def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, models, endpoint configurations, and endpoints.  Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
       */
    def addTags(
      params: AddTagsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
       * Starts a hyperparameter tuning job.
       */
    def createHyperParameterTuningJob(): awsDashSdkLib.libRequestMod.Request[CreateHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a hyperparameter tuning job.
       */
    def createHyperParameterTuningJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHyperParameterTuningJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a hyperparameter tuning job.
       */
    def createHyperParameterTuningJob(params: CreateHyperParameterTuningJobRequest): awsDashSdkLib.libRequestMod.Request[CreateHyperParameterTuningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a hyperparameter tuning job.
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
       * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
       */
    def createNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
       */
    def createNotebookInstanceLifecycleConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateNotebookInstanceLifecycleConfigOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
       */
    def createNotebookInstanceLifecycleConfig(params: CreateNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[CreateNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
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
       * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see nbi-ip-filter.
       */
    def createPresignedNotebookInstanceUrl(): awsDashSdkLib.libRequestMod.Request[CreatePresignedNotebookInstanceUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see nbi-ip-filter.
       */
    def createPresignedNotebookInstanceUrl(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePresignedNotebookInstanceUrlOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePresignedNotebookInstanceUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see nbi-ip-filter.
       */
    def createPresignedNotebookInstanceUrl(params: CreatePresignedNotebookInstanceUrlInput): awsDashSdkLib.libRequestMod.Request[CreatePresignedNotebookInstanceUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook instance. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see nbi-ip-filter.
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
       * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API. 
       */
    def deleteTags(): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API. 
       */
    def deleteTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API. 
       */
    def deleteTags(params: DeleteTagsInput): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API. 
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
       * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
       */
    def describeNotebookInstanceLifecycleConfig(): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
       */
    def describeNotebookInstanceLifecycleConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNotebookInstanceLifecycleConfigOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
       */
    def describeNotebookInstanceLifecycleConfig(params: DescribeNotebookInstanceLifecycleConfigInput): awsDashSdkLib.libRequestMod.Request[DescribeNotebookInstanceLifecycleConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see notebook-lifecycle-config.
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
         * Set to true to remove the notebook instance lifecycle configuration currently associated with the notebook instance.
         */
    var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.undefined
    /**
         * The Amazon ML compute instance type.
         */
    var InstanceType: js.UndefOr[InstanceType] = js.undefined
    /**
         * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see notebook-lifecycle-config.
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
  
  val TypesNs: this.type = js.native
  type Accept = java.lang.String
  type AlgorithmImage = java.lang.String
  type AssemblyType = awsDashSdkLib.awsDashSdkLibStrings.None | awsDashSdkLib.awsDashSdkLibStrings.Line | java.lang.String
  type BatchStrategy = awsDashSdkLib.awsDashSdkLibStrings.MultiRecord | awsDashSdkLib.awsDashSdkLibStrings.SingleRecord | java.lang.String
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type ChannelName = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CompressionType = awsDashSdkLib.awsDashSdkLibStrings.None | awsDashSdkLib.awsDashSdkLibStrings.Gzip | java.lang.String
  type ContainerHostname = java.lang.String
  type ContentType = java.lang.String
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type CreationTime = stdLib.Date
  type DeployedImages = js.Array[DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[DesiredWeightAndCapacity]
  type DirectInternetAccess = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Disabled | java.lang.String
  type DisassociateNotebookInstanceLifecycleConfig = scala.Boolean
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
  type EnvironmentKey = java.lang.String
  type EnvironmentValue = java.lang.String
  type FailureReason = java.lang.String
  type HyperParameterTrainingJobSummaries = js.Array[HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = java.lang.String
  type HyperParameterTuningJobName = java.lang.String
  type HyperParameterTuningJobObjectiveType = awsDashSdkLib.awsDashSdkLibStrings.Maximize | awsDashSdkLib.awsDashSdkLibStrings.Minimize | java.lang.String
  type HyperParameterTuningJobSortByOptions = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.Status | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | java.lang.String
  type HyperParameterTuningJobStatus = awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Stopped | awsDashSdkLib.awsDashSdkLibStrings.Stopping | java.lang.String
  type HyperParameterTuningJobStrategyType = awsDashSdkLib.awsDashSdkLibStrings.Bayesian | java.lang.String
  type HyperParameterTuningJobSummaries = js.Array[HyperParameterTuningJobSummary]
  type Image = java.lang.String
  type InputDataConfig = js.Array[Channel]
  type InstanceType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTmedium | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge | java.lang.String
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type KmsKeyId = java.lang.String
  type LastModifiedTime = stdLib.Date
  type ListTagsMaxResults = scala.Double
  type MaxConcurrentTransforms = scala.Double
  type MaxNumberOfTrainingJobs = scala.Double
  type MaxParallelTrainingJobs = scala.Double
  type MaxPayloadInMB = scala.Double
  type MaxResults = scala.Double
  type MaxRuntimeInSeconds = scala.Double
  type MetricDefinitionList = js.Array[MetricDefinition]
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = scala.Double
  type ModelArn = java.lang.String
  type ModelName = java.lang.String
  type ModelNameContains = java.lang.String
  type ModelSortKey = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | java.lang.String
  type ModelSummaryList = js.Array[ModelSummary]
  type NameContains = java.lang.String
  type NetworkInterfaceId = java.lang.String
  type NextToken = java.lang.String
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
  type ObjectiveStatus = awsDashSdkLib.awsDashSdkLibStrings.Succeeded | awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type ObjectiveStatusCounter = scala.Double
  type OrderKey = awsDashSdkLib.awsDashSdkLibStrings.Ascending | awsDashSdkLib.awsDashSdkLibStrings.Descending | java.lang.String
  type PaginationToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValues = js.Array[ParameterValue]
  type ProductionVariantInstanceType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTmedium | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge | java.lang.String
  type ProductionVariantList = js.Array[ProductionVariant]
  type ProductionVariantSummaryList = js.Array[ProductionVariantSummary]
  type RecordWrapper = awsDashSdkLib.awsDashSdkLibStrings.None | awsDashSdkLib.awsDashSdkLibStrings.RecordIO | java.lang.String
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  type S3DataDistribution = awsDashSdkLib.awsDashSdkLibStrings.FullyReplicated | awsDashSdkLib.awsDashSdkLibStrings.ShardedByS3Key | java.lang.String
  type S3DataType = awsDashSdkLib.awsDashSdkLibStrings.ManifestFile | awsDashSdkLib.awsDashSdkLibStrings.S3Prefix | java.lang.String
  type S3Uri = java.lang.String
  type SecondaryStatus = awsDashSdkLib.awsDashSdkLibStrings.Starting | awsDashSdkLib.awsDashSdkLibStrings.LaunchingMLInstances | awsDashSdkLib.awsDashSdkLibStrings.PreparingTrainingStack | awsDashSdkLib.awsDashSdkLibStrings.Downloading | awsDashSdkLib.awsDashSdkLibStrings.DownloadingTrainingImage | awsDashSdkLib.awsDashSdkLibStrings.Training | awsDashSdkLib.awsDashSdkLibStrings.Uploading | awsDashSdkLib.awsDashSdkLibStrings.Stopping | awsDashSdkLib.awsDashSdkLibStrings.Stopped | awsDashSdkLib.awsDashSdkLibStrings.MaxRuntimeExceeded | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type SecondaryStatusTransitions = js.Array[SecondaryStatusTransition]
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SessionExpirationDurationInSeconds = scala.Double
  type SortBy = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | awsDashSdkLib.awsDashSdkLibStrings.Status | java.lang.String
  type SortOrder = awsDashSdkLib.awsDashSdkLibStrings.Ascending | awsDashSdkLib.awsDashSdkLibStrings.Descending | java.lang.String
  type SplitType = awsDashSdkLib.awsDashSdkLibStrings.None | awsDashSdkLib.awsDashSdkLibStrings.Line | awsDashSdkLib.awsDashSdkLibStrings.RecordIO | java.lang.String
  type StatusMessage = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TaskCount = scala.Double
  type Timestamp = stdLib.Date
  type TrainingInputMode = awsDashSdkLib.awsDashSdkLibStrings.Pipe | awsDashSdkLib.awsDashSdkLibStrings.File | java.lang.String
  type TrainingInstanceCount = scala.Double
  type TrainingInstanceType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge | java.lang.String
  type TrainingJobArn = java.lang.String
  type TrainingJobName = java.lang.String
  type TrainingJobSortByOptions = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.CreationTime | awsDashSdkLib.awsDashSdkLibStrings.Status | awsDashSdkLib.awsDashSdkLibStrings.FinalObjectiveMetricValue | java.lang.String
  type TrainingJobStatus = awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Stopping | awsDashSdkLib.awsDashSdkLibStrings.Stopped | java.lang.String
  type TrainingJobStatusCounter = scala.Double
  type TrainingJobSummaries = js.Array[TrainingJobSummary]
  type TransformEnvironmentKey = java.lang.String
  type TransformEnvironmentValue = java.lang.String
  type TransformInstanceCount = scala.Double
  type TransformInstanceType = awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge | awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge | java.lang.String
  type TransformJobArn = java.lang.String
  type TransformJobName = java.lang.String
  type TransformJobStatus = awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Completed | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Stopping | awsDashSdkLib.awsDashSdkLibStrings.Stopped | java.lang.String
  type TransformJobSummaries = js.Array[TransformJobSummary]
  type Url = java.lang.String
  type VariantName = java.lang.String
  type VariantWeight = scala.Double
  type VolumeSizeInGB = scala.Double
  type VpcSecurityGroupIds = js.Array[SecurityGroupId]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-07-24` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

