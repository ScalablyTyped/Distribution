package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStorageMetadata extends js.Object {
  /**
    * The storage for a user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.undefined
  /**
    * The amount of storage used, in bytes.
    */
  var StorageUtilizedInBytes: js.UndefOr[SizeType] = js.undefined
}

object UserStorageMetadata {
  @scala.inline
  def apply(StorageRule: StorageRuleType = null, StorageUtilizedInBytes: Int | Double = null): UserStorageMetadata = {
    val __obj = js.Dynamic.literal()
    if (StorageRule != null) __obj.updateDynamic("StorageRule")(StorageRule)
    if (StorageUtilizedInBytes != null) __obj.updateDynamic("StorageUtilizedInBytes")(StorageUtilizedInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStorageMetadata]
  }
}

