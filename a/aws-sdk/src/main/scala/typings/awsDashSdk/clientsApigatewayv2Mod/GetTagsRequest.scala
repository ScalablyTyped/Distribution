package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagsRequest extends js.Object {
  var ResourceArn: __string
}

object GetTagsRequest {
  @scala.inline
  def apply(ResourceArn: __string): GetTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[GetTagsRequest]
  }
}

