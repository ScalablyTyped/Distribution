package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFilter extends js.Object {
  /**
    * The tag key.
    */
  var tagKey: js.UndefOr[TagKey] = js.native
  /**
    * The tag values.
    */
  var tagValues: js.UndefOr[TagValueList] = js.native
}

object TagFilter {
  @scala.inline
  def apply(tagKey: TagKey = null, tagValues: TagValueList = null): TagFilter = {
    val __obj = js.Dynamic.literal()
    if (tagKey != null) __obj.updateDynamic("tagKey")(tagKey.asInstanceOf[js.Any])
    if (tagValues != null) __obj.updateDynamic("tagValues")(tagValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFilter]
  }
}

