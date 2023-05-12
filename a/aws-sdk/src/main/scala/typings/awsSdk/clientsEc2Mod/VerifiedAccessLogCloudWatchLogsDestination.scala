package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessLogCloudWatchLogsDestination extends StObject {
  
  /**
    * The delivery status for access logs.
    */
  var DeliveryStatus: js.UndefOr[VerifiedAccessLogDeliveryStatus] = js.undefined
  
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the CloudWatch Logs log group.
    */
  var LogGroup: js.UndefOr[String] = js.undefined
}
object VerifiedAccessLogCloudWatchLogsDestination {
  
  inline def apply(): VerifiedAccessLogCloudWatchLogsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessLogCloudWatchLogsDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessLogCloudWatchLogsDestination] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStatus(value: VerifiedAccessLogDeliveryStatus): Self = StObject.set(x, "DeliveryStatus", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStatusUndefined: Self = StObject.set(x, "DeliveryStatus", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setLogGroup(value: String): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
  }
}
