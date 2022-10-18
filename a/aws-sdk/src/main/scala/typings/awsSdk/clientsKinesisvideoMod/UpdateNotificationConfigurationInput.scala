package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNotificationConfigurationInput extends StObject {
  
  /**
    * The structure containing the information required for notifications. If the structure is null, the configuration will be deleted from the stream.
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.NotificationConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis video stream from where you want to update the notification configuration. You must specify either the StreamName or the StreamARN.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream from which to update the notification configuration. You must specify either the StreamName or the StreamARN.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StreamName] = js.undefined
}
object UpdateNotificationConfigurationInput {
  
  inline def apply(): UpdateNotificationConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNotificationConfigurationInput]
  }
  
  extension [Self <: UpdateNotificationConfigurationInput](x: Self) {
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigurationUndefined: Self = StObject.set(x, "NotificationConfiguration", js.undefined)
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
