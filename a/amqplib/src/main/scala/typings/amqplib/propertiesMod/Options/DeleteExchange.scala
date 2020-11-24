package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteExchange extends js.Object {
  
  var ifUnused: js.UndefOr[Boolean] = js.native
}
object DeleteExchange {
  
  @scala.inline
  def apply(): DeleteExchange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteExchange]
  }
  
  @scala.inline
  implicit class DeleteExchangeOps[Self <: DeleteExchange] (val x: Self) extends AnyVal {
    
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
    def setIfUnused(value: Boolean): Self = this.set("ifUnused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfUnused: Self = this.set("ifUnused", js.undefined)
  }
}
