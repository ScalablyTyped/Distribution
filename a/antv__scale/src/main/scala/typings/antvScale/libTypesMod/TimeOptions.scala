package typings.antvScale.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOptions extends StObject {
  
  /** 是否需要限制输入的范围在值域内 */
  var clamp: js.UndefOr[Boolean] = js.undefined
  
  /** 定义域，默认为 [0, 1] */
  var domain: js.UndefOr[js.Array[js.Date]] = js.undefined
  
  /** 插值器的工厂函数，返回一个对归一化后的输入在值域指定范围内插值的函数 */
  var interpolate: js.UndefOr[Interpolates] = js.undefined
  
  /** 格式化的形式 */
  var mask: js.UndefOr[String] = js.undefined
  
  /** 是否需要对定义域的范围进行优化 */
  var nice: js.UndefOr[Boolean] = js.undefined
  
  /** 值域，默认为 [0, 1] */
  var range: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /** 是否需要对输出进行四舍五入 */
  var round: js.UndefOr[Boolean] = js.undefined
  
  /** tick 个数，默认值为 5 */
  var tickCount: js.UndefOr[Double] = js.undefined
  
  /** getTick 的时间间隔 */
  var tickInterval: js.UndefOr[Double] = js.undefined
  
  /** 计算 ticks 的算法 */
  var tickMethod: js.UndefOr[TickMethod[js.Date]] = js.undefined
  
  /** 当需要映射的值不合法的时候，返回的值 */
  var unknown: js.UndefOr[Any] = js.undefined
  
  /** 是否是 utc 时间 */
  var utc: js.UndefOr[Boolean] = js.undefined
}
object TimeOptions {
  
  inline def apply(): TimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOptions]
  }
  
  extension [Self <: TimeOptions](x: Self) {
    
    inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    inline def setDomain(value: js.Array[js.Date]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: js.Date*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setInterpolate(value: (Double | String, Double | String) => js.Function1[/* t */ Double, Double | String]): Self = StObject.set(x, "interpolate", js.Any.fromFunction2(value))
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setNice(value: Boolean): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    inline def setRange(value: js.Array[Double | String]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: (Double | String)*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
    
    inline def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    inline def setTickMethod(value: TickMethod[js.Date]): Self = StObject.set(x, "tickMethod", value.asInstanceOf[js.Any])
    
    inline def setTickMethodUndefined: Self = StObject.set(x, "tickMethod", js.undefined)
    
    inline def setUnknown(value: Any): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    
    inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
    
    inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
  }
}
