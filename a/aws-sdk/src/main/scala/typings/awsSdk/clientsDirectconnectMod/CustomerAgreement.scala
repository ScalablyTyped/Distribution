package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerAgreement extends StObject {
  
  /**
    * The name of the agreement.
    */
  var agreementName: js.UndefOr[AgreementName] = js.undefined
  
  /**
    * The status of the customer agreement. This will be either signed or unsigned 
    */
  var status: js.UndefOr[Status] = js.undefined
}
object CustomerAgreement {
  
  inline def apply(): CustomerAgreement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerAgreement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerAgreement] (val x: Self) extends AnyVal {
    
    inline def setAgreementName(value: AgreementName): Self = StObject.set(x, "agreementName", value.asInstanceOf[js.Any])
    
    inline def setAgreementNameUndefined: Self = StObject.set(x, "agreementName", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
