package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.UpdateCustomerProfileRequest")
@js.native
open class UpdateCustomerProfileRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.UpdateCustomerProfileRequest = js.native
  
  def getProfile(): Any = js.native
  
  var profile: Any = js.native
  
  def setProfile(p_profile: Any): Unit = js.native
}
