package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressCircularConfig extends js.Object {
  
  var duration: js.UndefOr[Double] = js.native
  
  var durationIndeterminate: js.UndefOr[Double] = js.native
  
  var easeFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.native
  
  var easeFnIndeterminate: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.native
  
  var endIndeterminate: js.UndefOr[Double] = js.native
  
  var progressSize: js.UndefOr[Double] = js.native
  
  var startIndeterminate: js.UndefOr[Double] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object IProgressCircularConfig {
  
  @scala.inline
  def apply(): IProgressCircularConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressCircularConfig]
  }
  
  @scala.inline
  implicit class IProgressCircularConfigOps[Self <: IProgressCircularConfig] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDurationIndeterminate(value: Double): Self = this.set("durationIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationIndeterminate: Self = this.set("durationIndeterminate", js.undefined)
    
    @scala.inline
    def setEaseFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = this.set("easeFn", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteEaseFn: Self = this.set("easeFn", js.undefined)
    
    @scala.inline
    def setEaseFnIndeterminate(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = this.set("easeFnIndeterminate", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteEaseFnIndeterminate: Self = this.set("easeFnIndeterminate", js.undefined)
    
    @scala.inline
    def setEndIndeterminate(value: Double): Self = this.set("endIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndeterminate: Self = this.set("endIndeterminate", js.undefined)
    
    @scala.inline
    def setProgressSize(value: Double): Self = this.set("progressSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressSize: Self = this.set("progressSize", js.undefined)
    
    @scala.inline
    def setStartIndeterminate(value: Double): Self = this.set("startIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndeterminate: Self = this.set("startIndeterminate", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
}
