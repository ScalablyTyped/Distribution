package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ARBUpdateSubscriptionRequest")
@js.native
open class ARBUpdateSubscriptionRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.ARBUpdateSubscriptionRequest = js.native
  
  def getSubscription(): Any = js.native
  
  def getSubscriptionId(): Any = js.native
  
  def setSubscription(p_subscription: Any): Unit = js.native
  
  def setSubscriptionId(p_subscriptionId: Any): Unit = js.native
  
  var subscription: Any = js.native
  
  var subscriptionId: Any = js.native
}
