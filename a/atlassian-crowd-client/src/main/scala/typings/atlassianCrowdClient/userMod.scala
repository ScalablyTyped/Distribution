package typings.atlassianCrowdClient

import org.scalablytyped.runtime.StringDictionary
import typings.atlassianCrowdClient.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  @JSImport("atlassian-crowd-client/lib/models/user", JSImport.Namespace)
  @js.native
  class ^ protected () extends User {
    def this(firstname: String, lastname: String, displayname: String, email: String, username: String) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: String
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: js.UndefOr[scala.Nothing],
      active: Boolean
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: String,
      active: Boolean
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: js.UndefOr[scala.Nothing],
      active: js.UndefOr[scala.Nothing],
      attributes: js.Any
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: js.UndefOr[scala.Nothing],
      active: Boolean,
      attributes: js.Any
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: String,
      active: js.UndefOr[scala.Nothing],
      attributes: js.Any
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: String,
      active: Boolean,
      attributes: js.Any
    ) = this()
  }
  
  /* static member */
  @JSImport("atlassian-crowd-client/lib/models/user", "fromCrowd")
  @js.native
  def fromCrowd(userObj: UserObj): User = js.native
  
  @js.native
  trait User extends StObject {
    
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
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setToCrowd(value: () => UserObj): Self = StObject.set(x, "toCrowd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserObj extends StObject {
    
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
    implicit class UserObjMutableBuilder[Self <: UserObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDisplay-name`(value: String): Self = StObject.set(x, "display-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFirst-name`(value: String): Self = StObject.set(x, "first-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLast-name`(value: String): Self = StObject.set(x, "last-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: Value): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    }
  }
}
