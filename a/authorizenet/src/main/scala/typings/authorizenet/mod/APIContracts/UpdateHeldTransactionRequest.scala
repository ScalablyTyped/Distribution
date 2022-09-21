package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.UpdateHeldTransactionRequest")
@js.native
open class UpdateHeldTransactionRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getHeldTransactionRequest(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.UpdateHeldTransactionRequest = js.native
  
  var heldTransactionRequest: Any = js.native
  
  def setHeldTransactionRequest(p_heldTransactionRequest: Any): Unit = js.native
}
