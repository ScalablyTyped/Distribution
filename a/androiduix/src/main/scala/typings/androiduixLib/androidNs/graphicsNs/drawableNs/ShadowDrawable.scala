package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ShadowDrawable")
@js.native
class ShadowDrawable protected () extends Drawable {
  def this(drawable: Drawable, radius: scala.Double, dx: scala.Double, dy: scala.Double, color: scala.Double) = this()
  var mMutated: js.Any = js.native
  var mState: js.Any = js.native
  def drawableSizeChange(who: Drawable): js.Any = js.native
  def getDrawable(): Drawable = js.native
  def invalidateDrawable(who: Drawable): scala.Unit = js.native
  def scheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable, when: scala.Double): scala.Unit = js.native
  def setShadow(radius: scala.Double, dx: scala.Double, dy: scala.Double, color: scala.Double): scala.Unit = js.native
  def unscheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
}

