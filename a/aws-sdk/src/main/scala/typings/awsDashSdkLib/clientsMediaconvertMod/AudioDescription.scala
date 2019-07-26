package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioDescription extends js.Object {
  /**
    * Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
    */
  var AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings] = js.undefined
  /**
    * Specifies which audio data to use from each input. In the simplest case, specify an "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
    */
  var AudioSourceName: js.UndefOr[__string] = js.undefined
  /**
    * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired Commentary, 4-255 = Reserved.
    */
  var AudioType: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
    */
  var AudioTypeControl: js.UndefOr[AudioTypeControl] = js.undefined
  /**
    * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio encoding. The settings in this group vary depending on the value that you choose for Audio codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings * EAC3_ATMOS, Eac3AtmosSettings
    */
  var CodecSettings: js.UndefOr[AudioCodecSettings] = js.undefined
  /**
    * Specify the language for this audio output track, using the ISO 639-2 or ISO 639-3 three-letter language code. The language specified will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected but there is no ISO 639 language code specified by the input.
    */
  var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
  /**
    * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected but there is no ISO 639 language code specified by the input.
    */
  var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
  /**
    * Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language code of the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected or when FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
    */
  var LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl] = js.undefined
  /**
    * Advanced audio remixing settings.
    */
  var RemixSettings: js.UndefOr[RemixSettings] = js.undefined
  /**
    * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director Commentary). Alphanumeric characters, spaces, and underscore are legal.
    */
  var StreamName: js.UndefOr[__stringPatternWS] = js.undefined
}

object AudioDescription {
  @scala.inline
  def apply(
    AudioNormalizationSettings: AudioNormalizationSettings = null,
    AudioSourceName: __string = null,
    AudioType: js.UndefOr[__integerMin0Max255] = js.undefined,
    AudioTypeControl: AudioTypeControl = null,
    CodecSettings: AudioCodecSettings = null,
    CustomLanguageCode: __stringMin3Max3PatternAZaZ3 = null,
    LanguageCode: LanguageCode = null,
    LanguageCodeControl: AudioLanguageCodeControl = null,
    RemixSettings: RemixSettings = null,
    StreamName: __stringPatternWS = null
  ): AudioDescription = {
    val __obj = js.Dynamic.literal()
    if (AudioNormalizationSettings != null) __obj.updateDynamic("AudioNormalizationSettings")(AudioNormalizationSettings)
    if (AudioSourceName != null) __obj.updateDynamic("AudioSourceName")(AudioSourceName)
    if (!js.isUndefined(AudioType)) __obj.updateDynamic("AudioType")(AudioType)
    if (AudioTypeControl != null) __obj.updateDynamic("AudioTypeControl")(AudioTypeControl.asInstanceOf[js.Any])
    if (CodecSettings != null) __obj.updateDynamic("CodecSettings")(CodecSettings)
    if (CustomLanguageCode != null) __obj.updateDynamic("CustomLanguageCode")(CustomLanguageCode)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LanguageCodeControl != null) __obj.updateDynamic("LanguageCodeControl")(LanguageCodeControl.asInstanceOf[js.Any])
    if (RemixSettings != null) __obj.updateDynamic("RemixSettings")(RemixSettings)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[AudioDescription]
  }
}

