package typings.angularCompilerCli

import typings.angularCompilerCli.analyzerMod.CycleHandlingStrategy
import typings.angularCompilerCli.cyclesMod.CycleAnalyzer
import typings.angularCompilerCli.dependencyMod.DtsModuleScopeResolver
import typings.angularCompilerCli.incrementalApiMod.DependencyTracker
import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.metadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.ngtscImportsMod.ModuleResolver
import typings.angularCompilerCli.ngtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.ngtscMetadataMod.InjectableClassRegistry
import typings.angularCompilerCli.ngtscMetadataMod.ResourceRegistry
import typings.angularCompilerCli.partialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.scopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.scopeMod.TypeCheckScopeRegistry
import typings.angularCompilerCli.scopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.semanticGraphMod.SemanticDepGraphUpdater
import typings.angularCompilerCli.srcApiMod.ResourceLoader
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/component", "ComponentDecoratorHandler")
  @js.native
  open class ComponentDecoratorHandler protected ()
    extends typings.angularCompilerCli.handlerMod.ComponentDecoratorHandler {
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
  }
}
