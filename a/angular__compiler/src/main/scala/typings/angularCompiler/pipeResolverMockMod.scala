package typings.angularCompiler

import typings.angularCompiler.coreMod.Pipe
import typings.angularCompiler.coreMod.Type
import typings.angularCompiler.mod.CompileReflector
import typings.angularCompiler.mod.PipeResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeResolverMockMod {
  
  @JSImport("@angular/compiler/testing/src/pipe_resolver_mock", "MockPipeResolver")
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
