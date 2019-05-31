package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDetectorModelVersionsResponse extends js.Object {
  /**
    * Summary information about the detector model versions.
    */
  var detectorModelVersionSummaries: js.UndefOr[DetectorModelVersionSummaries] = js.undefined
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDetectorModelVersionsResponse {
  @scala.inline
  def apply(detectorModelVersionSummaries: DetectorModelVersionSummaries = null, nextToken: NextToken = null): ListDetectorModelVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorModelVersionSummaries != null) __obj.updateDynamic("detectorModelVersionSummaries")(detectorModelVersionSummaries)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDetectorModelVersionsResponse]
  }
}

