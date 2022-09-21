package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseTemplateOptions extends StObject {
  
  /**
    * Whether to always attempt to convert the parsed HTML AST to an R3 AST, despite HTML or i18n
    * Meta parse errors.
    *
    *
    * This option is useful in the context of the language service, where we want to get as much
    * information as possible, despite any errors in the HTML. As an example, a user may be adding
    * a new tag and expecting autocomplete on that tag. In this scenario, the HTML is in an errored
    * state, as there is an incomplete open tag. However, we're still able to convert the HTML AST
    * nodes to R3 AST nodes in order to provide information for the language service.
    *
    * Note that even when `true` the HTML parse and i18n errors are still appended to the errors
    * output, but this is done after converting the HTML AST to R3 AST.
    */
  var alwaysAttemptHtmlToR3AstConversion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include HTML Comment nodes in a top-level comments array on the returned R3 AST.
    *
    * This option is required by tooling that needs to know the location of comment nodes within the
    * AST. A concrete example is @angular-eslint which requires this in order to enable
    * "eslint-disable" comments within HTML templates, which then allows users to turn off specific
    * rules on a case by case basis, instead of for their whole project within a configuration file.
    */
  var collectCommentNodes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Render `$localize` message ids with additional legacy message ids.
    *
    * This option defaults to `true` but in the future the default will be flipped.
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
    * If this text is stored in an external template (e.g. via `templateUrl`) then we need to decide
    * whether or not to normalize the line-endings (from `\r\n` to `\n`) when processing ICU
    * expressions.
    *
    * If `true` then we will normalize ICU expression line endings.
    * The default is `false`, but this will be switched in a future major release.
    */
  var i18nNormalizeLineEndingsInICUs: js.UndefOr[Boolean] = js.undefined
  
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
    * Preserve original line endings instead of normalizing '\r\n' endings to '\n'.
    */
  var preserveLineEndings: js.UndefOr[Boolean] = js.undefined
  
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
  
  inline def apply(): ParseTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseTemplateOptions]
  }
  
  extension [Self <: ParseTemplateOptions](x: Self) {
    
    inline def setAlwaysAttemptHtmlToR3AstConversion(value: Boolean): Self = StObject.set(x, "alwaysAttemptHtmlToR3AstConversion", value.asInstanceOf[js.Any])
    
    inline def setAlwaysAttemptHtmlToR3AstConversionUndefined: Self = StObject.set(x, "alwaysAttemptHtmlToR3AstConversion", js.undefined)
    
    inline def setCollectCommentNodes(value: Boolean): Self = StObject.set(x, "collectCommentNodes", value.asInstanceOf[js.Any])
    
    inline def setCollectCommentNodesUndefined: Self = StObject.set(x, "collectCommentNodes", js.undefined)
    
    inline def setEnableI18nLegacyMessageIdFormat(value: Boolean): Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", value.asInstanceOf[js.Any])
    
    inline def setEnableI18nLegacyMessageIdFormatUndefined: Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", js.undefined)
    
    inline def setEscapedString(value: Boolean): Self = StObject.set(x, "escapedString", value.asInstanceOf[js.Any])
    
    inline def setEscapedStringUndefined: Self = StObject.set(x, "escapedString", js.undefined)
    
    inline def setI18nNormalizeLineEndingsInICUs(value: Boolean): Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", value.asInstanceOf[js.Any])
    
    inline def setI18nNormalizeLineEndingsInICUsUndefined: Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", js.undefined)
    
    inline def setInterpolationConfig(value: InterpolationConfig): Self = StObject.set(x, "interpolationConfig", value.asInstanceOf[js.Any])
    
    inline def setInterpolationConfigUndefined: Self = StObject.set(x, "interpolationConfig", js.undefined)
    
    inline def setLeadingTriviaChars(value: js.Array[String]): Self = StObject.set(x, "leadingTriviaChars", value.asInstanceOf[js.Any])
    
    inline def setLeadingTriviaCharsUndefined: Self = StObject.set(x, "leadingTriviaChars", js.undefined)
    
    inline def setLeadingTriviaCharsVarargs(value: String*): Self = StObject.set(x, "leadingTriviaChars", js.Array(value*))
    
    inline def setPreserveLineEndings(value: Boolean): Self = StObject.set(x, "preserveLineEndings", value.asInstanceOf[js.Any])
    
    inline def setPreserveLineEndingsUndefined: Self = StObject.set(x, "preserveLineEndings", js.undefined)
    
    inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    inline def setRange(value: LexerRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
