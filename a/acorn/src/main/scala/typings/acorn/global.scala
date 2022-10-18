package typings.acorn

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.acorn.anon.Arrow
import typings.acorn.anon.Bexpr
import typings.acorn.anon.GetToken
import typings.acorn.anon.TypeofParser
import typings.acorn.mod.Options
import typings.acorn.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object acorn {
    
    @JSGlobal("acorn")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("acorn.Node")
    @js.native
    open class Node protected ()
      extends typings.acorn.mod.Node {
      def this(parser: typings.acorn.mod.Parser, pos: Double) = this()
      def this(parser: typings.acorn.mod.Parser, pos: Double, loc: typings.acorn.mod.SourceLocation) = this()
    }
    
    @JSGlobal("acorn.Parser")
    @js.native
    open class Parser protected ()
      extends typings.acorn.mod.Parser {
      // state.js
      def this(options: Options, input: String) = this()
      def this(options: Options, input: String, startPos: Double) = this()
    }
    object Parser {
      
      @JSGlobal("acorn.Parser")
      @js.native
      val ^ : js.Any = js.native
      
      // index.js
      /* static member */
      /* was `typeof acorn` */
      // index.js
      /* static member */
      /* was `typeof acorn` */
      object acorn {
        
        @JSGlobal("acorn.Parser.acorn")
        @js.native
        val ^ : js.Any = js.native
        
        /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
        @JSGlobal("acorn.Parser.acorn.Node")
        @js.native
        open class Node protected ()
          extends typings.acorn.mod.Node {
          def this(parser: typings.acorn.mod.Parser, pos: Double) = this()
          def this(parser: typings.acorn.mod.Parser, pos: Double, loc: typings.acorn.mod.SourceLocation) = this()
        }
        @JSGlobal("acorn.Parser.acorn.Node")
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
        @JSGlobal("acorn.Parser.acorn.Parser")
        @js.native
        open class Parser protected ()
          extends typings.acorn.mod.Parser {
          // state.js
          def this(options: Options, input: String) = this()
          def this(options: Options, input: String, startPos: Double) = this()
        }
        @JSGlobal("acorn.Parser.acorn.Parser")
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
        @JSGlobal("acorn.Parser.acorn.SourceLocation")
        @js.native
        open class SourceLocation protected ()
          extends typings.acorn.mod.SourceLocation {
          def this(p: typings.acorn.mod.Parser, start: Position, end: Position) = this()
        }
        @JSGlobal("acorn.Parser.acorn.SourceLocation")
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
        @JSGlobal("acorn.Parser.acorn.TokContext")
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
        @JSGlobal("acorn.Parser.acorn.TokContext")
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
        @JSGlobal("acorn.Parser.acorn.Token")
        @js.native
        open class Token protected ()
          extends typings.acorn.mod.Token {
          def this(p: typings.acorn.mod.Parser) = this()
        }
        @JSGlobal("acorn.Parser.acorn.Token")
        @js.native
        def Token: Instantiable1[/* p */ typings.acorn.mod.Parser, typings.acorn.mod.Token] = js.native
        
        /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
        @JSGlobal("acorn.Parser.acorn.TokenType")
        @js.native
        open class TokenType protected ()
          extends typings.acorn.mod.TokenType {
          def this(label: String) = this()
          def this(label: String, conf: Any) = this()
        }
        @JSGlobal("acorn.Parser.acorn.TokenType")
        @js.native
        def TokenType: Instantiable2[/* label */ String, /* conf */ js.UndefOr[Any], typings.acorn.mod.TokenType] = js.native
        inline def TokenType_=(x: Instantiable2[/* label */ String, /* conf */ js.UndefOr[Any], typings.acorn.mod.TokenType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TokenType")(x.asInstanceOf[js.Any])
        
        inline def Token_=(x: Instantiable1[/* p */ typings.acorn.mod.Parser, typings.acorn.mod.Token]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Token")(x.asInstanceOf[js.Any])
        
        @JSGlobal("acorn.Parser.acorn.defaultOptions")
        @js.native
        val defaultOptions: Options = js.native
        
        inline def getLineInfo(input: String, offset: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineInfo")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Position]
        
        inline def isIdentifierChar(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
        inline def isIdentifierChar(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
        
        inline def isIdentifierStart(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
        inline def isIdentifierStart(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
        
        inline def isNewLine(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewLine")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
        
        @JSGlobal("acorn.Parser.acorn.lineBreak")
        @js.native
        val lineBreak: js.RegExp = js.native
        
        @JSGlobal("acorn.Parser.acorn.lineBreakG")
        @js.native
        val lineBreakG: js.RegExp = js.native
        
        inline def parse(input: String, options: Options): typings.acorn.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acorn.mod.Node]
        
        inline def parseExpressionAt(input: String, pos: Double, options: Options): typings.acorn.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpressionAt")(input.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acorn.mod.Node]
        
        @JSGlobal("acorn.Parser.acorn.tokContexts")
        @js.native
        val tokContexts: Bexpr = js.native
        
        @JSGlobal("acorn.Parser.acorn.tokTypes")
        @js.native
        val tokTypes: Arrow = js.native
        
        inline def tokenizer(input: String, options: Options): GetToken = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GetToken]
        
        @JSGlobal("acorn.Parser.acorn.version")
        @js.native
        val version: String = js.native
      }
      
      /* static member */
      inline def extend(
        plugins: (js.Function1[
              /* BaseParser */ TypeofParser & (Instantiable3[
                /* options */ Options, 
                /* input */ String, 
                /* startPos */ js.UndefOr[Double], 
                typings.acorn.mod.Parser
              ]), 
              TypeofParser & (Instantiable3[
                /* options */ Options, 
                /* input */ String, 
                /* startPos */ js.UndefOr[Double], 
                typings.acorn.mod.Parser
              ])
            ])*
      ): TypeofParser & (Instantiable3[
            /* options */ Options, 
            /* input */ String, 
            /* startPos */ js.UndefOr[Double], 
            typings.acorn.mod.Parser
          ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TypeofParser & (Instantiable3[
            /* options */ Options, 
            /* input */ String, 
            /* startPos */ js.UndefOr[Double], 
            typings.acorn.mod.Parser
          ])]
      
      // state.js
      /* static member */
      inline def parse(input: String, options: Options): typings.acorn.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acorn.mod.Node]
      
      /* static member */
      inline def parseExpressionAt(input: String, pos: Double, options: Options): typings.acorn.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpressionAt")(input.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acorn.mod.Node]
      
      /* static member */
      inline def tokenizer(input: String, options: Options): GetToken = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GetToken]
    }
    
    @JSGlobal("acorn.SourceLocation")
    @js.native
    open class SourceLocation protected ()
      extends typings.acorn.mod.SourceLocation {
      def this(p: typings.acorn.mod.Parser, start: Position, end: Position) = this()
    }
    
    @JSGlobal("acorn.TokContext")
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
    
    @JSGlobal("acorn.Token")
    @js.native
    open class Token protected ()
      extends typings.acorn.mod.Token {
      def this(p: typings.acorn.mod.Parser) = this()
    }
    
    @JSGlobal("acorn.TokenType")
    @js.native
    open class TokenType protected ()
      extends typings.acorn.mod.TokenType {
      def this(label: String) = this()
      def this(label: String, conf: Any) = this()
    }
    
    @JSGlobal("acorn.defaultOptions")
    @js.native
    val defaultOptions: Options = js.native
    
    inline def getLineInfo(input: String, offset: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineInfo")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Position]
    
    inline def isIdentifierChar(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isIdentifierChar(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isIdentifierStart(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isIdentifierStart(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isNewLine(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewLine")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("acorn.lineBreak")
    @js.native
    val lineBreak: js.RegExp = js.native
    
    @JSGlobal("acorn.lineBreakG")
    @js.native
    val lineBreakG: js.RegExp = js.native
    
    inline def parse(input: String, options: Options): typings.acorn.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acorn.mod.Node]
    
    inline def parseExpressionAt(input: String, pos: Double, options: Options): typings.acorn.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpressionAt")(input.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acorn.mod.Node]
    
    object tokContexts {
      
      @JSGlobal("acorn.tokContexts")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("acorn.tokContexts.b_expr")
      @js.native
      def bExpr: typings.acorn.mod.TokContext = js.native
      
      inline def bExpr_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_expr")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokContexts.b_stat")
      @js.native
      def bStat: typings.acorn.mod.TokContext = js.native
      
      inline def bStat_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_stat")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokContexts.b_tmpl")
      @js.native
      def bTmpl: typings.acorn.mod.TokContext = js.native
      
      inline def bTmpl_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_tmpl")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokContexts.f_expr")
      @js.native
      def fExpr: typings.acorn.mod.TokContext = js.native
      
      @JSGlobal("acorn.tokContexts.f_expr_gen")
      @js.native
      def fExprGen: typings.acorn.mod.TokContext = js.native
      
      inline def fExprGen_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_expr_gen")(x.asInstanceOf[js.Any])
      
      inline def fExpr_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_expr")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokContexts.f_gen")
      @js.native
      def fGen: typings.acorn.mod.TokContext = js.native
      
      inline def fGen_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_gen")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokContexts.f_stat")
      @js.native
      def fStat: typings.acorn.mod.TokContext = js.native
      
      inline def fStat_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_stat")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokContexts.p_expr")
      @js.native
      def pExpr: typings.acorn.mod.TokContext = js.native
      
      inline def pExpr_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_expr")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokContexts.p_stat")
      @js.native
      def pStat: typings.acorn.mod.TokContext = js.native
      
      inline def pStat_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_stat")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokContexts.q_tmpl")
      @js.native
      def qTmpl: typings.acorn.mod.TokContext = js.native
      
      inline def qTmpl_=(x: typings.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("q_tmpl")(x.asInstanceOf[js.Any])
    }
    
    object tokTypes {
      
      @JSGlobal("acorn.tokTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("acorn.tokTypes._default")
      @js.native
      def default: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes.arrow")
      @js.native
      def arrow: typings.acorn.mod.TokenType = js.native
      inline def arrow_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrow")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.assign")
      @js.native
      def assign: typings.acorn.mod.TokenType = js.native
      inline def assign_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assign")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.backQuote")
      @js.native
      def backQuote: typings.acorn.mod.TokenType = js.native
      inline def backQuote_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backQuote")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.bitShift")
      @js.native
      def bitShift: typings.acorn.mod.TokenType = js.native
      inline def bitShift_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitShift")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.bitwiseAND")
      @js.native
      def bitwiseAND: typings.acorn.mod.TokenType = js.native
      inline def bitwiseAND_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseAND")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.bitwiseOR")
      @js.native
      def bitwiseOR: typings.acorn.mod.TokenType = js.native
      inline def bitwiseOR_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseOR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.bitwiseXOR")
      @js.native
      def bitwiseXOR: typings.acorn.mod.TokenType = js.native
      inline def bitwiseXOR_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseXOR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.braceL")
      @js.native
      def braceL: typings.acorn.mod.TokenType = js.native
      inline def braceL_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.braceR")
      @js.native
      def braceR: typings.acorn.mod.TokenType = js.native
      inline def braceR_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.bracketL")
      @js.native
      def bracketL: typings.acorn.mod.TokenType = js.native
      inline def bracketL_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.bracketR")
      @js.native
      def bracketR: typings.acorn.mod.TokenType = js.native
      inline def bracketR_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._break")
      @js.native
      def break: typings.acorn.mod.TokenType = js.native
      
      inline def break_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_break")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._case")
      @js.native
      val `case`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._catch")
      @js.native
      val `catch`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._class")
      @js.native
      val `class`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes.coalesce")
      @js.native
      def coalesce: typings.acorn.mod.TokenType = js.native
      inline def coalesce_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coalesce")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.colon")
      @js.native
      def colon: typings.acorn.mod.TokenType = js.native
      inline def colon_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colon")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.comma")
      @js.native
      def comma: typings.acorn.mod.TokenType = js.native
      inline def comma_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comma")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._const")
      @js.native
      def const: typings.acorn.mod.TokenType = js.native
      
      inline def const_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_const")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._continue")
      @js.native
      def continue: typings.acorn.mod.TokenType = js.native
      
      inline def continue_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_continue")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._debugger")
      @js.native
      def debugger: typings.acorn.mod.TokenType = js.native
      
      inline def debugger_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debugger")(x.asInstanceOf[js.Any])
      
      inline def default_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_default")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._delete")
      @js.native
      def delete: typings.acorn.mod.TokenType = js.native
      
      inline def delete_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_delete")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._do")
      @js.native
      val `do`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes.dollarBraceL")
      @js.native
      def dollarBraceL: typings.acorn.mod.TokenType = js.native
      inline def dollarBraceL_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dollarBraceL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.dot")
      @js.native
      def dot: typings.acorn.mod.TokenType = js.native
      inline def dot_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dot")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.ellipsis")
      @js.native
      def ellipsis: typings.acorn.mod.TokenType = js.native
      inline def ellipsis_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._else")
      @js.native
      val `else`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes.eof")
      @js.native
      def eof: typings.acorn.mod.TokenType = js.native
      inline def eof_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eof")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.eq")
      @js.native
      def eq_ : typings.acorn.mod.TokenType = js.native
      
      inline def eq__=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eq")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.equality")
      @js.native
      def equality: typings.acorn.mod.TokenType = js.native
      inline def equality_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equality")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._export")
      @js.native
      val `export`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._extends")
      @js.native
      val `extends`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._false")
      @js.native
      val `false`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._finally")
      @js.native
      val `finally`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._for")
      @js.native
      val `for`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._function")
      @js.native
      def function: typings.acorn.mod.TokenType = js.native
      
      inline def function_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_function")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._if")
      @js.native
      val `if`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._import")
      @js.native
      val `import`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._in")
      @js.native
      def in: typings.acorn.mod.TokenType = js.native
      
      inline def in_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_in")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.incDec")
      @js.native
      def incDec: typings.acorn.mod.TokenType = js.native
      inline def incDec_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incDec")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._instanceof")
      @js.native
      def instanceof: typings.acorn.mod.TokenType = js.native
      
      inline def instanceof_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instanceof")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.invalidTemplate")
      @js.native
      def invalidTemplate: typings.acorn.mod.TokenType = js.native
      inline def invalidTemplate_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidTemplate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.logicalAND")
      @js.native
      def logicalAND: typings.acorn.mod.TokenType = js.native
      inline def logicalAND_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalAND")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.logicalOR")
      @js.native
      def logicalOR: typings.acorn.mod.TokenType = js.native
      inline def logicalOR_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalOR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.modulo")
      @js.native
      def modulo: typings.acorn.mod.TokenType = js.native
      inline def modulo_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modulo")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.name")
      @js.native
      def name: typings.acorn.mod.TokenType = js.native
      inline def name_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._new")
      @js.native
      val `new`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._null")
      @js.native
      val `null`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes.num")
      @js.native
      def num: typings.acorn.mod.TokenType = js.native
      inline def num_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("num")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.parenL")
      @js.native
      def parenL: typings.acorn.mod.TokenType = js.native
      inline def parenL_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.parenR")
      @js.native
      def parenR: typings.acorn.mod.TokenType = js.native
      inline def parenR_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.plusMin")
      @js.native
      def plusMin: typings.acorn.mod.TokenType = js.native
      inline def plusMin_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plusMin")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.prefix")
      @js.native
      def prefix: typings.acorn.mod.TokenType = js.native
      inline def prefix_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.privateId")
      @js.native
      def privateId: typings.acorn.mod.TokenType = js.native
      inline def privateId_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("privateId")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.question")
      @js.native
      def question: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes.questionDot")
      @js.native
      def questionDot: typings.acorn.mod.TokenType = js.native
      inline def questionDot_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("questionDot")(x.asInstanceOf[js.Any])
      
      inline def question_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("question")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.regexp")
      @js.native
      def regexp: typings.acorn.mod.TokenType = js.native
      inline def regexp_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.relational")
      @js.native
      def relational: typings.acorn.mod.TokenType = js.native
      inline def relational_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relational")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._return")
      @js.native
      val `return`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes.semi")
      @js.native
      def semi: typings.acorn.mod.TokenType = js.native
      inline def semi_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semi")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.slash")
      @js.native
      def slash: typings.acorn.mod.TokenType = js.native
      inline def slash_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slash")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.star")
      @js.native
      def star: typings.acorn.mod.TokenType = js.native
      inline def star_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("star")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.starstar")
      @js.native
      def starstar: typings.acorn.mod.TokenType = js.native
      inline def starstar_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("starstar")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.string")
      @js.native
      def string: typings.acorn.mod.TokenType = js.native
      inline def string_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._super")
      @js.native
      val `super`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._switch")
      @js.native
      def switch: typings.acorn.mod.TokenType = js.native
      
      inline def switch_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_switch")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes.template")
      @js.native
      def template: typings.acorn.mod.TokenType = js.native
      inline def template_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._this")
      @js.native
      val `this`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._throw")
      @js.native
      val `throw`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._true")
      @js.native
      val `true`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._try")
      @js.native
      val `try`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._typeof")
      @js.native
      def typeof: typings.acorn.mod.TokenType = js.native
      
      inline def typeof_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_typeof")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._var")
      @js.native
      val `var`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._void")
      @js.native
      def void: typings.acorn.mod.TokenType = js.native
      
      inline def void_=(x: typings.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_void")(x.asInstanceOf[js.Any])
      
      @JSGlobal("acorn.tokTypes._while")
      @js.native
      val `while`: typings.acorn.mod.TokenType = js.native
      
      @JSGlobal("acorn.tokTypes._with")
      @js.native
      val `with`: typings.acorn.mod.TokenType = js.native
    }
    
    inline def tokenizer(input: String, options: Options): GetToken = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GetToken]
    
    @JSGlobal("acorn.version")
    @js.native
    val version: String = js.native
  }
}
