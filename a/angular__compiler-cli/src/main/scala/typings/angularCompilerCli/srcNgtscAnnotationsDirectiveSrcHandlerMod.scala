package typings.angularCompilerCli

import typings.angularCompiler.mod.ConstantPool
import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3DirectiveMetadata
import typings.angularCompilerCli.angularCompilerCliStrings.dynamic
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.anon.ReadonlyDirectiveHandlerD
import typings.angularCompilerCli.srcNgtscAnnotationsCommonMod.InjectableClassRegistry
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typings.angularCompilerCli.srcNgtscAnnotationsDirectiveSrcSymbolMod.DirectiveSymbol
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typings.angularCompilerCli.srcNgtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.HostDirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.InputMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.InputOrOutput
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.ResolveResult
import typings.std.Set
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsDirectiveSrcHandlerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive/src/handler", "DirectiveDecoratorHandler")
  @js.native
  open class DirectiveDecoratorHandler protected ()
    extends StObject
       with DecoratorHandler[Decorator | Null, DirectiveHandlerData, DirectiveSymbol, Any] {
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
    
    /* private */ var annotateForClosureCompiler: Any = js.native
    
    def compileFull(
      node: ClassDeclarationDeclarati,
      analysis: ReadonlyDirectiveHandlerD,
      resolution: Any,
      pool: ConstantPool
    ): js.Array[CompileResult] = js.native
    
    @JSName("compilePartial")
    def compilePartial_MDirectiveDecoratorHandler(node: ClassDeclarationDeclarati, analysis: ReadonlyDirectiveHandlerD, resolution: Any): js.Array[CompileResult] = js.native
    
    /* private */ var evaluator: Any = js.native
    
    /**
      * Checks if a given class uses Angular features and returns the TypeScript node
      * that indicated the usage. Classes are considered using Angular features if they
      * contain class members that are either decorated with a known Angular decorator,
      * or if they correspond to a known Angular lifecycle hook.
      */
    /* private */ var findClassFieldWithAngularFeatures: Any = js.native
    
    /* private */ var injectableRegistry: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    /* private */ var metaReader: Any = js.native
    
    /* private */ var metaRegistry: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    @JSName("precedence")
    val precedence_DirectiveDecoratorHandler: String | Double = js.native
    
    /* private */ var refEmitter: Any = js.native
    
    /* private */ var referencesRegistry: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    @JSName("register")
    def register_MDirectiveDecoratorHandler(node: ClassDeclarationDeclarati, analysis: ReadonlyDirectiveHandlerD): Unit = js.native
    
    @JSName("resolve")
    def resolve_MDirectiveDecoratorHandler(node: ClassDeclarationDeclarati, analysis: DirectiveHandlerData, symbol: DirectiveSymbol): ResolveResult[Any] = js.native
    
    /* private */ var scopeRegistry: Any = js.native
    
    /* private */ var semanticDepGraphUpdater: Any = js.native
    
    /* private */ var strictCtorDeps: Any = js.native
    
    def symbol(node: ClassDeclarationDeclarati, analysis: ReadonlyDirectiveHandlerD): DirectiveSymbol = js.native
  }
  
  trait DirectiveHandlerData extends StObject {
    
    var baseClass: Reference[ClassDeclarationDeclarati] | dynamic | Null
    
    var classMetadata: R3ClassMetadata | Null
    
    var decorator: typings.typescript.mod.Decorator | Null
    
    var hostDirectives: js.Array[HostDirectiveMeta] | Null
    
    var inputs: ClassPropertyMapping[InputMapping]
    
    var isPoisoned: Boolean
    
    var isStructural: Boolean
    
    var meta: R3DirectiveMetadata
    
    var outputs: ClassPropertyMapping[InputOrOutput]
    
    var providersRequiringFactory: Set[Reference[ClassDeclarationDeclarati]] | Null
    
    var rawHostDirectives: Expression | Null
    
    var typeCheckMeta: DirectiveTypeCheckMeta
  }
  object DirectiveHandlerData {
    
    inline def apply(
      inputs: ClassPropertyMapping[InputMapping],
      isPoisoned: Boolean,
      isStructural: Boolean,
      meta: R3DirectiveMetadata,
      outputs: ClassPropertyMapping[InputOrOutput],
      typeCheckMeta: DirectiveTypeCheckMeta
    ): DirectiveHandlerData = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], typeCheckMeta = typeCheckMeta.asInstanceOf[js.Any], baseClass = null, classMetadata = null, decorator = null, hostDirectives = null, providersRequiringFactory = null, rawHostDirectives = null)
      __obj.asInstanceOf[DirectiveHandlerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectiveHandlerData] (val x: Self) extends AnyVal {
      
      inline def setBaseClass(value: Reference[ClassDeclarationDeclarati] | dynamic): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setBaseClassNull: Self = StObject.set(x, "baseClass", null)
      
      inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
      
      inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
      
      inline def setDecorator(value: typings.typescript.mod.Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setHostDirectives(value: js.Array[HostDirectiveMeta]): Self = StObject.set(x, "hostDirectives", value.asInstanceOf[js.Any])
      
      inline def setHostDirectivesNull: Self = StObject.set(x, "hostDirectives", null)
      
      inline def setHostDirectivesVarargs(value: HostDirectiveMeta*): Self = StObject.set(x, "hostDirectives", js.Array(value*))
      
      inline def setInputs(value: ClassPropertyMapping[InputMapping]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
      
      inline def setIsStructural(value: Boolean): Self = StObject.set(x, "isStructural", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: R3DirectiveMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: ClassPropertyMapping[InputOrOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setProvidersRequiringFactory(value: Set[Reference[ClassDeclarationDeclarati]]): Self = StObject.set(x, "providersRequiringFactory", value.asInstanceOf[js.Any])
      
      inline def setProvidersRequiringFactoryNull: Self = StObject.set(x, "providersRequiringFactory", null)
      
      inline def setRawHostDirectives(value: Expression): Self = StObject.set(x, "rawHostDirectives", value.asInstanceOf[js.Any])
      
      inline def setRawHostDirectivesNull: Self = StObject.set(x, "rawHostDirectives", null)
      
      inline def setTypeCheckMeta(value: DirectiveTypeCheckMeta): Self = StObject.set(x, "typeCheckMeta", value.asInstanceOf[js.Any])
    }
  }
}
