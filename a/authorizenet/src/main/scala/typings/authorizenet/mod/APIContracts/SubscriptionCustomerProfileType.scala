package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.SubscriptionCustomerProfileType")
@js.native
open class SubscriptionCustomerProfileType protected () extends CustomerProfileExType {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getPaymentProfile(): Any = js.native
  
  def getShippingProfile(): Any = js.native
  
  var paymentProfile: Any = js.native
  
  def setPaymentProfile(p_paymentProfile: Any): Unit = js.native
  
  def setShippingProfile(p_shippingProfile: Any): Unit = js.native
  
  var shippingProfile: Any = js.native
}
