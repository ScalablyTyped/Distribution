package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcDiMod.ConstructorDepError
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcDiMod.ConstructorDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors
  extends StObject
     with ConstructorDeps {
  
  var deps: Null
  
  var errors: js.Array[ConstructorDepError]
}
object Errors {
  
  inline def apply(deps: Null, errors: js.Array[ConstructorDepError]): Errors = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
    
    inline def setDeps(value: Null): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[ConstructorDepError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ConstructorDepError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
