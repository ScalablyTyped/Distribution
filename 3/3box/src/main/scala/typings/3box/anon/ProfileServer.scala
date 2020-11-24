package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileServer extends js.Object {
  
  var profileServer: js.UndefOr[String] = js.native
}
object ProfileServer {
  
  @scala.inline
  def apply(): ProfileServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileServer]
  }
  
  @scala.inline
  implicit class ProfileServerOps[Self <: ProfileServer] (val x: Self) extends AnyVal {
    
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
    def setProfileServer(value: String): Self = this.set("profileServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileServer: Self = this.set("profileServer", js.undefined)
  }
}
