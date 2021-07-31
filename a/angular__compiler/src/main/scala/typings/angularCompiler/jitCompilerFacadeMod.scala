package typings.angularCompiler

import org.scalablytyped.runtime.Instantiable0
import typings.angularCompiler.anon.InstantiableResourceLoader
import typings.angularCompiler.compilerFacadeInterfaceMod.CompilerFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.CoreEnvironment
import typings.angularCompiler.compilerFacadeInterfaceMod.ParseSourceSpan
import typings.angularCompiler.compilerFacadeInterfaceMod.R3ComponentMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3DirectiveMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3FactoryDefMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3InjectableMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3InjectorMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3NgModuleMetadataFacade
import typings.angularCompiler.compilerFacadeInterfaceMod.R3PipeMetadataFacade
import typings.angularCompiler.outputJitMod.JitEvaluator
import typings.angularCompiler.resourceLoaderMod.ResourceLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jitCompilerFacadeMod {
  
  @JSImport("@angular/compiler/src/jit_compiler_facade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/jit_compiler_facade", "CompilerFacadeImpl")
  @js.native
  class CompilerFacadeImpl ()
    extends StObject
       with CompilerFacade {
    def this(jitEvaluator: JitEvaluator) = this()
    
    /* CompleteClass */
    var R3FactoryTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3FactoryTarget */ js.Any = js.native
    
    /* CompleteClass */
    var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any = js.native
    
    /* CompleteClass */
    var ResourceLoader: InstantiableResourceLoader = js.native
    @JSName("ResourceLoader")
    var ResourceLoader_CompilerFacadeImpl: Instantiable0[ResourceLoader] = js.native
    
    /* CompleteClass */
    override def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3ComponentMetadataFacade): js.Any = js.native
    
    /* CompleteClass */
    override def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3DirectiveMetadataFacade): js.Any = js.native
    
    /* CompleteClass */
    override def compileFactory(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3FactoryDefMetadataFacade): js.Any = js.native
    
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
  }
  
  @scala.inline
  def publishFacade(global: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("publishFacade")(global.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
