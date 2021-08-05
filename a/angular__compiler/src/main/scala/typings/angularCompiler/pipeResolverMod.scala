package typings.angularCompiler

import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.coreMod.Pipe
import typings.angularCompiler.coreMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeResolverMod {
  
  @JSImport("@angular/compiler/src/pipe_resolver", "PipeResolver")
  @js.native
  class PipeResolver protected () extends StObject {
    def this(_reflector: CompileReflector) = this()
    
    /* private */ var _reflector: js.Any = js.native
    
    def isPipe(`type`: Type): Boolean = js.native
    
    /**
      * Return {@link Pipe} for a given `Type`.
      */
    def resolve(`type`: Type): Pipe | Null = js.native
    def resolve(`type`: Type, throwIfNotFound: Boolean): Pipe | Null = js.native
  }
}
