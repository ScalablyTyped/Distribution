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
    * The dollar value that triggers a notification if the threshold is exceeded. 
    */
  var Threshold: NullableNonNegativeDouble
}
object AnomalySubscription {
  
  inline def apply(
    Frequency: AnomalySubscriptionFrequency,
    MonitorArnList: MonitorArnList,
    Subscribers: Subscribers,
    SubscriptionName: GenericString,
    Threshold: NullableNonNegativeDouble
  ): AnomalySubscription = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any], MonitorArnList = MonitorArnList.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
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
  }
}
