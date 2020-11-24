package typings.acorn

import typings.acorn.anon.Call
import typings.acorn.anon.TypeofParser
import typings.acorn.mod.Options
import typings.acorn.mod.Position
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("acorn/dist/acorn.mjs", JSImport.Namespace)
@js.native
object acornMjsMod extends js.Object {
  
  val defaultOptions: Options = js.native
  
  def getLineInfo(input: String, offset: Double): Position = js.native
  
  def isIdentifierChar(code: Double): Boolean = js.native
  def isIdentifierChar(code: Double, astral: Boolean): Boolean = js.native
  
  def isIdentifierStart(code: Double): Boolean = js.native
  def isIdentifierStart(code: Double, astral: Boolean): Boolean = js.native
  
  def isNewLine(code: Double): Boolean = js.native
  
  val lineBreak: RegExp = js.native
  
  val lineBreakG: RegExp = js.native
  
  def parse(input: String): typings.acorn.mod.Node = js.native
  def parse(input: String, options: Options): typings.acorn.mod.Node = js.native
  
  def parseExpressionAt(input: String): typings.acorn.mod.Node = js.native
  def parseExpressionAt(input: String, pos: js.UndefOr[scala.Nothing], options: Options): typings.acorn.mod.Node = js.native
  def parseExpressionAt(input: String, pos: Double): typings.acorn.mod.Node = js.native
  def parseExpressionAt(input: String, pos: Double, options: Options): typings.acorn.mod.Node = js.native
  
  def tokenizer(input: String): Call = js.native
  def tokenizer(input: String, options: Options): Call = js.native
  
  val version: String = js.native
  
  @js.native
  class Node protected ()
    extends typings.acorn.mod.Node {
    def this(parser: typings.acorn.mod.Parser, pos: Double) = this()
    def this(parser: typings.acorn.mod.Parser, pos: Double, loc: typings.acorn.mod.SourceLocation) = this()
  }
  
  @js.native
  class Parser protected ()
    extends typings.acorn.mod.Parser {
    def this(options: Options, input: String) = this()
    def this(options: Options, input: String, startPos: Double) = this()
  }
  /* static members */
  @js.native
  object Parser extends js.Object {
    
    def extend(plugins: (js.Function1[/* BaseParser */ TypeofParser, TypeofParser])*): TypeofParser = js.native
    
    def parse(input: String): typings.acorn.mod.Node = js.native
    def parse(input: String, options: Options): typings.acorn.mod.Node = js.native
    
    def parseExpressionAt(input: String, pos: Double): typings.acorn.mod.Node = js.native
    def parseExpressionAt(input: String, pos: Double, options: Options): typings.acorn.mod.Node = js.native
    
    def tokenizer(input: String): Call = js.native
    def tokenizer(input: String, options: Options): Call = js.native
  }
  
  @js.native
  class SourceLocation protected ()
    extends typings.acorn.mod.SourceLocation {
    def this(p: typings.acorn.mod.Parser, start: Position, end: Position) = this()
  }
  
  @js.native
  class TokContext protected ()
    extends typings.acorn.mod.TokContext {
    def this(token: String, isExpr: Boolean, preserveSpace: Boolean) = this()
    def this(
      token: String,
      isExpr: Boolean,
      preserveSpace: Boolean,
      `override`: js.Function1[/* p */ typings.acorn.mod.Parser, Unit]
    ) = this()
  }
  
  @js.native
  class Token protected ()
    extends typings.acorn.mod.Token {
    def this(p: typings.acorn.mod.Parser) = this()
  }
  
  @js.native
  class TokenType protected ()
    extends typings.acorn.mod.TokenType {
    def this(label: String) = this()
    def this(label: String, conf: js.Any) = this()
  }
  
  @js.native
  object tokContexts extends js.Object {
    
    var b_expr: typings.acorn.mod.TokContext = js.native
    
    var b_stat: typings.acorn.mod.TokContext = js.native
    
    var b_tmpl: typings.acorn.mod.TokContext = js.native
    
    var f_expr: typings.acorn.mod.TokContext = js.native
    
    var p_expr: typings.acorn.mod.TokContext = js.native
    
    var p_stat: typings.acorn.mod.TokContext = js.native
    
    var q_tmpl: typings.acorn.mod.TokContext = js.native
  }
  
  @js.native
  object tokTypes extends js.Object {
    
    var _break: typings.acorn.mod.TokenType = js.native
    
    var _case: typings.acorn.mod.TokenType = js.native
    
    var _catch: typings.acorn.mod.TokenType = js.native
    
    var _class: typings.acorn.mod.TokenType = js.native
    
    var _const: typings.acorn.mod.TokenType = js.native
    
