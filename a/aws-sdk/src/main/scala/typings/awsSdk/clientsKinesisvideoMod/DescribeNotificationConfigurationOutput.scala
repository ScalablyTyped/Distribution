package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotificationConfigurationOutput extends StObject {
  
  /**
    * The structure that contains the information required for notifications. If the structure is null, the configuration will be deleted from the stream.
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.NotificationConfiguration] = js.undefined
}
object DescribeNotificationConfigurationOutput {
  
  inline def apply(): DescribeNotificationConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotificationConfigurationOutput]
  }
  
  extension [Self <: DescribeNotificationConfigurationOutput](x: Self) {
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigurationUndefined: Self = StObject.set(x, "NotificationConfiguration", js.undefined)
  }
}
