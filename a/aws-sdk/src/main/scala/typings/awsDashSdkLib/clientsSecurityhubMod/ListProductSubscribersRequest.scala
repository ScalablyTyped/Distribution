package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProductSubscribersRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The ARN of the product.
    */
  var ProductArn: js.UndefOr[NonEmptyString] = js.undefined
}

object ListProductSubscribersRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ProductArn: NonEmptyString = null
  ): ListProductSubscribersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ProductArn != null) __obj.updateDynamic("ProductArn")(ProductArn)
    __obj.asInstanceOf[ListProductSubscribersRequest]
  }
}

