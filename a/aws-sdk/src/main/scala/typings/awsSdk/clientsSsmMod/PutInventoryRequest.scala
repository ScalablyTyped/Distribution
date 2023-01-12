package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInventoryRequest extends StObject {
  
  /**
    * An managed node ID where you want to add or update inventory items.
    */
  var InstanceId: typings.awsSdk.clientsSsmMod.InstanceId
  
  /**
    * The inventory items that you want to add or update on managed nodes.
    */
  var Items: InventoryItemList
}
object PutInventoryRequest {
  
  inline def apply(InstanceId: InstanceId, Items: InventoryItemList): PutInventoryRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInventoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutInventoryRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setItems(value: InventoryItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: InventoryItem*): Self = StObject.set(x, "Items", js.Array(value*))
  }
}
