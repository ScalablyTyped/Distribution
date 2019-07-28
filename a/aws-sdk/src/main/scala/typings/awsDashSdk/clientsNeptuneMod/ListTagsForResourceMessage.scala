package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceMessage extends js.Object {
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The Amazon Neptune resource with tags to be listed. This value is an Amazon Resource Name (ARN). For information about creating an ARN, see  Constructing an Amazon Resource Name (ARN).
    */
  var ResourceName: String
}

object ListTagsForResourceMessage {
  @scala.inline
  def apply(ResourceName: String, Filters: FilterList = null): ListTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    __obj.asInstanceOf[ListTagsForResourceMessage]
  }
}

