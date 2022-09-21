package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.MobileDeviceLoginResponse")
@js.native
open class MobileDeviceLoginResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getMerchantAccount(): Any = js.native
  
  def getMerchantContact(): Any = js.native
  
  def getUserPermissions(): Any = js.native
  
  var merchantAccount: Any = js.native
  
  var merchantContact: Any = js.native
  
  def setMerchantAccount(p_merchantAccount: Any): Unit = js.native
  
  def setMerchantContact(p_merchantContact: Any): Unit = js.native
  
  def setUserPermissions(p_userPermissions: Any): Unit = js.native
  
  var userPermissions: Any = js.native
}
