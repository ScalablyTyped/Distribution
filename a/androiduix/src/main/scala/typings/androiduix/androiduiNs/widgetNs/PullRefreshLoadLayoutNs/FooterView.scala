package typings.androiduix.androiduiNs.widgetNs.PullRefreshLoadLayoutNs

import typings.androiduix.androidNs.widgetNs.FrameLayout
import typings.androiduix.androiduiNs.widgetNs.PullRefreshLoadLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.PullRefreshLoadLayout.FooterView")
@js.native
abstract class FooterView () extends FrameLayout {
  var state: js.Any = js.native
  var stateBeforeReady: js.Any = js.native
  def onStateChange(newState: Double, oldState: Double): Unit = js.native
  /* protected */ def setStateInner(prll: PullRefreshLoadLayout, state: Double): Unit = js.native
}

