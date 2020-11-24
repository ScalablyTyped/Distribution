package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerStyle extends js.Object {
  
  var markerStyle: FillStroke = js.native
  
  var nameStyle: FillString = js.native
}
object MarkerStyle {
  
  @scala.inline
  def apply(markerStyle: FillStroke, nameStyle: FillString): MarkerStyle = {
    val __obj = js.Dynamic.literal(markerStyle = markerStyle.asInstanceOf[js.Any], nameStyle = nameStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerStyle]
  }
  
  @scala.inline
  implicit class MarkerStyleOps[Self <: MarkerStyle] (val x: Self) extends AnyVal {
    
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
    def setMarkerStyle(value: FillStroke): Self = this.set("markerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameStyle(value: FillString): Self = this.set("nameStyle", value.asInstanceOf[js.Any])
  }
}
