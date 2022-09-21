package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see http://docs.angular-formly.com/docs/field-configuration-object#validators-object
  */
trait IValidator extends StObject {
  
  var expression: String | IExpressionFunction
  
  var message: js.UndefOr[String | IExpressionFunction] = js.undefined
}
object IValidator {
  
  inline def apply(expression: String | IExpressionFunction): IValidator = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidator]
  }
  
  extension [Self <: IValidator](x: Self) {
    
    inline def setExpression(value: String | IExpressionFunction): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "expression", js.Any.fromFunction3(value))
    
    inline def setMessage(value: String | IExpressionFunction): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "message", js.Any.fromFunction3(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
