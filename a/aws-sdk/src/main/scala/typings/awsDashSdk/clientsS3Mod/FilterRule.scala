package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterRule extends js.Object {
  /**
    * The object key name prefix or suffix identifying one or more objects to which the filtering rule applies. The maximum length is 1,024 characters. Overlapping prefixes and suffixes are not supported. For more information, see Configuring Event Notifications in the Amazon Simple Storage Service Developer Guide.
    */
  var Name: js.UndefOr[FilterRuleName] = js.native
  /**
    * The value that the filter searches for in object key names.
    */
  var Value: js.UndefOr[FilterRuleValue] = js.native
}

object FilterRule {
  @scala.inline
  def apply(Name: FilterRuleName = null, Value: FilterRuleValue = null): FilterRule = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterRule]
  }
}

