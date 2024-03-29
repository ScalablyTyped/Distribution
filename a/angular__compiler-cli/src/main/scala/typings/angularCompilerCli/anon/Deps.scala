package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.R3DependencyMetadata
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcDiMod.ConstructorDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deps
  extends StObject
     with ConstructorDeps {
  
  var deps: js.Array[R3DependencyMetadata]
}
object Deps {
  
  inline def apply(deps: js.Array[R3DependencyMetadata]): Deps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deps] (val x: Self) extends AnyVal {
    
    inline def setDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value*))
  }
}
