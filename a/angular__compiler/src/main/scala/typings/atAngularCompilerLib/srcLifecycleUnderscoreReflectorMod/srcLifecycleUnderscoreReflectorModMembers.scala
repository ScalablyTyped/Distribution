package typings
package atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/lifecycle_reflector", JSImport.Namespace)
@js.native
object srcLifecycleUnderscoreReflectorModMembers extends js.Object {
  val LIFECYCLE_HOOKS_VALUES: js.Array[LifecycleHooks] = js.native
  def getAllLifecycleHooks(reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector, token: js.Any): js.Array[LifecycleHooks] = js.native
  def hasLifecycleHook(
    reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector,
    hook: LifecycleHooks,
    token: js.Any
  ): scala.Boolean = js.native
}

