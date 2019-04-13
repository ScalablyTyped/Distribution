package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicesResponse extends js.Object {
  /**
    * Information about the devices.
    */
  var Devices: js.UndefOr[DeviceSummaryList] = js.undefined
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDevicesResponse {
  @scala.inline
  def apply(Devices: DeviceSummaryList = null, NextToken: NextToken = null): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (Devices != null) __obj.updateDynamic("Devices")(Devices)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDevicesResponse]
  }
}

