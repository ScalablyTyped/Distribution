package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scte27SourceSettings extends js.Object {
  /**
    * The pid field is used in conjunction with the caption selector languageCode field as follows:
    - Specify PID and Language: Extracts captions from that PID; the language is "informational".
    - Specify PID and omit Language: Extracts the specified PID.
    - Omit PID and specify Language: Extracts the specified language, whichever PID that happens to be.
    - Omit PID and omit Language: Valid only if source is DVB-Sub that is being passed through; all languages will be passed through.
    */
  var Pid: js.UndefOr[__integerMin1] = js.undefined
}

object Scte27SourceSettings {
  @scala.inline
  def apply(Pid: Int | Double = null): Scte27SourceSettings = {
    val __obj = js.Dynamic.literal()
    if (Pid != null) __obj.updateDynamic("Pid")(Pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte27SourceSettings]
  }
}

