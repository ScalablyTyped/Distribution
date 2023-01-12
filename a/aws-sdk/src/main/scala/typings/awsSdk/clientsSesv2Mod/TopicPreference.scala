package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicPreference extends StObject {
  
  /**
    * The contact's subscription status to a topic which is either OPT_IN or OPT_OUT.
    */
  var SubscriptionStatus: typings.awsSdk.clientsSesv2Mod.SubscriptionStatus
  
  /**
    * The name of the topic.
    */
  var TopicName: typings.awsSdk.clientsSesv2Mod.TopicName
}
object TopicPreference {
  
  inline def apply(SubscriptionStatus: SubscriptionStatus, TopicName: TopicName): TopicPreference = {
    val __obj = js.Dynamic.literal(SubscriptionStatus = SubscriptionStatus.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicPreference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicPreference] (val x: Self) extends AnyVal {
    
    inline def setSubscriptionStatus(value: SubscriptionStatus): Self = StObject.set(x, "SubscriptionStatus", value.asInstanceOf[js.Any])
    
    inline def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
  }
}
