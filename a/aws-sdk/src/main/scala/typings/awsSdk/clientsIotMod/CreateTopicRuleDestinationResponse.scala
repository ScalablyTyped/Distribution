package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTopicRuleDestinationResponse extends StObject {
  
  /**
    * The topic rule destination.
    */
  var topicRuleDestination: js.UndefOr[TopicRuleDestination] = js.undefined
}
object CreateTopicRuleDestinationResponse {
  
  inline def apply(): CreateTopicRuleDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicRuleDestinationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTopicRuleDestinationResponse] (val x: Self) extends AnyVal {
    
    inline def setTopicRuleDestination(value: TopicRuleDestination): Self = StObject.set(x, "topicRuleDestination", value.asInstanceOf[js.Any])
    
    inline def setTopicRuleDestinationUndefined: Self = StObject.set(x, "topicRuleDestination", js.undefined)
  }
}
