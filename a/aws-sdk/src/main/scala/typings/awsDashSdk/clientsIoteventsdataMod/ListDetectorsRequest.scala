package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDetectorsRequest extends js.Object {
  /**
    * The name of the detector model whose detectors (instances) are listed.
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A filter that limits results to those detectors (instances) in the given state.
    */
  var stateName: js.UndefOr[StateName] = js.native
}

object ListDetectorsRequest {
  @scala.inline
  def apply(
    detectorModelName: DetectorModelName,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    stateName: StateName = null
  ): ListDetectorsRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (stateName != null) __obj.updateDynamic("stateName")(stateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDetectorsRequest]
  }
}

