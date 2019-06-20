package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceSummaryOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * A table that shows counts of noncompliant resources.
    */
  var SummaryList: js.UndefOr[SummaryList] = js.undefined
}

object GetComplianceSummaryOutput {
  @scala.inline
  def apply(PaginationToken: PaginationToken = null, SummaryList: SummaryList = null): GetComplianceSummaryOutput = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    if (SummaryList != null) __obj.updateDynamic("SummaryList")(SummaryList)
    __obj.asInstanceOf[GetComplianceSummaryOutput]
  }
}

