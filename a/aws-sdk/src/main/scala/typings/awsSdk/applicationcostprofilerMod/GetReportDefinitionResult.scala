package typings.awsSdk.applicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReportDefinitionResult extends StObject {
  
  /**
    * Timestamp (milliseconds) when this report definition was created.
    */
  var createdAt: js.Date
  
  /**
    * Amazon Simple Storage Service (Amazon S3) location where the report is uploaded.
    */
  var destinationS3Location: S3Location
  
  /**
    * Format of the generated report.
    */
  var format: Format
  
  /**
    * Timestamp (milliseconds) when this report definition was last updated.
    */
  var lastUpdated: js.Date
  
  /**
    * Description of the report.
    */
  var reportDescription: ReportDescription
  
  /**
    * Cadence used to generate the report.
    */
  var reportFrequency: ReportFrequency
  
  /**
    * ID of the report retrieved.
    */
  var reportId: ReportId
}
object GetReportDefinitionResult {
  
  inline def apply(
    createdAt: js.Date,
    destinationS3Location: S3Location,
    format: Format,
    lastUpdated: js.Date,
    reportDescription: ReportDescription,
    reportFrequency: ReportFrequency,
    reportId: ReportId
  ): GetReportDefinitionResult = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], destinationS3Location = destinationS3Location.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], reportDescription = reportDescription.asInstanceOf[js.Any], reportFrequency = reportFrequency.asInstanceOf[js.Any], reportId = reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReportDefinitionResult]
  }
  
  extension [Self <: GetReportDefinitionResult](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDestinationS3Location(value: S3Location): Self = StObject.set(x, "destinationS3Location", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setReportDescription(value: ReportDescription): Self = StObject.set(x, "reportDescription", value.asInstanceOf[js.Any])
    
    inline def setReportFrequency(value: ReportFrequency): Self = StObject.set(x, "reportFrequency", value.asInstanceOf[js.Any])
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
  }
}
