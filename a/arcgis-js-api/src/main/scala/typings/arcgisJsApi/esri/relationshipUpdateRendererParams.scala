package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait relationshipUpdateRendererParams extends StObject {
  
  /**
  		 * The array of colors to be used by the symbols in the uniqueValueInfos of the renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
  		 */
  var colors: js.Array[Color_]
  
  /**
  		 * A numeric field used to explore its relationship with `field2`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
  		 */
  var field1: relationshipUpdateRendererParamsField1
  
  /**
  		 * A numeric field used to explore its relationship with `field1`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
  		 */
  var field2: relationshipUpdateRendererParamsField2
  
  /**
  		 * Determines the orientation of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
  		 */
  var focus: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates the number of classes by which to break up the values of each field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
  		 */
  var numClasses: Double
  
  /**
  		 * The relationship renderer (generated from [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)) to update with the other parameters provided in this method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
  		 */
  var renderer: UniqueValueRenderer
}
object relationshipUpdateRendererParams {
  
  inline def apply(
    colors: js.Array[Color_],
    field1: relationshipUpdateRendererParamsField1,
    field2: relationshipUpdateRendererParamsField2,
    numClasses: Double,
    renderer: UniqueValueRenderer
  ): relationshipUpdateRendererParams = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], field1 = field1.asInstanceOf[js.Any], field2 = field2.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[relationshipUpdateRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: relationshipUpdateRendererParams] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setField1(value: relationshipUpdateRendererParamsField1): Self = StObject.set(x, "field1", value.asInstanceOf[js.Any])
    
    inline def setField2(value: relationshipUpdateRendererParamsField2): Self = StObject.set(x, "field2", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: UniqueValueRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
