package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeliverabilityTestReportResponse extends js.Object {
  /**
    * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
    */
  var DeliverabilityTestStatus: awsDashSdkLib.clientsPinpointemailMod.DeliverabilityTestStatus
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: awsDashSdkLib.clientsPinpointemailMod.ReportId
}

object CreateDeliverabilityTestReportResponse {
  @scala.inline
  def apply(DeliverabilityTestStatus: DeliverabilityTestStatus, ReportId: ReportId): CreateDeliverabilityTestReportResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestStatus = DeliverabilityTestStatus.asInstanceOf[js.Any], ReportId = ReportId)
  
    __obj.asInstanceOf[CreateDeliverabilityTestReportResponse]
  }
}

