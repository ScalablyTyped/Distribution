package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainNames extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfDomainName] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object DomainNames {
  
  inline def apply(): DomainNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainNames]
  }
  
  extension [Self <: DomainNames](x: Self) {
    
    inline def setItems(value: ListOfDomainName): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DomainName*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
