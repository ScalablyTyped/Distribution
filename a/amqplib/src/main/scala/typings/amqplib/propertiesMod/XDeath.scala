package typings.amqplib.propertiesMod

import typings.amqplib.amqplibStrings.expired
import typings.amqplib.amqplibStrings.maxlen
import typings.amqplib.amqplibStrings.rejected
import typings.amqplib.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDeath extends StObject {
  
  var count: Double
  
  var exchange: String
  
  var `original-expiration`: js.UndefOr[js.Any] = js.undefined
  
  var queue: String
  
  var reason: rejected | expired | maxlen
  
  var `routing-keys`: js.Array[String]
  
  var time: _empty
}
object XDeath {
  
  @scala.inline
  def apply(
    count: Double,
    exchange: String,
    queue: String,
    reason: rejected | expired | maxlen,
    `routing-keys`: js.Array[String],
    time: _empty
  ): XDeath = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("routing-keys")(`routing-keys`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDeath]
  }
  
  @scala.inline
  implicit class XDeathMutableBuilder[Self <: XDeath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOriginal-expiration`(value: js.Any): Self = StObject.set(x, "original-expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOriginal-expirationUndefined`: Self = StObject.set(x, "original-expiration", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: rejected | expired | maxlen): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRouting-keys`(value: js.Array[String]): Self = StObject.set(x, "routing-keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRouting-keysVarargs`(value: String*): Self = StObject.set(x, "routing-keys", js.Array(value :_*))
    
    @scala.inline
    def setTime(value: _empty): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
