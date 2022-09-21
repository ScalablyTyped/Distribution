package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumeMessageFields
  extends StObject
     with CommonMessageFields {
  
  var consumerTag: String
}
object ConsumeMessageFields {
  
  inline def apply(
    consumerTag: String,
    deliveryTag: Double,
    exchange: String,
    redelivered: Boolean,
    routingKey: String
  ): ConsumeMessageFields = {
    val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any], deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumeMessageFields]
  }
  
  extension [Self <: ConsumeMessageFields](x: Self) {
    
    inline def setConsumerTag(value: String): Self = StObject.set(x, "consumerTag", value.asInstanceOf[js.Any])
  }
}
