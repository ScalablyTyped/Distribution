package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexiconAttributes extends js.Object {
  /**
    * Phonetic alphabet used in the lexicon. Valid values are ipa and x-sampa.
    */
  var Alphabet: js.UndefOr[typings.awsDashSdk.clientsPollyMod.Alphabet] = js.undefined
  /**
    * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsPollyMod.LanguageCode] = js.undefined
  /**
    * Date lexicon was last modified (a timestamp value).
    */
  var LastModified: js.UndefOr[typings.awsDashSdk.clientsPollyMod.LastModified] = js.undefined
  /**
    * Number of lexemes in the lexicon.
    */
  var LexemesCount: js.UndefOr[typings.awsDashSdk.clientsPollyMod.LexemesCount] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the lexicon.
    */
  var LexiconArn: js.UndefOr[typings.awsDashSdk.clientsPollyMod.LexiconArn] = js.undefined
  /**
    * Total size of the lexicon, in characters.
    */
  var Size: js.UndefOr[typings.awsDashSdk.clientsPollyMod.Size] = js.undefined
}

object LexiconAttributes {
  @scala.inline
  def apply(
    Alphabet: Alphabet = null,
    LanguageCode: LanguageCode = null,
    LastModified: LastModified = null,
    LexemesCount: Int | Double = null,
    LexiconArn: LexiconArn = null,
    Size: Int | Double = null
  ): LexiconAttributes = {
    val __obj = js.Dynamic.literal()
    if (Alphabet != null) __obj.updateDynamic("Alphabet")(Alphabet)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (LexemesCount != null) __obj.updateDynamic("LexemesCount")(LexemesCount.asInstanceOf[js.Any])
    if (LexiconArn != null) __obj.updateDynamic("LexiconArn")(LexiconArn)
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexiconAttributes]
  }
}

