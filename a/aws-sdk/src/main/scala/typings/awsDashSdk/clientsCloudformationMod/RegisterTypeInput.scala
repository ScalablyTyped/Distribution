package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTypeInput extends js.Object {
  /**
    * A unique identifier that acts as an idempotency key for this registration request. Specifying a client request token prevents CloudFormation from generating more than one version of a type from the same registeration request, even if the request is submitted multiple times. 
    */
  var ClientRequestToken: js.UndefOr[RequestToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM execution role to use to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an  IAM execution role  that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * Specifies logging configuration information for a type.
    */
  var LoggingConfig: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.LoggingConfig] = js.native
  /**
    * A url to the S3 bucket containing the schema handler package that contains the schema, event handlers, and associated files for the type you want to register. For information on generating a schema handler package for the type you want to register, see submit in the CloudFormation CLI User Guide.
    */
  var SchemaHandlerPackage: S3Url = js.native
  /**
    * The kind of type. Currently, the only valid value is RESOURCE.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The name of the type being registered. We recommend that type names adhere to the following pattern: company_or_organization::service::type.  The following organization namespaces are reserved and cannot be used in your resource type names:    Alexa     AMZN     Amazon     AWS     Custom     Dev    
    */
  var TypeName: typings.awsDashSdk.clientsCloudformationMod.TypeName = js.native
}

object RegisterTypeInput {
  @scala.inline
  def apply(
    SchemaHandlerPackage: S3Url,
    TypeName: TypeName,
    ClientRequestToken: RequestToken = null,
    ExecutionRoleArn: RoleArn = null,
    LoggingConfig: LoggingConfig = null,
    Type: RegistryType = null
  ): RegisterTypeInput = {
    val __obj = js.Dynamic.literal(SchemaHandlerPackage = SchemaHandlerPackage.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (ExecutionRoleArn != null) __obj.updateDynamic("ExecutionRoleArn")(ExecutionRoleArn.asInstanceOf[js.Any])
    if (LoggingConfig != null) __obj.updateDynamic("LoggingConfig")(LoggingConfig.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTypeInput]
  }
}

