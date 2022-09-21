package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetTransactionListResponse")
@js.native
open class GetTransactionListResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getTotalNumInResultSet(): Any = js.native
  
  def getTransactions(): Any = js.native
  
  def setTotalNumInResultSet(p_totalNumInResultSet: Any): Unit = js.native
  
  def setTransactions(p_transactions: Any): Unit = js.native
  
  var totalNumInResultSet: Any = js.native
  
  var transactions: Any = js.native
}
