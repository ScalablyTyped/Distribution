package typings.angularCore.anon

import typings.typescript.mod.CallExpression
import typings.typescript.mod.ObjectLiteralExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveParameter extends StObject {
  
  var removeParameter: js.Array[CallExpression] = js.native
  
  var removeProperty: js.Array[ObjectLiteralExpression] = js.native
}
object RemoveParameter {
  
  @scala.inline
  def apply(removeParameter: js.Array[CallExpression], removeProperty: js.Array[ObjectLiteralExpression]): RemoveParameter = {
    val __obj = js.Dynamic.literal(removeParameter = removeParameter.asInstanceOf[js.Any], removeProperty = removeProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveParameter]
  }
  
  @scala.inline
  implicit class RemoveParameterMutableBuilder[Self <: RemoveParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveParameter(value: js.Array[CallExpression]): Self = StObject.set(x, "removeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveParameterVarargs(value: CallExpression*): Self = StObject.set(x, "removeParameter", js.Array(value :_*))
    
    @scala.inline
    def setRemoveProperty(value: js.Array[ObjectLiteralExpression]): Self = StObject.set(x, "removeProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovePropertyVarargs(value: ObjectLiteralExpression*): Self = StObject.set(x, "removeProperty", js.Array(value :_*))
  }
}
