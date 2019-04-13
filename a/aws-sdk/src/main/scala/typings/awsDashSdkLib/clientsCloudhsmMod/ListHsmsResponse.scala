package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHsmsResponse extends js.Object {
  /**
    * The list of ARNs that identify the HSMs.
    */
  var HsmList: js.UndefOr[HsmList] = js.undefined
  /**
    * If not null, more results are available. Pass this value to ListHsms to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListHsmsResponse {
  @scala.inline
  def apply(HsmList: HsmList = null, NextToken: PaginationToken = null): ListHsmsResponse = {
    val __obj = js.Dynamic.literal()
    if (HsmList != null) __obj.updateDynamic("HsmList")(HsmList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListHsmsResponse]
  }
}

