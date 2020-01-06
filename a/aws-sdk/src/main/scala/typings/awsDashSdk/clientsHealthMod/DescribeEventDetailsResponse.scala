package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventDetailsResponse extends js.Object {
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsFailedSet] = js.native
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet] = js.native
}

object DescribeEventDetailsResponse {
  @scala.inline
  def apply(
    failedSet: DescribeEventDetailsFailedSet = null,
    successfulSet: DescribeEventDetailsSuccessfulSet = null
  ): DescribeEventDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (failedSet != null) __obj.updateDynamic("failedSet")(failedSet.asInstanceOf[js.Any])
    if (successfulSet != null) __obj.updateDynamic("successfulSet")(successfulSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventDetailsResponse]
  }
}

