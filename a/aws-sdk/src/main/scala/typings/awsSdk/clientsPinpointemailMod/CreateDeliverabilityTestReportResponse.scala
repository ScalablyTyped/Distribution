package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeliverabilityTestReportResponse extends StObject {
  
  /**
    * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
    */
  var DeliverabilityTestStatus: typings.awsSdk.clientsPinpointemailMod.DeliverabilityTestStatus
  
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: typings.awsSdk.clientsPinpointemailMod.ReportId
}
object CreateDeliverabilityTestReportResponse {
  
  inline def apply(DeliverabilityTestStatus: DeliverabilityTestStatus, ReportId: ReportId): CreateDeliverabilityTestReportResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestStatus = DeliverabilityTestStatus.asInstanceOf[js.Any], ReportId = ReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeliverabilityTestReportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeliverabilityTestReportResponse] (val x: Self) extends AnyVal {
    
    inline def setDeliverabilityTestStatus(value: DeliverabilityTestStatus): Self = StObject.set(x, "DeliverabilityTestStatus", value.asInstanceOf[js.Any])
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "ReportId", value.asInstanceOf[js.Any])
  }
}
