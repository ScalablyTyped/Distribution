package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  var Tags: typings.awsDashSdk.clientsSchemasMod.Tags = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: Tags): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

