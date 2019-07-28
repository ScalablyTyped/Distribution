package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHapgsResponse extends js.Object {
  /**
    * The list of high-availability partition groups.
    */
  var HapgList: typings.awsDashSdk.clientsCloudhsmMod.HapgList
  /**
    * If not null, more results are available. Pass this value to ListHapgs to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListHapgsResponse {
  @scala.inline
  def apply(HapgList: HapgList, NextToken: PaginationToken = null): ListHapgsResponse = {
    val __obj = js.Dynamic.literal(HapgList = HapgList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListHapgsResponse]
  }
}

