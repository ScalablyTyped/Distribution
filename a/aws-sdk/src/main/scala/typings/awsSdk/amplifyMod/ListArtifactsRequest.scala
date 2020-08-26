package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListArtifactsRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name of a branch that is part of an Amplify app. 
    */
  var branchName: BranchName = js.native
  /**
    *  The unique ID for a job. 
    */
  var jobId: JobId = js.native
  /**
    *  The maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    *  A pagination token. Set to null to start listing artifacts from start. If a non-null pagination token is returned in a result, pass its value in here to list more artifacts. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListArtifactsRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, jobId: JobId): ListArtifactsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArtifactsRequest]
  }
  @scala.inline
  implicit class ListArtifactsRequestOps[Self <: ListArtifactsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

