package typings.androiduix.android.view.animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CycleInterpolator extends Interpolator {
  
  var mCycles: js.Any = js.native
}
object CycleInterpolator {
  
  @scala.inline
  def apply(getInterpolation: Double => Double, mCycles: js.Any): CycleInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation), mCycles = mCycles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CycleInterpolator]
  }
  
  @scala.inline
  implicit class CycleInterpolatorMutableBuilder[Self <: CycleInterpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMCycles(value: js.Any): Self = StObject.set(x, "mCycles", value.asInstanceOf[js.Any])
  }
}
