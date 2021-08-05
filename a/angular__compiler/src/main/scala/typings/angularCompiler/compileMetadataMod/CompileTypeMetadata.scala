package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileTypeMetadata
  extends StObject
     with CompileIdentifierMetadata {
  
  var diDeps: js.Array[CompileDiDependencyMetadata]
  
  var lifecycleHooks: js.Array[LifecycleHooks]
}
object CompileTypeMetadata {
  
  inline def apply(
    diDeps: js.Array[CompileDiDependencyMetadata],
    lifecycleHooks: js.Array[LifecycleHooks],
    reference: js.Any
  ): CompileTypeMetadata = {
    val __obj = js.Dynamic.literal(diDeps = diDeps.asInstanceOf[js.Any], lifecycleHooks = lifecycleHooks.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTypeMetadata]
  }
  
  extension [Self <: CompileTypeMetadata](x: Self) {
    
    inline def setDiDeps(value: js.Array[CompileDiDependencyMetadata]): Self = StObject.set(x, "diDeps", value.asInstanceOf[js.Any])
    
    inline def setDiDepsVarargs(value: CompileDiDependencyMetadata*): Self = StObject.set(x, "diDeps", js.Array(value :_*))
    
    inline def setLifecycleHooks(value: js.Array[LifecycleHooks]): Self = StObject.set(x, "lifecycleHooks", value.asInstanceOf[js.Any])
    
    inline def setLifecycleHooksVarargs(value: LifecycleHooks*): Self = StObject.set(x, "lifecycleHooks", js.Array(value :_*))
  }
}
