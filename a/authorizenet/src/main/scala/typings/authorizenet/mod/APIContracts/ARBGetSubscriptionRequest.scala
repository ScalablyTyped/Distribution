package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ARBGetSubscriptionRequest")
@js.native
open class ARBGetSubscriptionRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getIncludeTransactions(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.ARBGetSubscriptionRequest = js.native
  
  def getSubscriptionId(): Any = js.native
  
  var includeTransactions: Any = js.native
  
  def setIncludeTransactions(p_includeTransactions: Any): Unit = js.native
  
  def setSubscriptionId(p_subscriptionId: Any): Unit = js.native
  
  var subscriptionId: Any = js.native
}
