package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.viewNs.ViewOverlayNs.OverlayViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewOverlay")
@js.native
class ViewOverlay protected () extends js.Object {
  def this(hostView: View) = this()
  var mOverlayViewGroup: OverlayViewGroup = js.native
  def add(drawable: Drawable): Unit = js.native
  def clear(): Unit = js.native
  def getOverlayView(): ViewGroup = js.native
  def isEmpty(): Boolean = js.native
  def remove(drawable: Drawable): Unit = js.native
}

