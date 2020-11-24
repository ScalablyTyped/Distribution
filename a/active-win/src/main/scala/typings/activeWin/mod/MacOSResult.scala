package typings.activeWin.mod

import typings.activeWin.activeWinStrings.macos
import typings.activeWin.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacOSResult
  extends BaseResult
     with Result {
  
  @JSName("owner")
  var owner_MacOSResult: MacOSOwner = js.native
  
  var platform: macos = js.native
  
  /**
  		URL of the active browser tab if the active window is Safari, Chrome, Edge, or Brave.
  		*/
  var url: js.UndefOr[String] = js.native
}
object MacOSResult {
  
  @scala.inline
  def apply(bounds: Height, id: Double, memoryUsage: Double, owner: MacOSOwner, platform: macos, title: String): MacOSResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOSResult]
  }
  
  @scala.inline
  implicit class MacOSResultOps[Self <: MacOSResult] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: MacOSOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: macos): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
