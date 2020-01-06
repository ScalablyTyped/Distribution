package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDestinationsResponse extends js.Object {
  /**
    * The destinations.
    */
  var destinations: js.UndefOr[Destinations] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeDestinationsResponse {
  @scala.inline
  def apply(destinations: Destinations = null, nextToken: NextToken = null): DescribeDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDestinationsResponse]
  }
}

