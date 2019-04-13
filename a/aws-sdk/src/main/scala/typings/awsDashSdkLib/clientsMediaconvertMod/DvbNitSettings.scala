package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvbNitSettings extends js.Object {
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: js.UndefOr[__integerMin0Max65535] = js.undefined
  /**
    * The network name text placed in the network_name_descriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: js.UndefOr[__stringMin1Max256] = js.undefined
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var NitInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
}

object DvbNitSettings {
  @scala.inline
  def apply(
    NetworkId: js.UndefOr[__integerMin0Max65535] = js.undefined,
    NetworkName: __stringMin1Max256 = null,
    NitInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
  ): DvbNitSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NetworkId)) __obj.updateDynamic("NetworkId")(NetworkId)
    if (NetworkName != null) __obj.updateDynamic("NetworkName")(NetworkName)
    if (!js.isUndefined(NitInterval)) __obj.updateDynamic("NitInterval")(NitInterval)
    __obj.asInstanceOf[DvbNitSettings]
  }
}

