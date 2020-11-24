package typings.asana.mod.auth

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupFlow extends BaseBrowserFlow {
  
  /**
    * @param popupWidth
    * @param popupHeight
    */
  def _popupParams(popupWidth: Double, popupHeight: Double): Unit = js.native
  
  def runReceiver(): Unit = js.native
}
@JSImport("asana", "auth.PopupFlow")
@js.native
object PopupFlow extends TopLevel[PopupFlowStatic]
