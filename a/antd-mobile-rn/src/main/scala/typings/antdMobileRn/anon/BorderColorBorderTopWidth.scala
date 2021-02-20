package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderColorBorderTopWidth extends StObject {
  
  var borderColor: String = js.native
  
  var borderTopWidth: Double = js.native
  
  var flexGrow: Double = js.native
  
  var paddingVertical: Double = js.native
}
object BorderColorBorderTopWidth {
  
  @scala.inline
  def apply(borderColor: String, borderTopWidth: Double, flexGrow: Double, paddingVertical: Double): BorderColorBorderTopWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorBorderTopWidth]
  }
  
  @scala.inline
  implicit class BorderColorBorderTopWidthMutableBuilder[Self <: BorderColorBorderTopWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
