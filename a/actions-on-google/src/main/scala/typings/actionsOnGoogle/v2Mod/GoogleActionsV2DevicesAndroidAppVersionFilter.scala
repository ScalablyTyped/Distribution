package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var maxVersion: js.UndefOr[Double] = js.native
  
  /**
    * Min version code or 0, inclusive.
    */
  var minVersion: js.UndefOr[Double] = js.native
}
object GoogleActionsV2DevicesAndroidAppVersionFilter {
  
  @scala.inline
  def apply(): GoogleActionsV2DevicesAndroidAppVersionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DevicesAndroidAppVersionFilter]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DevicesAndroidAppVersionFilterOps[Self <: GoogleActionsV2DevicesAndroidAppVersionFilter] (val x: Self) extends AnyVal {
    
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
    def setMaxVersion(value: Double): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVersion: Self = this.set("maxVersion", js.undefined)
    
    @scala.inline
    def setMinVersion(value: Double): Self = this.set("minVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVersion: Self = this.set("minVersion", js.undefined)
  }
}
