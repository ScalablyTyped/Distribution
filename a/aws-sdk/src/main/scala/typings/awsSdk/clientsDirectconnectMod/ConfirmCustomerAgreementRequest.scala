package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmCustomerAgreementRequest extends StObject {
  
  /**
    *  The name of the customer agreement. 
    */
  var agreementName: js.UndefOr[AgreementName] = js.undefined
}
object ConfirmCustomerAgreementRequest {
  
  inline def apply(): ConfirmCustomerAgreementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCustomerAgreementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfirmCustomerAgreementRequest] (val x: Self) extends AnyVal {
    
    inline def setAgreementName(value: AgreementName): Self = StObject.set(x, "agreementName", value.asInstanceOf[js.Any])
    
    inline def setAgreementNameUndefined: Self = StObject.set(x, "agreementName", js.undefined)
  }
}
