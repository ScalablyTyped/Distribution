package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sort extends StObject {
  
  /**
    * Unique identifier of a field.
    */
  var fieldId: FieldId
  
  /**
    * A structured set of sort terms
    */
  var sortOrder: Order
}
object Sort {
  
  inline def apply(fieldId: FieldId, sortOrder: Order): Sort = {
    val __obj = js.Dynamic.literal(fieldId = fieldId.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
  
  extension [Self <: Sort](x: Self) {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: Order): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
