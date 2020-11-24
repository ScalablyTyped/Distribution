package typings.angularFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see http://docs.angular-formly.com/docs/field-configuration-object#validators-object
  */
@js.native
trait IValidator extends js.Object {
  
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
  implicit class IValidatorOps[Self <: IValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpressionFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("expression", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExpression(value: String | IExpressionFunction): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("message", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMessage(value: String | IExpressionFunction): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
