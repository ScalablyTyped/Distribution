package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageRuleType extends js.Object {
  /**
    * The amount of storage allocated, in bytes.
    */
  var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.native
  /**
    * The type of storage.
    */
  var StorageType: js.UndefOr[typings.awsDashSdk.clientsWorkdocsMod.StorageType] = js.native
}

object StorageRuleType {
  @scala.inline
  def apply(StorageAllocatedInBytes: Int | Double = null, StorageType: StorageType = null): StorageRuleType = {
    val __obj = js.Dynamic.literal()
    if (StorageAllocatedInBytes != null) __obj.updateDynamic("StorageAllocatedInBytes")(StorageAllocatedInBytes.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageRuleType]
  }
}

