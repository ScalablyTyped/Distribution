package typings.atAngularCompiler.srcCompileUnderscoreMetadataMod

import typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileTypeMetadata extends CompileIdentifierMetadata {
  var diDeps: js.Array[CompileDiDependencyMetadata]
  var lifecycleHooks: js.Array[LifecycleHooks]
}

object CompileTypeMetadata {
  @scala.inline
  def apply(
    diDeps: js.Array[CompileDiDependencyMetadata],
    lifecycleHooks: js.Array[LifecycleHooks],
    reference: js.Any
  ): CompileTypeMetadata = {
    val __obj = js.Dynamic.literal(diDeps = diDeps, lifecycleHooks = lifecycleHooks, reference = reference)
  
    __obj.asInstanceOf[CompileTypeMetadata]
  }
}

