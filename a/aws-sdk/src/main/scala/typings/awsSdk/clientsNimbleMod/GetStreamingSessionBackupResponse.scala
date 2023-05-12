package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingSessionBackupResponse extends StObject {
  
  /**
    * Information about the streaming session backup.
    */
  var streamingSessionBackup: js.UndefOr[StreamingSessionBackup] = js.undefined
}
object GetStreamingSessionBackupResponse {
  
  inline def apply(): GetStreamingSessionBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingSessionBackupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamingSessionBackupResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamingSessionBackup(value: StreamingSessionBackup): Self = StObject.set(x, "streamingSessionBackup", value.asInstanceOf[js.Any])
    
    inline def setStreamingSessionBackupUndefined: Self = StObject.set(x, "streamingSessionBackup", js.undefined)
  }
}
