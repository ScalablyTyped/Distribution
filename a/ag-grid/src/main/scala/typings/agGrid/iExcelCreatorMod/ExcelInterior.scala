package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelInterior extends StObject {
  
  var color: String
  
  var pattern: String
  
  var patternColor: String
}
object ExcelInterior {
  
  inline def apply(color: String, pattern: String, patternColor: String): ExcelInterior = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternColor = patternColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelInterior]
  }
  
  extension [Self <: ExcelInterior](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternColor(value: String): Self = StObject.set(x, "patternColor", value.asInstanceOf[js.Any])
  }
}
