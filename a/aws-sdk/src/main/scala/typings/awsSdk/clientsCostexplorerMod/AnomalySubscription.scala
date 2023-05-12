package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalySubscription extends StObject {
  
  /**
    * Your unique account identifier. 
    */
  var AccountId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The frequency that anomaly reports are sent over email. 
    */
  var Frequency: AnomalySubscriptionFrequency
  
  /**
    * A list of cost anomaly monitors. 
    */
  var MonitorArnList: typings.awsSdk.clientsCostexplorerMod.MonitorArnList
  
  /**
    * A list of subscribers to notify. 
    */
  var Subscribers: typings.awsSdk.clientsCostexplorerMod.Subscribers
  
  /**
    * The AnomalySubscription Amazon Resource Name (ARN). 
    */
  var SubscriptionArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The name for the subscription. 
    */
  var SubscriptionName: GenericString
  
  /**
    * (deprecated) The dollar value that triggers a notification if the threshold is exceeded.  This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued use of Threshold will be treated as shorthand syntax for a ThresholdExpression. One of Threshold or ThresholdExpression is required for this resource.
    */
  var Threshold: js.UndefOr[NullableNonNegativeDouble] = js.undefined
  
  /**
    * An Expression object used to specify the anomalies that you want to generate alerts for. This supports dimensions and nested expressions. The supported dimensions are ANOMALY_TOTAL_IMPACT_ABSOLUTE and ANOMALY_TOTAL_IMPACT_PERCENTAGE. The supported nested expression types are AND and OR. The match option GREATER_THAN_OR_EQUAL is required. Values must be numbers between 0 and 10,000,000,000. One of Threshold or ThresholdExpression is required for this resource. The following are examples of valid ThresholdExpressions:   Absolute threshold: { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }    Percentage threshold: { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }     AND two thresholds together: { "And": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }     OR two thresholds together: { "Or": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }   
    */
  var ThresholdExpression: js.UndefOr[Expression] = js.undefined
}
object AnomalySubscription {
  
  inline def apply(
    Frequency: AnomalySubscriptionFrequency,
    MonitorArnList: MonitorArnList,
    Subscribers: Subscribers,
    SubscriptionName: GenericString
  ): AnomalySubscription = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any], MonitorArnList = MonitorArnList.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalySubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnomalySubscription] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: GenericString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setFrequency(value: AnomalySubscriptionFrequency): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnList(value: MonitorArnList): Self = StObject.set(x, "MonitorArnList", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnListVarargs(value: Arn*): Self = StObject.set(x, "MonitorArnList", js.Array(value*))
    
    inline def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value*))
    
    inline def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionArnUndefined: Self = StObject.set(x, "SubscriptionArn", js.undefined)
    
    inline def setSubscriptionName(value: GenericString): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: NullableNonNegativeDouble): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdExpression(value: Expression): Self = StObject.set(x, "ThresholdExpression", value.asInstanceOf[js.Any])
    
    inline def setThresholdExpressionUndefined: Self = StObject.set(x, "ThresholdExpression", js.undefined)
    
    inline def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
  }
}
