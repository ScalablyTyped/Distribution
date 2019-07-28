package typings.atAngularCompiler.srcRender3ViewTemplateMod

import typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.LexerRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTemplateOptions extends js.Object {
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
  /**
    * How to parse interpolation markers.
    */
  var interpolationConfig: js.UndefOr[InterpolationConfig] = js.undefined
  /**
    * An array of characters that should be considered as leading trivia.
    * Leading trivia are characters that are not important to the developer, and so should not be
    * included in source-map segments.  A common example is whitespace.
    */
  var leadingTriviaChars: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Include whitespace nodes in the parsed output.
    */
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  /**
    * The start and end point of the text to parse within the `source` string.
    * The entire `source` string is parsed if this is not provided.
    * */
  var range: js.UndefOr[LexerRange] = js.undefined
}

object ParseTemplateOptions {
  @scala.inline
  def apply(
    escapedString: js.UndefOr[Boolean] = js.undefined,
    interpolationConfig: InterpolationConfig = null,
    leadingTriviaChars: js.Array[String] = null,
    preserveWhitespaces: js.UndefOr[Boolean] = js.undefined,
    range: LexerRange = null
  ): ParseTemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(escapedString)) __obj.updateDynamic("escapedString")(escapedString)
    if (interpolationConfig != null) __obj.updateDynamic("interpolationConfig")(interpolationConfig)
    if (leadingTriviaChars != null) __obj.updateDynamic("leadingTriviaChars")(leadingTriviaChars)
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ParseTemplateOptions]
  }
}

