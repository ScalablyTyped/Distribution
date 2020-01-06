package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageType extends js.Object {
  var StorageSubTypeName: js.UndefOr[typings.awsDashSdk.clientsEsMod.StorageSubTypeName] = js.native
  /**
    * List of limits that are applicable for given storage type. 
    */
  var StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.native
  var StorageTypeName: js.UndefOr[typings.awsDashSdk.clientsEsMod.StorageTypeName] = js.native
}

object StorageType {
  @scala.inline
  def apply(
    StorageSubTypeName: StorageSubTypeName = null,
    StorageTypeLimits: StorageTypeLimitList = null,
    StorageTypeName: StorageTypeName = null
  ): StorageType = {
    val __obj = js.Dynamic.literal()
    if (StorageSubTypeName != null) __obj.updateDynamic("StorageSubTypeName")(StorageSubTypeName.asInstanceOf[js.Any])
    if (StorageTypeLimits != null) __obj.updateDynamic("StorageTypeLimits")(StorageTypeLimits.asInstanceOf[js.Any])
    if (StorageTypeName != null) __obj.updateDynamic("StorageTypeName")(StorageTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageType]
  }
}

