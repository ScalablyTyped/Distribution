package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxShadow extends js.Object {
  
  var backgroundColor: js.UndefOr[scala.Nothing] = js.native
  
  var borderRadius: js.UndefOr[scala.Nothing] = js.native
  
  var boxShadow: js.UndefOr[scala.Nothing] = js.native
  
  var color: js.UndefOr[scala.Nothing] = js.native
  
  var display: js.UndefOr[scala.Nothing] = js.native
  
  var float: js.UndefOr[scala.Nothing] = js.native
  
  var fontFamily: js.UndefOr[scala.Nothing] = js.native
  
  var fontSize: js.UndefOr[scala.Nothing] = js.native
  
  var height: js.UndefOr[scala.Nothing] = js.native
  
  var lineHeight: js.UndefOr[scala.Nothing] = js.native
  
  var listStyleType: js.UndefOr[scala.Nothing] = js.native
  
  var margin: js.UndefOr[scala.Nothing] = js.native
  
  var marginBottom: String = js.native
  
  var marginLeft: js.UndefOr[scala.Nothing] = js.native
  
  var marginRight: js.UndefOr[scala.Nothing] = js.native
  
  var padding: js.UndefOr[scala.Nothing] = js.native
  
  var position: js.UndefOr[scala.Nothing] = js.native
  
  var transition: js.UndefOr[scala.Nothing] = js.native
  
  var visibility: js.UndefOr[scala.Nothing] = js.native
  
  var width: js.UndefOr[scala.Nothing] = js.native
  
  var zIndex: js.UndefOr[scala.Nothing] = js.native
}
object BoxShadow {
  
  @scala.inline
  def apply(marginBottom: String): BoxShadow = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxShadow]
  }
  
  @scala.inline
  implicit class BoxShadowOps[Self <: BoxShadow] (val x: Self) extends AnyVal {
    
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
    def setMarginBottom(value: String): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
  }
}
