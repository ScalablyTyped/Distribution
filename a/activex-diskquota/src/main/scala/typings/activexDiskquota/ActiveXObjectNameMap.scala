package typings.activexDiskquota

import typings.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("Microsoft.DiskQuota")
  var MicrosoftDotDiskQuota: DiskQuotaControl
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(MicrosoftDotDiskQuota: DiskQuotaControl): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Microsoft.DiskQuota")(MicrosoftDotDiskQuota.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

