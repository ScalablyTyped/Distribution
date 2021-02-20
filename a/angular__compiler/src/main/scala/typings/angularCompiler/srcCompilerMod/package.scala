package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcCompilerMod {
  
  @scala.inline
  def CONTENT_ATTR: java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("CONTENT_ATTR").asInstanceOf[java.lang.String]
  
  @scala.inline
  def CUSTOM_ELEMENTS_SCHEMA: typings.angularCompiler.coreMod.SchemaMetadata = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("CUSTOM_ELEMENTS_SCHEMA").asInstanceOf[typings.angularCompiler.coreMod.SchemaMetadata]
  
  @scala.inline
  def DEFAULT_INTERPOLATION_CONFIG: typings.angularCompiler.interpolationConfigMod.InterpolationConfig = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_INTERPOLATION_CONFIG").asInstanceOf[typings.angularCompiler.interpolationConfigMod.InterpolationConfig]
  
  @scala.inline
  def DYNAMIC_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("DYNAMIC_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def EOF: typings.angularCompiler.lexerMod.Token = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("EOF").asInstanceOf[typings.angularCompiler.lexerMod.Token]
  
  @scala.inline
  def ERROR_COMPONENT_TYPE: /* "ngComponentType" */ java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("ERROR_COMPONENT_TYPE").asInstanceOf[/* "ngComponentType" */ java.lang.String]
  
  @scala.inline
  def HOST_ATTR: java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("HOST_ATTR").asInstanceOf[java.lang.String]
  
  @scala.inline
  def NGSP_UNICODE: /* "\\uE500" */ java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("NGSP_UNICODE").asInstanceOf[/* "\\uE500" */ java.lang.String]
  
  @scala.inline
  def NONE_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("NONE_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def NO_ERRORS_SCHEMA: typings.angularCompiler.coreMod.SchemaMetadata = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("NO_ERRORS_SCHEMA").asInstanceOf[typings.angularCompiler.coreMod.SchemaMetadata]
  
  @scala.inline
  def STRING_TYPE: typings.angularCompiler.outputAstMod.BuiltinType = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("STRING_TYPE").asInstanceOf[typings.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def UrlResolver: typings.angularCompiler.urlResolverMod.UrlResolverCtor = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("UrlResolver").asInstanceOf[typings.angularCompiler.urlResolverMod.UrlResolverCtor]
  
  @scala.inline
  def VERSION_ : typings.angularCompiler.srcUtilMod.Version = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[typings.angularCompiler.srcUtilMod.Version]
  
  @scala.inline
  def analyzeAndValidateNgModules(
    fileNames: js.Array[java.lang.String],
    host: typings.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ): typings.angularCompiler.aotCompilerMod.NgAnalyzedModules = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("analyzeAndValidateNgModules")(fileNames.asInstanceOf[js.Any], host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.aotCompilerMod.NgAnalyzedModules]
  
  @scala.inline
  def analyzeFile(
    host: typings.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): typings.angularCompiler.aotCompilerMod.NgAnalyzedFile = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("analyzeFile")(host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.aotCompilerMod.NgAnalyzedFile]
  
  @scala.inline
  def analyzeFileForInjectables(
    host: typings.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): typings.angularCompiler.aotCompilerMod.NgAnalyzedFileWithInjectables = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("analyzeFileForInjectables")(host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.aotCompilerMod.NgAnalyzedFileWithInjectables]
  
  @scala.inline
  def analyzeNgModules(
    fileNames: js.Array[java.lang.String],
    host: typings.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ): typings.angularCompiler.aotCompilerMod.NgAnalyzedModules = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("analyzeNgModules")(fileNames.asInstanceOf[js.Any], host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.aotCompilerMod.NgAnalyzedModules]
  
  @scala.inline
  def collectExternalReferences(stmts: js.Array[typings.angularCompiler.outputAstMod.Statement]): js.Array[typings.angularCompiler.outputAstMod.ExternalReference] = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("collectExternalReferences")(stmts.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.angularCompiler.outputAstMod.ExternalReference]]
  
  @scala.inline
  def compileComponentFromMetadata(
    meta: typings.angularCompiler.apiMod.R3ComponentMetadata,
    constantPool: typings.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: typings.angularCompiler.bindingParserMod.BindingParser
  ): typings.angularCompiler.apiMod.R3ComponentDef = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileComponentFromMetadata")(meta.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.apiMod.R3ComponentDef]
  
  @scala.inline
  def compileDirectiveFromMetadata(
    meta: typings.angularCompiler.apiMod.R3DirectiveMetadata,
    constantPool: typings.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: typings.angularCompiler.bindingParserMod.BindingParser
  ): typings.angularCompiler.apiMod.R3DirectiveDef = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileDirectiveFromMetadata")(meta.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.apiMod.R3DirectiveDef]
  
  @scala.inline
  def compileFactoryFunction(meta: typings.angularCompiler.r3FactoryMod.R3FactoryMetadata): typings.angularCompiler.r3FactoryMod.R3FactoryFn = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileFactoryFunction")(meta.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.r3FactoryMod.R3FactoryFn]
  
  @scala.inline
  def compileInjectable(meta: typings.angularCompiler.injectableCompiler2Mod.R3InjectableMetadata): typings.angularCompiler.injectableCompiler2Mod.InjectableDef = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileInjectable")(meta.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.injectableCompiler2Mod.InjectableDef]
  
  @scala.inline
  def compileInjector(meta: typings.angularCompiler.r3ModuleCompilerMod.R3InjectorMetadata): typings.angularCompiler.r3ModuleCompilerMod.R3InjectorDef = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileInjector")(meta.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.r3ModuleCompilerMod.R3InjectorDef]
  
  @scala.inline
  def compileNgModule(meta: typings.angularCompiler.r3ModuleCompilerMod.R3NgModuleMetadata): typings.angularCompiler.r3ModuleCompilerMod.R3NgModuleDef = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileNgModule")(meta.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.r3ModuleCompilerMod.R3NgModuleDef]
  
  @scala.inline
  def compilePipeFromMetadata(metadata: typings.angularCompiler.r3PipeCompilerMod.R3PipeMetadata): typings.angularCompiler.anon.Expression = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compilePipeFromMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.anon.Expression]
  
  @scala.inline
  def componentFactoryName(compType: js.Any): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("componentFactoryName")(compType.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def computeMsgId(msg: java.lang.String): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("computeMsgId")(msg.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def computeMsgId(msg: java.lang.String, meaning: java.lang.String): java.lang.String = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("computeMsgId")(msg.asInstanceOf[js.Any], meaning.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def createAotCompiler(
    compilerHost: typings.angularCompiler.compilerHostMod.AotCompilerHost,
    options: typings.angularCompiler.compilerOptionsMod.AotCompilerOptions
  ): typings.angularCompiler.anon.Compiler = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createAotCompiler")(compilerHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.anon.Compiler]
  @scala.inline
  def createAotCompiler(
    compilerHost: typings.angularCompiler.compilerHostMod.AotCompilerHost,
    options: typings.angularCompiler.compilerOptionsMod.AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], scala.Unit]
  ): typings.angularCompiler.anon.Compiler = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createAotCompiler")(compilerHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any], errorCollector.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.anon.Compiler]
  
  @scala.inline
  def createAotUrlResolver(host: typings.angularCompiler.anon.ResourceNameToFileName): typings.angularCompiler.urlResolverMod.UrlResolver = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createAotUrlResolver")(host.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.urlResolverMod.UrlResolver]
  
  @scala.inline
  def createElementCssSelector(elementName: java.lang.String, attributes: js.Array[js.Tuple2[java.lang.String, java.lang.String]]): typings.angularCompiler.selectorMod.CssSelector = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createElementCssSelector")(elementName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.selectorMod.CssSelector]
  
  @scala.inline
  def createLoweredSymbol(id: scala.Double): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createLoweredSymbol")(id.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def createOfflineCompileUrlResolver(): typings.angularCompiler.urlResolverMod.UrlResolver = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createOfflineCompileUrlResolver")().asInstanceOf[typings.angularCompiler.urlResolverMod.UrlResolver]
  
  @scala.inline
  def createUrlResolverWithoutPackagePrefix(): typings.angularCompiler.urlResolverMod.UrlResolver = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createUrlResolverWithoutPackagePrefix")().asInstanceOf[typings.angularCompiler.urlResolverMod.UrlResolver]
  
  @scala.inline
  def debugOutputAstAsTypeScript(ast: js.Array[_]): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def debugOutputAstAsTypeScript(ast: typings.angularCompiler.outputAstMod.Expression): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def debugOutputAstAsTypeScript(ast: typings.angularCompiler.outputAstMod.Statement): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def debugOutputAstAsTypeScript(ast: typings.angularCompiler.outputAstMod.Type): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def findNode(nodes: js.Array[typings.angularCompiler.mlParserAstMod.Node], position: scala.Double): typings.angularCompiler.mlParserAstMod.HtmlAstPath = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(nodes.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.mlParserAstMod.HtmlAstPath]
  
  @scala.inline
  def flatten[T](list: js.Array[T | js.Array[T]]): js.Array[T] = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def formattedError(chain: typings.angularCompiler.formattedErrorMod.FormattedMessageChain): typings.angularCompiler.formattedErrorMod.FormattedError_ = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("formattedError")(chain.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.formattedErrorMod.FormattedError_]
  
  @scala.inline
  def getHtmlTagDefinition(tagName: java.lang.String): typings.angularCompiler.htmlTagsMod.HtmlTagDefinition = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlTagDefinition")(tagName.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.htmlTagsMod.HtmlTagDefinition]
  
  @scala.inline
  def getNsPrefix(fullName: java.lang.String): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNsPrefix")(fullName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def getNsPrefix(fullName: scala.Null): scala.Null = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNsPrefix")(fullName.asInstanceOf[js.Any]).asInstanceOf[scala.Null]
  
  @scala.inline
  def getParseErrors(error: typings.std.Error): js.Array[typings.angularCompiler.srcParseUtilMod.ParseError] = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getParseErrors")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]]
  
  @scala.inline
  def getUrlScheme(url: java.lang.String): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getUrlScheme")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def hostViewClassName(compType: js.Any): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("hostViewClassName")(compType.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def identifierModuleUrl(compileIdentifier: typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("identifierModuleUrl")(compileIdentifier.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def identifierName(): java.lang.String | scala.Null = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")().asInstanceOf[java.lang.String | scala.Null]
  @scala.inline
  def identifierName(compileIdentifier: typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata): java.lang.String | scala.Null = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")(compileIdentifier.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def isEmptyExpression(ast: typings.angularCompiler.astMod.AST): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyExpression")(ast.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isFormattedError(error: typings.std.Error): /* is @angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedError */ scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFormattedError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedError */ scala.Boolean]
  
  @scala.inline
  def isIdentifier(input: java.lang.String): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(input.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isLoweredSymbol(name: java.lang.String): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isLoweredSymbol")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNgContainer(tagName: java.lang.String): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNgContainer")(tagName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNgContent(tagName: java.lang.String): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNgContent")(tagName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNgTemplate(tagName: java.lang.String): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNgTemplate")(tagName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isQuote(code: scala.Double): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isQuote")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isSyntaxError(error: typings.std.Error): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSyntaxError")(error.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def jsDocComment(): typings.angularCompiler.outputAstMod.JSDocComment_ = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("jsDocComment")().asInstanceOf[typings.angularCompiler.outputAstMod.JSDocComment_]
  @scala.inline
  def jsDocComment(tags: js.Array[typings.angularCompiler.outputAstMod.JSDocTag]): typings.angularCompiler.outputAstMod.JSDocComment_ = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("jsDocComment")(tags.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.JSDocComment_]
  
  @scala.inline
  def leadingComment(text: java.lang.String): typings.angularCompiler.outputAstMod.LeadingComment_ = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.LeadingComment_]
  @scala.inline
  def leadingComment(text: java.lang.String, multiline: js.UndefOr[scala.Nothing], trailingNewline: scala.Boolean): typings.angularCompiler.outputAstMod.LeadingComment_ = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any], trailingNewline.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LeadingComment_]
  @scala.inline
  def leadingComment(text: java.lang.String, multiline: scala.Boolean): typings.angularCompiler.outputAstMod.LeadingComment_ = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LeadingComment_]
  @scala.inline
  def leadingComment(text: java.lang.String, multiline: scala.Boolean, trailingNewline: scala.Boolean): typings.angularCompiler.outputAstMod.LeadingComment_ = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any], trailingNewline.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LeadingComment_]
  
  @scala.inline
  def literalMap(values: js.Array[typings.angularCompiler.anon.Key]): typings.angularCompiler.outputAstMod.LiteralMapExpr = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalMap")(values.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralMapExpr]
  @scala.inline
  def literalMap(
    values: js.Array[typings.angularCompiler.anon.Key],
    `type`: typings.angularCompiler.outputAstMod.MapType
  ): typings.angularCompiler.outputAstMod.LiteralMapExpr = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalMap")(values.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.outputAstMod.LiteralMapExpr]
  
  @scala.inline
  def makeBindingParser(): typings.angularCompiler.bindingParserMod.BindingParser = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("makeBindingParser")().asInstanceOf[typings.angularCompiler.bindingParserMod.BindingParser]
  @scala.inline
  def makeBindingParser(interpolationConfig: typings.angularCompiler.interpolationConfigMod.InterpolationConfig): typings.angularCompiler.bindingParserMod.BindingParser = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("makeBindingParser")(interpolationConfig.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.bindingParserMod.BindingParser]
  
  @scala.inline
  def mergeAnalyzedFiles(analyzedFiles: js.Array[typings.angularCompiler.aotCompilerMod.NgAnalyzedFile]): typings.angularCompiler.aotCompilerMod.NgAnalyzedModules = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("mergeAnalyzedFiles")(analyzedFiles.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.aotCompilerMod.NgAnalyzedModules]
  
  @scala.inline
  def mergeNsAndName(prefix: java.lang.String, localName: java.lang.String): java.lang.String = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("mergeNsAndName")(prefix.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ngModuleJitUrl(moduleMeta: typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("ngModuleJitUrl")(moduleMeta.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def parseHostBindings(
    host: org.scalablytyped.runtime.StringDictionary[java.lang.String | typings.angularCompiler.outputAstMod.Expression]
  ): typings.angularCompiler.viewCompilerMod.ParsedHostBindings = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseHostBindings")(host.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.viewCompilerMod.ParsedHostBindings]
  
  @scala.inline
  def parseTemplate(template: java.lang.String, templateUrl: java.lang.String): typings.angularCompiler.templateMod.ParsedTemplate = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")(template.asInstanceOf[js.Any], templateUrl.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.templateMod.ParsedTemplate]
  @scala.inline
  def parseTemplate(
    template: java.lang.String,
    templateUrl: java.lang.String,
    options: typings.angularCompiler.templateMod.ParseTemplateOptions
  ): typings.angularCompiler.templateMod.ParsedTemplate = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")(template.asInstanceOf[js.Any], templateUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.templateMod.ParsedTemplate]
  
  @scala.inline
  def preserveWhitespacesDefault(): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")().asInstanceOf[scala.Boolean]
  @scala.inline
  def preserveWhitespacesDefault(preserveWhitespacesOption: scala.Boolean): scala.Boolean = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")(preserveWhitespacesOption.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def preserveWhitespacesDefault(preserveWhitespacesOption: scala.Boolean, defaultSetting: scala.Boolean): scala.Boolean = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")(preserveWhitespacesOption.asInstanceOf[js.Any], defaultSetting.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def preserveWhitespacesDefault(preserveWhitespacesOption: scala.Null, defaultSetting: scala.Boolean): scala.Boolean = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")(preserveWhitespacesOption.asInstanceOf[js.Any], defaultSetting.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def publishFacade(global: js.Any): scala.Unit = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("publishFacade")(global.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def r3JitTypeSourceSpan(kind: java.lang.String, typeName: java.lang.String, sourceUrl: java.lang.String): typings.angularCompiler.srcParseUtilMod.ParseSourceSpan = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("r3JitTypeSourceSpan")(kind.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any], sourceUrl.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.srcParseUtilMod.ParseSourceSpan]
  
  @scala.inline
  def removeSummaryDuplicates[T /* <: typings.angularCompiler.anon.TypeCompileTypeMetadata */](items: js.Array[T]): js.Array[T] = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("removeSummaryDuplicates")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def rendererTypeName(compType: js.Any): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("rendererTypeName")(compType.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def sanitizeIdentifier(name: java.lang.String): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def sharedStylesheetJitUrl(meta: typings.angularCompiler.compileMetadataMod.CompileStylesheetMetadata, id: scala.Double): java.lang.String = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("sharedStylesheetJitUrl")(meta.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def splitClasses(classAttrValue: java.lang.String): js.Array[java.lang.String] = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("splitClasses")(classAttrValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def splitNsName(elementName: java.lang.String): js.Tuple2[java.lang.String | scala.Null, java.lang.String] = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("splitNsName")(elementName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[java.lang.String | scala.Null, java.lang.String]]
  
  @scala.inline
  def syntaxError(msg: java.lang.String): typings.std.Error = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("syntaxError")(msg.asInstanceOf[js.Any]).asInstanceOf[typings.std.Error]
  @scala.inline
  def syntaxError(msg: java.lang.String, parseErrors: js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]): typings.std.Error = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("syntaxError")(msg.asInstanceOf[js.Any], parseErrors.asInstanceOf[js.Any])).asInstanceOf[typings.std.Error]
  
  @scala.inline
  def templateJitUrl(
    ngModuleType: typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata,
    compMeta: typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
  ): java.lang.String = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("templateJitUrl")(ngModuleType.asInstanceOf[js.Any], compMeta.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def templateSourceUrl(
    ngModuleType: typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata,
    compMeta: typings.angularCompiler.anon.Type,
    templateMeta: typings.angularCompiler.anon.IsInline
  ): java.lang.String = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("templateSourceUrl")(ngModuleType.asInstanceOf[js.Any], compMeta.asInstanceOf[js.Any], templateMeta.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def templateVisitAll(
    visitor: typings.angularCompiler.templateAstMod.TemplateAstVisitor,
    asts: js.Array[typings.angularCompiler.templateAstMod.TemplateAst]
  ): js.Array[_] = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("templateVisitAll")(visitor.asInstanceOf[js.Any], asts.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  @scala.inline
  def templateVisitAll(
    visitor: typings.angularCompiler.templateAstMod.TemplateAstVisitor,
    asts: js.Array[typings.angularCompiler.templateAstMod.TemplateAst],
    context: js.Any
  ): js.Array[_] = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("templateVisitAll")(visitor.asInstanceOf[js.Any], asts.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def toTypeScript(file: typings.angularCompiler.generatedFileMod.GeneratedFile): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("toTypeScript")(file.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toTypeScript(file: typings.angularCompiler.generatedFileMod.GeneratedFile, preamble: java.lang.String): java.lang.String = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("toTypeScript")(file.asInstanceOf[js.Any], preamble.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def tokenName(token: typings.angularCompiler.compileMetadataMod.CompileTokenMetadata): java.lang.String | scala.Null = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenName")(token.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def tokenReference(token: typings.angularCompiler.compileMetadataMod.CompileTokenMetadata): js.Any = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenReference")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def typeSourceSpan(
    kind: java.lang.String,
    `type`: typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
  ): typings.angularCompiler.srcParseUtilMod.ParseSourceSpan = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("typeSourceSpan")(kind.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.srcParseUtilMod.ParseSourceSpan]
  
  @scala.inline
  def unescapeIdentifier(identifier: java.lang.String): java.lang.String = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("unescapeIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def unwrapResolvedMetadata(metadata: js.Any): js.Any = typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrapResolvedMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def verifyHostBindings(
    bindings: typings.angularCompiler.viewCompilerMod.ParsedHostBindings,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): js.Array[typings.angularCompiler.srcParseUtilMod.ParseError] = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("verifyHostBindings")(bindings.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]]
  
  @scala.inline
  def viewClassName(compType: js.Any, embeddedTemplateIndex: scala.Double): java.lang.String = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("viewClassName")(compType.asInstanceOf[js.Any], embeddedTemplateIndex.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def visitAll(
    visitor: typings.angularCompiler.mlParserAstMod.Visitor,
    nodes: js.Array[typings.angularCompiler.mlParserAstMod.Node]
  ): js.Array[_] = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("visitAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  @scala.inline
  def visitAll(
    visitor: typings.angularCompiler.mlParserAstMod.Visitor,
    nodes: js.Array[typings.angularCompiler.mlParserAstMod.Node],
    context: js.Any
  ): js.Array[_] = (typings.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("visitAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
}
