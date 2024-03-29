package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTopicInput extends StObject {
  
  /**
    * The ARN of the topic you want to delete.
    */
  var TopicArn: topicARN
}
object DeleteTopicInput {
  
  inline def apply(TopicArn: topicARN): DeleteTopicInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTopicInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTopicInput] (val x: Self) extends AnyVal {
    
    inline def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
