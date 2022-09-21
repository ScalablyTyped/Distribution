package typings.acorn

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.acorn.acornStrings.module
import typings.acorn.acornStrings.never
import typings.acorn.acornStrings.script
import typings.acorn.anon.Arrow
import typings.acorn.anon.Bexpr
import typings.acorn.anon.Call
import typings.acorn.anon.TypeofParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("acorn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("acorn", "Node")
  @js.native
  open class Node protected () extends StObject {
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
  open class Parser protected () extends StObject {
    // state.js
    def this(options: Options, input: String) = this()
    def this(options: Options, input: String, startPos: Double) = this()
    
    var curLine: Double = js.native
    
    var end: Double = js.native
    
    // node.js
    def finishNode(node: Node, `type`: String): Node = js.native
    
    def finishNodeAt(node: Node, `type`: String, pos: Double, loc: Position): Node = js.native
    
    var input: String = js.native
    
    // state.js
    var lineStart: Double = js.native
    
    // tokenize.js
    def next(): Unit = js.native
    
    def nextToken(): Unit = js.native
    
    var options: Options = js.native
    
    def parse(): Node = js.native
    
    // statement.js
    def parseTopLevel(node: Node): Node = js.native
    
    // location.js
    def raise(pos: Double, message: String): Unit = js.native
    
    var raiseRecoverable: js.UndefOr[js.Function2[/* pos */ Double, /* message */ String, Unit]] = js.native
    
    var start: Double = js.native
    
    var `type`: TokenType = js.native
    
    // parseutils.js
    def unexpected(pos: Double): Unit = js.native
  }
  object Parser {
    
    @JSImport("acorn", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    // index.js
    /* static member */
    /* was `typeof acorn` */
    // index.js
    /* static member */
    /* was `typeof acorn` */
    object acorn {
      
      @JSImport("acorn", "Parser.acorn")
      @js.native
      val ^ : js.Any = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("acorn", "Parser.acorn.Node")
      @js.native
      open class Node protected ()
        extends typings.acorn.mod.Node {
        def this(parser: typings.acorn.mod.Parser, pos: Double) = this()
        def this(parser: typings.acorn.mod.Parser, pos: Double, loc: typings.acorn.mod.SourceLocation) = this()
      }
      @JSImport("acorn", "Parser.acorn.Node")
      @js.native
      def Node: Instantiable3[
            /* parser */ typings.acorn.mod.Parser, 
            /* pos */ Double, 
            /* loc */ js.UndefOr[typings.acorn.mod.SourceLocation], 
            typings.acorn.mod.Node
          ] = js.native
      inline def Node_=(
        x: Instantiable3[
              /* parser */ typings.acorn.mod.Parser, 
              /* pos */ Double, 
              /* loc */ js.UndefOr[typings.acorn.mod.SourceLocation], 
              typings.acorn.mod.Node
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("acorn", "Parser.acorn.Parser")
      @js.native
      open class Parser protected ()
        extends typings.acorn.mod.Parser {
        // state.js
        def this(options: Options, input: String) = this()
        def this(options: Options, input: String, startPos: Double) = this()
      }
      @JSImport("acorn", "Parser.acorn.Parser")
      @js.native
      def Parser: (Instantiable3[
            /* options */ Options, 
            /* input */ String, 
            /* startPos */ js.UndefOr[Double], 
            typings.acorn.mod.Parser
          ]) | TypeofParser = js.native
      inline def Parser_=(
        x: (Instantiable3[
              /* options */ Options, 
              /* input */ String, 
              /* startPos */ js.UndefOr[Double], 
              typings.acorn.mod.Parser
            ]) | TypeofParser
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parser")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("acorn", "Parser.acorn.SourceLocation")
      @js.native
      open class SourceLocation protected ()
        extends typings.acorn.mod.SourceLocation {
        def this(p: typings.acorn.mod.Parser, start: Position, end: Position) = this()
      }
      @JSImport("acorn", "Parser.acorn.SourceLocation")
      @js.native
      def SourceLocation: Instantiable3[
            /* p */ typings.acorn.mod.Parser, 
            /* start */ Position, 
            /* end */ Position, 
            typings.acorn.mod.SourceLocation
          ] = js.native
      inline def SourceLocation_=(
        x: Instantiable3[
              /* p */ typings.acorn.mod.Parser, 
              /* start */ Position, 
              /* end */ Position, 
              typings.acorn.mod.SourceLocation
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SourceLocation")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("acorn", "Parser.acorn.TokContext")
      @js.native
      open class TokContext protected ()
        extends typings.acorn.mod.TokContext {
        def this(token: String, isExpr: Boolean, preserveSpace: Boolean) = this()
        def this(
          token: String,
          isExpr: Boolean,
          preserveSpace: Boolean,
          `override`: js.Function1[/* p */ typings.acorn.mod.Parser, Unit]
        ) = this()
      }
      @JSImport("acorn", "Parser.acorn.TokContext")
      @js.native
      def TokContext: Instantiable4[
            /* token */ String, 
            /* isExpr */ Boolean, 
            /* preserveSpace */ Boolean, 
            /* override */ js.UndefOr[js.Function1[/* p */ typings.acorn.mod.Parser, Unit]], 
            typings.acorn.mod.TokContext
          ] = js.native
      inline def TokContext_=(
        x: Instantiable4[
              /* token */ String, 
              /* isExpr */ Boolean, 
              /* preserveSpace */ Boolean, 
              /* override */ js.UndefOr[js.Function1[/* p */ typings.acorn.mod.Parser, Unit]], 
              typings.acorn.mod.TokContext
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TokContext")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("acorn", "Parser.acorn.Token")
      @js.native
      open class Token protected ()
        extends typings.acorn.mod.Token {
        def this(p: typings.acorn.mod.Parser) = this()
      }
      @JSImport("acorn", "Parser.acorn.Token")
      @js.native
      def Token: Instantiable1[/* p */ typings.acorn.mod.Parser, typings.acorn.mod.Token] = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("acorn", "Parser.acorn.TokenType")
      @js.native
      open class TokenType protected ()
        extends typings.acorn.mod.TokenType {
        def this(label: String) = this()
        def this(label: String, conf: Any) = this()
      }
      @JSImport("acorn", "Parser.acorn.TokenType")
      @js.native
      def TokenType: Instantiable2[/* label */ String, /* conf */ js.UndefOr[Any], typings.acorn.mod.TokenType] = js.native
      inline def TokenType_=(x: Instantiable2[/* label */ String, /* conf */ js.UndefOr[Any], typings.acorn.mod.TokenType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TokenType")(x.asInstanceOf[js.Any])
      
      inline def Token_=(x: Instantiable1[/* p */ typings.acorn.mod.Parser, typings.acorn.mod.Token]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Token")(x.asInstanceOf[js.Any])
      
      @JSImport("acorn", "Parser.acorn.defaultOptions")
      @js.native
      val defaultOptions: Options = js.native
      
      inline def getLineInfo(input: String, offset: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineInfo")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Position]
      
      inline def isIdentifierChar(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def isIdentifierChar(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isIdentifierStart(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def isIdentifierStart(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isNewLine(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewLine")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      @JSImport("acorn", "Parser.acorn.lineBreak")
      @js.native
      val lineBreak: js.RegExp = js.native
      
      @JSImport("acorn", "Parser.acorn.lineBreakG")
      @js.native
      val lineBreakG: js.RegExp = js.native
      
      inline def parse(input: String, options: Options): typings.acorn.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acorn.mod.Node]
      
      inline def parseExpressionAt(input: String, pos: Double, options: Options): typings.acorn.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpressionAt")(input.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acorn.mod.Node]
      
      @JSImport("acorn", "Parser.acorn.tokContexts")
      @js.native
      val tokContexts: Bexpr = js.native
      
      @JSImport("acorn", "Parser.acorn.tokTypes")
      @js.native
      val tokTypes: Arrow = js.native
      
      inline def tokenizer(input: String, options: Options): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call]
      
      @JSImport("acorn", "Parser.acorn.version")
      @js.native
      val version: String = js.native
    }
    
    /* static member */
    inline def extend(
      plugins: (js.Function1[
          /* BaseParser */ TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser]), 
          TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser])
        ])*
    ): TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser]) = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser])]
    
    // state.js
    /* static member */
    inline def parse(input: String, options: Options): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Node]
    
    /* static member */
    inline def parseExpressionAt(input: String, pos: Double, options: Options): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpressionAt")(input.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Node]
    
    /* static member */
    inline def tokenizer(input: String, options: Options): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call]
  }
  
  @JSImport("acorn", "SourceLocation")
  @js.native
  open class SourceLocation protected () extends StObject {
    def this(p: Parser, start: Position, end: Position) = this()
    
    var end: Position = js.native
    
    var source: js.UndefOr[String | Null] = js.native
    
    var start: Position = js.native
  }
  
  @JSImport("acorn", "TokContext")
  @js.native
  open class TokContext protected () extends StObject {
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
  open class Token protected () extends StObject {
    def this(p: Parser) = this()
    
    var end: Double = js.native
    
    var loc: js.UndefOr[SourceLocation] = js.native
    
    var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var start: Double = js.native
    
    var `type`: TokenType = js.native
    
    var value: Any = js.native
  }
  
  @JSImport("acorn", "TokenType")
  @js.native
  open class TokenType protected () extends StObject {
    def this(label: String) = this()
    def this(label: String, conf: Any) = this()
    
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
  
  inline def getLineInfo(input: String, offset: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineInfo")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Position]
  
  inline def isIdentifierChar(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isIdentifierChar(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIdentifierStart(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isIdentifierStart(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNewLine(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewLine")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("acorn", "lineBreak")
  @js.native
  val lineBreak: js.RegExp = js.native
  
  @JSImport("acorn", "lineBreakG")
  @js.native
  val lineBreakG: js.RegExp = js.native
  
  inline def parse(input: String, options: Options): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def parseExpressionAt(input: String, pos: Double, options: Options): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpressionAt")(input.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  object tokContexts {
    
    @JSImport("acorn", "tokContexts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("acorn", "tokContexts.b_expr")
    @js.native
    def bExpr: TokContext = js.native
    
    inline def bExpr_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_expr")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.b_stat")
    @js.native
    def bStat: TokContext = js.native
    
    inline def bStat_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_stat")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.b_tmpl")
    @js.native
    def bTmpl: TokContext = js.native
    
    inline def bTmpl_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_tmpl")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.f_expr")
    @js.native
    def fExpr: TokContext = js.native
    
    @JSImport("acorn", "tokContexts.f_expr_gen")
    @js.native
    def fExprGen: TokContext = js.native
    
    inline def fExprGen_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_expr_gen")(x.asInstanceOf[js.Any])
    
    inline def fExpr_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_expr")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.f_gen")
    @js.native
    def fGen: TokContext = js.native
    
    inline def fGen_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_gen")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.f_stat")
    @js.native
    def fStat: TokContext = js.native
    
    inline def fStat_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_stat")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.p_expr")
    @js.native
    def pExpr: TokContext = js.native
    
    inline def pExpr_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_expr")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.p_stat")
    @js.native
    def pStat: TokContext = js.native
    
    inline def pStat_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_stat")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokContexts.q_tmpl")
    @js.native
    def qTmpl: TokContext = js.native
    
    inline def qTmpl_=(x: TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("q_tmpl")(x.asInstanceOf[js.Any])
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
    inline def arrow_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrow")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.assign")
    @js.native
    def assign: TokenType = js.native
    inline def assign_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assign")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.backQuote")
    @js.native
    def backQuote: TokenType = js.native
    inline def backQuote_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backQuote")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bitShift")
    @js.native
    def bitShift: TokenType = js.native
    inline def bitShift_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitShift")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bitwiseAND")
    @js.native
    def bitwiseAND: TokenType = js.native
    inline def bitwiseAND_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseAND")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bitwiseOR")
    @js.native
    def bitwiseOR: TokenType = js.native
    inline def bitwiseOR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseOR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bitwiseXOR")
    @js.native
    def bitwiseXOR: TokenType = js.native
    inline def bitwiseXOR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseXOR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.braceL")
    @js.native
    def braceL: TokenType = js.native
    inline def braceL_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.braceR")
    @js.native
    def braceR: TokenType = js.native
    inline def braceR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bracketL")
    @js.native
    def bracketL: TokenType = js.native
    inline def bracketL_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.bracketR")
    @js.native
    def bracketR: TokenType = js.native
    inline def bracketR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._break")
    @js.native
    def break: TokenType = js.native
    
    inline def break_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_break")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._case")
    @js.native
    val `case`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._catch")
    @js.native
    val `catch`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._class")
    @js.native
    val `class`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes.coalesce")
    @js.native
    def coalesce: TokenType = js.native
    inline def coalesce_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coalesce")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.colon")
    @js.native
    def colon: TokenType = js.native
    inline def colon_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colon")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.comma")
    @js.native
    def comma: TokenType = js.native
    inline def comma_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comma")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._const")
    @js.native
    def const: TokenType = js.native
    
    inline def const_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_const")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._continue")
    @js.native
    def continue: TokenType = js.native
    
    inline def continue_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_continue")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._debugger")
    @js.native
    def debugger: TokenType = js.native
    
    inline def debugger_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debugger")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_default")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._delete")
    @js.native
    def delete: TokenType = js.native
    
    inline def delete_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_delete")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._do")
    @js.native
    val `do`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes.dollarBraceL")
    @js.native
    def dollarBraceL: TokenType = js.native
    inline def dollarBraceL_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dollarBraceL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.dot")
    @js.native
    def dot: TokenType = js.native
    inline def dot_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dot")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.ellipsis")
    @js.native
    def ellipsis: TokenType = js.native
    inline def ellipsis_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._else")
    @js.native
    val `else`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes.eof")
    @js.native
    def eof: TokenType = js.native
    inline def eof_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eof")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.eq")
    @js.native
    def eq_ : TokenType = js.native
    
    inline def eq__=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eq")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.equality")
    @js.native
    def equality: TokenType = js.native
    inline def equality_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equality")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._export")
    @js.native
    val `export`: TokenType = js.native
    
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
    
    @JSImport("acorn", "tokTypes._function")
    @js.native
    def function: TokenType = js.native
    
    inline def function_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_function")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._if")
    @js.native
    val `if`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._import")
    @js.native
    val `import`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._in")
    @js.native
    def in: TokenType = js.native
    
    inline def in_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_in")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.incDec")
    @js.native
    def incDec: TokenType = js.native
    inline def incDec_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incDec")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._instanceof")
    @js.native
    def instanceof: TokenType = js.native
    
    inline def instanceof_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instanceof")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.invalidTemplate")
    @js.native
    def invalidTemplate: TokenType = js.native
    inline def invalidTemplate_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidTemplate")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.logicalAND")
    @js.native
    def logicalAND: TokenType = js.native
    inline def logicalAND_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalAND")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.logicalOR")
    @js.native
    def logicalOR: TokenType = js.native
    inline def logicalOR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalOR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.modulo")
    @js.native
    def modulo: TokenType = js.native
    inline def modulo_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modulo")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.name")
    @js.native
    def name: TokenType = js.native
    inline def name_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._new")
    @js.native
    val `new`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._null")
    @js.native
    val `null`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes.num")
    @js.native
    def num: TokenType = js.native
    inline def num_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("num")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.parenL")
    @js.native
    def parenL: TokenType = js.native
    inline def parenL_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.parenR")
    @js.native
    def parenR: TokenType = js.native
    inline def parenR_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.plusMin")
    @js.native
    def plusMin: TokenType = js.native
    inline def plusMin_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plusMin")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.prefix")
    @js.native
    def prefix: TokenType = js.native
    inline def prefix_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.privateId")
    @js.native
    def privateId: TokenType = js.native
    inline def privateId_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("privateId")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.question")
    @js.native
    def question: TokenType = js.native
    
    @JSImport("acorn", "tokTypes.questionDot")
    @js.native
    def questionDot: TokenType = js.native
    inline def questionDot_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("questionDot")(x.asInstanceOf[js.Any])
    
    inline def question_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("question")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.regexp")
    @js.native
    def regexp: TokenType = js.native
    inline def regexp_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.relational")
    @js.native
    def relational: TokenType = js.native
    inline def relational_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relational")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._return")
    @js.native
    val `return`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes.semi")
    @js.native
    def semi: TokenType = js.native
    inline def semi_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semi")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.slash")
    @js.native
    def slash: TokenType = js.native
    inline def slash_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slash")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.star")
    @js.native
    def star: TokenType = js.native
    inline def star_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("star")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.starstar")
    @js.native
    def starstar: TokenType = js.native
    inline def starstar_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("starstar")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.string")
    @js.native
    def string: TokenType = js.native
    inline def string_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._super")
    @js.native
    val `super`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._switch")
    @js.native
    def switch: TokenType = js.native
    
    inline def switch_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_switch")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes.template")
    @js.native
    def template: TokenType = js.native
    inline def template_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
    
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
    
    @JSImport("acorn", "tokTypes._typeof")
    @js.native
    def typeof: TokenType = js.native
    
    inline def typeof_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_typeof")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._var")
    @js.native
    val `var`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._void")
    @js.native
    def void: TokenType = js.native
    
    inline def void_=(x: TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_void")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn", "tokTypes._while")
    @js.native
    val `while`: TokenType = js.native
    
    @JSImport("acorn", "tokTypes._with")
    @js.native
    val `with`: TokenType = js.native
  }
  
  inline def tokenizer(input: String, options: Options): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  @JSImport("acorn", "version")
  @js.native
  val version: String = js.native
  
  trait AbstractToken extends StObject
  
  trait Comment
    extends StObject
       with AbstractToken {
    
    var end: Double
    
    var loc: js.UndefOr[SourceLocation] = js.undefined
    
    var range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var start: Double
    
    var `type`: String
    
    var value: String
  }
  object Comment {
    
    inline def apply(end: Double, start: Double, `type`: String, value: String): Comment = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowHashBang: js.UndefOr[Boolean] = js.undefined
    
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
    
    var allowReserved: js.UndefOr[Boolean | never] = js.undefined
    
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined
    
    var directSourceFile: js.UndefOr[String] = js.undefined
    
    var ecmaVersion: typings.acorn.mod.ecmaVersion
    
    var locations: js.UndefOr[Boolean] = js.undefined
    
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
      ] = js.undefined
    
    var onInsertedSemicolon: js.UndefOr[
        js.Function2[/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position], Unit]
      ] = js.undefined
    
    var onToken: js.UndefOr[(js.Function1[/* token */ Token, Any]) | js.Array[Token]] = js.undefined
    
    var onTrailingComma: js.UndefOr[
        js.Function2[/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position], Unit]
      ] = js.undefined
    
    var preserveParens: js.UndefOr[Boolean] = js.undefined
    
    var program: js.UndefOr[Node] = js.undefined
    
    var ranges: js.UndefOr[Boolean] = js.undefined
    
    var sourceFile: js.UndefOr[String] = js.undefined
    
    var sourceType: js.UndefOr[script | module] = js.undefined
  }
  object Options {
    
    inline def apply(ecmaVersion: ecmaVersion): Options = {
      val __obj = js.Dynamic.literal(ecmaVersion = ecmaVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowAwaitOutsideFunction(value: Boolean): Self = StObject.set(x, "allowAwaitOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowAwaitOutsideFunctionUndefined: Self = StObject.set(x, "allowAwaitOutsideFunction", js.undefined)
      
      inline def setAllowHashBang(value: Boolean): Self = StObject.set(x, "allowHashBang", value.asInstanceOf[js.Any])
      
      inline def setAllowHashBangUndefined: Self = StObject.set(x, "allowHashBang", js.undefined)
      
      inline def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      inline def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      inline def setAllowReserved(value: Boolean | never): Self = StObject.set(x, "allowReserved", value.asInstanceOf[js.Any])
      
      inline def setAllowReservedUndefined: Self = StObject.set(x, "allowReserved", js.undefined)
      
      inline def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      inline def setAllowSuperOutsideMethod(value: Boolean): Self = StObject.set(x, "allowSuperOutsideMethod", value.asInstanceOf[js.Any])
      
      inline def setAllowSuperOutsideMethodUndefined: Self = StObject.set(x, "allowSuperOutsideMethod", js.undefined)
      
      inline def setDirectSourceFile(value: String): Self = StObject.set(x, "directSourceFile", value.asInstanceOf[js.Any])
      
      inline def setDirectSourceFileUndefined: Self = StObject.set(x, "directSourceFile", js.undefined)
      
      inline def setEcmaVersion(value: ecmaVersion): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      inline def setOnComment(
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
      
      inline def setOnCommentFunction6(
        value: (/* isBlock */ Boolean, /* text */ String, /* start */ Double, /* end */ Double, /* startLoc */ js.UndefOr[Position], /* endLoc */ js.UndefOr[Position]) => Unit
      ): Self = StObject.set(x, "onComment", js.Any.fromFunction6(value))
      
      inline def setOnCommentUndefined: Self = StObject.set(x, "onComment", js.undefined)
      
      inline def setOnCommentVarargs(value: Comment*): Self = StObject.set(x, "onComment", js.Array(value*))
      
      inline def setOnInsertedSemicolon(value: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position]) => Unit): Self = StObject.set(x, "onInsertedSemicolon", js.Any.fromFunction2(value))
      
      inline def setOnInsertedSemicolonUndefined: Self = StObject.set(x, "onInsertedSemicolon", js.undefined)
      
      inline def setOnToken(value: (js.Function1[/* token */ Token, Any]) | js.Array[Token]): Self = StObject.set(x, "onToken", value.asInstanceOf[js.Any])
      
      inline def setOnTokenFunction1(value: /* token */ Token => Any): Self = StObject.set(x, "onToken", js.Any.fromFunction1(value))
      
      inline def setOnTokenUndefined: Self = StObject.set(x, "onToken", js.undefined)
      
      inline def setOnTokenVarargs(value: Token*): Self = StObject.set(x, "onToken", js.Array(value*))
      
      inline def setOnTrailingComma(value: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position]) => Unit): Self = StObject.set(x, "onTrailingComma", js.Any.fromFunction2(value))
      
      inline def setOnTrailingCommaUndefined: Self = StObject.set(x, "onTrailingComma", js.undefined)
      
      inline def setPreserveParens(value: Boolean): Self = StObject.set(x, "preserveParens", value.asInstanceOf[js.Any])
      
      inline def setPreserveParensUndefined: Self = StObject.set(x, "preserveParens", js.undefined)
      
      inline def setProgram(value: Node): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
      
      inline def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var line: Double
    
    var offset: Double
  }
  object Position {
    
    inline def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.acorn.acornNumbers.`3`
    - typings.acorn.acornNumbers.`5`
    - typings.acorn.acornNumbers.`6`
    - typings.acorn.acornNumbers.`7`
    - typings.acorn.acornNumbers.`8`
    - typings.acorn.acornNumbers.`9`
    - typings.acorn.acornNumbers.`10`
    - typings.acorn.acornNumbers.`11`
    - typings.acorn.acornNumbers.`12`
    - typings.acorn.acornNumbers.`13`
    - typings.acorn.acornNumbers.`2015`
    - typings.acorn.acornNumbers.`2016`
    - typings.acorn.acornNumbers.`2017`
    - typings.acorn.acornNumbers.`2018`
    - typings.acorn.acornNumbers.`2019`
    - typings.acorn.acornNumbers.`2020`
    - typings.acorn.acornNumbers.`2021`
    - typings.acorn.acornNumbers.`2022`
    - typings.acorn.acornStrings.latest
  */
  trait ecmaVersion extends StObject
  object ecmaVersion {
    
    inline def `10`: typings.acorn.acornNumbers.`10` = 10.asInstanceOf[typings.acorn.acornNumbers.`10`]
    
    inline def `11`: typings.acorn.acornNumbers.`11` = 11.asInstanceOf[typings.acorn.acornNumbers.`11`]
    
    inline def `12`: typings.acorn.acornNumbers.`12` = 12.asInstanceOf[typings.acorn.acornNumbers.`12`]
    
    inline def `13`: typings.acorn.acornNumbers.`13` = 13.asInstanceOf[typings.acorn.acornNumbers.`13`]
    
    inline def `2015`: typings.acorn.acornNumbers.`2015` = 2015.asInstanceOf[typings.acorn.acornNumbers.`2015`]
    
    inline def `2016`: typings.acorn.acornNumbers.`2016` = 2016.asInstanceOf[typings.acorn.acornNumbers.`2016`]
    
    inline def `2017`: typings.acorn.acornNumbers.`2017` = 2017.asInstanceOf[typings.acorn.acornNumbers.`2017`]
    
    inline def `2018`: typings.acorn.acornNumbers.`2018` = 2018.asInstanceOf[typings.acorn.acornNumbers.`2018`]
    
    inline def `2019`: typings.acorn.acornNumbers.`2019` = 2019.asInstanceOf[typings.acorn.acornNumbers.`2019`]
    
    inline def `2020`: typings.acorn.acornNumbers.`2020` = 2020.asInstanceOf[typings.acorn.acornNumbers.`2020`]
    
    inline def `2021`: typings.acorn.acornNumbers.`2021` = 2021.asInstanceOf[typings.acorn.acornNumbers.`2021`]
    
    inline def `2022`: typings.acorn.acornNumbers.`2022` = 2022.asInstanceOf[typings.acorn.acornNumbers.`2022`]
    
    inline def `3`: typings.acorn.acornNumbers.`3` = 3.asInstanceOf[typings.acorn.acornNumbers.`3`]
    
    inline def `5`: typings.acorn.acornNumbers.`5` = 5.asInstanceOf[typings.acorn.acornNumbers.`5`]
    
    inline def `6`: typings.acorn.acornNumbers.`6` = 6.asInstanceOf[typings.acorn.acornNumbers.`6`]
    
    inline def `7`: typings.acorn.acornNumbers.`7` = 7.asInstanceOf[typings.acorn.acornNumbers.`7`]
    
    inline def `8`: typings.acorn.acornNumbers.`8` = 8.asInstanceOf[typings.acorn.acornNumbers.`8`]
    
    inline def `9`: typings.acorn.acornNumbers.`9` = 9.asInstanceOf[typings.acorn.acornNumbers.`9`]
    
    inline def latest: typings.acorn.acornStrings.latest = "latest".asInstanceOf[typings.acorn.acornStrings.latest]
  }
}
