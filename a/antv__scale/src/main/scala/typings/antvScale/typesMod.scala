package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Inlined std.Partial<{  field :string,   values :std.Array<any>,   min :any,   max :any,   minLimit :any | undefined,   maxLimit :any | undefined,   alias :string,   range :std.Array<number>,   base :number,   exponent :number,   nice :boolean,   ticks :std.Array<any>,   tickInterval :number,   minTickInterval :number,   tickCount :number,   maxTickCount :number, formatter (v : any, k : number | undefined): any,   tickMethod :string | @antv/scale.@antv/scale/lib/types.TickMethod,   mask :string | undefined}> */
  trait ScaleConfig extends StObject {
    
    var alias: js.UndefOr[String] = js.undefined
    
    var base: js.UndefOr[Double] = js.undefined
    
    var exponent: js.UndefOr[Double] = js.undefined
    
    var field: js.UndefOr[String] = js.undefined
    
    var formatter: js.UndefOr[js.Function2[/* v */ js.Any, /* k */ js.UndefOr[Double], js.Any]] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[js.Any] = js.undefined
    
    var maxLimit: js.UndefOr[js.Any] = js.undefined
    
    var maxTickCount: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[js.Any] = js.undefined
    
    var minLimit: js.UndefOr[js.Any] = js.undefined
    
    var minTickInterval: js.UndefOr[Double] = js.undefined
    
    var nice: js.UndefOr[Boolean] = js.undefined
    
    var range: js.UndefOr[js.Array[Double]] = js.undefined
    
    var tickCount: js.UndefOr[Double] = js.undefined
    
    var tickInterval: js.UndefOr[Double] = js.undefined
    
    var tickMethod: js.UndefOr[String | TickMethod] = js.undefined
    
    var ticks: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object ScaleConfig {
    
    inline def apply(): ScaleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleConfig]
    }
    
    extension [Self <: ScaleConfig](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFormatter(value: (/* v */ js.Any, /* k */ js.UndefOr[Double]) => js.Any): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLimit(value: js.Any): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
      
      inline def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
      
      inline def setMaxTickCount(value: Double): Self = StObject.set(x, "maxTickCount", value.asInstanceOf[js.Any])
      
      inline def setMaxTickCountUndefined: Self = StObject.set(x, "maxTickCount", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLimit(value: js.Any): Self = StObject.set(x, "minLimit", value.asInstanceOf[js.Any])
      
      inline def setMinLimitUndefined: Self = StObject.set(x, "minLimit", js.undefined)
      
      inline def setMinTickInterval(value: Double): Self = StObject.set(x, "minTickInterval", value.asInstanceOf[js.Any])
      
      inline def setMinTickIntervalUndefined: Self = StObject.set(x, "minTickInterval", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setNice(value: Boolean): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
      
      inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      inline def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
      
      inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
      
      inline def setTickMethod(value: String | TickMethod): Self = StObject.set(x, "tickMethod", value.asInstanceOf[js.Any])
      
      inline def setTickMethodFunction1(value: /* ScaleConfig */ js.Any => js.Array[js.Any]): Self = StObject.set(x, "tickMethod", js.Any.fromFunction1(value))
      
      inline def setTickMethodUndefined: Self = StObject.set(x, "tickMethod", js.undefined)
      
      inline def setTicks(value: js.Array[js.Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
      
      inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvScale.antvScaleStrings.base
    - typings.antvScale.antvScaleStrings.linear
    - typings.antvScale.antvScaleStrings.cat
    - typings.antvScale.antvScaleStrings.log
    - typings.antvScale.antvScaleStrings.pow
    - typings.antvScale.antvScaleStrings.identity
    - typings.antvScale.antvScaleStrings.time
    - typings.antvScale.antvScaleStrings.timeCat
  */
  trait ScaleType extends StObject
  object ScaleType {
    
    inline def base: typings.antvScale.antvScaleStrings.base = "base".asInstanceOf[typings.antvScale.antvScaleStrings.base]
    
    inline def cat: typings.antvScale.antvScaleStrings.cat = "cat".asInstanceOf[typings.antvScale.antvScaleStrings.cat]
    
    inline def identity: typings.antvScale.antvScaleStrings.identity = "identity".asInstanceOf[typings.antvScale.antvScaleStrings.identity]
    
    inline def linear: typings.antvScale.antvScaleStrings.linear = "linear".asInstanceOf[typings.antvScale.antvScaleStrings.linear]
    
    inline def log: typings.antvScale.antvScaleStrings.log = "log".asInstanceOf[typings.antvScale.antvScaleStrings.log]
    
    inline def pow: typings.antvScale.antvScaleStrings.pow = "pow".asInstanceOf[typings.antvScale.antvScaleStrings.pow]
    
    inline def time: typings.antvScale.antvScaleStrings.time = "time".asInstanceOf[typings.antvScale.antvScaleStrings.time]
    
    inline def timeCat: typings.antvScale.antvScaleStrings.timeCat = "timeCat".asInstanceOf[typings.antvScale.antvScaleStrings.timeCat]
  }
  
  trait Tick extends StObject {
    
    /** 展示名 */
    var text: String
    
    /** 定义域值 */
    var tickValue: String | Double
    
    /** 值域值 */
    var value: Double
  }
  object Tick {
    
    inline def apply(text: String, tickValue: String | Double, value: Double): Tick = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], tickValue = tickValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tick]
    }
    
    extension [Self <: Tick](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTickValue(value: String | Double): Self = StObject.set(x, "tickValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TickMethod = js.Function1[/* ScaleConfig */ js.Any, js.Array[js.Any]]
}
