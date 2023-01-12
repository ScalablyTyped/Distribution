package typings.antvScale.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearOptions extends StObject {
  
  /** 是否需要限制输入的范围在值域内 */
  var clamp: js.UndefOr[Boolean] = js.undefined
  
  /** 定义域，默认为 [0, 1] */
  var domain: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** 插值器的工厂函数，返回一个对归一化后的输入在值域指定范围内插值的函数 */
  var interpolate: js.UndefOr[Interpolates] = js.undefined
  
  /** 是否需要对定义域的范围进行优化 */
  var nice: js.UndefOr[Boolean] = js.undefined
  
  /** 值域，默认为 [0, 1] */
  var range: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /** 是否需要对输出进行四舍五入 */
  var round: js.UndefOr[Boolean] = js.undefined
  
  /** tick 个数，默认值为 5 */
  var tickCount: js.UndefOr[Double] = js.undefined
  
  /** 计算 ticks 的算法 */
  var tickMethod: js.UndefOr[TickMethod[Double]] = js.undefined
  
  /** 当需要映射的值不合法的时候，返回的值 */
  var unknown: js.UndefOr[Any] = js.undefined
}
object LinearOptions {
  
  inline def apply(): LinearOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinearOptions] (val x: Self) extends AnyVal {
    
    inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    inline def setDomain(value: js.Array[Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: Double*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setInterpolate(value: (Double | String, Double | String) => js.Function1[/* t */ Double, Double | String]): Self = StObject.set(x, "interpolate", js.Any.fromFunction2(value))
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
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
