package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointConnectionNotificationsRequest extends StObject {
  
  /**
    * One or more notification IDs.
    */
  var ConnectionNotificationIds: ConnectionNotificationIdsList
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DeleteVpcEndpointConnectionNotificationsRequest {
  
  inline def apply(ConnectionNotificationIds: ConnectionNotificationIdsList): DeleteVpcEndpointConnectionNotificationsRequest = {
    val __obj = js.Dynamic.literal(ConnectionNotificationIds = ConnectionNotificationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointConnectionNotificationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVpcEndpointConnectionNotificationsRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionNotificationIds(value: ConnectionNotificationIdsList): Self = StObject.set(x, "ConnectionNotificationIds", value.asInstanceOf[js.Any])
    
    inline def setConnectionNotificationIdsVarargs(value: ConnectionNotificationId*): Self = StObject.set(x, "ConnectionNotificationIds", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
