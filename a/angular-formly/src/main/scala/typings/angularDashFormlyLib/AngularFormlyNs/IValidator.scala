package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/field-configuration-object#validators-object
	 */
trait IValidator extends js.Object {
  var expression: java.lang.String | IExpressionFunction
  var message: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
}

object IValidator {
  @scala.inline
  def apply(
    expression: java.lang.String | IExpressionFunction,
    message: java.lang.String | IExpressionFunction = null
  ): IValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidator]
  }
}

