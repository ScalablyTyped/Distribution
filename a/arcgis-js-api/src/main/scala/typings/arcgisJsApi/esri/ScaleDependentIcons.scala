package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleDependentIcons extends StObject {
  
  /**
  		 * See [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * See [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
  		 */
  var maxDataValue: Double
  
  /**
  		 * An object defining the size of features whose data value (defined in `field` or `valueExpression`) is greater than or equal to the `maxDataValue` for the given view scale.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
  		 */
  var maxSize: ScaleDependentStops
  
  /**
  		 * See [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
  		 */
  var minDataValue: Double
  
  /**
  		 * An object defining the size of features whose data value (defined in `field` or `valueExpression`) is less than or equal to the `minDataValue` for the given view scale.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
  		 */
  var minSize: ScaleDependentStops
  
  /**
  		 * See [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
  		 */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
  		 * Value must be `size`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
  		 */
  var `type`: String
  
  /**
  		 * See [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
  		 */
  var valueExpression: js.UndefOr[String] = js.undefined
}
object ScaleDependentIcons {
  
  inline def apply(
    maxDataValue: Double,
    maxSize: ScaleDependentStops,
    minDataValue: Double,
    minSize: ScaleDependentStops,
    `type`: String
  ): ScaleDependentIcons = {
    val __obj = js.Dynamic.literal(maxDataValue = maxDataValue.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minDataValue = minDataValue.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleDependentIcons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleDependentIcons] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMaxDataValue(value: Double): Self = StObject.set(x, "maxDataValue", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: ScaleDependentStops): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMinDataValue(value: Double): Self = StObject.set(x, "minDataValue", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: ScaleDependentStops): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
  }
}
