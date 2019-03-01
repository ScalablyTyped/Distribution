package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseStatement extends js.Object {
  var Condition: js.UndefOr[ConditionBlock] = js.undefined
  var Effect: java.lang.String
  var Sid: js.UndefOr[java.lang.String] = js.undefined
}

object BaseStatement {
  @scala.inline
  def apply(Effect: java.lang.String, Condition: ConditionBlock = null, Sid: java.lang.String = null): BaseStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Effect")(Effect)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    if (Sid != null) __obj.updateDynamic("Sid")(Sid)
    __obj.asInstanceOf[BaseStatement]
  }
}

