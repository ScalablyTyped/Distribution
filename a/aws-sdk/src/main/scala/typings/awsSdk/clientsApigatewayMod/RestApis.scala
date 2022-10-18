package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestApis extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfRestApi] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object RestApis {
  
  inline def apply(): RestApis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApis]
  }
  
  extension [Self <: RestApis](x: Self) {
    
    inline def setItems(value: ListOfRestApi): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RestApi*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
