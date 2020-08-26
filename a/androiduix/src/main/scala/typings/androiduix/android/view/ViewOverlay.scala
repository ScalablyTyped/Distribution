package typings.androiduix.android.view

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.ViewOverlay.OverlayViewGroup
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOverlay extends js.Object {
  var mOverlayViewGroup: OverlayViewGroup = js.native
  def add(drawable: Drawable): Unit = js.native
  def clear(): Unit = js.native
  def getOverlayView(): ViewGroup = js.native
  def isEmpty(): Boolean = js.native
  def remove(drawable: Drawable): Unit = js.native
}

@JSGlobal("android.view.ViewOverlay")
@js.native
object ViewOverlay extends js.Object {
  @js.native
  trait OverlayViewGroup extends ViewGroup {
    var mDrawables: Set[Drawable] = js.native
    var mHostView: View = js.native
    def add(child: View): js.Any = js.native
    def add(drawable: Drawable): js.Any = js.native
    /* private */ def addDrawable(drawable: js.Any): js.Any = js.native
    def clear(): Unit = js.native
    def isEmpty(): Boolean = js.native
  }
  
}

