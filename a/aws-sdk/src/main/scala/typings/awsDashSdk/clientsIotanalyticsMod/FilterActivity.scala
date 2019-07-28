package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterActivity extends js.Object {
  /**
    * An expression that looks like a SQL WHERE clause that must return a Boolean value.
    */
  var filter: FilterExpression
  /**
    * The name of the 'filter' activity.
    */
  var name: ActivityName
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}

object FilterActivity {
  @scala.inline
  def apply(filter: FilterExpression, name: ActivityName, next: ActivityName = null): FilterActivity = {
    val __obj = js.Dynamic.literal(filter = filter, name = name)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[FilterActivity]
  }
}

