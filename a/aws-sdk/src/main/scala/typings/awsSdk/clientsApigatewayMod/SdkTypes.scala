package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkTypes extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfSdkType] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object SdkTypes {
  
  inline def apply(): SdkTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkTypes]
  }
  
  extension [Self <: SdkTypes](x: Self) {
    
    inline def setItems(value: ListOfSdkType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SdkType*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
