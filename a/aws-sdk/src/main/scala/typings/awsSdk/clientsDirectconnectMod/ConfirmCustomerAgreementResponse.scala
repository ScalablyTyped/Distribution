package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmCustomerAgreementResponse extends StObject {
  
  /**
    *  The status of the customer agreement when the connection was created. This will be either signed or unsigned. 
    */
  var status: js.UndefOr[Status] = js.undefined
}
object ConfirmCustomerAgreementResponse {
  
  inline def apply(): ConfirmCustomerAgreementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCustomerAgreementResponse]
  }
  
  extension [Self <: ConfirmCustomerAgreementResponse](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
