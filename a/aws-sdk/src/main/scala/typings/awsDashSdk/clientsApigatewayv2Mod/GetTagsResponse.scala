package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagsResponse extends js.Object {
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object GetTagsResponse {
  @scala.inline
  def apply(Tags: __mapOf__string = null): GetTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[GetTagsResponse]
  }
}

