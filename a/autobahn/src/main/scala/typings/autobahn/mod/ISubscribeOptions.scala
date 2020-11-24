package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubscribeOptions extends js.Object {
  
  var get_retained: js.UndefOr[Boolean] = js.native
  
  var `match`: js.UndefOr[String] = js.native
}
object ISubscribeOptions {
  
  @scala.inline
  def apply(): ISubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscribeOptions]
  }
  
  @scala.inline
  implicit class ISubscribeOptionsOps[Self <: ISubscribeOptions] (val x: Self) extends AnyVal {
    
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
    def setGet_retained(value: Boolean): Self = this.set("get_retained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet_retained: Self = this.set("get_retained", js.undefined)
    
    @scala.inline
    def setMatch(value: String): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
}
