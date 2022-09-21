package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ValidateCustomerPaymentProfileRequest")
@js.native
open class ValidateCustomerPaymentProfileRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var cardCode: Any = js.native
  
  var customerPaymentProfileId: Any = js.native
  
  var customerProfileId: Any = js.native
  
  var customerShippingAddressId: Any = js.native
  
  def getCardCode(): Any = js.native
  
  def getCustomerPaymentProfileId(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getCustomerShippingAddressId(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.ValidateCustomerPaymentProfileRequest = js.native
  
  def getValidationMode(): Any = js.native
  
  def setCardCode(p_cardCode: Any): Unit = js.native
  
  def setCustomerPaymentProfileId(p_customerPaymentProfileId: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setCustomerShippingAddressId(p_customerShippingAddressId: Any): Unit = js.native
  
  def setValidationMode(p_validationMode: Any): Unit = js.native
  
  var validationMode: Any = js.native
}
