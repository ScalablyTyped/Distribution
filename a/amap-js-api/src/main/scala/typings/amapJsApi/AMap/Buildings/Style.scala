package typings.amapJsApi.AMap.Buildings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends js.Object {
  
  var areas: js.Array[AreaStyle] = js.native
  
  var hideWithoutStyle: js.UndefOr[Boolean] = js.native
}
object Style {
  
  @scala.inline
  def apply(areas: js.Array[AreaStyle]): Style = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    
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
    def setAreasVarargs(value: AreaStyle*): Self = this.set("areas", js.Array(value :_*))
    
    @scala.inline
    def setAreas(value: js.Array[AreaStyle]): Self = this.set("areas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideWithoutStyle(value: Boolean): Self = this.set("hideWithoutStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideWithoutStyle: Self = this.set("hideWithoutStyle", js.undefined)
  }
}
