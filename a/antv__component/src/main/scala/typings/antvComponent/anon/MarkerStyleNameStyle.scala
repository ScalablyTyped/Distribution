package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerStyleNameStyle extends js.Object {
  
  var markerStyle: OpacityNumber = js.native
  
  var nameStyle: FillString = js.native
}
object MarkerStyleNameStyle {
  
  @scala.inline
  def apply(markerStyle: OpacityNumber, nameStyle: FillString): MarkerStyleNameStyle = {
    val __obj = js.Dynamic.literal(markerStyle = markerStyle.asInstanceOf[js.Any], nameStyle = nameStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerStyleNameStyle]
  }
  
  @scala.inline
  implicit class MarkerStyleNameStyleOps[Self <: MarkerStyleNameStyle] (val x: Self) extends AnyVal {
    
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
    def setMarkerStyle(value: OpacityNumber): Self = this.set("markerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameStyle(value: FillString): Self = this.set("nameStyle", value.asInstanceOf[js.Any])
  }
}
