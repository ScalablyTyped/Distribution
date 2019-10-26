package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2DevicesAndroidApp extends js.Object {
  /**
    * Package name
    * Package name must be specified when specifing Android Fulfillment.
    */
  var packageName: js.UndefOr[String] = js.undefined
  /**
    * When multiple filters are specified, any filter match will trigger the app.
    */
  var versions: js.UndefOr[js.Array[GoogleActionsV2DevicesAndroidAppVersionFilter]] = js.undefined
}

object GoogleActionsV2DevicesAndroidApp {
  @scala.inline
  def apply(
    packageName: String = null,
    versions: js.Array[GoogleActionsV2DevicesAndroidAppVersionFilter] = null
  ): GoogleActionsV2DevicesAndroidApp = {
    val __obj = js.Dynamic.literal()
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[GoogleActionsV2DevicesAndroidApp]
  }
}

