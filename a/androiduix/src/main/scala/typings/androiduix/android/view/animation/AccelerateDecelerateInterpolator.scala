package typings.androiduix.android.view.animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccelerateDecelerateInterpolator extends Interpolator
object AccelerateDecelerateInterpolator {
  
  @scala.inline
  def apply(getInterpolation: Double => Double): AccelerateDecelerateInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation))
    __obj.asInstanceOf[AccelerateDecelerateInterpolator]
  }
}
