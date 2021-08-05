package typings.angularCore.anon

import typings.typescript.mod.CallExpression
import typings.typescript.mod.ObjectLiteralExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveParameter extends StObject {
  
  var removeParameter: js.Array[CallExpression]
  
  var removeProperty: js.Array[ObjectLiteralExpression]
}
object RemoveParameter {
  
  inline def apply(removeParameter: js.Array[CallExpression], removeProperty: js.Array[ObjectLiteralExpression]): RemoveParameter = {
    val __obj = js.Dynamic.literal(removeParameter = removeParameter.asInstanceOf[js.Any], removeProperty = removeProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveParameter]
  }
  
  extension [Self <: RemoveParameter](x: Self) {
    
    inline def setRemoveParameter(value: js.Array[CallExpression]): Self = StObject.set(x, "removeParameter", value.asInstanceOf[js.Any])
    
    inline def setRemoveParameterVarargs(value: CallExpression*): Self = StObject.set(x, "removeParameter", js.Array(value :_*))
    
    inline def setRemoveProperty(value: js.Array[ObjectLiteralExpression]): Self = StObject.set(x, "removeProperty", value.asInstanceOf[js.Any])
    
    inline def setRemovePropertyVarargs(value: ObjectLiteralExpression*): Self = StObject.set(x, "removeProperty", js.Array(value :_*))
  }
}
