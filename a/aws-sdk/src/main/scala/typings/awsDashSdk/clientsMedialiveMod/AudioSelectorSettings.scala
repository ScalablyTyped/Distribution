package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioSelectorSettings extends js.Object {
  var AudioLanguageSelection: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.AudioLanguageSelection] = js.undefined
  var AudioPidSelection: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.AudioPidSelection] = js.undefined
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

