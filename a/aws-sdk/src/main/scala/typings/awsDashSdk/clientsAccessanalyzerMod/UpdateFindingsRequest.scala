package typings.awsDashSdk.clientsAccessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFindingsRequest extends js.Object {
  /**
    * The ARN of the analyzer that generated the findings to update.
    */
  var analyzerArn: AnalyzerArn = js.native
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the findings to update.
    */
  var ids: js.UndefOr[FindingIdList] = js.native
  /**
    * The ARN of the resource identified in the finding.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.native
  /**
    * The state represents the action to take to update the finding Status. Use ARCHIVE to change an Active finding to an Archived finding. Use ACTIVE to change an Archived finding to an Active finding.
    */
  var status: FindingStatusUpdate = js.native
}

object UpdateFindingsRequest {
  @scala.inline
  def apply(
    analyzerArn: AnalyzerArn,
    status: FindingStatusUpdate,
    clientToken: String = null,
    ids: FindingIdList = null,
    resourceArn: ResourceArn = null
  ): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
}

