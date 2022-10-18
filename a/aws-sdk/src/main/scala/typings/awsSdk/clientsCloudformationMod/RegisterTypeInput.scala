package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTypeInput extends StObject {
  
  /**
    * A unique identifier that acts as an idempotency key for this registration request. Specifying a client request token prevents CloudFormation from generating more than one version of an extension from the same registration request, even if the request is submitted multiple times.
    */
  var ClientRequestToken: js.UndefOr[RequestToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the extension. For CloudFormation to assume the specified execution role, the role must contain a trust relationship with the CloudFormation service principle (resources.cloudformation.amazonaws.com). For more information about adding trust relationships, see Modifying a role trust policy in the Identity and Access Management User Guide. If your extension calls Amazon Web Services APIs in any of its handlers, you must create an  IAM execution role  that includes the necessary permissions to call those Amazon Web Services APIs, and provision that execution role in your account. When CloudFormation needs to invoke the resource type handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the resource type handler, thereby supplying your resource type with the appropriate credentials.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Specifies logging configuration information for an extension.
    */
  var LoggingConfig: js.UndefOr[typings.awsSdk.clientsCloudformationMod.LoggingConfig] = js.undefined
  
  /**
    * A URL to the S3 bucket containing the extension project package that contains the necessary files for the extension you want to register. For information about generating a schema handler package for the extension you want to register, see submit in the CloudFormation CLI User Guide.  The user registering the extension must be able to access the package in the S3 bucket. That's, the user needs to have GetObject permissions for the schema handler package. For more information, see Actions, Resources, and Condition Keys for Amazon S3 in the Identity and Access Management User Guide. 
    */
  var SchemaHandlerPackage: S3Url
  
  /**
    * The kind of extension.
    */
  var Type: js.UndefOr[RegistryType] = js.undefined
  
  /**
    * The name of the extension being registered. We suggest that extension names adhere to the following patterns:   For resource types, company_or_organization::service::type.   For modules, company_or_organization::service::type::MODULE.   For hooks, MyCompany::Testing::MyTestHook.    The following organization namespaces are reserved and can't be used in your extension names:    Alexa     AMZN     Amazon     AWS     Custom     Dev    
    */
  var TypeName: typings.awsSdk.clientsCloudformationMod.TypeName
}
object RegisterTypeInput {
  
  inline def apply(SchemaHandlerPackage: S3Url, TypeName: TypeName): RegisterTypeInput = {
    val __obj = js.Dynamic.literal(SchemaHandlerPackage = SchemaHandlerPackage.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTypeInput]
  }
  
  extension [Self <: RegisterTypeInput](x: Self) {
    
    inline def setClientRequestToken(value: RequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "LoggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "LoggingConfig", js.undefined)
    
    inline def setSchemaHandlerPackage(value: S3Url): Self = StObject.set(x, "SchemaHandlerPackage", value.asInstanceOf[js.Any])
    
    inline def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
