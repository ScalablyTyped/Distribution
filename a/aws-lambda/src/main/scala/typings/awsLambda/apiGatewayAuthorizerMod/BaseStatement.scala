package typings.awsLambda.apiGatewayAuthorizerMod

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
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (Sid != null) __obj.updateDynamic("Sid")(Sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStatement]
  }
}

