package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeColorInfoProperties extends StObject {
  
  /**
  		 * The color used to render dots representing the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#field) in a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html) or the color used to represent a pie chart slice in a [PieChartRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#color)
  		 */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
  		 * The name of the numeric attribute field represented by the given [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#color).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#field)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * The label used to describe the field or attribute in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#label)
  		 */
  var label: js.UndefOr[String] = js.undefined
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#valueExpression)
  		 */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#valueExpression) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#valueExpressionTitle)
  		 */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
}
object AttributeColorInfoProperties {
  
  inline def apply(): AttributeColorInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeColorInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeColorInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
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
