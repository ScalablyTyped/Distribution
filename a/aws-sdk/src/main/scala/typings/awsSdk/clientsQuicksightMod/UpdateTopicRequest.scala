package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTopicRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the topic that you want to update.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The definition of the topic that you want to update.
    */
  var Topic: TopicDetails
  
  /**
    * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var TopicId: typings.awsSdk.clientsQuicksightMod.TopicId
}
object UpdateTopicRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, Topic: TopicDetails, TopicId: TopicId): UpdateTopicRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Topic = Topic.asInstanceOf[js.Any], TopicId = TopicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTopicRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTopicRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicDetails): Self = StObject.set(x, "Topic", value.asInstanceOf[js.Any])
    
    inline def setTopicId(value: TopicId): Self = StObject.set(x, "TopicId", value.asInstanceOf[js.Any])
  }
}
