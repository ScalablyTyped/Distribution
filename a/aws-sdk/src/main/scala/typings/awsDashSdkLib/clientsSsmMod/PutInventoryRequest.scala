package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutInventoryRequest extends js.Object {
  /**
    * One or more instance IDs where you want to add or update inventory items.
    */
  var InstanceId: awsDashSdkLib.clientsSsmMod.InstanceId
  /**
    * The inventory items that you want to add or update on instances.
    */
  var Items: InventoryItemList
}

object PutInventoryRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, Items: InventoryItemList): PutInventoryRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, Items = Items)
  
    __obj.asInstanceOf[PutInventoryRequest]
  }
}

