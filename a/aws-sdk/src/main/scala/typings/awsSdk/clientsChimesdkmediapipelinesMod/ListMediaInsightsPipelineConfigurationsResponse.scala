package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMediaInsightsPipelineConfigurationsResponse extends StObject {
  
  /**
    * The requested list of media insights pipeline configurations.
    */
  var MediaInsightsPipelineConfigurations: js.UndefOr[MediaInsightsPipelineConfigurationSummaryList] = js.undefined
  
  /**
    * The token used to return the next page of results. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListMediaInsightsPipelineConfigurationsResponse {
  
  inline def apply(): ListMediaInsightsPipelineConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMediaInsightsPipelineConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMediaInsightsPipelineConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setMediaInsightsPipelineConfigurations(value: MediaInsightsPipelineConfigurationSummaryList): Self = StObject.set(x, "MediaInsightsPipelineConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationsUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfigurations", js.undefined)
    
    inline def setMediaInsightsPipelineConfigurationsVarargs(value: MediaInsightsPipelineConfigurationSummary*): Self = StObject.set(x, "MediaInsightsPipelineConfigurations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
