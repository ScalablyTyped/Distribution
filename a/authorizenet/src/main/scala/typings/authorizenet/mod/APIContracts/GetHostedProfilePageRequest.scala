package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetHostedProfilePageRequest")
@js.native
open class GetHostedProfilePageRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerProfileId: Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getHostedProfileSettings(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.GetHostedProfilePageRequest = js.native
  
  var hostedProfileSettings: Any = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setHostedProfileSettings(p_hostedProfileSettings: Any): Unit = js.native
}
