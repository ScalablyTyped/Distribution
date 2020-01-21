package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagsResponse extends js.Object {
  var Tags: typings.awsSdk.apigatewayv2Mod.Tags = js.native
}

object GetTagsResponse {
  @scala.inline
  def apply(Tags: Tags): GetTagsResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTagsResponse]
  }
}

