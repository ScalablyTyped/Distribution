package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.MobileDeviceRegistrationRequest")
@js.native
open class MobileDeviceRegistrationRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.MobileDeviceRegistrationRequest = js.native
  
  def getMobileDevice(): Any = js.native
  
  var mobileDevice: Any = js.native
  
  def setMobileDevice(p_mobileDevice: Any): Unit = js.native
}
