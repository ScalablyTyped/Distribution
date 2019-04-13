package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagKeysOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * A list of all tag keys in the AWS account.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.undefined
}

object GetTagKeysOutput {
  @scala.inline
  def apply(PaginationToken: PaginationToken = null, TagKeys: TagKeyList = null): GetTagKeysOutput = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys)
    __obj.asInstanceOf[GetTagKeysOutput]
  }
}

