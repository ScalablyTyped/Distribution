package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevMode extends StObject {
  
  var devMode: js.UndefOr[Boolean] = js.native
  
  var newWindow: js.UndefOr[Boolean] = js.native
  
  var pathsToOpen: js.Array[String] = js.native
  
  var safeMode: js.UndefOr[Boolean] = js.native
}
object DevMode {
  
  @scala.inline
  def apply(pathsToOpen: js.Array[String]): DevMode = {
    val __obj = js.Dynamic.literal(pathsToOpen = pathsToOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevMode]
  }
  
  @scala.inline
  implicit class DevModeMutableBuilder[Self <: DevMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
    
    @scala.inline
    def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
    
    @scala.inline
    def setPathsToOpen(value: js.Array[String]): Self = StObject.set(x, "pathsToOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsToOpenVarargs(value: String*): Self = StObject.set(x, "pathsToOpen", js.Array(value :_*))
    
    @scala.inline
    def setSafeMode(value: Boolean): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeModeUndefined: Self = StObject.set(x, "safeMode", js.undefined)
  }
}
