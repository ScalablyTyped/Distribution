package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReportJobOutput extends StObject {
  
  /**
    * A list of information about a report job, including its completion and creation times, report destination, unique report job ID, Amazon Resource Name (ARN), report template, status, and status message.
    */
  var ReportJob: js.UndefOr[typings.awsSdk.backupMod.ReportJob] = js.undefined
}
object DescribeReportJobOutput {
  
  inline def apply(): DescribeReportJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReportJobOutput]
  }
  
  extension [Self <: DescribeReportJobOutput](x: Self) {
    
    inline def setReportJob(value: ReportJob): Self = StObject.set(x, "ReportJob", value.asInstanceOf[js.Any])
    
    inline def setReportJobUndefined: Self = StObject.set(x, "ReportJob", js.undefined)
  }
}
