package typings.androiduix.androidui.widget

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverScrollLocker extends js.Object {
  def getScrollContentBottom(): Double
  def lockOverScrollBottom(lockBottom: Double): Unit
  def lockOverScrollTop(lockTop: Double): Unit
}

@JSGlobal("androidui.widget.OverScrollLocker")
@js.native
object OverScrollLocker extends js.Object {
  def getFrom(view: View): OverScrollLocker = js.native
}

