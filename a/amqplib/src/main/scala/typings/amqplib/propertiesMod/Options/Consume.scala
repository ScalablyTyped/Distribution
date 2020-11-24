package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consume extends js.Object {
  
  var arguments: js.UndefOr[js.Any] = js.native
  
  var consumerTag: js.UndefOr[String] = js.native
  
  var exclusive: js.UndefOr[Boolean] = js.native
  
  var noAck: js.UndefOr[Boolean] = js.native
  
  var noLocal: js.UndefOr[Boolean] = js.native
  
  var priority: js.UndefOr[Double] = js.native
}
object Consume {
  
  @scala.inline
  def apply(): Consume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Consume]
  }
  
  @scala.inline
  implicit class ConsumeOps[Self <: Consume] (val x: Self) extends AnyVal {
    
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
    def setConsumerTag(value: String): Self = this.set("consumerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerTag: Self = this.set("consumerTag", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setNoAck(value: Boolean): Self = this.set("noAck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAck: Self = this.set("noAck", js.undefined)
    
    @scala.inline
    def setNoLocal(value: Boolean): Self = this.set("noLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoLocal: Self = this.set("noLocal", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
