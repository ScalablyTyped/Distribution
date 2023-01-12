package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamConfiguration extends StObject {
  
  /**
    * Enable or disable the use of the system clipboard to copy and paste between the streaming session and streaming client.
    */
  var clipboardMode: StreamingClipboardMode
  
  /**
    * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
    */
  var ec2InstanceTypes: StreamingInstanceTypeList
  
  /**
    * The length of time, in minutes, that a streaming session can be active before it is stopped or terminated. After this point, Nimble Studio automatically terminates or stops the session. The default length of time is 690 minutes, and the maximum length of time is 30 days.
    */
  var maxSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxSessionLengthInMinutes] = js.undefined
  
  /**
    * Integer that determines if you can start and stop your sessions and how long a session can stay in the STOPPED state. The default value is 0. The maximum value is 5760. If the value is missing or set to 0, your sessions can’t be stopped. If you then call StopStreamingSession, the session fails. If the time that a session stays in the READY state exceeds the maxSessionLengthInMinutes value, the session will automatically be terminated (instead of stopped). If the value is set to a positive number, the session can be stopped. You can call StopStreamingSession to stop sessions in the READY state. If the time that a session stays in the READY state exceeds the maxSessionLengthInMinutes value, the session will automatically be stopped (instead of terminated).
    */
  var maxStoppedSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxStoppedSessionLengthInMinutes] = js.undefined
  
  /**
    * (Optional) The upload storage for a streaming session.
    */
  var sessionStorage: js.UndefOr[StreamConfigurationSessionStorage] = js.undefined
  
  /**
    * The streaming images that users can select from when launching a streaming session with this launch profile.
    */
  var streamingImageIds: StreamingImageIdList
}
object StreamConfiguration {
  
  inline def apply(
    clipboardMode: StreamingClipboardMode,
    ec2InstanceTypes: StreamingInstanceTypeList,
    streamingImageIds: StreamingImageIdList
  ): StreamConfiguration = {
    val __obj = js.Dynamic.literal(clipboardMode = clipboardMode.asInstanceOf[js.Any], ec2InstanceTypes = ec2InstanceTypes.asInstanceOf[js.Any], streamingImageIds = streamingImageIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamConfiguration] (val x: Self) extends AnyVal {
    
    inline def setClipboardMode(value: StreamingClipboardMode): Self = StObject.set(x, "clipboardMode", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceTypes(value: StreamingInstanceTypeList): Self = StObject.set(x, "ec2InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceTypesVarargs(value: StreamingInstanceType*): Self = StObject.set(x, "ec2InstanceTypes", js.Array(value*))
    
    inline def setMaxSessionLengthInMinutes(value: StreamConfigurationMaxSessionLengthInMinutes): Self = StObject.set(x, "maxSessionLengthInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaxSessionLengthInMinutesUndefined: Self = StObject.set(x, "maxSessionLengthInMinutes", js.undefined)
    
    inline def setMaxStoppedSessionLengthInMinutes(value: StreamConfigurationMaxStoppedSessionLengthInMinutes): Self = StObject.set(x, "maxStoppedSessionLengthInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaxStoppedSessionLengthInMinutesUndefined: Self = StObject.set(x, "maxStoppedSessionLengthInMinutes", js.undefined)
    
    inline def setSessionStorage(value: StreamConfigurationSessionStorage): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
    
    inline def setSessionStorageUndefined: Self = StObject.set(x, "sessionStorage", js.undefined)
    
    inline def setStreamingImageIds(value: StreamingImageIdList): Self = StObject.set(x, "streamingImageIds", value.asInstanceOf[js.Any])
    
    inline def setStreamingImageIdsVarargs(value: StreamingImageId*): Self = StObject.set(x, "streamingImageIds", js.Array(value*))
  }
}
