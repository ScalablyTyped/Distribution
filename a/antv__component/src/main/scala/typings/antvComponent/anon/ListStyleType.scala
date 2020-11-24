package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStyleType extends js.Object {
  
  var backgroundColor: js.UndefOr[scala.Nothing] = js.native
  
  var borderRadius: String = js.native
  
  var boxShadow: js.UndefOr[scala.Nothing] = js.native
  
  var color: js.UndefOr[scala.Nothing] = js.native
  
  var display: String = js.native
  
  var float: js.UndefOr[scala.Nothing] = js.native
  
  var fontFamily: js.UndefOr[scala.Nothing] = js.native
  
  var fontSize: js.UndefOr[scala.Nothing] = js.native
  
  var height: String = js.native
  
  var lineHeight: js.UndefOr[scala.Nothing] = js.native
  
  var listStyleType: js.UndefOr[scala.Nothing] = js.native
  
  var margin: js.UndefOr[scala.Nothing] = js.native
  
  var marginBottom: js.UndefOr[scala.Nothing] = js.native
  
  var marginLeft: js.UndefOr[scala.Nothing] = js.native
  
  var marginRight: String = js.native
  
  var padding: js.UndefOr[scala.Nothing] = js.native
  
  var position: js.UndefOr[scala.Nothing] = js.native
  
  var transition: js.UndefOr[scala.Nothing] = js.native
  
  var visibility: js.UndefOr[scala.Nothing] = js.native
  
  var width: String = js.native
  
  var zIndex: js.UndefOr[scala.Nothing] = js.native
}
object ListStyleType {
  
  @scala.inline
  def apply(borderRadius: String, display: String, height: String, marginRight: String, width: String): ListStyleType = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStyleType]
  }
  
  @scala.inline
  implicit class ListStyleTypeOps[Self <: ListStyleType] (val x: Self) extends AnyVal {
    
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
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRight(value: String): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
