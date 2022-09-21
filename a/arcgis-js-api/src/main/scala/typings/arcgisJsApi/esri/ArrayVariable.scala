package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.array
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayVariable
  extends StObject
     with Object
     with ProfileVariable {
  
  /**
    * The type definition of the Array's items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArrayVariable)
    */
  var elementType: ProfileVariable
  
  /**
    * The name of the profile variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArrayVariable)
    */
  var name: String
  
  /**
    * The Arcade data type of the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArrayVariable)
    */
  var `type`: array
}
object ArrayVariable {
  
  inline def apply(
    constructor: js.Function,
    elementType: ProfileVariable,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ArrayVariable = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[ArrayVariable]
  }
  
  extension [Self <: ArrayVariable](x: Self) {
    
    inline def setElementType(value: ProfileVariable): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
