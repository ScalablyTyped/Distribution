package typings.angularCompilerCli.anon

import typings.typescript.mod.ParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  var parameter: ParameterDeclaration
  
  var path: String
}
object Parameter {
  
  inline def apply(parameter: ParameterDeclaration, path: String): Parameter = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
    
    inline def setParameter(value: ParameterDeclaration): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
