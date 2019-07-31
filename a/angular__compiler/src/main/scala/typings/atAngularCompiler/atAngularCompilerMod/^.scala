package typings.atAngularCompiler.atAngularCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.Anon_Compiler
import typings.atAngularCompiler.Anon_ContainingFileName
import typings.atAngularCompiler.Anon_Errors
import typings.atAngularCompiler.Anon_Expression
import typings.atAngularCompiler.Anon_ExpressionType
import typings.atAngularCompiler.Anon_IsInline
import typings.atAngularCompiler.Anon_Key
import typings.atAngularCompiler.Anon_Type
import typings.atAngularCompiler.Anon_TypeCompileTypeMetadata
import typings.atAngularCompiler.atAngularCompilerStrings.BACKSLASHuE500
import typings.atAngularCompiler.atAngularCompilerStrings.ngComponentType
import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzeModulesHost
import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzedFile
import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzedFileWithInjectables
import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzedModules
import typings.atAngularCompiler.srcAotCompilerUnderscoreHostMod.AotCompilerHost
import typings.atAngularCompiler.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions
import typings.atAngularCompiler.srcAotFormattedUnderscoreErrorMod.FormattedError
import typings.atAngularCompiler.srcAotFormattedUnderscoreErrorMod.FormattedMessageChain
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTokenMetadata
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AstVisitor
import typings.atAngularCompiler.srcInjectableUnderscoreCompilerUnderscore2Mod.InjectableDef
import typings.atAngularCompiler.srcInjectableUnderscoreCompilerUnderscore2Mod.R3InjectableMetadata
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.HtmlAstPath
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Visitor
import typings.atAngularCompiler.srcRender3R3UnderscoreModuleUnderscoreCompilerMod.R3InjectorDef
import typings.atAngularCompiler.srcRender3R3UnderscoreModuleUnderscoreCompilerMod.R3InjectorMetadata
import typings.atAngularCompiler.srcRender3R3UnderscoreModuleUnderscoreCompilerMod.R3NgModuleDef
import typings.atAngularCompiler.srcRender3R3UnderscoreModuleUnderscoreCompilerMod.R3NgModuleMetadata
import typings.atAngularCompiler.srcRender3R3UnderscorePipeUnderscoreCompilerMod.R3PipeMetadata
import typings.atAngularCompiler.srcRender3ViewApiMod.R3ComponentDef
import typings.atAngularCompiler.srcRender3ViewApiMod.R3ComponentMetadata
import typings.atAngularCompiler.srcRender3ViewApiMod.R3DirectiveDef
import typings.atAngularCompiler.srcRender3ViewApiMod.R3DirectiveMetadata
import typings.atAngularCompiler.srcRender3ViewCompilerMod.ParsedHostBindings
import typings.atAngularCompiler.srcRender3ViewCompilerMod.R3BaseRefMetaData
import typings.atAngularCompiler.srcRender3ViewTemplateMod.ParseTemplateOptions
import typings.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor
import typings.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolverCtor
import typings.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.StaticAndDynamicQueryIds
import typings.std.Error
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CONTENT_ATTR: String = js.native
  val DEFAULT_INTERPOLATION_CONFIG: typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig = js.native
  val DYNAMIC_TYPE: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val EMPTY_PARSE_LOCATION: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseLocation = js.native
  val EMPTY_SOURCE_SPAN: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  val EOF: typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.Token = js.native
  val ERROR_COMPONENT_TYPE: ngComponentType = js.native
  val HOST_ATTR: String = js.native
  val NGSP_UNICODE: BACKSLASHuE500 = js.native
  val STRING_TYPE: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val UrlResolver: UrlResolverCtor = js.native
  val VERSION: typings.atAngularCompiler.srcUtilMod.Version = js.native
  def analyzeAndValidateNgModules(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): NgAnalyzedModules = js.native
  def analyzeFile(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
  def analyzeFileForInjectables(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFileWithInjectables = js.native
  def analyzeNgModules(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): NgAnalyzedModules = js.native
  def collectExternalReferences(stmts: js.Array[typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement]): js.Array[typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalReference] = js.native
  def compileBaseDefFromMetadata(
    meta: R3BaseRefMetaData,
    constantPool: typings.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: BindingParser
  ): Anon_ExpressionType = js.native
  def compileComponentFromMetadata(
    meta: R3ComponentMetadata,
    constantPool: typings.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3ComponentDef = js.native
  def compileDirectiveFromMetadata(
    meta: R3DirectiveMetadata,
    constantPool: typings.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3DirectiveDef = js.native
  def compileInjectable(meta: R3InjectableMetadata): InjectableDef = js.native
  def compileInjector(meta: R3InjectorMetadata): R3InjectorDef = js.native
  def compileNgModule(meta: R3NgModuleMetadata): R3NgModuleDef = js.native
  def compilePipeFromMetadata(metadata: R3PipeMetadata): Anon_Expression = js.native
  def componentFactoryName(compType: js.Any): String = js.native
  def createAotCompiler(compilerHost: AotCompilerHost, options: AotCompilerOptions): Anon_Compiler = js.native
  def createAotCompiler(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): Anon_Compiler = js.native
  def createAotUrlResolver(host: Anon_ContainingFileName): typings.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolver = js.native
  def createElementCssSelector(elementName: String, attributes: js.Array[js.Tuple2[String, String]]): typings.atAngularCompiler.srcSelectorMod.CssSelector = js.native
  def createLoweredSymbol(id: Double): String = js.native
  def createOfflineCompileUrlResolver(): typings.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolver = js.native
  def createUrlResolverWithoutPackagePrefix(): typings.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolver = js.native
  def debugOutputAstAsTypeScript(ast: js.Array[_]): String = js.native
  def debugOutputAstAsTypeScript(ast: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression): String = js.native
  def debugOutputAstAsTypeScript(ast: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement): String = js.native
  def debugOutputAstAsTypeScript(ast: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type): String = js.native
  def findNode(nodes: js.Array[Node], position: Double): HtmlAstPath = js.native
  def findStaticQueryIds(nodes: js.Array[TemplateAst]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
  def findStaticQueryIds(nodes: js.Array[TemplateAst], result: Map[TemplateAst, StaticAndDynamicQueryIds]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
  def flatten[T](list: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def formattedError(chain: FormattedMessageChain): FormattedError = js.native
  def getHtmlTagDefinition(tagName: String): typings.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreTagsMod.HtmlTagDefinition = js.native
  def getNsPrefix(): Null = js.native
  def getNsPrefix(fullName: String): String = js.native
  def getParseErrors(error: Error): js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError] = js.native
  def getUrlScheme(url: String): String = js.native
  def hostViewClassName(compType: js.Any): String = js.native
  def identifierModuleUrl(compileIdentifier: CompileIdentifierMetadata): String = js.native
  def identifierName(): String | Null = js.native
  def identifierName(compileIdentifier: CompileIdentifierMetadata): String | Null = js.native
  def isEmptyExpression(ast: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST): Boolean = js.native
  def isFormattedError(error: Error): /* is @angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedError */ Boolean = js.native
  def isIdentifier(input: String): Boolean = js.native
  def isLoweredSymbol(name: String): Boolean = js.native
  def isNgContainer(tagName: String): Boolean = js.native
  def isNgContent(tagName: String): Boolean = js.native
  def isNgTemplate(tagName: String): Boolean = js.native
  def isQuote(code: Double): Boolean = js.native
  def isSyntaxError(error: Error): Boolean = js.native
  def literalMap(values: js.Array[Anon_Key]): typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
  def literalMap(
    values: js.Array[Anon_Key],
    `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.MapType
  ): typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
  def makeBindingParser(): BindingParser = js.native
  def makeBindingParser(
    interpolationConfig: typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): BindingParser = js.native
  def mergeAnalyzedFiles(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = js.native
  def mergeNsAndName(prefix: String, localName: String): String = js.native
  def ngModuleJitUrl(moduleMeta: typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata): String = js.native
  def parseHostBindings(
    host: StringDictionary[String | typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression]
  ): ParsedHostBindings = js.native
  def parseTemplate(template: String, templateUrl: String): Anon_Errors = js.native
  def parseTemplate(template: String, templateUrl: String, options: ParseTemplateOptions): Anon_Errors = js.native
  def preserveWhitespacesDefault(): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean, defaultSetting: Boolean): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Null, defaultSetting: Boolean): Boolean = js.native
  def publishFacade(global: js.Any): Unit = js.native
  def r3JitTypeSourceSpan(kind: String, typeName: String, sourceUrl: String): typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  def removeSummaryDuplicates[T /* <: Anon_TypeCompileTypeMetadata */](items: js.Array[T]): js.Array[T] = js.native
  def rendererTypeName(compType: js.Any): String = js.native
  def sanitizeIdentifier(name: String): String = js.native
  def sharedStylesheetJitUrl(
    meta: typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata,
    id: Double
  ): String = js.native
  def splitClasses(classAttrValue: String): js.Array[String] = js.native
  def splitNsName(elementName: String): js.Tuple2[String | Null, String] = js.native
  def staticViewQueryIds(nodeStaticQueryIds: Map[TemplateAst, StaticAndDynamicQueryIds]): StaticAndDynamicQueryIds = js.native
  def syntaxError(msg: String): Error = js.native
  def syntaxError(msg: String, parseErrors: js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]): Error = js.native
  def templateJitUrl(
    ngModuleType: CompileIdentifierMetadata,
    compMeta: typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
  ): String = js.native
  def templateSourceUrl(ngModuleType: CompileIdentifierMetadata, compMeta: Anon_Type, templateMeta: Anon_IsInline): String = js.native
  def templateVisitAll(visitor: TemplateAstVisitor, asts: js.Array[TemplateAst]): js.Array[_] = js.native
  def templateVisitAll(visitor: TemplateAstVisitor, asts: js.Array[TemplateAst], context: js.Any): js.Array[_] = js.native
  def toTypeScript(file: typings.atAngularCompiler.srcAotGeneratedUnderscoreFileMod.GeneratedFile): String = js.native
  def toTypeScript(file: typings.atAngularCompiler.srcAotGeneratedUnderscoreFileMod.GeneratedFile, preamble: String): String = js.native
  def tokenName(token: CompileTokenMetadata): String | Null = js.native
  def tokenReference(token: CompileTokenMetadata): js.Any = js.native
  def typeSourceSpan(kind: String, `type`: CompileIdentifierMetadata): typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  def unescapeIdentifier(identifier: String): String = js.native
  def unwrapResolvedMetadata(metadata: js.Any): js.Any = js.native
  def verifyHostBindings(
    bindings: ParsedHostBindings,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError] = js.native
  def viewClassName(compType: js.Any, embeddedTemplateIndex: Double): String = js.native
  def visitAll(visitor: Visitor, nodes: js.Array[Node]): js.Array[_] = js.native
  def visitAll(visitor: Visitor, nodes: js.Array[Node], context: js.Any): js.Array[_] = js.native
  def visitAstChildren(ast: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST, visitor: AstVisitor): Unit = js.native
  def visitAstChildren(
    ast: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    visitor: AstVisitor,
    context: js.Any
  ): Unit = js.native
}

