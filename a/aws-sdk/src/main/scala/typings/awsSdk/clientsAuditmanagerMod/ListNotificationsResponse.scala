package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationsResponse extends StObject {
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The returned list of notifications. 
    */
  var notifications: js.UndefOr[Notifications] = js.undefined
}
object ListNotificationsResponse {
  
  inline def apply(): ListNotificationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNotificationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setNotifications(value: Notifications): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
  }
}
