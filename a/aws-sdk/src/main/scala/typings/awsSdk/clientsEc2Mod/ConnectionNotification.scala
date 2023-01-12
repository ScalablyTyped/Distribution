package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionNotification extends StObject {
  
  /**
    * The events for the notification. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The ARN of the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the notification.
    */
  var ConnectionNotificationState: js.UndefOr[typings.awsSdk.clientsEc2Mod.ConnectionNotificationState] = js.undefined
  
  /**
    * The type of notification.
    */
  var ConnectionNotificationType: js.UndefOr[typings.awsSdk.clientsEc2Mod.ConnectionNotificationType] = js.undefined
  
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
}
object ConnectionNotification {
  
  inline def apply(): ConnectionNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionNotification] (val x: Self) extends AnyVal {
    
    inline def setConnectionEvents(value: ValueStringList): Self = StObject.set(x, "ConnectionEvents", value.asInstanceOf[js.Any])
    
    inline def setConnectionEventsUndefined: Self = StObject.set(x, "ConnectionEvents", js.undefined)
    
    inline def setConnectionEventsVarargs(value: String*): Self = StObject.set(x, "ConnectionEvents", js.Array(value*))
    
    inline def setConnectionNotificationArn(value: String): Self = StObject.set(x, "ConnectionNotificationArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionNotificationArnUndefined: Self = StObject.set(x, "ConnectionNotificationArn", js.undefined)
    
    inline def setConnectionNotificationId(value: String): Self = StObject.set(x, "ConnectionNotificationId", value.asInstanceOf[js.Any])
    
    inline def setConnectionNotificationIdUndefined: Self = StObject.set(x, "ConnectionNotificationId", js.undefined)
    
    inline def setConnectionNotificationState(value: ConnectionNotificationState): Self = StObject.set(x, "ConnectionNotificationState", value.asInstanceOf[js.Any])
    
    inline def setConnectionNotificationStateUndefined: Self = StObject.set(x, "ConnectionNotificationState", js.undefined)
    
    inline def setConnectionNotificationType(value: ConnectionNotificationType): Self = StObject.set(x, "ConnectionNotificationType", value.asInstanceOf[js.Any])
    
    inline def setConnectionNotificationTypeUndefined: Self = StObject.set(x, "ConnectionNotificationType", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
  }
}
