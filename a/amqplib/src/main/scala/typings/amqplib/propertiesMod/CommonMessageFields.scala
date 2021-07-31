package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonMessageFields extends StObject {
  
  var deliveryTag: Double
  
  var exchange: String
  
  var redelivered: Boolean
  
  var routingKey: String
}
object CommonMessageFields {
  
  @scala.inline
  def apply(deliveryTag: Double, exchange: String, redelivered: Boolean, routingKey: String): CommonMessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonMessageFields]
  }
  
  @scala.inline
  implicit class CommonMessageFieldsMutableBuilder[Self <: CommonMessageFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryTag(value: Double): Self = StObject.set(x, "deliveryTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedelivered(value: Boolean): Self = StObject.set(x, "redelivered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingKey(value: String): Self = StObject.set(x, "routingKey", value.asInstanceOf[js.Any])
  }
}
