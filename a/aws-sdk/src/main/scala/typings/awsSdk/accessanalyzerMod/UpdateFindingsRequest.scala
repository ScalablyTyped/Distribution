package typings.awsSdk.accessanalyzerMod

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
  def apply(analyzerArn: AnalyzerArn, status: FindingStatusUpdate): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
  @scala.inline
  implicit class UpdateFindingsRequestOps[Self <: UpdateFindingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnalyzerArn(value: AnalyzerArn): Self = this.set("analyzerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: FindingStatusUpdate): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setIdsVarargs(value: FindingId*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: FindingIdList): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
  }
  
}

