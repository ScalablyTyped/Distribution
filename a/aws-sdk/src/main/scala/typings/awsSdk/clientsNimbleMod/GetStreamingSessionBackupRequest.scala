package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingSessionBackupRequest extends StObject {
  
  /**
    * The ID of the backup.
    */
  var backupId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStreamingSessionBackupRequest {
  
  inline def apply(backupId: String, studioId: String): GetStreamingSessionBackupRequest = {
    val __obj = js.Dynamic.literal(backupId = backupId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingSessionBackupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamingSessionBackupRequest] (val x: Self) extends AnyVal {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
