package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryResultEntity extends js.Object {
  /**
    * The data section in the inventory result entity JSON.
    */
  var Data: js.UndefOr[InventoryResultItemMap] = js.undefined
  /**
    * ID of the inventory result entity. For example, for managed instance inventory the result will be the managed instance ID. For EC2 instance inventory, the result will be the instance ID. 
    */
  var Id: js.UndefOr[InventoryResultEntityId] = js.undefined
}

object InventoryResultEntity {
  @scala.inline
  def apply(Data: InventoryResultItemMap = null, Id: InventoryResultEntityId = null): InventoryResultEntity = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[InventoryResultEntity]
  }
}