    var _continue: typings.acorn.mod.TokenType = js.native
    
    var _debugger: typings.acorn.mod.TokenType = js.native
    
    var _default: typings.acorn.mod.TokenType = js.native
    
    var _delete: typings.acorn.mod.TokenType = js.native
    
    var _do: typings.acorn.mod.TokenType = js.native
    
    var _else: typings.acorn.mod.TokenType = js.native
    
    var _export: typings.acorn.mod.TokenType = js.native
    
    var _extends: typings.acorn.mod.TokenType = js.native
    
    var _false: typings.acorn.mod.TokenType = js.native
    
    var _finally: typings.acorn.mod.TokenType = js.native
    
    var _for: typings.acorn.mod.TokenType = js.native
    
    var _function: typings.acorn.mod.TokenType = js.native
    
    var _if: typings.acorn.mod.TokenType = js.native
    
    var _import: typings.acorn.mod.TokenType = js.native
    
    var _in: typings.acorn.mod.TokenType = js.native
    
    var _instanceof: typings.acorn.mod.TokenType = js.native
    
    var _new: typings.acorn.mod.TokenType = js.native
    
    var _null: typings.acorn.mod.TokenType = js.native
    
    var _return: typings.acorn.mod.TokenType = js.native
    
    var _super: typings.acorn.mod.TokenType = js.native
    
    var _switch: typings.acorn.mod.TokenType = js.native
    
    var _this: typings.acorn.mod.TokenType = js.native
    
    var _throw: typings.acorn.mod.TokenType = js.native
    
    var _true: typings.acorn.mod.TokenType = js.native
    
    var _try: typings.acorn.mod.TokenType = js.native
    
    var _typeof: typings.acorn.mod.TokenType = js.native
    
    var _var: typings.acorn.mod.TokenType = js.native
    
    var _void: typings.acorn.mod.TokenType = js.native
    
    var _while: typings.acorn.mod.TokenType = js.native
    
    var _with: typings.acorn.mod.TokenType = js.native
    
    var arrow: typings.acorn.mod.TokenType = js.native
    
    var assign: typings.acorn.mod.TokenType = js.native
    
    var backQuote: typings.acorn.mod.TokenType = js.native
    
    var bitShift: typings.acorn.mod.TokenType = js.native
    
    var bitwiseAND: typings.acorn.mod.TokenType = js.native
    
    var bitwiseOR: typings.acorn.mod.TokenType = js.native
    
    var bitwiseXOR: typings.acorn.mod.TokenType = js.native
    
    var braceL: typings.acorn.mod.TokenType = js.native
    
    var braceR: typings.acorn.mod.TokenType = js.native
    
    var bracketL: typings.acorn.mod.TokenType = js.native
    
    var bracketR: typings.acorn.mod.TokenType = js.native
    
    var colon: typings.acorn.mod.TokenType = js.native
    
    var comma: typings.acorn.mod.TokenType = js.native
    
    var dollarBraceL: typings.acorn.mod.TokenType = js.native
    
    var dot: typings.acorn.mod.TokenType = js.native
    
    var ellipsis: typings.acorn.mod.TokenType = js.native
    
    var eof: typings.acorn.mod.TokenType = js.native
    
    @JSName("eq")
    var eq_FtokTypes: typings.acorn.mod.TokenType = js.native
    
    var equality: typings.acorn.mod.TokenType = js.native
    
    var incDec: typings.acorn.mod.TokenType = js.native
    
    var logicalAND: typings.acorn.mod.TokenType = js.native
    
    var logicalOR: typings.acorn.mod.TokenType = js.native
    
    var modulo: typings.acorn.mod.TokenType = js.native
    
    var name: typings.acorn.mod.TokenType = js.native
    
    var num: typings.acorn.mod.TokenType = js.native
    
    var parenL: typings.acorn.mod.TokenType = js.native
    
    var parenR: typings.acorn.mod.TokenType = js.native
    
    var plusMin: typings.acorn.mod.TokenType = js.native
    
    var prefix: typings.acorn.mod.TokenType = js.native
    
    var question: typings.acorn.mod.TokenType = js.native
    
    var regexp: typings.acorn.mod.TokenType = js.native
    
    var relational: typings.acorn.mod.TokenType = js.native
    
    var semi: typings.acorn.mod.TokenType = js.native
    
    var slash: typings.acorn.mod.TokenType = js.native
    
    var star: typings.acorn.mod.TokenType = js.native
    
    var starstar: typings.acorn.mod.TokenType = js.native
    
    var string: typings.acorn.mod.TokenType = js.native
    
    var template: typings.acorn.mod.TokenType = js.native
  }
}
