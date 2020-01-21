package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagsRequest extends js.Object {
  /**
    * The resource ARN for the tag.
    */
  var ResourceArn: string = js.native
}

object GetTagsRequest {
  @scala.inline
  def apply(ResourceArn: string): GetTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTagsRequest]
  }
}

