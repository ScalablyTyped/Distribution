package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamConfigurationSessionStorage extends StObject {
  
  /**
    * Allows artists to upload files to their workstations. The only valid option is UPLOAD.
    */
  var mode: StreamingSessionStorageModeList
  
  /**
    * The configuration for the upload storage root of the streaming session.
    */
  var root: js.UndefOr[StreamingSessionStorageRoot] = js.undefined
}
object StreamConfigurationSessionStorage {
  
  inline def apply(mode: StreamingSessionStorageModeList): StreamConfigurationSessionStorage = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfigurationSessionStorage]
  }
  
  extension [Self <: StreamConfigurationSessionStorage](x: Self) {
    
    inline def setMode(value: StreamingSessionStorageModeList): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeVarargs(value: StreamingSessionStorageMode*): Self = StObject.set(x, "mode", js.Array(value*))
    
    inline def setRoot(value: StreamingSessionStorageRoot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
