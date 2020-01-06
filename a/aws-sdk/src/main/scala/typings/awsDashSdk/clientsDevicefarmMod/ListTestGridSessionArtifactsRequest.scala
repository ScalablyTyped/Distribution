package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionArtifactsRequest extends js.Object {
  /**
    * The maximum number of results to be returned by a request.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ARN of a TestGridSession. 
    */
  var sessionArn: DeviceFarmArn = js.native
  /**
    * Limit results to a specified type of artifact.
    */
  var `type`: js.UndefOr[TestGridSessionArtifactCategory] = js.native
}

object ListTestGridSessionArtifactsRequest {
  @scala.inline
  def apply(
    sessionArn: DeviceFarmArn,
    maxResult: Int | scala.Double = null,
    nextToken: PaginationToken = null,
    `type`: TestGridSessionArtifactCategory = null
  ): ListTestGridSessionArtifactsRequest = {
    val __obj = js.Dynamic.literal(sessionArn = sessionArn.asInstanceOf[js.Any])
    if (maxResult != null) __obj.updateDynamic("maxResult")(maxResult.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionArtifactsRequest]
  }
}

