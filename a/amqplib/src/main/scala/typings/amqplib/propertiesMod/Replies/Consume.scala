package typings.amqplib.propertiesMod.Replies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consume extends js.Object {
  
  var consumerTag: String = js.native
}
object Consume {
  
  @scala.inline
  def apply(consumerTag: String): Consume = {
    val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any])
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
    def setConsumerTag(value: String): Self = this.set("consumerTag", value.asInstanceOf[js.Any])
  }
}
