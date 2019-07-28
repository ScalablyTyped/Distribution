package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageRuleType extends js.Object {
  /**
    * The amount of storage allocated, in bytes.
    */
  var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.undefined
  /**
    * The type of storage.
    */
  var StorageType: js.UndefOr[typings.awsDashSdk.clientsWorkdocsMod.StorageType] = js.undefined
}

object StorageRuleType {
  @scala.inline
  def apply(
    StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.undefined,
    StorageType: StorageType = null
  ): StorageRuleType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(StorageAllocatedInBytes)) __obj.updateDynamic("StorageAllocatedInBytes")(StorageAllocatedInBytes)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageRuleType]
  }
}

