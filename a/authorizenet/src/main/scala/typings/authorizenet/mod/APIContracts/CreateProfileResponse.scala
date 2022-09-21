package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreateProfileResponse")
@js.native
open class CreateProfileResponse protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerPaymentProfileIdList: Any = js.native
  
  var customerProfileId: Any = js.native
  
  var customerShippingAddressIdList: Any = js.native
  
  def getCustomerPaymentProfileIdList(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getCustomerShippingAddressIdList(): Any = js.native
  
  def getMessages(): Any = js.native
  
  var messages: Any = js.native
  
  def setCustomerPaymentProfileIdList(p_customerPaymentProfileIdList: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setCustomerShippingAddressIdList(p_customerShippingAddressIdList: Any): Unit = js.native
  
  def setMessages(p_messages: Any): Unit = js.native
}
