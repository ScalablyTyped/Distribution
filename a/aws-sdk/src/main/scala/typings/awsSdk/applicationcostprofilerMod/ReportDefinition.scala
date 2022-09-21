package typings.awsSdk.applicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportDefinition extends StObject {
  
  /**
    * Timestamp (milliseconds) when this report definition was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The location in Amazon Simple Storage Service (Amazon S3) the reports should be saved to.
    */
  var destinationS3Location: js.UndefOr[S3Location] = js.undefined
  
  /**
    * The format used for the generated reports.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Timestamp (milliseconds) when this report definition was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Description of the report
    */
  var reportDescription: js.UndefOr[ReportDescription] = js.undefined
  
  /**
    * The cadence at which the report is generated.
    */
  var reportFrequency: js.UndefOr[ReportFrequency] = js.undefined
  
  /**
    * The ID of the report.
    */
  var reportId: js.UndefOr[ReportId] = js.undefined
}
object ReportDefinition {
  
  inline def apply(): ReportDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportDefinition]
  }
  
  extension [Self <: ReportDefinition](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDestinationS3Location(value: S3Location): Self = StObject.set(x, "destinationS3Location", value.asInstanceOf[js.Any])
    
    inline def setDestinationS3LocationUndefined: Self = StObject.set(x, "destinationS3Location", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setReportDescription(value: ReportDescription): Self = StObject.set(x, "reportDescription", value.asInstanceOf[js.Any])
    
    inline def setReportDescriptionUndefined: Self = StObject.set(x, "reportDescription", js.undefined)
    
    inline def setReportFrequency(value: ReportFrequency): Self = StObject.set(x, "reportFrequency", value.asInstanceOf[js.Any])
    
    inline def setReportFrequencyUndefined: Self = StObject.set(x, "reportFrequency", js.undefined)
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
