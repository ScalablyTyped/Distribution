package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheResource extends js.Object {
  /**
    * Whether or not to store the audio mixing file in the cache.
    *
    * - `true`: (default) store the audio mixing file in the cache to speed up mixing this file the next time.
    * - `false`: do not store the audio mixing file in the cache to save RAM.
    */
  var cacheResource: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of playback loops (only supports Chrome 65+)
    *
    * A positive integer. The value range is [1,10000]. The default value is 1.
    */
  var cycle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Path of the online audio file to mix. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Supported audio formats: mp3, aac, and other audio formats depending on the browser.
    */
  var filePath: java.lang.String
  /**
    * Whether the audio mixing file loops infinitely.
    *
    * - `true`: The audio mixing file loops infinitely. Do not use this option if `cycle` is specified.
    * - `false`: (Default) Disables the infinite loops.
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the playback position (ms) of the audio mixing file. An integer, and the value range is [0,100000000].
    *
    * If you need to play the file from the beginning, set this paramter to 0.
    */
  var playTime: scala.Double
  /**
    * Whether the online audio file replaces the local audio stream.
    *
    * - `true`: The content of the online audio file replaces the audio stream from the microphone.
    * - `false`: (Default) The online audio file is mixed with the audio stream from the microphone.
    *
    * **Note:**
    *
    * Safari does not support this parameter.
    */
  var replace: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CacheResource {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    playTime: scala.Double,
    cacheResource: js.UndefOr[scala.Boolean] = js.undefined,
    cycle: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    replace: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CacheResource = {
    val __obj = js.Dynamic.literal(filePath = filePath, playTime = playTime)
    if (!js.isUndefined(cacheResource)) __obj.updateDynamic("cacheResource")(cacheResource)
    if (cycle != null) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[Anon_CacheResource]
  }
}

