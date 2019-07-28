package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseStatement extends js.Object {
  var Condition: js.UndefOr[ConditionBlock] = js.undefined
  var Effect: String
  var Sid: js.UndefOr[String] = js.undefined
}

object BaseStatement {
  @scala.inline
  def apply(Effect: String, Condition: ConditionBlock = null, Sid: String = null): BaseStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    if (Sid != null) __obj.updateDynamic("Sid")(Sid)
    __obj.asInstanceOf[BaseStatement]
  }
}

