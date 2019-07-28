package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathActivity extends js.Object {
  /**
    * The name of the attribute that contains the result of the math operation.
    */
  var attribute: AttributeName
  /**
    * An expression that uses one or more existing attributes and must return an integer value.
    */
  var math: MathExpression
  /**
    * The name of the 'math' activity.
    */
  var name: ActivityName
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}

object MathActivity {
  @scala.inline
  def apply(attribute: AttributeName, math: MathExpression, name: ActivityName, next: ActivityName = null): MathActivity = {
    val __obj = js.Dynamic.literal(attribute = attribute, math = math, name = name)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[MathActivity]
  }
}

