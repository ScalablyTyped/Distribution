package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagKeysInput extends js.Object {
  /**
    * A limit that restricts the number of results that are returned per page.
    */
  var MaxResults: js.UndefOr[MaxResultTagsDS1] = js.undefined
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
}

object GetTagKeysInput {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResultTagsDS1] = js.undefined, PaginationToken: PaginationToken = null): GetTagKeysInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    __obj.asInstanceOf[GetTagKeysInput]
  }
}

