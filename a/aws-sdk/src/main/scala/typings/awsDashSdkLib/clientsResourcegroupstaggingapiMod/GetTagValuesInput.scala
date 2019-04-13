package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagValuesInput extends js.Object {
  /**
    * The key for which you want to list all existing values in the specified region for the AWS account.
    */
  var Key: TagKey
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
}

object GetTagValuesInput {
  @scala.inline
  def apply(Key: TagKey, PaginationToken: PaginationToken = null): GetTagValuesInput = {
    val __obj = js.Dynamic.literal(Key = Key)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    __obj.asInstanceOf[GetTagValuesInput]
  }
}

