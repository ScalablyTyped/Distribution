package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListArtifactsRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Type for an artifact. 
    */
  var artifactType: js.UndefOr[ArtifactType] = js.undefined
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: BranchName
  /**
    *  Unique Id for an Job. 
    */
  var jobId: JobId
  /**
    *  Maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    *  Pagination token. Set to null to start listing artifacts from start. If non-null pagination token is returned in a result, then pass its value in here to list more artifacts. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListArtifactsRequest {
  @scala.inline
  def apply(
    appId: AppId,
    branchName: BranchName,
    jobId: JobId,
    artifactType: ArtifactType = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): ListArtifactsRequest = {
    val __obj = js.Dynamic.literal(appId = appId, branchName = branchName, jobId = jobId)
    if (artifactType != null) __obj.updateDynamic("artifactType")(artifactType.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListArtifactsRequest]
  }
}

