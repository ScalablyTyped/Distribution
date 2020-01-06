package typings.awsDashSdk.clientsCodestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResult extends js.Object {
  /**
    * The tags associated with the notification rule.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsCodestarnotificationsMod.Tags] = js.native
}

object ListTagsForResourceResult {
  @scala.inline
  def apply(Tags: Tags = null): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
}

