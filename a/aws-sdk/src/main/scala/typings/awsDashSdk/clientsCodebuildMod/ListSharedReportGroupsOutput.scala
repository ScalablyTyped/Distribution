package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSharedReportGroupsOutput extends js.Object {
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    *  The list of ARNs for the report groups shared with the current AWS account or user. 
    */
  var reportGroups: js.UndefOr[ReportGroupArns] = js.native
}

object ListSharedReportGroupsOutput {
  @scala.inline
  def apply(nextToken: String = null, reportGroups: ReportGroupArns = null): ListSharedReportGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (reportGroups != null) __obj.updateDynamic("reportGroups")(reportGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSharedReportGroupsOutput]
  }
}

