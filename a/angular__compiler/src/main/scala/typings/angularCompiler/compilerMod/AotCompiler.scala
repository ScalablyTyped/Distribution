package typings.angularCompiler.compilerMod

import typings.angularCompiler.abstractEmitterMod.OutputEmitter
import typings.angularCompiler.anon.AnalyzedInjectables
import typings.angularCompiler.compilerHostMod.AotCompilerHost
import typings.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typings.angularCompiler.configMod.CompilerConfig
import typings.angularCompiler.generatedFileMod.GeneratedFile
import typings.angularCompiler.injectableCompilerMod.InjectableCompiler
import typings.angularCompiler.lazyRoutesMod.LazyRoute
import typings.angularCompiler.messageBundleMod.MessageBundle
import typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typings.angularCompiler.ngModuleCompilerMod.NgModuleCompiler
import typings.angularCompiler.partialModuleMod.PartialModule
import typings.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typings.angularCompiler.staticReflectorMod.StaticReflector
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import typings.angularCompiler.styleCompilerMod.StyleCompiler
import typings.angularCompiler.templateParserMod.TemplateParser
import typings.angularCompiler.typeCheckCompilerMod.TypeCheckCompiler
import typings.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler", "AotCompiler")
@js.native
class AotCompiler protected () extends js.Object {
  def this(
    _config: CompilerConfig,
    _options: AotCompilerOptions,
    _host: AotCompilerHost,
    reflector: StaticReflector,
    _metadataResolver: CompileMetadataResolver,
    _templateParser: TemplateParser,
    _styleCompiler: StyleCompiler,
    _viewCompiler: ViewCompiler,
    _typeCheckCompiler: TypeCheckCompiler,
    _ngModuleCompiler: NgModuleCompiler,
    _injectableCompiler: InjectableCompiler,
    _outputEmitter: OutputEmitter,
    _summaryResolver: SummaryResolver[StaticSymbol],
    _symbolResolver: StaticSymbolResolver
  ) = this()
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
  val reflector: StaticReflector = js.native
  def analyzeModulesAsync(rootFiles: js.Array[String]): js.Promise[NgAnalyzedModules] = js.native
  def analyzeModulesSync(rootFiles: js.Array[String]): NgAnalyzedModules = js.native
  def clearCache(): Unit = js.native
  def emitAllImpls(analyzeResult: NgAnalyzedModules): js.Array[GeneratedFile] = js.native
  def emitAllPartialModules(
    hasNgModuleByPipeOrDirectiveFiles: NgAnalyzedModules,
    r3Files: js.Array[NgAnalyzedFileWithInjectables]
  ): js.Array[PartialModule] = js.native
  def emitAllPartialModules2(files: js.Array[NgAnalyzedFileWithInjectables]): js.Array[PartialModule] = js.native
  def emitBasicStub(genFileName: String): GeneratedFile = js.native
  def emitBasicStub(genFileName: String, originalFileName: String): GeneratedFile = js.native
  def emitMessageBundle(analyzeResult: NgAnalyzedModules): MessageBundle = js.native
  def emitMessageBundle(analyzeResult: NgAnalyzedModules, locale: String): MessageBundle = js.native
  def emitTypeCheckStub(genFileName: String, originalFileName: String): GeneratedFile | Null = js.native
  def findGeneratedFileNames(fileName: String): js.Array[String] = js.native
  def listLazyRoutes(): js.Array[LazyRoute] = js.native
  def listLazyRoutes(entryRoute: String): js.Array[LazyRoute] = js.native
  def listLazyRoutes(entryRoute: String, analyzedModules: NgAnalyzedModules): js.Array[LazyRoute] = js.native
  def loadFilesAsync(fileNames: js.Array[String], tsFiles: js.Array[String]): js.Promise[AnalyzedInjectables] = js.native
  def loadFilesSync(fileNames: js.Array[String], tsFiles: js.Array[String]): AnalyzedInjectables = js.native
}

