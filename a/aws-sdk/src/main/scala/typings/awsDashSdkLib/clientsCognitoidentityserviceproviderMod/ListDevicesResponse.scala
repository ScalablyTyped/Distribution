package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicesResponse extends js.Object {
  /**
    * The devices returned in the list devices response.
    */
  var Devices: js.UndefOr[DeviceListType] = js.undefined
  /**
    * The pagination token for the list device response.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
}

object ListDevicesResponse {
  @scala.inline
  def apply(Devices: DeviceListType = null, PaginationToken: SearchPaginationTokenType = null): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (Devices != null) __obj.updateDynamic("Devices")(Devices)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    __obj.asInstanceOf[ListDevicesResponse]
  }
}

