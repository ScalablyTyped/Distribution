package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreateTransactionRequest")
@js.native
open class CreateTransactionRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.CreateTransactionRequest = js.native
  
  def getTransactionRequest(): Any = js.native
  
  def setTransactionRequest(p_transactionRequest: Any): Unit = js.native
  
  var transactionRequest: Any = js.native
}
