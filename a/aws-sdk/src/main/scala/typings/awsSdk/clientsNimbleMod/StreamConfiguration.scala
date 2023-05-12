package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamConfiguration extends StObject {
  
  /**
    * Indicates if a streaming session created from this launch profile should be terminated automatically or retained without termination after being in a STOPPED state.   When ACTIVATED, the streaming session is scheduled for termination after being in the STOPPED state for the time specified in maxStoppedSessionLengthInMinutes.   When DEACTIVATED, the streaming session can remain in the STOPPED state indefinitely.   This parameter is only allowed when sessionPersistenceMode is ACTIVATED. When allowed, the default value for this parameter is DEACTIVATED.
    */
  var automaticTerminationMode: js.UndefOr[AutomaticTerminationMode] = js.undefined
  
  /**
    * Allows or deactivates the use of the system clipboard to copy and paste between the streaming session and streaming client.
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
    * Integer that determines if you can start and stop your sessions and how long a session can stay in the STOPPED state. The default value is 0. The maximum value is 5760. This field is allowed only when sessionPersistenceMode is ACTIVATED and automaticTerminationMode is ACTIVATED. If the value is set to 0, your sessions can’t be STOPPED. If you then call StopStreamingSession, the session fails. If the time that a session stays in the READY state exceeds the maxSessionLengthInMinutes value, the session will automatically be terminated (instead of STOPPED). If the value is set to a positive number, the session can be stopped. You can call StopStreamingSession to stop sessions in the READY state. If the time that a session stays in the READY state exceeds the maxSessionLengthInMinutes value, the session will automatically be stopped (instead of terminated).
    */
  var maxStoppedSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxStoppedSessionLengthInMinutes] = js.undefined
  
  /**
    * Information about the streaming session backup.
    */
  var sessionBackup: js.UndefOr[StreamConfigurationSessionBackup] = js.undefined
  
  /**
    * Determine if a streaming session created from this launch profile can configure persistent storage. This means that volumeConfiguration and automaticTerminationMode are configured.
    */
  var sessionPersistenceMode: js.UndefOr[SessionPersistenceMode] = js.undefined
  
  /**
    * The upload storage for a streaming session.
    */
  var sessionStorage: js.UndefOr[StreamConfigurationSessionStorage] = js.undefined
  
  /**
    * The streaming images that users can select from when launching a streaming session with this launch profile.
    */
  var streamingImageIds: StreamingImageIdList
  
  /**
    * Custom volume configuration for the root volumes that are attached to streaming sessions. This parameter is only allowed when sessionPersistenceMode is ACTIVATED.
    */
  var volumeConfiguration: js.UndefOr[VolumeConfiguration] = js.undefined
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
    
    inline def setAutomaticTerminationMode(value: AutomaticTerminationMode): Self = StObject.set(x, "automaticTerminationMode", value.asInstanceOf[js.Any])
    
    inline def setAutomaticTerminationModeUndefined: Self = StObject.set(x, "automaticTerminationMode", js.undefined)
    
    inline def setClipboardMode(value: StreamingClipboardMode): Self = StObject.set(x, "clipboardMode", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceTypes(value: StreamingInstanceTypeList): Self = StObject.set(x, "ec2InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceTypesVarargs(value: StreamingInstanceType*): Self = StObject.set(x, "ec2InstanceTypes", js.Array(value*))
    
    inline def setMaxSessionLengthInMinutes(value: StreamConfigurationMaxSessionLengthInMinutes): Self = StObject.set(x, "maxSessionLengthInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaxSessionLengthInMinutesUndefined: Self = StObject.set(x, "maxSessionLengthInMinutes", js.undefined)
    
    inline def setMaxStoppedSessionLengthInMinutes(value: StreamConfigurationMaxStoppedSessionLengthInMinutes): Self = StObject.set(x, "maxStoppedSessionLengthInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaxStoppedSessionLengthInMinutesUndefined: Self = StObject.set(x, "maxStoppedSessionLengthInMinutes", js.undefined)
    
    inline def setSessionBackup(value: StreamConfigurationSessionBackup): Self = StObject.set(x, "sessionBackup", value.asInstanceOf[js.Any])
    
    inline def setSessionBackupUndefined: Self = StObject.set(x, "sessionBackup", js.undefined)
    
    inline def setSessionPersistenceMode(value: SessionPersistenceMode): Self = StObject.set(x, "sessionPersistenceMode", value.asInstanceOf[js.Any])
    
    inline def setSessionPersistenceModeUndefined: Self = StObject.set(x, "sessionPersistenceMode", js.undefined)
    
    inline def setSessionStorage(value: StreamConfigurationSessionStorage): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
    
    inline def setSessionStorageUndefined: Self = StObject.set(x, "sessionStorage", js.undefined)
    
    inline def setStreamingImageIds(value: StreamingImageIdList): Self = StObject.set(x, "streamingImageIds", value.asInstanceOf[js.Any])
    
    inline def setStreamingImageIdsVarargs(value: StreamingImageId*): Self = StObject.set(x, "streamingImageIds", js.Array(value*))
    
    inline def setVolumeConfiguration(value: VolumeConfiguration): Self = StObject.set(x, "volumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVolumeConfigurationUndefined: Self = StObject.set(x, "volumeConfiguration", js.undefined)
  }
}
