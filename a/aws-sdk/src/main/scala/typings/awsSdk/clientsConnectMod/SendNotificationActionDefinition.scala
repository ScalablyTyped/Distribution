package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendNotificationActionDefinition extends StObject {
  
  /**
    * Notification content. Supports variable injection. For more information, see JSONPath reference in the Amazon Connect Administrators Guide.
    */
  var Content: typings.awsSdk.clientsConnectMod.Content
  
  /**
    * Content type format.
    */
  var ContentType: NotificationContentType
  
  /**
    * Notification delivery method.
    */
  var DeliveryMethod: NotificationDeliveryType
  
  /**
    * Notification recipient.
    */
  var Recipient: NotificationRecipientType
  
  /**
    * The subject of the email if the delivery method is EMAIL. Supports variable injection. For more information, see JSONPath reference in the Amazon Connect Administrators Guide.
    */
  var Subject: js.UndefOr[typings.awsSdk.clientsConnectMod.Subject] = js.undefined
}
object SendNotificationActionDefinition {
  
  inline def apply(
    Content: Content,
    ContentType: NotificationContentType,
    DeliveryMethod: NotificationDeliveryType,
    Recipient: NotificationRecipientType
  ): SendNotificationActionDefinition = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], DeliveryMethod = DeliveryMethod.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendNotificationActionDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendNotificationActionDefinition] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Content): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: NotificationContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setDeliveryMethod(value: NotificationDeliveryType): Self = StObject.set(x, "DeliveryMethod", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: NotificationRecipientType): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
