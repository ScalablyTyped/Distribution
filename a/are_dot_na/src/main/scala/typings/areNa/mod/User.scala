package typings.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Users are representations of any account on Arena.
  * Users can have channels, followers, blocks and they can also follow both channels and users.
  */
trait User extends StObject {
  
  /**
    * The gravatar URL to the user's avatar
    */
  var avatar: String
  
  /**
    * The number of channels the user owns or is a collaborator on
    */
  var channel_count: Double
  
  /**
    * Will always be "User"
    */
  var `class`: js.UndefOr[String] = js.undefined
  
  /**
    * The first name of the user
    */
  var first_name: String
  
  /**
    * The number of users following the user
    */
  var follower_count: String
  
  /**
    * The number of channels and users a user is following
    */
  var following_count: Double
  
  /**
    * The full name of the user
    */
  var full_name: String
  
  /**
    * The internal ID of the user
    */
  var id: Double
  
  /**
    * The initials of a user. Derived from the user's first and last name
    */
  var initials: js.UndefOr[String] = js.undefined
  
  /**
    * The last name of the user
    */
  var last_name: String
  
  /**
    * The internal ID of the user's profile channel
    */
  var profile_id: Double
  
  /**
    * The slug of the user. This is used for the user's default profile channel
    */
  var slug: String
  
  /**
    * Currently this will be equivalent to "full_name"
    */
  var username: js.UndefOr[String] = js.undefined
}
object User {
  
  inline def apply(
    avatar: String,
    channel_count: Double,
    first_name: String,
    follower_count: String,
    following_count: Double,
    full_name: String,
    id: Double,
    last_name: String,
    profile_id: Double,
    slug: String
  ): User = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], channel_count = channel_count.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], profile_id = profile_id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setChannel_count(value: Double): Self = StObject.set(x, "channel_count", value.asInstanceOf[js.Any])
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFollower_count(value: String): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
    
    inline def setFollowing_count(value: Double): Self = StObject.set(x, "following_count", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitials(value: String): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
    
    inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setProfile_id(value: Double): Self = StObject.set(x, "profile_id", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
