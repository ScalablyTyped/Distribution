package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Models extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfModel] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object Models {
  
  inline def apply(): Models = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Models]
  }
  
  extension [Self <: Models](x: Self) {
    
    inline def setItems(value: ListOfModel): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Model*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
