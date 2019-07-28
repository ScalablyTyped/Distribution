package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectAttributesActivity extends js.Object {
  /**
    * A list of the attributes to select from the message.
    */
  var attributes: AttributeNames
  /**
    * The name of the 'selectAttributes' activity.
    */
  var name: ActivityName
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}

object SelectAttributesActivity {
  @scala.inline
  def apply(attributes: AttributeNames, name: ActivityName, next: ActivityName = null): SelectAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes, name = name)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[SelectAttributesActivity]
  }
}

