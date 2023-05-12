package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealTimeAlertRule extends StObject {
  
  /**
    * Specifies the issue detection settings for a real-time alert rule.
    */
  var IssueDetectionConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.IssueDetectionConfiguration] = js.undefined
  
  /**
    * Specifies the settings for matching the keywords in a real-time alert rule.
    */
  var KeywordMatchConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.KeywordMatchConfiguration] = js.undefined
  
  /**
    * Specifies the settings for predicting sentiment in a real-time alert rule.
    */
  var SentimentConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.SentimentConfiguration] = js.undefined
  
  /**
    * The type of alert rule.
    */
  var Type: RealTimeAlertRuleType
}
object RealTimeAlertRule {
  
  inline def apply(Type: RealTimeAlertRuleType): RealTimeAlertRule = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealTimeAlertRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RealTimeAlertRule] (val x: Self) extends AnyVal {
    
    inline def setIssueDetectionConfiguration(value: IssueDetectionConfiguration): Self = StObject.set(x, "IssueDetectionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIssueDetectionConfigurationUndefined: Self = StObject.set(x, "IssueDetectionConfiguration", js.undefined)
    
    inline def setKeywordMatchConfiguration(value: KeywordMatchConfiguration): Self = StObject.set(x, "KeywordMatchConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKeywordMatchConfigurationUndefined: Self = StObject.set(x, "KeywordMatchConfiguration", js.undefined)
    
    inline def setSentimentConfiguration(value: SentimentConfiguration): Self = StObject.set(x, "SentimentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSentimentConfigurationUndefined: Self = StObject.set(x, "SentimentConfiguration", js.undefined)
    
    inline def setType(value: RealTimeAlertRuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
