package typings.atlassianCrowdClient

import org.scalablytyped.runtime.StringDictionary
import typings.atlassianCrowdClient.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsUserMod {
  
  @JSImport("atlassian-crowd-client/lib/models/user", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with User {
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
      password: String,
      active: Boolean
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: Unit,
      active: Boolean
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: String,
      active: Boolean,
      attributes: Any
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: String,
      active: Unit,
      attributes: Any
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: Unit,
      active: Boolean,
      attributes: Any
    ) = this()
    def this(
      firstname: String,
      lastname: String,
      displayname: String,
      email: String,
      username: String,
      password: Unit,
      active: Unit,
      attributes: Any
    ) = this()
    
    /* CompleteClass */
    override val active: Boolean = js.native
    
    /* CompleteClass */
    override val attributes: StringDictionary[Any] = js.native
    
    /* CompleteClass */
    override val displayname: String = js.native
    
    /* CompleteClass */
    override val email: String = js.native
    
    /* CompleteClass */
    override val firstname: String = js.native
    
    /* CompleteClass */
    override val lastname: String = js.native
    
    /* CompleteClass */
    override def toCrowd(): UserObj = js.native
    
    /* CompleteClass */
    override val username: String = js.native
  }
  @JSImport("atlassian-crowd-client/lib/models/user", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromCrowd(userObj: UserObj): User = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrowd")(userObj.asInstanceOf[js.Any]).asInstanceOf[User]
  
  trait User extends StObject {
    
    val active: Boolean
    
    val attributes: StringDictionary[Any]
    
    val displayname: String
    
    val email: String
    
    val firstname: String
    
    val lastname: String
    
    val password: js.UndefOr[String] = js.undefined
    
    def toCrowd(): UserObj
    
    val username: String
  }
  object User {
    
    inline def apply(
      active: Boolean,
      attributes: StringDictionary[Any],
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
    
    extension [Self <: User](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
      
      inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setToCrowd(value: () => UserObj): Self = StObject.set(x, "toCrowd", js.Any.fromFunction0(value))
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserObj extends StObject {
    
    val active: Boolean
    
    val `display-name`: String
    
    val email: String
    
    val `first-name`: String
    
    val `last-name`: String
    
    val name: String
    
    val password: js.UndefOr[Value] = js.undefined
  }
  object UserObj {
    
    inline def apply(
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
    
    extension [Self <: UserObj](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def `setDisplay-name`(value: String): Self = StObject.set(x, "display-name", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def `setFirst-name`(value: String): Self = StObject.set(x, "first-name", value.asInstanceOf[js.Any])
      
      inline def `setLast-name`(value: String): Self = StObject.set(x, "last-name", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: Value): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    }
  }
}
