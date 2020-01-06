package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDisksResult extends js.Object {
  /**
    * An array of objects containing information about all block storage disks.
    */
  var disks: js.UndefOr[DiskList] = js.native
  /**
    * A token used for advancing to the next page of results from your GetDisks request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetDisksResult {
  @scala.inline
  def apply(disks: DiskList = null, nextPageToken: String = null): GetDisksResult = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDisksResult]
  }
}

