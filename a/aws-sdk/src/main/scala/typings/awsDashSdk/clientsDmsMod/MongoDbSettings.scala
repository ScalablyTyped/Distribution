package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoDbSettings extends js.Object {
  /**
    *  The authentication mechanism you use to access the MongoDB source endpoint. Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1  DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This setting is not used when authType=No.
    */
  var AuthMechanism: js.UndefOr[AuthMechanismValue] = js.undefined
  /**
    *  The MongoDB database name. This setting is not used when authType=NO.  The default is admin.
    */
  var AuthSource: js.UndefOr[String] = js.undefined
  /**
    *  The authentication type you use to access the MongoDB source endpoint. Valid values: NO, PASSWORD  When NO is selected, user name and password parameters are not used and can be empty. 
    */
  var AuthType: js.UndefOr[AuthTypeValue] = js.undefined
  /**
    *  The database name on the MongoDB source endpoint. 
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    *  Indicates the number of documents to preview to determine the document organization. Use this setting when NestingLevel is set to ONE.  Must be a positive value greater than 0. Default value is 1000.
    */
  var DocsToInvestigate: js.UndefOr[String] = js.undefined
  /**
    *  Specifies the document ID. Use this setting when NestingLevel is set to NONE.  Default value is false. 
    */
  var ExtractDocId: js.UndefOr[String] = js.undefined
  /**
    * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    *  Specifies either document or table mode.  Valid values: NONE, ONE Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
    */
  var NestingLevel: js.UndefOr[NestingLevelValue] = js.undefined
  /**
    *  The password for the user account you use to access the MongoDB source endpoint. 
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  /**
    *  The port value for the MongoDB source endpoint. 
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    *  The name of the server on the MongoDB source endpoint. 
    */
  var ServerName: js.UndefOr[String] = js.undefined
  /**
    * The user name you use to access the MongoDB source endpoint. 
    */
  var Username: js.UndefOr[String] = js.undefined
}

object MongoDbSettings {
  @scala.inline
  def apply(
    AuthMechanism: AuthMechanismValue = null,
    AuthSource: String = null,
    AuthType: AuthTypeValue = null,
    DatabaseName: String = null,
    DocsToInvestigate: String = null,
    ExtractDocId: String = null,
    KmsKeyId: String = null,
    NestingLevel: NestingLevelValue = null,
    Password: SecretString = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    ServerName: String = null,
    Username: String = null
  ): MongoDbSettings = {
    val __obj = js.Dynamic.literal()
    if (AuthMechanism != null) __obj.updateDynamic("AuthMechanism")(AuthMechanism.asInstanceOf[js.Any])
    if (AuthSource != null) __obj.updateDynamic("AuthSource")(AuthSource)
    if (AuthType != null) __obj.updateDynamic("AuthType")(AuthType.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (DocsToInvestigate != null) __obj.updateDynamic("DocsToInvestigate")(DocsToInvestigate)
    if (ExtractDocId != null) __obj.updateDynamic("ExtractDocId")(ExtractDocId)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (NestingLevel != null) __obj.updateDynamic("NestingLevel")(NestingLevel.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[MongoDbSettings]
  }
}

