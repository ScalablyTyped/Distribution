package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.compileReflectorMod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object r3JitMod {
  
  @JSImport("@angular/compiler/src/render3/r3_jit", "R3JitReflector")
  @js.native
  class R3JitReflector protected () extends CompileReflector {
    def this(context: StringDictionary[js.Any]) = this()
    
    def componentModuleUrl(`type`: js.Any, cmpMetadata: js.Any): String = js.native
    
    /* private */ var context: js.Any = js.native
  }
}
