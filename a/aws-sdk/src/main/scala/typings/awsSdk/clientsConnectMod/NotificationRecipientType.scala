package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationRecipientType extends StObject {
  
  /**
    * A list of user IDs.
    */
  var UserIds: js.UndefOr[UserIdList] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the specified tags will be notified.
    */
  var UserTags: js.UndefOr[UserTagMap] = js.undefined
}
object NotificationRecipientType {
  
  inline def apply(): NotificationRecipientType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationRecipientType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationRecipientType] (val x: Self) extends AnyVal {
    
    inline def setUserIds(value: UserIdList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    inline def setUserIdsVarargs(value: UserId*): Self = StObject.set(x, "UserIds", js.Array(value*))
    
    inline def setUserTags(value: UserTagMap): Self = StObject.set(x, "UserTags", value.asInstanceOf[js.Any])
    
    inline def setUserTagsUndefined: Self = StObject.set(x, "UserTags", js.undefined)
  }
}
