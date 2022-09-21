package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ARBGetSubscriptionResponse")
@js.native
open class ARBGetSubscriptionResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getSubscription(): Any = js.native
  
  def setSubscription(p_subscription: Any): Unit = js.native
  
  var subscription: Any = js.native
}
