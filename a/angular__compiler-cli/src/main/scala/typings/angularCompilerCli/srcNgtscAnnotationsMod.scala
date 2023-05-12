package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscAnnotationsCommonMod.InjectableClassRegistry
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcApiMod.ResourceLoader
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typings.angularCompilerCli.srcNgtscCyclesMod.CycleAnalyzer
import typings.angularCompilerCli.srcNgtscCyclesSrcAnalyzerMod.CycleHandlingStrategy
import typings.angularCompilerCli.srcNgtscImportsMod.ModuleResolver
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typings.angularCompilerCli.srcNgtscMetadataMod.ExportedProviderStatusResolver
import typings.angularCompilerCli.srcNgtscMetadataMod.HostDirectivesResolver
import typings.angularCompilerCli.srcNgtscMetadataMod.ResourceRegistry
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterfaceMod.ForeignFunctionResolver
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.srcNgtscScopeMod.TypeCheckScopeRegistry
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcNgtscScopeSrcDependencyMod.DtsModuleScopeResolver
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations", "ComponentDecoratorHandler")
  @js.native
  open class ComponentDecoratorHandler protected ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsComponentMod.ComponentDecoratorHandler {
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
      strictCtorDeps: Boolean,
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
      referencesRegistry: ReferencesRegistry,
      depTracker: DependencyTracker[SourceFile] | Null,
      injectableRegistry: InjectableClassRegistry,
      semanticDepGraphUpdater: SemanticDepGraphUpdater | Null,
      annotateForClosureCompiler: Boolean,
      perf: PerfRecorder,
      hostDirectivesResolver: HostDirectivesResolver
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations", "DirectiveDecoratorHandler")
  @js.native
  open class DirectiveDecoratorHandler protected ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsDirectiveMod.DirectiveDecoratorHandler {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      refEmitter: ReferenceEmitter,
      referencesRegistry: ReferencesRegistry,
      isCore: Boolean,
      strictCtorDeps: Boolean,
      semanticDepGraphUpdater: Null,
      annotateForClosureCompiler: Boolean,
      perf: PerfRecorder
    ) = this()
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      refEmitter: ReferenceEmitter,
      referencesRegistry: ReferencesRegistry,
      isCore: Boolean,
      strictCtorDeps: Boolean,
      semanticDepGraphUpdater: SemanticDepGraphUpdater,
      annotateForClosureCompiler: Boolean,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations", "InjectableDecoratorHandler")
  @js.native
  open class InjectableDecoratorHandler protected ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsSrcInjectableMod.InjectableDecoratorHandler {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      isCore: Boolean,
      strictCtorDeps: Boolean,
      injectableRegistry: InjectableClassRegistry,
      perf: PerfRecorder
    ) = this()
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      isCore: Boolean,
      strictCtorDeps: Boolean,
      injectableRegistry: InjectableClassRegistry,
      perf: PerfRecorder,
      /**
      * What to do if the injectable already contains a ɵprov property.
      *
      * If true then an error diagnostic is reported.
      * If false then there is no error and a new ɵprov property is not added.
      */
    errorOnDuplicateProv: Boolean
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations", "NgModuleDecoratorHandler")
  @js.native
  open class NgModuleDecoratorHandler protected ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsNgModuleMod.NgModuleDecoratorHandler {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaReader: MetadataReader,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      referencesRegistry: ReferencesRegistry,
      exportedProviderStatusResolver: ExportedProviderStatusResolver,
      semanticDepGraphUpdater: Null,
      isCore: Boolean,
      refEmitter: ReferenceEmitter,
      annotateForClosureCompiler: Boolean,
      onlyPublishPublicTypings: Boolean,
      injectableRegistry: InjectableClassRegistry,
      perf: PerfRecorder
    ) = this()
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaReader: MetadataReader,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      referencesRegistry: ReferencesRegistry,
      exportedProviderStatusResolver: ExportedProviderStatusResolver,
      semanticDepGraphUpdater: SemanticDepGraphUpdater,
      isCore: Boolean,
      refEmitter: ReferenceEmitter,
      annotateForClosureCompiler: Boolean,
      onlyPublishPublicTypings: Boolean,
      injectableRegistry: InjectableClassRegistry,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations", "NoopReferencesRegistry")
  @js.native
  open class NoopReferencesRegistry ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsCommonMod.NoopReferencesRegistry
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations", "PipeDecoratorHandler")
  @js.native
  open class PipeDecoratorHandler protected ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsSrcPipeMod.PipeDecoratorHandler {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      injectableRegistry: InjectableClassRegistry,
      isCore: Boolean,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations", "forwardRefResolver")
  @js.native
  val forwardRefResolver: ForeignFunctionResolver = js.native
}
