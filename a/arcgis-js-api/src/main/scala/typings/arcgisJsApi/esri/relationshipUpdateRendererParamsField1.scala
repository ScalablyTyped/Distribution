package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait relationshipUpdateRendererParamsField1 extends StObject {
  
  /**
    * The class breaks for the first field used in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var classBreakInfos: js.Array[ClassBreak]
  
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var field: String
  
  /**
    * The label used to describe the field or variable in the legend.
    *
    * [Read more...](global.html)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a numeric field used to normalize the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
}
object relationshipUpdateRendererParamsField1 {
  
  inline def apply(classBreakInfos: js.Array[ClassBreak], field: String): relationshipUpdateRendererParamsField1 = {
    val __obj = js.Dynamic.literal(classBreakInfos = classBreakInfos.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[relationshipUpdateRendererParamsField1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: relationshipUpdateRendererParamsField1] (val x: Self) extends AnyVal {
    
    inline def setClassBreakInfos(value: js.Array[ClassBreak]): Self = StObject.set(x, "classBreakInfos", value.asInstanceOf[js.Any])
    
    inline def setClassBreakInfosVarargs(value: ClassBreak*): Self = StObject.set(x, "classBreakInfos", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
  }
}
