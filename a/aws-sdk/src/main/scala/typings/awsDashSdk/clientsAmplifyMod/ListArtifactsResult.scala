package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListArtifactsResult extends js.Object {
  /**
    *  List of artifacts. 
    */
  var artifacts: Artifacts
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListArtifactsResult {
  @scala.inline
  def apply(artifacts: Artifacts, nextToken: NextToken = null): ListArtifactsResult = {
    val __obj = js.Dynamic.literal(artifacts = artifacts)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListArtifactsResult]
  }
}

