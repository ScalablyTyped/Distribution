package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContinuousExportsResponse extends js.Object {
  /**
    * A list of continuous export descriptions.
    */
  var descriptions: js.UndefOr[ContinuousExportDescriptions] = js.native
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeContinuousExportsResponse {
  @scala.inline
  def apply(descriptions: ContinuousExportDescriptions = null, nextToken: NextToken = null): DescribeContinuousExportsResponse = {
    val __obj = js.Dynamic.literal()
    if (descriptions != null) __obj.updateDynamic("descriptions")(descriptions.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContinuousExportsResponse]
  }
}

