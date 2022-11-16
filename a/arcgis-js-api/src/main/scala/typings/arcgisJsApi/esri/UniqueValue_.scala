package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueValue_
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Defines a value (possibly in combination with [value2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value2) and [value3](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value3)) returned from the field referenced in [UniqueValueRenderer.field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) or returned from an Arcade expression defined in [UniqueValueRenderer.valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) to be categorized in a [UniqueValueClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value)
    */
  var value: String | Double = js.native
  
  /**
    * Defines a value returned from the field referenced in [UniqueValueRenderer.field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2) to be categorized in combination with [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value) (and possibly [value3](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value3)) in a [UniqueValueClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value2)
    */
  var value2: String | Double = js.native
  
  /**
    * Defines a value returned from the field referenced in [UniqueValueRenderer.field3](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field3) to be categorized in combination with [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value) and [value2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value2) in a [UniqueValueClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html#value3)
    */
  var value3: String | Double = js.native
}
