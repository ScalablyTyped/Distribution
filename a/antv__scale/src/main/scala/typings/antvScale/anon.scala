package typings.antvScale

import typings.antvScale.libTypesMod.Interpolate
import typings.antvScale.libTypesMod.Interpolates
import typings.antvScale.libTypesMod.Interpolator
import typings.antvScale.libTypesMod.TickMethod
import typings.antvScale.libUtilsTimeIntervalMod.TimeTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align extends StObject {
    
    var align: Double
    
    var domain: js.Array[Any]
    
    var padding: Double
    
    var paddingInner: Double
    
    var paddingOuter: Double
    
    var range: js.Array[Double]
    
    var round: Boolean
    
    var unknown: js.Symbol
  }
  object Align {
    
    inline def apply(
      align: Double,
      domain: js.Array[Any],
      padding: Double,
      paddingInner: Double,
      paddingOuter: Double,
      range: js.Array[Double],
      round: Boolean,
      unknown: js.Symbol
    ): Align = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], paddingInner = paddingInner.asInstanceOf[js.Any], paddingOuter = paddingOuter.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    extension [Self <: Align](x: Self) {
      
      inline def setAlign(value: Double): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: js.Array[Any]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainVarargs(value: Any*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingInner(value: Double): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
      
      inline def setPaddingOuter(value: Double): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setUnknown(value: js.Symbol): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ceil extends StObject {
    
    def ceil(d: js.Date, rest: Any*): js.Date = js.native
    @JSName("ceil")
    var ceil_Original: TimeTransform = js.native
    
    var duration: Double = js.native
    
    def floor(d: js.Date, rest: Any*): js.Date = js.native
    @JSName("floor")
    var floor_Original: TimeTransform = js.native
    
    def range(start: js.Date, stop: js.Date, step: Double): js.Array[Any] = js.native
    def range(start: js.Date, stop: js.Date, step: Double, shouldAdjust: Boolean): js.Array[Any] = js.native
  }
  
  trait Clamp extends StObject {
    
    var clamp: Boolean
    
    var domain: js.Array[Double]
    
    var exponent: Double
    
    def interpolate(a: String, b: String): js.Function1[/* t */ Double, String | Double]
    def interpolate(a: String, b: Double): js.Function1[/* t */ Double, String | Double]
    def interpolate(a: Double, b: String): js.Function1[/* t */ Double, String | Double]
    def interpolate(a: Double, b: Double): js.Function1[/* t */ Double, String | Double]
    @JSName("interpolate")
    var interpolate_Original: Interpolate[String | Double]
    
    var nice: Boolean
    
    var range: js.Array[Double]
    
    var round: Boolean
    
    var tickCount: Double
    
    def tickMethod(min: Double, max: Double, n: Double, rest: Any*): js.Array[Double]
    def tickMethod(min: Double, max: Double, n: Unit, rest: Any*): js.Array[Double]
    @JSName("tickMethod")
    var tickMethod_Original: TickMethod[Double]
  }
  object Clamp {
    
    inline def apply(
      clamp: Boolean,
      domain: js.Array[Double],
      exponent: Double,
      interpolate: (String | Double, String | Double) => js.Function1[/* t */ Double, String | Double],
      nice: Boolean,
      range: js.Array[Double],
      round: Boolean,
      tickCount: Double,
      tickMethod: TickMethod[Double]
    ): Clamp = {
      val __obj = js.Dynamic.literal(clamp = clamp.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], interpolate = js.Any.fromFunction2(interpolate), nice = nice.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], tickMethod = tickMethod.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clamp]
    }
    
    extension [Self <: Clamp](x: Self) {
      
      inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: js.Array[Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainVarargs(value: Double*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setInterpolate(value: (String | Double, String | Double) => js.Function1[/* t */ Double, String | Double]): Self = StObject.set(x, "interpolate", js.Any.fromFunction2(value))
      
      inline def setNice(value: Boolean): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      inline def setTickMethod(value: TickMethod[Double]): Self = StObject.set(x, "tickMethod", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@antv/scale.@antv/scale/lib/types.DivergingOptions> */
  trait PartialDivergingOptions extends StObject {
    
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
  object PartialDivergingOptions {
    
    inline def apply(): PartialDivergingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDivergingOptions]
    }
    
    extension [Self <: PartialDivergingOptions](x: Self) {
      
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
  
  /* Inlined std.Partial<@antv/scale.@antv/scale/lib/types.SequentialOptions> */
  trait PartialSequentialOptions extends StObject {
    
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
  object PartialSequentialOptions {
    
    inline def apply(): PartialSequentialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSequentialOptions]
    }
    
    extension [Self <: PartialSequentialOptions](x: Self) {
      
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
}
