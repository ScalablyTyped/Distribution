package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectivityInfo extends js.Object {
  /**
    * The endpoint for the Greengrass core. Can be an IP address or DNS.
    */
  var HostAddress: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the connectivity information.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Metadata for this endpoint.
    */
  var Metadata: js.UndefOr[__string] = js.undefined
  /**
    * The port of the Greengrass core. Usually 8883.
    */
  var PortNumber: js.UndefOr[__integer] = js.undefined
}

object ConnectivityInfo {
  @scala.inline
  def apply(
    HostAddress: __string = null,
    Id: __string = null,
    Metadata: __string = null,
    PortNumber: js.UndefOr[__integer] = js.undefined
  ): ConnectivityInfo = {
    val __obj = js.Dynamic.literal()
    if (HostAddress != null) __obj.updateDynamic("HostAddress")(HostAddress)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (!js.isUndefined(PortNumber)) __obj.updateDynamic("PortNumber")(PortNumber)
    __obj.asInstanceOf[ConnectivityInfo]
  }
}

