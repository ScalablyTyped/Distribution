package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that modify how the text is tokenized.
  */
trait TokenizeOptions extends StObject {
  
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
  
  /** How to tokenize interpolation markers. */
  var interpolationConfig: js.UndefOr[InterpolationConfig] = js.undefined
  
  /**
    * An array of characters that should be considered as leading trivia.
    * Leading trivia are characters that are not important to the developer, and so should not be
    * included in source-map segments.  A common example is whitespace.
    */
  var leadingTriviaChars: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If true, do not convert CRLF to LF.
    */
  var preserveLineEndings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The start and end point of the text to parse within the `source` string.
    * The entire `source` string is parsed if this is not provided.
    * */
  var range: js.UndefOr[LexerRange] = js.undefined
  
  /** Whether to tokenize ICU messages (considered as text nodes when false). */
  var tokenizeExpansionForms: js.UndefOr[Boolean] = js.undefined
}
object TokenizeOptions {
  
  inline def apply(): TokenizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
    
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
    
    inline def setRange(value: LexerRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setTokenizeExpansionForms(value: Boolean): Self = StObject.set(x, "tokenizeExpansionForms", value.asInstanceOf[js.Any])
    
    inline def setTokenizeExpansionFormsUndefined: Self = StObject.set(x, "tokenizeExpansionForms", js.undefined)
  }
}
