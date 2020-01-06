package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListArtifactsResult extends js.Object {
  /**
    * Information about the artifacts.
    */
  var artifacts: js.UndefOr[Artifacts] = js.native
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListArtifactsResult {
  @scala.inline
  def apply(artifacts: Artifacts = null, nextToken: PaginationToken = null): ListArtifactsResult = {
    val __obj = js.Dynamic.literal()
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArtifactsResult]
  }
}

