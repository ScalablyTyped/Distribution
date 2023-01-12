package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsagePlanKeys extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfUsagePlanKey] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object UsagePlanKeys {
  
  inline def apply(): UsagePlanKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsagePlanKeys] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ListOfUsagePlanKey): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: UsagePlanKey*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
