package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestValidators extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfRequestValidator] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object RequestValidators {
  
  inline def apply(): RequestValidators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestValidators]
  }
  
  extension [Self <: RequestValidators](x: Self) {
    
    inline def setItems(value: ListOfRequestValidator): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RequestValidator*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
