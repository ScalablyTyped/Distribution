package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeliverabilityTestReportsResponse extends js.Object {
  /**
    * An object that contains a lists of predictive inbox placement tests that you've performed.
    */
  var DeliverabilityTestReports: typings.awsDashSdk.clientsPinpointemailMod.DeliverabilityTestReports = js.native
  /**
    * A token that indicates that there are additional predictive inbox placement tests to list. To view additional predictive inbox placement tests, issue another request to ListDeliverabilityTestReports, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.NextToken] = js.native
}

object ListDeliverabilityTestReportsResponse {
  @scala.inline
  def apply(DeliverabilityTestReports: DeliverabilityTestReports, NextToken: NextToken = null): ListDeliverabilityTestReportsResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReports = DeliverabilityTestReports.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeliverabilityTestReportsResponse]
  }
}

