package typings.angularCompilerCli

import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3DependencyMetadata
import typings.angularCompiler.mod.R3InjectableMetadata
import typings.angularCompilerCli.angularCompilerCliStrings.invalid
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.anon.ReadonlyDecorator
import typings.angularCompilerCli.anon.ReadonlyInjectableHandler
import typings.angularCompilerCli.srcNgtscAnnotationsCommonMod.InjectableClassRegistry
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.AnalysisOutput
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.ResolveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsSrcInjectableMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/src/injectable", "InjectableDecoratorHandler")
  @js.native
  open class InjectableDecoratorHandler protected ()
    extends StObject
       with DecoratorHandler[Decorator, InjectableHandlerData, Null, Any] {
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
    
    def analyze(node: ClassDeclarationDeclarati, decorator: ReadonlyDecorator): AnalysisOutput[InjectableHandlerData] = js.native
    
    /* private */ var compile: Any = js.native
    
    def compileFull(node: ClassDeclarationDeclarati, analysis: ReadonlyInjectableHandler): js.Array[CompileResult] = js.native
    
    @JSName("compilePartial")
    def compilePartial_MInjectableDecoratorHandler(node: ClassDeclarationDeclarati, analysis: ReadonlyInjectableHandler): js.Array[CompileResult] = js.native
    
    /**
      * What to do if the injectable already contains a ɵprov property.
      *
      * If true then an error diagnostic is reported.
      * If false then there is no error and a new ɵprov property is not added.
      */
    /* private */ var errorOnDuplicateProv: Any = js.native
    
    /* private */ var evaluator: Any = js.native
    
    /* private */ var injectableRegistry: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    @JSName("precedence")
    val precedence_InjectableDecoratorHandler: String | Double = js.native
    
    /* private */ var reflector: Any = js.native
    
    @JSName("register")
    def register_MInjectableDecoratorHandler(node: ClassDeclarationDeclarati, analysis: InjectableHandlerData): Unit = js.native
    
    @JSName("resolve")
    def resolve_MInjectableDecoratorHandler(node: ClassDeclarationDeclarati, analysis: ReadonlyInjectableHandler, symbol: Null): ResolveResult[Any] = js.native
    
    /* private */ var strictCtorDeps: Any = js.native
    
    def symbol(): Null = js.native
  }
  
  trait InjectableHandlerData extends StObject {
    
    var classMetadata: R3ClassMetadata | Null
    
    var ctorDeps: js.Array[R3DependencyMetadata] | invalid | Null
    
    var meta: R3InjectableMetadata
    
    var needsFactory: Boolean
  }
  object InjectableHandlerData {
    
    inline def apply(meta: R3InjectableMetadata, needsFactory: Boolean): InjectableHandlerData = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], needsFactory = needsFactory.asInstanceOf[js.Any], classMetadata = null, ctorDeps = null)
      __obj.asInstanceOf[InjectableHandlerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectableHandlerData] (val x: Self) extends AnyVal {
      
      inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
      
      inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
      
      inline def setCtorDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = StObject.set(x, "ctorDeps", value.asInstanceOf[js.Any])
      
      inline def setCtorDepsNull: Self = StObject.set(x, "ctorDeps", null)
      
      inline def setCtorDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "ctorDeps", js.Array(value*))
      
      inline def setMeta(value: R3InjectableMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setNeedsFactory(value: Boolean): Self = StObject.set(x, "needsFactory", value.asInstanceOf[js.Any])
    }
  }
}
