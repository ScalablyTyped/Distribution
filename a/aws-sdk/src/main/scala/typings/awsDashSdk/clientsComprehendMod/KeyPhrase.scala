package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPhrase extends js.Object {
  /**
    * A character offset in the input text that shows where the key phrase begins (the first character is at position 0). The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  /**
    * A character offset in the input text where the key phrase ends. The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
  /**
    * The text of a key noun phrase.
    */
  var Text: js.UndefOr[String] = js.undefined
}

object KeyPhrase {
  @scala.inline
  def apply(
    BeginOffset: Int | scala.Double = null,
    EndOffset: Int | scala.Double = null,
    Score: Int | scala.Double = null,
    Text: String = null
  ): KeyPhrase = {
    val __obj = js.Dynamic.literal()
    if (BeginOffset != null) __obj.updateDynamic("BeginOffset")(BeginOffset.asInstanceOf[js.Any])
    if (EndOffset != null) __obj.updateDynamic("EndOffset")(EndOffset.asInstanceOf[js.Any])
    if (Score != null) __obj.updateDynamic("Score")(Score.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text)
    __obj.asInstanceOf[KeyPhrase]
  }
}

