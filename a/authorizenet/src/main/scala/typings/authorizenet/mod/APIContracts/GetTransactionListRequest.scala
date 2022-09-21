package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetTransactionListRequest")
@js.native
open class GetTransactionListRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var batchId: Any = js.native
  
  def getBatchId(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.GetTransactionListRequest = js.native
  
  def getPaging(): Any = js.native
  
  def getSorting(): Any = js.native
  
  var paging: Any = js.native
  
  def setBatchId(p_batchId: Any): Unit = js.native
  
  def setPaging(p_paging: Any): Unit = js.native
  
  def setSorting(p_sorting: Any): Unit = js.native
  
  var sorting: Any = js.native
}
