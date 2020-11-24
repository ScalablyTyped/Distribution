package typings.atlassianCrowdClient.userMod

import typings.atlassianCrowdClient.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserObj extends js.Object {
  
  val active: Boolean = js.native
  
  val `display-name`: String = js.native
  
  val email: String = js.native
  
  val `first-name`: String = js.native
  
  val `last-name`: String = js.native
  
  val name: String = js.native
  
  val password: js.UndefOr[Value] = js.native
}
object UserObj {
  
  @scala.inline
  def apply(
    active: Boolean,
    `display-name`: String,
    email: String,
    `first-name`: String,
    `last-name`: String,
    name: String
  ): UserObj = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("display-name")(`display-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("first-name")(`first-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("last-name")(`last-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserObj]
  }
  
  @scala.inline
  implicit class UserObjOps[Self <: UserObj] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDisplay-name`(value: String): Self = this.set("display-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFirst-name`(value: String): Self = this.set("first-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLast-name`(value: String): Self = this.set("last-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Value): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
}
