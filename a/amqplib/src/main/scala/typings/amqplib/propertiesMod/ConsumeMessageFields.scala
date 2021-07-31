package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumeMessageFields
  extends StObject
     with CommonMessageFields
object ConsumeMessageFields {
  
  @scala.inline
  def apply(deliveryTag: Double, exchange: String, redelivered: Boolean, routingKey: String): ConsumeMessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumeMessageFields]
  }
}
