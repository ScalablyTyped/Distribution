package typings.angularCompiler

import typings.angularCompiler.anon.Annotation
import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import typings.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleSummary
import typings.angularCompiler.compileMetadataMod.CompilePipeMetadata
import typings.angularCompiler.compileMetadataMod.CompilePipeSummary
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
import typings.angularCompiler.compileMetadataMod.CompileTypeSummary
import typings.angularCompiler.compileMetadataMod.ProviderMeta
import typings.angularCompiler.compileMetadataMod.ProxyClass
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.configMod.CompilerConfig
import typings.angularCompiler.coreMod.Type
import typings.angularCompiler.directiveNormalizerMod.DirectiveNormalizer
import typings.angularCompiler.directiveResolverMod.DirectiveResolver
import typings.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry
import typings.angularCompiler.htmlParserMod.HtmlParser
import typings.angularCompiler.ngModuleResolverMod.NgModuleResolver
import typings.angularCompiler.pipeResolverMod.PipeResolver
import typings.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typings.angularCompiler.srcUtilMod.Console
import typings.angularCompiler.srcUtilMod.SyncAsync
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.angularCompiler.staticSymbolMod.StaticSymbolCache
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataResolverMod {
  
  @JSImport("@angular/compiler/src/metadata_resolver", "CompileMetadataResolver")
  @js.native
  class CompileMetadataResolver protected () extends StObject {
    def this(
      _config: CompilerConfig,
      _htmlParser: HtmlParser,
      _ngModuleResolver: NgModuleResolver,
      _directiveResolver: DirectiveResolver,
      _pipeResolver: PipeResolver,
      _summaryResolver: SummaryResolver[js.Any],
      _schemaRegistry: ElementSchemaRegistry,
      _directiveNormalizer: DirectiveNormalizer,
      _console: Console,
      _staticSymbolCache: StaticSymbolCache,
      _reflector: CompileReflector
    ) = this()
    def this(
      _config: CompilerConfig,
      _htmlParser: HtmlParser,
      _ngModuleResolver: NgModuleResolver,
      _directiveResolver: DirectiveResolver,
      _pipeResolver: PipeResolver,
      _summaryResolver: SummaryResolver[js.Any],
      _schemaRegistry: ElementSchemaRegistry,
      _directiveNormalizer: DirectiveNormalizer,
      _console: Console,
      _staticSymbolCache: StaticSymbolCache,
      _reflector: CompileReflector,
      _errorCollector: ErrorCollector
    ) = this()
    
    /* private */ var _addTypeToModule: js.Any = js.native
    
    /* private */ var _checkSelfImport: js.Any = js.native
    
    /* private */ var _config: js.Any = js.native
    
    /* private */ var _console: js.Any = js.native
    
    /* private */ var _createProxyClass: js.Any = js.native
    
    /* private */ var _directiveCache: js.Any = js.native
    
    /* private */ var _directiveNormalizer: js.Any = js.native
    
    /* private */ var _directiveResolver: js.Any = js.native
    
    /* private */ var _errorCollector: js.Any = js.native
    
    /* private */ var _getDependenciesMetadata: js.Any = js.native
    
    /* private */ var _getEntryComponentMetadata: js.Any = js.native
    
    /* private */ var _getEntryComponentsFromProvider: js.Any = js.native
    
    /* private */ var _getFactoryMetadata: js.Any = js.native
    
    /* private */ var _getIdentifierMetadata: js.Any = js.native
    
    /* private */ var _getInjectableTypeMetadata: js.Any = js.native
    
    /* private */ var _getProvidersMetadata: js.Any = js.native
    
    /* private */ var _getQueriesMetadata: js.Any = js.native
    
    /* private */ var _getQueryMetadata: js.Any = js.native
    
    /* private */ var _getTokenMetadata: js.Any = js.native
    
    /* private */ var _getTransitiveNgModuleMetadata: js.Any = js.native
    
    /* private */ var _getTypeDescriptor: js.Any = js.native
    
    /* private */ var _getTypeMetadata: js.Any = js.native
    
    /* private */ var _htmlParser: js.Any = js.native
    
    /* private */ var _loadPipeMetadata: js.Any = js.native
    
    /* private */ var _loadSummary: js.Any = js.native
    
    /* private */ var _ngModuleCache: js.Any = js.native
    
    /* private */ var _ngModuleOfTypes: js.Any = js.native
    
    /* private */ var _ngModuleResolver: js.Any = js.native
    
    /* private */ var _nonNormalizedDirectiveCache: js.Any = js.native
    
    /* private */ var _pipeCache: js.Any = js.native
    
    /* private */ var _pipeResolver: js.Any = js.native
    
    /* private */ var _queryVarBindings: js.Any = js.native
    
    /* private */ var _reflector: js.Any = js.native
    
    /* private */ var _reportError: js.Any = js.native
    
    /* private */ var _schemaRegistry: js.Any = js.native
    
    /* private */ var _shallowModuleCache: js.Any = js.native
    
    /* private */ var _staticSymbolCache: js.Any = js.native
    
    /* private */ var _summaryCache: js.Any = js.native
    
    /* private */ var _summaryResolver: js.Any = js.native
    
    /* private */ var _validateProvider: js.Any = js.native
    
    def clearCache(): Unit = js.native
    
    def clearCacheFor(`type`: Type): Unit = js.native
    
    /* private */ var getComponentFactory: js.Any = js.native
    
    /* private */ var getComponentViewClass: js.Any = js.native
    
    /**
      * Gets the metadata for the given directive.
      * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
      */
    def getDirectiveMetadata(directiveType: js.Any): CompileDirectiveMetadata = js.native
    
    def getDirectiveSummary(dirType: js.Any): CompileDirectiveSummary = js.native
    
    /* private */ var getGeneratedClass: js.Any = js.native
    
    def getHostComponentMetadata(compMeta: CompileDirectiveMetadata): CompileDirectiveMetadata = js.native
    def getHostComponentMetadata(compMeta: CompileDirectiveMetadata, hostViewType: ProxyClass): CompileDirectiveMetadata = js.native
    def getHostComponentMetadata(compMeta: CompileDirectiveMetadata, hostViewType: StaticSymbol): CompileDirectiveMetadata = js.native
    
    def getHostComponentType(dirType: js.Any): StaticSymbol | ProxyClass = js.native
    
    def getHostComponentViewClass(dirType: js.Any): StaticSymbol | ProxyClass = js.native
    
    def getInjectableMetadata(`type`: js.Any): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: js.Array[js.Any]): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: js.Array[js.Any], throwOnUnknownDeps: Boolean): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: Null, throwOnUnknownDeps: Boolean): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: Unit, throwOnUnknownDeps: Boolean): CompileInjectableMetadata | Null = js.native
    
    def getInjectableSummary(`type`: js.Any): CompileTypeSummary = js.native
    
    def getNgModuleMetadata(moduleType: js.Any): CompileNgModuleMetadata | Null = js.native
    def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: Boolean): CompileNgModuleMetadata | Null = js.native
    def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: Boolean, alreadyCollecting: Set[js.Any]): CompileNgModuleMetadata | Null = js.native
    def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: Unit, alreadyCollecting: Set[js.Any]): CompileNgModuleMetadata | Null = js.native
    
    def getNgModuleSummary(moduleType: js.Any): CompileNgModuleSummary | Null = js.native
    def getNgModuleSummary(moduleType: js.Any, alreadyCollecting: Set[js.Any]): CompileNgModuleSummary | Null = js.native
    
    def getNonNormalizedDirectiveMetadata(directiveType: js.Any): Annotation | Null = js.native
    
    def getOrLoadPipeMetadata(pipeType: js.Any): CompilePipeMetadata = js.native
    
    /**
      * Gets the metadata for the given pipe.
      * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
      */
    def getPipeMetadata(pipeType: js.Any): CompilePipeMetadata | Null = js.native
    
    def getPipeSummary(pipeType: js.Any): CompilePipeSummary = js.native
    
    def getProviderMetadata(provider: ProviderMeta): CompileProviderMetadata = js.native
    
    def getReflector(): CompileReflector = js.native
    
    /* private */ var getRendererType: js.Any = js.native
    
    def getShallowModuleMetadata(moduleType: js.Any): CompileShallowModuleMetadata | Null = js.native
    
    /* private */ var initComponentFactory: js.Any = js.native
    
    def isAbstractDirective(`type`: js.Any): Boolean = js.native
    
    def isDirective(`type`: js.Any): Boolean = js.native
    
    def isInjectable(`type`: js.Any): Boolean = js.native
    
    def isNgModule(`type`: js.Any): Boolean = js.native
    
    def isPipe(`type`: js.Any): Boolean = js.native
    
    def loadDirectiveMetadata(ngModuleType: js.Any, directiveType: js.Any, isSync: Boolean): SyncAsync[Null] = js.native
    
    /**
      * Loads the declared directives and pipes of an NgModule.
      */
    def loadNgModuleDirectiveAndPipeMetadata(moduleType: js.Any, isSync: Boolean): js.Promise[js.Any] = js.native
    def loadNgModuleDirectiveAndPipeMetadata(moduleType: js.Any, isSync: Boolean, throwIfNotFound: Boolean): js.Promise[js.Any] = js.native
  }
  
  @JSImport("@angular/compiler/src/metadata_resolver", "ERROR_COMPONENT_TYPE")
  @js.native
  val ERROR_COMPONENT_TYPE: /* "ngComponentType" */ String = js.native
  
  type ErrorCollector = js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
}
