package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDestinationsResponse extends js.Object {
  /**
    * The destinations.
    */
  var destinations: js.UndefOr[Destinations] = js.undefined
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeDestinationsResponse {
  @scala.inline
  def apply(destinations: Destinations = null, nextToken: NextToken = null): DescribeDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    if (destinations != null) __obj.updateDynamic("destinations")(destinations)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeDestinationsResponse]
  }
}

