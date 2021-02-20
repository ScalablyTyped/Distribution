package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorBorderBottomColor extends StObject {
  
  var alignItems: String = js.native
  
  var backgroundColor: String = js.native
  
  var borderBottomColor: String = js.native
  
  var paddingVertical: Double = js.native
}
object BackgroundColorBorderBottomColor {
  
  @scala.inline
  def apply(alignItems: String, backgroundColor: String, borderBottomColor: String, paddingVertical: Double): BackgroundColorBorderBottomColor = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorBorderBottomColor]
  }
  
  @scala.inline
  implicit class BackgroundColorBorderBottomColorMutableBuilder[Self <: BackgroundColorBorderBottomColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
