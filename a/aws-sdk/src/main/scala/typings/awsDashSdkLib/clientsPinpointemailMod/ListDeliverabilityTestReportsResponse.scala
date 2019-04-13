package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeliverabilityTestReportsResponse extends js.Object {
  /**
    * An object that contains a lists of predictive inbox placement tests that you've performed.
    */
  var DeliverabilityTestReports: awsDashSdkLib.clientsPinpointemailMod.DeliverabilityTestReports
  /**
    * A token that indicates that there are additional predictive inbox placement tests to list. To view additional predictive inbox placement tests, issue another request to ListDeliverabilityTestReports, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDeliverabilityTestReportsResponse {
  @scala.inline
  def apply(DeliverabilityTestReports: DeliverabilityTestReports, NextToken: NextToken = null): ListDeliverabilityTestReportsResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReports = DeliverabilityTestReports)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDeliverabilityTestReportsResponse]
  }
}

