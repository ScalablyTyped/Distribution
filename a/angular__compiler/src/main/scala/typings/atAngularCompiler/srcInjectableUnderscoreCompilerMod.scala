package typings.atAngularCompiler

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata
import typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/injectable_compiler", JSImport.Namespace)
@js.native
object srcInjectableUnderscoreCompilerMod extends js.Object {
  @js.native
  class InjectableCompiler protected () extends js.Object {
    def this(reflector: CompileReflector, alwaysGenerateDef: Boolean) = this()
    var alwaysGenerateDef: js.Any = js.native
    var depsArray: js.Any = js.native
    var reflector: js.Any = js.native
    var tokenInjector: js.Any = js.native
    def compile(injectable: CompileInjectableMetadata, ctx: OutputContext): Unit = js.native
    def factoryFor(injectable: CompileInjectableMetadata, ctx: OutputContext): Expression = js.native
    def injectableDef(injectable: CompileInjectableMetadata, ctx: OutputContext): Expression = js.native
  }
  
}

