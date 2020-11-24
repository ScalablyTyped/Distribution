package typings.amqplib.propertiesMod

import typings.amqplib.amqplibStrings.expired
import typings.amqplib.amqplibStrings.maxlen
import typings.amqplib.amqplibStrings.rejected
import typings.amqplib.anon._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDeath extends js.Object {
  
  var count: Double = js.native
  
  var exchange: String = js.native
  
  var `original-expiration`: js.UndefOr[js.Any] = js.native
  
  var queue: String = js.native
  
  var reason: rejected | expired | maxlen = js.native
  
  var `routing-keys`: js.Array[String] = js.native
  
  var time: _empty = js.native
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
  implicit class XDeathOps[Self <: XDeath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: rejected | expired | maxlen): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRouting-keysVarargs`(value: String*): Self = this.set("routing-keys", js.Array(value :_*))
    
    @scala.inline
    def `setRouting-keys`(value: js.Array[String]): Self = this.set("routing-keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: _empty): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOriginal-expiration`(value: js.Any): Self = this.set("original-expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOriginal-expiration`: Self = this.set("original-expiration", js.undefined)
  }
}
