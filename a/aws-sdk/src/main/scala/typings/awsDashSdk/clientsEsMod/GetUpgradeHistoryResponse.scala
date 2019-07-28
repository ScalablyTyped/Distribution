package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUpgradeHistoryResponse extends js.Object {
  /**
    * Pagination token that needs to be supplied to the next call to get the next page of results
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    *  A list of  UpgradeHistory  objects corresponding to each Upgrade or Upgrade Eligibility Check performed on a domain returned as part of  GetUpgradeHistoryResponse  object. 
    */
  var UpgradeHistories: js.UndefOr[UpgradeHistoryList] = js.undefined
}

object GetUpgradeHistoryResponse {
  @scala.inline
  def apply(NextToken: String = null, UpgradeHistories: UpgradeHistoryList = null): GetUpgradeHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UpgradeHistories != null) __obj.updateDynamic("UpgradeHistories")(UpgradeHistories)
    __obj.asInstanceOf[GetUpgradeHistoryResponse]
  }
}

