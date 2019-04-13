package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAttributesActivity extends js.Object {
  /**
    * A list of 1-50 attributes to remove from the message.
    */
  var attributes: AttributeNames
  /**
    * The name of the 'removeAttributes' activity.
    */
  var name: ActivityName
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}

object RemoveAttributesActivity {
  @scala.inline
  def apply(attributes: AttributeNames, name: ActivityName, next: ActivityName = null): RemoveAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes, name = name)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[RemoveAttributesActivity]
  }
}

