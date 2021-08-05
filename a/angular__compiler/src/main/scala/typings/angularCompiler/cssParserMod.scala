package typings.angularCompiler

import typings.angularCompiler.cssAstMod.CssStyleSheetAst
import typings.angularCompiler.cssLexerMod.CssTokenType
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceFile
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssParserMod {
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "BlockType")
  @js.native
  object BlockType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompiler.cssAstMod.BlockType & Double] = js.native
    
    /* 1 */ val Charset: typings.angularCompiler.cssAstMod.BlockType.Charset & Double = js.native
    
    /* 9 */ val Document: typings.angularCompiler.cssAstMod.BlockType.Document & Double = js.native
    
    /* 7 */ val FontFace: typings.angularCompiler.cssAstMod.BlockType.FontFace & Double = js.native
    
    /* 0 */ val Import: typings.angularCompiler.cssAstMod.BlockType.Import & Double = js.native
    
    /* 4 */ val Keyframes: typings.angularCompiler.cssAstMod.BlockType.Keyframes & Double = js.native
    
    /* 5 */ val MediaQuery: typings.angularCompiler.cssAstMod.BlockType.MediaQuery & Double = js.native
    
    /* 2 */ val Namespace: typings.angularCompiler.cssAstMod.BlockType.Namespace & Double = js.native
    
    /* 8 */ val Page: typings.angularCompiler.cssAstMod.BlockType.Page & Double = js.native
    
    /* 6 */ val Selector: typings.angularCompiler.cssAstMod.BlockType.Selector & Double = js.native
    
    /* 3 */ val Supports: typings.angularCompiler.cssAstMod.BlockType.Supports & Double = js.native
    
    /* 11 */ val Unsupported: typings.angularCompiler.cssAstMod.BlockType.Unsupported & Double = js.native
    
    /* 10 */ val Viewport: typings.angularCompiler.cssAstMod.BlockType.Viewport & Double = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "CssParseError")
  @js.native
  class CssParseError protected () extends ParseError {
    def this(span: ParseSourceSpan, message: String) = this()
  }
  /* static members */
  object CssParseError {
    
    @JSImport("@angular/compiler/src/css_parser/css_parser", "CssParseError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(file: ParseSourceFile, offset: Double, line: Double, col: Double, length: Double, errMsg: String): CssParseError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], line.asInstanceOf[js.Any], col.asInstanceOf[js.Any], length.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[CssParseError]
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "CssParser")
  @js.native
  class CssParser () extends StObject {
    
    /* private */ var _errors: js.Any = js.native
    
    /* private */ var _file: js.Any = js.native
    
    /* private */ var _lastToken: js.Any = js.native
    
    /* private */ var _scanner: js.Any = js.native
    
    /**
      * @param css the CSS code that will be parsed
      * @param url the name of the CSS file containing the CSS source code
      */
    def parse(css: String, url: String): ParsedCssResult = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "CssToken")
  @js.native
  class CssToken protected ()
    extends typings.angularCompiler.cssLexerMod.CssToken {
    def this(index: Double, column: Double, line: Double, `type`: CssTokenType, strValue: String) = this()
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "ParsedCssResult")
  @js.native
  class ParsedCssResult protected () extends StObject {
    def this(errors: js.Array[CssParseError], ast: CssStyleSheetAst) = this()
    
    var ast: CssStyleSheetAst = js.native
    
    var errors: js.Array[CssParseError] = js.native
  }
}
