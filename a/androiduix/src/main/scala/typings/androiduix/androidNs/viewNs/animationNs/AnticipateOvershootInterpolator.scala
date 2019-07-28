package typings.androiduix.androidNs.viewNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.animation.AnticipateOvershootInterpolator")
@js.native
class AnticipateOvershootInterpolator () extends Interpolator {
  def this(tension: Double) = this()
  def this(tension: Double, extraTension: Double) = this()
  var mTension: js.Any = js.native
  /* CompleteClass */
  override def getInterpolation(input: Double): Double = js.native
}

/* static members */
@JSGlobal("android.view.animation.AnticipateOvershootInterpolator")
@js.native
object AnticipateOvershootInterpolator extends js.Object {
  /* private */ def a(t: js.Any, s: js.Any): js.Any = js.native
  /* private */ def o(t: js.Any, s: js.Any): js.Any = js.native
}

