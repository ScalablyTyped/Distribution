package typings.antvScale.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@antv/scale.@antv/scale/lib/types.LinearOptions, 'Interpolates'> & {  interpolator :@antv/scale.@antv/scale/lib/types.Interpolator | undefined} */
trait DivergingOptions extends StObject {
  
  var clamp: js.UndefOr[Boolean] = js.undefined
  
  var domain: js.UndefOr[js.Array[Double]] = js.undefined
  
  var interpolate: js.UndefOr[Interpolates] = js.undefined
  
  var interpolator: js.UndefOr[Interpolator] = js.undefined
  
  var nice: js.UndefOr[Boolean] = js.undefined
  
  var range: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  var round: js.UndefOr[Boolean] = js.undefined
  
  var tickCount: js.UndefOr[Double] = js.undefined
  
  var tickMethod: js.UndefOr[TickMethod[Double]] = js.undefined
  
  var unknown: js.UndefOr[Any] = js.undefined
}
object DivergingOptions {
  
  inline def apply(): DivergingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivergingOptions]
  }
  
  extension [Self <: DivergingOptions](x: Self) {
    
    inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    inline def setDomain(value: js.Array[Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: Double*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setInterpolate(value: (Double | String, Double | String) => js.Function1[/* t */ Double, Double | String]): Self = StObject.set(x, "interpolate", js.Any.fromFunction2(value))
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setInterpolator(value: /* t */ Double => Any): Self = StObject.set(x, "interpolator", js.Any.fromFunction1(value))
    
    inline def setInterpolatorUndefined: Self = StObject.set(x, "interpolator", js.undefined)
    
    inline def setNice(value: Boolean): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    inline def setRange(value: js.Array[Double | String]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: (Double | String)*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
    
    inline def setTickMethod(value: TickMethod[Double]): Self = StObject.set(x, "tickMethod", value.asInstanceOf[js.Any])
    
    inline def setTickMethodUndefined: Self = StObject.set(x, "tickMethod", js.undefined)
    
    inline def setUnknown(value: Any): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
