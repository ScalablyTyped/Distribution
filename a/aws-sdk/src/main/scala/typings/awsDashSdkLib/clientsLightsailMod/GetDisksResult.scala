package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDisksResult extends js.Object {
  /**
    * An array of objects containing information about all block storage disks.
    */
  var disks: js.UndefOr[DiskList] = js.undefined
  /**
    * A token used for advancing to the next page of results from your GetDisks request.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetDisksResult {
  @scala.inline
  def apply(disks: DiskList = null, nextPageToken: java.lang.String = null): GetDisksResult = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetDisksResult]
  }
}

