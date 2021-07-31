package typings.angularCompiler

import typings.angularCompiler.anon.Pipes
import typings.angularCompiler.anon.TypeCompileTypeMetadata
import typings.angularCompiler.astMod.AST
import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import typings.angularCompiler.compileMetadataMod.CompilePipeSummary
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.configMod.CompilerConfig
import typings.angularCompiler.coreMod.SchemaMetadata
import typings.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry
import typings.angularCompiler.htmlParserMod.HtmlParser
import typings.angularCompiler.htmlParserMod.ParseTreeResult
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.parserMod.Parser
import typings.angularCompiler.selectorMod.CssSelector
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseErrorLevel
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.angularCompiler.srcUtilMod.Console
import typings.angularCompiler.templateAstMod.TemplateAst
import typings.angularCompiler.templateAstMod.TemplateAstVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateParserMod {
  
  @JSImport("@angular/compiler/src/template_parser/template_parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/template_parser/template_parser", "TemplateParseError")
  @js.native
  class TemplateParseError protected () extends ParseError {
    def this(message: String, span: ParseSourceSpan, level: ParseErrorLevel) = this()
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_parser", "TemplateParseResult")
  @js.native
  class TemplateParseResult () extends StObject {
    def this(templateAst: js.Array[TemplateAst]) = this()
    def this(templateAst: js.Array[TemplateAst], usedPipes: js.Array[CompilePipeSummary]) = this()
    def this(templateAst: Unit, usedPipes: js.Array[CompilePipeSummary]) = this()
    def this(
      templateAst: js.Array[TemplateAst],
      usedPipes: js.Array[CompilePipeSummary],
      errors: js.Array[ParseError]
    ) = this()
    def this(templateAst: js.Array[TemplateAst], usedPipes: Unit, errors: js.Array[ParseError]) = this()
    def this(templateAst: Unit, usedPipes: js.Array[CompilePipeSummary], errors: js.Array[ParseError]) = this()
    def this(templateAst: Unit, usedPipes: Unit, errors: js.Array[ParseError]) = this()
    
    var errors: js.UndefOr[js.Array[ParseError]] = js.native
    
    var templateAst: js.UndefOr[js.Array[TemplateAst]] = js.native
    
    var usedPipes: js.UndefOr[js.Array[CompilePipeSummary]] = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_parser", "TemplateParser")
  @js.native
  class TemplateParser protected () extends StObject {
    def this(
      _config: CompilerConfig,
      _reflector: CompileReflector,
      _exprParser: Parser,
      _schemaRegistry: ElementSchemaRegistry,
      _htmlParser: HtmlParser,
      _console: Null,
      transforms: js.Array[TemplateAstVisitor]
    ) = this()
    def this(
      _config: CompilerConfig,
      _reflector: CompileReflector,
      _exprParser: Parser,
      _schemaRegistry: ElementSchemaRegistry,
      _htmlParser: HtmlParser,
      _console: Console,
      transforms: js.Array[TemplateAstVisitor]
    ) = this()
    
    var _config: js.Any = js.native
    
    var _console: js.Any = js.native
    
    var _exprParser: js.Any = js.native
    
    var _htmlParser: js.Any = js.native
    
    var _reflector: js.Any = js.native
    
    var _schemaRegistry: js.Any = js.native
    
    def expandHtml(htmlAstWithErrors: ParseTreeResult): ParseTreeResult = js.native
    def expandHtml(htmlAstWithErrors: ParseTreeResult, forced: Boolean): ParseTreeResult = js.native
    
    def expressionParser: Parser = js.native
    
    def getInterpolationConfig(component: CompileDirectiveMetadata): js.UndefOr[InterpolationConfig] = js.native
    
    def parse(
      component: CompileDirectiveMetadata,
      template: String,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata],
      templateUrl: String,
      preserveWhitespaces: Boolean
    ): Pipes = js.native
    def parse(
      component: CompileDirectiveMetadata,
      template: ParseTreeResult,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata],
      templateUrl: String,
      preserveWhitespaces: Boolean
    ): Pipes = js.native
    
    var transforms: js.Array[TemplateAstVisitor] = js.native
    
    def tryParse(
      component: CompileDirectiveMetadata,
      template: String,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata],
      templateUrl: String,
      preserveWhitespaces: Boolean
    ): TemplateParseResult = js.native
    def tryParse(
      component: CompileDirectiveMetadata,
      template: ParseTreeResult,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata],
      templateUrl: String,
      preserveWhitespaces: Boolean
    ): TemplateParseResult = js.native
    
    def tryParseHtml(
      htmlAstWithErrors: ParseTreeResult,
      component: CompileDirectiveMetadata,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata]
    ): TemplateParseResult = js.native
  }
  
  @scala.inline
  def createElementCssSelector(elementName: String, attributes: js.Array[js.Tuple2[String, String]]): CssSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementCssSelector")(elementName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[CssSelector]
  
  @scala.inline
  def isEmptyExpression(ast: AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyExpression")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def removeSummaryDuplicates[T /* <: TypeCompileTypeMetadata */](items: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSummaryDuplicates")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def splitClasses(classAttrValue: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitClasses")(classAttrValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
