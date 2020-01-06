package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * A label that consists of a customer-defined key and an optional value.
    */
  var Tags: js.UndefOr[MapOf__string] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: MapOf__string = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

