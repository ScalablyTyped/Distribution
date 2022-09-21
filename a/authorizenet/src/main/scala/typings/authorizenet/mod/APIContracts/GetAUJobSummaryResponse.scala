package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetAUJobSummaryResponse")
@js.native
open class GetAUJobSummaryResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var auSummary: Any = js.native
  
  def getAuSummary(): Any = js.native
  
  def setAuSummary(p_auSummary: Any): Unit = js.native
}
