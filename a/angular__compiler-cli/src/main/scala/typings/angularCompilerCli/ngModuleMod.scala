package typings.angularCompilerCli

import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.metadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.ngtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.ngtscMetadataMod.InjectableClassRegistry
import typings.angularCompilerCli.partialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.partialEvaluatorMod.SyntheticValue
import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.referencesRegistryMod.ReferencesRegistry
import typings.angularCompilerCli.scopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.shimsApiMod.FactoryTracker
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.angularCompilerCli.srcInterfaceMod.ForeignFunctionResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngModuleMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/ng_module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/ng_module", "NgModuleDecoratorHandler")
  @js.native
  open class NgModuleDecoratorHandler protected ()
    extends typings.angularCompilerCli.ngModuleSrcHandlerMod.NgModuleDecoratorHandler {
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
    extends typings.angularCompilerCli.ngModuleSrcHandlerMod.NgModuleSymbol {
    def this(/**
      * The declaration for this symbol.
      */
    decl: ClassDeclaration[DeclarationNode]) = this()
  }
  
  inline def createModuleWithProvidersResolver(reflector: ReflectionHost, isCore: Boolean): ForeignFunctionResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleWithProvidersResolver")(reflector.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[ForeignFunctionResolver]
  
  inline def isResolvedModuleWithProviders(sv: SyntheticValue[Any]): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator.SyntheticValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers.ResolvedModuleWithProviders> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResolvedModuleWithProviders")(sv.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator.SyntheticValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers.ResolvedModuleWithProviders> */ Boolean]
}
