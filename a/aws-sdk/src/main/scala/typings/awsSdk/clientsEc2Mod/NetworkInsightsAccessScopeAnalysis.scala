package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInsightsAccessScopeAnalysis extends StObject {
  
  /**
    * The number of network interfaces analyzed.
    */
  var AnalyzedEniCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The analysis end date.
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether there are findings.
    */
  var FindingsFound: js.UndefOr[typings.awsSdk.clientsEc2Mod.FindingsFound] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Network Access Scope analysis.
    */
  var NetworkInsightsAccessScopeAnalysisArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the Network Access Scope analysis.
    */
  var NetworkInsightsAccessScopeAnalysisId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeAnalysisId] = js.undefined
  
  /**
    * The ID of the Network Access Scope.
    */
  var NetworkInsightsAccessScopeId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeId] = js.undefined
  
  /**
    * The analysis start date.
    */
  var StartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[AnalysisStatus] = js.undefined
  
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The warning message.
    */
  var WarningMessage: js.UndefOr[String] = js.undefined
}
object NetworkInsightsAccessScopeAnalysis {
  
  inline def apply(): NetworkInsightsAccessScopeAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInsightsAccessScopeAnalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkInsightsAccessScopeAnalysis] (val x: Self) extends AnyVal {
    
    inline def setAnalyzedEniCount(value: Integer): Self = StObject.set(x, "AnalyzedEniCount", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedEniCountUndefined: Self = StObject.set(x, "AnalyzedEniCount", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setFindingsFound(value: FindingsFound): Self = StObject.set(x, "FindingsFound", value.asInstanceOf[js.Any])
    
    inline def setFindingsFoundUndefined: Self = StObject.set(x, "FindingsFound", js.undefined)
    
    inline def setNetworkInsightsAccessScopeAnalysisArn(value: ResourceArn): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeAnalysisArnUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisArn", js.undefined)
    
    inline def setNetworkInsightsAccessScopeAnalysisId(value: NetworkInsightsAccessScopeAnalysisId): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeAnalysisIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", js.undefined)
    
    inline def setNetworkInsightsAccessScopeId(value: NetworkInsightsAccessScopeId): Self = StObject.set(x, "NetworkInsightsAccessScopeId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeId", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setStatus(value: AnalysisStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setWarningMessage(value: String): Self = StObject.set(x, "WarningMessage", value.asInstanceOf[js.Any])
    
    inline def setWarningMessageUndefined: Self = StObject.set(x, "WarningMessage", js.undefined)
  }
}
