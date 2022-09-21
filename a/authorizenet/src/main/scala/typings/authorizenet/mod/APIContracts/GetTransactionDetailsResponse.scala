package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetTransactionDetailsResponse")
@js.native
open class GetTransactionDetailsResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var clientId: Any = js.native
  
  def getClientId(): Any = js.native
  
  def getTransaction(): Any = js.native
  
  def getTransrefId(): Any = js.native
  
  def setClientId(p_clientId: Any): Unit = js.native
  
  def setTransaction(p_transaction: Any): Unit = js.native
  
  def setTransrefId(p_transrefId: Any): Unit = js.native
  
  var transaction: Any = js.native
  
  var transrefId: Any = js.native
}
