package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var endValue: js.UndefOr[Double] = js.undefined
  
  var startValue: js.UndefOr[Double] = js.undefined
  
  var when: js.UndefOr[String] = js.undefined
}
object EffectOptions {
  
  inline def apply(): EffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectOptions]
  }
  
  extension [Self <: EffectOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
