package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReportJobInput extends StObject {
  
  /**
    * The identifier of the report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most 1,024 bytes long. The report job ID cannot be edited.
    */
  var ReportJobId: typings.awsSdk.clientsBackupMod.ReportJobId
}
object DescribeReportJobInput {
  
  inline def apply(ReportJobId: ReportJobId): DescribeReportJobInput = {
    val __obj = js.Dynamic.literal(ReportJobId = ReportJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReportJobInput]
  }
  
  extension [Self <: DescribeReportJobInput](x: Self) {
    
    inline def setReportJobId(value: ReportJobId): Self = StObject.set(x, "ReportJobId", value.asInstanceOf[js.Any])
  }
}
