package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterUserSecret extends StObject {
  
  /**
    * The Amazon Web Services KMS key identifier that is used to encrypt the secret.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the secret.
    */
  var SecretArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the secret. The possible status values include the following:    creating - The secret is being created.    active - The secret is available for normal use and rotation.    rotating - The secret is being rotated.    impaired - The secret can be used to access database credentials, but it can't be rotated. A secret might have this status if, for example, permissions are changed so that RDS can no longer access either the secret or the KMS key for the secret. When a secret has this status, you can correct the condition that caused the status. Alternatively, modify the DB instance to turn off automatic management of database credentials, and then modify the DB instance again to turn on automatic management of database credentials.  
    */
  var SecretStatus: js.UndefOr[String] = js.undefined
}
object MasterUserSecret {
  
  inline def apply(): MasterUserSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterUserSecret]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MasterUserSecret] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSecretArn(value: String): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    inline def setSecretStatus(value: String): Self = StObject.set(x, "SecretStatus", value.asInstanceOf[js.Any])
    
    inline def setSecretStatusUndefined: Self = StObject.set(x, "SecretStatus", js.undefined)
  }
}
