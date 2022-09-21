package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreateCustomerProfileRequest")
@js.native
open class CreateCustomerProfileRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.CreateCustomerProfileRequest = js.native
  
  def getProfile(): Any = js.native
  
  def getValidationMode(): Any = js.native
  
  var profile: Any = js.native
  
  def setProfile(p_profile: Any): Unit = js.native
  
  def setValidationMode(p_validationMode: Any): Unit = js.native
  
  var validationMode: Any = js.native
}
