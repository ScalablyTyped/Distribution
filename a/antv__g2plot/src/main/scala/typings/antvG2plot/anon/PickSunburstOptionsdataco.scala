package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/plots/sunburst/types.SunburstOptions, 'data' | 'colorField' | 'rawFields' | 'hierarchyConfig'> */
trait PickSunburstOptionsdataco extends StObject {
  
  var colorField: js.UndefOr[String] = js.undefined
  
  var data: Any
  
  var hierarchyConfig: js.UndefOr[OmitHierarchyOptionastype] = js.undefined
  
  var rawFields: js.UndefOr[js.Array[String]] = js.undefined
}
object PickSunburstOptionsdataco {
  
  inline def apply(data: Any): PickSunburstOptionsdataco = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSunburstOptionsdataco]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickSunburstOptionsdataco] (val x: Self) extends AnyVal {
    
    inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
    
    inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHierarchyConfig(value: OmitHierarchyOptionastype): Self = StObject.set(x, "hierarchyConfig", value.asInstanceOf[js.Any])
    
    inline def setHierarchyConfigUndefined: Self = StObject.set(x, "hierarchyConfig", js.undefined)
    
    inline def setRawFields(value: js.Array[String]): Self = StObject.set(x, "rawFields", value.asInstanceOf[js.Any])
    
    inline def setRawFieldsUndefined: Self = StObject.set(x, "rawFields", js.undefined)
    
    inline def setRawFieldsVarargs(value: String*): Self = StObject.set(x, "rawFields", js.Array(value*))
  }
}
