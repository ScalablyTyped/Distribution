package typings.angularDashFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/field-configuration-object#validators-object
	 */
trait IValidator extends js.Object {
  var expression: String | IExpressionFunction
  var message: js.UndefOr[String | IExpressionFunction] = js.undefined
}

object IValidator {
  @scala.inline
  def apply(expression: String | IExpressionFunction, message: String | IExpressionFunction = null): IValidator = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidator]
  }
}

