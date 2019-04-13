package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLexiconOutput extends js.Object {
  /**
    * Lexicon object that provides name and the string content of the lexicon. 
    */
  var Lexicon: js.UndefOr[Lexicon] = js.undefined
  /**
    * Metadata of the lexicon, including phonetic alphabetic used, language code, lexicon ARN, number of lexemes defined in the lexicon, and size of lexicon in bytes.
    */
  var LexiconAttributes: js.UndefOr[LexiconAttributes] = js.undefined
}

object GetLexiconOutput {
  @scala.inline
  def apply(Lexicon: Lexicon = null, LexiconAttributes: LexiconAttributes = null): GetLexiconOutput = {
    val __obj = js.Dynamic.literal()
    if (Lexicon != null) __obj.updateDynamic("Lexicon")(Lexicon)
    if (LexiconAttributes != null) __obj.updateDynamic("LexiconAttributes")(LexiconAttributes)
    __obj.asInstanceOf[GetLexiconOutput]
  }
}

