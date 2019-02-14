package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lambda
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Lambda: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsLambdaMod.LambdaNs.ClientConfiguration = js.native
  /**
    * Adds permissions to the resource-based policy of a version of an AWS Lambda layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
    */
  def addLayerVersionPermission(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addLayerVersionPermission(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds permissions to the resource-based policy of a version of an AWS Lambda layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
    */
  def addLayerVersionPermission(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addLayerVersionPermission(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Grants an AWS service or another account permission to use a function. You can apply the policy at the function level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function. To grant permission to another account, specify the account ID as the Principal. For AWS services, the principal is a domain-style identifier defined by the service, like s3.amazonaws.com or sns.amazonaws.com. For AWS services, you can also specify the ARN or owning account of the associated resource as the SourceArn or SourceAccount. If you grant permission to a service principal without specifying the source, other accounts could potentially configure resources in their account to invoke your Lambda function. This action adds a statement to a resource-based permission policy for the function. For more information about function policies, see Lambda Function Policies. 
    */
  def addPermission(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addPermission(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Grants an AWS service or another account permission to use a function. You can apply the policy at the function level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function. To grant permission to another account, specify the account ID as the Principal. For AWS services, the principal is a domain-style identifier defined by the service, like s3.amazonaws.com or sns.amazonaws.com. For AWS services, you can also specify the ARN or owning account of the associated resource as the SourceArn or SourceAccount. If you grant permission to a service principal without specifying the source, other accounts could potentially configure resources in their account to invoke your Lambda function. This action adds a statement to a resource-based permission policy for the function. For more information about function policies, see Lambda Function Policies. 
    */
  def addPermission(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addPermission(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an alias for a Lambda function version. Use aliases to provide clients with a function identifier that you can update to invoke a different version. You can also map an alias to split invocation requests between two versions. Use the RoutingConfig parameter to specify a second version and the percentage of invocation requests that it receives.
    */
  def createAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an alias for a Lambda function version. Use aliases to provide clients with a function identifier that you can update to invoke a different version. You can also map an alias to split invocation requests between two versions. Use the RoutingConfig parameter to specify a second version and the percentage of invocation requests that it receives.
    */
  def createAlias(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAlias(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.CreateAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS     Using AWS Lambda with Amazon DynamoDB   
    */
  def createEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEventSourceMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS     Using AWS Lambda with Amazon DynamoDB   
    */
  def createEventSourceMapping(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.CreateEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEventSourceMapping(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.CreateEventSourceMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Lambda function. To create a function, you need a deployment package and an execution role. The deployment package contains your function code. The execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs for log streaming and AWS X-Ray for request tracing. A function has an unpublished version, and can have published versions and aliases. The unpublished version changes when you update your function's code and configuration. A published version is a snapshot of your function code and configuration that can't be changed. An alias is a named resource that maps to a version, and can be changed to map to a different version. Use the Publish parameter to create version 1 of your function from its initial configuration. The other parameters let you configure version-specific and function-level settings. You can modify version-specific settings later with UpdateFunctionConfiguration. Function-level settings apply to both the unpublished and published versions of the function, and include tags (TagResource) and per-function concurrency limits (PutFunctionConcurrency). If another account or an AWS service invokes your function, use AddPermission to grant permission by creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an alias. To invoke your function directly, use Invoke. To invoke your function in response to events in other AWS services, create an event source mapping (CreateEventSourceMapping), or configure a function trigger in the other service. For more information, see Invoking Functions.
    */
  def createFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Lambda function. To create a function, you need a deployment package and an execution role. The deployment package contains your function code. The execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs for log streaming and AWS X-Ray for request tracing. A function has an unpublished version, and can have published versions and aliases. The unpublished version changes when you update your function's code and configuration. A published version is a snapshot of your function code and configuration that can't be changed. An alias is a named resource that maps to a version, and can be changed to map to a different version. Use the Publish parameter to create version 1 of your function from its initial configuration. The other parameters let you configure version-specific and function-level settings. You can modify version-specific settings later with UpdateFunctionConfiguration. Function-level settings apply to both the unpublished and published versions of the function, and include tags (TagResource) and per-function concurrency limits (PutFunctionConcurrency). If another account or an AWS service invokes your function, use AddPermission to grant permission by creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an alias. To invoke your function directly, use Invoke. To invoke your function in response to events in other AWS services, create an event source mapping (CreateEventSourceMapping), or configure a function trigger in the other service. For more information, see Invoking Functions.
    */
  def createFunction(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.CreateFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFunction(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.CreateFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteAlias(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAlias(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteAliasRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
    */
  def deleteEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEventSourceMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
    */
  def deleteEventSourceMapping(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEventSourceMapping(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteEventSourceMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteFunction(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteFunctionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFunction(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteFunctionRequest,
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
  def deleteFunctionConcurrency(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteFunctionConcurrencyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFunctionConcurrency(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteFunctionConcurrencyRequest,
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
  def deleteLayerVersion(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLayerVersion(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteLayerVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details about your account's limits and usage in an AWS Region.
    */
  def getAccountSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccountSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details about your account's limits and usage in an AWS Region.
    */
  def getAccountSettings(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccountSettings(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns details about a Lambda function alias.
    */
  def getAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns details about a Lambda function alias.
    */
  def getAlias(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAlias(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns details about an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
    */
  def getEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getEventSourceMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns details about an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
    */
  def getEventSourceMapping(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getEventSourceMapping(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetEventSourceMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the function or function version, with a link to download the deployment package that's valid for 10 minutes. If you specify a function version, only details that are specific to that version are returned.
    */
  def getFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the function or function version, with a link to download the deployment package that's valid for 10 minutes. If you specify a function version, only details that are specific to that version are returned.
    */
  def getFunction(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFunction(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the version-specific settings of a Lambda function or version. The output includes only options that can vary between versions of a function. To modify these settings, use UpdateFunctionConfiguration. To get all of a function's details, including function-level settings, use GetFunction.
    */
  def getFunctionConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFunctionConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the version-specific settings of a Lambda function or version. The output includes only options that can vary between versions of a function. To modify these settings, use UpdateFunctionConfiguration. To get all of a function's details, including function-level settings, use GetFunction.
    */
  def getFunctionConfiguration(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFunctionConfiguration(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
    */
  def getLayerVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLayerVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
    */
  def getLayerVersion(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLayerVersion(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the permission policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
    */
  def getLayerVersionPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLayerVersionPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the permission policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
    */
  def getLayerVersionPolicy(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLayerVersionPolicy(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the resource-based IAM policy for a function, version, or alias.
    */
  def getPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the resource-based IAM policy for a function, version, or alias.
    */
  def getPolicy(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPolicy(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or asynchronously. To invoke a function asynchronously, set InvocationType to Event. For synchronous invocation, details about the function response, including errors, are included in the response body and headers. For either invocation type, you can find more information in the execution log and trace. To record function errors for asynchronous invocations, configure your function with a dead letter queue. The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that prevent your function from executing, such as permissions errors, limit errors, or issues with your function's code and configuration. For example, Lambda returns TooManyRequestsException if executing the function would cause you to exceed a concurrency limit at either the account level (ConcurrentInvocationLimitExceeded) or function level (ReservedFunctionConcurrentInvocationLimitExceeded). For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action.
    */
  def invoke(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invoke(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or asynchronously. To invoke a function asynchronously, set InvocationType to Event. For synchronous invocation, details about the function response, including errors, are included in the response body and headers. For either invocation type, you can find more information in the execution log and trace. To record function errors for asynchronous invocations, configure your function with a dead letter queue. The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that prevent your function from executing, such as permissions errors, limit errors, or issues with your function's code and configuration. For example, Lambda returns TooManyRequestsException if executing the function would cause you to exceed a concurrency limit at either the account level (ConcurrentInvocationLimitExceeded) or function level (ReservedFunctionConcurrentInvocationLimitExceeded). For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action.
    */
  def invoke(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invoke(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  For asynchronous function invocation, use Invoke.  Invokes a function asynchronously.
    */
  def invokeAsync(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invokeAsync(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  For asynchronous function invocation, use Invoke.  Invokes a function asynchronously.
    */
  def invokeAsync(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invokeAsync(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of aliases for a Lambda function.
    */
  def listAliases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAliases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of aliases for a Lambda function.
    */
  def listAliases(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAliases(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
    */
  def listEventSourceMappings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListEventSourceMappingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEventSourceMappings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListEventSourceMappingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListEventSourceMappingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
    */
  def listEventSourceMappings(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListEventSourceMappingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListEventSourceMappingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEventSourceMappings(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListEventSourceMappingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListEventSourceMappingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListEventSourceMappingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of Lambda functions, with the version-specific configuration of each. Set FunctionVersion to ALL to include all published versions of each function in addition to the unpublished version. To get more information about a function or version, use GetFunction.
    */
  def listFunctions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFunctions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of Lambda functions, with the version-specific configuration of each. Set FunctionVersion to ALL to include all published versions of each function in addition to the unpublished version. To get more information about a function or version, use GetFunction.
    */
  def listFunctions(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFunctions(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the versions of an AWS Lambda layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
    */
  def listLayerVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLayerVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the versions of an AWS Lambda layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
    */
  def listLayerVersions(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLayerVersions(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists AWS Lambda layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
    */
  def listLayers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLayers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists AWS Lambda layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
    */
  def listLayers(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLayers(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a function's tags. You can also view tags with GetFunction.
    */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a function's tags. You can also view tags with GetFunction.
    */
  def listTags(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTags(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of versions, with the version-specific configuration of each. 
    */
  def listVersionsByFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVersionsByFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of versions, with the version-specific configuration of each. 
    */
  def listVersionsByFunction(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVersionsByFunction(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Lambda layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
    */
  def publishLayerVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def publishLayerVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Lambda layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
    */
  def publishLayerVersion(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def publishLayerVersion(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a version from the current code and configuration of a function. Use versions to create a snapshot of your function code and configuration that doesn't change. AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last version. Use UpdateFunctionCode or UpdateFunctionConfiguration to update the function before publishing a version. Clients can invoke versions directly or with an alias. To create an alias, use CreateAlias.
    */
  def publishVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def publishVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a version from the current code and configuration of a function. Use versions to create a snapshot of your function code and configuration that doesn't change. AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last version. Use UpdateFunctionCode or UpdateFunctionConfiguration to update the function before publishing a version. Clients can invoke versions directly or with an alias. To create an alias, use CreateAlias.
    */
  def publishVersion(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def publishVersion(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency level. Concurrency settings apply to the function as a whole, including all published versions and the unpublished version. Reserving concurrency both ensures that your function has capacity to process the specified number of events simultaneously, and prevents it from scaling beyond that level. Use GetFunction to see the current setting for a function. Use GetAccountSettings to see your regional concurrency limit. You can reserve concurrency for as many functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that aren't configured with a per-function limit. For more information, see Managing Concurrency.
    */
  def putFunctionConcurrency(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.Concurrency, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putFunctionConcurrency(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.Concurrency, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.Concurrency, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency level. Concurrency settings apply to the function as a whole, including all published versions and the unpublished version. Reserving concurrency both ensures that your function has capacity to process the specified number of events simultaneously, and prevents it from scaling beyond that level. Use GetFunction to see the current setting for a function. Use GetAccountSettings to see your regional concurrency limit. You can reserve concurrency for as many functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that aren't configured with a per-function limit. For more information, see Managing Concurrency.
    */
  def putFunctionConcurrency(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.PutFunctionConcurrencyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.Concurrency, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putFunctionConcurrency(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.PutFunctionConcurrencyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.Concurrency, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.Concurrency, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def removeLayerVersionPermission(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.RemoveLayerVersionPermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeLayerVersionPermission(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.RemoveLayerVersionPermissionRequest,
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
  def removePermission(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.RemovePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removePermission(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.RemovePermissionRequest,
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
  def tagResource(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.TagResourceRequest,
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
  def untagResource(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the configuration of a Lambda function alias.
    */
  def updateAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the configuration of a Lambda function alias.
    */
  def updateAlias(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAlias(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location.
    */
  def updateEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEventSourceMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location.
    */
  def updateEventSourceMapping(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEventSourceMapping(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateEventSourceMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a Lambda function's code. The function's code is locked when you publish a version. You can't modify the code of a published version, only the unpublished version.
    */
  def updateFunctionCode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFunctionCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a Lambda function's code. The function's code is locked when you publish a version. You can't modify the code of a published version, only the unpublished version.
    */
  def updateFunctionCode(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateFunctionCodeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFunctionCode(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateFunctionCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify the version-specifc settings of a Lambda function. These settings can vary between versions of a function and are locked when you publish a version. You can't modify the configuration of a published version, only the unpublished version. To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account or AWS service, use AddPermission.
    */
  def updateFunctionConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFunctionConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify the version-specifc settings of a Lambda function. These settings can vary between versions of a function and are locked when you publish a version. You can't modify the configuration of a published version, only the unpublished version. To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account or AWS service, use AddPermission.
    */
  def updateFunctionConfiguration(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateFunctionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFunctionConfiguration(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateFunctionConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

