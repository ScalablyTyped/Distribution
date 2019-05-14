package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lambda
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Lambda: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
    */
  def getLayerVersionByArn(): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLayerVersionByArn(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLayerVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
    */
  def getLayerVersionByArn(params: GetLayerVersionByArnRequest): awsDashSdkLib.libRequestMod.Request[GetLayerVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLayerVersionByArn(
    params: GetLayerVersionByArnRequest,
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
    * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or asynchronously. To invoke a function asynchronously, set InvocationType to Event. For synchronous invocation, details about the function response, including errors, are included in the response body and headers. For either invocation type, you can find more information in the execution log and trace. To record function errors for asynchronous invocations, configure your function with a dead letter queue. When an error occurs, your function may be invoked multiple times. Retry behavior varies by error type, client, event source, and invocation type. For example, if you invoke a function asynchronously and it returns an error, Lambda executes the function up to two more times. For more information, see Retry Behavior. The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that prevent your function from executing, such as permissions errors, limit errors, or issues with your function's code and configuration. For example, Lambda returns TooManyRequestsException if executing the function would cause you to exceed a concurrency limit at either the account level (ConcurrentInvocationLimitExceeded) or function level (ReservedFunctionConcurrentInvocationLimitExceeded). For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action.
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
    * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or asynchronously. To invoke a function asynchronously, set InvocationType to Event. For synchronous invocation, details about the function response, including errors, are included in the response body and headers. For either invocation type, you can find more information in the execution log and trace. To record function errors for asynchronous invocations, configure your function with a dead letter queue. When an error occurs, your function may be invoked multiple times. Retry behavior varies by error type, client, event source, and invocation type. For example, if you invoke a function asynchronously and it returns an error, Lambda executes the function up to two more times. For more information, see Retry Behavior. The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that prevent your function from executing, such as permissions errors, limit errors, or issues with your function's code and configuration. For example, Lambda returns TooManyRequestsException if executing the function would cause you to exceed a concurrency limit at either the account level (ConcurrentInvocationLimitExceeded) or function level (ReservedFunctionConcurrentInvocationLimitExceeded). For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action.
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
    * Modify the version-specific settings of a Lambda function. These settings can vary between versions of a function and are locked when you publish a version. You can't modify the configuration of a published version, only the unpublished version. To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account or AWS service, use AddPermission.
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
    * Modify the version-specific settings of a Lambda function. These settings can vary between versions of a function and are locked when you publish a version. You can't modify the configuration of a published version, only the unpublished version. To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account or AWS service, use AddPermission.
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
  /**
    * Waits for the functionExists state by periodically calling the underlying Lambda.getFunctionoperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_functionExists(state: awsDashSdkLib.awsDashSdkLibStrings.functionExists): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_functionExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.functionExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the functionExists state by periodically calling the underlying Lambda.getFunctionoperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_functionExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.functionExists,
    params: GetFunctionRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_functionExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.functionExists,
    params: GetFunctionRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

