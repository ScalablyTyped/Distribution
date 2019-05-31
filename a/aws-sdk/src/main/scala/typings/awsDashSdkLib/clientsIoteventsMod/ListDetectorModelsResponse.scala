package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDetectorModelsResponse extends js.Object {
  /**
    * Summary information about the detector models.
    */
  var detectorModelSummaries: js.UndefOr[DetectorModelSummaries] = js.undefined
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDetectorModelsResponse {
  @scala.inline
  def apply(detectorModelSummaries: DetectorModelSummaries = null, nextToken: NextToken = null): ListDetectorModelsResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorModelSummaries != null) __obj.updateDynamic("detectorModelSummaries")(detectorModelSummaries)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDetectorModelsResponse]
  }
}

