package typings.angularCore.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable10
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.Instantiable8
import org.scalablytyped.runtime.Instantiable9
import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Directive
import typings.angularCompiler.anon.Key
import typings.angularCompiler.mod.AST
import typings.angularCompiler.mod.ASTWithSource
import typings.angularCompiler.mod.AbsoluteSourceSpan
import typings.angularCompiler.mod.BinaryOperator
import typings.angularCompiler.mod.BindingParser
import typings.angularCompiler.mod.BindingType
import typings.angularCompiler.mod.BuiltinType
import typings.angularCompiler.mod.BuiltinTypeName
import typings.angularCompiler.mod.CompileIdentifierMetadata
import typings.angularCompiler.mod.ConstantPool
import typings.angularCompiler.mod.CssSelector
import typings.angularCompiler.mod.DeclareComponentTemplateInfo
import typings.angularCompiler.mod.DirectiveMeta
import typings.angularCompiler.mod.ExpansionCase
import typings.angularCompiler.mod.Expression
import typings.angularCompiler.mod.ExpressionType
import typings.angularCompiler.mod.ExternalReference
import typings.angularCompiler.mod.FnParam
import typings.angularCompiler.mod.ForwardRefHandling
import typings.angularCompiler.mod.HtmlParser
import typings.angularCompiler.mod.HtmlTagDefinition
import typings.angularCompiler.mod.I18nMeta
import typings.angularCompiler.mod.InterpolatedTextToken
import typings.angularCompiler.mod.InterpolationConfig
import typings.angularCompiler.mod.InterpolationPiece
import typings.angularCompiler.mod.JSDocComment_
import typings.angularCompiler.mod.JSDocTag
import typings.angularCompiler.mod.LeadingComment_
import typings.angularCompiler.mod.Lexer
import typings.angularCompiler.mod.LiteralMapEntry
import typings.angularCompiler.mod.LiteralMapExpr
import typings.angularCompiler.mod.LiteralMapKey
import typings.angularCompiler.mod.LiteralMap_
import typings.angularCompiler.mod.LiteralPiece
import typings.angularCompiler.mod.MapType
import typings.angularCompiler.mod.MaybeForwardRefExpression
import typings.angularCompiler.mod.Node2
import typings.angularCompiler.mod.ParseAST
import typings.angularCompiler.mod.ParseError
import typings.angularCompiler.mod.ParseFlags
import typings.angularCompiler.mod.ParseLocation
import typings.angularCompiler.mod.ParseSourceFile
import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompiler.mod.ParseSpan
import typings.angularCompiler.mod.ParseTemplateOptions
import typings.angularCompiler.mod.ParsedEventType
import typings.angularCompiler.mod.ParsedHostBindings
import typings.angularCompiler.mod.ParsedPropertyType
import typings.angularCompiler.mod.ParsedTemplate
import typings.angularCompiler.mod.ParserError
import typings.angularCompiler.mod.PlaceholderPiece
import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3CompiledExpression
import typings.angularCompiler.mod.R3ComponentMetadata
import typings.angularCompiler.mod.R3DirectiveMetadata
import typings.angularCompiler.mod.R3FactoryMetadata
import typings.angularCompiler.mod.R3InjectableMetadata
import typings.angularCompiler.mod.R3InjectorMetadata
import typings.angularCompiler.mod.R3NgModuleMetadata
import typings.angularCompiler.mod.R3PipeMetadata
import typings.angularCompiler.mod.R3TemplateDependency
import typings.angularCompiler.mod.R3TemplateDependencyMetadata
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompiler.mod.SecurityContext
import typings.angularCompiler.mod.SelectorListContext
import typings.angularCompiler.mod.SelectorMatcher
import typings.angularCompiler.mod.Statement
import typings.angularCompiler.mod.StmtModifier
import typings.angularCompiler.mod.Target
import typings.angularCompiler.mod.TemplateBinding
import typings.angularCompiler.mod.TemplateBindingIdentifier
import typings.angularCompiler.mod.TemplateLiteral
import typings.angularCompiler.mod.TemplateLiteralElement
import typings.angularCompiler.mod.TmplAstBoundAttribute
import typings.angularCompiler.mod.TmplAstBoundEvent
import typings.angularCompiler.mod.TmplAstBoundText
import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstNode
import typings.angularCompiler.mod.TmplAstReference
import typings.angularCompiler.mod.TmplAstTemplate
import typings.angularCompiler.mod.TmplAstText
import typings.angularCompiler.mod.TmplAstTextAttribute
import typings.angularCompiler.mod.TmplAstVariable
import typings.angularCompiler.mod.Token
import typings.angularCompiler.mod.TokenType
import typings.angularCompiler.mod.Type
import typings.angularCompiler.mod.UnaryOperator
import typings.angularCompiler.mod.Version
import typings.angularCompiler.mod.Visitor
import typings.std.Map
import typings.std.Node
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedCompiler extends StObject {
  
  var AST: Instantiable2[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    typings.angularCompiler.mod.AST
  ] = js.native
  
  var ASTWithName: Instantiable3[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* nameSpan */ AbsoluteSourceSpan, 
    typings.angularCompiler.mod.ASTWithName
  ] = js.native
  
  var ASTWithSource: Instantiable5[
    /* ast */ AST, 
    /* source */ String, 
    /* location */ String, 
    /* absoluteOffset */ Double, 
    /* errors */ js.Array[ParserError], 
    typings.angularCompiler.mod.ASTWithSource
  ] = js.native
  
  var AbsoluteSourceSpan: Instantiable2[/* start */ Double, /* end */ Double, typings.angularCompiler.mod.AbsoluteSourceSpan] = js.native
  
  var ArrayType: Instantiable1[/* of */ Type, typings.angularCompiler.mod.ArrayType] = js.native
  
  var AstMemoryEfficientTransformer: Instantiable0[typings.angularCompiler.mod.AstMemoryEfficientTransformer] = js.native
  
  var AstTransformer: Instantiable0[typings.angularCompiler.mod.AstTransformer] = js.native
  
  var Attribute: Instantiable3[
    /* name */ String, 
    /* value */ String, 
    /* sourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.Attribute
  ] = js.native
  
  var Binary: Instantiable5[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* operation */ String, 
    /* left */ AST, 
    /* right */ AST, 
    typings.angularCompiler.mod.Binary
  ] = js.native
  
  var BinaryOperatorExpr: Instantiable3[
    /* operator */ BinaryOperator, 
    /* lhs */ Expression, 
    /* rhs */ Expression, 
    typings.angularCompiler.mod.BinaryOperatorExpr
  ] = js.native
  
  var BindingPipe: Instantiable6[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* exp */ AST, 
    /* name */ String, 
    /* args */ js.Array[Any], 
    /* nameSpan */ AbsoluteSourceSpan, 
    typings.angularCompiler.mod.BindingPipe
  ] = js.native
  
  var BoundElementProperty: Instantiable6[
    /* name */ String, 
    /* type */ BindingType, 
    /* securityContext */ SecurityContext, 
    /* value */ ASTWithSource, 
    /* unit */ String, 
    /* sourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.BoundElementProperty
  ] = js.native
  
  var BuiltinType: Instantiable1[/* name */ BuiltinTypeName, typings.angularCompiler.mod.BuiltinType] = js.native
  
  val CUSTOM_ELEMENTS_SCHEMA: SchemaMetadata = js.native
  
  var Call: Instantiable5[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* receiver */ AST, 
    /* args */ js.Array[AST], 
    /* argumentSpan */ AbsoluteSourceSpan, 
    typings.angularCompiler.mod.Call
  ] = js.native
  
  var Chain: Instantiable3[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* expressions */ js.Array[Any], 
    typings.angularCompiler.mod.Chain
  ] = js.native
  
  var CommaExpr: Instantiable1[/* parts */ js.Array[Expression], typings.angularCompiler.mod.CommaExpr] = js.native
  
  var Comment: Instantiable2[
    /* value */ String, 
    /* sourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.Comment
  ] = js.native
  
  var CompilerConfig: Instantiable0[typings.angularCompiler.mod.CompilerConfig] = js.native
  
  var Conditional: Instantiable5[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* condition */ AST, 
    /* trueExp */ AST, 
    /* falseExp */ AST, 
    typings.angularCompiler.mod.Conditional
  ] = js.native
  
  var ConditionalExpr: Instantiable2[
    /* condition */ Expression, 
    /* trueCase */ Expression, 
    typings.angularCompiler.mod.ConditionalExpr
  ] = js.native
  
  var ConstantPool: Instantiable0[typings.angularCompiler.mod.ConstantPool] = js.native
  
  var CssSelector: TypeofCssSelector = js.native
  
  val DEFAULT_INTERPOLATION_CONFIG: InterpolationConfig = js.native
  
  val DYNAMIC_TYPE: BuiltinType = js.native
  
  var DeclareFunctionStmt: Instantiable3[
    /* name */ String, 
    /* params */ js.Array[FnParam], 
    /* statements */ js.Array[Statement], 
    typings.angularCompiler.mod.DeclareFunctionStmt
  ] = js.native
  
  var DeclareVarStmt: Instantiable6[
    /* name */ String, 
    /* value */ js.UndefOr[Expression], 
    /* type */ js.UndefOr[Type | Null], 
    /* modifiers */ js.UndefOr[StmtModifier], 
    /* sourceSpan */ js.UndefOr[ParseSourceSpan | Null], 
    /* leadingComments */ js.UndefOr[js.Array[LeadingComment_]], 
    typings.angularCompiler.mod.DeclareVarStmt
  ] = js.native
  
  var DomElementSchemaRegistry: Instantiable0[typings.angularCompiler.mod.DomElementSchemaRegistry] = js.native
  
  val EOF: Token = js.native
  
  var Element: Instantiable5[
    /* name */ String, 
    /* attrs */ js.Array[typings.angularCompiler.mod.Attribute], 
    /* children */ js.Array[Node2], 
    /* sourceSpan */ ParseSourceSpan, 
    /* startSourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.Element
  ] = js.native
  
  var ElementSchemaRegistry: Instantiable0[typings.angularCompiler.mod.ElementSchemaRegistry] = js.native
  
  var EmitterVisitorContext: TypeofEmitterVisitorConte = js.native
  
  var EmptyExpr: Instantiable2[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    typings.angularCompiler.mod.EmptyExpr
  ] = js.native
  
  var Expansion: Instantiable5[
    /* switchValue */ String, 
    /* type */ String, 
    /* cases */ js.Array[ExpansionCase], 
    /* sourceSpan */ ParseSourceSpan, 
    /* switchValueSourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.Expansion
  ] = js.native
  
  var ExpansionCase: Instantiable5[
    /* value */ String, 
    /* expression */ js.Array[Node2], 
    /* sourceSpan */ ParseSourceSpan, 
    /* valueSourceSpan */ ParseSourceSpan, 
    /* expSourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.ExpansionCase
  ] = js.native
  
  var Expression: Instantiable0[typings.angularCompiler.mod.Expression] = js.native
  
  var ExpressionBinding: Instantiable2[
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* key */ TemplateBindingIdentifier, 
    typings.angularCompiler.mod.ExpressionBinding
  ] = js.native
  
  var ExpressionStatement: Instantiable1[/* expr */ Expression, typings.angularCompiler.mod.ExpressionStatement] = js.native
  
  var ExpressionType: Instantiable1[/* value */ Expression, typings.angularCompiler.mod.ExpressionType] = js.native
  
  var ExternalExpr: Instantiable1[/* value */ ExternalReference, typings.angularCompiler.mod.ExternalExpr] = js.native
  
  var ExternalReference: Instantiable0[typings.angularCompiler.mod.ExternalReference] = js.native
  
  var FunctionExpr: Instantiable2[
    /* params */ js.Array[FnParam], 
    /* statements */ js.Array[Statement], 
    typings.angularCompiler.mod.FunctionExpr
  ] = js.native
  
  var HtmlParser: Instantiable0[typings.angularCompiler.mod.HtmlParser] = js.native
  
  var HtmlTagDefinition: Instantiable0[typings.angularCompiler.mod.HtmlTagDefinition] = js.native
  
  var I18NHtmlParser: Instantiable1[/* _htmlParser */ HtmlParser, typings.angularCompiler.mod.I18NHtmlParser] = js.native
  
  var IfStmt: Instantiable2[
    /* condition */ Expression, 
    /* trueCase */ js.Array[Statement], 
    typings.angularCompiler.mod.IfStmt
  ] = js.native
  
  var ImplicitReceiver: Instantiable2[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    typings.angularCompiler.mod.ImplicitReceiver
  ] = js.native
  
  var InstantiateExpr: Instantiable2[
    /* classExpr */ Expression, 
    /* args */ js.Array[Expression], 
    typings.angularCompiler.mod.InstantiateExpr
  ] = js.native
  
  var Interpolation: Instantiable4[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* strings */ js.Array[Any], 
    /* expressions */ js.Array[Any], 
    typings.angularCompiler.mod.Interpolation
  ] = js.native
  
  var InterpolationConfig: TypeofInterpolationConfig = js.native
  
  var InvokeFunctionExpr: Instantiable2[
    /* fn */ Expression, 
    /* args */ js.Array[Expression], 
    typings.angularCompiler.mod.InvokeFunctionExpr
  ] = js.native
  
  var JSDocComment: Instantiable1[/* tags */ js.Array[JSDocTag], JSDocComment_] = js.native
  
  var JitEvaluator: Instantiable0[typings.angularCompiler.mod.JitEvaluator] = js.native
  
  var KeyedRead: Instantiable4[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* receiver */ AST, 
    /* key */ AST, 
    typings.angularCompiler.mod.KeyedRead
  ] = js.native
  
  var KeyedWrite: Instantiable5[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* receiver */ AST, 
    /* key */ AST, 
    /* value */ AST, 
    typings.angularCompiler.mod.KeyedWrite
  ] = js.native
  
  var LeadingComment: Instantiable3[
    /* text */ String, 
    /* multiline */ Boolean, 
    /* trailingNewline */ Boolean, 
    LeadingComment_
  ] = js.native
  
  var Lexer: Instantiable0[typings.angularCompiler.mod.Lexer] = js.native
  
  var LiteralArray: Instantiable3[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* expressions */ js.Array[Any], 
    typings.angularCompiler.mod.LiteralArray
  ] = js.native
  
  var LiteralArrayExpr: Instantiable1[/* entries */ js.Array[Expression], typings.angularCompiler.mod.LiteralArrayExpr] = js.native
  
  var LiteralExpr: Instantiable0[typings.angularCompiler.mod.LiteralExpr] = js.native
  
  var LiteralMap: Instantiable4[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* keys */ js.Array[LiteralMapKey], 
    /* values */ js.Array[Any], 
    LiteralMap_
  ] = js.native
  
  var LiteralMapExpr: Instantiable1[
    /* entries */ js.Array[LiteralMapEntry], 
    typings.angularCompiler.mod.LiteralMapExpr
  ] = js.native
  
  var LiteralPrimitive: Instantiable3[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* value */ Any, 
    typings.angularCompiler.mod.LiteralPrimitive
  ] = js.native
  
  var LocalizedString: Instantiable4[
    /* metaBlock */ I18nMeta, 
    /* messageParts */ js.Array[LiteralPiece], 
    /* placeHolderNames */ js.Array[PlaceholderPiece], 
    /* expressions */ js.Array[Expression], 
    typings.angularCompiler.mod.LocalizedString
  ] = js.native
  
  var MapType: Instantiable0[typings.angularCompiler.mod.MapType] = js.native
  
  var MessageBundle: Instantiable3[
    /* _htmlParser */ HtmlParser, 
    /* _implicitTags */ js.Array[String], 
    /* _implicitAttrs */ StringDictionary[js.Array[String]], 
    typings.angularCompiler.mod.MessageBundle
  ] = js.native
  
  val NONE_TYPE: BuiltinType = js.native
  
  val NO_ERRORS_SCHEMA: SchemaMetadata = js.native
  
  var NodeWithI18n: Instantiable1[/* sourceSpan */ ParseSourceSpan, typings.angularCompiler.mod.NodeWithI18n] = js.native
  
  var NonNullAssert: Instantiable3[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* expression */ AST, 
    typings.angularCompiler.mod.NonNullAssert
  ] = js.native
  
  var NotExpr: Instantiable1[/* condition */ Expression, typings.angularCompiler.mod.NotExpr] = js.native
  
  var ParseError: Instantiable2[/* span */ ParseSourceSpan, /* msg */ String, typings.angularCompiler.mod.ParseError] = js.native
  
  var ParseLocation: Instantiable4[
    /* file */ ParseSourceFile, 
    /* offset */ Double, 
    /* line */ Double, 
    /* col */ Double, 
    typings.angularCompiler.mod.ParseLocation
  ] = js.native
  
  var ParseSourceFile: Instantiable2[/* content */ String, /* url */ String, typings.angularCompiler.mod.ParseSourceFile] = js.native
  
  var ParseSourceSpan: Instantiable2[
    /* start */ ParseLocation, 
    /* end */ ParseLocation, 
    typings.angularCompiler.mod.ParseSourceSpan
  ] = js.native
  
  var ParseSpan: Instantiable2[/* start */ Double, /* end */ Double, typings.angularCompiler.mod.ParseSpan] = js.native
  
  var ParseTreeResult: Instantiable2[
    /* rootNodes */ js.Array[Node], 
    /* errors */ js.Array[ParseError], 
    typings.angularCompiler.mod.ParseTreeResult
  ] = js.native
  
  var ParsedEvent: Instantiable7[
    /* name */ String, 
    /* targetOrPhase */ String, 
    /* type */ ParsedEventType, 
    /* handler */ ASTWithSource, 
    /* sourceSpan */ ParseSourceSpan, 
    /* handlerSpan */ ParseSourceSpan, 
    /* keySpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.ParsedEvent
  ] = js.native
  
  var ParsedProperty: Instantiable5[
    /* name */ String, 
    /* expression */ ASTWithSource, 
    /* type */ ParsedPropertyType, 
    /* sourceSpan */ ParseSourceSpan, 
    /* keySpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.ParsedProperty
  ] = js.native
  
  var ParsedVariable: Instantiable4[
    /* name */ String, 
    /* value */ String, 
    /* sourceSpan */ ParseSourceSpan, 
    /* keySpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.ParsedVariable
  ] = js.native
  
  var Parser: Instantiable1[/* _lexer */ Lexer, typings.angularCompiler.mod.Parser] = js.native
  
  var ParserError: Instantiable3[
    /* message */ String, 
    /* input */ String, 
    /* errLocation */ String, 
    typings.angularCompiler.mod.ParserError
  ] = js.native
  
  var PrefixNot: Instantiable3[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* expression */ AST, 
    typings.angularCompiler.mod.PrefixNot
  ] = js.native
  
  var PropertyRead: Instantiable5[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* nameSpan */ AbsoluteSourceSpan, 
    /* receiver */ AST, 
    /* name */ String, 
    typings.angularCompiler.mod.PropertyRead
  ] = js.native
  
  var PropertyWrite: Instantiable6[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* nameSpan */ AbsoluteSourceSpan, 
    /* receiver */ AST, 
    /* name */ String, 
    /* value */ AST, 
    typings.angularCompiler.mod.PropertyWrite
  ] = js.native
  
  var R3BoundTarget: Instantiable9[
    /* target */ Target, 
    /* directives */ Map[
      TmplAstElement | TmplAstTemplate, 
      js.Array[/* import warning: RewrittenClass.unapply cls was tparam DirectiveT */ Any]
    ], 
    /* bindings */ Map[
      TmplAstBoundAttribute | TmplAstBoundEvent | TmplAstTextAttribute, 
      (/* import warning: RewrittenClass.unapply cls was tparam DirectiveT */ Any) | TmplAstElement | TmplAstTemplate
    ], 
    /* references */ Map[
      TmplAstBoundAttribute | TmplAstBoundEvent | TmplAstReference | TmplAstTextAttribute, 
      (Directive[/* import warning: RewrittenClass.unapply cls was tparam DirectiveT */ Any]) | TmplAstElement | TmplAstTemplate
    ], 
    /* exprTargets */ Map[AST, TmplAstReference | TmplAstVariable], 
    /* symbols */ Map[TmplAstReference | TmplAstVariable, TmplAstTemplate], 
    /* nestingLevel */ Map[TmplAstTemplate, Double], 
    /* templateEntities */ Map[TmplAstTemplate | Null, ReadonlySet[TmplAstReference | TmplAstVariable]], 
    /* usedPipes */ Set[String], 
    typings.angularCompiler.mod.R3BoundTarget[DirectiveMeta]
  ] = js.native
  
  var R3Identifiers: TypeofR3Identifiers = js.native
  
  var R3TargetBinder: Instantiable1[
    /* directiveMatcher */ SelectorMatcher[/* import warning: RewrittenClass.unapply cls was tparam DirectiveT */ Any], 
    typings.angularCompiler.mod.R3TargetBinder[DirectiveMeta]
  ] = js.native
  
  var ReadKeyExpr: Instantiable2[
    /* receiver */ Expression, 
    /* index */ Expression, 
    typings.angularCompiler.mod.ReadKeyExpr
  ] = js.native
  
  var ReadPropExpr: Instantiable2[
    /* receiver */ Expression, 
    /* name */ String, 
    typings.angularCompiler.mod.ReadPropExpr
  ] = js.native
  
  var ReadVarExpr: Instantiable1[/* name */ String, typings.angularCompiler.mod.ReadVarExpr] = js.native
  
  var RecursiveAstVisitor: Instantiable0[typings.angularCompiler.mod.RecursiveAstVisitor] = js.native
  
  var RecursiveVisitor: Instantiable0[typings.angularCompiler.mod.RecursiveVisitor] = js.native
  
  var ResourceLoader: Instantiable0[typings.angularCompiler.mod.ResourceLoader] = js.native
  
  var ReturnStatement: Instantiable1[/* value */ Expression, typings.angularCompiler.mod.ReturnStatement] = js.native
  
  val STRING_TYPE: BuiltinType = js.native
  
  var SafeCall: Instantiable5[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* receiver */ AST, 
    /* args */ js.Array[AST], 
    /* argumentSpan */ AbsoluteSourceSpan, 
    typings.angularCompiler.mod.SafeCall
  ] = js.native
  
  var SafeKeyedRead: Instantiable4[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* receiver */ AST, 
    /* key */ AST, 
    typings.angularCompiler.mod.SafeKeyedRead
  ] = js.native
  
  var SafePropertyRead: Instantiable5[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* nameSpan */ AbsoluteSourceSpan, 
    /* receiver */ AST, 
    /* name */ String, 
    typings.angularCompiler.mod.SafePropertyRead
  ] = js.native
  
  var SelectorContext: Instantiable3[
    /* selector */ CssSelector, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* cbContext */ Any, 
    /* listContext */ SelectorListContext, 
    typings.angularCompiler.mod.SelectorContext[js.Object]
  ] = js.native
  
  var SelectorListContext: Instantiable1[
    /* selectors */ js.Array[CssSelector], 
    typings.angularCompiler.mod.SelectorListContext
  ] = js.native
  
  var SelectorMatcher: TypeofSelectorMatcher = js.native
  
  var Serializer: Instantiable0[typings.angularCompiler.mod.Serializer] = js.native
  
  var SplitInterpolation: Instantiable3[
    /* strings */ js.Array[InterpolationPiece], 
    /* expressions */ js.Array[InterpolationPiece], 
    /* offsets */ js.Array[Double], 
    typings.angularCompiler.mod.SplitInterpolation
  ] = js.native
  
  var Statement: Instantiable0[typings.angularCompiler.mod.Statement] = js.native
  
  var TaggedTemplateExpr: Instantiable2[
    /* tag */ Expression, 
    /* template */ TemplateLiteral, 
    typings.angularCompiler.mod.TaggedTemplateExpr
  ] = js.native
  
  var TemplateBindingParseResult: Instantiable3[
    /* templateBindings */ js.Array[TemplateBinding], 
    /* warnings */ js.Array[String], 
    /* errors */ js.Array[ParserError], 
    typings.angularCompiler.mod.TemplateBindingParseResult
  ] = js.native
  
  var TemplateLiteral: Instantiable2[
    /* elements */ js.Array[TemplateLiteralElement], 
    /* expressions */ js.Array[Expression], 
    typings.angularCompiler.mod.TemplateLiteral
  ] = js.native
  
  var TemplateLiteralElement: Instantiable1[/* text */ String, typings.angularCompiler.mod.TemplateLiteralElement] = js.native
  
  var Text: Instantiable3[
    /* value */ String, 
    /* sourceSpan */ ParseSourceSpan, 
    /* tokens */ js.Array[InterpolatedTextToken], 
    typings.angularCompiler.mod.Text
  ] = js.native
  
  var ThisReceiver: Instantiable2[
    /* span */ ParseSpan, 
    /* sourceSpan */ AbsoluteSourceSpan, 
    typings.angularCompiler.mod.ThisReceiver
  ] = js.native
  
  var TmplAstBoundAttribute: TypeofTmplAstBoundAttribu = js.native
  
  var TmplAstBoundEvent: TypeofTmplAstBoundEvent = js.native
  
  var TmplAstBoundText: Instantiable2[
    /* value */ AST, 
    /* sourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.TmplAstBoundText
  ] = js.native
  
  var TmplAstContent: Instantiable3[
    /* selector */ String, 
    /* attributes */ js.Array[TmplAstTextAttribute], 
    /* sourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.TmplAstContent
  ] = js.native
  
  var TmplAstElement: Instantiable8[
    /* name */ String, 
    /* attributes */ js.Array[TmplAstTextAttribute], 
    /* inputs */ js.Array[TmplAstBoundAttribute], 
    /* outputs */ js.Array[TmplAstBoundEvent], 
    /* children */ js.Array[TmplAstNode], 
    /* references */ js.Array[TmplAstReference], 
    /* sourceSpan */ ParseSourceSpan, 
    /* startSourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.TmplAstElement
  ] = js.native
  
  var TmplAstIcu: Instantiable3[
    /* vars */ StringDictionary[TmplAstBoundText], 
    /* placeholders */ StringDictionary[TmplAstText | TmplAstBoundText], 
    /* sourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.TmplAstIcu
  ] = js.native
  
  var TmplAstRecursiveVisitor: Instantiable0[typings.angularCompiler.mod.TmplAstRecursiveVisitor] = js.native
  
  var TmplAstReference: Instantiable4[
    /* name */ String, 
    /* value */ String, 
    /* sourceSpan */ ParseSourceSpan, 
    /* keySpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.TmplAstReference
  ] = js.native
  
  var TmplAstTemplate: Instantiable10[
    /* tagName */ String, 
    /* attributes */ js.Array[TmplAstTextAttribute], 
    /* inputs */ js.Array[TmplAstBoundAttribute], 
    /* outputs */ js.Array[TmplAstBoundEvent], 
    /* templateAttrs */ js.Array[TmplAstBoundAttribute | TmplAstTextAttribute], 
    /* children */ js.Array[TmplAstNode], 
    /* references */ js.Array[TmplAstReference], 
    /* variables */ js.Array[TmplAstVariable], 
    /* sourceSpan */ ParseSourceSpan, 
    /* startSourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.TmplAstTemplate
  ] = js.native
  
  var TmplAstText: Instantiable2[
    /* value */ String, 
    /* sourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.TmplAstText
  ] = js.native
  
  var TmplAstTextAttribute: Instantiable3[
    /* name */ String, 
    /* value */ String, 
    /* sourceSpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.TmplAstTextAttribute
  ] = js.native
  
  var TmplAstVariable: Instantiable4[
    /* name */ String, 
    /* value */ String, 
    /* sourceSpan */ ParseSourceSpan, 
    /* keySpan */ ParseSourceSpan, 
    typings.angularCompiler.mod.TmplAstVariable
  ] = js.native
  
  var Token: Instantiable5[
    /* index */ Double, 
    /* end */ Double, 
    /* type */ TokenType, 
    /* numValue */ Double, 
    /* strValue */ String, 
    typings.angularCompiler.mod.Token
  ] = js.native
  
  var TreeError: TypeofTreeError = js.native
  
  var Type: Instantiable0[typings.angularCompiler.mod.Type] = js.native
  
  var TypeofExpr: Instantiable1[/* expr */ Expression, typings.angularCompiler.mod.TypeofExpr] = js.native
  
  var Unary: TypeofUnary = js.native
  
  var UnaryOperatorExpr: Instantiable2[
    /* operator */ UnaryOperator, 
    /* expr */ Expression, 
    typings.angularCompiler.mod.UnaryOperatorExpr
  ] = js.native
  
  val VERSION: Version = js.native
  
  var VariableBinding: Instantiable2[
    /* sourceSpan */ AbsoluteSourceSpan, 
    /* key */ TemplateBindingIdentifier, 
    typings.angularCompiler.mod.VariableBinding
  ] = js.native
  
  var Version: Instantiable1[/* full */ String, typings.angularCompiler.mod.Version] = js.native
  
  var WrappedNodeExpr: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* node */ Any, 
    typings.angularCompiler.mod.WrappedNodeExpr[js.Object]
  ] = js.native
  
  var WriteKeyExpr: Instantiable3[
    /* receiver */ Expression, 
    /* index */ Expression, 
    /* value */ Expression, 
    typings.angularCompiler.mod.WriteKeyExpr
  ] = js.native
  
  var WritePropExpr: Instantiable3[
    /* receiver */ Expression, 
    /* name */ String, 
    /* value */ Expression, 
    typings.angularCompiler.mod.WritePropExpr
  ] = js.native
  
  var WriteVarExpr: Instantiable2[/* name */ String, /* value */ Expression, typings.angularCompiler.mod.WriteVarExpr] = js.native
  
  var Xliff: Instantiable0[typings.angularCompiler.mod.Xliff] = js.native
  
  var Xliff2: Instantiable0[typings.angularCompiler.mod.Xliff2] = js.native
  
  var Xmb: Instantiable0[typings.angularCompiler.mod.Xmb] = js.native
  
  var XmlParser: Instantiable0[typings.angularCompiler.mod.XmlParser] = js.native
  
  var Xtb: Instantiable0[typings.angularCompiler.mod.Xtb] = js.native
  
  var _ParseAST: Instantiable7[
    /* input */ String, 
    /* location */ String, 
    /* absoluteOffset */ Double, 
    /* tokens */ js.Array[Token], 
    /* parseFlags */ ParseFlags, 
    /* errors */ js.Array[ParserError], 
    /* offset */ Double, 
    ParseAST
  ] = js.native
  
  def compileClassMetadata(metadata: R3ClassMetadata): Expression = js.native
  
  def compileComponentFromMetadata(
    meta: R3ComponentMetadata[R3TemplateDependency],
    constantPool: ConstantPool,
    bindingParser: BindingParser
  ): R3CompiledExpression = js.native
  
  def compileDeclareClassMetadata(metadata: R3ClassMetadata): Expression = js.native
  
  def compileDeclareComponentFromMetadata(
    meta: R3ComponentMetadata[R3TemplateDependencyMetadata],
    template: ParsedTemplate,
    additionalTemplateInfo: DeclareComponentTemplateInfo
  ): R3CompiledExpression = js.native
  
  def compileDeclareDirectiveFromMetadata(meta: R3DirectiveMetadata): R3CompiledExpression = js.native
  
  def compileDeclareFactoryFunction(meta: R3FactoryMetadata): R3CompiledExpression = js.native
  
  def compileDeclareInjectableFromMetadata(meta: R3InjectableMetadata): R3CompiledExpression = js.native
  
  def compileDeclareInjectorFromMetadata(meta: R3InjectorMetadata): R3CompiledExpression = js.native
  
  def compileDeclareNgModuleFromMetadata(meta: R3NgModuleMetadata): R3CompiledExpression = js.native
  
  def compileDeclarePipeFromMetadata(meta: R3PipeMetadata): R3CompiledExpression = js.native
  
  def compileDirectiveFromMetadata(meta: R3DirectiveMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3CompiledExpression = js.native
  
  def compileFactoryFunction(meta: R3FactoryMetadata): R3CompiledExpression = js.native
  
  def compileInjectable(meta: R3InjectableMetadata, resolveForwardRefs: Boolean): R3CompiledExpression = js.native
  
  def compileInjector(meta: R3InjectorMetadata): R3CompiledExpression = js.native
  
  def compileNgModule(meta: R3NgModuleMetadata): R3CompiledExpression = js.native
  
  def compilePipeFromMetadata(metadata: R3PipeMetadata): R3CompiledExpression = js.native
  
  def computeMsgId(msg: String): String = js.native
  def computeMsgId(msg: String, meaning: String): String = js.native
  
  val core: Any = js.native
  
  def createInjectableType(meta: R3InjectableMetadata): ExpressionType = js.native
  
  def createMayBeForwardRefExpression[T /* <: Expression */](expression: T, forwardRef: ForwardRefHandling): MaybeForwardRefExpression[T] = js.native
  
  def devOnlyGuardedExpression(expr: Expression): Expression = js.native
  
  val emitDistinctChangesOnlyDefaultValue: /* true */ Boolean = js.native
  
  def getHtmlTagDefinition(tagName: String): HtmlTagDefinition = js.native
  
  def getNsPrefix(fullName: String): String = js.native
  def getNsPrefix(fullName: Null): Null = js.native
  
  def getSafePropertyAccessString(accessor: String, name: String): String = js.native
  
  val html: Any = js.native
  
  val i18n: Any = js.native
  
  def identifierName(): String | Null = js.native
  def identifierName(compileIdentifier: CompileIdentifierMetadata): String | Null = js.native
  
  def isIdentifier(input: String): Boolean = js.native
  
  def isNgContainer(tagName: String): Boolean = js.native
  
  def isNgContent(tagName: String): Boolean = js.native
  
  def isNgTemplate(tagName: String): Boolean = js.native
  
  def jsDocComment(): JSDocComment_ = js.native
  def jsDocComment(tags: js.Array[JSDocTag]): JSDocComment_ = js.native
  
  def leadingComment(text: String): LeadingComment_ = js.native
  def leadingComment(text: String, multiline: Boolean): LeadingComment_ = js.native
  def leadingComment(text: String, multiline: Boolean, trailingNewline: Boolean): LeadingComment_ = js.native
  def leadingComment(text: String, multiline: Unit, trailingNewline: Boolean): LeadingComment_ = js.native
  
  def literalMap(values: js.Array[Key]): LiteralMapExpr = js.native
  def literalMap(values: js.Array[Key], `type`: MapType): LiteralMapExpr = js.native
  
  def makeBindingParser(): BindingParser = js.native
  def makeBindingParser(interpolationConfig: InterpolationConfig): BindingParser = js.native
  
  def mergeNsAndName(prefix: String, localName: String): String = js.native
  
  val outputAst: Any = js.native
  
  def parseHostBindings(host: StringDictionary[String | Expression]): ParsedHostBindings = js.native
  
  def parseTemplate(template: String, templateUrl: String): ParsedTemplate = js.native
  def parseTemplate(template: String, templateUrl: String, options: ParseTemplateOptions): ParsedTemplate = js.native
  
  def preserveWhitespacesDefault(): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean, defaultSetting: Boolean): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Null, defaultSetting: Boolean): Boolean = js.native
  
  def publishFacade(global: Any): Unit = js.native
  
  def r3JitTypeSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = js.native
  
  def sanitizeIdentifier(name: String): String = js.native
  
  def splitNsName(elementName: String): js.Tuple2[String | Null, String] = js.native
  
  val t: Any = js.native
  
  def verifyHostBindings(bindings: ParsedHostBindings, sourceSpan: ParseSourceSpan): js.Array[ParseError] = js.native
  
  def visitAll(visitor: Visitor, nodes: js.Array[Node2]): js.Array[Any] = js.native
  def visitAll(visitor: Visitor, nodes: js.Array[Node2], context: Any): js.Array[Any] = js.native
}
