package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionArtifactsResult extends js.Object {
  /**
    * A list of test grid session artifacts for a TestGridSession.
    */
  var artifacts: js.UndefOr[TestGridSessionArtifacts] = js.native
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListTestGridSessionArtifactsResult {
  @scala.inline
  def apply(artifacts: TestGridSessionArtifacts = null, nextToken: PaginationToken = null): ListTestGridSessionArtifactsResult = {
    val __obj = js.Dynamic.literal()
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionArtifactsResult]
  }
}

