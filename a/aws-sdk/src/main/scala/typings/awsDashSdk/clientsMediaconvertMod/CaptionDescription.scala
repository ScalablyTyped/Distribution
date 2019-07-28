package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionDescription extends js.Object {
  /**
    * Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating captions. The name should be of the format "Caption Selector ", which denotes that the Nth Caption Selector will be used from each input.
    */
  var CaptionSelectorName: js.UndefOr[__stringMin1] = js.undefined
  /**
    * Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter language code. For most captions output formats, the encoder puts this language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information to choose the font language for rendering the captions text.
    */
  var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
  /**
    * Specific settings required by destination type. Note that burnin_destination_settings are not available if the source of the caption data is Embedded or Teletext.
    */
  var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined
  /**
    * Specify the language of this captions output track. For most captions output formats, the encoder puts this language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information to choose the font language for rendering the captions text.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.LanguageCode] = js.undefined
  /**
    * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric characters, spaces, and underscore are legal.
    */
  var LanguageDescription: js.UndefOr[__string] = js.undefined
}

object CaptionDescription {
  @scala.inline
  def apply(
    CaptionSelectorName: __stringMin1 = null,
    CustomLanguageCode: __stringMin3Max3PatternAZaZ3 = null,
    DestinationSettings: CaptionDestinationSettings = null,
    LanguageCode: LanguageCode = null,
    LanguageDescription: __string = null
  ): CaptionDescription = {
    val __obj = js.Dynamic.literal()
    if (CaptionSelectorName != null) __obj.updateDynamic("CaptionSelectorName")(CaptionSelectorName)
    if (CustomLanguageCode != null) __obj.updateDynamic("CustomLanguageCode")(CustomLanguageCode)
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LanguageDescription != null) __obj.updateDynamic("LanguageDescription")(LanguageDescription)
    __obj.asInstanceOf[CaptionDescription]
  }
}

