package typings
package atAngularCompilerLib.srcAotCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler", "AotCompiler")
@js.native
class AotCompiler protected () extends js.Object {
  def this(_config: atAngularCompilerLib.srcConfigMod.CompilerConfig, _options: atAngularCompilerLib.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions, _host: atAngularCompilerLib.srcAotCompilerUnderscoreHostMod.AotCompilerHost, reflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector, _metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver, _templateParser: atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParser, _styleCompiler: atAngularCompilerLib.srcStyleUnderscoreCompilerMod.StyleCompiler, _viewCompiler: atAngularCompilerLib.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.ViewCompiler, _typeCheckCompiler: atAngularCompilerLib.srcViewUnderscoreCompilerTypeUnderscoreCheckUnderscoreCompilerMod.TypeCheckCompiler, _ngModuleCompiler: atAngularCompilerLib.srcNgUnderscoreModuleUnderscoreCompilerMod.NgModuleCompiler, _injectableCompiler: atAngularCompilerLib.srcInjectableUnderscoreCompilerMod.InjectableCompiler, _outputEmitter: atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.OutputEmitter, _summaryResolver: atAngularCompilerLib.srcSummaryUnderscoreResolverMod.SummaryResolver[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol], _symbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver) = this()
  var _analyzeFile: js.Any = js.native
  var _analyzeFileForInjectables: js.Any = js.native
  var _analyzedFiles: js.Any = js.native
  var _analyzedFilesForInjectables: js.Any = js.native
  var _codegenSourceModule: js.Any = js.native
  var _codegenStyles: js.Any = js.native
  var _compileComponent: js.Any = js.native
  var _compileComponentFactory: js.Any = js.native
  var _compileImplFile: js.Any = js.native
  var _compileModule: js.Any = js.native
  var _compilePartialModule: js.Any = js.native
  var _compileShallowModules: js.Any = js.native
  var _config: js.Any = js.native
  var _createNgFactoryStub: js.Any = js.native
  var _createOutputContext: js.Any = js.native
  var _createSummary: js.Any = js.native
  var _createTypeCheckBlock: js.Any = js.native
  var _emitPartialModule2: js.Any = js.native
  var _externalIdentifierReferences: js.Any = js.native
  var _fileNameToModuleName: js.Any = js.native
  var _host: js.Any = js.native
  var _injectableCompiler: js.Any = js.native
  var _metadataResolver: js.Any = js.native
  var _ngModuleCompiler: js.Any = js.native
  var _options: js.Any = js.native
  var _outputEmitter: js.Any = js.native
  var _parseTemplate: js.Any = js.native
  var _styleCompiler: js.Any = js.native
  var _summaryResolver: js.Any = js.native
  var _symbolResolver: js.Any = js.native
  var _templateAstCache: js.Any = js.native
  var _templateParser: js.Any = js.native
  var _typeCheckCompiler: js.Any = js.native
  var _viewCompiler: js.Any = js.native
  val reflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector = js.native
  def analyzeModulesAsync(rootFiles: js.Array[java.lang.String]): js.Promise[NgAnalyzedModules] = js.native
  def analyzeModulesSync(rootFiles: js.Array[java.lang.String]): NgAnalyzedModules = js.native
  def clearCache(): scala.Unit = js.native
  def emitAllImpls(analyzeResult: NgAnalyzedModules): js.Array[atAngularCompilerLib.srcAotGeneratedUnderscoreFileMod.GeneratedFile] = js.native
  def emitAllPartialModules(
    hasNgModuleByPipeOrDirectiveFiles: NgAnalyzedModules,
    r3Files: js.Array[NgAnalyzedFileWithInjectables]
  ): js.Array[atAngularCompilerLib.srcAotPartialUnderscoreModuleMod.PartialModule] = js.native
  def emitAllPartialModules2(files: js.Array[NgAnalyzedFileWithInjectables]): js.Array[atAngularCompilerLib.srcAotPartialUnderscoreModuleMod.PartialModule] = js.native
  def emitBasicStub(genFileName: java.lang.String): atAngularCompilerLib.srcAotGeneratedUnderscoreFileMod.GeneratedFile = js.native
  def emitBasicStub(genFileName: java.lang.String, originalFileName: java.lang.String): atAngularCompilerLib.srcAotGeneratedUnderscoreFileMod.GeneratedFile = js.native
  def emitMessageBundle(analyzeResult: NgAnalyzedModules): atAngularCompilerLib.srcI18nMessageUnderscoreBundleMod.MessageBundle = js.native
  def emitMessageBundle(analyzeResult: NgAnalyzedModules, locale: java.lang.String): atAngularCompilerLib.srcI18nMessageUnderscoreBundleMod.MessageBundle = js.native
  def emitTypeCheckStub(genFileName: java.lang.String, originalFileName: java.lang.String): atAngularCompilerLib.srcAotGeneratedUnderscoreFileMod.GeneratedFile | scala.Null = js.native
  def findGeneratedFileNames(fileName: java.lang.String): js.Array[java.lang.String] = js.native
  def listLazyRoutes(): js.Array[atAngularCompilerLib.srcAotLazyUnderscoreRoutesMod.LazyRoute] = js.native
  def listLazyRoutes(entryRoute: java.lang.String): js.Array[atAngularCompilerLib.srcAotLazyUnderscoreRoutesMod.LazyRoute] = js.native
  def listLazyRoutes(entryRoute: java.lang.String, analyzedModules: NgAnalyzedModules): js.Array[atAngularCompilerLib.srcAotLazyUnderscoreRoutesMod.LazyRoute] = js.native
  def loadFilesAsync(fileNames: js.Array[java.lang.String], tsFiles: js.Array[java.lang.String]): js.Promise[atAngularCompilerLib.Anon_AnalyzedInjectables] = js.native
  def loadFilesSync(fileNames: js.Array[java.lang.String], tsFiles: js.Array[java.lang.String]): atAngularCompilerLib.Anon_AnalyzedInjectables = js.native
}

