package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileTypeMetadata extends CompileIdentifierMetadata {
  
  var diDeps: js.Array[CompileDiDependencyMetadata] = js.native
  
  var lifecycleHooks: js.Array[LifecycleHooks] = js.native
}
object CompileTypeMetadata {
  
  @scala.inline
  def apply(
    diDeps: js.Array[CompileDiDependencyMetadata],
    lifecycleHooks: js.Array[LifecycleHooks],
    reference: js.Any
  ): CompileTypeMetadata = {
    val __obj = js.Dynamic.literal(diDeps = diDeps.asInstanceOf[js.Any], lifecycleHooks = lifecycleHooks.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTypeMetadata]
  }
  
  @scala.inline
  implicit class CompileTypeMetadataMutableBuilder[Self <: CompileTypeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiDeps(value: js.Array[CompileDiDependencyMetadata]): Self = StObject.set(x, "diDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiDepsVarargs(value: CompileDiDependencyMetadata*): Self = StObject.set(x, "diDeps", js.Array(value :_*))
    
    @scala.inline
    def setLifecycleHooks(value: js.Array[LifecycleHooks]): Self = StObject.set(x, "lifecycleHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleHooksVarargs(value: LifecycleHooks*): Self = StObject.set(x, "lifecycleHooks", js.Array(value :_*))
  }
}
