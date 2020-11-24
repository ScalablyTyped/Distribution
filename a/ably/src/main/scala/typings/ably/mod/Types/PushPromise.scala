package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushPromise extends js.Object {
  
  var admin: PushAdminPromise = js.native
}
object PushPromise {
  
  @scala.inline
  def apply(admin: PushAdminPromise): PushPromise = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushPromise]
  }
  
  @scala.inline
  implicit class PushPromiseOps[Self <: PushPromise] (val x: Self) extends AnyVal {
    
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
    def setAdmin(value: PushAdminPromise): Self = this.set("admin", value.asInstanceOf[js.Any])
  }
}
