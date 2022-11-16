package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryVariable
  extends StObject
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
  var properties: js.UndefOr[js.Array[ProfileVariable]] = js.undefined
  
  /**
    * The Arcade data type of the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#DictionaryVariable)
    */
  var `type`: dictionary
}
object DictionaryVariable {
  
  inline def apply(name: String): DictionaryVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dictionary")
    __obj.asInstanceOf[DictionaryVariable]
  }
  
  extension [Self <: DictionaryVariable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[ProfileVariable]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: ProfileVariable*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: dictionary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
