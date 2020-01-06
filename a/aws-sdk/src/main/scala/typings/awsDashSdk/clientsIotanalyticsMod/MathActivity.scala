package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathActivity extends js.Object {
  /**
    * The name of the attribute that contains the result of the math operation.
    */
  var attribute: AttributeName = js.native
  /**
    * An expression that uses one or more existing attributes and must return an integer value.
    */
  var math: MathExpression = js.native
  /**
    * The name of the 'math' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}

object MathActivity {
  @scala.inline
  def apply(attribute: AttributeName, math: MathExpression, name: ActivityName, next: ActivityName = null): MathActivity = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], math = math.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathActivity]
  }
}

