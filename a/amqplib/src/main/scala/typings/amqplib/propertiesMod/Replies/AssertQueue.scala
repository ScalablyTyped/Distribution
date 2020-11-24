package typings.amqplib.propertiesMod.Replies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertQueue extends js.Object {
  
  var consumerCount: Double = js.native
  
  var messageCount: Double = js.native
  
  var queue: String = js.native
}
object AssertQueue {
  
  @scala.inline
  def apply(consumerCount: Double, messageCount: Double, queue: String): AssertQueue = {
    val __obj = js.Dynamic.literal(consumerCount = consumerCount.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
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
    def setConsumerCount(value: Double): Self = this.set("consumerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageCount(value: Double): Self = this.set("messageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
  }
}
