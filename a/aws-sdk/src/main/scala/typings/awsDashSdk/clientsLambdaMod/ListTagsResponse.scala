package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsResponse extends js.Object {
  /**
    * The function's tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Tags] = js.native
}

object ListTagsResponse {
  @scala.inline
  def apply(Tags: Tags = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsResponse]
  }
}

