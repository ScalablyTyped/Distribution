package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityNotificationAttributesResponse extends StObject {
  
  /**
    * A map of Identity to IdentityNotificationAttributes.
    */
  var NotificationAttributes: typings.awsSdk.clientsSesMod.NotificationAttributes
}
object GetIdentityNotificationAttributesResponse {
  
  inline def apply(NotificationAttributes: NotificationAttributes): GetIdentityNotificationAttributesResponse = {
    val __obj = js.Dynamic.literal(NotificationAttributes = NotificationAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityNotificationAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIdentityNotificationAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setNotificationAttributes(value: NotificationAttributes): Self = StObject.set(x, "NotificationAttributes", value.asInstanceOf[js.Any])
  }
}
