package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagKeysOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.PaginationToken] = js.native
  /**
    * A list of all tag keys in the AWS account.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.native
}

object GetTagKeysOutput {
  @scala.inline
  def apply(PaginationToken: PaginationToken = null, TagKeys: TagKeyList = null): GetTagKeysOutput = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagKeysOutput]
  }
}

