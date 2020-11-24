package typings.antvScale.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  field :string,   values :std.Array<any>,   min :any,   max :any,   minLimit :any | undefined,   maxLimit :any | undefined,   alias :string,   range :std.Array<number>,   base :number,   exponent :number,   nice :boolean,   ticks :std.Array<any>,   tickInterval :number,   minTickInterval :number,   tickCount :number,   maxTickCount :number, formatter (v : any, k : number | undefined): any,   tickMethod :string | @antv/scale.@antv/scale/lib/types.TickMethod,   mask :string | undefined}> */
@js.native
trait ScaleConfig extends js.Object {
  
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
  implicit class ScaleConfigOps[Self <: ScaleConfig] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setExponent(value: Double): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExponent: Self = this.set("exponent", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFormatter(value: (/* v */ js.Any, /* k */ js.UndefOr[Double]) => _): Self = this.set("formatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxLimit(value: js.Any): Self = this.set("maxLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLimit: Self = this.set("maxLimit", js.undefined)
    
    @scala.inline
    def setMaxTickCount(value: Double): Self = this.set("maxTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTickCount: Self = this.set("maxTickCount", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinLimit(value: js.Any): Self = this.set("minLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLimit: Self = this.set("minLimit", js.undefined)
    
    @scala.inline
    def setMinTickInterval(value: Double): Self = this.set("minTickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTickInterval: Self = this.set("minTickInterval", js.undefined)
    
    @scala.inline
    def setNice(value: Boolean): Self = this.set("nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setTickCount(value: Double): Self = this.set("tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickCount: Self = this.set("tickCount", js.undefined)
    
    @scala.inline
    def setTickInterval(value: Double): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
    
    @scala.inline
    def setTickMethodFunction1(value: /* ScaleConfig */ js.Any => js.Array[js.Any]): Self = this.set("tickMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTickMethod(value: String | TickMethod): Self = this.set("tickMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickMethod: Self = this.set("tickMethod", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: js.Any*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[_]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
