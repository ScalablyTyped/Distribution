package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexVideoSettings extends js.Object {
  /**
    * The constant bitrate configuration for the video encode.
  When this field is defined, StatmuxSettings must be undefined.
    */
  var ConstantBitrate: js.UndefOr[__integerMin100000Max100000000] = js.native
  /**
    * Statmux rate control settings.
  When this field is defined, ConstantBitrate must be undefined.
    */
  var StatmuxSettings: js.UndefOr[MultiplexStatmuxVideoSettings] = js.native
}

object MultiplexVideoSettings {
  @scala.inline
  def apply(ConstantBitrate: Int | Double = null, StatmuxSettings: MultiplexStatmuxVideoSettings = null): MultiplexVideoSettings = {
    val __obj = js.Dynamic.literal()
    if (ConstantBitrate != null) __obj.updateDynamic("ConstantBitrate")(ConstantBitrate.asInstanceOf[js.Any])
    if (StatmuxSettings != null) __obj.updateDynamic("StatmuxSettings")(StatmuxSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexVideoSettings]
  }
}

