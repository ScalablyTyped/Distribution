package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectLockConfiguration extends js.Object {
  /**
    * Indicates whether this bucket has an object lock configuration enabled.
    */
  var ObjectLockEnabled: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockEnabled] = js.undefined
  /**
    * The object lock rule in place for the specified object.
    */
  var Rule: js.UndefOr[ObjectLockRule] = js.undefined
}

object ObjectLockConfiguration {
  @scala.inline
  def apply(ObjectLockEnabled: ObjectLockEnabled = null, Rule: ObjectLockRule = null): ObjectLockConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ObjectLockEnabled != null) __obj.updateDynamic("ObjectLockEnabled")(ObjectLockEnabled.asInstanceOf[js.Any])
    if (Rule != null) __obj.updateDynamic("Rule")(Rule)
    __obj.asInstanceOf[ObjectLockConfiguration]
  }
}

