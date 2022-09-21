package typings.antvScale.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandOptions extends StObject {
  
  /** 对齐，取值为 0 - 1 的整数，例如 0.5 表示居中 */
  var align: js.UndefOr[Double] = js.undefined
  
  /** 比较器，用于对 domain 进行排序 */
  var compare: js.UndefOr[Comparator] = js.undefined
  
  /** 定义域，默认为 [0, 1] */
  var domain: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** 每个条的宽度 (bandWidth) 的比例 */
  var flex: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** 同时定义内部边距和两侧边距，如果该值大于 0，则 paddingInner 和 paddingOuter 无效 */
  var padding: js.UndefOr[Double] = js.undefined
  
  /** 内部边距 */
  var paddingInner: js.UndefOr[Double] = js.undefined
  
  /** 两侧边距 */
  var paddingOuter: js.UndefOr[Double] = js.undefined
  
  /** 值域，默认为 [0, 1] */
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** 是否取整 */
  var round: js.UndefOr[Boolean] = js.undefined
  
  /** 当需要映射的值不合法的时候，返回的值 */
  var unknown: js.UndefOr[Any] = js.undefined
}
object BandOptions {
  
  inline def apply(): BandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandOptions]
  }
  
  extension [Self <: BandOptions](x: Self) {
    
    inline def setAlign(value: Double): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setCompare(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setDomain(value: js.Array[Any]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: Any*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setFlex(value: js.Array[Double]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFlexVarargs(value: Double*): Self = StObject.set(x, "flex", js.Array(value*))
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingInner(value: Double): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
    
    inline def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
    
    inline def setPaddingOuter(value: Double): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
    
    inline def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setUnknown(value: Any): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
