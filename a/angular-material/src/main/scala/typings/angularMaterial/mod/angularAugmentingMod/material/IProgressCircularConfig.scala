package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressCircularConfig extends StObject {
  
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
  implicit class IProgressCircularConfigMutableBuilder[Self <: IProgressCircularConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationIndeterminate(value: Double): Self = StObject.set(x, "durationIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationIndeterminateUndefined: Self = StObject.set(x, "durationIndeterminate", js.undefined)
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEaseFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = StObject.set(x, "easeFn", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEaseFnIndeterminate(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = StObject.set(x, "easeFnIndeterminate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEaseFnIndeterminateUndefined: Self = StObject.set(x, "easeFnIndeterminate", js.undefined)
    
    @scala.inline
    def setEaseFnUndefined: Self = StObject.set(x, "easeFn", js.undefined)
    
    @scala.inline
    def setEndIndeterminate(value: Double): Self = StObject.set(x, "endIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndeterminateUndefined: Self = StObject.set(x, "endIndeterminate", js.undefined)
    
    @scala.inline
    def setProgressSize(value: Double): Self = StObject.set(x, "progressSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressSizeUndefined: Self = StObject.set(x, "progressSize", js.undefined)
    
    @scala.inline
    def setStartIndeterminate(value: Double): Self = StObject.set(x, "startIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndeterminateUndefined: Self = StObject.set(x, "startIndeterminate", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
