package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDetectorModelVersionsRequest extends js.Object {
  /**
    * The name of the detector model whose versions are returned.
    */
  var detectorModelName: DetectorModelName
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDetectorModelVersionsRequest {
  @scala.inline
  def apply(detectorModelName: DetectorModelName, maxResults: Int | Double = null, nextToken: NextToken = null): ListDetectorModelVersionsRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDetectorModelVersionsRequest]
  }
}

