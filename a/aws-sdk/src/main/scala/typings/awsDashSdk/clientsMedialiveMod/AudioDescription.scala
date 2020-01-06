package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioDescription extends js.Object {
  /**
    * Advanced audio normalization settings.
    */
  var AudioNormalizationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.AudioNormalizationSettings] = js.native
  /**
    * The name of the AudioSelector used as the source for this AudioDescription.
    */
  var AudioSelectorName: __string = js.native
  /**
    * Applies only if audioTypeControl is useConfigured. The values for audioType are defined in ISO-IEC 13818-1.
    */
  var AudioType: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.AudioType] = js.native
  /**
    * Determines how audio type is determined.
    followInput: If the input contains an ISO 639 audioType, then that value is passed through to the output. If the input contains no ISO 639 audioType, the value in Audio Type is included in the output.
    useConfigured: The value in Audio Type is included in the output.
  Note that this field and audioType are both ignored if inputType is broadcasterMixedAd.
    */
  var AudioTypeControl: js.UndefOr[AudioDescriptionAudioTypeControl] = js.native
  /**
    * Audio codec settings.
    */
  var CodecSettings: js.UndefOr[AudioCodecSettings] = js.native
  /**
    * Indicates the language of the audio output track. Only used if languageControlMode is useConfigured, or there is no ISO 639 language code specified in the input.
    */
  var LanguageCode: js.UndefOr[__stringMin3Max3] = js.native
  /**
    * Choosing followInput will cause the ISO 639 language code of the output to follow the ISO 639 language code of the input. The languageCode will be used when useConfigured is set, or when followInput is selected but there is no ISO 639 language code specified by the input.
    */
  var LanguageCodeControl: js.UndefOr[AudioDescriptionLanguageCodeControl] = js.native
  /**
    * The name of this AudioDescription. Outputs will use this name to uniquely identify this AudioDescription.  Description names should be unique within this Live Event.
    */
  var Name: __string = js.native
  /**
    * Settings that control how input audio channels are remixed into the output audio channels.
    */
  var RemixSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.RemixSettings] = js.native
  /**
    * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director Commentary).
    */
  var StreamName: js.UndefOr[__string] = js.native
}

object AudioDescription {
  @scala.inline
  def apply(
    AudioSelectorName: __string,
    Name: __string,
    AudioNormalizationSettings: AudioNormalizationSettings = null,
    AudioType: AudioType = null,
    AudioTypeControl: AudioDescriptionAudioTypeControl = null,
    CodecSettings: AudioCodecSettings = null,
    LanguageCode: __stringMin3Max3 = null,
    LanguageCodeControl: AudioDescriptionLanguageCodeControl = null,
    RemixSettings: RemixSettings = null,
    StreamName: __string = null
  ): AudioDescription = {
    val __obj = js.Dynamic.literal(AudioSelectorName = AudioSelectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (AudioNormalizationSettings != null) __obj.updateDynamic("AudioNormalizationSettings")(AudioNormalizationSettings.asInstanceOf[js.Any])
    if (AudioType != null) __obj.updateDynamic("AudioType")(AudioType.asInstanceOf[js.Any])
    if (AudioTypeControl != null) __obj.updateDynamic("AudioTypeControl")(AudioTypeControl.asInstanceOf[js.Any])
    if (CodecSettings != null) __obj.updateDynamic("CodecSettings")(CodecSettings.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LanguageCodeControl != null) __obj.updateDynamic("LanguageCodeControl")(LanguageCodeControl.asInstanceOf[js.Any])
    if (RemixSettings != null) __obj.updateDynamic("RemixSettings")(RemixSettings.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDescription]
  }
}

