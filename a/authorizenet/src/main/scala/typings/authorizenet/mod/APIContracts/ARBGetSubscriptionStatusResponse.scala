package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ARBGetSubscriptionStatusResponse")
@js.native
open class ARBGetSubscriptionStatusResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getStatus(): Any = js.native
  
  def setStatus(p_status: Any): Unit = js.native
  
  var status: Any = js.native
}
