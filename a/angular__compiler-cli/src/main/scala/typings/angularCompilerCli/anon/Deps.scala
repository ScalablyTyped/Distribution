package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.R3DependencyMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deps extends StObject {
  
  var deps: js.Array[R3DependencyMetadata]
}
object Deps {
  
  inline def apply(deps: js.Array[R3DependencyMetadata]): Deps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deps]
  }
  
  extension [Self <: Deps](x: Self) {
    
    inline def setDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value*))
  }
}
