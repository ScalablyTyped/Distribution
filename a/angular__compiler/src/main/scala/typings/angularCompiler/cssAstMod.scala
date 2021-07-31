package typings.angularCompiler

import typings.angularCompiler.cssLexerMod.CssToken
import typings.angularCompiler.srcParseUtilMod.ParseLocation
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssAstMod {
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait BlockType extends StObject
  @JSImport("@angular/compiler/src/css_parser/css_ast", "BlockType")
  @js.native
  object BlockType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BlockType & Double] = js.native
    
    @js.native
    sealed trait Charset
      extends StObject
         with BlockType
    /* 1 */ val Charset: typings.angularCompiler.cssAstMod.BlockType.Charset & Double = js.native
    
    @js.native
    sealed trait Document
      extends StObject
         with BlockType
    /* 9 */ val Document: typings.angularCompiler.cssAstMod.BlockType.Document & Double = js.native
    
    @js.native
    sealed trait FontFace
      extends StObject
         with BlockType
    /* 7 */ val FontFace: typings.angularCompiler.cssAstMod.BlockType.FontFace & Double = js.native
    
    @js.native
    sealed trait Import
      extends StObject
         with BlockType
    /* 0 */ val Import: typings.angularCompiler.cssAstMod.BlockType.Import & Double = js.native
    
    @js.native
    sealed trait Keyframes
      extends StObject
         with BlockType
    /* 4 */ val Keyframes: typings.angularCompiler.cssAstMod.BlockType.Keyframes & Double = js.native
    
    @js.native
    sealed trait MediaQuery
      extends StObject
         with BlockType
    /* 5 */ val MediaQuery: typings.angularCompiler.cssAstMod.BlockType.MediaQuery & Double = js.native
    
    @js.native
    sealed trait Namespace
      extends StObject
         with BlockType
    /* 2 */ val Namespace: typings.angularCompiler.cssAstMod.BlockType.Namespace & Double = js.native
    
    @js.native
    sealed trait Page
      extends StObject
         with BlockType
    /* 8 */ val Page: typings.angularCompiler.cssAstMod.BlockType.Page & Double = js.native
    
    @js.native
    sealed trait Selector
      extends StObject
         with BlockType
    /* 6 */ val Selector: typings.angularCompiler.cssAstMod.BlockType.Selector & Double = js.native
    
    @js.native
    sealed trait Supports
      extends StObject
         with BlockType
    /* 3 */ val Supports: typings.angularCompiler.cssAstMod.BlockType.Supports & Double = js.native
    
    @js.native
    sealed trait Unsupported
      extends StObject
         with BlockType
    /* 11 */ val Unsupported: typings.angularCompiler.cssAstMod.BlockType.Unsupported & Double = js.native
    
    @js.native
    sealed trait Viewport
      extends StObject
         with BlockType
    /* 10 */ val Viewport: typings.angularCompiler.cssAstMod.BlockType.Viewport & Double = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssAst")
  @js.native
  abstract class CssAst protected () extends StObject {
    def this(location: ParseSourceSpan) = this()
    
    def end: ParseLocation = js.native
    
    var location: ParseSourceSpan = js.native
    
    def start: ParseLocation = js.native
    
    def visit(visitor: CssAstVisitor): js.Any = js.native
    def visit(visitor: CssAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssAtRulePredicateAst")
  @js.native
  class CssAtRulePredicateAst protected () extends CssAst {
    def this(location: ParseSourceSpan, strValue: String, tokens: js.Array[CssToken]) = this()
    
    var strValue: String = js.native
    
    var tokens: js.Array[CssToken] = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssBlockAst")
  @js.native
  class CssBlockAst protected () extends CssAst {
    def this(location: ParseSourceSpan, entries: js.Array[CssAst]) = this()
    
    var entries: js.Array[CssAst] = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssBlockDefinitionRuleAst")
  @js.native
  class CssBlockDefinitionRuleAst protected () extends CssBlockRuleAst {
    def this(
      location: ParseSourceSpan,
      strValue: String,
      `type`: BlockType,
      query: CssAtRulePredicateAst,
      block: CssBlockAst
    ) = this()
    
    var query: CssAtRulePredicateAst = js.native
    
    var strValue: String = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssBlockRuleAst")
  @js.native
  class CssBlockRuleAst protected () extends CssRuleAst {
    def this(location: ParseSourceSpan, `type`: BlockType, block: CssBlockAst) = this()
    def this(location: ParseSourceSpan, `type`: BlockType, block: CssBlockAst, name: CssToken) = this()
    
    var block: CssBlockAst = js.native
    
    var name: CssToken | Null = js.native
    
    var `type`: BlockType = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssDefinitionAst")
  @js.native
  class CssDefinitionAst protected () extends CssAst {
    def this(location: ParseSourceSpan, property: CssToken, value: CssStyleValueAst) = this()
    
    var property: CssToken = js.native
    
    var value: CssStyleValueAst = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssInlineRuleAst")
  @js.native
  class CssInlineRuleAst protected () extends CssRuleAst {
    def this(location: ParseSourceSpan, `type`: BlockType, value: CssStyleValueAst) = this()
    
    var `type`: BlockType = js.native
    
    var value: CssStyleValueAst = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssKeyframeDefinitionAst")
  @js.native
  class CssKeyframeDefinitionAst protected () extends CssBlockRuleAst {
    def this(location: ParseSourceSpan, steps: js.Array[CssToken], block: CssBlockAst) = this()
    
    var steps: js.Array[CssToken] = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssKeyframeRuleAst")
  @js.native
  class CssKeyframeRuleAst protected () extends CssBlockRuleAst {
    def this(location: ParseSourceSpan, name: CssToken, block: CssBlockAst) = this()
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssMediaQueryRuleAst")
  @js.native
  class CssMediaQueryRuleAst protected () extends CssBlockDefinitionRuleAst {
    def this(location: ParseSourceSpan, strValue: String, query: CssAtRulePredicateAst, block: CssBlockAst) = this()
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssPseudoSelectorAst")
  @js.native
  class CssPseudoSelectorAst protected () extends CssSelectorPartAst {
    def this(
      location: ParseSourceSpan,
      strValue: String,
      name: String,
      tokens: js.Array[CssToken],
      innerSelectors: js.Array[CssSelectorAst]
    ) = this()
    
    var innerSelectors: js.Array[CssSelectorAst] = js.native
    
    var name: String = js.native
    
    var strValue: String = js.native
    
    var tokens: js.Array[CssToken] = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssRuleAst")
  @js.native
  abstract class CssRuleAst protected () extends CssAst {
    def this(location: ParseSourceSpan) = this()
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssSelectorAst")
  @js.native
  class CssSelectorAst protected () extends CssSelectorPartAst {
    def this(location: ParseSourceSpan, selectorParts: js.Array[CssSimpleSelectorAst]) = this()
    
    var selectorParts: js.Array[CssSimpleSelectorAst] = js.native
    
    var strValue: String = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssSelectorPartAst")
  @js.native
  abstract class CssSelectorPartAst protected () extends CssAst {
    def this(location: ParseSourceSpan) = this()
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssSelectorRuleAst")
  @js.native
  class CssSelectorRuleAst protected () extends CssBlockRuleAst {
    def this(location: ParseSourceSpan, selectors: js.Array[CssSelectorAst], block: CssBlockAst) = this()
    
    var selectors: js.Array[CssSelectorAst] = js.native
    
    var strValue: String = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssSimpleSelectorAst")
  @js.native
  class CssSimpleSelectorAst protected () extends CssSelectorPartAst {
    def this(
      location: ParseSourceSpan,
      tokens: js.Array[CssToken],
      strValue: String,
      pseudoSelectors: js.Array[CssPseudoSelectorAst],
      operator: CssToken
    ) = this()
    
    var operator: CssToken = js.native
    
    var pseudoSelectors: js.Array[CssPseudoSelectorAst] = js.native
    
    var strValue: String = js.native
    
    var tokens: js.Array[CssToken] = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssStyleSheetAst")
  @js.native
  class CssStyleSheetAst protected () extends CssAst {
    def this(location: ParseSourceSpan, rules: js.Array[CssAst]) = this()
    
    var rules: js.Array[CssAst] = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssStyleValueAst")
  @js.native
  class CssStyleValueAst protected () extends CssAst {
    def this(location: ParseSourceSpan, tokens: js.Array[CssToken], strValue: String) = this()
    
    var strValue: String = js.native
    
    var tokens: js.Array[CssToken] = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssStylesBlockAst")
  @js.native
  class CssStylesBlockAst protected () extends CssBlockAst {
    def this(location: ParseSourceSpan, definitions: js.Array[CssDefinitionAst]) = this()
    
    var definitions: js.Array[CssDefinitionAst] = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssUnknownRuleAst")
  @js.native
  class CssUnknownRuleAst protected () extends CssRuleAst {
    def this(location: ParseSourceSpan, ruleName: String, tokens: js.Array[CssToken]) = this()
    
    var ruleName: String = js.native
    
    var tokens: js.Array[CssToken] = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_ast", "CssUnknownTokenListAst")
  @js.native
  class CssUnknownTokenListAst protected () extends CssRuleAst {
    def this(location: ParseSourceSpan, name: String, tokens: js.Array[CssToken]) = this()
    
    var name: String = js.native
    
    var tokens: js.Array[CssToken] = js.native
  }
  
  @scala.inline
  def mergeTokens(tokens: js.Array[CssToken]): CssToken = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[CssToken]
  @scala.inline
  def mergeTokens(tokens: js.Array[CssToken], separator: String): CssToken = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTokens")(tokens.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[CssToken]
  
  @js.native
  trait CssAstVisitor extends StObject {
    
    def visitCssAtRulePredicate(ast: CssAtRulePredicateAst): js.Any = js.native
    def visitCssAtRulePredicate(ast: CssAtRulePredicateAst, context: js.Any): js.Any = js.native
    
    def visitCssBlock(ast: CssBlockAst): js.Any = js.native
    def visitCssBlock(ast: CssBlockAst, context: js.Any): js.Any = js.native
    
    def visitCssDefinition(ast: CssDefinitionAst): js.Any = js.native
    def visitCssDefinition(ast: CssDefinitionAst, context: js.Any): js.Any = js.native
    
    def visitCssInlineRule(ast: CssInlineRuleAst): js.Any = js.native
    def visitCssInlineRule(ast: CssInlineRuleAst, context: js.Any): js.Any = js.native
    
    def visitCssKeyframeDefinition(ast: CssKeyframeDefinitionAst): js.Any = js.native
    def visitCssKeyframeDefinition(ast: CssKeyframeDefinitionAst, context: js.Any): js.Any = js.native
    
    def visitCssKeyframeRule(ast: CssKeyframeRuleAst): js.Any = js.native
    def visitCssKeyframeRule(ast: CssKeyframeRuleAst, context: js.Any): js.Any = js.native
    
    def visitCssMediaQueryRule(ast: CssMediaQueryRuleAst): js.Any = js.native
    def visitCssMediaQueryRule(ast: CssMediaQueryRuleAst, context: js.Any): js.Any = js.native
    
    def visitCssPseudoSelector(ast: CssPseudoSelectorAst): js.Any = js.native
    def visitCssPseudoSelector(ast: CssPseudoSelectorAst, context: js.Any): js.Any = js.native
    
    def visitCssSelector(ast: CssSelectorAst): js.Any = js.native
    def visitCssSelector(ast: CssSelectorAst, context: js.Any): js.Any = js.native
    
    def visitCssSelectorRule(ast: CssSelectorRuleAst): js.Any = js.native
    def visitCssSelectorRule(ast: CssSelectorRuleAst, context: js.Any): js.Any = js.native
    
    def visitCssSimpleSelector(ast: CssSimpleSelectorAst): js.Any = js.native
    def visitCssSimpleSelector(ast: CssSimpleSelectorAst, context: js.Any): js.Any = js.native
    
    def visitCssStyleSheet(ast: CssStyleSheetAst): js.Any = js.native
    def visitCssStyleSheet(ast: CssStyleSheetAst, context: js.Any): js.Any = js.native
    
    def visitCssStylesBlock(ast: CssStylesBlockAst): js.Any = js.native
    def visitCssStylesBlock(ast: CssStylesBlockAst, context: js.Any): js.Any = js.native
    
    def visitCssUnknownRule(ast: CssUnknownRuleAst): js.Any = js.native
    def visitCssUnknownRule(ast: CssUnknownRuleAst, context: js.Any): js.Any = js.native
    
    def visitCssUnknownTokenList(ast: CssUnknownTokenListAst): js.Any = js.native
    def visitCssUnknownTokenList(ast: CssUnknownTokenListAst, context: js.Any): js.Any = js.native
    
    def visitCssValue(ast: CssStyleValueAst): js.Any = js.native
    def visitCssValue(ast: CssStyleValueAst, context: js.Any): js.Any = js.native
  }
}
