package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignItemsBorderLeftWidth extends StObject {
  
  var alignItems: String = js.native
  
  var borderLeftWidth: Double = js.native
  
  var borderRightWidth: Double = js.native
  
  var borderStyle: String = js.native
  
  var flex: Double = js.native
  
  var justifyContent: String = js.native
  
  var paddingVertical: Double = js.native
}
object AlignItemsBorderLeftWidth {
  
  @scala.inline
  def apply(
    alignItems: String,
    borderLeftWidth: Double,
    borderRightWidth: Double,
    borderStyle: String,
    flex: Double,
    justifyContent: String,
    paddingVertical: Double
  ): AlignItemsBorderLeftWidth = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], borderLeftWidth = borderLeftWidth.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsBorderLeftWidth]
  }
  
  @scala.inline
  implicit class AlignItemsBorderLeftWidthMutableBuilder[Self <: AlignItemsBorderLeftWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftWidth(value: Double): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightWidth(value: Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
