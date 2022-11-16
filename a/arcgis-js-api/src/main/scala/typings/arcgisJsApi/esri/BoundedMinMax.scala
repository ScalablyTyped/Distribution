package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundedMinMax extends StObject {
  
  /**
    * See [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * See [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var maxDataValue: Double
  
  /**
    * The size used to render a feature containing the maximum data value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var maxSize: String | Double
  
  /**
    * See [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var minDataValue: Double
  
  /**
    * The size used to render a feature containing the minimum data value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var minSize: String | Double
  
  /**
    * See [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
    * Value must be `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var `type`: String
  
  /**
    * See [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
    * See [valueExpressionTitle](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpressionTitle).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
}
object BoundedMinMax {
  
  inline def apply(
    maxDataValue: Double,
    maxSize: String | Double,
    minDataValue: Double,
    minSize: String | Double,
    `type`: String
  ): BoundedMinMax = {
    val __obj = js.Dynamic.literal(maxDataValue = maxDataValue.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minDataValue = minDataValue.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundedMinMax]
  }
  
  extension [Self <: BoundedMinMax](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMaxDataValue(value: Double): Self = StObject.set(x, "maxDataValue", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: String | Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMinDataValue(value: Double): Self = StObject.set(x, "minDataValue", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: String | Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
  }
}
