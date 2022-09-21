package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreateCustomerShippingAddressResponse")
@js.native
open class CreateCustomerShippingAddressResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerAddressId: Any = js.native
  
  var customerProfileId: Any = js.native
  
  def getCustomerAddressId(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def setCustomerAddressId(p_customerAddressId: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
}
