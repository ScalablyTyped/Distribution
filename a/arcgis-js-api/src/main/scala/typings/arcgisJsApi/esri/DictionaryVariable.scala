package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dictionary
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryVariable
  extends StObject
     with Object
     with ProfileVariable {
  
  /**
    * The name of the profile variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#DictionaryVariable)
    */
  var name: String
  
  /**
    * The type definitions of the dictionary's properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#DictionaryVariable)
    */
  var properties: js.Array[ProfileVariable]
  
  /**
    * The Arcade data type of the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#DictionaryVariable)
    */
  var `type`: dictionary
}
object DictionaryVariable {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    properties: js.Array[ProfileVariable],
    propertyIsEnumerable: PropertyKey => Boolean
  ): DictionaryVariable = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("dictionary")
    __obj.asInstanceOf[DictionaryVariable]
  }
  
  extension [Self <: DictionaryVariable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[ProfileVariable]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: ProfileVariable*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: dictionary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
