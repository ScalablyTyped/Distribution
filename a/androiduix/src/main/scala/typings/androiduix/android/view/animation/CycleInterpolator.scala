package typings.androiduix.android.view.animation

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
  implicit class CycleInterpolatorOps[Self <: CycleInterpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMCycles(value: js.Any): Self = this.set("mCycles", value.asInstanceOf[js.Any])
  }
}
