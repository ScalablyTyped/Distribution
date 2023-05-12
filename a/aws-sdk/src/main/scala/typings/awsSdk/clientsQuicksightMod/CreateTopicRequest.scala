package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTopicRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that you want to create a topic in.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The definition of a topic to create.
    */
  var Topic: TopicDetails
  
  /**
    * The ID for the topic that you want to create. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var TopicId: typings.awsSdk.clientsQuicksightMod.TopicId
}
object CreateTopicRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, Topic: TopicDetails, TopicId: TopicId): CreateTopicRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Topic = Topic.asInstanceOf[js.Any], TopicId = TopicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTopicRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTopic(value: TopicDetails): Self = StObject.set(x, "Topic", value.asInstanceOf[js.Any])
    
    inline def setTopicId(value: TopicId): Self = StObject.set(x, "TopicId", value.asInstanceOf[js.Any])
  }
}
