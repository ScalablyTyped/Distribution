package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSelector extends js.Object {
  /**
    * The specific language to extract from source, using the ISO 639-2 or ISO 639-3 three-letter language code. If input is SCTE-27, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field (and PID field); there is no way to extract a specific language with pass-through captions.
    */
  var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
  /**
    * The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field (and PID field); there is no way to extract a specific language with pass-through captions.
    */
  var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
  /**
    * Source settings (SourceSettings) contains the group of settings for captions in the input.
    */
  var SourceSettings: js.UndefOr[CaptionSourceSettings] = js.undefined
}

object CaptionSelector {
  @scala.inline
  def apply(
    CustomLanguageCode: __stringMin3Max3PatternAZaZ3 = null,
    LanguageCode: LanguageCode = null,
    SourceSettings: CaptionSourceSettings = null
  ): CaptionSelector = {
    val __obj = js.Dynamic.literal()
    if (CustomLanguageCode != null) __obj.updateDynamic("CustomLanguageCode")(CustomLanguageCode)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (SourceSettings != null) __obj.updateDynamic("SourceSettings")(SourceSettings)
    __obj.asInstanceOf[CaptionSelector]
  }
}

