package typings
package atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/lifecycle_reflector", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LIFECYCLE_HOOKS_VALUES: js.Array[atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks] = js.native
  def getAllLifecycleHooks(reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector, token: js.Any): js.Array[atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks] = js.native
  def hasLifecycleHook(
    reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector,
    hook: atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks,
    token: js.Any
  ): scala.Boolean = js.native
}

