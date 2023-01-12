package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueValueProperties extends StObject {
  
  /**
    * Defines a value (possibly in combination with [value2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value2) and [value3](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value3)) returned from the field referenced in [UniqueValueRenderer.field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) or returned from an Arcade expression defined in [UniqueValueRenderer.valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) to be categorized in a [UniqueValueClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value)
    */
  var value: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Defines a value returned from the field referenced in [UniqueValueRenderer.field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2) to be categorized in combination with [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value) (and possibly [value3](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value3)) in a [UniqueValueClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value2)
    */
  var value2: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Defines a value returned from the field referenced in [UniqueValueRenderer.field3](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field3) to be categorized in combination with [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value) and [value2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value2) in a [UniqueValueClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value3)
    */
  var value3: js.UndefOr[String | Double] = js.undefined
}
object UniqueValueProperties {
  
  inline def apply(): UniqueValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueValueProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniqueValueProperties] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValue2(value: String | Double): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
    
    inline def setValue2Undefined: Self = StObject.set(x, "value2", js.undefined)
    
    inline def setValue3(value: String | Double): Self = StObject.set(x, "value3", value.asInstanceOf[js.Any])
    
    inline def setValue3Undefined: Self = StObject.set(x, "value3", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
