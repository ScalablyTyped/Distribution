package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSummary extends StObject {
  
  /**
    * The ID of the analysis. This ID displays in the URL.
    */
  var AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the analysis.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The time that the analysis was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the analysis was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the analysis. This name is displayed in the Amazon QuickSight console. 
    */
  var Name: js.UndefOr[AnalysisName] = js.undefined
  
  /**
    * The last known status for the analysis.
    */
  var Status: js.UndefOr[ResourceStatus] = js.undefined
}
object AnalysisSummary {
  
  inline def apply(): AnalysisSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisSummary]
  }
  
  extension [Self <: AnalysisSummary](x: Self) {
    
    inline def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAnalysisIdUndefined: Self = StObject.set(x, "AnalysisId", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: AnalysisName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
