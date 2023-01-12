package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingSession extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that created the streaming session.
    */
  var createdBy: js.UndefOr[String] = js.undefined
  
  /**
    * The EC2 Instance type used for the streaming session.
    */
  var ec2InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the launch profile used to control access from the streaming session.
    */
  var launchProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the session and interacting with the virtual workstation.
    */
  var ownedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The session ID.
    */
  var sessionId: js.UndefOr[StreamingSessionId] = js.undefined
  
  /**
    * The time the session entered START_IN_PROGRESS state.
    */
  var startedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that started the streaming session.
    */
  var startedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The current state.
    */
  var state: js.UndefOr[StreamingSessionState] = js.undefined
  
  /**
    * The status code.
    */
  var statusCode: js.UndefOr[StreamingSessionStatusCode] = js.undefined
  
  /**
    * The status message for the streaming session.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The time the streaming session will automatically be stopped if the user doesn’t stop the session themselves. 
    */
  var stopAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the session entered STOP_IN_PROGRESS state.
    */
  var stoppedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that stopped the streaming session.
    */
  var stoppedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the streaming image.
    */
  var streamingImageId: js.UndefOr[StreamingImageId] = js.undefined
  
  /**
    * A collection of labels, in the form of key:value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The time the streaming session will automatically terminate if not terminated by the user.
    */
  var terminateAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that most recently updated the resource.
    */
  var updatedBy: js.UndefOr[String] = js.undefined
}
object StreamingSession {
  
  inline def apply(): StreamingSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingSession] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setEc2InstanceType(value: String): Self = StObject.set(x, "ec2InstanceType", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceTypeUndefined: Self = StObject.set(x, "ec2InstanceType", js.undefined)
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileIdUndefined: Self = StObject.set(x, "launchProfileId", js.undefined)
    
    inline def setOwnedBy(value: String): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    inline def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    inline def setSessionId(value: StreamingSessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStartedBy(value: String): Self = StObject.set(x, "startedBy", value.asInstanceOf[js.Any])
    
    inline def setStartedByUndefined: Self = StObject.set(x, "startedBy", js.undefined)
    
    inline def setState(value: StreamingSessionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusCode(value: StreamingSessionStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStopAt(value: js.Date): Self = StObject.set(x, "stopAt", value.asInstanceOf[js.Any])
    
    inline def setStopAtUndefined: Self = StObject.set(x, "stopAt", js.undefined)
    
    inline def setStoppedAt(value: js.Date): Self = StObject.set(x, "stoppedAt", value.asInstanceOf[js.Any])
    
    inline def setStoppedAtUndefined: Self = StObject.set(x, "stoppedAt", js.undefined)
    
    inline def setStoppedBy(value: String): Self = StObject.set(x, "stoppedBy", value.asInstanceOf[js.Any])
    
    inline def setStoppedByUndefined: Self = StObject.set(x, "stoppedBy", js.undefined)
    
    inline def setStreamingImageId(value: StreamingImageId): Self = StObject.set(x, "streamingImageId", value.asInstanceOf[js.Any])
    
    inline def setStreamingImageIdUndefined: Self = StObject.set(x, "streamingImageId", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTerminateAt(value: js.Date): Self = StObject.set(x, "terminateAt", value.asInstanceOf[js.Any])
    
    inline def setTerminateAtUndefined: Self = StObject.set(x, "terminateAt", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setUpdatedBy(value: String): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
  }
}
