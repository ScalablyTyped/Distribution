package typings.angularCompilerCli

import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3PipeMetadata
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.anon.ClassDeclarationDeclaratiGetChildCount
import typings.angularCompilerCli.anon.ReadonlyDecorator
import typings.angularCompilerCli.anon.ReadonlyPipeHandlerData
import typings.angularCompilerCli.srcNgtscAnnotationsCommonMod.InjectableClassRegistry
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticSymbol
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.AnalysisOutput
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.ResolveResult
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsSrcPipeMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/src/pipe", "PipeDecoratorHandler")
  @js.native
  open class PipeDecoratorHandler protected ()
    extends StObject
       with DecoratorHandler[Decorator, PipeHandlerData, PipeSymbol, Any] {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      injectableRegistry: InjectableClassRegistry,
      isCore: Boolean,
      perf: PerfRecorder
    ) = this()
    
    def analyze(clazz: ClassDeclarationDeclarati, decorator: ReadonlyDecorator): AnalysisOutput[PipeHandlerData] = js.native
    
    def compileFull(node: ClassDeclarationDeclarati, analysis: ReadonlyPipeHandlerData): js.Array[CompileResult] = js.native
    
    @JSName("compilePartial")
    def compilePartial_MPipeDecoratorHandler(node: ClassDeclarationDeclarati, analysis: ReadonlyPipeHandlerData): js.Array[CompileResult] = js.native
    
    /* private */ var evaluator: Any = js.native
    
    /* private */ var injectableRegistry: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    /* private */ var metaRegistry: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    @JSName("precedence")
    val precedence_PipeDecoratorHandler: String | Double = js.native
    
    /* private */ var reflector: Any = js.native
    
    @JSName("register")
    def register_MPipeDecoratorHandler(node: ClassDeclarationDeclarati, analysis: ReadonlyPipeHandlerData): Unit = js.native
    
    @JSName("resolve")
    def resolve_MPipeDecoratorHandler(node: ClassDeclarationDeclarati): ResolveResult[Any] = js.native
    
    /* private */ var scopeRegistry: Any = js.native
    
    def symbol(node: ClassDeclarationDeclarati, analysis: ReadonlyPipeHandlerData): PipeSymbol = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/src/pipe", "PipeSymbol")
  @js.native
  open class PipeSymbol protected () extends SemanticSymbol {
    def this(decl: ClassDeclarationDeclaratiGetChildCount, name: String) = this()
    
    def isPublicApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    def isTypeCheckApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    val name: String = js.native
  }
  
  trait PipeHandlerData extends StObject {
    
    var classMetadata: R3ClassMetadata | Null
    
    var decorator: typings.typescript.mod.Decorator | Null
    
    var meta: R3PipeMetadata
    
    var pipeNameExpr: Expression
  }
  object PipeHandlerData {
    
    inline def apply(meta: R3PipeMetadata, pipeNameExpr: Expression): PipeHandlerData = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], pipeNameExpr = pipeNameExpr.asInstanceOf[js.Any], classMetadata = null, decorator = null)
      __obj.asInstanceOf[PipeHandlerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PipeHandlerData] (val x: Self) extends AnyVal {
      
      inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
      
      inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
      
      inline def setDecorator(value: typings.typescript.mod.Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setMeta(value: R3PipeMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setPipeNameExpr(value: Expression): Self = StObject.set(x, "pipeNameExpr", value.asInstanceOf[js.Any])
    }
  }
}
