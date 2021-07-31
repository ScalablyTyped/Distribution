package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelAlignment extends StObject {
  
  var horizontal: String
  
  var indent: Double
  
  var readingOrder: String
  
  var rotate: Double
  
  var shrinkToFit: Boolean
  
  var vertical: String
  
  var verticalText: Boolean
  
  var wrapText: Boolean
}
object ExcelAlignment {
  
  @scala.inline
  def apply(
    horizontal: String,
    indent: Double,
    readingOrder: String,
    rotate: Double,
    shrinkToFit: Boolean,
    vertical: String,
    verticalText: Boolean,
    wrapText: Boolean
  ): ExcelAlignment = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], readingOrder = readingOrder.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], shrinkToFit = shrinkToFit.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], verticalText = verticalText.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelAlignment]
  }
  
  @scala.inline
  implicit class ExcelAlignmentMutableBuilder[Self <: ExcelAlignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrder(value: String): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalText(value: Boolean): Self = StObject.set(x, "verticalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
  }
}
