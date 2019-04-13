package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListArtifactsResult extends js.Object {
  /**
    * Information about the artifacts.
    */
  var artifacts: js.UndefOr[Artifacts] = js.undefined
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned, which can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListArtifactsResult {
  @scala.inline
  def apply(artifacts: Artifacts = null, nextToken: PaginationToken = null): ListArtifactsResult = {
    val __obj = js.Dynamic.literal()
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListArtifactsResult]
  }
}

