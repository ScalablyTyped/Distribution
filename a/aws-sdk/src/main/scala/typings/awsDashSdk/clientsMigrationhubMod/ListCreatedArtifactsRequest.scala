package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCreatedArtifactsRequest extends js.Object {
  /**
    * Maximum number of results to be returned per page.
    */
  var MaxResults: js.UndefOr[MaxResultsCreatedArtifacts] = js.undefined
  /**
    * Unique identifier that references the migration task.
    */
  var MigrationTaskName: typings.awsDashSdk.clientsMigrationhubMod.MigrationTaskName
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsDashSdk.clientsMigrationhubMod.ProgressUpdateStream
}

object ListCreatedArtifactsRequest {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream,
    MaxResults: Int | Double = null,
    NextToken: Token = null
  ): ListCreatedArtifactsRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName, ProgressUpdateStream = ProgressUpdateStream)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCreatedArtifactsRequest]
  }
}

