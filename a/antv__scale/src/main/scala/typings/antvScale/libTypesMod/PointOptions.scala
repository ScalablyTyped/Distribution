package typings.antvScale.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@antv/scale.@antv/scale/lib/types.BandOptions, 'paddingInner' | 'paddingOuter'> */
trait PointOptions extends StObject {
  
  var align: js.UndefOr[Double] = js.undefined
  
  var compare: js.UndefOr[Comparator] = js.undefined
  
  var domain: js.UndefOr[js.Array[Any]] = js.undefined
  
  var flex: js.UndefOr[js.Array[Double]] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  
  var round: js.UndefOr[Boolean] = js.undefined
  
  var unknown: js.UndefOr[Any] = js.undefined
}
object PointOptions {
  
  inline def apply(): PointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointOptions] (val x: Self) extends AnyVal {
    
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
