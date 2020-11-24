package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevMode extends js.Object {
  
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
  implicit class DevModeOps[Self <: DevMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPathsToOpenVarargs(value: String*): Self = this.set("pathsToOpen", js.Array(value :_*))
    
    @scala.inline
    def setPathsToOpen(value: js.Array[String]): Self = this.set("pathsToOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevMode(value: Boolean): Self = this.set("devMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevMode: Self = this.set("devMode", js.undefined)
    
    @scala.inline
    def setNewWindow(value: Boolean): Self = this.set("newWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewWindow: Self = this.set("newWindow", js.undefined)
    
    @scala.inline
    def setSafeMode(value: Boolean): Self = this.set("safeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeMode: Self = this.set("safeMode", js.undefined)
  }
}
