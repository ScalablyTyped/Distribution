package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDetectorsResponse extends js.Object {
  /**
    * A list of summary information about the detectors (instances).
    */
  var detectorSummaries: js.UndefOr[DetectorSummaries] = js.undefined
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDetectorsResponse {
  @scala.inline
  def apply(detectorSummaries: DetectorSummaries = null, nextToken: NextToken = null): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorSummaries != null) __obj.updateDynamic("detectorSummaries")(detectorSummaries)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDetectorsResponse]
  }
}

