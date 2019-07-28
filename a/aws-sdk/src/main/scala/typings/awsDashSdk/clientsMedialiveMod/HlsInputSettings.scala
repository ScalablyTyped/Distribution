package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsInputSettings extends js.Object {
  /**
    * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen, otherwise the highest bandwidth stream in the m3u8 will be chosen.  The bitrate is specified in bits per second, as in an HLS manifest.
    */
  var Bandwidth: js.UndefOr[__integerMin0] = js.undefined
  /**
    * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written segment).  When not specified, the HLS input will begin with the first segment specified in the m3u8.
    */
  var BufferSegments: js.UndefOr[__integerMin0] = js.undefined
  /**
    * The number of consecutive times that attempts to read a manifest or segment must fail before the input is considered unavailable.
    */
  var Retries: js.UndefOr[__integerMin0] = js.undefined
  /**
    * The number of seconds between retries when an attempt to read a manifest or segment fails.
    */
  var RetryInterval: js.UndefOr[__integerMin0] = js.undefined
}

object HlsInputSettings {
  @scala.inline
  def apply(
    Bandwidth: js.UndefOr[__integerMin0] = js.undefined,
    BufferSegments: js.UndefOr[__integerMin0] = js.undefined,
    Retries: js.UndefOr[__integerMin0] = js.undefined,
    RetryInterval: js.UndefOr[__integerMin0] = js.undefined
  ): HlsInputSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bandwidth)) __obj.updateDynamic("Bandwidth")(Bandwidth)
    if (!js.isUndefined(BufferSegments)) __obj.updateDynamic("BufferSegments")(BufferSegments)
    if (!js.isUndefined(Retries)) __obj.updateDynamic("Retries")(Retries)
    if (!js.isUndefined(RetryInterval)) __obj.updateDynamic("RetryInterval")(RetryInterval)
    __obj.asInstanceOf[HlsInputSettings]
  }
}

