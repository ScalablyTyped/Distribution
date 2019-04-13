package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSpecification extends js.Object {
  /**
    * Input codec
    */
  var Codec: js.UndefOr[InputCodec] = js.undefined
  /**
    * Maximum input bitrate, categorized coarsely
    */
  var MaximumBitrate: js.UndefOr[InputMaximumBitrate] = js.undefined
  /**
    * Input resolution, categorized coarsely
    */
  var Resolution: js.UndefOr[InputResolution] = js.undefined
}

object InputSpecification {
  @scala.inline
  def apply(
    Codec: InputCodec = null,
    MaximumBitrate: InputMaximumBitrate = null,
    Resolution: InputResolution = null
  ): InputSpecification = {
    val __obj = js.Dynamic.literal()
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (MaximumBitrate != null) __obj.updateDynamic("MaximumBitrate")(MaximumBitrate.asInstanceOf[js.Any])
    if (Resolution != null) __obj.updateDynamic("Resolution")(Resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSpecification]
  }
}

