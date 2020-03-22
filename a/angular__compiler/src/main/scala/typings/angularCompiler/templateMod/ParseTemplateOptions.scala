package typings.angularCompiler.templateMod

import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.mlParserLexerMod.LexerRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTemplateOptions extends js.Object {
  /**
    * Render `$localize` message ids with additional legacy message ids.
    *
    * This option defaults to `true` but in the future the defaul will be flipped.
    *
    * For now set this option to false if you have migrated the translation files to use the new
    * `$localize` message id format and you are not using compile time translation merging.
    */
  var enableI18nLegacyMessageIdFormat: js.UndefOr[Boolean] = js.undefined
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
    enableI18nLegacyMessageIdFormat: js.UndefOr[Boolean] = js.undefined,
    escapedString: js.UndefOr[Boolean] = js.undefined,
    interpolationConfig: InterpolationConfig = null,
    leadingTriviaChars: js.Array[String] = null,
    preserveWhitespaces: js.UndefOr[Boolean] = js.undefined,
    range: LexerRange = null
  ): ParseTemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableI18nLegacyMessageIdFormat)) __obj.updateDynamic("enableI18nLegacyMessageIdFormat")(enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(escapedString)) __obj.updateDynamic("escapedString")(escapedString.asInstanceOf[js.Any])
    if (interpolationConfig != null) __obj.updateDynamic("interpolationConfig")(interpolationConfig.asInstanceOf[js.Any])
    if (leadingTriviaChars != null) __obj.updateDynamic("leadingTriviaChars")(leadingTriviaChars.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseTemplateOptions]
  }
}

