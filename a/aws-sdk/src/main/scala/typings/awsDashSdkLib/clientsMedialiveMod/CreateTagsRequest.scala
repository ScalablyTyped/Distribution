package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTagsRequest extends js.Object {
  var ResourceArn: __string
  var Tags: js.UndefOr[Tags] = js.undefined
}

object CreateTagsRequest {
  @scala.inline
  def apply(ResourceArn: __string, Tags: Tags = null): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

