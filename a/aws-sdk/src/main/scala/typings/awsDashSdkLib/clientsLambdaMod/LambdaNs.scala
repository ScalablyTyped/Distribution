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
      * The maximum size of your function's code and layers when they're extracted.
      */
    var CodeSizeUnzipped: js.UndefOr[Long] = js.undefined
    /**
      * The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for larger files.
      */
    var CodeSizeZipped: js.UndefOr[Long] = js.undefined
    /**
      * The maximum number of simultaneous function executions.
      */
    var ConcurrentExecutions: js.UndefOr[Integer] = js.undefined
    /**
      * The amount of storage space that you can use for all deployment packages and layer archives.
      */
    var TotalCodeSize: js.UndefOr[Long] = js.undefined
    /**
      * The maximum number of simultaneous function executions, minus the capacity that's reserved for individual functions with PutFunctionConcurrency.
      */
    var UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions] = js.undefined
  }
  
  trait AccountUsage extends js.Object {
    /**
      * The number of Lambda functions.
      */
    var FunctionCount: js.UndefOr[Long] = js.undefined
    /**
      * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
      */
    var TotalCodeSize: js.UndefOr[Long] = js.undefined
  }
  
  trait AddLayerVersionPermissionRequest extends js.Object {
    /**
      * The API action that grants access to the layer. For example, lambda:GetLayerVersion.
      */
    var Action: LayerPermissionAllowedAction
    /**
      * The name or Amazon Resource Name (ARN) of the layer.
      */
    var LayerName: awsDashSdkLib.clientsLambdaMod.LambdaNs.LayerName
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
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * An identifier that distinguishes the policy from others on the same layer version.
      */
    var StatementId: awsDashSdkLib.clientsLambdaMod.LambdaNs.StatementId
    /**
      * The version number.
      */
    var VersionNumber: LayerVersionNumber
  }
  
  trait AddLayerVersionPermissionResponse extends js.Object {
    /**
      * A unique identifier for the current revision of the policy.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * The permission statement.
      */
    var Statement: js.UndefOr[String] = js.undefined
  }
  
  trait AddPermissionRequest extends js.Object {
    /**
      * The action that the principal can use on the function. For example, lambda:InvokeFunction or lambda:GetFunction.
      */
    var Action: awsDashSdkLib.clientsLambdaMod.LambdaNs.Action
    /**
      * For Alexa Smart Home functions, a token that must be supplied by the invoker.
      */
    var EventSourceToken: js.UndefOr[EventSourceToken] = js.undefined
    /**
      * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * The AWS service or account that invokes the function. If you specify a service, use SourceArn or SourceAccount to limit who can invoke the function through that service.
      */
    var Principal: awsDashSdkLib.clientsLambdaMod.LambdaNs.Principal
    /**
      * Specify a version or alias to add permissions to a published version of the function.
      */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
    /**
      * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a policy that has changed since you last read it.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * For AWS services, the ID of the account that owns the resource. Use this instead of SourceArn to grant permission to resources that are owned by another account (for example, all of an account's Amazon S3 buckets). Or use it together with SourceArn to ensure that the resource is owned by the specified account. For example, an Amazon S3 bucket could be deleted by its owner and recreated by another account.
      */
    var SourceAccount: js.UndefOr[SourceOwner] = js.undefined
    /**
      * For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket or Amazon SNS topic.
      */
    var SourceArn: js.UndefOr[Arn] = js.undefined
    /**
      * A statement identifier that differentiates the statement from others in the same policy.
      */
    var StatementId: awsDashSdkLib.clientsLambdaMod.LambdaNs.StatementId
  }
  
  trait AddPermissionResponse extends js.Object {
    /**
      * The permission statement that's added to the function policy.
      */
    var Statement: js.UndefOr[String] = js.undefined
  }
  
  trait AdditionalVersionWeights
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Weight]
  
  trait AliasConfiguration extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the alias.
      */
    var AliasArn: js.UndefOr[FunctionArn] = js.undefined
    /**
      * A description of the alias.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The function version that the alias invokes.
      */
    var FunctionVersion: js.UndefOr[Version] = js.undefined
    /**
      * The name of the alias.
      */
    var Name: js.UndefOr[Alias] = js.undefined
    /**
      * A unique identifier that changes when you update the alias.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * The routing configuration of the alias.
      */
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
  }
  
  trait AliasRoutingConfiguration extends js.Object {
    /**
      * The name of the second alias, and the percentage of traffic that's routed to it.
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
      * The number of concurrent executions that are reserved for this function. For more information, see Managing Concurrency.
      */
    var ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions] = js.undefined
  }
  
  trait CreateAliasRequest extends js.Object {
    /**
      * A description of the alias.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * The function version that the alias invokes.
      */
    var FunctionVersion: Version
    /**
      * The name of the alias.
      */
    var Name: Alias
    /**
      * The routing configuration of the alias.
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
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources. AT_TIMESTAMP is only supported for Amazon Kinesis streams.
      */
    var StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined
    /**
      * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading.
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
      * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see Programming Model.
      */
    var Handler: awsDashSdkLib.clientsLambdaMod.LambdaNs.Handler
    /**
      * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
      */
    var KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined
    /**
      * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
      */
    var Layers: js.UndefOr[LayerList] = js.undefined
    /**
      * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
      */
    var MemorySize: js.UndefOr[MemorySize] = js.undefined
    /**
      * Set to true to publish the first version of the function during creation.
      */
    var Publish: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the function's execution role.
      */
    var Role: RoleArn
    /**
      * The identifier of the function's runtime.
      */
    var Runtime: awsDashSdkLib.clientsLambdaMod.LambdaNs.Runtime
    /**
      * A list of tags to apply to the function.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
      */
    var Timeout: js.UndefOr[Timeout] = js.undefined
    /**
      * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
      */
    var TracingConfig: js.UndefOr[TracingConfig] = js.undefined
    /**
      * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC. When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more information, see VPC Settings.
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
      * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * The name of the alias.
      */
    var Name: Alias
  }
  
  trait DeleteEventSourceMappingRequest extends js.Object {
    /**
      * The identifier of the event source mapping.
      */
    var UUID: String
  }
  
  trait DeleteFunctionConcurrencyRequest extends js.Object {
    /**
      * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
  }
  
  trait DeleteFunctionRequest extends js.Object {
    /**
      * The name of the Lambda function or version.  Name formats     Function name - my-function (name-only), my-function:1 (with version).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * Specify a version to delete. You can't delete a version that's referenced by an alias.
      */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  trait DeleteLayerVersionRequest extends js.Object {
    /**
      * The name or Amazon Resource Name (ARN) of the layer.
      */
    var LayerName: awsDashSdkLib.clientsLambdaMod.LambdaNs.LayerName
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
    var ErrorCode: js.UndefOr[String] = js.undefined
    /**
      * The error message.
      */
    var Message: js.UndefOr[SensitiveString] = js.undefined
  }
  
  trait EnvironmentResponse extends js.Object {
    /**
      * Error messages for environment variables that couldn't be applied.
      */
    var Error: js.UndefOr[EnvironmentError] = js.undefined
    /**
      * Environment variable key-value pairs.
      */
    var Variables: js.UndefOr[EnvironmentVariables] = js.undefined
  }
  
  trait EnvironmentVariables
    extends /* key */ org.scalablytyped.runtime.StringDictionary[EnvironmentVariableValue]
  
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
      * The date that the event source mapping was last updated.
      */
    var LastModified: js.UndefOr[_Date] = js.undefined
    /**
      * The result of the last AWS Lambda invocation of your Lambda function.
      */
    var LastProcessingResult: js.UndefOr[String] = js.undefined
    /**
      * The state of the event source mapping. It can be one of the following: Creating, Enabling, Enabled, Disabling, Disabled, Updating, or Deleting.
      */
    var State: js.UndefOr[String] = js.undefined
    /**
      * The cause of the last state change, either User initiated or Lambda initiated.
      */
    var StateTransitionReason: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the event source mapping.
      */
    var UUID: js.UndefOr[String] = js.undefined
  }
  
  trait FunctionCode extends js.Object {
    /**
      * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
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
      * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
      */
    var ZipFile: js.UndefOr[_Blob] = js.undefined
  }
  
  trait FunctionCodeLocation extends js.Object {
    /**
      * A presigned URL that you can use to download the deployment package.
      */
    var Location: js.UndefOr[String] = js.undefined
    /**
      * The service that's hosting the file.
      */
    var RepositoryType: js.UndefOr[String] = js.undefined
  }
  
  trait FunctionConfiguration extends js.Object {
    /**
      * The SHA256 hash of the function's deployment package.
      */
    var CodeSha256: js.UndefOr[String] = js.undefined
    /**
      * The size of the function's deployment package, in bytes.
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
      * The function's Amazon Resource Name (ARN).
      */
    var FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.undefined
    /**
      * The name of the function.
      */
    var FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined
    /**
      * The function that Lambda calls to begin executing your function.
      */
    var Handler: js.UndefOr[Handler] = js.undefined
    /**
      * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've configured a customer-managed CMK.
      */
    var KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined
    /**
      * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
      */
    var LastModified: js.UndefOr[Timestamp] = js.undefined
    /**
      * The function's  layers.
      */
    var Layers: js.UndefOr[LayersReferenceList] = js.undefined
    /**
      * For Lambda@Edge functions, the ARN of the master function.
      */
    var MasterArn: js.UndefOr[FunctionArn] = js.undefined
    /**
      * The memory that's allocated to the function.
      */
    var MemorySize: js.UndefOr[MemorySize] = js.undefined
    /**
      * The latest updated revision of the function or alias.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * The function's execution role.
      */
    var Role: js.UndefOr[RoleArn] = js.undefined
    /**
      * The runtime environment for the Lambda function.
      */
    var Runtime: js.UndefOr[Runtime] = js.undefined
    /**
      * The amount of time that Lambda allows a function to run before stopping it.
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
      * Limits that are related to concurrency and code storage.
      */
    var AccountLimit: js.UndefOr[AccountLimit] = js.undefined
    /**
      * The number of functions and amount of storage in use.
      */
    var AccountUsage: js.UndefOr[AccountUsage] = js.undefined
  }
  
  trait GetAliasRequest extends js.Object {
    /**
      * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * The name of the alias.
      */
    var Name: Alias
  }
  
  trait GetEventSourceMappingRequest extends js.Object {
    /**
      * The identifier of the event source mapping.
      */
    var UUID: String
  }
  
  trait GetFunctionConfigurationRequest extends js.Object {
    /**
      * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: NamespacedFunctionName
    /**
      * Specify a version or alias to get details about a published version of the function.
      */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  trait GetFunctionRequest extends js.Object {
    /**
      * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: NamespacedFunctionName
    /**
      * Specify a version or alias to get details about a published version of the function.
      */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  trait GetFunctionResponse extends js.Object {
    /**
      * The deployment package of the function or version.
      */
    var Code: js.UndefOr[FunctionCodeLocation] = js.undefined
    /**
      * The function's reserved concurrency.
      */
    var Concurrency: js.UndefOr[Concurrency] = js.undefined
    /**
      * The configuration of the function or version.
      */
    var Configuration: js.UndefOr[FunctionConfiguration] = js.undefined
    /**
      * The function's tags.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait GetLayerVersionPolicyRequest extends js.Object {
    /**
      * The name or Amazon Resource Name (ARN) of the layer.
      */
    var LayerName: awsDashSdkLib.clientsLambdaMod.LambdaNs.LayerName
    /**
      * The version number.
      */
    var VersionNumber: LayerVersionNumber
  }
  
  trait GetLayerVersionPolicyResponse extends js.Object {
    /**
      * The policy document.
      */
    var Policy: js.UndefOr[String] = js.undefined
    /**
      * A unique identifier for the current revision of the policy.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
  }
  
  trait GetLayerVersionRequest extends js.Object {
    /**
      * The name or Amazon Resource Name (ARN) of the layer.
      */
    var LayerName: awsDashSdkLib.clientsLambdaMod.LambdaNs.LayerName
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
      * The ARN of the layer.
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
      * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: NamespacedFunctionName
    /**
      * Specify a version or alias to get the policy for that resource.
      */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  trait GetPolicyResponse extends js.Object {
    /**
      * The resource-based policy.
      */
    var Policy: js.UndefOr[String] = js.undefined
    /**
      * A unique identifier for the current revision of the policy.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
  }
  
  trait InvocationRequest extends js.Object {
    /**
      * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context object.
      */
    var ClientContext: js.UndefOr[String] = js.undefined
    /**
      * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: NamespacedFunctionName
    /**
      * Choose from the following options.    RequestResponse (default) - Invoke the function synchronously. Keep the connection open until the function returns a response or times out. The API response includes the function response and additional data.    Event - Invoke the function asynchronously. Send events that fail multiple times to the function's dead-letter queue (if it's configured). The API response only includes a status code.    DryRun - Validate parameter values and verify that the user or role has permission to invoke the function.  
      */
    var InvocationType: js.UndefOr[InvocationType] = js.undefined
    /**
      * Set to Tail to include the execution log in the response.
      */
    var LogType: js.UndefOr[LogType] = js.undefined
    /**
      * The JSON that you want to provide to your Lambda function as input.
      */
    var Payload: js.UndefOr[_Blob] = js.undefined
    /**
      * Specify a version or alias to invoke a published version of the function.
      */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
  }
  
  trait InvocationResponse extends js.Object {
    /**
      * The version of the function that executed. When you invoke a function with an alias, this indicates which version the alias resolved to.
      */
    var ExecutedVersion: js.UndefOr[Version] = js.undefined
    /**
      * If present, indicates that an error occurred during function execution. Details about the error are included in the response payload.    Handled - The runtime caught an error thrown by the function and formatted it into a JSON document.    Unhandled - The runtime didn't handle the error. For example, the function ran out of memory or timed out.  
      */
    var FunctionError: js.UndefOr[String] = js.undefined
    /**
      * The last 4 KB of the execution log, which is base64 encoded.
      */
    var LogResult: js.UndefOr[String] = js.undefined
    /**
      * The response from the function, or an error object.
      */
    var Payload: js.UndefOr[_Blob] = js.undefined
    /**
      * The HTTP status code is in the 200 range for a successful request. For the RequestResponse invocation type, this status code is 200. For the Event invocation type, this status code is 202. For the DryRun invocation type, the status code is 204.
      */
    var StatusCode: js.UndefOr[Integer] = js.undefined
  }
  
  trait InvokeAsyncRequest extends js.Object {
    /**
      * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: NamespacedFunctionName
    /**
      * The JSON that you want to provide to your Lambda function as input.
      */
    var InvokeArgs: BlobStream
  }
  
  trait InvokeAsyncResponse extends js.Object {
    /**
      * The status code.
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
    var CodeSha256: js.UndefOr[String] = js.undefined
    /**
      * The size of the layer archive in bytes.
      */
    var CodeSize: js.UndefOr[Long] = js.undefined
    /**
      * A link to the layer archive in Amazon S3 that is valid for 10 minutes.
      */
    var Location: js.UndefOr[String] = js.undefined
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
      * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * Specify a function version to only list aliases that invoke that version.
      */
    var FunctionVersion: js.UndefOr[Version] = js.undefined
    /**
      * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * Limit the number of aliases returned.
      */
    var MaxItems: js.UndefOr[MaxListItems] = js.undefined
  }
  
  trait ListAliasesResponse extends js.Object {
    /**
      * A list of aliases.
      */
    var Aliases: js.UndefOr[AliasList] = js.undefined
    /**
      * The pagination token that's included if more results are available.
      */
    var NextMarker: js.UndefOr[String] = js.undefined
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
    var Marker: js.UndefOr[String] = js.undefined
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
    var NextMarker: js.UndefOr[String] = js.undefined
  }
  
  trait ListFunctionsRequest extends js.Object {
    /**
      * Set to ALL to include entries for all published versions of each function.
      */
    var FunctionVersion: js.UndefOr[FunctionVersion] = js.undefined
    /**
      * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * For Lambda@Edge functions, the AWS Region of the master function. For example, us-east-2 or ALL. If specified, you must set FunctionVersion to ALL.
      */
    var MasterRegion: js.UndefOr[MasterRegion] = js.undefined
    /**
      * Specify a value between 1 and 50 to limit the number of functions in the response.
      */
    var MaxItems: js.UndefOr[MaxListItems] = js.undefined
  }
  
  trait ListFunctionsResponse extends js.Object {
    /**
      * A list of Lambda functions.
      */
    var Functions: js.UndefOr[FunctionList] = js.undefined
    /**
      * The pagination token that's included if more results are available.
      */
    var NextMarker: js.UndefOr[String] = js.undefined
  }
  
  trait ListLayerVersionsRequest extends js.Object {
    /**
      * A runtime identifier. For example, go1.x.
      */
    var CompatibleRuntime: js.UndefOr[Runtime] = js.undefined
    /**
      * The name or Amazon Resource Name (ARN) of the layer.
      */
    var LayerName: awsDashSdkLib.clientsLambdaMod.LambdaNs.LayerName
    /**
      * A pagination token returned by a previous call.
      */
    var Marker: js.UndefOr[String] = js.undefined
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
    var NextMarker: js.UndefOr[String] = js.undefined
  }
  
  trait ListLayersRequest extends js.Object {
    /**
      * A runtime identifier. For example, go1.x.
      */
    var CompatibleRuntime: js.UndefOr[Runtime] = js.undefined
    /**
      * A pagination token returned by a previous call.
      */
    var Marker: js.UndefOr[String] = js.undefined
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
    var NextMarker: js.UndefOr[String] = js.undefined
  }
  
  trait ListTagsRequest extends js.Object {
    /**
      * The function's Amazon Resource Name (ARN).
      */
    var Resource: FunctionArn
  }
  
  trait ListTagsResponse extends js.Object {
    /**
      * The function's tags.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait ListVersionsByFunctionRequest extends js.Object {
    /**
      * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: NamespacedFunctionName
    /**
      * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * Limit the number of versions that are returned.
      */
    var MaxItems: js.UndefOr[MaxListItems] = js.undefined
  }
  
  trait ListVersionsByFunctionResponse extends js.Object {
    /**
      * The pagination token that's included if more results are available.
      */
    var NextMarker: js.UndefOr[String] = js.undefined
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
      * The name or Amazon Resource Name (ARN) of the layer.
      */
    var LayerName: awsDashSdkLib.clientsLambdaMod.LambdaNs.LayerName
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
      * The ARN of the layer.
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
      * Only publish a version if the hash value matches the value that's specified. Use this option to avoid publishing a version if the function code has changed since you last updated it. You can get the hash for the version that you uploaded from the output of UpdateFunctionCode.
      */
    var CodeSha256: js.UndefOr[String] = js.undefined
    /**
      * A description for the version to override the description in the function configuration.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid publishing a version if the function configuration has changed since you last updated it.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
  }
  
  trait PutFunctionConcurrencyRequest extends js.Object {
    /**
      * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * The number of simultaneous executions to reserve for the function.
      */
    var ReservedConcurrentExecutions: awsDashSdkLib.clientsLambdaMod.LambdaNs.ReservedConcurrentExecutions
  }
  
  trait RemoveLayerVersionPermissionRequest extends js.Object {
    /**
      * The name or Amazon Resource Name (ARN) of the layer.
      */
    var LayerName: awsDashSdkLib.clientsLambdaMod.LambdaNs.LayerName
    /**
      * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * The identifier that was specified when the statement was added.
      */
    var StatementId: awsDashSdkLib.clientsLambdaMod.LambdaNs.StatementId
    /**
      * The version number.
      */
    var VersionNumber: LayerVersionNumber
  }
  
  trait RemovePermissionRequest extends js.Object {
    /**
      * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * Specify a version or alias to remove permissions from a published version of the function.
      */
    var Qualifier: js.UndefOr[Qualifier] = js.undefined
    /**
      * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a policy that has changed since you last read it.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * Statement ID of the permission to remove.
      */
    var StatementId: NamespacedStatementId
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The function's Amazon Resource Name (ARN).
      */
    var Resource: FunctionArn
    /**
      * A list of tags to apply to the function.
      */
    var Tags: awsDashSdkLib.clientsLambdaMod.LambdaNs.Tags
  }
  
  trait Tags
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
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
      * Adds permissions to the resource-based policy of a version of an AWS Lambda layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
      */
    def addLayerVersionPermission(): awsDashSdkLib.libRequestMod.Request[AddLayerVersionPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addLayerVersionPermission(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddLayerVersionPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddLayerVersionPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds permissions to the resource-based policy of a version of an AWS Lambda layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
      */
    def addLayerVersionPermission(params: AddLayerVersionPermissionRequest): awsDashSdkLib.libRequestMod.Request[AddLayerVersionPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addLayerVersionPermission(
      params: AddLayerVersionPermissionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddLayerVersionPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddLayerVersionPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Grants an AWS service or another account permission to use a function. You can apply the policy at the function level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function. To grant permission to another account, specify the account ID as the Principal. For AWS services, the principal is a domain-style identifier defined by the service, like s3.amazonaws.com or sns.amazonaws.com. For AWS services, you can also specify the ARN or owning account of the associated resource as the SourceArn or SourceAccount. If you grant permission to a service principal without specifying the source, other accounts could potentially configure resources in their account to invoke your Lambda function. This action adds a statement to a resource-based permission policy for the function. For more information about function policies, see Lambda Function Policies. 
      */
    def addPermission(): awsDashSdkLib.libRequestMod.Request[AddPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addPermission(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Grants an AWS service or another account permission to use a function. You can apply the policy at the function level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function. To grant permission to another account, specify the account ID as the Principal. For AWS services, the principal is a domain-style identifier defined by the service, like s3.amazonaws.com or sns.amazonaws.com. For AWS services, you can also specify the ARN or owning account of the associated resource as the SourceArn or SourceAccount. If you grant permission to a service principal without specifying the source, other accounts could potentially configure resources in their account to invoke your Lambda function. This action adds a statement to a resource-based permission policy for the function. For more information about function policies, see Lambda Function Policies. 
      */
    def addPermission(params: AddPermissionRequest): awsDashSdkLib.libRequestMod.Request[AddPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addPermission(
      params: AddPermissionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddPermissionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for a Lambda function version. Use aliases to provide clients with a function identifier that you can update to invoke a different version. You can also map an alias to split invocation requests between two versions. Use the RoutingConfig parameter to specify a second version and the percentage of invocation requests that it receives.
      */
    def createAlias(): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for a Lambda function version. Use aliases to provide clients with a function identifier that you can update to invoke a different version. You can also map an alias to split invocation requests between two versions. Use the RoutingConfig parameter to specify a second version and the percentage of invocation requests that it receives.
      */
    def createAlias(params: CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def createEventSourceMapping(
      params: CreateEventSourceMappingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Lambda function. To create a function, you need a deployment package and an execution role. The deployment package contains your function code. The execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs for log streaming and AWS X-Ray for request tracing. A function has an unpublished version, and can have published versions and aliases. The unpublished version changes when you update your function's code and configuration. A published version is a snapshot of your function code and configuration that can't be changed. An alias is a named resource that maps to a version, and can be changed to map to a different version. Use the Publish parameter to create version 1 of your function from its initial configuration. The other parameters let you configure version-specific and function-level settings. You can modify version-specific settings later with UpdateFunctionConfiguration. Function-level settings apply to both the unpublished and published versions of the function, and include tags (TagResource) and per-function concurrency limits (PutFunctionConcurrency). If another account or an AWS service invokes your function, use AddPermission to grant permission by creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an alias. To invoke your function directly, use Invoke. To invoke your function in response to events in other AWS services, create an event source mapping (CreateEventSourceMapping), or configure a function trigger in the other service. For more information, see Invoking Functions.
      */
    def createFunction(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Lambda function. To create a function, you need a deployment package and an execution role. The deployment package contains your function code. The execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs for log streaming and AWS X-Ray for request tracing. A function has an unpublished version, and can have published versions and aliases. The unpublished version changes when you update your function's code and configuration. A published version is a snapshot of your function code and configuration that can't be changed. An alias is a named resource that maps to a version, and can be changed to map to a different version. Use the Publish parameter to create version 1 of your function from its initial configuration. The other parameters let you configure version-specific and function-level settings. You can modify version-specific settings later with UpdateFunctionConfiguration. Function-level settings apply to both the unpublished and published versions of the function, and include tags (TagResource) and per-function concurrency limits (PutFunctionConcurrency). If another account or an AWS service invokes your function, use AddPermission to grant permission by creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an alias. To invoke your function directly, use Invoke. To invoke your function in response to events in other AWS services, create an event source mapping (CreateEventSourceMapping), or configure a function trigger in the other service. For more information, see Invoking Functions.
      */
    def createFunction(params: CreateFunctionRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFunction(
      params: CreateFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Lambda function alias.
      */
    def deleteAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAlias(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Lambda function alias.
      */
    def deleteAlias(params: DeleteAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAlias(
      params: DeleteAliasRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
      */
    def deleteEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEventSourceMapping(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
      */
    def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEventSourceMapping(
      params: DeleteEventSourceMappingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter. Otherwise, all versions and aliases are deleted. To delete Lambda event source mappings that invoke a function, use DeleteEventSourceMapping. For AWS services and resources that invoke your function directly, delete the trigger in the service where you originally configured it.
      */
    def deleteFunction(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFunction(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter. Otherwise, all versions and aliases are deleted. To delete Lambda event source mappings that invoke a function, use DeleteEventSourceMapping. For AWS services and resources that invoke your function directly, delete the trigger in the service where you originally configured it.
      */
    def deleteFunction(params: DeleteFunctionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFunction(
      params: DeleteFunctionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a concurrent execution limit from a function.
      */
    def deleteFunctionConcurrency(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFunctionConcurrency(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a concurrent execution limit from a function.
      */
    def deleteFunctionConcurrency(params: DeleteFunctionConcurrencyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFunctionConcurrency(
      params: DeleteFunctionConcurrencyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a version of an AWS Lambda layer. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a copy of the version remains in Lambda until no functions refer to it.
      */
    def deleteLayerVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLayerVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a version of an AWS Lambda layer. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a copy of the version remains in Lambda until no functions refer to it.
      */
    def deleteLayerVersion(params: DeleteLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLayerVersion(
      params: DeleteLayerVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details about your account's limits and usage in an AWS Region.
      */
    def getAccountSettings(): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details about your account's limits and usage in an AWS Region.
      */
    def getAccountSettings(params: GetAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountSettings(
      params: GetAccountSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns details about a Lambda function alias.
      */
    def getAlias(): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns details about a Lambda function alias.
      */
    def getAlias(params: GetAliasRequest): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAlias(
      params: GetAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns details about an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
      */
    def getEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEventSourceMapping(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns details about an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
      */
    def getEventSourceMapping(params: GetEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEventSourceMapping(
      params: GetEventSourceMappingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the function or function version, with a link to download the deployment package that's valid for 10 minutes. If you specify a function version, only details that are specific to that version are returned.
      */
    def getFunction(): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the function or function version, with a link to download the deployment package that's valid for 10 minutes. If you specify a function version, only details that are specific to that version are returned.
      */
    def getFunction(params: GetFunctionRequest): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFunction(
      params: GetFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the version-specific settings of a Lambda function or version. The output includes only options that can vary between versions of a function. To modify these settings, use UpdateFunctionConfiguration. To get all of a function's details, including function-level settings, use GetFunction.
      */
    def getFunctionConfiguration(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFunctionConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the version-specific settings of a Lambda function or version. The output includes only options that can vary between versions of a function. To modify these settings, use UpdateFunctionConfiguration. To get all of a function's details, including function-level settings, use GetFunction.
      */
    def getFunctionConfiguration(params: GetFunctionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFunctionConfiguration(
      params: GetFunctionConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
      */
    def getLayerVersion(): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLayerVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLayerVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
      */
    def getLayerVersion(params: GetLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLayerVersion(
      params: GetLayerVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLayerVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the permission policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
      */
    def getLayerVersionPolicy(): awsDashSdkLib.libRequestMod.Request[GetLayerVersionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLayerVersionPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLayerVersionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLayerVersionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the permission policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
      */
    def getLayerVersionPolicy(params: GetLayerVersionPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetLayerVersionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLayerVersionPolicy(
      params: GetLayerVersionPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLayerVersionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLayerVersionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the resource-based IAM policy for a function, version, or alias.
      */
    def getPolicy(): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the resource-based IAM policy for a function, version, or alias.
      */
    def getPolicy(params: GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicy(
      params: GetPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or asynchronously. To invoke a function asynchronously, set InvocationType to Event. For synchronous invocation, details about the function response, including errors, are included in the response body and headers. For either invocation type, you can find more information in the execution log and trace. To record function errors for asynchronous invocations, configure your function with a dead letter queue. The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that prevent your function from executing, such as permissions errors, limit errors, or issues with your function's code and configuration. For example, Lambda returns TooManyRequestsException if executing the function would cause you to exceed a concurrency limit at either the account level (ConcurrentInvocationLimitExceeded) or function level (ReservedFunctionConcurrentInvocationLimitExceeded). For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action.
      */
    def invoke(): awsDashSdkLib.libRequestMod.Request[InvocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def invoke(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvocationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or asynchronously. To invoke a function asynchronously, set InvocationType to Event. For synchronous invocation, details about the function response, including errors, are included in the response body and headers. For either invocation type, you can find more information in the execution log and trace. To record function errors for asynchronous invocations, configure your function with a dead letter queue. The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that prevent your function from executing, such as permissions errors, limit errors, or issues with your function's code and configuration. For example, Lambda returns TooManyRequestsException if executing the function would cause you to exceed a concurrency limit at either the account level (ConcurrentInvocationLimitExceeded) or function level (ReservedFunctionConcurrentInvocationLimitExceeded). For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action.
      */
    def invoke(params: InvocationRequest): awsDashSdkLib.libRequestMod.Request[InvocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def invoke(
      params: InvocationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvocationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  For asynchronous function invocation, use Invoke.  Invokes a function asynchronously.
      */
    def invokeAsync(): awsDashSdkLib.libRequestMod.Request[InvokeAsyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def invokeAsync(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvokeAsyncResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvokeAsyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  For asynchronous function invocation, use Invoke.  Invokes a function asynchronously.
      */
    def invokeAsync(params: InvokeAsyncRequest): awsDashSdkLib.libRequestMod.Request[InvokeAsyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def invokeAsync(
      params: InvokeAsyncRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvokeAsyncResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvokeAsyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of aliases for a Lambda function.
      */
    def listAliases(): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAliases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of aliases for a Lambda function.
      */
    def listAliases(params: ListAliasesRequest): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def listEventSourceMappings(
      params: ListEventSourceMappingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEventSourceMappingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEventSourceMappingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of Lambda functions, with the version-specific configuration of each. Set FunctionVersion to ALL to include all published versions of each function in addition to the unpublished version. To get more information about a function or version, use GetFunction.
      */
    def listFunctions(): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFunctions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFunctionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of Lambda functions, with the version-specific configuration of each. Set FunctionVersion to ALL to include all published versions of each function in addition to the unpublished version. To get more information about a function or version, use GetFunction.
      */
    def listFunctions(params: ListFunctionsRequest): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFunctions(
      params: ListFunctionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFunctionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the versions of an AWS Lambda layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
      */
    def listLayerVersions(): awsDashSdkLib.libRequestMod.Request[ListLayerVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listLayerVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLayerVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLayerVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the versions of an AWS Lambda layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
      */
    def listLayerVersions(params: ListLayerVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListLayerVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listLayerVersions(
      params: ListLayerVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLayerVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLayerVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists AWS Lambda layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
      */
    def listLayers(): awsDashSdkLib.libRequestMod.Request[ListLayersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listLayers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLayersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLayersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists AWS Lambda layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
      */
    def listLayers(params: ListLayersRequest): awsDashSdkLib.libRequestMod.Request[ListLayersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listLayers(
      params: ListLayersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLayersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLayersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a function's tags. You can also view tags with GetFunction.
      */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a function's tags. You can also view tags with GetFunction.
      */
    def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of versions, with the version-specific configuration of each. 
      */
    def listVersionsByFunction(): awsDashSdkLib.libRequestMod.Request[ListVersionsByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVersionsByFunction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVersionsByFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVersionsByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of versions, with the version-specific configuration of each. 
      */
    def listVersionsByFunction(params: ListVersionsByFunctionRequest): awsDashSdkLib.libRequestMod.Request[ListVersionsByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVersionsByFunction(
      params: ListVersionsByFunctionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVersionsByFunctionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVersionsByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Lambda layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
      */
    def publishLayerVersion(): awsDashSdkLib.libRequestMod.Request[PublishLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def publishLayerVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PublishLayerVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PublishLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Lambda layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
      */
    def publishLayerVersion(params: PublishLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[PublishLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def publishLayerVersion(
      params: PublishLayerVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PublishLayerVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PublishLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a version from the current code and configuration of a function. Use versions to create a snapshot of your function code and configuration that doesn't change. AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last version. Use UpdateFunctionCode or UpdateFunctionConfiguration to update the function before publishing a version. Clients can invoke versions directly or with an alias. To create an alias, use CreateAlias.
      */
    def publishVersion(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def publishVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a version from the current code and configuration of a function. Use versions to create a snapshot of your function code and configuration that doesn't change. AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last version. Use UpdateFunctionCode or UpdateFunctionConfiguration to update the function before publishing a version. Clients can invoke versions directly or with an alias. To create an alias, use CreateAlias.
      */
    def publishVersion(params: PublishVersionRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def publishVersion(
      params: PublishVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency level. Concurrency settings apply to the function as a whole, including all published versions and the unpublished version. Reserving concurrency both ensures that your function has capacity to process the specified number of events simultaneously, and prevents it from scaling beyond that level. Use GetFunction to see the current setting for a function. Use GetAccountSettings to see your regional concurrency limit. You can reserve concurrency for as many functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that aren't configured with a per-function limit. For more information, see Managing Concurrency.
      */
    def putFunctionConcurrency(): awsDashSdkLib.libRequestMod.Request[Concurrency, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putFunctionConcurrency(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Concurrency, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Concurrency, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency level. Concurrency settings apply to the function as a whole, including all published versions and the unpublished version. Reserving concurrency both ensures that your function has capacity to process the specified number of events simultaneously, and prevents it from scaling beyond that level. Use GetFunction to see the current setting for a function. Use GetAccountSettings to see your regional concurrency limit. You can reserve concurrency for as many functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that aren't configured with a per-function limit. For more information, see Managing Concurrency.
      */
    def putFunctionConcurrency(params: PutFunctionConcurrencyRequest): awsDashSdkLib.libRequestMod.Request[Concurrency, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putFunctionConcurrency(
      params: PutFunctionConcurrencyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Concurrency, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Concurrency, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a statement from the permissions policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
      */
    def removeLayerVersionPermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeLayerVersionPermission(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a statement from the permissions policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
      */
    def removeLayerVersionPermission(params: RemoveLayerVersionPermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeLayerVersionPermission(
      params: RemoveLayerVersionPermissionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from the output of GetPolicy.
      */
    def removePermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removePermission(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from the output of GetPolicy.
      */
    def removePermission(params: RemovePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removePermission(
      params: RemovePermissionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds tags to a function.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds tags to a function.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags from a function.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags from a function.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the configuration of a Lambda function alias.
      */
    def updateAlias(): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AliasConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the configuration of a Lambda function alias.
      */
    def updateAlias(params: UpdateAliasRequest): awsDashSdkLib.libRequestMod.Request[AliasConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def updateEventSourceMapping(
      params: UpdateEventSourceMappingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSourceMappingConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSourceMappingConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a Lambda function's code. The function's code is locked when you publish a version. You can't modify the code of a published version, only the unpublished version.
      */
    def updateFunctionCode(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFunctionCode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a Lambda function's code. The function's code is locked when you publish a version. You can't modify the code of a published version, only the unpublished version.
      */
    def updateFunctionCode(params: UpdateFunctionCodeRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFunctionCode(
      params: UpdateFunctionCodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modify the version-specifc settings of a Lambda function. These settings can vary between versions of a function and are locked when you publish a version. You can't modify the configuration of a published version, only the unpublished version. To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account or AWS service, use AddPermission.
      */
    def updateFunctionConfiguration(): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFunctionConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FunctionConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modify the version-specifc settings of a Lambda function. These settings can vary between versions of a function and are locked when you publish a version. You can't modify the configuration of a published version, only the unpublished version. To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account or AWS service, use AddPermission.
      */
    def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[FunctionConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
      * The function's Amazon Resource Name (ARN).
      */
    var Resource: FunctionArn
    /**
      * A list of tag keys to remove from the function.
      */
    var TagKeys: TagKeyList
  }
  
  trait UpdateAliasRequest extends js.Object {
    /**
      * A description of the alias.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * The function version that the alias invokes.
      */
    var FunctionVersion: js.UndefOr[Version] = js.undefined
    /**
      * The name of the alias.
      */
    var Name: Alias
    /**
      * Only update the alias if the revision ID matches the ID that's specified. Use this option to avoid modifying an alias that has changed since you last read it.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * The routing configuration of the alias.
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
    var UUID: String
  }
  
  trait UpdateFunctionCodeRequest extends js.Object {
    /**
      * Set to true to validate the request parameters and access permissions without modifying the function code.
      */
    var DryRun: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * Set to true to publish a new version of the function after updating the code. This has the same effect as calling PublishVersion separately.
      */
    var Publish: js.UndefOr[Boolean] = js.undefined
    /**
      * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid modifying a function that has changed since you last read it.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
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
      * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
      */
    var ZipFile: js.UndefOr[_Blob] = js.undefined
  }
  
  trait UpdateFunctionConfigurationRequest extends js.Object {
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
      * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
      */
    var FunctionName: awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionName
    /**
      * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see Programming Model.
      */
    var Handler: js.UndefOr[Handler] = js.undefined
    /**
      * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
      */
    var KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined
    /**
      * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
      */
    var Layers: js.UndefOr[LayerList] = js.undefined
    /**
      * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
      */
    var MemorySize: js.UndefOr[MemorySize] = js.undefined
    /**
      * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid modifying a function that has changed since you last read it.
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the function's execution role.
      */
    var Role: js.UndefOr[RoleArn] = js.undefined
    /**
      * The identifier of the function's runtime.
      */
    var Runtime: js.UndefOr[Runtime] = js.undefined
    /**
      * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
      */
    var Timeout: js.UndefOr[Timeout] = js.undefined
    /**
      * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
      */
    var TracingConfig: js.UndefOr[TracingConfig] = js.undefined
    /**
      * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC. When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more information, see VPC Settings.
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
  
  trait _EventSourcePosition extends js.Object
  
  trait _InvocationType extends js.Object
  
  trait _LogType extends js.Object
  
  trait _Runtime extends js.Object
  
  trait _TracingMode extends js.Object
  
  trait _apiVersion extends js.Object
  
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TRIM_HORIZON
    - awsDashSdkLib.awsDashSdkLibStrings.LATEST
    - awsDashSdkLib.awsDashSdkLibStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type EventSourcePosition = _EventSourcePosition | java.lang.String
  type EventSourceToken = java.lang.String
  type FunctionArn = java.lang.String
  type FunctionList = js.Array[FunctionConfiguration]
  type FunctionName = java.lang.String
  type FunctionVersion = awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
  type Handler = java.lang.String
  type HttpStatus = scala.Double
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Event
    - awsDashSdkLib.awsDashSdkLibStrings.RequestResponse
    - awsDashSdkLib.awsDashSdkLibStrings.DryRun
    - java.lang.String
  */
  type InvocationType = _InvocationType | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - awsDashSdkLib.awsDashSdkLibStrings.Tail
    - java.lang.String
  */
  type LogType = _LogType | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs4DOT3
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs6DOT10
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs8DOT10
    - awsDashSdkLib.awsDashSdkLibStrings.java8
    - awsDashSdkLib.awsDashSdkLibStrings.python2DOT7
    - awsDashSdkLib.awsDashSdkLibStrings.python3DOT6
    - awsDashSdkLib.awsDashSdkLibStrings.python3DOT7
    - awsDashSdkLib.awsDashSdkLibStrings.dotnetcore1DOT0
    - awsDashSdkLib.awsDashSdkLibStrings.dotnetcore2DOT0
    - awsDashSdkLib.awsDashSdkLibStrings.dotnetcore2DOT1
    - awsDashSdkLib.awsDashSdkLibStrings.`nodejs4DOT3-edge`
    - awsDashSdkLib.awsDashSdkLibStrings.go1DOTx
    - awsDashSdkLib.awsDashSdkLibStrings.ruby2DOT5
    - awsDashSdkLib.awsDashSdkLibStrings.provided
    - java.lang.String
  */
  type Runtime = _Runtime | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.PassThrough
    - java.lang.String
  */
  type TracingMode = _TracingMode | java.lang.String
  type UnreservedConcurrentExecutions = scala.Double
  type Version = java.lang.String
  type VpcId = java.lang.String
  type Weight = scala.Double
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsLambdaMod.Blob | java.lang.String
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-11-11`
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-03-31`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

