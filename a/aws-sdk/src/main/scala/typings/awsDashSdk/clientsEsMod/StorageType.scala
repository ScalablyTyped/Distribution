package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageType extends js.Object {
  var StorageSubTypeName: js.UndefOr[typings.awsDashSdk.clientsEsMod.StorageSubTypeName] = js.undefined
  /**
    * List of limits that are applicable for given storage type. 
    */
  var StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.undefined
  var StorageTypeName: js.UndefOr[typings.awsDashSdk.clientsEsMod.StorageTypeName] = js.undefined
}

object StorageType {
  @scala.inline
  def apply(
    StorageSubTypeName: StorageSubTypeName = null,
    StorageTypeLimits: StorageTypeLimitList = null,
    StorageTypeName: StorageTypeName = null
  ): StorageType = {
    val __obj = js.Dynamic.literal()
    if (StorageSubTypeName != null) __obj.updateDynamic("StorageSubTypeName")(StorageSubTypeName)
    if (StorageTypeLimits != null) __obj.updateDynamic("StorageTypeLimits")(StorageTypeLimits)
    if (StorageTypeName != null) __obj.updateDynamic("StorageTypeName")(StorageTypeName)
    __obj.asInstanceOf[StorageType]
  }
}

