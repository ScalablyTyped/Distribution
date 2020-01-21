package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListArtifactsRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: BranchName = js.native
  /**
    *  Unique Id for an Job. 
    */
  var jobId: JobId = js.native
  /**
    *  Maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    *  Pagination token. Set to null to start listing artifacts from start. If non-null pagination token is returned in a result, then pass its value in here to list more artifacts. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListArtifactsRequest {
  @scala.inline
  def apply(
    appId: AppId,
    branchName: BranchName,
    jobId: JobId,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): ListArtifactsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArtifactsRequest]
  }
}

