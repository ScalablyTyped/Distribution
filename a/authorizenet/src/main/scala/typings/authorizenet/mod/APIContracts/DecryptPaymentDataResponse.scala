package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.DecryptPaymentDataResponse")
@js.native
open class DecryptPaymentDataResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var billingInfo: Any = js.native
  
  var cardInfo: Any = js.native
  
  def getBillingInfo(): Any = js.native
  
  def getCardInfo(): Any = js.native
  
  def getPaymentDetails(): Any = js.native
  
  def getShippingInfo(): Any = js.native
  
  var paymentDetails: Any = js.native
  
  def setBillingInfo(p_billingInfo: Any): Unit = js.native
  
  def setCardInfo(p_cardInfo: Any): Unit = js.native
  
  def setPaymentDetails(p_paymentDetails: Any): Unit = js.native
  
  def setShippingInfo(p_shippingInfo: Any): Unit = js.native
  
  var shippingInfo: Any = js.native
}
