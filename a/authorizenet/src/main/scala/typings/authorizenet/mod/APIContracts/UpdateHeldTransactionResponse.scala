package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.UpdateHeldTransactionResponse")
@js.native
open class UpdateHeldTransactionResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getTransactionResponse(): Any = js.native
  
  def setTransactionResponse(p_transactionResponse: Any): Unit = js.native
  
  var transactionResponse: Any = js.native
}
