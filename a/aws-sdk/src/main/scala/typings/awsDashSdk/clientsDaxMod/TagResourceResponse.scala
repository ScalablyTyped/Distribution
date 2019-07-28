package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceResponse extends js.Object {
  /**
    * The list of tags that are associated with the DAX resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object TagResourceResponse {
  @scala.inline
  def apply(Tags: TagList = null): TagResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[TagResourceResponse]
  }
}

