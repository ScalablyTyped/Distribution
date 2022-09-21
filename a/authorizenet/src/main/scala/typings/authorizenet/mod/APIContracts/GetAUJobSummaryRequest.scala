package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetAUJobSummaryRequest")
@js.native
open class GetAUJobSummaryRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.GetAUJobSummaryRequest = js.native
  
  def getMonth(): Any = js.native
  
  var month: Any = js.native
  
  def setMonth(p_month: Any): Unit = js.native
}
