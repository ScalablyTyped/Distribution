package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dotDensityCreateRendererParamsAttributes extends StObject {
  
  /**
  		 * The name of a numeric field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * The label describing the field name (or category) in the legend.
  		 *
  		 * [Read more...](global.html)
  		 */
  var label: js.UndefOr[String] = js.undefined
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
  		 */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * Text describing the value returned from the `valueExpression`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
  		 */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
}
object dotDensityCreateRendererParamsAttributes {
  
  inline def apply(): dotDensityCreateRendererParamsAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dotDensityCreateRendererParamsAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dotDensityCreateRendererParamsAttributes] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
  }
}
