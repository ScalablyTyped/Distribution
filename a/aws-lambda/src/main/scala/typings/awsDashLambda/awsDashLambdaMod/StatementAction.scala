package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatementAction extends js.Object {
  var Action: js.UndefOr[String | js.Array[String]] = js.undefined
  var NotAction: js.UndefOr[String | js.Array[String]] = js.undefined
}

object StatementAction {
  @scala.inline
  def apply(Action: String | js.Array[String] = null, NotAction: String | js.Array[String] = null): StatementAction = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (NotAction != null) __obj.updateDynamic("NotAction")(NotAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatementAction]
  }
}

