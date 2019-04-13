package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsResponse extends js.Object {
  /**
    * The function's tags.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object ListTagsResponse {
  @scala.inline
  def apply(Tags: Tags = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsResponse]
  }
}

