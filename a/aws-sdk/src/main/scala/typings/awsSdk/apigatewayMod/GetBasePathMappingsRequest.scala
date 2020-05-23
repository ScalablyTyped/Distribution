package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBasePathMappingsRequest extends js.Object {
  /**
    * [Required] The domain name of a BasePathMapping resource.
    */
  var domainName: String = js.native
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
}

object GetBasePathMappingsRequest {
  @scala.inline
  def apply(domainName: String, limit: js.UndefOr[NullableInteger] = js.undefined, position: String = null): GetBasePathMappingsRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBasePathMappingsRequest]
  }
}

