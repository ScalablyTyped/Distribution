package typings.androiduix.android.view.animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interpolator extends StObject {
  
  def getInterpolation(input: Double): Double = js.native
}
object Interpolator {
  
  @scala.inline
  def apply(getInterpolation: Double => Double): Interpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation))
    __obj.asInstanceOf[Interpolator]
  }
  
  @scala.inline
  implicit class InterpolatorMutableBuilder[Self <: Interpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInterpolation(value: Double => Double): Self = StObject.set(x, "getInterpolation", js.Any.fromFunction1(value))
  }
}
