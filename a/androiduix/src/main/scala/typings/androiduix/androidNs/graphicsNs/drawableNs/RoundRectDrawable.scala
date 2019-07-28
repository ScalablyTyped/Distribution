package typings.androiduix.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.RoundRectDrawable")
@js.native
class RoundRectDrawable protected () extends Drawable {
  def this(color: Double, radiusTopLeft: Double) = this()
  def this(color: Double, radiusTopLeft: Double, radiusTopRight: Double) = this()
  def this(color: Double, radiusTopLeft: Double, radiusTopRight: Double, radiusBottomRight: Double) = this()
  def this(
    color: Double,
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: Double,
    radiusBottomLeft: Double
  ) = this()
  var mMutated: js.Any = js.native
  var mPaint: js.Any = js.native
  var mState: js.Any = js.native
  def getColor(): Double = js.native
  def setColor(color: Double): Unit = js.native
}

