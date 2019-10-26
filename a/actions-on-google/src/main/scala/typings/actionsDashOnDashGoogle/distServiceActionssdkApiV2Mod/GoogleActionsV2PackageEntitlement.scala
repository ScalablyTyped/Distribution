package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2PackageEntitlement extends js.Object {
  /**
    * List of entitlements for a given app
    */
  var entitlements: js.UndefOr[js.Array[GoogleActionsV2Entitlement]] = js.undefined
  /**
    * Should match the package name in action package
    */
  var packageName: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2PackageEntitlement {
  @scala.inline
  def apply(entitlements: js.Array[GoogleActionsV2Entitlement] = null, packageName: String = null): GoogleActionsV2PackageEntitlement = {
    val __obj = js.Dynamic.literal()
    if (entitlements != null) __obj.updateDynamic("entitlements")(entitlements)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    __obj.asInstanceOf[GoogleActionsV2PackageEntitlement]
  }
}

