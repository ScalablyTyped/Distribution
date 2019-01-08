package typings
package atAngularCompilerLib.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", JSImport.Namespace)
@js.native
object compilerModMembers extends js.Object {
  val CONTENT_ATTR: java.lang.String = js.native
  val DEFAULT_INTERPOLATION_CONFIG: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig = js.native
  val EOF: atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.Token = js.native
  val ERROR_COMPONENT_TYPE: /* ngComponentType */ java.lang.String = js.native
  val HOST_ATTR: java.lang.String = js.native
  val NGSP_UNICODE: /* \\uE500 */ java.lang.String = js.native
  val UrlResolver: atAngularCompilerLib.srcUrlUnderscoreResolverMod.UrlResolverCtor = js.native
  val VERSION: atAngularCompilerLib.srcUtilMod.Version = js.native
  def analyzeAndValidateNgModules(
    fileNames: js.Array[java.lang.String],
    host: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedModules = js.native
  def analyzeFile(
    host: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedFile = js.native
  def analyzeFileForInjectables(
    host: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedFileWithInjectables = js.native
  def analyzeNgModules(
    fileNames: js.Array[java.lang.String],
    host: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedModules = js.native
  def collectExternalReferences(stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference] = js.native
  def compileBaseDefFromMetadata(meta: atAngularCompilerLib.srcRender3ViewCompilerMod.R3BaseRefMetaData): atAngularCompilerLib.Anon_ExpressionType = js.native
  def compileComponentFromMetadata(
    meta: atAngularCompilerLib.srcRender3ViewApiMod.R3ComponentMetadata,
    constantPool: atAngularCompilerLib.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
  ): atAngularCompilerLib.srcRender3ViewApiMod.R3ComponentDef = js.native
  def compileDirectiveFromMetadata(
    meta: atAngularCompilerLib.srcRender3ViewApiMod.R3DirectiveMetadata,
    constantPool: atAngularCompilerLib.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
  ): atAngularCompilerLib.srcRender3ViewApiMod.R3DirectiveDef = js.native
  def compileInjectable(meta: atAngularCompilerLib.srcInjectableUnderscoreCompilerUnderscore2Mod.R3InjectableMetadata): atAngularCompilerLib.srcInjectableUnderscoreCompilerUnderscore2Mod.InjectableDef = js.native
  def compileInjector(meta: atAngularCompilerLib.srcRender3R3UnderscoreModuleUnderscoreCompilerMod.R3InjectorMetadata): atAngularCompilerLib.srcRender3R3UnderscoreModuleUnderscoreCompilerMod.R3InjectorDef = js.native
  def compileNgModule(meta: atAngularCompilerLib.srcRender3R3UnderscoreModuleUnderscoreCompilerMod.R3NgModuleMetadata): atAngularCompilerLib.srcRender3R3UnderscoreModuleUnderscoreCompilerMod.R3NgModuleDef = js.native
  def compilePipeFromMetadata(metadata: atAngularCompilerLib.srcRender3R3UnderscorePipeUnderscoreCompilerMod.R3PipeMetadata): atAngularCompilerLib.Anon_Expression = js.native
  def componentFactoryName(compType: js.Any): java.lang.String = js.native
  def createAotCompiler(
    compilerHost: atAngularCompilerLib.srcAotCompilerUnderscoreHostMod.AotCompilerHost,
    options: atAngularCompilerLib.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions
  ): atAngularCompilerLib.Anon_Reflector = js.native
  def createAotCompiler(
    compilerHost: atAngularCompilerLib.srcAotCompilerUnderscoreHostMod.AotCompilerHost,
    options: atAngularCompilerLib.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], scala.Unit]
  ): atAngularCompilerLib.Anon_Reflector = js.native
  def createAotUrlResolver(host: atAngularCompilerLib.Anon_ResourceNameToFileName): atAngularCompilerLib.srcUrlUnderscoreResolverMod.UrlResolver = js.native
  def createElementCssSelector(elementName: java.lang.String, attributes: js.Array[js.Tuple2[java.lang.String, java.lang.String]]): atAngularCompilerLib.srcSelectorMod.CssSelector = js.native
  def createLoweredSymbol(id: scala.Double): java.lang.String = js.native
  def createOfflineCompileUrlResolver(): atAngularCompilerLib.srcUrlUnderscoreResolverMod.UrlResolver = js.native
  def createUrlResolverWithoutPackagePrefix(): atAngularCompilerLib.srcUrlUnderscoreResolverMod.UrlResolver = js.native
  def debugOutputAstAsTypeScript(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): java.lang.String = js.native
  def debugOutputAstAsTypeScript(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement): java.lang.String = js.native
  def debugOutputAstAsTypeScript(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type): java.lang.String = js.native
  def debugOutputAstAsTypeScript(ast: js.Array[_]): java.lang.String = js.native
  def findNode(nodes: js.Array[atAngularCompilerLib.srcMlUnderscoreParserAstMod.Node], position: scala.Double): atAngularCompilerLib.srcMlUnderscoreParserAstMod.HtmlAstPath = js.native
  def flatten[T](list: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def formattedError(chain: atAngularCompilerLib.srcAotFormattedUnderscoreErrorMod.FormattedMessageChain): atAngularCompilerLib.srcAotFormattedUnderscoreErrorMod.FormattedError = js.native
  def getHtmlTagDefinition(tagName: java.lang.String): atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreTagsMod.HtmlTagDefinition = js.native
  def getNsPrefix(): scala.Null = js.native
  def getNsPrefix(fullName: java.lang.String): java.lang.String = js.native
  def getParseErrors(error: stdLib.Error): js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError] = js.native
  def getUrlScheme(url: java.lang.String): java.lang.String = js.native
  def hostViewClassName(compType: js.Any): java.lang.String = js.native
  def identifierModuleUrl(compileIdentifier: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata): java.lang.String = js.native
  def identifierName(): java.lang.String | scala.Null = js.native
  def identifierName(compileIdentifier: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata): java.lang.String | scala.Null = js.native
  def isFormattedError(error: stdLib.Error): /* is @angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedError */ scala.Boolean = js.native
  def isIdentifier(input: java.lang.String): scala.Boolean = js.native
  def isLoweredSymbol(name: java.lang.String): scala.Boolean = js.native
  def isNgContainer(tagName: java.lang.String): scala.Boolean = js.native
  def isNgContent(tagName: java.lang.String): scala.Boolean = js.native
  def isNgTemplate(tagName: java.lang.String): scala.Boolean = js.native
  def isQuote(code: scala.Double): scala.Boolean = js.native
  def isSyntaxError(error: stdLib.Error): scala.Boolean = js.native
  def jitExpression(
    `def`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    context: org.scalablytyped.runtime.StringDictionary[js.Any],
    sourceUrl: java.lang.String,
    preStatements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): js.Any = js.native
  def makeBindingParser(): atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser = js.native
  def makeBindingParser(
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser = js.native
  def mergeAnalyzedFiles(analyzedFiles: js.Array[atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedFile]): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedModules = js.native
  def mergeNsAndName(prefix: java.lang.String, localName: java.lang.String): java.lang.String = js.native
  def ngModuleJitUrl(moduleMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata): java.lang.String = js.native
  def parseHostBindings(host: org.scalablytyped.runtime.StringDictionary[java.lang.String]): atAngularCompilerLib.Anon_Attributes = js.native
  def parseTemplate(template: java.lang.String, templateUrl: java.lang.String): atAngularCompilerLib.Anon_Nodes = js.native
  def parseTemplate(
    template: java.lang.String,
    templateUrl: java.lang.String,
    options: atAngularCompilerLib.Anon_InterpolationConfig
  ): atAngularCompilerLib.Anon_Nodes = js.native
  def preserveWhitespacesDefault(): scala.Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: scala.Boolean): scala.Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: scala.Boolean, defaultSetting: scala.Boolean): scala.Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: scala.Null, defaultSetting: scala.Boolean): scala.Boolean = js.native
  def publishFacade(global: js.Any): scala.Unit = js.native
  def removeSummaryDuplicates[T /* <: atAngularCompilerLib.Anon_Type */](items: js.Array[T]): js.Array[T] = js.native
  def rendererTypeName(compType: js.Any): java.lang.String = js.native
  def sanitizeIdentifier(name: java.lang.String): java.lang.String = js.native
  def sharedStylesheetJitUrl(
    meta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata,
    id: scala.Double
  ): java.lang.String = js.native
  def splitClasses(classAttrValue: java.lang.String): js.Array[java.lang.String] = js.native
  def splitNsName(elementName: java.lang.String): js.Tuple2[java.lang.String | scala.Null, java.lang.String] = js.native
  def syntaxError(msg: java.lang.String): stdLib.Error = js.native
  def syntaxError(
    msg: java.lang.String,
    parseErrors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]
  ): stdLib.Error = js.native
  def templateJitUrl(
    ngModuleType: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata,
    compMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
  ): java.lang.String = js.native
  def templateSourceUrl(
    ngModuleType: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata,
    compMeta: atAngularCompilerLib.Anon_TypeCompileIdentifierMetadata,
    templateMeta: atAngularCompilerLib.Anon_IsInline
  ): java.lang.String = js.native
  def templateVisitAll(
    visitor: atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor,
    asts: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ]
  ): js.Array[_] = js.native
  def templateVisitAll(
    visitor: atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor,
    asts: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ],
    context: js.Any
  ): js.Array[_] = js.native
  def toTypeScript(file: atAngularCompilerLib.srcAotGeneratedUnderscoreFileMod.GeneratedFile): java.lang.String = js.native
  def toTypeScript(
    file: atAngularCompilerLib.srcAotGeneratedUnderscoreFileMod.GeneratedFile,
    preamble: java.lang.String
  ): java.lang.String = js.native
  def tokenName(token: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTokenMetadata): java.lang.String | scala.Null = js.native
  def tokenReference(token: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTokenMetadata): js.Any = js.native
  def typeSourceSpan(
    kind: java.lang.String,
    `type`: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata
  ): atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  def unescapeIdentifier(identifier: java.lang.String): java.lang.String = js.native
  def unwrapResolvedMetadata(metadata: js.Any): js.Any = js.native
  def viewClassName(compType: js.Any, embeddedTemplateIndex: scala.Double): java.lang.String = js.native
  def visitAll(
    visitor: atAngularCompilerLib.srcMlUnderscoreParserAstMod.Visitor,
    nodes: js.Array[atAngularCompilerLib.srcMlUnderscoreParserAstMod.Node]
  ): js.Array[_] = js.native
  def visitAll(
    visitor: atAngularCompilerLib.srcMlUnderscoreParserAstMod.Visitor,
    nodes: js.Array[atAngularCompilerLib.srcMlUnderscoreParserAstMod.Node],
    context: js.Any
  ): js.Array[_] = js.native
  def visitAstChildren(
    ast: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    visitor: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AstVisitor
  ): scala.Unit = js.native
  def visitAstChildren(
    ast: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    visitor: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AstVisitor,
    context: js.Any
  ): scala.Unit = js.native
}

