package typings.antvScale.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThresholdOptions extends StObject {
  
  /** 定义域，默认为 [0, 1] */
  var domain: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** 值域，默认为 [0, 1] */
  var range: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** 当需要映射的值不合法的时候，返回的值 */
  var unknown: js.UndefOr[Any] = js.undefined
}
object ThresholdOptions {
  
  inline def apply(): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdOptions]
  }
  
  extension [Self <: ThresholdOptions](x: Self) {
    
    inline def setDomain(value: js.Array[Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: Double*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setRange(value: js.Array[Any]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Any*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setUnknown(value: Any): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
