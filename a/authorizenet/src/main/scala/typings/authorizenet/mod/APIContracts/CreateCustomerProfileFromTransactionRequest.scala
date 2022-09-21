package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreateCustomerProfileFromTransactionRequest")
@js.native
open class CreateCustomerProfileFromTransactionRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customer: Any = js.native
  
  var customerProfileId: Any = js.native
  
  var defaultPaymentProfile: Any = js.native
  
  var defaultShippingAddress: Any = js.native
  
  def getCustomer(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getDefaultPaymentProfile(): Any = js.native
  
  def getDefaultShippingAddress(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.CreateCustomerProfileFromTransactionRequest = js.native
  
  def getProfileType(): Any = js.native
  
  def getTransId(): Any = js.native
  
  var profileType: Any = js.native
  
  def setCustomer(p_customer: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setDefaultPaymentProfile(p_defaultPaymentProfile: Any): Unit = js.native
  
  def setDefaultShippingAddress(p_defaultShippingAddress: Any): Unit = js.native
  
  def setProfileType(p_profileType: Any): Unit = js.native
  
  def setTransId(p_transId: Any): Unit = js.native
  
  var transId: Any = js.native
}
