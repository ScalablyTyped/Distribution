package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetAUJobDetailsResponse")
@js.native
open class GetAUJobDetailsResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var auDetails: Any = js.native
  
  def getAuDetails(): Any = js.native
  
  def getTotalNumInResultSet(): Any = js.native
  
  def setAuDetails(p_auDetails: Any): Unit = js.native
  
  def setTotalNumInResultSet(p_totalNumInResultSet: Any): Unit = js.native
  
  var totalNumInResultSet: Any = js.native
}
