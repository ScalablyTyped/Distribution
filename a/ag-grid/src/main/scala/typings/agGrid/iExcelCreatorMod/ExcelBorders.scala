package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelBorders extends StObject {
  
  var borderBottom: ExcelBorder
  
  var borderLeft: ExcelBorder
  
  var borderRight: ExcelBorder
  
  var borderTop: ExcelBorder
}
object ExcelBorders {
  
  @scala.inline
  def apply(
    borderBottom: ExcelBorder,
    borderLeft: ExcelBorder,
    borderRight: ExcelBorder,
    borderTop: ExcelBorder
  ): ExcelBorders = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], borderLeft = borderLeft.asInstanceOf[js.Any], borderRight = borderRight.asInstanceOf[js.Any], borderTop = borderTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelBorders]
  }
  
  @scala.inline
  implicit class ExcelBordersMutableBuilder[Self <: ExcelBorders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBottom(value: ExcelBorder): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeft(value: ExcelBorder): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRight(value: ExcelBorder): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTop(value: ExcelBorder): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
  }
}
