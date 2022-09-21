package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.DeleteCustomerPaymentProfileRequest")
@js.native
open class DeleteCustomerPaymentProfileRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerPaymentProfileId: Any = js.native
  
  var customerProfileId: Any = js.native
  
  def getCustomerPaymentProfileId(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.DeleteCustomerPaymentProfileRequest = js.native
  
  def setCustomerPaymentProfileId(p_customerPaymentProfileId: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
}
