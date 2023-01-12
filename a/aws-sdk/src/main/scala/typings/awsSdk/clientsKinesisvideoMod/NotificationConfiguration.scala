package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfiguration extends StObject {
  
  /**
    * The destination information required to deliver a notification to a customer.
    */
  var DestinationConfig: NotificationDestinationConfig
  
  /**
    * Indicates if a notification configuration is enabled or disabled.
    */
  var Status: ConfigurationStatus
}
object NotificationConfiguration {
  
  inline def apply(DestinationConfig: NotificationDestinationConfig, Status: ConfigurationStatus): NotificationConfiguration = {
    val __obj = js.Dynamic.literal(DestinationConfig = DestinationConfig.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestinationConfig(value: NotificationDestinationConfig): Self = StObject.set(x, "DestinationConfig", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
