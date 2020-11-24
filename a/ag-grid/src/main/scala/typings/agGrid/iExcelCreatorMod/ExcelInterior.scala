package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelInterior extends js.Object {
  
  var color: String = js.native
  
  var pattern: String = js.native
  
  var patternColor: String = js.native
}
object ExcelInterior {
  
  @scala.inline
  def apply(color: String, pattern: String, patternColor: String): ExcelInterior = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternColor = patternColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelInterior]
  }
  
  @scala.inline
  implicit class ExcelInteriorOps[Self <: ExcelInterior] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColor(value: String): Self = this.set("patternColor", value.asInstanceOf[js.Any])
  }
}
