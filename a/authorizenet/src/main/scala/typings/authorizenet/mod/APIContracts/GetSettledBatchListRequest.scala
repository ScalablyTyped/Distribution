package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetSettledBatchListRequest")
@js.native
open class GetSettledBatchListRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var firstSettlementDate: Any = js.native
  
  def getFirstSettlementDate(): Any = js.native
  
  def getIncludeStatistics(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.GetSettledBatchListRequest = js.native
  
  def getLastSettlementDate(): Any = js.native
  
  var includeStatistics: Any = js.native
  
  var lastSettlementDate: Any = js.native
  
  def setFirstSettlementDate(p_firstSettlementDate: Any): Unit = js.native
  
  def setIncludeStatistics(p_includeStatistics: Any): Unit = js.native
  
  def setLastSettlementDate(p_lastSettlementDate: Any): Unit = js.native
}
