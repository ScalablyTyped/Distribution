package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.UpdateSplitTenderGroupRequest")
@js.native
open class UpdateSplitTenderGroupRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.UpdateSplitTenderGroupRequest = js.native
  
  def getSplitTenderId(): Any = js.native
  
  def getSplitTenderStatus(): Any = js.native
  
  def setSplitTenderId(p_splitTenderId: Any): Unit = js.native
  
  def setSplitTenderStatus(p_splitTenderStatus: Any): Unit = js.native
  
  var splitTenderId: Any = js.native
  
  var splitTenderStatus: Any = js.native
}
