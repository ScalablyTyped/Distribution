package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileTypeMetadata extends CompileIdentifierMetadata {
  var diDeps: js.Array[CompileDiDependencyMetadata]
  var lifecycleHooks: js.Array[atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks]
}

object CompileTypeMetadata {
  @scala.inline
  def apply(
    diDeps: js.Array[CompileDiDependencyMetadata],
    lifecycleHooks: js.Array[atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks],
    reference: js.Any
  ): CompileTypeMetadata = {
    val __obj = js.Dynamic.literal(diDeps = diDeps, lifecycleHooks = lifecycleHooks, reference = reference)
  
    __obj.asInstanceOf[CompileTypeMetadata]
  }
}

