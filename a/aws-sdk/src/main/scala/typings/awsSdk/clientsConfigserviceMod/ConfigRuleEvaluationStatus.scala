package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRuleEvaluationStatus extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Config rule.
    */
  var ConfigRuleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Config rule.
    */
  var ConfigRuleId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigRuleName] = js.undefined
  
  /**
    * The time that you first activated the Config rule.
    */
  var FirstActivatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether Config has evaluated your resources against the rule at least once.    true - Config has evaluated your Amazon Web Services resources against the rule at least once.    false - Config has not finished evaluating your Amazon Web Services resources against the rule at least once.  
    */
  var FirstEvaluationStarted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time that you last turned off the Config rule.
    */
  var LastDeactivatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the last attempted delivery of a debug log for your Config Custom Policy rules. Either Successful or Failed.
    */
  var LastDebugLogDeliveryStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The reason Config was not able to deliver a debug log. This is for the last failed attempt to retrieve a debug log for your Config Custom Policy rules.
    */
  var LastDebugLogDeliveryStatusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The time Config last attempted to deliver a debug log for your Config Custom Policy rules.
    */
  var LastDebugLogDeliveryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The error code that Config returned when the rule last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The error message that Config returned when the rule last failed.
    */
  var LastErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The time that Config last failed to evaluate your Amazon Web Services resources against the rule.
    */
  var LastFailedEvaluationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that Config last failed to invoke the Config rule to evaluate your Amazon Web Services resources.
    */
  var LastFailedInvocationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that Config last successfully evaluated your Amazon Web Services resources against the rule.
    */
  var LastSuccessfulEvaluationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that Config last successfully invoked the Config rule to evaluate your Amazon Web Services resources.
    */
  var LastSuccessfulInvocationTime: js.UndefOr[js.Date] = js.undefined
}
object ConfigRuleEvaluationStatus {
  
  inline def apply(): ConfigRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRuleEvaluationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigRuleEvaluationStatus] (val x: Self) extends AnyVal {
    
    inline def setConfigRuleArn(value: String): Self = StObject.set(x, "ConfigRuleArn", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleArnUndefined: Self = StObject.set(x, "ConfigRuleArn", js.undefined)
    
    inline def setConfigRuleId(value: String): Self = StObject.set(x, "ConfigRuleId", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleIdUndefined: Self = StObject.set(x, "ConfigRuleId", js.undefined)
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
    
    inline def setFirstActivatedTime(value: js.Date): Self = StObject.set(x, "FirstActivatedTime", value.asInstanceOf[js.Any])
    
    inline def setFirstActivatedTimeUndefined: Self = StObject.set(x, "FirstActivatedTime", js.undefined)
    
    inline def setFirstEvaluationStarted(value: Boolean): Self = StObject.set(x, "FirstEvaluationStarted", value.asInstanceOf[js.Any])
    
    inline def setFirstEvaluationStartedUndefined: Self = StObject.set(x, "FirstEvaluationStarted", js.undefined)
    
    inline def setLastDeactivatedTime(value: js.Date): Self = StObject.set(x, "LastDeactivatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastDeactivatedTimeUndefined: Self = StObject.set(x, "LastDeactivatedTime", js.undefined)
    
    inline def setLastDebugLogDeliveryStatus(value: String): Self = StObject.set(x, "LastDebugLogDeliveryStatus", value.asInstanceOf[js.Any])
    
    inline def setLastDebugLogDeliveryStatusReason(value: String): Self = StObject.set(x, "LastDebugLogDeliveryStatusReason", value.asInstanceOf[js.Any])
    
    inline def setLastDebugLogDeliveryStatusReasonUndefined: Self = StObject.set(x, "LastDebugLogDeliveryStatusReason", js.undefined)
    
    inline def setLastDebugLogDeliveryStatusUndefined: Self = StObject.set(x, "LastDebugLogDeliveryStatus", js.undefined)
    
    inline def setLastDebugLogDeliveryTime(value: js.Date): Self = StObject.set(x, "LastDebugLogDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setLastDebugLogDeliveryTimeUndefined: Self = StObject.set(x, "LastDebugLogDeliveryTime", js.undefined)
    
    inline def setLastErrorCode(value: String): Self = StObject.set(x, "LastErrorCode", value.asInstanceOf[js.Any])
    
    inline def setLastErrorCodeUndefined: Self = StObject.set(x, "LastErrorCode", js.undefined)
    
    inline def setLastErrorMessage(value: String): Self = StObject.set(x, "LastErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setLastErrorMessageUndefined: Self = StObject.set(x, "LastErrorMessage", js.undefined)
    
    inline def setLastFailedEvaluationTime(value: js.Date): Self = StObject.set(x, "LastFailedEvaluationTime", value.asInstanceOf[js.Any])
    
    inline def setLastFailedEvaluationTimeUndefined: Self = StObject.set(x, "LastFailedEvaluationTime", js.undefined)
    
    inline def setLastFailedInvocationTime(value: js.Date): Self = StObject.set(x, "LastFailedInvocationTime", value.asInstanceOf[js.Any])
    
    inline def setLastFailedInvocationTimeUndefined: Self = StObject.set(x, "LastFailedInvocationTime", js.undefined)
    
    inline def setLastSuccessfulEvaluationTime(value: js.Date): Self = StObject.set(x, "LastSuccessfulEvaluationTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulEvaluationTimeUndefined: Self = StObject.set(x, "LastSuccessfulEvaluationTime", js.undefined)
    
    inline def setLastSuccessfulInvocationTime(value: js.Date): Self = StObject.set(x, "LastSuccessfulInvocationTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulInvocationTimeUndefined: Self = StObject.set(x, "LastSuccessfulInvocationTime", js.undefined)
  }
}
