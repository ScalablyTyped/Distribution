package typings.angularCompiler

import typings.angularCompiler.abstractEmitterMod.OutputEmitter
import typings.angularCompiler.anon.AnalyzedInjectables
import typings.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
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
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aotCompilerMod {
  
  @JSImport("@angular/compiler/src/aot/compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/aot/compiler", "AotCompiler")
  @js.native
  class AotCompiler protected () extends StObject {
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
    
    /* private */ var _analyzeFile: js.Any = js.native
    
    /* private */ var _analyzeFileForInjectables: js.Any = js.native
    
    /* private */ var _analyzedFiles: js.Any = js.native
    
    /* private */ var _analyzedFilesForInjectables: js.Any = js.native
    
    /* private */ var _codegenSourceModule: js.Any = js.native
    
    /* private */ var _codegenStyles: js.Any = js.native
    
    /* private */ var _compileComponent: js.Any = js.native
    
    /* private */ var _compileComponentFactory: js.Any = js.native
    
    /* private */ var _compileImplFile: js.Any = js.native
    
    /* private */ var _compileModule: js.Any = js.native
    
    /* private */ var _compilePartialModule: js.Any = js.native
    
    /* private */ var _compileShallowModules: js.Any = js.native
    
    /* private */ var _config: js.Any = js.native
    
    /* private */ var _createNgFactoryStub: js.Any = js.native
    
    /* private */ var _createOutputContext: js.Any = js.native
    
    /* private */ var _createSummary: js.Any = js.native
    
    /* private */ var _createTypeCheckBlock: js.Any = js.native
    
    /* private */ var _emitPartialModule2: js.Any = js.native
    
    /* private */ var _externalIdentifierReferences: js.Any = js.native
    
    /* private */ var _fileNameToModuleName: js.Any = js.native
    
    /* private */ var _host: js.Any = js.native
    
    /* private */ var _injectableCompiler: js.Any = js.native
    
    /* private */ var _metadataResolver: js.Any = js.native
    
    /* private */ var _ngModuleCompiler: js.Any = js.native
    
    /* private */ var _options: js.Any = js.native
    
    /* private */ var _outputEmitter: js.Any = js.native
    
    /* private */ var _parseTemplate: js.Any = js.native
    
    /* private */ var _styleCompiler: js.Any = js.native
    
    /* private */ var _summaryResolver: js.Any = js.native
    
    /* private */ var _symbolResolver: js.Any = js.native
    
    /* private */ var _templateAstCache: js.Any = js.native
    
    /* private */ var _templateParser: js.Any = js.native
    
    /* private */ var _typeCheckCompiler: js.Any = js.native
    
    /* private */ var _viewCompiler: js.Any = js.native
    
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
    def listLazyRoutes(entryRoute: Unit, analyzedModules: NgAnalyzedModules): js.Array[LazyRoute] = js.native
    
    def loadFilesAsync(fileNames: js.Array[String], tsFiles: js.Array[String]): js.Promise[AnalyzedInjectables] = js.native
    
    def loadFilesSync(fileNames: js.Array[String], tsFiles: js.Array[String]): AnalyzedInjectables = js.native
    
    val reflector: StaticReflector = js.native
  }
  
  inline def analyzeAndValidateNgModules(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver
  ): NgAnalyzedModules = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeAndValidateNgModules")(fileNames.asInstanceOf[js.Any], host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any])).asInstanceOf[NgAnalyzedModules]
  
  inline def analyzeFile(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeFile")(host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[NgAnalyzedFile]
  
  inline def analyzeFileForInjectables(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFileWithInjectables = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeFileForInjectables")(host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[NgAnalyzedFileWithInjectables]
  
  inline def analyzeNgModules(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver
  ): NgAnalyzedModules = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeNgModules")(fileNames.asInstanceOf[js.Any], host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any])).asInstanceOf[NgAnalyzedModules]
  
  inline def mergeAnalyzedFiles(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAnalyzedFiles")(analyzedFiles.asInstanceOf[js.Any]).asInstanceOf[NgAnalyzedModules]
  
  trait NgAnalyzeModulesHost extends StObject {
    
    def isSourceFile(filePath: String): Boolean
  }
  object NgAnalyzeModulesHost {
    
    inline def apply(isSourceFile: String => Boolean): NgAnalyzeModulesHost = {
      val __obj = js.Dynamic.literal(isSourceFile = js.Any.fromFunction1(isSourceFile))
      __obj.asInstanceOf[NgAnalyzeModulesHost]
    }
    
    extension [Self <: NgAnalyzeModulesHost](x: Self) {
      
      inline def setIsSourceFile(value: String => Boolean): Self = StObject.set(x, "isSourceFile", js.Any.fromFunction1(value))
    }
  }
  
  trait NgAnalyzedFile extends StObject {
    
    var abstractDirectives: js.Array[StaticSymbol]
    
    var directives: js.Array[StaticSymbol]
    
    var exportsNonSourceFiles: Boolean
    
    var fileName: String
    
    var injectables: js.Array[CompileInjectableMetadata]
    
    var ngModules: js.Array[CompileNgModuleMetadata]
    
    var pipes: js.Array[StaticSymbol]
  }
  object NgAnalyzedFile {
    
    inline def apply(
      abstractDirectives: js.Array[StaticSymbol],
      directives: js.Array[StaticSymbol],
      exportsNonSourceFiles: Boolean,
      fileName: String,
      injectables: js.Array[CompileInjectableMetadata],
      ngModules: js.Array[CompileNgModuleMetadata],
      pipes: js.Array[StaticSymbol]
    ): NgAnalyzedFile = {
      val __obj = js.Dynamic.literal(abstractDirectives = abstractDirectives.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], exportsNonSourceFiles = exportsNonSourceFiles.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], injectables = injectables.asInstanceOf[js.Any], ngModules = ngModules.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgAnalyzedFile]
    }
    
    extension [Self <: NgAnalyzedFile](x: Self) {
      
      inline def setAbstractDirectives(value: js.Array[StaticSymbol]): Self = StObject.set(x, "abstractDirectives", value.asInstanceOf[js.Any])
      
      inline def setAbstractDirectivesVarargs(value: StaticSymbol*): Self = StObject.set(x, "abstractDirectives", js.Array(value :_*))
      
      inline def setDirectives(value: js.Array[StaticSymbol]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesVarargs(value: StaticSymbol*): Self = StObject.set(x, "directives", js.Array(value :_*))
      
      inline def setExportsNonSourceFiles(value: Boolean): Self = StObject.set(x, "exportsNonSourceFiles", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setInjectables(value: js.Array[CompileInjectableMetadata]): Self = StObject.set(x, "injectables", value.asInstanceOf[js.Any])
      
      inline def setInjectablesVarargs(value: CompileInjectableMetadata*): Self = StObject.set(x, "injectables", js.Array(value :_*))
      
      inline def setNgModules(value: js.Array[CompileNgModuleMetadata]): Self = StObject.set(x, "ngModules", value.asInstanceOf[js.Any])
      
      inline def setNgModulesVarargs(value: CompileNgModuleMetadata*): Self = StObject.set(x, "ngModules", js.Array(value :_*))
      
      inline def setPipes(value: js.Array[StaticSymbol]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
      
      inline def setPipesVarargs(value: StaticSymbol*): Self = StObject.set(x, "pipes", js.Array(value :_*))
    }
  }
  
  trait NgAnalyzedFileWithInjectables extends StObject {
    
    var fileName: String
    
    var injectables: js.Array[CompileInjectableMetadata]
    
    var shallowModules: js.Array[CompileShallowModuleMetadata]
  }
  object NgAnalyzedFileWithInjectables {
    
    inline def apply(
      fileName: String,
      injectables: js.Array[CompileInjectableMetadata],
      shallowModules: js.Array[CompileShallowModuleMetadata]
    ): NgAnalyzedFileWithInjectables = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], injectables = injectables.asInstanceOf[js.Any], shallowModules = shallowModules.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgAnalyzedFileWithInjectables]
    }
    
    extension [Self <: NgAnalyzedFileWithInjectables](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setInjectables(value: js.Array[CompileInjectableMetadata]): Self = StObject.set(x, "injectables", value.asInstanceOf[js.Any])
      
      inline def setInjectablesVarargs(value: CompileInjectableMetadata*): Self = StObject.set(x, "injectables", js.Array(value :_*))
      
      inline def setShallowModules(value: js.Array[CompileShallowModuleMetadata]): Self = StObject.set(x, "shallowModules", value.asInstanceOf[js.Any])
      
      inline def setShallowModulesVarargs(value: CompileShallowModuleMetadata*): Self = StObject.set(x, "shallowModules", js.Array(value :_*))
    }
  }
  
  trait NgAnalyzedModules extends StObject {
    
    var files: js.Array[NgAnalyzedFile]
    
    var ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata]
    
    var ngModules: js.Array[CompileNgModuleMetadata]
    
    var symbolsMissingModule: js.UndefOr[js.Array[StaticSymbol]] = js.undefined
  }
  object NgAnalyzedModules {
    
    inline def apply(
      files: js.Array[NgAnalyzedFile],
      ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata],
      ngModules: js.Array[CompileNgModuleMetadata]
    ): NgAnalyzedModules = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], ngModuleByPipeOrDirective = ngModuleByPipeOrDirective.asInstanceOf[js.Any], ngModules = ngModules.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgAnalyzedModules]
    }
    
    extension [Self <: NgAnalyzedModules](x: Self) {
      
      inline def setFiles(value: js.Array[NgAnalyzedFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: NgAnalyzedFile*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setNgModuleByPipeOrDirective(value: Map[StaticSymbol, CompileNgModuleMetadata]): Self = StObject.set(x, "ngModuleByPipeOrDirective", value.asInstanceOf[js.Any])
      
      inline def setNgModules(value: js.Array[CompileNgModuleMetadata]): Self = StObject.set(x, "ngModules", value.asInstanceOf[js.Any])
      
      inline def setNgModulesVarargs(value: CompileNgModuleMetadata*): Self = StObject.set(x, "ngModules", js.Array(value :_*))
      
      inline def setSymbolsMissingModule(value: js.Array[StaticSymbol]): Self = StObject.set(x, "symbolsMissingModule", value.asInstanceOf[js.Any])
      
      inline def setSymbolsMissingModuleUndefined: Self = StObject.set(x, "symbolsMissingModule", js.undefined)
      
      inline def setSymbolsMissingModuleVarargs(value: StaticSymbol*): Self = StObject.set(x, "symbolsMissingModule", js.Array(value :_*))
    }
  }
}
