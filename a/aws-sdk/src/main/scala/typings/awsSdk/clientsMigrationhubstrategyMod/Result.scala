package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  /**
    * The error in server analysis.
    */
  var analysisStatus: js.UndefOr[AnalysisStatusUnion] = js.undefined
  
  /**
    * The error in server analysis.
    */
  var analysisType: js.UndefOr[AnalysisType] = js.undefined
  
  /**
    * The error in server analysis.
    */
  var antipatternReportResultList: js.UndefOr[AntipatternReportResultList] = js.undefined
  
  /**
    * The error in server analysis.
    */
  var statusMessage: js.UndefOr[StatusMessage] = js.undefined
}
object Result {
  
  inline def apply(): Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    inline def setAnalysisStatus(value: AnalysisStatusUnion): Self = StObject.set(x, "analysisStatus", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStatusUndefined: Self = StObject.set(x, "analysisStatus", js.undefined)
    
    inline def setAnalysisType(value: AnalysisType): Self = StObject.set(x, "analysisType", value.asInstanceOf[js.Any])
    
    inline def setAnalysisTypeUndefined: Self = StObject.set(x, "analysisType", js.undefined)
    
    inline def setAntipatternReportResultList(value: AntipatternReportResultList): Self = StObject.set(x, "antipatternReportResultList", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportResultListUndefined: Self = StObject.set(x, "antipatternReportResultList", js.undefined)
    
    inline def setAntipatternReportResultListVarargs(value: AntipatternReportResult*): Self = StObject.set(x, "antipatternReportResultList", js.Array(value*))
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
