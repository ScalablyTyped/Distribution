package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageFields
  extends StObject
     with CommonMessageFields {
  
  var consumerTag: js.UndefOr[String] = js.undefined
  
  var messageCount: js.UndefOr[Double] = js.undefined
}
object MessageFields {
  
  @scala.inline
  def apply(deliveryTag: Double, exchange: String, redelivered: Boolean, routingKey: String): MessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFields]
  }
  
  @scala.inline
  implicit class MessageFieldsMutableBuilder[Self <: MessageFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerTag(value: String): Self = StObject.set(x, "consumerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerTagUndefined: Self = StObject.set(x, "consumerTag", js.undefined)
    
    @scala.inline
    def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageCountUndefined: Self = StObject.set(x, "messageCount", js.undefined)
  }
}
