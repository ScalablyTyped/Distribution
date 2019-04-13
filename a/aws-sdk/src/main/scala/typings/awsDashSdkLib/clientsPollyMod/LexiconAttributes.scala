package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexiconAttributes extends js.Object {
  /**
    * Phonetic alphabet used in the lexicon. Valid values are ipa and x-sampa.
    */
  var Alphabet: js.UndefOr[Alphabet] = js.undefined
  /**
    * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
    */
  var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
  /**
    * Date lexicon was last modified (a timestamp value).
    */
  var LastModified: js.UndefOr[LastModified] = js.undefined
  /**
    * Number of lexemes in the lexicon.
    */
  var LexemesCount: js.UndefOr[LexemesCount] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the lexicon.
    */
  var LexiconArn: js.UndefOr[LexiconArn] = js.undefined
  /**
    * Total size of the lexicon, in characters.
    */
  var Size: js.UndefOr[Size] = js.undefined
}

object LexiconAttributes {
  @scala.inline
  def apply(
    Alphabet: Alphabet = null,
    LanguageCode: LanguageCode = null,
    LastModified: LastModified = null,
    LexemesCount: js.UndefOr[LexemesCount] = js.undefined,
    LexiconArn: LexiconArn = null,
    Size: js.UndefOr[Size] = js.undefined
  ): LexiconAttributes = {
    val __obj = js.Dynamic.literal()
    if (Alphabet != null) __obj.updateDynamic("Alphabet")(Alphabet)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (!js.isUndefined(LexemesCount)) __obj.updateDynamic("LexemesCount")(LexemesCount)
    if (LexiconArn != null) __obj.updateDynamic("LexiconArn")(LexiconArn)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    __obj.asInstanceOf[LexiconAttributes]
  }
}

