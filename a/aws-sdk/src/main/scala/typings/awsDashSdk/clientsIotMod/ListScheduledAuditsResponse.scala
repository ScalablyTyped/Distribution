package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListScheduledAuditsResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of scheduled audits.
    */
  var scheduledAudits: js.UndefOr[ScheduledAuditMetadataList] = js.native
}

object ListScheduledAuditsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, scheduledAudits: ScheduledAuditMetadataList = null): ListScheduledAuditsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (scheduledAudits != null) __obj.updateDynamic("scheduledAudits")(scheduledAudits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListScheduledAuditsResponse]
  }
}

