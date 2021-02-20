package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see http://docs.angular-formly.com/docs/field-configuration-object#validators-object
  */
@js.native
trait IValidator extends StObject {
  
  var expression: String | IExpressionFunction = js.native
  
  var message: js.UndefOr[String | IExpressionFunction] = js.native
}
object IValidator {
  
  @scala.inline
  def apply(expression: String | IExpressionFunction): IValidator = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidator]
  }
  
  @scala.inline
  implicit class IValidatorMutableBuilder[Self <: IValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String | IExpressionFunction): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "expression", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMessage(value: String | IExpressionFunction): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "message", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
