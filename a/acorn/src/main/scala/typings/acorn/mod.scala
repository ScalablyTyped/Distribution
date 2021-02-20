package typings.acorn

import org.scalablytyped.runtime.Instantiable3
import typings.acorn.acornNumbers.`10`
import typings.acorn.acornNumbers.`11`
import typings.acorn.acornNumbers.`2015`
import typings.acorn.acornNumbers.`2016`
import typings.acorn.acornNumbers.`2017`
import typings.acorn.acornNumbers.`2018`
import typings.acorn.acornNumbers.`2019`
import typings.acorn.acornNumbers.`2020`
import typings.acorn.acornNumbers.`3`
import typings.acorn.acornNumbers.`5`
import typings.acorn.acornNumbers.`6`
import typings.acorn.acornNumbers.`7`
import typings.acorn.acornNumbers.`8`
import typings.acorn.acornNumbers.`9`
import typings.acorn.acornStrings.module
import typings.acorn.acornStrings.never
import typings.acorn.acornStrings.script
import typings.acorn.anon.Call
import typings.acorn.anon.TypeofParser
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("acorn", "Node")
  @js.native
  class Node protected () extends StObject {
    def this(parser: Parser, pos: Double) = this()
    def this(parser: Parser, pos: Double, loc: SourceLocation) = this()
    
    var end: Double = js.native
    
    var loc: js.UndefOr[SourceLocation] = js.native
    
    var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var sourceFile: js.UndefOr[String] = js.native
    
    var start: Double = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("acorn", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(options: Options, input: String) = this()
    def this(options: Options, input: String, startPos: Double) = this()
    
    def parse(): Node = js.native
  }
  object Parser {
    
    /* static member */
    @JSImport("acorn", "Parser.extend")
    @js.native
    def extend(
      plugins: (js.Function1[
          /* BaseParser */ TypeofParser with (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser]), 
          TypeofParser with (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser])
        ])*
    ): TypeofParser with (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser]) = js.native
    
    /* static member */
    @JSImport("acorn", "Parser.parse")
    @js.native
    def parse(input: String): Node = js.native
    @JSImport("acorn", "Parser.parse")
    @js.native
    def parse(input: String, options: Options): Node = js.native
    
    /* static member */
    @JSImport("acorn", "Parser.parseExpressionAt")
    @js.native
    def parseExpressionAt(input: String, pos: Double): Node = js.native
    @JSImport("acorn", "Parser.parseExpressionAt")
    @js.native
    def parseExpressionAt(input: String, pos: Double, options: Options): Node = js.native
    
    /* static member */
    @JSImport("acorn", "Parser.tokenizer")
    @js.native
    def tokenizer(input: String): Call = js.native
    @JSImport("acorn", "Parser.tokenizer")
    @js.native
    def tokenizer(input: String, options: Options): Call = js.native
  }
  
  @JSImport("acorn", "SourceLocation")
  @js.native
  class SourceLocation protected () extends StObject {
    def this(p: Parser, start: Position, end: Position) = this()
    
    var end: Position = js.native
    
    var source: js.UndefOr[String | Null] = js.native
    
    var start: Position = js.native
  }
  
  @JSImport("acorn", "TokContext")
  @js.native
  class TokContext protected () extends StObject {
    def this(token: String, isExpr: Boolean, preserveSpace: Boolean) = this()
    def this(
      token: String,
      isExpr: Boolean,
      preserveSpace: Boolean,
      `override`: js.Function1[/* p */ Parser, Unit]
    ) = this()
  }
  
  @JSImport("acorn", "Token")
  @js.native
  class Token protected () extends StObject {
    def this(p: Parser) = this()
    
    var end: Double = js.native
    
    var loc: js.UndefOr[SourceLocation] = js.native
    
    var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var start: Double = js.native
    
    var `type`: TokenType = js.native
    
    var value: js.Any = js.native
  }
  
  @JSImport("acorn", "TokenType")
  @js.native
  class TokenType protected () extends StObject {
    def this(label: String) = this()
    def this(label: String, conf: js.Any) = this()
    
    var beforeExpr: Boolean = js.native
    
    var binop: Double = js.native
    
    var isAssign: Boolean = js.native
    
    var isLoop: Boolean = js.native
    
    var keyword: String = js.native
    
    var label: String = js.native
    
    var postfix: Boolean = js.native
    
    var prefix: Boolean = js.native
    
    var startsExpr: Boolean = js.native
    
    var updateContext: js.UndefOr[js.Function1[/* prevType */ this.type, Unit]] = js.native
  }
  
  @JSImport("acorn", "defaultOptions")
  @js.native
  val defaultOptions: Options = js.native
  
  @JSImport("acorn", "getLineInfo")
  @js.native
  def getLineInfo(input: String, offset: Double): Position = js.native
  
  @JSImport("acorn", "isIdentifierChar")
  @js.native
  def isIdentifierChar(code: Double): Boolean = js.native
  @JSImport("acorn", "isIdentifierChar")
  @js.native
  def isIdentifierChar(code: Double, astral: Boolean): Boolean = js.native
  
  @JSImport("acorn", "isIdentifierStart")
  @js.native
  def isIdentifierStart(code: Double): Boolean = js.native
  @JSImport("acorn", "isIdentifierStart")
  @js.native
  def isIdentifierStart(code: Double, astral: Boolean): Boolean = js.native
  
  @JSImport("acorn", "isNewLine")
  @js.native
  def isNewLine(code: Double): Boolean = js.native
  
  @JSImport("acorn", "lineBreak")
  @js.native
  val lineBreak: RegExp = js.native
  
  @JSImport("acorn", "lineBreakG")
  @js.native
  val lineBreakG: RegExp = js.native
  
  @JSImport("acorn", "parse")
  @js.native
  def parse(input: String): Node = js.native
  @JSImport("acorn", "parse")
  @js.native
  def parse(input: String, options: Options): Node = js.native
  
  @JSImport("acorn", "parseExpressionAt")
  @js.native
  def parseExpressionAt(input: String): Node = js.native
  @JSImport("acorn", "parseExpressionAt")
  @js.native
  def parseExpressionAt(input: String, pos: js.UndefOr[scala.Nothing], options: Options): Node = js.native
  @JSImport("acorn", "parseExpressionAt")
  @js.native
  def parseExpressionAt(input: String, pos: Double): Node = js.native
  @JSImport("acorn", "parseExpressionAt")
  @js.native
  def parseExpressionAt(input: String, pos: Double, options: Options): Node = js.native
  
  object tokContexts {
    
    @JSImport("acorn", "tokContexts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("acorn", "tokContexts.b_expr")
    @js.native
    def bExpr: TokContext = js.native
    
    @scala.inline
    def bExpr_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_expr")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.b_stat")
    @js.native
    def bStat: TokContext = js.native
    
    @scala.inline
    def bStat_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_stat")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.b_tmpl")
    @js.native
    def bTmpl: TokContext = js.native
    
    @scala.inline
    def bTmpl_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_tmpl")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.f_expr")
    @js.native
    def fExpr: TokContext = js.native
    
    @scala.inline
    def fExpr_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_expr")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.p_expr")
    @js.native
    def pExpr: TokContext = js.native
    
    @scala.inline
    def pExpr_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_expr")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.p_stat")
    @js.native
    def pStat: TokContext = js.native
    
    @scala.inline
    def pStat_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_stat")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.q_tmpl")
    @js.native
    def qTmpl: TokContext = js.native
    
    @scala.inline
    def qTmpl_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("q_tmpl")(x.asInstanceOf[js.Any])
  }
  
  object tokTypes {
    
    @JSImport("acorn", "tokTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("acorn", "tokTypes._default")
    @js.native
    def default: TokenType = js.native
    
    @JSImport("acorn", "tokTypes.arrow")
    @js.native
    def arrow: TokenType = js.native
    @scala.inline
    def arrow_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrow")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.assign")
    @js.native
    def assign: TokenType = js.native
    @scala.inline
    def assign_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assign")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.backQuote")
    @js.native
    def backQuote: TokenType = js.native
    @scala.inline
    def backQuote_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backQuote")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bitShift")
    @js.native
    def bitShift: TokenType = js.native
    @scala.inline
    def bitShift_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitShift")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bitwiseAND")
    @js.native
    def bitwiseAND: TokenType = js.native
    @scala.inline
    def bitwiseAND_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseAND")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bitwiseOR")
    @js.native
    def bitwiseOR: TokenType = js.native
    @scala.inline
    def bitwiseOR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseOR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bitwiseXOR")
    @js.native
    def bitwiseXOR: TokenType = js.native
    @scala.inline
    def bitwiseXOR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseXOR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.braceL")
    @js.native
    def braceL: TokenType = js.native
    @scala.inline
    def braceL_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.braceR")
    @js.native
    def braceR: TokenType = js.native
    @scala.inline
    def braceR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bracketL")
    @js.native
    def bracketL: TokenType = js.native
    @scala.inline
    def bracketL_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bracketR")
    @js.native
    def bracketR: TokenType = js.native
    @scala.inline
    def bracketR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._break")
    @js.native
    def break: TokenType = js.native
    
    @scala.inline
    def break_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_break")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.colon")
    @js.native
    def colon: TokenType = js.native
    @scala.inline
    def colon_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colon")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.comma")
    @js.native
    def comma: TokenType = js.native
    @scala.inline
    def comma_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comma")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._const")
    @js.native
    def const: TokenType = js.native
    
    @scala.inline
    def const_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_const")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._continue")
    @js.native
    def continue: TokenType = js.native
    
    @scala.inline
    def continue_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_continue")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._debugger")
    @js.native
    def debugger: TokenType = js.native
    
    @scala.inline
    def debugger_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debugger")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def default_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_default")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._delete")
    @js.native
    def delete: TokenType = js.native
    
    @scala.inline
    def delete_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_delete")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.dollarBraceL")
    @js.native
    def dollarBraceL: TokenType = js.native
    @scala.inline
    def dollarBraceL_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dollarBraceL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.dot")
    @js.native
    def dot: TokenType = js.native
    @scala.inline
    def dot_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dot")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.ellipsis")
    @js.native
    def ellipsis: TokenType = js.native
    @scala.inline
    def ellipsis_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.eof")
    @js.native
    def eof: TokenType = js.native
    @scala.inline
    def eof_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eof")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.eq")
    @js.native
    def eq_ : TokenType = js.native
    
    @scala.inline
    def eq__=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eq")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.equality")
    @js.native
    def equality: TokenType = js.native
    @scala.inline
    def equality_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equality")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._export")
    @js.native
    def export: TokenType = js.native
    
    @scala.inline
    def export_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_export")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._function")
    @js.native
    def function: TokenType = js.native
    
    @scala.inline
    def function_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_function")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._in")
    @js.native
    def in: TokenType = js.native
    
    @scala.inline
    def in_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_in")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.incDec")
    @js.native
    def incDec: TokenType = js.native
    @scala.inline
    def incDec_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incDec")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._instanceof")
    @js.native
    def instanceof: TokenType = js.native
    
    @scala.inline
    def instanceof_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instanceof")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.logicalAND")
    @js.native
    def logicalAND: TokenType = js.native
    @scala.inline
    def logicalAND_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalAND")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.logicalOR")
    @js.native
    def logicalOR: TokenType = js.native
    @scala.inline
    def logicalOR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalOR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.modulo")
    @js.native
    def modulo: TokenType = js.native
    @scala.inline
    def modulo_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modulo")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.name")
    @js.native
    def name: TokenType = js.native
    @scala.inline
    def name_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.num")
    @js.native
    def num: TokenType = js.native
    @scala.inline
    def num_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("num")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.parenL")
    @js.native
    def parenL: TokenType = js.native
    @scala.inline
    def parenL_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.parenR")
    @js.native
    def parenR: TokenType = js.native
    @scala.inline
    def parenR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.plusMin")
    @js.native
    def plusMin: TokenType = js.native
    @scala.inline
    def plusMin_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plusMin")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.prefix")
    @js.native
    def prefix: TokenType = js.native
    @scala.inline
    def prefix_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.question")
    @js.native
    def question: TokenType = js.native
    @scala.inline
    def question_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("question")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.regexp")
    @js.native
    def regexp: TokenType = js.native
    @scala.inline
    def regexp_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.relational")
    @js.native
    def relational: TokenType = js.native
    @scala.inline
    def relational_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relational")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.semi")
    @js.native
    def semi: TokenType = js.native
    @scala.inline
    def semi_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semi")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.slash")
    @js.native
    def slash: TokenType = js.native
    @scala.inline
    def slash_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slash")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.star")
    @js.native
    def star: TokenType = js.native
    @scala.inline
    def star_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("star")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.starstar")
    @js.native
    def starstar: TokenType = js.native
    @scala.inline
    def starstar_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("starstar")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.string")
    @js.native
    def string: TokenType = js.native
    @scala.inline
    def string_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._switch")
    @js.native
    def switch: TokenType = js.native
    
    @scala.inline
    def switch_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_switch")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.template")
    @js.native
    def template: TokenType = js.native
    @scala.inline
    def template_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._typeof")
    @js.native
    def typeof: TokenType = js.native
    
    @scala.inline
    def typeof_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_typeof")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._void")
    @js.native
    def void: TokenType = js.native
    
    @scala.inline
    def void_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_void")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._case")
    @js.native
    val `case`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._catch")
    @js.native
    val `catch`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._class")
    @js.native
    val `class`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._do")
    @js.native
    val `do`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._else")
    @js.native
    val `else`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._extends")
    @js.native
    val `extends`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._false")
    @js.native
    val `false`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._finally")
    @js.native
    val `finally`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._for")
    @js.native
    val `for`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._if")
    @js.native
    val `if`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._import")
    @js.native
    val `import`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._new")
    @js.native
    val `new`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._null")
    @js.native
    val `null`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._return")
    @js.native
    val `return`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._super")
    @js.native
    val `super`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._this")
    @js.native
    val `this`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._throw")
    @js.native
    val `throw`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._true")
    @js.native
    val `true`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._try")
    @js.native
    val `try`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._var")
    @js.native
    val `var`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._while")
    @js.native
    val `while`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._with")
    @js.native
    val `with`: TokenType = js.native
  }
  
  @JSImport("acorn", "tokenizer")
  @js.native
  def tokenizer(input: String): Call = js.native
  @JSImport("acorn", "tokenizer")
  @js.native
  def tokenizer(input: String, options: Options): Call = js.native
  
  @JSImport("acorn", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait AbstractToken extends StObject
  
  @js.native
  trait Comment extends AbstractToken {
    
    var end: Double = js.native
    
    var loc: js.UndefOr[SourceLocation] = js.native
    
    var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var start: Double = js.native
    
    var `type`: String = js.native
    
    var value: String = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(end: Double, start: Double, `type`: String, value: String): Comment = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      @scala.inline
      def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.native
    
    var allowHashBang: js.UndefOr[Boolean] = js.native
    
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
    
    var allowReserved: js.UndefOr[Boolean | never] = js.native
    
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
    
    var directSourceFile: js.UndefOr[String] = js.native
    
    var ecmaVersion: js.UndefOr[
        `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020`
      ] = js.native
    
    var locations: js.UndefOr[Boolean] = js.native
    
    var onComment: js.UndefOr[
        (js.Function6[
          /* isBlock */ Boolean, 
          /* text */ String, 
          /* start */ Double, 
          /* end */ Double, 
          /* startLoc */ js.UndefOr[Position], 
          /* endLoc */ js.UndefOr[Position], 
          Unit
        ]) | js.Array[Comment]
      ] = js.native
    
    var onInsertedSemicolon: js.UndefOr[
        js.Function2[/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position], Unit]
      ] = js.native
    
    var onToken: js.UndefOr[(js.Function1[/* token */ Token, _]) | js.Array[Token]] = js.native
    
    var onTrailingComma: js.UndefOr[
        js.Function2[/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position], Unit]
      ] = js.native
    
    var preserveParens: js.UndefOr[Boolean] = js.native
    
    var program: js.UndefOr[Node] = js.native
    
    var ranges: js.UndefOr[Boolean] = js.native
    
    var sourceFile: js.UndefOr[String] = js.native
    
    var sourceType: js.UndefOr[script | module] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAwaitOutsideFunction(value: Boolean): Self = StObject.set(x, "allowAwaitOutsideFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAwaitOutsideFunctionUndefined: Self = StObject.set(x, "allowAwaitOutsideFunction", js.undefined)
      
      @scala.inline
      def setAllowHashBang(value: Boolean): Self = StObject.set(x, "allowHashBang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHashBangUndefined: Self = StObject.set(x, "allowHashBang", js.undefined)
      
      @scala.inline
      def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      @scala.inline
      def setAllowReserved(value: Boolean | never): Self = StObject.set(x, "allowReserved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReservedUndefined: Self = StObject.set(x, "allowReserved", js.undefined)
      
      @scala.inline
      def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      @scala.inline
      def setDirectSourceFile(value: String): Self = StObject.set(x, "directSourceFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectSourceFileUndefined: Self = StObject.set(x, "directSourceFile", js.undefined)
      
      @scala.inline
      def setEcmaVersion(
        value: `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020`
      ): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
      
      @scala.inline
      def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      @scala.inline
      def setOnComment(
        value: (js.Function6[
              /* isBlock */ Boolean, 
              /* text */ String, 
              /* start */ Double, 
              /* end */ Double, 
              /* startLoc */ js.UndefOr[Position], 
              /* endLoc */ js.UndefOr[Position], 
              Unit
            ]) | js.Array[Comment]
      ): Self = StObject.set(x, "onComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCommentFunction6(
        value: (/* isBlock */ Boolean, /* text */ String, /* start */ Double, /* end */ Double, /* startLoc */ js.UndefOr[Position], /* endLoc */ js.UndefOr[Position]) => Unit
      ): Self = StObject.set(x, "onComment", js.Any.fromFunction6(value))
      
      @scala.inline
      def setOnCommentUndefined: Self = StObject.set(x, "onComment", js.undefined)
      
      @scala.inline
      def setOnCommentVarargs(value: Comment*): Self = StObject.set(x, "onComment", js.Array(value :_*))
      
      @scala.inline
      def setOnInsertedSemicolon(value: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position]) => Unit): Self = StObject.set(x, "onInsertedSemicolon", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInsertedSemicolonUndefined: Self = StObject.set(x, "onInsertedSemicolon", js.undefined)
      
      @scala.inline
      def setOnToken(value: (js.Function1[/* token */ Token, _]) | js.Array[Token]): Self = StObject.set(x, "onToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTokenFunction1(value: /* token */ Token => _): Self = StObject.set(x, "onToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTokenUndefined: Self = StObject.set(x, "onToken", js.undefined)
      
      @scala.inline
      def setOnTokenVarargs(value: Token*): Self = StObject.set(x, "onToken", js.Array(value :_*))
      
      @scala.inline
      def setOnTrailingComma(value: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position]) => Unit): Self = StObject.set(x, "onTrailingComma", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTrailingCommaUndefined: Self = StObject.set(x, "onTrailingComma", js.undefined)
      
      @scala.inline
      def setPreserveParens(value: Boolean): Self = StObject.set(x, "preserveParens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveParensUndefined: Self = StObject.set(x, "preserveParens", js.undefined)
      
      @scala.inline
      def setProgram(value: Node): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
      
      @scala.inline
      def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
  
  @js.native
  trait Position extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var offset: Double = js.native
  }
  object Position {
    
    @scala.inline
    def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
