package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Database
@js.native
trait DatabaseUser extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var extra: js.UndefOr[js.Object] = js.native
  
  var passwd: js.UndefOr[String] = js.native
  
  var username: String = js.native
}
object DatabaseUser {
  
  @scala.inline
  def apply(username: String): DatabaseUser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUser]
  }
  
  @scala.inline
  implicit class DatabaseUserOps[Self <: DatabaseUser] (val x: Self) extends AnyVal {
    
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setExtra(value: js.Object): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setPasswd(value: String): Self = this.set("passwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswd: Self = this.set("passwd", js.undefined)
  }
}
