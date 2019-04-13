package typings
package awsDashSdkLib.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashConfigurationForPut extends js.Object {
  /**
    * The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor populates the Location tag with the URL for manifest update requests, to be used by players that don't support sticky redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor manifests and you are either using client-side reporting or your players support sticky HTTP redirects. Valid values are DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is the default value. 
    */
  var MpdLocation: js.UndefOr[__string] = js.undefined
}

object DashConfigurationForPut {
  @scala.inline
  def apply(MpdLocation: __string = null): DashConfigurationForPut = {
    val __obj = js.Dynamic.literal()
    if (MpdLocation != null) __obj.updateDynamic("MpdLocation")(MpdLocation)
    __obj.asInstanceOf[DashConfigurationForPut]
  }
}

