package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.UpdateCustomerShippingAddressRequest")
@js.native
open class UpdateCustomerShippingAddressRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var address: Any = js.native
  
  var customerProfileId: Any = js.native
  
  var defaultShippingAddress: Any = js.native
  
  def getAddress(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getDefaultShippingAddress(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.UpdateCustomerShippingAddressRequest = js.native
  
  def setAddress(p_address: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setDefaultShippingAddress(p_defaultShippingAddress: Any): Unit = js.native
}
