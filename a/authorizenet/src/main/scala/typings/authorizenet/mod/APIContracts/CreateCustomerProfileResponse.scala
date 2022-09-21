package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreateCustomerProfileResponse")
@js.native
open class CreateCustomerProfileResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerPaymentProfileIdList: Any = js.native
  
  var customerProfileId: Any = js.native
  
  var customerShippingAddressIdList: Any = js.native
  
  def getCustomerPaymentProfileIdList(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getCustomerShippingAddressIdList(): Any = js.native
  
  def getValidationDirectResponseList(): Any = js.native
  
  def setCustomerPaymentProfileIdList(p_customerPaymentProfileIdList: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setCustomerShippingAddressIdList(p_customerShippingAddressIdList: Any): Unit = js.native
  
  def setValidationDirectResponseList(p_validationDirectResponseList: Any): Unit = js.native
  
  var validationDirectResponseList: Any = js.native
}
