package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAccountRequest extends StObject {
  
  /**
    *  The delegated administrator account for Audit Manager. 
    */
  var delegatedAdminAccount: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The KMS key details. 
    */
  var kmsKey: js.UndefOr[KmsKey] = js.undefined
}
object RegisterAccountRequest {
  
  inline def apply(): RegisterAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setDelegatedAdminAccount(value: AccountId): Self = StObject.set(x, "delegatedAdminAccount", value.asInstanceOf[js.Any])
    
    inline def setDelegatedAdminAccountUndefined: Self = StObject.set(x, "delegatedAdminAccount", js.undefined)
    
    inline def setKmsKey(value: KmsKey): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
  }
}
