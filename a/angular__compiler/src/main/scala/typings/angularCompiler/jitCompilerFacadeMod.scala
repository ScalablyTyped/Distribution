package typings.angularCompiler

import org.scalablytyped.runtime.Instantiable0
import typings.angularCompiler.compilerFacadeInterfaceMod.CompilerFacade
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
  }
  
  def publishFacade(global: js.Any): Unit = js.native
}

