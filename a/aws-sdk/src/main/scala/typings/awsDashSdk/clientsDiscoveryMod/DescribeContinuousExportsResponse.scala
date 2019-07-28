package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeContinuousExportsResponse extends js.Object {
  /**
    * A list of continuous export descriptions.
    */
  var descriptions: js.UndefOr[ContinuousExportDescriptions] = js.undefined
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeContinuousExportsResponse {
  @scala.inline
  def apply(descriptions: ContinuousExportDescriptions = null, nextToken: NextToken = null): DescribeContinuousExportsResponse = {
    val __obj = js.Dynamic.literal()
    if (descriptions != null) __obj.updateDynamic("descriptions")(descriptions)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeContinuousExportsResponse]
  }
}

