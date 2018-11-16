package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewOverlay")
@js.native
class ViewOverlay protected () extends js.Object {
  def this(hostView: View) = this()
  var mOverlayViewGroup: androiduixLib.androidNs.viewNs.ViewOverlayNs.OverlayViewGroup = js.native
  def add(drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def getOverlayView(): ViewGroup = js.native
  def isEmpty(): scala.Boolean = js.native
  def remove(drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
}

