package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@antv/g2.@antv/g2/lib/dependents.TrendCfg, 'data'> & {  data :std.Array<number> | undefined} */
trait OmitTrendCfgdatadataArray extends StObject {
  
  var areaStyle: js.UndefOr[js.Object] = js.undefined
  
  var backgroundStyle: js.UndefOr[js.Object] = js.undefined
  
  var data: js.UndefOr[js.Array[Double]] = js.undefined
  
  var isArea: js.UndefOr[Boolean] = js.undefined
  
  var lineStyle: js.UndefOr[js.Object] = js.undefined
  
  var smooth: js.UndefOr[Boolean] = js.undefined
}
object OmitTrendCfgdatadataArray {
  
  inline def apply(): OmitTrendCfgdatadataArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitTrendCfgdatadataArray]
  }
  
  extension [Self <: OmitTrendCfgdatadataArray](x: Self) {
    
    inline def setAreaStyle(value: js.Object): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
    
    inline def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
    
    inline def setBackgroundStyle(value: js.Object): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
    
    inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIsArea(value: Boolean): Self = StObject.set(x, "isArea", value.asInstanceOf[js.Any])
    
    inline def setIsAreaUndefined: Self = StObject.set(x, "isArea", js.undefined)
    
    inline def setLineStyle(value: js.Object): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
  }
}
