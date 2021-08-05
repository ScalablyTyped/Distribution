package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevMode extends StObject {
  
  var devMode: js.UndefOr[Boolean] = js.undefined
  
  var newWindow: js.UndefOr[Boolean] = js.undefined
  
  var pathsToOpen: js.Array[String]
  
  var safeMode: js.UndefOr[Boolean] = js.undefined
}
object DevMode {
  
  inline def apply(pathsToOpen: js.Array[String]): DevMode = {
    val __obj = js.Dynamic.literal(pathsToOpen = pathsToOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevMode]
  }
  
  extension [Self <: DevMode](x: Self) {
    
    inline def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
    
    inline def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
    
    inline def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
    
    inline def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
    
    inline def setPathsToOpen(value: js.Array[String]): Self = StObject.set(x, "pathsToOpen", value.asInstanceOf[js.Any])
    
    inline def setPathsToOpenVarargs(value: String*): Self = StObject.set(x, "pathsToOpen", js.Array(value :_*))
    
    inline def setSafeMode(value: Boolean): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
    
    inline def setSafeModeUndefined: Self = StObject.set(x, "safeMode", js.undefined)
  }
}
