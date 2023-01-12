package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFindingsReportRequest extends StObject {
  
  /**
    * The filter criteria to apply to the results of the finding report.
    */
  var filterCriteria: js.UndefOr[FilterCriteria] = js.undefined
  
  /**
    * The format to generate the report in.
    */
  var reportFormat: ReportFormat
  
  /**
    * The Amazon S3 export destination for the report.
    */
  var s3Destination: Destination
}
object CreateFindingsReportRequest {
  
  inline def apply(reportFormat: ReportFormat, s3Destination: Destination): CreateFindingsReportRequest = {
    val __obj = js.Dynamic.literal(reportFormat = reportFormat.asInstanceOf[js.Any], s3Destination = s3Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFindingsReportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFindingsReportRequest] (val x: Self) extends AnyVal {
    
    inline def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
    
    inline def setReportFormat(value: ReportFormat): Self = StObject.set(x, "reportFormat", value.asInstanceOf[js.Any])
    
    inline def setS3Destination(value: Destination): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
  }
}
