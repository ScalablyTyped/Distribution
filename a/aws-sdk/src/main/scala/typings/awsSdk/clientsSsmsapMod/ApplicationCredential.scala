package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationCredential extends StObject {
  
  /**
    * The type of the application credentials. 
    */
  var CredentialType: typings.awsSdk.clientsSsmsapMod.CredentialType
  
  /**
    * The name of the SAP HANA database.
    */
  var DatabaseName: typings.awsSdk.clientsSsmsapMod.DatabaseName
  
  /**
    * The secret ID created in AWS Secrets Manager to store the credentials of the SAP application. 
    */
  var SecretId: typings.awsSdk.clientsSsmsapMod.SecretId
}
object ApplicationCredential {
  
  inline def apply(CredentialType: CredentialType, DatabaseName: DatabaseName, SecretId: SecretId): ApplicationCredential = {
    val __obj = js.Dynamic.literal(CredentialType = CredentialType.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCredential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationCredential] (val x: Self) extends AnyVal {
    
    inline def setCredentialType(value: CredentialType): Self = StObject.set(x, "CredentialType", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setSecretId(value: SecretId): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
