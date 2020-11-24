package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertQueue extends js.Object {
  
  var arguments: js.UndefOr[js.Any] = js.native
  
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  var deadLetterExchange: js.UndefOr[String] = js.native
  
  var deadLetterRoutingKey: js.UndefOr[String] = js.native
  
  var durable: js.UndefOr[Boolean] = js.native
  
  var exclusive: js.UndefOr[Boolean] = js.native
  
  var expires: js.UndefOr[Double] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var maxPriority: js.UndefOr[Double] = js.native
  
  var messageTtl: js.UndefOr[Double] = js.native
}
object AssertQueue {
  
  @scala.inline
  def apply(): AssertQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertQueue]
  }
  
  @scala.inline
  implicit class AssertQueueOps[Self <: AssertQueue] (val x: Self) extends AnyVal {
    
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
    def setArguments(value: js.Any): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setAutoDelete(value: Boolean): Self = this.set("autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDelete: Self = this.set("autoDelete", js.undefined)
    
    @scala.inline
    def setDeadLetterExchange(value: String): Self = this.set("deadLetterExchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterExchange: Self = this.set("deadLetterExchange", js.undefined)
    
    @scala.inline
    def setDeadLetterRoutingKey(value: String): Self = this.set("deadLetterRoutingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterRoutingKey: Self = this.set("deadLetterRoutingKey", js.undefined)
    
    @scala.inline
    def setDurable(value: Boolean): Self = this.set("durable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurable: Self = this.set("durable", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMaxPriority(value: Double): Self = this.set("maxPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPriority: Self = this.set("maxPriority", js.undefined)
    
    @scala.inline
    def setMessageTtl(value: Double): Self = this.set("messageTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageTtl: Self = this.set("messageTtl", js.undefined)
  }
}
