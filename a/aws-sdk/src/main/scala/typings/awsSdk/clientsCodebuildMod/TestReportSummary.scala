package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportSummary extends StObject {
  
  /**
    *  The number of nanoseconds it took to run all of the test cases in this report. 
    */
  var durationInNanoSeconds: WrapperLong
  
  /**
    *  A map that contains the number of each type of status returned by the test results in this TestReportSummary. 
    */
  var statusCounts: ReportStatusCounts
  
  /**
    *  The number of test cases in this TestReportSummary. The total includes truncated test cases. 
    */
  var total: WrapperInt
}
object TestReportSummary {
  
  inline def apply(durationInNanoSeconds: WrapperLong, statusCounts: ReportStatusCounts, total: WrapperInt): TestReportSummary = {
    val __obj = js.Dynamic.literal(durationInNanoSeconds = durationInNanoSeconds.asInstanceOf[js.Any], statusCounts = statusCounts.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestReportSummary] (val x: Self) extends AnyVal {
    
    inline def setDurationInNanoSeconds(value: WrapperLong): Self = StObject.set(x, "durationInNanoSeconds", value.asInstanceOf[js.Any])
    
    inline def setStatusCounts(value: ReportStatusCounts): Self = StObject.set(x, "statusCounts", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: WrapperInt): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
