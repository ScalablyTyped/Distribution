package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocDbSettings extends StObject {
  
  /**
    *  The database name on the DocumentDB source endpoint. 
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    *  Indicates the number of documents to preview to determine the document organization. Use this setting when NestingLevel is set to "one".  Must be a positive value greater than 0. Default value is 1000.
    */
  var DocsToInvestigate: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    *  Specifies the document ID. Use this setting when NestingLevel is set to "none".  Default value is "false". 
    */
  var ExtractDocId: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then DMS uses your default encryption key. KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has a different default encryption key for each Amazon Web Services Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies either document or table mode.  Default value is "none". Specify "none" to use document mode. Specify "one" to use table mode.
    */
  var NestingLevel: js.UndefOr[NestingLevelValue] = js.undefined
  
  /**
    *  The password for the user account you use to access the DocumentDB source endpoint. 
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    *  The port value for the DocumentDB source endpoint. 
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the required permissions to access the value in SecretsManagerSecret. The role must allow the iam:PassRole action. SecretsManagerSecret has the value of the Amazon Web Services Secrets Manager secret that allows access to the DocumentDB endpoint.  You can specify one of two sets of values for these permissions. You can specify the values for this setting and SecretsManagerSecretId. Or you can specify clear-text values for UserName, Password, ServerName, and Port. You can't specify both. For more information on creating this SecretsManagerSecret and the SecretsManagerAccessRoleArn and SecretsManagerSecretId required to access it, see Using secrets to access Database Migration Service resources in the Database Migration Service User Guide. 
    */
  var SecretsManagerAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the DocumentDB endpoint connection details.
    */
  var SecretsManagerSecretId: js.UndefOr[String] = js.undefined
  
  /**
    *  The name of the server on the DocumentDB source endpoint. 
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * The user name you use to access the DocumentDB source endpoint. 
    */
  var Username: js.UndefOr[String] = js.undefined
}
object DocDbSettings {
  
  inline def apply(): DocDbSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocDbSettings]
  }
  
  extension [Self <: DocDbSettings](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDocsToInvestigate(value: IntegerOptional): Self = StObject.set(x, "DocsToInvestigate", value.asInstanceOf[js.Any])
    
    inline def setDocsToInvestigateUndefined: Self = StObject.set(x, "DocsToInvestigate", js.undefined)
    
    inline def setExtractDocId(value: BooleanOptional): Self = StObject.set(x, "ExtractDocId", value.asInstanceOf[js.Any])
    
    inline def setExtractDocIdUndefined: Self = StObject.set(x, "ExtractDocId", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setNestingLevel(value: NestingLevelValue): Self = StObject.set(x, "NestingLevel", value.asInstanceOf[js.Any])
    
    inline def setNestingLevelUndefined: Self = StObject.set(x, "NestingLevel", js.undefined)
    
    inline def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setSecretsManagerAccessRoleArn(value: String): Self = StObject.set(x, "SecretsManagerAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerAccessRoleArnUndefined: Self = StObject.set(x, "SecretsManagerAccessRoleArn", js.undefined)
    
    inline def setSecretsManagerSecretId(value: String): Self = StObject.set(x, "SecretsManagerSecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerSecretIdUndefined: Self = StObject.set(x, "SecretsManagerSecretId", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
