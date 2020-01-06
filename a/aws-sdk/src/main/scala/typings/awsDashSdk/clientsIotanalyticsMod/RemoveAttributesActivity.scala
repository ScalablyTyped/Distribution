package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributesActivity extends js.Object {
  /**
    * A list of 1-50 attributes to remove from the message.
    */
  var attributes: AttributeNames = js.native
  /**
    * The name of the 'removeAttributes' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}

object RemoveAttributesActivity {
  @scala.inline
  def apply(attributes: AttributeNames, name: ActivityName, next: ActivityName = null): RemoveAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesActivity]
  }
}

