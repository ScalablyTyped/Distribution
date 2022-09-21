package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ARBCreateSubscriptionResponse")
@js.native
open class ARBCreateSubscriptionResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getProfile(): Any = js.native
  
  def getSubscriptionId(): Any = js.native
  
  var profile: Any = js.native
  
  def setProfile(p_profile: Any): Unit = js.native
  
  def setSubscriptionId(p_subscriptionId: Any): Unit = js.native
  
  var subscriptionId: Any = js.native
}
