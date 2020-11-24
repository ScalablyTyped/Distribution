package typings.appBuilderLib.yarnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesktopFrameworkInfo extends js.Object {
  
  var useCustomDist: Boolean = js.native
  
  var version: String = js.native
}
object DesktopFrameworkInfo {
  
  @scala.inline
  def apply(useCustomDist: Boolean, version: String): DesktopFrameworkInfo = {
    val __obj = js.Dynamic.literal(useCustomDist = useCustomDist.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopFrameworkInfo]
  }
  
  @scala.inline
  implicit class DesktopFrameworkInfoOps[Self <: DesktopFrameworkInfo] (val x: Self) extends AnyVal {
    
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
    def setUseCustomDist(value: Boolean): Self = this.set("useCustomDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
