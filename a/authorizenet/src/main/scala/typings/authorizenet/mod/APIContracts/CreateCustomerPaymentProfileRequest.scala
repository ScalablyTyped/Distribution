package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreateCustomerPaymentProfileRequest")
@js.native
open class CreateCustomerPaymentProfileRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerProfileId: Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.CreateCustomerPaymentProfileRequest = js.native
  
  def getPaymentProfile(): Any = js.native
  
  def getValidationMode(): Any = js.native
  
  var paymentProfile: Any = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setPaymentProfile(p_paymentProfile: Any): Unit = js.native
  
  def setValidationMode(p_validationMode: Any): Unit = js.native
  
  var validationMode: Any = js.native
}
