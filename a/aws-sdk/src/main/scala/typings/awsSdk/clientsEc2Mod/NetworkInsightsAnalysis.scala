package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInsightsAnalysis extends StObject {
  
  /**
    * The member accounts that contain resources that the path can traverse.
    */
  var AdditionalAccounts: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * Potential intermediate components.
    */
  var AlternatePathHints: js.UndefOr[AlternatePathHintList] = js.undefined
  
  /**
    * The explanations. For more information, see Reachability Analyzer explanation codes.
    */
  var Explanations: js.UndefOr[ExplanationList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the resources that the path must traverse.
    */
  var FilterInArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The components in the path from source to destination.
    */
  var ForwardPathComponents: js.UndefOr[PathComponentList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network insights analysis.
    */
  var NetworkInsightsAnalysisArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the network insights analysis.
    */
  var NetworkInsightsAnalysisId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAnalysisId] = js.undefined
  
  /**
    * The ID of the path.
    */
  var NetworkInsightsPathId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsPathId] = js.undefined
  
  /**
    * Indicates whether the destination is reachable from the source.
    */
  var NetworkPathFound: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The components in the path from destination to source.
    */
  var ReturnPathComponents: js.UndefOr[PathComponentList] = js.undefined
  
  /**
    * The time the analysis started.
    */
  var StartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the network insights analysis.
    */
  var Status: js.UndefOr[AnalysisStatus] = js.undefined
  
  /**
    * The status message, if the status is failed.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Potential intermediate accounts.
    */
  var SuggestedAccounts: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The warning message.
    */
  var WarningMessage: js.UndefOr[String] = js.undefined
}
object NetworkInsightsAnalysis {
  
  inline def apply(): NetworkInsightsAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInsightsAnalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkInsightsAnalysis] (val x: Self) extends AnyVal {
    
    inline def setAdditionalAccounts(value: ValueStringList): Self = StObject.set(x, "AdditionalAccounts", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAccountsUndefined: Self = StObject.set(x, "AdditionalAccounts", js.undefined)
    
    inline def setAdditionalAccountsVarargs(value: String*): Self = StObject.set(x, "AdditionalAccounts", js.Array(value*))
    
    inline def setAlternatePathHints(value: AlternatePathHintList): Self = StObject.set(x, "AlternatePathHints", value.asInstanceOf[js.Any])
    
    inline def setAlternatePathHintsUndefined: Self = StObject.set(x, "AlternatePathHints", js.undefined)
    
    inline def setAlternatePathHintsVarargs(value: AlternatePathHint*): Self = StObject.set(x, "AlternatePathHints", js.Array(value*))
    
    inline def setExplanations(value: ExplanationList): Self = StObject.set(x, "Explanations", value.asInstanceOf[js.Any])
    
    inline def setExplanationsUndefined: Self = StObject.set(x, "Explanations", js.undefined)
    
    inline def setExplanationsVarargs(value: Explanation*): Self = StObject.set(x, "Explanations", js.Array(value*))
    
    inline def setFilterInArns(value: ArnList): Self = StObject.set(x, "FilterInArns", value.asInstanceOf[js.Any])
    
    inline def setFilterInArnsUndefined: Self = StObject.set(x, "FilterInArns", js.undefined)
    
    inline def setFilterInArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "FilterInArns", js.Array(value*))
    
    inline def setForwardPathComponents(value: PathComponentList): Self = StObject.set(x, "ForwardPathComponents", value.asInstanceOf[js.Any])
    
    inline def setForwardPathComponentsUndefined: Self = StObject.set(x, "ForwardPathComponents", js.undefined)
    
    inline def setForwardPathComponentsVarargs(value: PathComponent*): Self = StObject.set(x, "ForwardPathComponents", js.Array(value*))
    
    inline def setNetworkInsightsAnalysisArn(value: ResourceArn): Self = StObject.set(x, "NetworkInsightsAnalysisArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAnalysisArnUndefined: Self = StObject.set(x, "NetworkInsightsAnalysisArn", js.undefined)
    
    inline def setNetworkInsightsAnalysisId(value: NetworkInsightsAnalysisId): Self = StObject.set(x, "NetworkInsightsAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAnalysisIdUndefined: Self = StObject.set(x, "NetworkInsightsAnalysisId", js.undefined)
    
    inline def setNetworkInsightsPathId(value: NetworkInsightsPathId): Self = StObject.set(x, "NetworkInsightsPathId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsPathIdUndefined: Self = StObject.set(x, "NetworkInsightsPathId", js.undefined)
    
    inline def setNetworkPathFound(value: Boolean): Self = StObject.set(x, "NetworkPathFound", value.asInstanceOf[js.Any])
    
    inline def setNetworkPathFoundUndefined: Self = StObject.set(x, "NetworkPathFound", js.undefined)
    
    inline def setReturnPathComponents(value: PathComponentList): Self = StObject.set(x, "ReturnPathComponents", value.asInstanceOf[js.Any])
    
    inline def setReturnPathComponentsUndefined: Self = StObject.set(x, "ReturnPathComponents", js.undefined)
    
    inline def setReturnPathComponentsVarargs(value: PathComponent*): Self = StObject.set(x, "ReturnPathComponents", js.Array(value*))
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setStatus(value: AnalysisStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSuggestedAccounts(value: ValueStringList): Self = StObject.set(x, "SuggestedAccounts", value.asInstanceOf[js.Any])
    
    inline def setSuggestedAccountsUndefined: Self = StObject.set(x, "SuggestedAccounts", js.undefined)
    
    inline def setSuggestedAccountsVarargs(value: String*): Self = StObject.set(x, "SuggestedAccounts", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setWarningMessage(value: String): Self = StObject.set(x, "WarningMessage", value.asInstanceOf[js.Any])
    
    inline def setWarningMessageUndefined: Self = StObject.set(x, "WarningMessage", js.undefined)
  }
}
