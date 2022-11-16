package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayVariable
  extends StObject
     with ProfileVariable {
  
  /**
    * The type definition of the Array's items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArrayVariable)
    */
  var elementType: js.UndefOr[ArrayElementType] = js.undefined
  
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
  
  inline def apply(name: String): ArrayVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[ArrayVariable]
  }
  
  extension [Self <: ArrayVariable](x: Self) {
    
    inline def setElementType(value: ArrayElementType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
