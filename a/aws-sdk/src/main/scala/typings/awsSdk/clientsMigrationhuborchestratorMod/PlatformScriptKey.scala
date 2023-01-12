package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformScriptKey extends StObject {
  
  /**
    * The script location for Linux.
    */
  var linux: js.UndefOr[S3Key] = js.undefined
  
  /**
    * The script location for Windows.
    */
  var windows: js.UndefOr[S3Key] = js.undefined
}
object PlatformScriptKey {
  
  inline def apply(): PlatformScriptKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformScriptKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformScriptKey] (val x: Self) extends AnyVal {
    
    inline def setLinux(value: S3Key): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
    
    inline def setWindows(value: S3Key): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
  }
}
