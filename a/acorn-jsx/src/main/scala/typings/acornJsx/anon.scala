package typings.acornJsx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.acorn.anon.Arrow
import typings.acorn.anon.Bexpr
import typings.acorn.anon.Break
import typings.acorn.anon.GetToken
import typings.acorn.mod.Node
import typings.acorn.mod.Options
import typings.acorn.mod.Parser
import typings.acorn.mod.Position
import typings.acorn.mod.SourceLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeof extends StObject {
    
    var Node: Instantiable3[
        /* parser */ Parser, 
        /* pos */ Double, 
        /* loc */ js.UndefOr[SourceLocation], 
        typings.acorn.mod.Node
      ] = js.native
    
    var Parser: Instantiable3[
        /* options */ Options, 
        /* input */ String, 
        /* startPos */ js.UndefOr[Double], 
        typings.acorn.mod.Parser
      ] = js.native
    
    var SourceLocation: Instantiable3[
        /* p */ Parser, 
        /* start */ Position, 
        /* end */ Position, 
        typings.acorn.mod.SourceLocation
      ] = js.native
    
    var TokContext: Instantiable4[
        /* token */ String, 
        /* isExpr */ Boolean, 
        /* preserveSpace */ Boolean, 
        /* override */ js.UndefOr[js.Function1[/* p */ Parser, Unit]], 
        typings.acorn.mod.TokContext
      ] = js.native
    
    var Token: Instantiable1[/* p */ Parser, typings.acorn.mod.Token] = js.native
    
    var TokenType: Instantiable2[/* label */ String, /* conf */ js.UndefOr[Any], typings.acorn.mod.TokenType] = js.native
    
    val defaultOptions: Options = js.native
    
    def getLineInfo(input: String, offset: Double): Position = js.native
    
    def isIdentifierChar(code: Double): Boolean = js.native
    def isIdentifierChar(code: Double, astral: Boolean): Boolean = js.native
    
    def isIdentifierStart(code: Double): Boolean = js.native
    def isIdentifierStart(code: Double, astral: Boolean): Boolean = js.native
    
    def isNewLine(code: Double): Boolean = js.native
    
    val keywordTypes: Break = js.native
    
    val lineBreak: js.RegExp = js.native
    
    val lineBreakG: js.RegExp = js.native
    
    val nonASCIIwhitespace: js.RegExp = js.native
    
    def parse(input: String, options: Options): Node = js.native
    
    def parseExpressionAt(input: String, pos: Double, options: Options): Node = js.native
    
    val tokContexts: Bexpr = js.native
    
    val tokTypes: Arrow = js.native
    
    def tokenizer(input: String, options: Options): GetToken = js.native
    
    val version: String = js.native
  }
  
  trait TypeofParser extends StObject {
    
    // index.js
    /* static member */
    /* was `typeof acorn` */
    val acorn: Typeofacorn
    
    /* static member */
    def extend(
      plugins: (js.Function1[
          /* BaseParser */ typings.acorn.anon.TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser]), 
          typings.acorn.anon.TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser])
        ])*
    ): typings.acorn.anon.TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser])
    
    // state.js
    /* static member */
    def parse(input: String, options: Options): Node
    
    /* static member */
    def parseExpressionAt(input: String, pos: Double, options: Options): Node
    
    /* static member */
    def tokenizer(input: String, options: Options): GetToken
  }
  object TypeofParser {
    
    inline def apply(
      acorn: Typeofacorn,
      extend: /* repeated */ js.Function1[
          /* BaseParser */ typings.acorn.anon.TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser]), 
          typings.acorn.anon.TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser])
        ] => typings.acorn.anon.TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser]),
      parse: (String, Options) => Node,
      parseExpressionAt: (String, Double, Options) => Node,
      tokenizer: (String, Options) => GetToken
    ): TypeofParser = {
      val __obj = js.Dynamic.literal(acorn = acorn.asInstanceOf[js.Any], extend = js.Any.fromFunction1(extend), parse = js.Any.fromFunction2(parse), parseExpressionAt = js.Any.fromFunction3(parseExpressionAt), tokenizer = js.Any.fromFunction2(tokenizer))
      __obj.asInstanceOf[TypeofParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofParser] (val x: Self) extends AnyVal {
      
      inline def setAcorn(value: Typeofacorn): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
      
      inline def setExtend(
        value: /* repeated */ js.Function1[
              /* BaseParser */ typings.acorn.anon.TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser]), 
              typings.acorn.anon.TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser])
            ] => typings.acorn.anon.TypeofParser & (Instantiable3[/* options */ Options, /* input */ String, /* startPos */ js.UndefOr[Double], Parser])
      ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      inline def setParse(value: (String, Options) => Node): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setParseExpressionAt(value: (String, Double, Options) => Node): Self = StObject.set(x, "parseExpressionAt", js.Any.fromFunction3(value))
      
      inline def setTokenizer(value: (String, Options) => GetToken): Self = StObject.set(x, "tokenizer", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Typeofacorn
    extends StObject
       with Typeof
}
