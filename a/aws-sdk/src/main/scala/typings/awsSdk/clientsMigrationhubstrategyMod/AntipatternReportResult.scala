package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntipatternReportResult extends StObject {
  
  /**
    * The analyzer name.
    */
  var analyzerName: js.UndefOr[AnalyzerNameUnion] = js.undefined
  
  var antiPatternReportS3Object: js.UndefOr[S3Object] = js.undefined
  
  /**
    * The status of the anti-pattern report generation.
    */
  var antipatternReportStatus: js.UndefOr[AntipatternReportStatus] = js.undefined
  
  /**
    * The status message for the anti-pattern.
    */
  var antipatternReportStatusMessage: js.UndefOr[StatusMessage] = js.undefined
}
object AntipatternReportResult {
  
  inline def apply(): AntipatternReportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntipatternReportResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AntipatternReportResult] (val x: Self) extends AnyVal {
    
    inline def setAnalyzerName(value: AnalyzerNameUnion): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerNameUndefined: Self = StObject.set(x, "analyzerName", js.undefined)
    
    inline def setAntiPatternReportS3Object(value: S3Object): Self = StObject.set(x, "antiPatternReportS3Object", value.asInstanceOf[js.Any])
    
    inline def setAntiPatternReportS3ObjectUndefined: Self = StObject.set(x, "antiPatternReportS3Object", js.undefined)
    
    inline def setAntipatternReportStatus(value: AntipatternReportStatus): Self = StObject.set(x, "antipatternReportStatus", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportStatusMessage(value: StatusMessage): Self = StObject.set(x, "antipatternReportStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportStatusMessageUndefined: Self = StObject.set(x, "antipatternReportStatusMessage", js.undefined)
    
    inline def setAntipatternReportStatusUndefined: Self = StObject.set(x, "antipatternReportStatus", js.undefined)
  }
}
