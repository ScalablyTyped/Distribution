package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeliverabilityTestReportRequest extends js.Object {
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: awsDashSdkLib.clientsPinpointemailMod.ReportId
}

object GetDeliverabilityTestReportRequest {
  @scala.inline
  def apply(ReportId: ReportId): GetDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(ReportId = ReportId)
  
    __obj.asInstanceOf[GetDeliverabilityTestReportRequest]
  }
}

