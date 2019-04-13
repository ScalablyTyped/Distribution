package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvbNitSettings extends js.Object {
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: __integerMin0Max65536
  /**
    * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: __stringMin1Max256
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
}

object DvbNitSettings {
  @scala.inline
  def apply(
    NetworkId: __integerMin0Max65536,
    NetworkName: __stringMin1Max256,
    RepInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
  ): DvbNitSettings = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId, NetworkName = NetworkName)
    if (!js.isUndefined(RepInterval)) __obj.updateDynamic("RepInterval")(RepInterval)
    __obj.asInstanceOf[DvbNitSettings]
  }
}

