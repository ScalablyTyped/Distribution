package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.coreMod.Component
import typings.angularCompiler.outputAstMod.ExternalReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileReflectorMod {
  
  @JSImport("@angular/compiler/src/compile_reflector", "CompileReflector")
  @js.native
  abstract class CompileReflector () extends StObject {
    
    def annotations(typeOrFunc: js.Any): js.Array[js.Any] = js.native
    
    def componentModuleUrl(`type`: js.Any, cmpMetadata: Component): String = js.native
    
    def guards(typeOrFunc: js.Any): StringDictionary[js.Any] = js.native
    
    def hasLifecycleHook(`type`: js.Any, lcProperty: String): Boolean = js.native
    
    def parameters(typeOrFunc: js.Any): js.Array[js.Array[js.Any]] = js.native
    
    def propMetadata(typeOrFunc: js.Any): StringDictionary[js.Array[js.Any]] = js.native
    
    def resolveExternalReference(ref: ExternalReference): js.Any = js.native
    
    def shallowAnnotations(typeOrFunc: js.Any): js.Array[js.Any] = js.native
    
    def tryAnnotations(typeOrFunc: js.Any): js.Array[js.Any] = js.native
  }
}
