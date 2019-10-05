package typings.asana.asanaMod.auth

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupFlow extends BaseBrowserFlow {
  /**
    * @param popupWidth
    * @param popupHeight
    */
  def _popupParams(popupWidth: Double, popupHeight: Double): Unit
  def runReceiver(): Unit
}

@JSImport("asana", "auth.PopupFlow")
@js.native
object PopupFlow extends TopLevel[PopupFlowStatic]

