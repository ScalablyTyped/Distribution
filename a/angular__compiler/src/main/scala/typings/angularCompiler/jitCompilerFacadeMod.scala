package typings.angularCompiler

import org.scalablytyped.runtime.Instantiable0
import typings.angularCompiler.compilerFacadeInterfaceMod.CompilerFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.CoreEnvironment
import typings.angularCompiler.compilerFacadeInterfaceMod.ParseSourceSpan
import typings.angularCompiler.compilerFacadeInterfaceMod.R3BaseMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3ComponentMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3DirectiveMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3InjectableMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3InjectorMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3NgModuleMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3PipeMetadataFacade
import typings.angularCompiler.outputJitMod.JitEvaluator
import typings.angularCompiler.resourceLoaderMod.ResourceLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/jit_compiler_facade", JSImport.Namespace)
@js.native
object jitCompilerFacadeMod extends js.Object {
  @js.native
  class CompilerFacadeImpl () extends CompilerFacade {
    def this(jitEvaluator: JitEvaluator) = this()
    /* CompleteClass */
    override var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any = js.native
    /* CompleteClass */
    override var ResourceLoader: AnonResourceLoader = js.native
    @JSName("ResourceLoader")
    var ResourceLoader_CompilerFacadeImpl: Instantiable0[ResourceLoader] = js.native
    var elementSchemaRegistry: js.Any = js.native
    var jitEvaluator: js.Any = js.native
    /**
      * JIT compiles an expression and returns the result of executing that expression.
      *
      * @param def the definition which will be compiled and executed to get the value to patch
      * @param context an object map of @angular/core symbol names to symbols which will be available
      * in the context of the compiled expression
      * @param sourceUrl a URL to use for the source map of the compiled expression
      * @param preStatements a collection of statements that should be evaluated before the expression.
      */
    var jitExpression: js.Any = js.native
    /* CompleteClass */
    override def compileBase(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3BaseMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3ComponentMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3DirectiveMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectableMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectorMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3NgModuleMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3PipeMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def createParseSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = js.native
  }
  
  def publishFacade(global: js.Any): Unit = js.native
}

