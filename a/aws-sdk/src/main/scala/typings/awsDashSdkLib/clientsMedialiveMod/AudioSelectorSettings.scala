package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioSelectorSettings extends js.Object {
  var AudioLanguageSelection: js.UndefOr[AudioLanguageSelection] = js.undefined
  var AudioPidSelection: js.UndefOr[AudioPidSelection] = js.undefined
}

object AudioSelectorSettings {
  @scala.inline
  def apply(AudioLanguageSelection: AudioLanguageSelection = null, AudioPidSelection: AudioPidSelection = null): AudioSelectorSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioLanguageSelection != null) __obj.updateDynamic("AudioLanguageSelection")(AudioLanguageSelection)
    if (AudioPidSelection != null) __obj.updateDynamic("AudioPidSelection")(AudioPidSelection)
    __obj.asInstanceOf[AudioSelectorSettings]
  }
}

