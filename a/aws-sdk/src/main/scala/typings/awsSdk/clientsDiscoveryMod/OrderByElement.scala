package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderByElement extends StObject {
  
  /**
    * The field on which to order.
    */
  var fieldName: OrderByElementFieldName
  
  /**
    * Ordering direction.
    */
  var sortOrder: js.UndefOr[orderString] = js.undefined
}
object OrderByElement {
  
  inline def apply(fieldName: OrderByElementFieldName): OrderByElement = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderByElement]
  }
  
  extension [Self <: OrderByElement](x: Self) {
    
    inline def setFieldName(value: OrderByElementFieldName): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: orderString): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
