package typings
package atAngularCompilerLib.srcCompileUnderscoreReflectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_reflector", "CompileReflector")
@js.native
abstract class CompileReflector () extends js.Object {
  def annotations(typeOrFunc: js.Any): js.Array[_] = js.native
  def componentModuleUrl(`type`: js.Any, cmpMetadata: atAngularCompilerLib.srcCoreMod.Component): java.lang.String = js.native
  def guards(typeOrFunc: js.Any): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def hasLifecycleHook(`type`: js.Any, lcProperty: java.lang.String): scala.Boolean = js.native
  def parameters(typeOrFunc: js.Any): js.Array[js.Array[_]] = js.native
  def propMetadata(typeOrFunc: js.Any): org.scalablytyped.runtime.StringDictionary[js.Array[_]] = js.native
  def resolveExternalReference(ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference): js.Any = js.native
  def shallowAnnotations(typeOrFunc: js.Any): js.Array[_] = js.native
  def tryAnnotations(typeOrFunc: js.Any): js.Array[_] = js.native
}

