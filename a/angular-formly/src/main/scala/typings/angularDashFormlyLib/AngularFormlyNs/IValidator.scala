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

