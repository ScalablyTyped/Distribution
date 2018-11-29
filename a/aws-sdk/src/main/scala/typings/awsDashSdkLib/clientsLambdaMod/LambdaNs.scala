package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/lambda", "Lambda")
@js.native
object LambdaNs extends js.Object {
  
  trait AccountLimit extends js.Object {
    /**
         * Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar size) for uploading. The default limit is 250 MB.
         */
    var CodeSizeUnzipped: js.UndefOr[Long] = js.undefined
    /**
         * Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda function(.zip/.jar file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.
         */
    var CodeSizeZipped: js.UndefOr[Long] = js.undefined
    /**
         * Number of simultaneous executions of your function per region. The default limit is 1000.
         */
    var ConcurrentExecutions: js.UndefOr[Integer] = js.undefined
    /**
         * Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB. 
         */
    var TotalCodeSize: js.UndefOr[Long] = js.undefined
    /**
         * The number of concurrent executions available to functions that do not have concurrency limits set. For more information, see Managing Concurrency.
         */
    var UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions] = js.undefined
  }
  
  
  trait AccountUsage extends js.Object {
    /**
         * The number of your account's existing functions per region.
         */
    var FunctionCount: js.UndefOr[Long] = js.undefined
    /**
         * Total size, in bytes, of the account's deployment packages per region.
         */
    var TotalCodeSize: js.UndefOr[Long] = js.undefined
  }
  
  
  trait AddLayerVersionPermissionRequest extends js.Object {
    /**
         * The API action that grants access to the layer. For example, lambda:GetLayerVersion.
         */
    var Action: LayerPermissionAllowedAction
    /**
         * The name of the layer.
         */
    var LayerName: LayerName
    /**
         * With the principal set to *, grant permission to all accounts in the specified organization.
         */
    var OrganizationId: js.UndefOr[OrganizationId] = js.undefined
    /**
         * An account ID, or * to grant permission to all AWS accounts.
         */
    var Principal: LayerPermissionAllowedPrincipal
    /**
         * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * An identifier that distinguishes the policy from others on the same layer version.
         */
    var StatementId: StatementId
    /**
         * The version number.
         */
    var VersionNumber: LayerVersionNumber
  }
  
  
  trait AddLayerVersionPermissionResponse extends js.Object {
    /**
         * A unique identifier for the current revision of the policy.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The permission statement.
         */
    var Statement: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait AddPermissionRequest extends js.Object {
    /**
         * The AWS Lambda action you want to allow in this statement. Each Lambda action is a string starting with lambda: followed by the API name . For example, lambda:CreateFunction. You can use wildcard (lambda:*) to grant permission for all AWS Lambda actions. 
         */
    var Action: Action
    /**
         * A unique token that must be supplied by the principal invoking the function. This is currently only used for Alexa Smart Home functions.
         */
    var EventSourceToken: js.UndefOr[EventSourceToken] = js.undefined
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * The principal who is getting this permission. The principal can be an AWS service (e.g. s3.amazonaws.com or sns.amazonaws.com) for service triggers, or an account ID for cross-account access. If you specify a service as a principal, use the SourceArn parameter to limit who can invoke the function through that service.
         */
    var Principal: Principal
    /**
         * Specify a version or alias to add permissions to a published version of the function.
         */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
    /**
         * An optional value you can use to ensure you are updating the latest update of the function version or alias. If the RevisionID you pass doesn't match the latest RevisionId of the function or alias, it will fail with an error message, advising you to retrieve the latest function version or alias RevisionID using either GetFunction or GetAlias 
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner. For example, if the SourceArn identifies a bucket, then this is the bucket owner's account ID. You can use this additional condition to ensure the bucket you specify is owned by a specific account (it is possible the bucket owner deleted the bucket and some other AWS account created the bucket). You can also use this condition to specify all sources (that is, you don't specify the SourceArn) owned by a specific account. 
         */
    var SourceAccount: js.UndefOr[SourceOwner] = js.undefined
    /**
         * The Amazon Resource Name of the invoker.   If you add a permission to a service principal without providing the source ARN, any AWS account that creates a mapping to your function ARN can invoke your Lambda function. 
         */
    var SourceArn: js.UndefOr[Arn] = js.undefined
    /**
         * A unique statement identifier.
         */
    var StatementId: StatementId
  }
  
  
  trait AddPermissionResponse extends js.Object {
    /**
         * The permission statement you specified in the request. The response returns the same as a string using a backslash ("\") as an escape character in the JSON.
         */
    var Statement: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait AdditionalVersionWeights
    extends /* key */ ScalablyTyped.runtime.StringDictionary[Weight]
  
  
  trait AliasConfiguration extends js.Object {
    /**
         * Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias called BETA that points to a helloworld function version, the ARN is arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA.
         */
    var AliasArn: js.UndefOr[FunctionArn] = js.undefined
    /**
         * Alias description.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * Function version to which the alias points.
         */
    var FunctionVersion: js.UndefOr[Version] = js.undefined
    /**
         * Alias name.
         */
    var Name: js.UndefOr[Alias] = js.undefined
    /**
         * Represents the latest updated revision of the function or alias.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.
         */
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
  }
  
  
  trait AliasRoutingConfiguration extends js.Object {
    /**
         * The name of the second alias, and the percentage of traffic that is routed to it.
         */
    var AdditionalVersionWeights: js.UndefOr[AdditionalVersionWeights] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Concurrency extends js.Object {
    /**
         * The number of concurrent executions reserved for this function. For more information, see Managing Concurrency.
         */
    var ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions] = js.undefined
  }
  
  
  trait CreateAliasRequest extends js.Object {
    /**
         * Description of the alias.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The name of the lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * Lambda function version for which you are creating the alias.
         */
    var FunctionVersion: Version
    /**
         * Name for the alias you are creating.
         */
    var Name: Alias
    /**
         * Specifies an additional version your alias can point to, allowing you to dictate what percentage of traffic will invoke each version. For more information, see Traffic Shifting Using Aliases.
         */
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
  }
  
  
  trait CreateEventSourceMappingRequest extends js.Object {
    /**
         * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.  
         */
    var BatchSize: js.UndefOr[BatchSize] = js.undefined
    /**
         * Disables the event source mapping to pause polling and invocation.
         */
    var Enabled: js.UndefOr[Enabled] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the event source.    Amazon Kinesis - The ARN of the data stream or a stream consumer.    Amazon DynamoDB Streams - The ARN of the stream.    Amazon Simple Queue Service - The ARN of the queue.  
         */
    var EventSourceArn: Arn
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources. AT_TIMESTAMP is only supported for Amazon Kinesis streams.
         */
    var StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined
    /**
         * With StartingPosition set to AT_TIMESTAMP, the Unix time in seconds from which to start reading.
         */
    var StartingPositionTimestamp: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait CreateFunctionRequest extends js.Object {
    /**
         * The code for the function.
         */
    var Code: FunctionCode
    /**
         * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see Dead Letter Queues. 
         */
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined
    /**
         * A description of the function.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * Environment variables that are accessible from function code during execution.
         */
    var Environment: js.UndefOr[Environment] = js.undefined
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * The name of the method within your code that Lambda calls to execute your function. For more information, see Programming Model.
         */
    var Handler: Handler
    /**
         * The ARN of the KMS key used to encrypt your function's environment variables. If not provided, AWS Lambda will use a default service key.
         */
    var KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined
    /**
         * A list of function layers to add to the function's execution environment.
         */
    var Layers: js.UndefOr[LayerList] = js.undefined
    /**
         * The amount of memory that your function has access to. Increasing the function's memory also increases it's CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
         */
    var MemorySize: js.UndefOr[MemorySize] = js.undefined
    /**
         * Set to true to publish the first version of the function during creation.
         */
    var Publish: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the function's execution role.
         */
    var Role: RoleArn
    /**
         * The runtime version for the function.
         */
    var Runtime: Runtime
    /**
         * The list of tags (key-value pairs) assigned to the new function. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
         * The amount of time that Lambda allows a function to run before terminating it. The default is 3 seconds. The maximum allowed value is 900 seconds.
         */
    var Timeout: js.UndefOr[Timeout] = js.undefined
    /**
         * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
         */
    var TracingConfig: js.UndefOr[TracingConfig] = js.undefined
    /**
         * If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one subnet ID.
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait DeadLetterConfig extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
         */
    var TargetArn: js.UndefOr[ResourceArn] = js.undefined
  }
  
  
  trait DeleteAliasRequest extends js.Object {
    /**
         * The name of the lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * Name of the alias to delete.
         */
    var Name: Alias
  }
  
  
  trait DeleteEventSourceMappingRequest extends js.Object {
    /**
         * The identifier of the event source mapping.
         */
    var UUID: java.lang.String
  }
  
  
  trait DeleteFunctionConcurrencyRequest extends js.Object {
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
  }
  
  
  trait DeleteFunctionRequest extends js.Object {
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * Specify a version to delete. You cannot delete a version that is referenced by an alias.
         */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  
  trait DeleteLayerVersionRequest extends js.Object {
    /**
         * The name of the layer.
         */
    var LayerName: LayerName
    /**
         * The version number.
         */
    var VersionNumber: LayerVersionNumber
  }
  
  
  trait Environment extends js.Object {
    /**
         * Environment variable key-value pairs.
         */
    var Variables: js.UndefOr[EnvironmentVariables] = js.undefined
  }
  
  
  trait EnvironmentError extends js.Object {
    /**
         * The error code.
         */
    var ErrorCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The error message.
         */
    var Message: js.UndefOr[SensitiveString] = js.undefined
  }
  
  
  trait EnvironmentResponse extends js.Object {
    /**
         * Error messages for environment variables that could not be applied.
         */
    var Error: js.UndefOr[EnvironmentError] = js.undefined
    /**
         * Environment variable key-value pairs.
         */
    var Variables: js.UndefOr[EnvironmentVariables] = js.undefined
  }
  
  
  trait EnvironmentVariables
    extends /* key */ ScalablyTyped.runtime.StringDictionary[EnvironmentVariableValue]
  
  
  trait EventSourceMappingConfiguration extends js.Object {
    /**
         * The maximum number of items to retrieve in a single batch.
         */
    var BatchSize: js.UndefOr[BatchSize] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the event source.
         */
    var EventSourceArn: js.UndefOr[Arn] = js.undefined
    /**
         * The ARN of the Lambda function.
         */
    var FunctionArn: js.UndefOr[FunctionArn] = js.undefined
    /**
         * The date that the event source mapping was last updated, in Unix time seconds.
         */
    var LastModified: js.UndefOr[_Date] = js.undefined
    /**
         * The result of the last AWS Lambda invocation of your Lambda function.
         */
    var LastProcessingResult: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The state of the event source mapping. It can be one of the following: Creating, Enabling, Enabled, Disabling, Disabled, Updating, or Deleting.
         */
    var State: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The cause of the last state change, either User initiated or Lambda initiated.
         */
    var StateTransitionReason: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The identifier of the event source mapping.
         */
    var UUID: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait FunctionCode extends js.Object {
    /**
         * An Amazon S3 bucket in the same region as your function.
         */
    var S3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
         * The Amazon S3 key of the deployment package.
         */
    var S3Key: js.UndefOr[S3Key] = js.undefined
    /**
         * For versioned objects, the version of the deployment package object to use.
         */
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined
    /**
         * The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
         */
    var ZipFile: js.UndefOr[_Blob] = js.undefined
  }
  
  
  trait FunctionCodeLocation extends js.Object {
    /**
         * The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL is valid for up to 10 minutes.
         */
    var Location: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The repository from which you can download the function.
         */
    var RepositoryType: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait FunctionConfiguration extends js.Object {
    /**
         * The SHA256 hash of the function's deployment package.
         */
    var CodeSha256: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The size of the function's deployment package in bytes.
         */
    var CodeSize: js.UndefOr[Long] = js.undefined
    /**
         * The function's dead letter queue.
         */
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined
    /**
         * The function's description.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The function's environment variables.
         */
    var Environment: js.UndefOr[EnvironmentResponse] = js.undefined
    /**
         * The function's Amazon Resource Name.
         */
    var FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.undefined
    /**
         * The name of the function.
         */
    var FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined
    /**
         * The function Lambda calls to begin executing your function.
         */
    var Handler: js.UndefOr[Handler] = js.undefined
    /**
         * The KMS key used to encrypt the function's environment variables. Only returned if you've configured a customer managed CMK.
         */
    var KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined
    /**
         * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
         */
    var LastModified: js.UndefOr[Timestamp] = js.undefined
    /**
         * A list of function layers.
         */
    var Layers: js.UndefOr[LayersReferenceList] = js.undefined
    /**
         * The ARN of the master function.
         */
    var MasterArn: js.UndefOr[FunctionArn] = js.undefined
    /**
         * The memory allocated to the function
         */
    var MemorySize: js.UndefOr[MemorySize] = js.undefined
    /**
         * Represents the latest updated revision of the function or alias.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The function's execution role.
         */
    var Role: js.UndefOr[RoleArn] = js.undefined
    /**
         * The runtime environment for the Lambda function.
         */
    var Runtime: js.UndefOr[Runtime] = js.undefined
    /**
         * The amount of time that Lambda allows a function to run before terminating it.
         */
    var Timeout: js.UndefOr[Timeout] = js.undefined
    /**
         * The function's AWS X-Ray tracing configuration.
         */
    var TracingConfig: js.UndefOr[TracingConfigResponse] = js.undefined
    /**
         * The version of the Lambda function.
         */
    var Version: js.UndefOr[Version] = js.undefined
    /**
         * The function's networking configuration.
         */
    var VpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined
  }
  
  
  trait GetAccountSettingsRequest extends js.Object
  
  
  trait GetAccountSettingsResponse extends js.Object {
    /**
         * Limits related to concurrency and code storage.
         */
    var AccountLimit: js.UndefOr[AccountLimit] = js.undefined
    /**
         * The number of functions and amount of storage in use.
         */
    var AccountUsage: js.UndefOr[AccountUsage] = js.undefined
  }
  
  
  trait GetAliasRequest extends js.Object {
    /**
         * The name of the lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * Name of the alias for which you want to retrieve information.
         */
    var Name: Alias
  }
  
  
  trait GetEventSourceMappingRequest extends js.Object {
    /**
         * The identifier of the event source mapping.
         */
    var UUID: java.lang.String
  }
  
  
  trait GetFunctionConfigurationRequest extends js.Object {
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: NamespacedFunctionName
    /**
         * Specify a version or alias to get details about a published version of the function.
         */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  
  trait GetFunctionRequest extends js.Object {
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: NamespacedFunctionName
    /**
         * Specify a version or alias to get details about a published version of the function.
         */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  
  trait GetFunctionResponse extends js.Object {
    /**
         * The function's code.
         */
    var Code: js.UndefOr[FunctionCodeLocation] = js.undefined
    /**
         * The concurrent execution limit set for this function. For more information, see Managing Concurrency.
         */
    var Concurrency: js.UndefOr[Concurrency] = js.undefined
    /**
         * The function's configuration.
         */
    var Configuration: js.UndefOr[FunctionConfiguration] = js.undefined
    /**
         * Returns the list of tags associated with the function. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait GetLayerVersionPolicyRequest extends js.Object {
    /**
         * The name of the layer.
         */
    var LayerName: LayerName
    /**
         * The version number.
         */
    var VersionNumber: LayerVersionNumber
  }
  
  
  trait GetLayerVersionPolicyResponse extends js.Object {
    /**
         * The policy document.
         */
    var Policy: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A unique identifier for the current revision of the policy.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait GetLayerVersionRequest extends js.Object {
    /**
         * The name of the layer.
         */
    var LayerName: LayerName
    /**
         * The version number.
         */
    var VersionNumber: LayerVersionNumber
  }
  
  
  trait GetLayerVersionResponse extends js.Object {
    /**
         * The layer's compatible runtimes.
         */
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined
    /**
         * Details about the layer version.
         */
    var Content: js.UndefOr[LayerVersionContentOutput] = js.undefined
    /**
         * The date that the layer version was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
         */
    var CreatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The description of the version.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the function layer.
         */
    var LayerArn: js.UndefOr[LayerArn] = js.undefined
    /**
         * The ARN of the layer version.
         */
    var LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined
    /**
         * The layer's software license.
         */
    var LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined
    /**
         * The version number.
         */
    var Version: js.UndefOr[LayerVersionNumber] = js.undefined
  }
  
  
  trait GetPolicyRequest extends js.Object {
    /**
         * The name of the lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: NamespacedFunctionName
    /**
         * You can specify this optional query parameter to specify a function version or an alias name in which case this API will return all permissions associated with the specific qualified ARN. If you don't provide this parameter, the API will return permissions that apply to the unqualified function ARN.
         */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  
  trait GetPolicyResponse extends js.Object {
    /**
         * The resource policy associated with the specified function. The response returns the same as a string using a backslash ("\") as an escape character in the JSON.
         */
    var Policy: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Represents the latest updated revision of the function or alias.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait InvocationRequest extends js.Object {
    /**
         * Using the ClientContext you can pass client-specific information to the Lambda function you are invoking. You can then process the client information in your Lambda function as you choose through the context variable. For an example of a ClientContext JSON, see PutEvents in the Amazon Mobile Analytics API Reference and User Guide. The ClientContext JSON must be base64-encoded and has a maximum size of 3583 bytes.   ClientContext information is returned only if you use the synchronous (RequestResponse) invocation type. 
         */
    var ClientContext: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: NamespacedFunctionName
    /**
         * Choose from the following options.    RequestResponse (default) - Invoke the function synchronously. Keep the connection open until the function returns a response or times out.    Event - Invoke the function asynchronously. Send events that fail multiple times to the function's dead-letter queue (if configured).    DryRun - Validate parameter values and verify that the user or role has permission to invoke the function.  
         */
    var InvocationType: js.UndefOr[InvocationType] = js.undefined
    /**
         * You can set this optional parameter to Tail in the request only if you specify the InvocationType parameter with value RequestResponse. In this case, AWS Lambda returns the base64-encoded last 4 KB of log data produced by your Lambda function in the x-amz-log-result header. 
         */
    var LogType: js.UndefOr[LogType] = js.undefined
    /**
         * JSON that you want to provide to your Lambda function as input.
         */
    var Payload: js.UndefOr[_Blob] = js.undefined
    /**
         * Specify a version or alias to invoke a published version of the function.
         */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  
  trait InvocationResponse extends js.Object {
    /**
         * The function version that has been executed. This value is returned only if the invocation type is RequestResponse. For more information, see Traffic Shifting Using Aliases.
         */
    var ExecutedVersion: js.UndefOr[Version] = js.undefined
    /**
         * Indicates whether an error occurred while executing the Lambda function. If an error occurred this field will have one of two values; Handled or Unhandled. Handled errors are errors that are reported by the function while the Unhandled errors are those detected and reported by AWS Lambda. Unhandled errors include out of memory errors and function timeouts. For information about how to report an Handled error, see Programming Model. 
         */
    var FunctionError: js.UndefOr[java.lang.String] = js.undefined
    /**
         *  It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation type is RequestResponse and the logs were requested. 
         */
    var LogResult: js.UndefOr[java.lang.String] = js.undefined
    /**
         *  It is the JSON representation of the object returned by the Lambda function. This is present only if the invocation type is RequestResponse.  In the event of a function error this field contains a message describing the error. For the Handled errors the Lambda function will report this message. For Unhandled errors AWS Lambda reports the message. 
         */
    var Payload: js.UndefOr[_Blob] = js.undefined
    /**
         * The HTTP status code will be in the 200 range for successful request. For the RequestResponse invocation type this status code will be 200. For the Event invocation type this status code will be 202. For the DryRun invocation type the status code will be 204. 
         */
    var StatusCode: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait InvokeAsyncRequest extends js.Object {
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: NamespacedFunctionName
    /**
         * JSON that you want to provide to your Lambda function as input.
         */
    var InvokeArgs: BlobStream
  }
  
  
  trait InvokeAsyncResponse extends js.Object {
    /**
         * It will be 202 upon success.
         */
    var Status: js.UndefOr[HttpStatus] = js.undefined
  }
  
  
  trait Layer extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the function layer.
         */
    var Arn: js.UndefOr[LayerVersionArn] = js.undefined
    /**
         * The size of the layer archive in bytes.
         */
    var CodeSize: js.UndefOr[Long] = js.undefined
  }
  
  
  trait LayerVersionContentInput extends js.Object {
    /**
         * The Amazon S3 bucket of the layer archive.
         */
    var S3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
         * The Amazon S3 key of the layer archive.
         */
    var S3Key: js.UndefOr[S3Key] = js.undefined
    /**
         * For versioned objects, the version of the layer archive object to use.
         */
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined
    /**
         * The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
         */
    var ZipFile: js.UndefOr[_Blob] = js.undefined
  }
  
  
  trait LayerVersionContentOutput extends js.Object {
    /**
         * The SHA-256 hash of the layer archive.
         */
    var CodeSha256: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The size of the layer archive in bytes.
         */
    var CodeSize: js.UndefOr[Long] = js.undefined
    /**
         * A link to the layer archive in Amazon S3 that is valid for 10 minutes.
         */
    var Location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait LayerVersionsListItem extends js.Object {
    /**
         * The layer's compatible runtimes.
         */
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined
    /**
         * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
         */
    var CreatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The description of the version.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The ARN of the layer version.
         */
    var LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined
    /**
         * The layer's open-source license.
         */
    var LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined
    /**
         * The version number.
         */
    var Version: js.UndefOr[LayerVersionNumber] = js.undefined
  }
  
  
  trait LayersListItem extends js.Object {
    /**
         * The newest version of the layer.
         */
    var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the function layer.
         */
    var LayerArn: js.UndefOr[LayerArn] = js.undefined
    /**
         * The name of the layer.
         */
    var LayerName: js.UndefOr[LayerName] = js.undefined
  }
  
  
  trait ListAliasesRequest extends js.Object {
    /**
         * The name of the lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * If you specify this optional parameter, the API returns only the aliases that are pointing to the specific Lambda function version, otherwise the API returns all of the aliases created for the Lambda function.
         */
    var FunctionVersion: js.UndefOr[Version] = js.undefined
    /**
         * Optional string. An opaque pagination token returned from a previous ListAliases operation. If present, indicates where to continue the listing.
         */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Optional integer. Specifies the maximum number of aliases to return in response. This parameter value must be greater than 0.
         */
    var MaxItems: js.UndefOr[MaxListItems] = js.undefined
  }
  
  
  trait ListAliasesResponse extends js.Object {
    /**
         * A list of aliases.
         */
    var Aliases: js.UndefOr[AliasList] = js.undefined
    /**
         * A string, present if there are more aliases.
         */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListEventSourceMappingsRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the event source.    Amazon Kinesis - The ARN of the data stream or a stream consumer.    Amazon DynamoDB Streams - The ARN of the stream.    Amazon Simple Queue Service - The ARN of the queue.  
         */
    var EventSourceArn: js.UndefOr[Arn] = js.undefined
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
         */
    var FunctionName: js.UndefOr[FunctionName] = js.undefined
    /**
         * A pagination token returned by a previous call.
         */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The maximum number of event source mappings to return.
         */
    var MaxItems: js.UndefOr[MaxListItems] = js.undefined
  }
  
  
  trait ListEventSourceMappingsResponse extends js.Object {
    /**
         * A list of event source mappings.
         */
    var EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.undefined
    /**
         * A pagination token that's returned when the response doesn't contain all event source mappings.
         */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListFunctionsRequest extends js.Object {
    /**
         * Set to ALL to list all published versions. If not specified, only the latest unpublished version ARN is returned.
         */
    var FunctionVersion: js.UndefOr[FunctionVersion] = js.undefined
    /**
         * Optional string. An opaque pagination token returned from a previous ListFunctions operation. If present, indicates where to continue the listing. 
         */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Specify a region (e.g. us-east-2) to only list functions that were created in that region, or ALL to include functions replicated from any region. If specified, you also must specify the FunctionVersion.
         */
    var MasterRegion: js.UndefOr[MasterRegion] = js.undefined
    /**
         * Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned is 50.
         */
    var MaxItems: js.UndefOr[MaxListItems] = js.undefined
  }
  
  
  trait ListFunctionsResponse extends js.Object {
    /**
         * A list of Lambda functions.
         */
    var Functions: js.UndefOr[FunctionList] = js.undefined
    /**
         * A string, present if there are more functions.
         */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListLayerVersionsRequest extends js.Object {
    /**
         * A runtime identifier. For example, go1.x.
         */
    var CompatibleRuntime: js.UndefOr[Runtime] = js.undefined
    /**
         * The name of the layer.
         */
    var LayerName: LayerName
    /**
         * A pagination token returned by a previous call.
         */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The maximum number of versions to return.
         */
    var MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
  }
  
  
  trait ListLayerVersionsResponse extends js.Object {
    /**
         * A list of versions.
         */
    var LayerVersions: js.UndefOr[LayerVersionsList] = js.undefined
    /**
         * A pagination token returned when the response doesn't contain all versions.
         */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListLayersRequest extends js.Object {
    /**
         * A runtime identifier. For example, go1.x.
         */
    var CompatibleRuntime: js.UndefOr[Runtime] = js.undefined
    /**
         * A pagination token returned by a previous call.
         */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The maximum number of layers to return.
         */
    var MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
  }
  
  
  trait ListLayersResponse extends js.Object {
    /**
         * A list of function layers.
         */
    var Layers: js.UndefOr[LayersList] = js.undefined
    /**
         * A pagination token returned when the response doesn't contain all layers.
         */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListTagsRequest extends js.Object {
    /**
         * The ARN (Amazon Resource Name) of the function. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
         */
    var Resource: FunctionArn
  }
  
  
  trait ListTagsResponse extends js.Object {
    /**
         * The list of tags assigned to the function. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait ListVersionsByFunctionRequest extends js.Object {
    /**
         * The name of the lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: NamespacedFunctionName
    /**
         *  Optional string. An opaque pagination token returned from a previous ListVersionsByFunction operation. If present, indicates where to continue the listing. 
         */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Optional integer. Specifies the maximum number of AWS Lambda function versions to return in response. This parameter value must be greater than 0.
         */
    var MaxItems: js.UndefOr[MaxListItems] = js.undefined
  }
  
  
  trait ListVersionsByFunctionResponse extends js.Object {
    /**
         * A string, present if there are more function versions.
         */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A list of Lambda function versions.
         */
    var Versions: js.UndefOr[FunctionList] = js.undefined
  }
  
  
  trait PublishLayerVersionRequest extends js.Object {
    /**
         * A list of compatible function runtimes. Used for filtering with ListLayers and ListLayerVersions.
         */
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined
    /**
         * The function layer archive.
         */
    var Content: LayerVersionContentInput
    /**
         * The description of the version.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The name of the layer.
         */
    var LayerName: LayerName
    /**
         * The layer's software license. It can be any of the following:   An SPDX license identifier. For example, MIT.   The URL of a license hosted on the internet. For example, https://opensource.org/licenses/MIT.   The full text of the license.  
         */
    var LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined
  }
  
  
  trait PublishLayerVersionResponse extends js.Object {
    /**
         * The layer's compatible runtimes.
         */
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined
    /**
         * Details about the layer version.
         */
    var Content: js.UndefOr[LayerVersionContentOutput] = js.undefined
    /**
         * The date that the layer version was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
         */
    var CreatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The description of the version.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the function layer.
         */
    var LayerArn: js.UndefOr[LayerArn] = js.undefined
    /**
         * The ARN of the layer version.
         */
    var LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined
    /**
         * The layer's software license.
         */
    var LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined
    /**
         * The version number.
         */
    var Version: js.UndefOr[LayerVersionNumber] = js.undefined
  }
  
  
  trait PublishVersionRequest extends js.Object {
    /**
         * The SHA256 hash of the deployment package you want to publish. This provides validation on the code you are publishing. If you provide this parameter, the value must match the SHA256 of the $LATEST version for the publication to succeed. You can use the DryRun parameter of UpdateFunctionCode to verify the hash value that will be returned before publishing your new version.
         */
    var CodeSha256: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The description for the version you are publishing. If not provided, AWS Lambda copies the description from the $LATEST version.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The name of the lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * An optional value you can use to ensure you are updating the latest update of the function version or alias. If the RevisionID you pass doesn't match the latest RevisionId of the function or alias, it will fail with an error message, advising you retrieve the latest function version or alias RevisionID using either GetFunction or GetAlias.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait PutFunctionConcurrencyRequest extends js.Object {
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * The concurrent execution limit reserved for this function.
         */
    var ReservedConcurrentExecutions: ReservedConcurrentExecutions
  }
  
  
  trait RemoveLayerVersionPermissionRequest extends js.Object {
    /**
         * The name of the layer.
         */
    var LayerName: LayerName
    /**
         * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The identifier that was specified when the statement was added.
         */
    var StatementId: StatementId
    /**
         * The version number.
         */
    var VersionNumber: LayerVersionNumber
  }
  
  
  trait RemovePermissionRequest extends js.Object {
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * Specify a version or alias to remove permissions from a published version of the function.
         */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
    /**
         * An optional value you can use to ensure you are updating the latest update of the function version or alias. If the RevisionID you pass doesn't match the latest RevisionId of the function or alias, it will fail with an error message, advising you to retrieve the latest function version or alias RevisionID using either GetFunction or GetAlias.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Statement ID of the permission to remove.
         */
    var StatementId: NamespacedStatementId
  }
  
  
  trait TagResourceRequest extends js.Object {
    /**
         * The ARN (Amazon Resource Name) of the Lambda function. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
         */
    var Resource: FunctionArn
    /**
         * The list of tags (key-value pairs) you are assigning to the Lambda function. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
         */
    var Tags: Tags
  }
  
  
  trait Tags
    extends /* key */ ScalablyTyped.runtime.StringDictionary[TagValue]
  
  
  trait TracingConfig extends js.Object {
    /**
         * The tracing mode.
         */
    var Mode: js.UndefOr[TracingMode] = js.undefined
  }
  
  
  trait TracingConfigResponse extends js.Object {
    /**
         * The tracing mode.
         */
    var Mode: js.UndefOr[TracingMode] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
       */
    def addLayerVersionPermission(): awsDashSdkLib.libRequestMod.Request[AddLayerVersionPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
       */
    def addLayerVersionPermission(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddLayerVersionPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddLayerVersionPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
       */
    def addLayerVersionPermission(params: AddLayerVersionPermissionRequest): awsDashSdkLib.libRequestMod.Request[AddLayerVersionPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
       */
    def addLayerVersionPermission(
      params: AddLayerVersionPermissionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddLayerVersionPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddLayerVersionPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource policies to grant permissions to event sources that use the push model. In a push model, event sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource policy allows an event source permission to invoke the Lambda function.  Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:AddPermission action.
       */
    def addPermission(): awsDashSdkLib.libRequestMod.Request[AddPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource policies to grant permissions to event sources that use the push model. In a push model, event sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource policy allows an event source permission to invoke the Lambda function.  Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:AddPermission action.
       */
    def addPermission(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource policies to grant permissions to event sources that use the push model. In a push model, event sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource policy allows an event source permission to invoke the Lambda function.  Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:AddPermission action.
       */
    def addPermission(params: AddPermissionRequest): awsDashSdkLib.libRequestMod.Request[AddPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource policies to grant permissions to event sources that use the push model. In a push model, event sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource policy allows an event source permission to invoke the Lambda function.  Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:AddPermission action.
       */
    def addPermission(
      params: AddPermissionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an alias that points to the specified Lambda function version. For more information, see Introduction to AWS Lambda Aliases. Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
       */
    def createAlias(): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an alias that points to the specified Lambda function version. For more information, see Introduction to AWS Lambda Aliases. Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
       */
    def createAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an alias that points to the specified Lambda function version. For more information, see Introduction to AWS Lambda Aliases. Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
       */
    def createAlias(params: CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an alias that points to the specified Lambda function version. For more information, see Introduction to AWS Lambda Aliases. Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
       */
    def createAlias(
      params: CreateAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS     Using AWS Lambda with Amazon DynamoDB   
       */
    def createEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS     Using AWS Lambda with Amazon DynamoDB   
       */
    def createEventSourceMapping(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS     Using AWS Lambda with Amazon DynamoDB   
       */
    def createEventSourceMapping(params: CreateEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS     Using AWS Lambda with Amazon DynamoDB   
       */
    def createEventSourceMapping(
      params: CreateEventSourceMappingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Lambda function. The function configuration is created from the request parameters, and the code for the function is provided by a .zip file. The function name is case-sensitive. This operation requires permission for the lambda:CreateFunction action.
       */
    def createFunction(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Lambda function. The function configuration is created from the request parameters, and the code for the function is provided by a .zip file. The function name is case-sensitive. This operation requires permission for the lambda:CreateFunction action.
       */
    def createFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Lambda function. The function configuration is created from the request parameters, and the code for the function is provided by a .zip file. The function name is case-sensitive. This operation requires permission for the lambda:CreateFunction action.
       */
    def createFunction(params: CreateFunctionRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Lambda function. The function configuration is created from the request parameters, and the code for the function is provided by a .zip file. The function name is case-sensitive. This operation requires permission for the lambda:CreateFunction action.
       */
    def createFunction(
      params: CreateFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Lambda function alias. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:DeleteAlias action.
       */
    def deleteAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Lambda function alias. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:DeleteAlias action.
       */
    def deleteAlias(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Lambda function alias. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:DeleteAlias action.
       */
    def deleteAlias(params: DeleteAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Lambda function alias. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:DeleteAlias action.
       */
    def deleteAlias(
      params: DeleteAliasRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an event source mapping.
       */
    def deleteEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an event source mapping.
       */
    def deleteEventSourceMapping(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an event source mapping.
       */
    def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an event source mapping.
       */
    def deleteEventSourceMapping(
      params: DeleteEventSourceMappingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter. Otherwise, all versions and aliases are deleted. Event source mappings are not deleted. This operation requires permission for the lambda:DeleteFunction action.
       */
    def deleteFunction(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter. Otherwise, all versions and aliases are deleted. Event source mappings are not deleted. This operation requires permission for the lambda:DeleteFunction action.
       */
    def deleteFunction(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter. Otherwise, all versions and aliases are deleted. Event source mappings are not deleted. This operation requires permission for the lambda:DeleteFunction action.
       */
    def deleteFunction(params: DeleteFunctionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter. Otherwise, all versions and aliases are deleted. Event source mappings are not deleted. This operation requires permission for the lambda:DeleteFunction action.
       */
    def deleteFunction(
      params: DeleteFunctionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes concurrent execution limits from this function. For more information, see Managing Concurrency.
       */
    def deleteFunctionConcurrency(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes concurrent execution limits from this function. For more information, see Managing Concurrency.
       */
    def deleteFunctionConcurrency(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes concurrent execution limits from this function. For more information, see Managing Concurrency.
       */
    def deleteFunctionConcurrency(params: DeleteFunctionConcurrencyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes concurrent execution limits from this function. For more information, see Managing Concurrency.
       */
    def deleteFunctionConcurrency(
      params: DeleteFunctionConcurrencyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a version of a function layer. Deleted versions can no longer be viewed or added to functions. However, a copy of the version remains in Lambda until no functions refer to it.
       */
    def deleteLayerVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a version of a function layer. Deleted versions can no longer be viewed or added to functions. However, a copy of the version remains in Lambda until no functions refer to it.
       */
    def deleteLayerVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a version of a function layer. Deleted versions can no longer be viewed or added to functions. However, a copy of the version remains in Lambda until no functions refer to it.
       */
    def deleteLayerVersion(params: DeleteLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a version of a function layer. Deleted versions can no longer be viewed or added to functions. However, a copy of the version remains in Lambda until no functions refer to it.
       */
    def deleteLayerVersion(
      params: DeleteLayerVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves details about your account's limits and usage in a region.
       */
    def getAccountSettings(): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves details about your account's limits and usage in a region.
       */
    def getAccountSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves details about your account's limits and usage in a region.
       */
    def getAccountSettings(params: GetAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves details about your account's limits and usage in a region.
       */
    def getAccountSettings(
      params: GetAccountSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the specified alias information such as the alias ARN, description, and function version it is pointing to. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:GetAlias action.
       */
    def getAlias(): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the specified alias information such as the alias ARN, description, and function version it is pointing to. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:GetAlias action.
       */
    def getAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the specified alias information such as the alias ARN, description, and function version it is pointing to. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:GetAlias action.
       */
    def getAlias(params: GetAliasRequest): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the specified alias information such as the alias ARN, description, and function version it is pointing to. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:GetAlias action.
       */
    def getAlias(
      params: GetAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about an event source mapping.
       */
    def getEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about an event source mapping.
       */
    def getEventSourceMapping(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about an event source mapping.
       */
    def getEventSourceMapping(params: GetEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about an event source mapping.
       */
    def getEventSourceMapping(
      params: GetEventSourceMappingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you uploaded with CreateFunction so you can download the .zip file. Note that the URL is valid for up to 10 minutes. The configuration information is the same information you provided as parameters when uploading the function. Use the Qualifier parameter to retrieve a published version of the function. Otherwise, returns the unpublished version ($LATEST). For more information, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunction action.
       */
    def getFunction(): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you uploaded with CreateFunction so you can download the .zip file. Note that the URL is valid for up to 10 minutes. The configuration information is the same information you provided as parameters when uploading the function. Use the Qualifier parameter to retrieve a published version of the function. Otherwise, returns the unpublished version ($LATEST). For more information, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunction action.
       */
    def getFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you uploaded with CreateFunction so you can download the .zip file. Note that the URL is valid for up to 10 minutes. The configuration information is the same information you provided as parameters when uploading the function. Use the Qualifier parameter to retrieve a published version of the function. Otherwise, returns the unpublished version ($LATEST). For more information, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunction action.
       */
    def getFunction(params: GetFunctionRequest): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you uploaded with CreateFunction so you can download the .zip file. Note that the URL is valid for up to 10 minutes. The configuration information is the same information you provided as parameters when uploading the function. Use the Qualifier parameter to retrieve a published version of the function. Otherwise, returns the unpublished version ($LATEST). For more information, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunction action.
       */
    def getFunction(
      params: GetFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration information of the Lambda function. This the same information you provided as parameters when uploading the function by using CreateFunction. If you are using the versioning feature, you can retrieve this information for a specific function version by using the optional Qualifier parameter and specifying the function version or alias that points to it. If you don't provide it, the API returns information about the $LATEST version of the function. For more information about versioning, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunctionConfiguration operation.
       */
    def getFunctionConfiguration(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration information of the Lambda function. This the same information you provided as parameters when uploading the function by using CreateFunction. If you are using the versioning feature, you can retrieve this information for a specific function version by using the optional Qualifier parameter and specifying the function version or alias that points to it. If you don't provide it, the API returns information about the $LATEST version of the function. For more information about versioning, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunctionConfiguration operation.
       */
    def getFunctionConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration information of the Lambda function. This the same information you provided as parameters when uploading the function by using CreateFunction. If you are using the versioning feature, you can retrieve this information for a specific function version by using the optional Qualifier parameter and specifying the function version or alias that points to it. If you don't provide it, the API returns information about the $LATEST version of the function. For more information about versioning, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunctionConfiguration operation.
       */
    def getFunctionConfiguration(params: GetFunctionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration information of the Lambda function. This the same information you provided as parameters when uploading the function by using CreateFunction. If you are using the versioning feature, you can retrieve this information for a specific function version by using the optional Qualifier parameter and specifying the function version or alias that points to it. If you don't provide it, the API returns information about the $LATEST version of the function. For more information about versioning, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunctionConfiguration operation.
       */
    def getFunctionConfiguration(
      params: GetFunctionConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a version of a function layer, with a link to download the layer archive that's valid for 10 minutes.
       */
    def getLayerVersion(): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a version of a function layer, with a link to download the layer archive that's valid for 10 minutes.
       */
    def getLayerVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLayerVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a version of a function layer, with a link to download the layer archive that's valid for 10 minutes.
       */
    def getLayerVersion(params: GetLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a version of a function layer, with a link to download the layer archive that's valid for 10 minutes.
       */
    def getLayerVersion(
      params: GetLayerVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLayerVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the permission policy for a layer version. For more information, see AddLayerVersionPermission.
       */
    def getLayerVersionPolicy(): awsDashSdkLib.libRequestMod.Request[GetLayerVersionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the permission policy for a layer version. For more information, see AddLayerVersionPermission.
       */
    def getLayerVersionPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLayerVersionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLayerVersionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the permission policy for a layer version. For more information, see AddLayerVersionPermission.
       */
    def getLayerVersionPolicy(params: GetLayerVersionPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetLayerVersionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the permission policy for a layer version. For more information, see AddLayerVersionPermission.
       */
    def getLayerVersionPolicy(
      params: GetLayerVersionPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLayerVersionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLayerVersionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource policy associated with the specified Lambda function. This action requires permission for the lambda:GetPolicy action. 
       */
    def getPolicy(): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource policy associated with the specified Lambda function. This action requires permission for the lambda:GetPolicy action. 
       */
    def getPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource policy associated with the specified Lambda function. This action requires permission for the lambda:GetPolicy action. 
       */
    def getPolicy(params: GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource policy associated with the specified Lambda function. This action requires permission for the lambda:GetPolicy action. 
       */
    def getPolicy(
      params: GetPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Invokes a Lambda function. For an example, see Create the Lambda Function and Test It Manually.  Specify just a function name to invoke the latest version of the function. To invoke a published version, use the Qualifier parameter to specify a version or alias. If you use the RequestResponse (synchronous) invocation option, the function will be invoked only once. If you use the Event (asynchronous) invocation option, the function will be invoked at least once in response to an event and the function must be idempotent to handle this. For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action. The TooManyRequestsException noted below will return the following: ConcurrentInvocationLimitExceeded will be returned if you have no functions with reserved concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds the account's unreserved concurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be returned when a function with reserved concurrency exceeds its configured concurrency limit. 
       */
    def invoke(): awsDashSdkLib.libRequestMod.Request[InvocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Invokes a Lambda function. For an example, see Create the Lambda Function and Test It Manually.  Specify just a function name to invoke the latest version of the function. To invoke a published version, use the Qualifier parameter to specify a version or alias. If you use the RequestResponse (synchronous) invocation option, the function will be invoked only once. If you use the Event (asynchronous) invocation option, the function will be invoked at least once in response to an event and the function must be idempotent to handle this. For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action. The TooManyRequestsException noted below will return the following: ConcurrentInvocationLimitExceeded will be returned if you have no functions with reserved concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds the account's unreserved concurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be returned when a function with reserved concurrency exceeds its configured concurrency limit. 
       */
    def invoke(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvocationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Invokes a Lambda function. For an example, see Create the Lambda Function and Test It Manually.  Specify just a function name to invoke the latest version of the function. To invoke a published version, use the Qualifier parameter to specify a version or alias. If you use the RequestResponse (synchronous) invocation option, the function will be invoked only once. If you use the Event (asynchronous) invocation option, the function will be invoked at least once in response to an event and the function must be idempotent to handle this. For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action. The TooManyRequestsException noted below will return the following: ConcurrentInvocationLimitExceeded will be returned if you have no functions with reserved concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds the account's unreserved concurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be returned when a function with reserved concurrency exceeds its configured concurrency limit. 
       */
    def invoke(params: InvocationRequest): awsDashSdkLib.libRequestMod.Request[InvocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Invokes a Lambda function. For an example, see Create the Lambda Function and Test It Manually.  Specify just a function name to invoke the latest version of the function. To invoke a published version, use the Qualifier parameter to specify a version or alias. If you use the RequestResponse (synchronous) invocation option, the function will be invoked only once. If you use the Event (asynchronous) invocation option, the function will be invoked at least once in response to an event and the function must be idempotent to handle this. For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action. The TooManyRequestsException noted below will return the following: ConcurrentInvocationLimitExceeded will be returned if you have no functions with reserved concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds the account's unreserved concurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be returned when a function with reserved concurrency exceeds its configured concurrency limit. 
       */
    def invoke(
      params: InvocationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvocationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  For asynchronous function invocation, use Invoke.  Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console. This operation requires permission for the lambda:InvokeFunction action.
       */
    def invokeAsync(): awsDashSdkLib.libRequestMod.Request[InvokeAsyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  For asynchronous function invocation, use Invoke.  Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console. This operation requires permission for the lambda:InvokeFunction action.
       */
    def invokeAsync(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvokeAsyncResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvokeAsyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  For asynchronous function invocation, use Invoke.  Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console. This operation requires permission for the lambda:InvokeFunction action.
       */
    def invokeAsync(params: InvokeAsyncRequest): awsDashSdkLib.libRequestMod.Request[InvokeAsyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  For asynchronous function invocation, use Invoke.  Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console. This operation requires permission for the lambda:InvokeFunction action.
       */
    def invokeAsync(
      params: InvokeAsyncRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvokeAsyncResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvokeAsyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as the alias ARN, description, alias name, and the function version to which it points. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:ListAliases action.
       */
    def listAliases(): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as the alias ARN, description, alias name, and the function version to which it points. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:ListAliases action.
       */
    def listAliases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as the alias ARN, description, alias name, and the function version to which it points. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:ListAliases action.
       */
    def listAliases(params: ListAliasesRequest): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as the alias ARN, description, alias name, and the function version to which it points. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:ListAliases action.
       */
    def listAliases(
      params: ListAliasesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
       */
    def listEventSourceMappings(): awsDashSdkLib.libRequestMod.Request[ListEventSourceMappingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
       */
    def listEventSourceMappings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEventSourceMappingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEventSourceMappingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
       */
    def listEventSourceMappings(params: ListEventSourceMappingsRequest): awsDashSdkLib.libRequestMod.Request[ListEventSourceMappingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
       */
    def listEventSourceMappings(
      params: ListEventSourceMappingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEventSourceMappingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEventSourceMappingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of your Lambda functions. For each function, the response includes the function configuration information. You must use GetFunction to retrieve the code for your function. This operation requires permission for the lambda:ListFunctions action. If you are using the versioning feature, you can list all of your functions or only $LATEST versions. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
       */
    def listFunctions(): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of your Lambda functions. For each function, the response includes the function configuration information. You must use GetFunction to retrieve the code for your function. This operation requires permission for the lambda:ListFunctions action. If you are using the versioning feature, you can list all of your functions or only $LATEST versions. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
       */
    def listFunctions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFunctionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of your Lambda functions. For each function, the response includes the function configuration information. You must use GetFunction to retrieve the code for your function. This operation requires permission for the lambda:ListFunctions action. If you are using the versioning feature, you can list all of your functions or only $LATEST versions. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
       */
    def listFunctions(params: ListFunctionsRequest): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of your Lambda functions. For each function, the response includes the function configuration information. You must use GetFunction to retrieve the code for your function. This operation requires permission for the lambda:ListFunctions action. If you are using the versioning feature, you can list all of your functions or only $LATEST versions. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
       */
    def listFunctions(
      params: ListFunctionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFunctionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
       */
    def listLayerVersions(): awsDashSdkLib.libRequestMod.Request[ListLayerVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
       */
    def listLayerVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLayerVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLayerVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
       */
    def listLayerVersions(params: ListLayerVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListLayerVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
       */
    def listLayerVersions(
      params: ListLayerVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLayerVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLayerVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists function layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
       */
    def listLayers(): awsDashSdkLib.libRequestMod.Request[ListLayersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists function layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
       */
    def listLayers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLayersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLayersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists function layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
       */
    def listLayers(params: ListLayersRequest): awsDashSdkLib.libRequestMod.Request[ListLayersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists function layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
       */
    def listLayers(
      params: ListLayersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLayersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLayersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more information on Tagging, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
       */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more information on Tagging, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
       */
    def listTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more information on Tagging, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
       */
    def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more information on Tagging, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
       */
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all versions of a function. For information about versioning, see AWS Lambda Function Versioning and Aliases. 
       */
    def listVersionsByFunction(): awsDashSdkLib.libRequestMod.Request[ListVersionsByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all versions of a function. For information about versioning, see AWS Lambda Function Versioning and Aliases. 
       */
    def listVersionsByFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVersionsByFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVersionsByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all versions of a function. For information about versioning, see AWS Lambda Function Versioning and Aliases. 
       */
    def listVersionsByFunction(params: ListVersionsByFunctionRequest): awsDashSdkLib.libRequestMod.Request[ListVersionsByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all versions of a function. For information about versioning, see AWS Lambda Function Versioning and Aliases. 
       */
    def listVersionsByFunction(
      params: ListVersionsByFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVersionsByFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVersionsByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a function layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
       */
    def publishLayerVersion(): awsDashSdkLib.libRequestMod.Request[PublishLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a function layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
       */
    def publishLayerVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PublishLayerVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PublishLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a function layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
       */
    def publishLayerVersion(params: PublishLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[PublishLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a function layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
       */
    def publishLayerVersion(
      params: PublishLayerVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PublishLayerVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PublishLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot of the function code and configuration information from $LATEST and publishes a new version. The code and configuration cannot be modified after publication. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
       */
    def publishVersion(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot of the function code and configuration information from $LATEST and publishes a new version. The code and configuration cannot be modified after publication. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
       */
    def publishVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot of the function code and configuration information from $LATEST and publishes a new version. The code and configuration cannot be modified after publication. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
       */
    def publishVersion(params: PublishVersionRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot of the function code and configuration information from $LATEST and publishes a new version. The code and configuration cannot be modified after publication. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
       */
    def publishVersion(
      params: PublishVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you have a total of 900 available to allocate to individual functions. For more information, see Managing Concurrency.
       */
    def putFunctionConcurrency(): awsDashSdkLib.libRequestMod.Request[Concurrency, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you have a total of 900 available to allocate to individual functions. For more information, see Managing Concurrency.
       */
    def putFunctionConcurrency(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Concurrency, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Concurrency, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you have a total of 900 available to allocate to individual functions. For more information, see Managing Concurrency.
       */
    def putFunctionConcurrency(params: PutFunctionConcurrencyRequest): awsDashSdkLib.libRequestMod.Request[Concurrency, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you have a total of 900 available to allocate to individual functions. For more information, see Managing Concurrency.
       */
    def putFunctionConcurrency(
      params: PutFunctionConcurrencyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Concurrency, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Concurrency, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a statement from the permissions policy for a layer version. For more information, see AddLayerVersionPermission.
       */
    def removeLayerVersionPermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a statement from the permissions policy for a layer version. For more information, see AddLayerVersionPermission.
       */
    def removeLayerVersionPermission(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a statement from the permissions policy for a layer version. For more information, see AddLayerVersionPermission.
       */
    def removeLayerVersionPermission(params: RemoveLayerVersionPermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a statement from the permissions policy for a layer version. For more information, see AddLayerVersionPermission.
       */
    def removeLayerVersionPermission(
      params: RemoveLayerVersionPermissionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes permissions from a function. You can remove individual permissions from an resource policy associated with a Lambda function by providing a statement ID that you provided when you added the permission. When you remove permissions, disable the event source mapping or trigger configuration first to avoid errors. Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  You need permission for the lambda:RemovePermission action.
       */
    def removePermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes permissions from a function. You can remove individual permissions from an resource policy associated with a Lambda function by providing a statement ID that you provided when you added the permission. When you remove permissions, disable the event source mapping or trigger configuration first to avoid errors. Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  You need permission for the lambda:RemovePermission action.
       */
    def removePermission(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes permissions from a function. You can remove individual permissions from an resource policy associated with a Lambda function by providing a statement ID that you provided when you added the permission. When you remove permissions, disable the event source mapping or trigger configuration first to avoid errors. Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  You need permission for the lambda:RemovePermission action.
       */
    def removePermission(params: RemovePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes permissions from a function. You can remove individual permissions from an resource policy associated with a Lambda function by providing a statement ID that you provided when you added the permission. When you remove permissions, disable the event source mapping or trigger configuration first to avoid errors. Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  You need permission for the lambda:RemovePermission action.
       */
    def removePermission(
      params: RemovePermissionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a list of tags (key-value pairs) on the Lambda function. Requires the Lambda function ARN (Amazon Resource Name). If a key is specified without a value, Lambda creates a tag with the specified key and a value of null. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
       */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a list of tags (key-value pairs) on the Lambda function. Requires the Lambda function ARN (Amazon Resource Name). If a key is specified without a value, Lambda creates a tag with the specified key and a value of null. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
       */
    def tagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a list of tags (key-value pairs) on the Lambda function. Requires the Lambda function ARN (Amazon Resource Name). If a key is specified without a value, Lambda creates a tag with the specified key and a value of null. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
       */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a list of tags (key-value pairs) on the Lambda function. Requires the Lambda function ARN (Amazon Resource Name). If a key is specified without a value, Lambda creates a tag with the specified key and a value of null. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
       */
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from a Lambda function. Requires the function ARN (Amazon Resource Name). For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
       */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from a Lambda function. Requires the function ARN (Amazon Resource Name). For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
       */
    def untagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from a Lambda function. Requires the function ARN (Amazon Resource Name). For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
       */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from a Lambda function. Requires the function ARN (Amazon Resource Name). For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
       */
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using this API you can update the function version to which the alias points and the alias description. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:UpdateAlias action.
       */
    def updateAlias(): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using this API you can update the function version to which the alias points and the alias description. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:UpdateAlias action.
       */
    def updateAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using this API you can update the function version to which the alias points and the alias description. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:UpdateAlias action.
       */
    def updateAlias(params: UpdateAliasRequest): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using this API you can update the function version to which the alias points and the alias description. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:UpdateAlias action.
       */
    def updateAlias(
      params: UpdateAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location.
       */
    def updateEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location.
       */
    def updateEventSourceMapping(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location.
       */
    def updateEventSourceMapping(params: UpdateEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location.
       */
    def updateEventSourceMapping(
      params: UpdateEventSourceMappingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda function and cannot be used to update the function configuration. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionCode action.
       */
    def updateFunctionCode(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda function and cannot be used to update the function configuration. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionCode action.
       */
    def updateFunctionCode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda function and cannot be used to update the function configuration. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionCode action.
       */
    def updateFunctionCode(params: UpdateFunctionCodeRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda function and cannot be used to update the function configuration. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionCode action.
       */
    def updateFunctionCode(
      params: UpdateFunctionCodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the configuration parameters for the specified Lambda function by using the values provided in the request. You provide only the parameters you want to change. This operation must only be used on an existing Lambda function and cannot be used to update the function's code. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionConfiguration action.
       */
    def updateFunctionConfiguration(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the configuration parameters for the specified Lambda function by using the values provided in the request. You provide only the parameters you want to change. This operation must only be used on an existing Lambda function and cannot be used to update the function's code. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionConfiguration action.
       */
    def updateFunctionConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the configuration parameters for the specified Lambda function by using the values provided in the request. You provide only the parameters you want to change. This operation must only be used on an existing Lambda function and cannot be used to update the function's code. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionConfiguration action.
       */
    def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the configuration parameters for the specified Lambda function by using the values provided in the request. You provide only the parameters you want to change. This operation must only be used on an existing Lambda function and cannot be used to update the function's code. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionConfiguration action.
       */
    def updateFunctionConfiguration(
      params: UpdateFunctionConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagResourceRequest extends js.Object {
    /**
         * The ARN (Amazon Resource Name) of the function. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
         */
    var Resource: FunctionArn
    /**
         * The list of tag keys to be deleted from the function. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
         */
    var TagKeys: TagKeyList
  }
  
  
  trait UpdateAliasRequest extends js.Object {
    /**
         * You can change the description of the alias using this parameter.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The name of the lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * Using this parameter you can change the Lambda function version to which the alias points.
         */
    var FunctionVersion: js.UndefOr[Version] = js.undefined
    /**
         * The alias name.
         */
    var Name: Alias
    /**
         * An optional value you can use to ensure you are updating the latest update of the function version or alias. If the RevisionID you pass doesn't match the latest RevisionId of the function or alias, it will fail with an error message, advising you retrieve the latest function version or alias RevisionID using either GetFunction or GetAlias.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Specifies an additional version your alias can point to, allowing you to dictate what percentage of traffic will invoke each version. For more information, see Traffic Shifting Using Aliases.
         */
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
  }
  
  
  trait UpdateEventSourceMappingRequest extends js.Object {
    /**
         * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.  
         */
    var BatchSize: js.UndefOr[BatchSize] = js.undefined
    /**
         * Disables the event source mapping to pause polling and invocation.
         */
    var Enabled: js.UndefOr[Enabled] = js.undefined
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
         */
    var FunctionName: js.UndefOr[FunctionName] = js.undefined
    /**
         * The identifier of the event source mapping.
         */
    var UUID: java.lang.String
  }
  
  
  trait UpdateFunctionCodeRequest extends js.Object {
    /**
         * This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and publish a version as an atomic operation. It will do all necessary computation and validation of your code but will not upload it or a publish a version. Each time this operation is invoked, the CodeSha256 hash value of the provided code will also be computed and returned in the response.
         */
    var DryRun: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as an atomic operation.
         */
    var Publish: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * An optional value you can use to ensure you are updating the latest update of the function version or alias. If the RevisionID you pass doesn't match the latest RevisionId of the function or alias, it will fail with an error message, advising you to retrieve the latest function version or alias RevisionID using either using using either GetFunction or GetAlias.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside in the same AWS Region where you are creating the Lambda function.
         */
    var S3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
         * The Amazon S3 object (the deployment package) key name you want to upload.
         */
    var S3Key: js.UndefOr[S3Key] = js.undefined
    /**
         * The Amazon S3 object (the deployment package) version you want to upload.
         */
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined
    /**
         * The contents of your zip file containing your deployment package. If you are using the web API directly, the contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for you. For more information about creating a .zip file, see Execution Permissions. 
         */
    var ZipFile: js.UndefOr[_Blob] = js.undefined
  }
  
  
  trait UpdateFunctionConfigurationRequest extends js.Object {
    /**
         * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see Dead Letter Queues.
         */
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined
    /**
         * A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful description as you see fit.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The parent object that contains your environment's configuration settings.
         */
    var Environment: js.UndefOr[Environment] = js.undefined
    /**
         * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
         */
    var FunctionName: FunctionName
    /**
         * The function that Lambda calls to begin executing your function. For Node.js, it is the module-name.export value in your function. 
         */
    var Handler: js.UndefOr[Handler] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If you elect to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.
         */
    var KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined
    /**
         * A list of function layers to add to the function's execution environment.
         */
    var Layers: js.UndefOr[LayerList] = js.undefined
    /**
         * The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the amount of CPU allocated to your function. Your function use-case determines your CPU and memory requirements. For example, a database operation might need less memory compared to an image processing function. The default value is 128 MB. The value must be a multiple of 64 MB.
         */
    var MemorySize: js.UndefOr[MemorySize] = js.undefined
    /**
         * An optional value you can use to ensure you are updating the latest update of the function version or alias. If the RevisionID you pass doesn't match the latest RevisionId of the function or alias, it will fail with an error message, advising you to retrieve the latest function version or alias RevisionID using either GetFunction or GetAlias.
         */
    var RevisionId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.
         */
    var Role: js.UndefOr[RoleArn] = js.undefined
    /**
         * The runtime version for the function.
         */
    var Runtime: js.UndefOr[Runtime] = js.undefined
    /**
         * The amount of time that Lambda allows a function to run before terminating it. The default is 3 seconds. The maximum allowed value is 900 seconds.
         */
    var Timeout: js.UndefOr[Timeout] = js.undefined
    /**
         * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
         */
    var TracingConfig: js.UndefOr[TracingConfig] = js.undefined
    /**
         * Specify security groups and subnets in a VPC to which your Lambda function needs access.
         */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait VpcConfig extends js.Object {
    /**
         * A list of VPC security groups IDs.
         */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    /**
         * A list of VPC subnet IDs.
         */
    var SubnetIds: js.UndefOr[SubnetIds] = js.undefined
  }
  
  
  trait VpcConfigResponse extends js.Object {
    /**
         * A list of VPC security groups IDs.
         */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    /**
         * A list of VPC subnet IDs.
         */
    var SubnetIds: js.UndefOr[SubnetIds] = js.undefined
    /**
         * The ID of the VPC.
         */
    var VpcId: js.UndefOr[VpcId] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Action = java.lang.String
  type AdditionalVersion = java.lang.String
  type Alias = java.lang.String
  type AliasList = js.Array[AliasConfiguration]
  type Arn = java.lang.String
  type BatchSize = scala.Double
  type BlobStream = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsLambdaMod.Blob | java.lang.String | nodeLib.streamMod.Readable
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CompatibleRuntimes = js.Array[Runtime]
  type Description = java.lang.String
  type Enabled = scala.Boolean
  type EnvironmentVariableName = java.lang.String
  type EnvironmentVariableValue = java.lang.String
  type EventSourceMappingsList = js.Array[EventSourceMappingConfiguration]
  type EventSourcePosition = awsDashSdkLib.awsDashSdkLibStrings.TRIM_HORIZON | awsDashSdkLib.awsDashSdkLibStrings.LATEST | awsDashSdkLib.awsDashSdkLibStrings.AT_TIMESTAMP | java.lang.String
  type EventSourceToken = java.lang.String
  type FunctionArn = java.lang.String
  type FunctionList = js.Array[FunctionConfiguration]
  type FunctionName = java.lang.String
  type FunctionVersion = awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
  type Handler = java.lang.String
  type HttpStatus = scala.Double
  type Integer = scala.Double
  type InvocationType = awsDashSdkLib.awsDashSdkLibStrings.Event | awsDashSdkLib.awsDashSdkLibStrings.RequestResponse | awsDashSdkLib.awsDashSdkLibStrings.DryRun | java.lang.String
  type KMSKeyArn = java.lang.String
  type LayerArn = java.lang.String
  type LayerList = js.Array[LayerVersionArn]
  type LayerName = java.lang.String
  type LayerPermissionAllowedAction = java.lang.String
  type LayerPermissionAllowedPrincipal = java.lang.String
  type LayerVersionArn = java.lang.String
  type LayerVersionNumber = scala.Double
  type LayerVersionsList = js.Array[LayerVersionsListItem]
  type LayersList = js.Array[LayersListItem]
  type LayersReferenceList = js.Array[Layer]
  type LicenseInfo = java.lang.String
  type LogType = awsDashSdkLib.awsDashSdkLibStrings.None | awsDashSdkLib.awsDashSdkLibStrings.Tail | java.lang.String
  type Long = scala.Double
  type MasterRegion = java.lang.String
  type MaxLayerListItems = scala.Double
  type MaxListItems = scala.Double
  type MemorySize = scala.Double
  type NameSpacedFunctionArn = java.lang.String
  type NamespacedFunctionName = java.lang.String
  type NamespacedStatementId = java.lang.String
  type OrganizationId = java.lang.String
  type Principal = java.lang.String
  type Qualifier = java.lang.String
  type ReservedConcurrentExecutions = scala.Double
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  type Runtime = awsDashSdkLib.awsDashSdkLibStrings.nodejs | awsDashSdkLib.awsDashSdkLibStrings.nodejs4DOT3 | awsDashSdkLib.awsDashSdkLibStrings.nodejs6DOT10 | awsDashSdkLib.awsDashSdkLibStrings.nodejs8DOT10 | awsDashSdkLib.awsDashSdkLibStrings.java8 | awsDashSdkLib.awsDashSdkLibStrings.python2DOT7 | awsDashSdkLib.awsDashSdkLibStrings.python3DOT6 | awsDashSdkLib.awsDashSdkLibStrings.python3DOT7 | awsDashSdkLib.awsDashSdkLibStrings.dotnetcore1DOT0 | awsDashSdkLib.awsDashSdkLibStrings.dotnetcore2DOT0 | awsDashSdkLib.awsDashSdkLibStrings.dotnetcore2DOT1 | awsDashSdkLib.awsDashSdkLibStrings.`nodejs4DOT3-edge` | awsDashSdkLib.awsDashSdkLibStrings.go1DOTx | awsDashSdkLib.awsDashSdkLibStrings.ruby2DOT5 | awsDashSdkLib.awsDashSdkLibStrings.provided | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SensitiveString = java.lang.String
  type SourceOwner = java.lang.String
  type StatementId = java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Timeout = scala.Double
  type Timestamp = java.lang.String
  type TracingMode = awsDashSdkLib.awsDashSdkLibStrings.Active | awsDashSdkLib.awsDashSdkLibStrings.PassThrough | java.lang.String
  type UnreservedConcurrentExecutions = scala.Double
  type Version = java.lang.String
  type VpcId = java.lang.String
  type Weight = scala.Double
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsLambdaMod.Blob | java.lang.String
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2014-11-11` | awsDashSdkLib.awsDashSdkLibStrings.`2015-03-31` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

