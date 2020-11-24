package typings.atlassianCrowdClient.userMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  val active: Boolean = js.native
  
  val attributes: StringDictionary[js.Any] = js.native
  
  val displayname: String = js.native
  
  val email: String = js.native
  
  val firstname: String = js.native
  
  val lastname: String = js.native
  
  val password: js.UndefOr[String] = js.native
  
  def toCrowd(): UserObj = js.native
  
  val username: String = js.native
}
object User {
  
  @scala.inline
  def apply(
    active: Boolean,
    attributes: StringDictionary[js.Any],
    displayname: String,
    email: String,
    firstname: String,
    lastname: String,
    toCrowd: () => UserObj,
    username: String
  ): User = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], displayname = displayname.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstname = firstname.asInstanceOf[js.Any], lastname = lastname.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd), username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[js.Any]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayname(value: String): Self = this.set("displayname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstname(value: String): Self = this.set("firstname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastname(value: String): Self = this.set("lastname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCrowd(value: () => UserObj): Self = this.set("toCrowd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
}
