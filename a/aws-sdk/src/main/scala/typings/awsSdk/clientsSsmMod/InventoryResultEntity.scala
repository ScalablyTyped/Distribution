package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryResultEntity extends StObject {
  
  /**
    * The data section in the inventory result entity JSON.
    */
  var Data: js.UndefOr[InventoryResultItemMap] = js.undefined
  
  /**
    * ID of the inventory result entity. For example, for managed node inventory the result will be the managed node ID. For EC2 instance inventory, the result will be the instance ID. 
    */
  var Id: js.UndefOr[InventoryResultEntityId] = js.undefined
}
object InventoryResultEntity {
  
  inline def apply(): InventoryResultEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryResultEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryResultEntity] (val x: Self) extends AnyVal {
    
    inline def setData(value: InventoryResultItemMap): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setId(value: InventoryResultEntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
