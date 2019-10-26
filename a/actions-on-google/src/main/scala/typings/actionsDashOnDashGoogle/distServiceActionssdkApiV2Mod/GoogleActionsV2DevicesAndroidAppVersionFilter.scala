package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2DevicesAndroidAppVersionFilter extends js.Object {
  /**
    * Max version code, inclusive.
    * The range considered is [min_version:max_version].
    * A null range implies any version.
    * Examples:
    * To specify a single version use: [target_version:target_version].
    * To specify any version leave min_version and max_version unspecified.
    * To specify all versions until max_version, leave min_version unspecified.
    * To specify all versions from min_version, leave max_version unspecified.
    */
  var maxVersion: js.UndefOr[Double] = js.undefined
  /**
    * Min version code or 0, inclusive.
    */
  var minVersion: js.UndefOr[Double] = js.undefined
}

object GoogleActionsV2DevicesAndroidAppVersionFilter {
  @scala.inline
  def apply(maxVersion: Int | Double = null, minVersion: Int | Double = null): GoogleActionsV2DevicesAndroidAppVersionFilter = {
    val __obj = js.Dynamic.literal()
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2DevicesAndroidAppVersionFilter]
  }
}

