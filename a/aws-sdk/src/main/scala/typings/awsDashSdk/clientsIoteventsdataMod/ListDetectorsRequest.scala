package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDetectorsRequest extends js.Object {
  /**
    * The name of the detector model whose detectors (instances) are listed.
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
  /**
    * A filter that limits results to those detectors (instances) in the given state.
    */
  var stateName: js.UndefOr[StateName] = js.undefined
}

object ListDetectorsRequest {
  @scala.inline
  def apply(
    detectorModelName: DetectorModelName,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    stateName: StateName = null
  ): ListDetectorsRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (stateName != null) __obj.updateDynamic("stateName")(stateName)
    __obj.asInstanceOf[ListDetectorsRequest]
  }
}

