package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.SyntheticValue
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterfaceMod.ForeignFunctionResolver
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.srcNgtscShimsApiMod.FactoryTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsNgModuleMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/ng_module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/ng_module", "NgModuleDecoratorHandler")
  @js.native
  open class NgModuleDecoratorHandler protected ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsNgModuleSrcHandlerMod.NgModuleDecoratorHandler {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaReader: MetadataReader,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      referencesRegistry: ReferencesRegistry,
      isCore: Boolean,
      refEmitter: ReferenceEmitter,
      factoryTracker: Null,
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
      isCore: Boolean,
      refEmitter: ReferenceEmitter,
      factoryTracker: FactoryTracker,
      annotateForClosureCompiler: Boolean,
      onlyPublishPublicTypings: Boolean,
      injectableRegistry: InjectableClassRegistry,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/ng_module", "NgModuleSymbol")
  @js.native
  open class NgModuleSymbol protected ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsNgModuleSrcHandlerMod.NgModuleSymbol {
    def this(/**
      * The declaration for this symbol.
      */
    decl: ClassDeclaration[DeclarationNode]) = this()
  }
  
  inline def createModuleWithProvidersResolver(reflector: ReflectionHost, isCore: Boolean): ForeignFunctionResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleWithProvidersResolver")(reflector.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[ForeignFunctionResolver]
  
  inline def isResolvedModuleWithProviders(sv: SyntheticValue[Any]): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator.SyntheticValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers.ResolvedModuleWithProviders> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResolvedModuleWithProviders")(sv.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator.SyntheticValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers.ResolvedModuleWithProviders> */ Boolean]
}
