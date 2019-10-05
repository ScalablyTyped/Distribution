package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsCaptionLanguageMapping extends js.Object {
  /**
    * Caption channel.
    */
  var CaptionChannel: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  /**
    * Specify the language for this caption channel, using the ISO 639-2 or ISO 639-3 three-letter language code
    */
  var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
  /**
    * Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.LanguageCode] = js.undefined
  /**
    * Caption language description.
    */
  var LanguageDescription: js.UndefOr[__string] = js.undefined
}

object HlsCaptionLanguageMapping {
  @scala.inline
  def apply(
    CaptionChannel: Int | Double = null,
    CustomLanguageCode: __stringMin3Max3PatternAZaZ3 = null,
    LanguageCode: LanguageCode = null,
    LanguageDescription: __string = null
  ): HlsCaptionLanguageMapping = {
    val __obj = js.Dynamic.literal()
    if (CaptionChannel != null) __obj.updateDynamic("CaptionChannel")(CaptionChannel.asInstanceOf[js.Any])
    if (CustomLanguageCode != null) __obj.updateDynamic("CustomLanguageCode")(CustomLanguageCode)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LanguageDescription != null) __obj.updateDynamic("LanguageDescription")(LanguageDescription)
    __obj.asInstanceOf[HlsCaptionLanguageMapping]
  }
}

