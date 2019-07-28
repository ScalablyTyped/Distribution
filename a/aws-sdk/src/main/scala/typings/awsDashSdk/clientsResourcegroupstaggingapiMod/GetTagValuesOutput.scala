package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagValuesOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.PaginationToken] = js.undefined
  /**
    * A list of all tag values for the specified key in the AWS account.
    */
  var TagValues: js.UndefOr[TagValuesOutputList] = js.undefined
}

object GetTagValuesOutput {
  @scala.inline
  def apply(PaginationToken: PaginationToken = null, TagValues: TagValuesOutputList = null): GetTagValuesOutput = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    if (TagValues != null) __obj.updateDynamic("TagValues")(TagValues)
    __obj.asInstanceOf[GetTagValuesOutput]
  }
}

