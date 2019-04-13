package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagsRequest extends js.Object {
  /**
    * (Not currently supported) The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  /**
    * (Not currently supported) The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * [Required] The ARN of a resource that can be tagged. The resource ARN must be URL-encoded. At present, Stage is the only taggable resource.
    */
  var resourceArn: String
}

object GetTagsRequest {
  @scala.inline
  def apply(resourceArn: String, limit: js.UndefOr[NullableInteger] = js.undefined, position: String = null): GetTagsRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GetTagsRequest]
  }
}

