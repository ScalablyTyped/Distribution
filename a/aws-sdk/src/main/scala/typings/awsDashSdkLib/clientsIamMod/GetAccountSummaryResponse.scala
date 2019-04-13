package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountSummaryResponse extends js.Object {
  /**
    * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
    */
  var SummaryMap: js.UndefOr[summaryMapType] = js.undefined
}

object GetAccountSummaryResponse {
  @scala.inline
  def apply(SummaryMap: summaryMapType = null): GetAccountSummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (SummaryMap != null) __obj.updateDynamic("SummaryMap")(SummaryMap)
    __obj.asInstanceOf[GetAccountSummaryResponse]
  }
}

