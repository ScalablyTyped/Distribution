package typings
package androiduixLib.androidNs.viewNs.ViewOverlayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewOverlay.OverlayViewGroup")
@js.native
class OverlayViewGroup protected ()
  extends androiduixLib.androidNs.viewNs.ViewGroup {
  def this(hostView: androiduixLib.androidNs.viewNs.View) = this()
  var mDrawables: stdLib.Set[androiduixLib.androidNs.graphicsNs.drawableNs.Drawable] = js.native
  var mHostView: androiduixLib.androidNs.viewNs.View = js.native
  def add(child: androiduixLib.androidNs.viewNs.View): js.Any = js.native
  def add(drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): js.Any = js.native
  /* private */ def addDrawable(drawable: js.Any): js.Any = js.native
  def clear(): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
}

