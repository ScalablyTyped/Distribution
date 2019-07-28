package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFilter extends js.Object {
  /**
    * The tag key.
    */
  var tagKey: js.UndefOr[TagKey] = js.undefined
  /**
    * The tag values.
    */
  var tagValues: js.UndefOr[TagValueList] = js.undefined
}

object TagFilter {
  @scala.inline
  def apply(tagKey: TagKey = null, tagValues: TagValueList = null): TagFilter = {
    val __obj = js.Dynamic.literal()
    if (tagKey != null) __obj.updateDynamic("tagKey")(tagKey)
    if (tagValues != null) __obj.updateDynamic("tagValues")(tagValues)
    __obj.asInstanceOf[TagFilter]
  }
}

