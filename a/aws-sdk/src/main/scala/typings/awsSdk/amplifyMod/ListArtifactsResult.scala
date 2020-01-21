package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListArtifactsResult extends js.Object {
  /**
    *  List of artifacts. 
    */
  var artifacts: Artifacts = js.native
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListArtifactsResult {
  @scala.inline
  def apply(artifacts: Artifacts, nextToken: NextToken = null): ListArtifactsResult = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArtifactsResult]
  }
}

