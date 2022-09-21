package typings.awsSdk.applicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutReportDefinitionRequest extends StObject {
  
  /**
    * Required. Amazon Simple Storage Service (Amazon S3) location where Application Cost Profiler uploads the report.
    */
  var destinationS3Location: S3Location
  
  /**
    * Required. The format to use for the generated report.
    */
  var format: Format
  
  /**
    * Required. Description of the report.
    */
  var reportDescription: ReportDescription
  
  /**
    * Required. The cadence to generate the report.
    */
  var reportFrequency: ReportFrequency
  
  /**
    * Required. ID of the report. You can choose any valid string matching the pattern for the ID.
    */
  var reportId: ReportId
}
object PutReportDefinitionRequest {
  
  inline def apply(
    destinationS3Location: S3Location,
    format: Format,
    reportDescription: ReportDescription,
    reportFrequency: ReportFrequency,
    reportId: ReportId
  ): PutReportDefinitionRequest = {
    val __obj = js.Dynamic.literal(destinationS3Location = destinationS3Location.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], reportDescription = reportDescription.asInstanceOf[js.Any], reportFrequency = reportFrequency.asInstanceOf[js.Any], reportId = reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutReportDefinitionRequest]
  }
  
  extension [Self <: PutReportDefinitionRequest](x: Self) {
    
    inline def setDestinationS3Location(value: S3Location): Self = StObject.set(x, "destinationS3Location", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setReportDescription(value: ReportDescription): Self = StObject.set(x, "reportDescription", value.asInstanceOf[js.Any])
    
    inline def setReportFrequency(value: ReportFrequency): Self = StObject.set(x, "reportFrequency", value.asInstanceOf[js.Any])
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
  }
}
