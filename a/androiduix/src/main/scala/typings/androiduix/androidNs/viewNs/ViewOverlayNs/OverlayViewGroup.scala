package typings.androiduix.androidNs.viewNs.ViewOverlayNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroup
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewOverlay.OverlayViewGroup")
@js.native
class OverlayViewGroup protected () extends ViewGroup {
  def this(hostView: View) = this()
  var mDrawables: Set[Drawable] = js.native
  var mHostView: View = js.native
  def add(child: View): js.Any = js.native
  def add(drawable: Drawable): js.Any = js.native
  /* private */ def addDrawable(drawable: js.Any): js.Any = js.native
  def clear(): Unit = js.native
  def isEmpty(): Boolean = js.native
}

