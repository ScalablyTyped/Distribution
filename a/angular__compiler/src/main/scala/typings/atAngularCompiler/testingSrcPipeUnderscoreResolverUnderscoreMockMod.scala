package typings.atAngularCompiler

import typings.atAngularCompiler.atAngularCompilerMod.CompileReflector
import typings.atAngularCompiler.atAngularCompilerMod.PipeResolver
import typings.atAngularCompiler.srcCoreMod.Pipe
import typings.atAngularCompiler.srcCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/testing/src/pipe_resolver_mock", JSImport.Namespace)
@js.native
object testingSrcPipeUnderscoreResolverUnderscoreMockMod extends js.Object {
  @js.native
  class MockPipeResolver protected () extends PipeResolver {
    def this(refector: CompileReflector) = this()
    var _pipes: js.Any = js.native
    /**
      * Overrides the {@link Pipe} for a pipe.
      */
    def setPipe(`type`: Type, metadata: Pipe): Unit = js.native
  }
  
}

