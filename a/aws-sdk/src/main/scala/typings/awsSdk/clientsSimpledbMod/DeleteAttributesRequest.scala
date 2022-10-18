package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAttributesRequest extends StObject {
  
  /**
    * A list of Attributes. Similar to columns on a spreadsheet, attributes represent categories of data that can be assigned to items.
    */
  var Attributes: js.UndefOr[DeletableAttributeList] = js.undefined
  
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String
  
  /**
    * The update condition which, if specified, determines whether the specified attributes will be deleted or not. The update condition must be satisfied in order for this request to be processed and the attributes to be deleted.
    */
  var Expected: js.UndefOr[UpdateCondition] = js.undefined
  
  /**
    * The name of the item. Similar to rows on a spreadsheet, items represent individual objects that contain one or more value-attribute pairs.
    */
  var ItemName: String
}
object DeleteAttributesRequest {
  
  inline def apply(DomainName: String, ItemName: String): DeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAttributesRequest]
  }
  
  extension [Self <: DeleteAttributesRequest](x: Self) {
    
    inline def setAttributes(value: DeletableAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: DeletableAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setExpected(value: UpdateCondition): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
    
    inline def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
