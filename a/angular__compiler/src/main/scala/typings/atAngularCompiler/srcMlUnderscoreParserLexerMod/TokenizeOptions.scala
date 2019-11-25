package typings.atAngularCompiler.srcMlUnderscoreParserLexerMod

import typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizeOptions extends js.Object {
  /**
    * If this text is stored in a JavaScript string, then we have to deal with escape sequences.
    *
    * **Example 1:**
    *
    * ```
    * "abc\"def\nghi"
    * ```
    *
    * - The `\"` must be converted to `"`.
    * - The `\n` must be converted to a new line character in a token,
    *   but it should not increment the current line for source mapping.
    *
    * **Example 2:**
    *
    * ```
    * "abc\
    *  def"
    * ```
    *
    * The line continuation (`\` followed by a newline) should be removed from a token
    * but the new line should increment the current line for source mapping.
    */
  var escapedString: js.UndefOr[Boolean] = js.undefined
  /** How to tokenize interpolation markers. */
  var interpolationConfig: js.UndefOr[InterpolationConfig] = js.undefined
  /**
    * An array of characters that should be considered as leading trivia.
    * Leading trivia are characters that are not important to the developer, and so should not be
    * included in source-map segments.  A common example is whitespace.
    */
  var leadingTriviaChars: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The start and end point of the text to parse within the `source` string.
    * The entire `source` string is parsed if this is not provided.
    * */
  var range: js.UndefOr[LexerRange] = js.undefined
  /** Whether to tokenize ICU messages (considered as text nodes when false). */
  var tokenizeExpansionForms: js.UndefOr[Boolean] = js.undefined
}

object TokenizeOptions {
  @scala.inline
  def apply(
    escapedString: js.UndefOr[Boolean] = js.undefined,
    interpolationConfig: InterpolationConfig = null,
    leadingTriviaChars: js.Array[String] = null,
    range: LexerRange = null,
    tokenizeExpansionForms: js.UndefOr[Boolean] = js.undefined
  ): TokenizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(escapedString)) __obj.updateDynamic("escapedString")(escapedString.asInstanceOf[js.Any])
    if (interpolationConfig != null) __obj.updateDynamic("interpolationConfig")(interpolationConfig.asInstanceOf[js.Any])
    if (leadingTriviaChars != null) __obj.updateDynamic("leadingTriviaChars")(leadingTriviaChars.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(tokenizeExpansionForms)) __obj.updateDynamic("tokenizeExpansionForms")(tokenizeExpansionForms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizeOptions]
  }
}

