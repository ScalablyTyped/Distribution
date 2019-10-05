package typings.androiduix.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.animation.AccelerateInterpolator")
@js.native
class AccelerateInterpolator () extends Interpolator {
  def this(factor: Double) = this()
  var mDoubleFactor: js.Any = js.native
  var mFactor: js.Any = js.native
  /* CompleteClass */
  override def getInterpolation(input: Double): Double = js.native
}

