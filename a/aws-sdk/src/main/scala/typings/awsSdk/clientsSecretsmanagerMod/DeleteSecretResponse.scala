package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSecretResponse extends StObject {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The date and time after which this secret Secrets Manager can permanently delete this secret, and it can no longer be restored. This value is the date and time of the delete request plus the number of days in RecoveryWindowInDays.
    */
  var DeletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
}
object DeleteSecretResponse {
  
  inline def apply(): DeleteSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSecretResponse]
  }
  
  extension [Self <: DeleteSecretResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
