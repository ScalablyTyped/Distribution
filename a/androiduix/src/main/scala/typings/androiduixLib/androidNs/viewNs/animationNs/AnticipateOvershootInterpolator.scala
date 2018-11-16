package typings
package androiduixLib.androidNs.viewNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.animation.AnticipateOvershootInterpolator")
@js.native
class AnticipateOvershootInterpolator () extends Interpolator {
  def this(tension: scala.Double) = this()
  def this(tension: scala.Double, extraTension: scala.Double) = this()
  var mTension: js.Any = js.native
  /* CompleteClass */
  override def getInterpolation(input: scala.Double): scala.Double = js.native
}

@JSGlobal("android.view.animation.AnticipateOvershootInterpolator")
@js.native
object AnticipateOvershootInterpolator extends js.Object {
  /* private */ def a(t: js.Any, s: js.Any): js.Any = js.native
  /* private */ def o(t: js.Any, s: js.Any): js.Any = js.native
}

