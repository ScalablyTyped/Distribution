package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagsRequest extends js.Object {
  /**
    * (Not currently supported) The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  /**
    * (Not currently supported) The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * [Required] The ARN of a resource that can be tagged. The resource ARN must be URL-encoded.
    */
  var resourceArn: String = js.native
}

object GetTagsRequest {
  @scala.inline
  def apply(resourceArn: String, limit: Int | scala.Double = null, position: String = null): GetTagsRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsRequest]
  }
}

