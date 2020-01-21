package typings.angularCompiler

import typings.angularCompiler.cssAstMod.CssStyleSheetAst
import typings.angularCompiler.cssLexerMod.CssTokenType
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceFile
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_parser", JSImport.Namespace)
@js.native
object cssParserMod extends js.Object {
  @js.native
  class CssParseError protected () extends ParseError {
    def this(span: ParseSourceSpan, message: String) = this()
  }
  
  @js.native
  class CssParser () extends js.Object {
    var _errors: js.Any = js.native
    var _file: js.Any = js.native
    var _lastToken: js.Any = js.native
    var _scanner: js.Any = js.native
    /**
      * @param css the CSS code that will be parsed
      * @param url the name of the CSS file containing the CSS source code
      */
    def parse(css: String, url: String): ParsedCssResult = js.native
  }
  
  @js.native
  class CssToken protected ()
    extends typings.angularCompiler.cssLexerMod.CssToken {
    def this(index: Double, column: Double, line: Double, `type`: CssTokenType, strValue: String) = this()
  }
  
  @js.native
  class ParsedCssResult protected () extends js.Object {
    def this(errors: js.Array[CssParseError], ast: CssStyleSheetAst) = this()
    var ast: CssStyleSheetAst = js.native
    var errors: js.Array[CssParseError] = js.native
  }
  
  @js.native
  object BlockType extends js.Object {
    /* 1 */ val Charset: typings.angularCompiler.cssAstMod.BlockType.Charset with Double = js.native
    /* 9 */ val Document: typings.angularCompiler.cssAstMod.BlockType.Document with Double = js.native
    /* 7 */ val FontFace: typings.angularCompiler.cssAstMod.BlockType.FontFace with Double = js.native
    /* 0 */ val Import: typings.angularCompiler.cssAstMod.BlockType.Import with Double = js.native
    /* 4 */ val Keyframes: typings.angularCompiler.cssAstMod.BlockType.Keyframes with Double = js.native
    /* 5 */ val MediaQuery: typings.angularCompiler.cssAstMod.BlockType.MediaQuery with Double = js.native
    /* 2 */ val Namespace: typings.angularCompiler.cssAstMod.BlockType.Namespace with Double = js.native
    /* 8 */ val Page: typings.angularCompiler.cssAstMod.BlockType.Page with Double = js.native
    /* 6 */ val Selector: typings.angularCompiler.cssAstMod.BlockType.Selector with Double = js.native
    /* 3 */ val Supports: typings.angularCompiler.cssAstMod.BlockType.Supports with Double = js.native
    /* 11 */ val Unsupported: typings.angularCompiler.cssAstMod.BlockType.Unsupported with Double = js.native
    /* 10 */ val Viewport: typings.angularCompiler.cssAstMod.BlockType.Viewport with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompiler.cssAstMod.BlockType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object CssParseError extends js.Object {
    def create(file: ParseSourceFile, offset: Double, line: Double, col: Double, length: Double, errMsg: String): CssParseError = js.native
  }
  
}

