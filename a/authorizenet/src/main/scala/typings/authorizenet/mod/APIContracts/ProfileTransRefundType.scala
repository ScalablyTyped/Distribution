package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ProfileTransRefundType")
@js.native
open class ProfileTransRefundType protected () extends ProfileTransAmountType {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var bankAccountNumberMasked: Any = js.native
  
  var bankRoutingNumberMasked: Any = js.native
  
  var creditCardNumberMasked: Any = js.native
  
  var customerPaymentProfileId: Any = js.native
  
  var customerProfileId: Any = js.native
  
  var customerShippingAddressId: Any = js.native
  
  def getBankAccountNumberMasked(): Any = js.native
  
  def getBankRoutingNumberMasked(): Any = js.native
  
  def getCreditCardNumberMasked(): Any = js.native
  
  def getCustomerPaymentProfileId(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getCustomerShippingAddressId(): Any = js.native
  
  def getOrder(): Any = js.native
  
  def getTransId(): Any = js.native
  
  var order: Any = js.native
  
  def setBankAccountNumberMasked(p_bankAccountNumberMasked: Any): Unit = js.native
  
  def setBankRoutingNumberMasked(p_bankRoutingNumberMasked: Any): Unit = js.native
  
  def setCreditCardNumberMasked(p_creditCardNumberMasked: Any): Unit = js.native
  
  def setCustomerPaymentProfileId(p_customerPaymentProfileId: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setCustomerShippingAddressId(p_customerShippingAddressId: Any): Unit = js.native
  
  def setOrder(p_order: Any): Unit = js.native
  
  def setTransId(p_transId: Any): Unit = js.native
  
  var transId: Any = js.native
}
