package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnomalySubscriptionRequest extends StObject {
  
  /**
    * The update to the frequency value that subscribers receive notifications. 
    */
  var Frequency: js.UndefOr[AnomalySubscriptionFrequency] = js.undefined
  
  /**
    * A list of cost anomaly monitor ARNs. 
    */
  var MonitorArnList: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.MonitorArnList] = js.undefined
  
  /**
    * The update to the subscriber list. 
    */
  var Subscribers: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.Subscribers] = js.undefined
  
  /**
    * A cost anomaly subscription Amazon Resource Name (ARN). 
    */
  var SubscriptionArn: GenericString
  
  /**
    * The new name of the subscription. 
    */
  var SubscriptionName: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The update to the threshold value for receiving notifications. 
    */
  var Threshold: js.UndefOr[NullableNonNegativeDouble] = js.undefined
}
object UpdateAnomalySubscriptionRequest {
  
  inline def apply(SubscriptionArn: GenericString): UpdateAnomalySubscriptionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalySubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAnomalySubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setFrequency(value: AnomalySubscriptionFrequency): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    inline def setMonitorArnList(value: MonitorArnList): Self = StObject.set(x, "MonitorArnList", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnListUndefined: Self = StObject.set(x, "MonitorArnList", js.undefined)
    
    inline def setMonitorArnListVarargs(value: Arn*): Self = StObject.set(x, "MonitorArnList", js.Array(value*))
    
    inline def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersUndefined: Self = StObject.set(x, "Subscribers", js.undefined)
    
    inline def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value*))
    
    inline def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionName(value: GenericString): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNameUndefined: Self = StObject.set(x, "SubscriptionName", js.undefined)
    
    inline def setThreshold(value: NullableNonNegativeDouble): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
  }
}
