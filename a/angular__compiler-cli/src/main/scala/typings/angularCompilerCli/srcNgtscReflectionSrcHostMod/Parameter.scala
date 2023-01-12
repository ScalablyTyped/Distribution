package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.typescript.mod.Expression
import typings.typescript.mod.ParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /**
    * Expression which represents the default value of the parameter, if any.
    */
  var initializer: Expression | Null
  
  /**
    * Name of the parameter, if available.
    */
  var name: String | Null
  
  /**
    * Declaration which created this parameter.
    */
  var node: ParameterDeclaration
}
object Parameter {
  
  inline def apply(node: ParameterDeclaration): Parameter = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], initializer = null, name = null)
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
    
    inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNode(value: ParameterDeclaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
