package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProgressCircularConfig extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var durationIndeterminate: js.UndefOr[Double] = js.undefined
  
  var easeFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.undefined
  
  var easeFnIndeterminate: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.undefined
  
  var endIndeterminate: js.UndefOr[Double] = js.undefined
  
  var progressSize: js.UndefOr[Double] = js.undefined
  
  var startIndeterminate: js.UndefOr[Double] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object IProgressCircularConfig {
  
  inline def apply(): IProgressCircularConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressCircularConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProgressCircularConfig] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationIndeterminate(value: Double): Self = StObject.set(x, "durationIndeterminate", value.asInstanceOf[js.Any])
    
    inline def setDurationIndeterminateUndefined: Self = StObject.set(x, "durationIndeterminate", js.undefined)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEaseFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = StObject.set(x, "easeFn", js.Any.fromFunction4(value))
    
    inline def setEaseFnIndeterminate(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = StObject.set(x, "easeFnIndeterminate", js.Any.fromFunction4(value))
    
    inline def setEaseFnIndeterminateUndefined: Self = StObject.set(x, "easeFnIndeterminate", js.undefined)
    
    inline def setEaseFnUndefined: Self = StObject.set(x, "easeFn", js.undefined)
    
    inline def setEndIndeterminate(value: Double): Self = StObject.set(x, "endIndeterminate", value.asInstanceOf[js.Any])
    
    inline def setEndIndeterminateUndefined: Self = StObject.set(x, "endIndeterminate", js.undefined)
    
    inline def setProgressSize(value: Double): Self = StObject.set(x, "progressSize", value.asInstanceOf[js.Any])
    
    inline def setProgressSizeUndefined: Self = StObject.set(x, "progressSize", js.undefined)
    
    inline def setStartIndeterminate(value: Double): Self = StObject.set(x, "startIndeterminate", value.asInstanceOf[js.Any])
    
    inline def setStartIndeterminateUndefined: Self = StObject.set(x, "startIndeterminate", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
