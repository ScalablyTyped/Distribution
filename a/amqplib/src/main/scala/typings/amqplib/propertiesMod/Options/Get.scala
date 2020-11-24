package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends js.Object {
  
  var noAck: js.UndefOr[Boolean] = js.native
}
object Get {
  
  @scala.inline
  def apply(): Get = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Get]
  }
  
  @scala.inline
  implicit class GetOps[Self <: Get] (val x: Self) extends AnyVal {
    
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
    def setNoAck(value: Boolean): Self = this.set("noAck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAck: Self = this.set("noAck", js.undefined)
  }
}
