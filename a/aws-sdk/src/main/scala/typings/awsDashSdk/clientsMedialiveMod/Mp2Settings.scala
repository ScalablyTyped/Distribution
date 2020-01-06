package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mp2Settings extends js.Object {
  /**
    * Average bitrate in bits/second.
    */
  var Bitrate: js.UndefOr[__double] = js.native
  /**
    * The MPEG2 Audio coding mode.  Valid values are codingMode10 (for mono) or codingMode20 (for stereo).
    */
  var CodingMode: js.UndefOr[Mp2CodingMode] = js.native
  /**
    * Sample rate in Hz.
    */
  var SampleRate: js.UndefOr[__double] = js.native
}

object Mp2Settings {
  @scala.inline
  def apply(Bitrate: Int | Double = null, CodingMode: Mp2CodingMode = null, SampleRate: Int | Double = null): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    if (Bitrate != null) __obj.updateDynamic("Bitrate")(Bitrate.asInstanceOf[js.Any])
    if (CodingMode != null) __obj.updateDynamic("CodingMode")(CodingMode.asInstanceOf[js.Any])
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mp2Settings]
  }
}

