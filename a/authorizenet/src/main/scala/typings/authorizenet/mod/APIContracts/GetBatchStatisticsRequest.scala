package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetBatchStatisticsRequest")
@js.native
open class GetBatchStatisticsRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var batchId: Any = js.native
  
  def getBatchId(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.GetBatchStatisticsRequest = js.native
  
  def setBatchId(p_batchId: Any): Unit = js.native
}
