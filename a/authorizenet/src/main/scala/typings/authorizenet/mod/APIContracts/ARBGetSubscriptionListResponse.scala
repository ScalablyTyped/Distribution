package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ARBGetSubscriptionListResponse")
@js.native
open class ARBGetSubscriptionListResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getSubscriptionDetails(): Any = js.native
  
  def getTotalNumInResultSet(): Any = js.native
  
  def setSubscriptionDetails(p_subscriptionDetails: Any): Unit = js.native
  
  def setTotalNumInResultSet(p_totalNumInResultSet: Any): Unit = js.native
  
  var subscriptionDetails: Any = js.native
  
  var totalNumInResultSet: Any = js.native
}
