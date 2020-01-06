package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxToken extends js.Object {
  /**
    * The zero-based offset from the beginning of the source text to the first character in the word.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    * The zero-based offset from the beginning of the source text to the last character in the word.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was correctly identified. For more information, see how-syntax.
    */
  var PartOfSpeech: js.UndefOr[PartOfSpeechTag] = js.native
  /**
    * The word that was recognized in the source text.
    */
  var Text: js.UndefOr[String] = js.native
  /**
    * A unique identifier for a token.
    */
  var TokenId: js.UndefOr[Integer] = js.native
}

object SyntaxToken {
  @scala.inline
  def apply(
    BeginOffset: Int | scala.Double = null,
    EndOffset: Int | scala.Double = null,
    PartOfSpeech: PartOfSpeechTag = null,
    Text: String = null,
    TokenId: Int | scala.Double = null
  ): SyntaxToken = {
    val __obj = js.Dynamic.literal()
    if (BeginOffset != null) __obj.updateDynamic("BeginOffset")(BeginOffset.asInstanceOf[js.Any])
    if (EndOffset != null) __obj.updateDynamic("EndOffset")(EndOffset.asInstanceOf[js.Any])
    if (PartOfSpeech != null) __obj.updateDynamic("PartOfSpeech")(PartOfSpeech.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (TokenId != null) __obj.updateDynamic("TokenId")(TokenId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxToken]
  }
}

