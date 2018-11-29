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
     * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
     */
  def addLayerVersionPermission(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
     */
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
     * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
     */
  def addLayerVersionPermission(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddLayerVersionPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds permissions to the resource-based policy of a version of a function layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
     */
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
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource policies to grant permissions to event sources that use the push model. In a push model, event sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource policy allows an event source permission to invoke the Lambda function.  Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:AddPermission action.
     */
  def addPermission(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource policies to grant permissions to event sources that use the push model. In a push model, event sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource policy allows an event source permission to invoke the Lambda function.  Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:AddPermission action.
     */
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
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource policies to grant permissions to event sources that use the push model. In a push model, event sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource policy allows an event source permission to invoke the Lambda function.  Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:AddPermission action.
     */
  def addPermission(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AddPermissionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource policies to grant permissions to event sources that use the push model. In a push model, event sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource policy allows an event source permission to invoke the Lambda function.  Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:AddPermission action.
     */
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
     * Creates an alias that points to the specified Lambda function version. For more information, see Introduction to AWS Lambda Aliases. Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
     */
  def createAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an alias that points to the specified Lambda function version. For more information, see Introduction to AWS Lambda Aliases. Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
     */
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
     * Creates an alias that points to the specified Lambda function version. For more information, see Introduction to AWS Lambda Aliases. Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
     */
  def createAlias(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an alias that points to the specified Lambda function version. For more information, see Introduction to AWS Lambda Aliases. Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
     */
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
  /**
     * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS     Using AWS Lambda with Amazon DynamoDB   
     */
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
  /**
     * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS     Using AWS Lambda with Amazon DynamoDB   
     */
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
     * Creates a new Lambda function. The function configuration is created from the request parameters, and the code for the function is provided by a .zip file. The function name is case-sensitive. This operation requires permission for the lambda:CreateFunction action.
     */
  def createFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Lambda function. The function configuration is created from the request parameters, and the code for the function is provided by a .zip file. The function name is case-sensitive. This operation requires permission for the lambda:CreateFunction action.
     */
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
     * Creates a new Lambda function. The function configuration is created from the request parameters, and the code for the function is provided by a .zip file. The function name is case-sensitive. This operation requires permission for the lambda:CreateFunction action.
     */
  def createFunction(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.CreateFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Lambda function. The function configuration is created from the request parameters, and the code for the function is provided by a .zip file. The function name is case-sensitive. This operation requires permission for the lambda:CreateFunction action.
     */
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
  def deleteAlias(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Lambda function alias. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:DeleteAlias action.
     */
  def deleteAlias(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteAliasRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an event source mapping.
     */
  def deleteEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an event source mapping.
     */
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
     * Deletes an event source mapping.
     */
  def deleteEventSourceMapping(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an event source mapping.
     */
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
  def deleteFunction(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteFunctionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter. Otherwise, all versions and aliases are deleted. Event source mappings are not deleted. This operation requires permission for the lambda:DeleteFunction action.
     */
  def deleteFunction(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteFunctionRequest,
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
  def deleteFunctionConcurrency(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteFunctionConcurrencyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes concurrent execution limits from this function. For more information, see Managing Concurrency.
     */
  def deleteFunctionConcurrency(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteFunctionConcurrencyRequest,
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
  def deleteLayerVersion(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a version of a function layer. Deleted versions can no longer be viewed or added to functions. However, a copy of the version remains in Lambda until no functions refer to it.
     */
  def deleteLayerVersion(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.DeleteLayerVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Retrieves details about your account's limits and usage in a region.
     */
  def getAccountSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details about your account's limits and usage in a region.
     */
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
     * Retrieves details about your account's limits and usage in a region.
     */
  def getAccountSettings(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details about your account's limits and usage in a region.
     */
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
     * Returns the specified alias information such as the alias ARN, description, and function version it is pointing to. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:GetAlias action.
     */
  def getAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the specified alias information such as the alias ARN, description, and function version it is pointing to. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:GetAlias action.
     */
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
     * Returns the specified alias information such as the alias ARN, description, and function version it is pointing to. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:GetAlias action.
     */
  def getAlias(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the specified alias information such as the alias ARN, description, and function version it is pointing to. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:GetAlias action.
     */
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
     * Returns details about an event source mapping.
     */
  def getEventSourceMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns details about an event source mapping.
     */
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
     * Returns details about an event source mapping.
     */
  def getEventSourceMapping(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetEventSourceMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.EventSourceMappingConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns details about an event source mapping.
     */
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
     * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you uploaded with CreateFunction so you can download the .zip file. Note that the URL is valid for up to 10 minutes. The configuration information is the same information you provided as parameters when uploading the function. Use the Qualifier parameter to retrieve a published version of the function. Otherwise, returns the unpublished version ($LATEST). For more information, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunction action.
     */
  def getFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you uploaded with CreateFunction so you can download the .zip file. Note that the URL is valid for up to 10 minutes. The configuration information is the same information you provided as parameters when uploading the function. Use the Qualifier parameter to retrieve a published version of the function. Otherwise, returns the unpublished version ($LATEST). For more information, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunction action.
     */
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
     * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you uploaded with CreateFunction so you can download the .zip file. Note that the URL is valid for up to 10 minutes. The configuration information is the same information you provided as parameters when uploading the function. Use the Qualifier parameter to retrieve a published version of the function. Otherwise, returns the unpublished version ($LATEST). For more information, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunction action.
     */
  def getFunction(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you uploaded with CreateFunction so you can download the .zip file. Note that the URL is valid for up to 10 minutes. The configuration information is the same information you provided as parameters when uploading the function. Use the Qualifier parameter to retrieve a published version of the function. Otherwise, returns the unpublished version ($LATEST). For more information, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunction action.
     */
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
     * Returns the configuration information of the Lambda function. This the same information you provided as parameters when uploading the function by using CreateFunction. If you are using the versioning feature, you can retrieve this information for a specific function version by using the optional Qualifier parameter and specifying the function version or alias that points to it. If you don't provide it, the API returns information about the $LATEST version of the function. For more information about versioning, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunctionConfiguration operation.
     */
  def getFunctionConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the configuration information of the Lambda function. This the same information you provided as parameters when uploading the function by using CreateFunction. If you are using the versioning feature, you can retrieve this information for a specific function version by using the optional Qualifier parameter and specifying the function version or alias that points to it. If you don't provide it, the API returns information about the $LATEST version of the function. For more information about versioning, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunctionConfiguration operation.
     */
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
     * Returns the configuration information of the Lambda function. This the same information you provided as parameters when uploading the function by using CreateFunction. If you are using the versioning feature, you can retrieve this information for a specific function version by using the optional Qualifier parameter and specifying the function version or alias that points to it. If you don't provide it, the API returns information about the $LATEST version of the function. For more information about versioning, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunctionConfiguration operation.
     */
  def getFunctionConfiguration(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetFunctionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the configuration information of the Lambda function. This the same information you provided as parameters when uploading the function by using CreateFunction. If you are using the versioning feature, you can retrieve this information for a specific function version by using the optional Qualifier parameter and specifying the function version or alias that points to it. If you don't provide it, the API returns information about the $LATEST version of the function. For more information about versioning, see AWS Lambda Function Versioning and Aliases. This operation requires permission for the lambda:GetFunctionConfiguration operation.
     */
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
     * Returns information about a version of a function layer, with a link to download the layer archive that's valid for 10 minutes.
     */
  def getLayerVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a version of a function layer, with a link to download the layer archive that's valid for 10 minutes.
     */
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
     * Returns information about a version of a function layer, with a link to download the layer archive that's valid for 10 minutes.
     */
  def getLayerVersion(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a version of a function layer, with a link to download the layer archive that's valid for 10 minutes.
     */
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
     * Returns the permission policy for a layer version. For more information, see AddLayerVersionPermission.
     */
  def getLayerVersionPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the permission policy for a layer version. For more information, see AddLayerVersionPermission.
     */
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
     * Returns the permission policy for a layer version. For more information, see AddLayerVersionPermission.
     */
  def getLayerVersionPolicy(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetLayerVersionPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the permission policy for a layer version. For more information, see AddLayerVersionPermission.
     */
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
     * Returns the resource policy associated with the specified Lambda function. This action requires permission for the lambda:GetPolicy action. 
     */
  def getPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the resource policy associated with the specified Lambda function. This action requires permission for the lambda:GetPolicy action. 
     */
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
     * Returns the resource policy associated with the specified Lambda function. This action requires permission for the lambda:GetPolicy action. 
     */
  def getPolicy(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the resource policy associated with the specified Lambda function. This action requires permission for the lambda:GetPolicy action. 
     */
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
     * Invokes a Lambda function. For an example, see Create the Lambda Function and Test It Manually.  Specify just a function name to invoke the latest version of the function. To invoke a published version, use the Qualifier parameter to specify a version or alias. If you use the RequestResponse (synchronous) invocation option, the function will be invoked only once. If you use the Event (asynchronous) invocation option, the function will be invoked at least once in response to an event and the function must be idempotent to handle this. For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action. The TooManyRequestsException noted below will return the following: ConcurrentInvocationLimitExceeded will be returned if you have no functions with reserved concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds the account's unreserved concurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be returned when a function with reserved concurrency exceeds its configured concurrency limit. 
     */
  def invoke(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Invokes a Lambda function. For an example, see Create the Lambda Function and Test It Manually.  Specify just a function name to invoke the latest version of the function. To invoke a published version, use the Qualifier parameter to specify a version or alias. If you use the RequestResponse (synchronous) invocation option, the function will be invoked only once. If you use the Event (asynchronous) invocation option, the function will be invoked at least once in response to an event and the function must be idempotent to handle this. For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action. The TooManyRequestsException noted below will return the following: ConcurrentInvocationLimitExceeded will be returned if you have no functions with reserved concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds the account's unreserved concurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be returned when a function with reserved concurrency exceeds its configured concurrency limit. 
     */
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
     * Invokes a Lambda function. For an example, see Create the Lambda Function and Test It Manually.  Specify just a function name to invoke the latest version of the function. To invoke a published version, use the Qualifier parameter to specify a version or alias. If you use the RequestResponse (synchronous) invocation option, the function will be invoked only once. If you use the Event (asynchronous) invocation option, the function will be invoked at least once in response to an event and the function must be idempotent to handle this. For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action. The TooManyRequestsException noted below will return the following: ConcurrentInvocationLimitExceeded will be returned if you have no functions with reserved concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds the account's unreserved concurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be returned when a function with reserved concurrency exceeds its configured concurrency limit. 
     */
  def invoke(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvocationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Invokes a Lambda function. For an example, see Create the Lambda Function and Test It Manually.  Specify just a function name to invoke the latest version of the function. To invoke a published version, use the Qualifier parameter to specify a version or alias. If you use the RequestResponse (synchronous) invocation option, the function will be invoked only once. If you use the Event (asynchronous) invocation option, the function will be invoked at least once in response to an event and the function must be idempotent to handle this. For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action. The TooManyRequestsException noted below will return the following: ConcurrentInvocationLimitExceeded will be returned if you have no functions with reserved concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds the account's unreserved concurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be returned when a function with reserved concurrency exceeds its configured concurrency limit. 
     */
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
     *  For asynchronous function invocation, use Invoke.  Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console. This operation requires permission for the lambda:InvokeFunction action.
     */
  def invokeAsync(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  For asynchronous function invocation, use Invoke.  Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console. This operation requires permission for the lambda:InvokeFunction action.
     */
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
     *  For asynchronous function invocation, use Invoke.  Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console. This operation requires permission for the lambda:InvokeFunction action.
     */
  def invokeAsync(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.InvokeAsyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  For asynchronous function invocation, use Invoke.  Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console. This operation requires permission for the lambda:InvokeFunction action.
     */
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
     * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as the alias ARN, description, alias name, and the function version to which it points. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:ListAliases action.
     */
  def listAliases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as the alias ARN, description, alias name, and the function version to which it points. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:ListAliases action.
     */
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
     * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as the alias ARN, description, alias name, and the function version to which it points. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:ListAliases action.
     */
  def listAliases(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as the alias ARN, description, alias name, and the function version to which it points. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:ListAliases action.
     */
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
  /**
     * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
     */
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
  /**
     * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
     */
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
     * Returns a list of your Lambda functions. For each function, the response includes the function configuration information. You must use GetFunction to retrieve the code for your function. This operation requires permission for the lambda:ListFunctions action. If you are using the versioning feature, you can list all of your functions or only $LATEST versions. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
     */
  def listFunctions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of your Lambda functions. For each function, the response includes the function configuration information. You must use GetFunction to retrieve the code for your function. This operation requires permission for the lambda:ListFunctions action. If you are using the versioning feature, you can list all of your functions or only $LATEST versions. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
     */
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
     * Returns a list of your Lambda functions. For each function, the response includes the function configuration information. You must use GetFunction to retrieve the code for your function. This operation requires permission for the lambda:ListFunctions action. If you are using the versioning feature, you can list all of your functions or only $LATEST versions. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
     */
  def listFunctions(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of your Lambda functions. For each function, the response includes the function configuration information. You must use GetFunction to retrieve the code for your function. This operation requires permission for the lambda:ListFunctions action. If you are using the versioning feature, you can list all of your functions or only $LATEST versions. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
     */
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
     * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
     */
  def listLayerVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
     */
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
     * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
     */
  def listLayerVersions(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayerVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a function layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
     */
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
     * Lists function layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
     */
  def listLayers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists function layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
     */
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
     * Lists function layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
     */
  def listLayers(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListLayersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists function layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
     */
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
     * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more information on Tagging, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
     */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more information on Tagging, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
     */
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
     * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more information on Tagging, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
     */
  def listTags(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more information on Tagging, see Tagging Lambda Functions in the AWS Lambda Developer Guide.
     */
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
     * Lists all versions of a function. For information about versioning, see AWS Lambda Function Versioning and Aliases. 
     */
  def listVersionsByFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all versions of a function. For information about versioning, see AWS Lambda Function Versioning and Aliases. 
     */
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
     * Lists all versions of a function. For information about versioning, see AWS Lambda Function Versioning and Aliases. 
     */
  def listVersionsByFunction(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.ListVersionsByFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all versions of a function. For information about versioning, see AWS Lambda Function Versioning and Aliases. 
     */
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
     * Creates a function layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
     */
  def publishLayerVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a function layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
     */
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
     * Creates a function layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
     */
  def publishLayerVersion(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishLayerVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a function layer from a ZIP archive. Each time you call PublishLayerVersion with the same version name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
     */
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
     * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot of the function code and configuration information from $LATEST and publishes a new version. The code and configuration cannot be modified after publication. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
     */
  def publishVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot of the function code and configuration information from $LATEST and publishes a new version. The code and configuration cannot be modified after publication. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
     */
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
     * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot of the function code and configuration information from $LATEST and publishes a new version. The code and configuration cannot be modified after publication. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
     */
  def publishVersion(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.PublishVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot of the function code and configuration information from $LATEST and publishes a new version. The code and configuration cannot be modified after publication. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases. 
     */
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
     * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you have a total of 900 available to allocate to individual functions. For more information, see Managing Concurrency.
     */
  def putFunctionConcurrency(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.Concurrency, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you have a total of 900 available to allocate to individual functions. For more information, see Managing Concurrency.
     */
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
     * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you have a total of 900 available to allocate to individual functions. For more information, see Managing Concurrency.
     */
  def putFunctionConcurrency(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.PutFunctionConcurrencyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.Concurrency, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you have a total of 900 available to allocate to individual functions. For more information, see Managing Concurrency.
     */
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
  def removeLayerVersionPermission(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.RemoveLayerVersionPermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes a statement from the permissions policy for a layer version. For more information, see AddLayerVersionPermission.
     */
  def removeLayerVersionPermission(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.RemoveLayerVersionPermissionRequest,
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
  def removePermission(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.RemovePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes permissions from a function. You can remove individual permissions from an resource policy associated with a Lambda function by providing a statement ID that you provided when you added the permission. When you remove permissions, disable the event source mapping or trigger configuration first to avoid errors. Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the unpublished version of the function), or include a version or alias. If a client uses a version or alias to invoke a function, use the Qualifier parameter to apply permissions to that ARN. For more information about versioning, see AWS Lambda Function Versioning and Aliases.  You need permission for the lambda:RemovePermission action.
     */
  def removePermission(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.RemovePermissionRequest,
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
  def tagResource(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a list of tags (key-value pairs) on the Lambda function. Requires the Lambda function ARN (Amazon Resource Name). If a key is specified without a value, Lambda creates a tag with the specified key and a value of null. For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
     */
  def tagResource(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.TagResourceRequest,
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
  def untagResource(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes tags from a Lambda function. Requires the function ARN (Amazon Resource Name). For more information, see Tagging Lambda Functions in the AWS Lambda Developer Guide. 
     */
  def untagResource(
    params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Using this API you can update the function version to which the alias points and the alias description. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:UpdateAlias action.
     */
  def updateAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Using this API you can update the function version to which the alias points and the alias description. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:UpdateAlias action.
     */
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
     * Using this API you can update the function version to which the alias points and the alias description. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:UpdateAlias action.
     */
  def updateAlias(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.AliasConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Using this API you can update the function version to which the alias points and the alias description. For more information, see Introduction to AWS Lambda Aliases. This requires permission for the lambda:UpdateAlias action.
     */
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
  /**
     * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location.
     */
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
  /**
     * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location.
     */
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
     * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda function and cannot be used to update the function configuration. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionCode action.
     */
  def updateFunctionCode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda function and cannot be used to update the function configuration. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionCode action.
     */
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
     * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda function and cannot be used to update the function configuration. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionCode action.
     */
  def updateFunctionCode(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateFunctionCodeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda function and cannot be used to update the function configuration. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionCode action.
     */
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
     * Updates the configuration parameters for the specified Lambda function by using the values provided in the request. You provide only the parameters you want to change. This operation must only be used on an existing Lambda function and cannot be used to update the function's code. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionConfiguration action.
     */
  def updateFunctionConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration parameters for the specified Lambda function by using the values provided in the request. You provide only the parameters you want to change. This operation must only be used on an existing Lambda function and cannot be used to update the function's code. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionConfiguration action.
     */
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
     * Updates the configuration parameters for the specified Lambda function by using the values provided in the request. You provide only the parameters you want to change. This operation must only be used on an existing Lambda function and cannot be used to update the function's code. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionConfiguration action.
     */
  def updateFunctionConfiguration(params: awsDashSdkLib.clientsLambdaMod.LambdaNs.UpdateFunctionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLambdaMod.LambdaNs.FunctionConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration parameters for the specified Lambda function by using the values provided in the request. You provide only the parameters you want to change. This operation must only be used on an existing Lambda function and cannot be used to update the function's code. If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda function. For information about the versioning feature, see AWS Lambda Function Versioning and Aliases.  This operation requires permission for the lambda:UpdateFunctionConfiguration action.
     */
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

