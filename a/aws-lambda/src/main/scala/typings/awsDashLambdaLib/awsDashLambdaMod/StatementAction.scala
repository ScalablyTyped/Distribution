package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatementAction extends js.Object {
  var Action: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var NotAction: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object StatementAction {
  @scala.inline
  def apply(
    Action: java.lang.String | js.Array[java.lang.String] = null,
    NotAction: java.lang.String | js.Array[java.lang.String] = null
  ): StatementAction = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (NotAction != null) __obj.updateDynamic("NotAction")(NotAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatementAction]
  }
}

