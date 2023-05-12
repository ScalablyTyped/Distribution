package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingSessionBackup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique across all Regions.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the backup.
    */
  var backupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ISO timestamp in for when the resource was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the launch profile which allowed the backups for the streaming session.
    */
  var launchProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * The user ID of the user that owns the streaming session.
    */
  var ownedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The streaming session ID for the StreamingSessionBackup.
    */
  var sessionId: js.UndefOr[StreamingSessionId] = js.undefined
  
  var state: js.UndefOr[StreamingSessionState] = js.undefined
  
  /**
    * The status code.
    */
  var statusCode: js.UndefOr[StreamingSessionStatusCode] = js.undefined
  
  /**
    * The status message for the streaming session backup.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of labels, in the form of key-value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object StreamingSessionBackup {
  
  inline def apply(): StreamingSessionBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingSessionBackup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingSessionBackup] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileIdUndefined: Self = StObject.set(x, "launchProfileId", js.undefined)
    
    inline def setOwnedBy(value: String): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    inline def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    inline def setSessionId(value: StreamingSessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setState(value: StreamingSessionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusCode(value: StreamingSessionStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
