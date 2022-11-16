package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.array
import typings.arcgisJsApi.arcgisJsApiStrings.boolean
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.dictionary
import typings.arcgisJsApi.arcgisJsApiStrings.feature
import typings.arcgisJsApi.arcgisJsApiStrings.featureSet
import typings.arcgisJsApi.arcgisJsApiStrings.featureSetCollection
import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayElementType extends StObject {
  
  /**
    * Only applicable when `type` is `array`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArrayElementType)
    */
  var elementType: js.UndefOr[ArrayElementType] = js.undefined
  
  /**
    * Only applicable when `type` is `dictionary`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArrayElementType)
    */
  var properties: js.UndefOr[js.Array[ProfileVariable]] = js.undefined
  
  /**
    * The Arcade data type of the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArrayElementType)
    */
  var `type`: array | dictionary | feature | featureSet | featureSetCollection | typings.arcgisJsApi.arcgisJsApiStrings.geometry | number | text | date | boolean
}
object ArrayElementType {
  
  inline def apply(
    `type`: array | dictionary | feature | featureSet | featureSetCollection | typings.arcgisJsApi.arcgisJsApiStrings.geometry | number | text | date | boolean
  ): ArrayElementType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayElementType]
  }
  
  extension [Self <: ArrayElementType](x: Self) {
    
    inline def setElementType(value: ArrayElementType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    inline def setProperties(value: js.Array[ProfileVariable]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: ProfileVariable*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(
      value: array | dictionary | feature | featureSet | featureSetCollection | typings.arcgisJsApi.arcgisJsApiStrings.geometry | number | text | date | boolean
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
