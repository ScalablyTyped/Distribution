package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Inlined std.Partial<{  field :string,   values :std.Array<any>,   min :any,   max :any,   minLimit :any | undefined,   maxLimit :any | undefined,   alias :string,   range :std.Array<number>,   base :number,   exponent :number,   nice :boolean,   ticks :std.Array<any>,   tickInterval :number,   minTickInterval :number,   tickCount :number,   maxTickCount :number, formatter (v : any, k : number | undefined): any,   tickMethod :string | @antv/scale.@antv/scale/lib/types.TickMethod,   mask :string | undefined}> */
  @js.native
  trait ScaleConfig extends StObject {
    
    var alias: js.UndefOr[String] = js.native
    
    var base: js.UndefOr[Double] = js.native
    
    var exponent: js.UndefOr[Double] = js.native
    
    var field: js.UndefOr[String] = js.native
    
    var formatter: js.UndefOr[js.Function2[/* v */ js.Any, /* k */ js.UndefOr[Double], _]] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var max: js.UndefOr[js.Any] = js.native
    
    var maxLimit: js.UndefOr[js.Any] = js.native
    
    var maxTickCount: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[js.Any] = js.native
    
    var minLimit: js.UndefOr[js.Any] = js.native
    
    var minTickInterval: js.UndefOr[Double] = js.native
    
    var nice: js.UndefOr[Boolean] = js.native
    
    var range: js.UndefOr[js.Array[Double]] = js.native
    
    var tickCount: js.UndefOr[Double] = js.native
    
    var tickInterval: js.UndefOr[Double] = js.native
    
    var tickMethod: js.UndefOr[String | TickMethod] = js.native
    
    var ticks: js.UndefOr[js.Array[_]] = js.native
    
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object ScaleConfig {
    
    @scala.inline
    def apply(): ScaleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleConfig]
    }
    
    @scala.inline
    implicit class ScaleConfigMutableBuilder[Self <: ScaleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFormatter(value: (/* v */ js.Any, /* k */ js.UndefOr[Double]) => _): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLimit(value: js.Any): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
      
      @scala.inline
      def setMaxTickCount(value: Double): Self = StObject.set(x, "maxTickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTickCountUndefined: Self = StObject.set(x, "maxTickCount", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLimit(value: js.Any): Self = StObject.set(x, "minLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLimitUndefined: Self = StObject.set(x, "minLimit", js.undefined)
      
      @scala.inline
      def setMinTickInterval(value: Double): Self = StObject.set(x, "minTickInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTickIntervalUndefined: Self = StObject.set(x, "minTickInterval", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setNice(value: Boolean): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      @scala.inline
      def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
      
      @scala.inline
      def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
      
      @scala.inline
      def setTickMethod(value: String | TickMethod): Self = StObject.set(x, "tickMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickMethodFunction1(value: /* ScaleConfig */ js.Any => js.Array[js.Any]): Self = StObject.set(x, "tickMethod", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTickMethodUndefined: Self = StObject.set(x, "tickMethod", js.undefined)
      
      @scala.inline
      def setTicks(value: js.Array[_]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
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
    
    @scala.inline
    def base: typings.antvScale.antvScaleStrings.base = "base".asInstanceOf[typings.antvScale.antvScaleStrings.base]
    
    @scala.inline
    def cat: typings.antvScale.antvScaleStrings.cat = "cat".asInstanceOf[typings.antvScale.antvScaleStrings.cat]
    
    @scala.inline
    def identity: typings.antvScale.antvScaleStrings.identity = "identity".asInstanceOf[typings.antvScale.antvScaleStrings.identity]
    
    @scala.inline
    def linear: typings.antvScale.antvScaleStrings.linear = "linear".asInstanceOf[typings.antvScale.antvScaleStrings.linear]
    
    @scala.inline
    def log: typings.antvScale.antvScaleStrings.log = "log".asInstanceOf[typings.antvScale.antvScaleStrings.log]
    
    @scala.inline
    def pow: typings.antvScale.antvScaleStrings.pow = "pow".asInstanceOf[typings.antvScale.antvScaleStrings.pow]
    
    @scala.inline
    def time: typings.antvScale.antvScaleStrings.time = "time".asInstanceOf[typings.antvScale.antvScaleStrings.time]
    
    @scala.inline
    def timeCat: typings.antvScale.antvScaleStrings.timeCat = "timeCat".asInstanceOf[typings.antvScale.antvScaleStrings.timeCat]
  }
  
  @js.native
  trait Tick extends StObject {
    
    /** 展示名 */
    var text: String = js.native
    
    /** 定义域值 */
    var tickValue: String | Double = js.native
    
    /** 值域值 */
    var value: Double = js.native
  }
  object Tick {
    
    @scala.inline
    def apply(text: String, tickValue: String | Double, value: Double): Tick = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], tickValue = tickValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tick]
    }
    
    @scala.inline
    implicit class TickMutableBuilder[Self <: Tick] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickValue(value: String | Double): Self = StObject.set(x, "tickValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TickMethod = js.Function1[/* ScaleConfig */ js.Any, js.Array[js.Any]]
}
