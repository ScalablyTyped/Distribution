package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserMessage extends StObject {
  
  /**
    * Access permissions string used for this user.
    */
  var AccessString: typings.awsSdk.clientsElasticacheMod.AccessString
  
  /**
    * The current supported value is Redis. 
    */
  var Engine: EngineType
  
  /**
    * Indicates a password is not required for this user.
    */
  var NoPasswordRequired: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Passwords used for this user. You can create up to two passwords for each user.
    */
  var Passwords: js.UndefOr[PasswordListInput] = js.undefined
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the user.
    */
  var UserId: typings.awsSdk.clientsElasticacheMod.UserId
  
  /**
    * The username of the user.
    */
  var UserName: typings.awsSdk.clientsElasticacheMod.UserName
}
object CreateUserMessage {
  
  inline def apply(AccessString: AccessString, Engine: EngineType, UserId: UserId, UserName: UserName): CreateUserMessage = {
    val __obj = js.Dynamic.literal(AccessString = AccessString.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUserMessage] (val x: Self) extends AnyVal {
    
    inline def setAccessString(value: AccessString): Self = StObject.set(x, "AccessString", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: EngineType): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setNoPasswordRequired(value: BooleanOptional): Self = StObject.set(x, "NoPasswordRequired", value.asInstanceOf[js.Any])
    
    inline def setNoPasswordRequiredUndefined: Self = StObject.set(x, "NoPasswordRequired", js.undefined)
    
    inline def setPasswords(value: PasswordListInput): Self = StObject.set(x, "Passwords", value.asInstanceOf[js.Any])
    
    inline def setPasswordsUndefined: Self = StObject.set(x, "Passwords", js.undefined)
    
    inline def setPasswordsVarargs(value: String*): Self = StObject.set(x, "Passwords", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
