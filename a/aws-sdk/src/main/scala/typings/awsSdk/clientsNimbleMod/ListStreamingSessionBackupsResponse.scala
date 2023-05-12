package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamingSessionBackupsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the streaming session backups.
    */
  var streamingSessionBackups: js.UndefOr[StreamingSessionBackupList] = js.undefined
}
object ListStreamingSessionBackupsResponse {
  
  inline def apply(): ListStreamingSessionBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamingSessionBackupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStreamingSessionBackupsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStreamingSessionBackups(value: StreamingSessionBackupList): Self = StObject.set(x, "streamingSessionBackups", value.asInstanceOf[js.Any])
    
    inline def setStreamingSessionBackupsUndefined: Self = StObject.set(x, "streamingSessionBackups", js.undefined)
    
    inline def setStreamingSessionBackupsVarargs(value: StreamingSessionBackup*): Self = StObject.set(x, "streamingSessionBackups", js.Array(value*))
  }
}
