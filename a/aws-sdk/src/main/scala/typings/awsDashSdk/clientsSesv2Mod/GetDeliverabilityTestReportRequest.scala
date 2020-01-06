package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeliverabilityTestReportRequest extends js.Object {
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: typings.awsDashSdk.clientsSesv2Mod.ReportId = js.native
}

object GetDeliverabilityTestReportRequest {
  @scala.inline
  def apply(ReportId: ReportId): GetDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(ReportId = ReportId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDeliverabilityTestReportRequest]
  }
}

