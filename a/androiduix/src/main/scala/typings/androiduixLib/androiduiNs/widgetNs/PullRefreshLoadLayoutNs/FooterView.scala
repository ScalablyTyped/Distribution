package typings
package androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.PullRefreshLoadLayout.FooterView")
@js.native
abstract class FooterView ()
  extends androiduixLib.androidNs.widgetNs.FrameLayout {
  var state: js.Any = js.native
  var stateBeforeReady: js.Any = js.native
  def onStateChange(newState: scala.Double, oldState: scala.Double): scala.Unit = js.native
  /* protected */ def setStateInner(prll: androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayout, state: scala.Double): scala.Unit = js.native
}

