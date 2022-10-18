package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingSessionStorageRoot extends StObject {
  
  /**
    * The folder path in Linux workstations where files are uploaded.
    */
  var linux: js.UndefOr[StreamingSessionStorageRootPathLinux] = js.undefined
  
  /**
    * The folder path in Windows workstations where files are uploaded.
    */
  var windows: js.UndefOr[StreamingSessionStorageRootPathWindows] = js.undefined
}
object StreamingSessionStorageRoot {
  
  inline def apply(): StreamingSessionStorageRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingSessionStorageRoot]
  }
  
  extension [Self <: StreamingSessionStorageRoot](x: Self) {
    
    inline def setLinux(value: StreamingSessionStorageRootPathLinux): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
    
    inline def setWindows(value: StreamingSessionStorageRootPathWindows): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
  }
}
