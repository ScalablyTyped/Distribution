package typings.angularCompiler

import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.angularCompiler.tagsMod.TagDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mlParserLexerMod {
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", "CursorError")
  @js.native
  class CursorError protected () extends StObject {
    def this(msg: String, cursor: CharacterCursor) = this()
    
    var cursor: CharacterCursor = js.native
    
    var msg: String = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", "Token")
  @js.native
  class Token protected () extends StObject {
    def this(`type`: Null, parts: js.Array[String], sourceSpan: ParseSourceSpan) = this()
    def this(`type`: TokenType, parts: js.Array[String], sourceSpan: ParseSourceSpan) = this()
    
    var parts: js.Array[String] = js.native
    
    var sourceSpan: ParseSourceSpan = js.native
    
    var `type`: TokenType | Null = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", "TokenError")
  @js.native
  class TokenError protected () extends ParseError {
    def this(errorMsg: String, tokenType: Null, span: ParseSourceSpan) = this()
    def this(errorMsg: String, tokenType: TokenType, span: ParseSourceSpan) = this()
    
    var tokenType: TokenType | Null = js.native
  }
  
  @js.native
  sealed trait TokenType extends StObject
  @JSImport("@angular/compiler/src/ml_parser/lexer", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TokenType & Double] = js.native
    
    @js.native
    sealed trait ATTR_NAME
      extends StObject
         with TokenType
    /* 12 */ val ATTR_NAME: typings.angularCompiler.mlParserLexerMod.TokenType.ATTR_NAME & Double = js.native
    
    @js.native
    sealed trait ATTR_QUOTE
      extends StObject
         with TokenType
    /* 13 */ val ATTR_QUOTE: typings.angularCompiler.mlParserLexerMod.TokenType.ATTR_QUOTE & Double = js.native
    
    @js.native
    sealed trait ATTR_VALUE
      extends StObject
         with TokenType
    /* 14 */ val ATTR_VALUE: typings.angularCompiler.mlParserLexerMod.TokenType.ATTR_VALUE & Double = js.native
    
    @js.native
    sealed trait CDATA_END
      extends StObject
         with TokenType
    /* 11 */ val CDATA_END: typings.angularCompiler.mlParserLexerMod.TokenType.CDATA_END & Double = js.native
    
    @js.native
    sealed trait CDATA_START
      extends StObject
         with TokenType
    /* 10 */ val CDATA_START: typings.angularCompiler.mlParserLexerMod.TokenType.CDATA_START & Double = js.native
    
    @js.native
    sealed trait COMMENT_END
      extends StObject
         with TokenType
    /* 9 */ val COMMENT_END: typings.angularCompiler.mlParserLexerMod.TokenType.COMMENT_END & Double = js.native
    
    @js.native
    sealed trait COMMENT_START
      extends StObject
         with TokenType
    /* 8 */ val COMMENT_START: typings.angularCompiler.mlParserLexerMod.TokenType.COMMENT_START & Double = js.native
    
    @js.native
    sealed trait DOC_TYPE
      extends StObject
         with TokenType
    /* 15 */ val DOC_TYPE: typings.angularCompiler.mlParserLexerMod.TokenType.DOC_TYPE & Double = js.native
    
    @js.native
    sealed trait EOF
      extends StObject
         with TokenType
    /* 21 */ val EOF: typings.angularCompiler.mlParserLexerMod.TokenType.EOF & Double = js.native
    
    @js.native
    sealed trait ESCAPABLE_RAW_TEXT
      extends StObject
         with TokenType
    /* 6 */ val ESCAPABLE_RAW_TEXT: typings.angularCompiler.mlParserLexerMod.TokenType.ESCAPABLE_RAW_TEXT & Double = js.native
    
    @js.native
    sealed trait EXPANSION_CASE_EXP_END
      extends StObject
         with TokenType
    /* 19 */ val EXPANSION_CASE_EXP_END: typings.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_CASE_EXP_END & Double = js.native
    
    @js.native
    sealed trait EXPANSION_CASE_EXP_START
      extends StObject
         with TokenType
    /* 18 */ val EXPANSION_CASE_EXP_START: typings.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_CASE_EXP_START & Double = js.native
    
    @js.native
    sealed trait EXPANSION_CASE_VALUE
      extends StObject
         with TokenType
    /* 17 */ val EXPANSION_CASE_VALUE: typings.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_CASE_VALUE & Double = js.native
    
    @js.native
    sealed trait EXPANSION_FORM_END
      extends StObject
         with TokenType
    /* 20 */ val EXPANSION_FORM_END: typings.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_FORM_END & Double = js.native
    
    @js.native
    sealed trait EXPANSION_FORM_START
      extends StObject
         with TokenType
    /* 16 */ val EXPANSION_FORM_START: typings.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_FORM_START & Double = js.native
    
    @js.native
    sealed trait INCOMPLETE_TAG_OPEN
      extends StObject
         with TokenType
    /* 4 */ val INCOMPLETE_TAG_OPEN: typings.angularCompiler.mlParserLexerMod.TokenType.INCOMPLETE_TAG_OPEN & Double = js.native
    
    @js.native
    sealed trait RAW_TEXT
      extends StObject
         with TokenType
    /* 7 */ val RAW_TEXT: typings.angularCompiler.mlParserLexerMod.TokenType.RAW_TEXT & Double = js.native
    
    @js.native
    sealed trait TAG_CLOSE
      extends StObject
         with TokenType
    /* 3 */ val TAG_CLOSE: typings.angularCompiler.mlParserLexerMod.TokenType.TAG_CLOSE & Double = js.native
    
    @js.native
    sealed trait TAG_OPEN_END
      extends StObject
         with TokenType
    /* 1 */ val TAG_OPEN_END: typings.angularCompiler.mlParserLexerMod.TokenType.TAG_OPEN_END & Double = js.native
    
    @js.native
    sealed trait TAG_OPEN_END_VOID
      extends StObject
         with TokenType
    /* 2 */ val TAG_OPEN_END_VOID: typings.angularCompiler.mlParserLexerMod.TokenType.TAG_OPEN_END_VOID & Double = js.native
    
    @js.native
    sealed trait TAG_OPEN_START
      extends StObject
         with TokenType
    /* 0 */ val TAG_OPEN_START: typings.angularCompiler.mlParserLexerMod.TokenType.TAG_OPEN_START & Double = js.native
    
    @js.native
    sealed trait TEXT
      extends StObject
         with TokenType
    /* 5 */ val TEXT: typings.angularCompiler.mlParserLexerMod.TokenType.TEXT & Double = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", "TokenizeResult")
  @js.native
  class TokenizeResult protected () extends StObject {
    def this(
      tokens: js.Array[Token],
      errors: js.Array[TokenError],
      nonNormalizedIcuExpressions: js.Array[Token]
    ) = this()
    
    var errors: js.Array[TokenError] = js.native
    
    var nonNormalizedIcuExpressions: js.Array[Token] = js.native
    
    var tokens: js.Array[Token] = js.native
  }
  
  @scala.inline
  def tokenize(source: String, url: String, getTagDefinition: js.Function1[/* tagName */ String, TagDefinition]): TokenizeResult = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(source.asInstanceOf[js.Any], url.asInstanceOf[js.Any], getTagDefinition.asInstanceOf[js.Any])).asInstanceOf[TokenizeResult]
  @scala.inline
  def tokenize(
    source: String,
    url: String,
    getTagDefinition: js.Function1[/* tagName */ String, TagDefinition],
    options: TokenizeOptions
  ): TokenizeResult = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(source.asInstanceOf[js.Any], url.asInstanceOf[js.Any], getTagDefinition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokenizeResult]
  
  /**
    * The _Tokenizer uses objects of this type to move through the input text,
    * extracting "parsed characters". These could be more than one actual character
    * if the text contains escape sequences.
    */
  @js.native
  trait CharacterCursor extends StObject {
    
    /** Advance the cursor by one parsed character. */
    def advance(): Unit = js.native
    
    /** The number of characters left before the end of the cursor. */
    def charsLeft(): Double = js.native
    
    /** The number of characters between `this` cursor and `other` cursor. */
    def diff(other: this.type): Double = js.native
    
    /** Get the parsed characters from the marked start point to the current point. */
    def getChars(start: this.type): String = js.native
    
    /** Get a span from the marked start point to the current point. */
    def getSpan(): ParseSourceSpan = js.native
    def getSpan(start: Unit, leadingTriviaCodePoints: js.Array[Double]): ParseSourceSpan = js.native
    def getSpan(start: this.type): ParseSourceSpan = js.native
    def getSpan(start: this.type, leadingTriviaCodePoints: js.Array[Double]): ParseSourceSpan = js.native
    
    /** Initialize the cursor. */
    def init(): Unit = js.native
    
    /** The parsed character at the current cursor position. */
    def peek(): Double = js.native
  }
  
  trait LexerRange extends StObject {
    
    var endPos: Double
    
    var startCol: Double
    
    var startLine: Double
    
    var startPos: Double
  }
  object LexerRange {
    
    @scala.inline
    def apply(endPos: Double, startCol: Double, startLine: Double, startPos: Double): LexerRange = {
      val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexerRange]
    }
    
    @scala.inline
    implicit class LexerRangeMutableBuilder[Self <: LexerRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndPos(value: Double): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    @scala.inline
    def apply(): TokenizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeOptions]
    }
    
    @scala.inline
    implicit class TokenizeOptionsMutableBuilder[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscapedString(value: Boolean): Self = StObject.set(x, "escapedString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapedStringUndefined: Self = StObject.set(x, "escapedString", js.undefined)
      
      @scala.inline
      def setI18nNormalizeLineEndingsInICUs(value: Boolean): Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nNormalizeLineEndingsInICUsUndefined: Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", js.undefined)
      
      @scala.inline
      def setInterpolationConfig(value: InterpolationConfig): Self = StObject.set(x, "interpolationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolationConfigUndefined: Self = StObject.set(x, "interpolationConfig", js.undefined)
      
      @scala.inline
      def setLeadingTriviaChars(value: js.Array[String]): Self = StObject.set(x, "leadingTriviaChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingTriviaCharsUndefined: Self = StObject.set(x, "leadingTriviaChars", js.undefined)
      
      @scala.inline
      def setLeadingTriviaCharsVarargs(value: String*): Self = StObject.set(x, "leadingTriviaChars", js.Array(value :_*))
      
      @scala.inline
      def setPreserveLineEndings(value: Boolean): Self = StObject.set(x, "preserveLineEndings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLineEndingsUndefined: Self = StObject.set(x, "preserveLineEndings", js.undefined)
      
      @scala.inline
      def setRange(value: LexerRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setTokenizeExpansionForms(value: Boolean): Self = StObject.set(x, "tokenizeExpansionForms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenizeExpansionFormsUndefined: Self = StObject.set(x, "tokenizeExpansionForms", js.undefined)
    }
  }
}
