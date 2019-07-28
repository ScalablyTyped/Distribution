package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventDetailsResponse extends js.Object {
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsFailedSet] = js.undefined
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet] = js.undefined
}

object DescribeEventDetailsResponse {
  @scala.inline
  def apply(
    failedSet: DescribeEventDetailsFailedSet = null,
    successfulSet: DescribeEventDetailsSuccessfulSet = null
  ): DescribeEventDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (failedSet != null) __obj.updateDynamic("failedSet")(failedSet)
    if (successfulSet != null) __obj.updateDynamic("successfulSet")(successfulSet)
    __obj.asInstanceOf[DescribeEventDetailsResponse]
  }
}

