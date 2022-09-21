package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grid extends StObject {
  
  var grid: Any
  
  var label: Offset
  
  var line: Any
  
  var subTickLine: Length
  
  var tickLine: Length
}
object Grid {
  
  inline def apply(grid: Any, label: Offset, line: Any, subTickLine: Length, tickLine: Length): Grid = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], subTickLine = subTickLine.asInstanceOf[js.Any], tickLine = tickLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grid]
  }
  
  extension [Self <: Grid](x: Self) {
    
    inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Offset): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setSubTickLine(value: Length): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    inline def setTickLine(value: Length): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
  }
}
