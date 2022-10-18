package typings.angularCompilerCli

import typings.angularCompiler.mod.ConstantPool
import typings.angularCompilerCli.anon.ReadonlyComponentAnalysis
import typings.angularCompilerCli.anon.ReadonlyComponentResoluti
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcApiMod.ResourceLoader
import typings.angularCompilerCli.srcNgtscAnnotationsComponentSrcMetadataMod.ComponentAnalysisData
import typings.angularCompilerCli.srcNgtscAnnotationsComponentSrcMetadataMod.ComponentResolutionData
import typings.angularCompilerCli.srcNgtscAnnotationsComponentSrcSymbolMod.ComponentSymbol
import typings.angularCompilerCli.srcNgtscCyclesMod.CycleAnalyzer
import typings.angularCompilerCli.srcNgtscCyclesSrcAnalyzerMod.CycleHandlingStrategy
import typings.angularCompilerCli.srcNgtscImportsMod.ModuleResolver
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typings.angularCompilerCli.srcNgtscIndexerMod.IndexingContext
import typings.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
import typings.angularCompilerCli.srcNgtscMetadataMod.ResourceRegistry
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.srcNgtscScopeMod.TypeCheckScopeRegistry
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcNgtscScopeSrcDependencyMod.DtsModuleScopeResolver
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.ResolveResult
import typings.angularCompilerCli.srcNgtscTypecheckApiContextMod.TypeCheckContext
import typings.angularCompilerCli.srcNgtscTypecheckExtendedApiExtendedTemplateCheckerMod.ExtendedTemplateChecker
import typings.angularCompilerCli.srcNgtscXi18nSrcContextMod.Xi18nContext
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsComponentSrcHandlerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/component/src/handler", "ComponentDecoratorHandler")
  @js.native
  open class ComponentDecoratorHandler protected ()
    extends StObject
       with DecoratorHandler[Decorator, ComponentAnalysisData, ComponentSymbol, ComponentResolutionData] {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      metaReader: MetadataReader,
      scopeReader: ComponentScopeReader,
      dtsScopeReader: DtsModuleScopeResolver,
      scopeRegistry: LocalModuleScopeRegistry,
      typeCheckScopeRegistry: TypeCheckScopeRegistry,
      resourceRegistry: ResourceRegistry,
      isCore: Boolean,
      resourceLoader: ResourceLoader,
      rootDirs: js.Array[String],
      defaultPreserveWhitespaces: Boolean,
      i18nUseExternalIds: Boolean,
      enableI18nLegacyMessageIdFormat: Boolean,
      usePoisonedData: Boolean,
      i18nNormalizeLineEndingsInICUs: Boolean,
      moduleResolver: ModuleResolver,
      cycleAnalyzer: CycleAnalyzer,
      cycleHandlingStrategy: CycleHandlingStrategy,
      refEmitter: ReferenceEmitter,
      depTracker: DependencyTracker[SourceFile] | Null,
      injectableRegistry: InjectableClassRegistry,
      semanticDepGraphUpdater: SemanticDepGraphUpdater | Null,
      annotateForClosureCompiler: Boolean,
      perf: PerfRecorder
    ) = this()
    
    /**
      * Check whether adding an import from `origin` to the source-file corresponding to `expr` would
      * create a cyclic import.
      *
      * @returns a `Cycle` object if a cycle would be created, otherwise `null`.
      */
    /* private */ var _checkForCyclicImport: Any = js.native
    
    /* private */ var annotateForClosureCompiler: Any = js.native
    
    def compileFull(
      node: ClassDeclaration[DeclarationNode],
      analysis: ReadonlyComponentAnalysis,
      resolution: ReadonlyComponentResoluti,
      pool: ConstantPool
    ): js.Array[CompileResult] = js.native
    
    @JSName("compilePartial")
    def compilePartial_MComponentDecoratorHandler(
      node: ClassDeclaration[DeclarationNode],
      analysis: ReadonlyComponentAnalysis,
      resolution: ReadonlyComponentResoluti
    ): js.Array[CompileResult] = js.native
    
    /* private */ var cycleAnalyzer: Any = js.native
    
    /* private */ var cycleHandlingStrategy: Any = js.native
    
    /* private */ var defaultPreserveWhitespaces: Any = js.native
    
    /* private */ var depTracker: Any = js.native
    
    /* private */ var dtsScopeReader: Any = js.native
    
    /* private */ var elementSchemaRegistry: Any = js.native
    
    /* private */ var enableI18nLegacyMessageIdFormat: Any = js.native
    
    /* private */ var evaluator: Any = js.native
    
    @JSName("extendedTemplateCheck")
    def extendedTemplateCheck_MComponentDecoratorHandler(
      component: typings.typescript.mod.ClassDeclaration,
      extendedTemplateChecker: ExtendedTemplateChecker
    ): js.Array[Diagnostic] = js.native
    
    /* private */ var extractTemplateOptions: Any = js.native
    
    /* private */ var i18nNormalizeLineEndingsInICUs: Any = js.native
    
    /* private */ var i18nUseExternalIds: Any = js.native
    
    @JSName("index")
    def index_MComponentDecoratorHandler(
      context: IndexingContext,
      node: ClassDeclaration[DeclarationNode],
      analysis: ReadonlyComponentAnalysis
    ): js.UndefOr[Null] = js.native
    
    /* private */ var injectableRegistry: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    /* private */ var literalCache: Any = js.native
    
    /* private */ var maybeRecordSyntheticImport: Any = js.native
    
    /* private */ var metaReader: Any = js.native
    
    /* private */ var metaRegistry: Any = js.native
    
    /* private */ var moduleResolver: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    /* private */ var preanalyzeStylesCache: Any = js.native
    
    /**
      * During the asynchronous preanalyze phase, it's necessary to parse the template to extract
      * any potential <link> tags which might need to be loaded. This cache ensures that work is not
      * thrown away, and the parsed template is reused during the analyze phase.
      */
    /* private */ var preanalyzeTemplateCache: Any = js.native
    
    @JSName("preanalyze")
    def preanalyze_MComponentDecoratorHandler(node: ClassDeclaration[DeclarationNode], decorator: Decorator): js.UndefOr[js.Promise[Unit]] = js.native
    
    @JSName("precedence")
    val precedence_ComponentDecoratorHandler: String | Double = js.native
    
    /* private */ var refEmitter: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    @JSName("register")
    def register_MComponentDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ComponentAnalysisData): Unit = js.native
    
    @JSName("resolve")
    def resolve_MComponentDecoratorHandler(
      node: ClassDeclaration[DeclarationNode],
      analysis: ReadonlyComponentAnalysis,
      symbol: ComponentSymbol
    ): ResolveResult[ComponentResolutionData] = js.native
    
    /* private */ var resourceLoader: Any = js.native
    
    /* private */ var resourceRegistry: Any = js.native
    
    /* private */ var rootDirs: Any = js.native
    
    /* private */ var scopeReader: Any = js.native
    
    /* private */ var scopeRegistry: Any = js.native
    
    /* private */ var semanticDepGraphUpdater: Any = js.native
    
    def symbol(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyComponentAnalysis): ComponentSymbol = js.native
    
    /* private */ var typeCheckScopeRegistry: Any = js.native
    
    @JSName("typeCheck")
    def typeCheck_MComponentDecoratorHandler(ctx: TypeCheckContext, node: ClassDeclaration[DeclarationNode], meta: ReadonlyComponentAnalysis): Unit = js.native
    
    @JSName("updateResources")
    def updateResources_MComponentDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ComponentAnalysisData): Unit = js.native
    
    /* private */ var usePoisonedData: Any = js.native
    
    @JSName("xi18n")
    def xi18n_MComponentDecoratorHandler(ctx: Xi18nContext, node: ClassDeclaration[DeclarationNode], analysis: ReadonlyComponentAnalysis): Unit = js.native
  }
}
