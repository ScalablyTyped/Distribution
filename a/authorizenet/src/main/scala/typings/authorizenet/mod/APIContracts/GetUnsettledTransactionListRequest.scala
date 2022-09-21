package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetUnsettledTransactionListRequest")
@js.native
open class GetUnsettledTransactionListRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.GetUnsettledTransactionListRequest = js.native
  
  def getPaging(): Any = js.native
  
  def getSorting(): Any = js.native
  
  def getStatus(): Any = js.native
  
  var paging: Any = js.native
  
  def setPaging(p_paging: Any): Unit = js.native
  
  def setSorting(p_sorting: Any): Unit = js.native
  
  def setStatus(p_status: Any): Unit = js.native
  
  var sorting: Any = js.native
  
  var status: Any = js.native
}
