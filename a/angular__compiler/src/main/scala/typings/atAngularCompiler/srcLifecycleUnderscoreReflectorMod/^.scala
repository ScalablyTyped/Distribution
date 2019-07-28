package typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod

import typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/lifecycle_reflector", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LIFECYCLE_HOOKS_VALUES: js.Array[LifecycleHooks] = js.native
  def getAllLifecycleHooks(reflector: CompileReflector, token: js.Any): js.Array[LifecycleHooks] = js.native
  def hasLifecycleHook(reflector: CompileReflector, hook: LifecycleHooks, token: js.Any): Boolean = js.native
}

