package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCycle extends js.Object {
  /**
    * The number of playback loops (only supported on Chrome 65 and later).
    *
    * A positive integer. The value range is [1,10000]. The default value is 1.
    */
  var cycle: js.UndefOr[Double] = js.undefined
  /**
    * The URL of the online audio effect file.
    *
    * The URL must contain ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Supported audio formats: MP3, AAC, and other audio formats depending on the browser.
    */
  var filePath: String
  /**
    * The ID of the specified audio effect.
    *
    * A positive integer. The value range is [1,10000]. Each audio effect has a unique ID.
    *
    * If the audio effect is preloaded into the memory through the [[preloadEffect]] method, ensure that the soundId value is set to the same value as in [[preloadEffect]].
    */
  var soundId: Double
}

object AnonCycle {
  @scala.inline
  def apply(filePath: String, soundId: Double, cycle: Int | Double = null): AnonCycle = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], soundId = soundId.asInstanceOf[js.Any])
    if (cycle != null) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCycle]
  }
}

