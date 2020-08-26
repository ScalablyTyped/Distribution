package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2PackageEntitlement extends js.Object {
  /**
    * List of entitlements for a given app
    */
  var entitlements: js.UndefOr[js.Array[GoogleActionsV2Entitlement]] = js.native
  /**
    * Should match the package name in action package
    */
  var packageName: js.UndefOr[String] = js.native
}

object GoogleActionsV2PackageEntitlement {
  @scala.inline
  def apply(): GoogleActionsV2PackageEntitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PackageEntitlement]
  }
  @scala.inline
  implicit class GoogleActionsV2PackageEntitlementOps[Self <: GoogleActionsV2PackageEntitlement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntitlementsVarargs(value: GoogleActionsV2Entitlement*): Self = this.set("entitlements", js.Array(value :_*))
    @scala.inline
    def setEntitlements(value: js.Array[GoogleActionsV2Entitlement]): Self = this.set("entitlements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlements: Self = this.set("entitlements", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
  
}

