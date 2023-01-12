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
  
  var `original-expiration`: js.UndefOr[Any] = js.undefined
  
  var queue: String
  
  var reason: rejected | expired | maxlen
  
  var `routing-keys`: js.Array[String]
  
  var time: _empty
}
object XDeath {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: XDeath] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def `setOriginal-expiration`(value: Any): Self = StObject.set(x, "original-expiration", value.asInstanceOf[js.Any])
    
    inline def `setOriginal-expirationUndefined`: Self = StObject.set(x, "original-expiration", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setReason(value: rejected | expired | maxlen): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def `setRouting-keys`(value: js.Array[String]): Self = StObject.set(x, "routing-keys", value.asInstanceOf[js.Any])
    
    inline def `setRouting-keysVarargs`(value: String*): Self = StObject.set(x, "routing-keys", js.Array(value*))
    
    inline def setTime(value: _empty): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
