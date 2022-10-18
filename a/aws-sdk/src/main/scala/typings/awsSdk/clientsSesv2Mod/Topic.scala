package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topic extends StObject {
  
  /**
    * The default subscription status to be applied to a contact if the contact has not noted their preference for subscribing to a topic.
    */
  var DefaultSubscriptionStatus: SubscriptionStatus
  
  /**
    * A description of what the topic is about, which the contact will see.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsSesv2Mod.Description] = js.undefined
  
  /**
    * The name of the topic the contact will see.
    */
  var DisplayName: typings.awsSdk.clientsSesv2Mod.DisplayName
  
  /**
    * The name of the topic.
    */
  var TopicName: typings.awsSdk.clientsSesv2Mod.TopicName
}
object Topic {
  
  inline def apply(DefaultSubscriptionStatus: SubscriptionStatus, DisplayName: DisplayName, TopicName: TopicName): Topic = {
    val __obj = js.Dynamic.literal(DefaultSubscriptionStatus = DefaultSubscriptionStatus.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  
  extension [Self <: Topic](x: Self) {
    
    inline def setDefaultSubscriptionStatus(value: SubscriptionStatus): Self = StObject.set(x, "DefaultSubscriptionStatus", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
  }
}
