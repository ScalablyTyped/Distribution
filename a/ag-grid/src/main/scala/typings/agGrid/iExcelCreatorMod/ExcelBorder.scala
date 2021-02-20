package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelBorder extends StObject {
  
  var color: String = js.native
  
  var lineStyle: String = js.native
  
  var weight: Double = js.native
}
object ExcelBorder {
  
  @scala.inline
  def apply(color: String, lineStyle: String, weight: Double): ExcelBorder = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelBorder]
  }
  
  @scala.inline
  implicit class ExcelBorderMutableBuilder[Self <: ExcelBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle(value: String): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
