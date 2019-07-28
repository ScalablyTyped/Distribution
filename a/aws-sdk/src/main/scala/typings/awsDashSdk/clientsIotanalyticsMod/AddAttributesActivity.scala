package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAttributesActivity extends js.Object {
  /**
    * A list of 1-50 "AttributeNameMapping" objects that map an existing attribute to a new attribute.  The existing attributes remain in the message, so if you want to remove the originals, use "RemoveAttributeActivity". 
    */
  var attributes: AttributeNameMapping
  /**
    * The name of the 'addAttributes' activity.
    */
  var name: ActivityName
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}

object AddAttributesActivity {
  @scala.inline
  def apply(attributes: AttributeNameMapping, name: ActivityName, next: ActivityName = null): AddAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes, name = name)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[AddAttributesActivity]
  }
}

