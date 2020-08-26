package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2DevicesAndroidApp extends js.Object {
  /**
    * Package name
    * Package name must be specified when specifing Android Fulfillment.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * When multiple filters are specified, any filter match will trigger the app.
    */
  var versions: js.UndefOr[js.Array[GoogleActionsV2DevicesAndroidAppVersionFilter]] = js.native
}

object GoogleActionsV2DevicesAndroidApp {
  @scala.inline
  def apply(): GoogleActionsV2DevicesAndroidApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DevicesAndroidApp]
  }
  @scala.inline
  implicit class GoogleActionsV2DevicesAndroidAppOps[Self <: GoogleActionsV2DevicesAndroidApp] (val x: Self) extends AnyVal {
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
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: GoogleActionsV2DevicesAndroidAppVersionFilter*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[GoogleActionsV2DevicesAndroidAppVersionFilter]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

