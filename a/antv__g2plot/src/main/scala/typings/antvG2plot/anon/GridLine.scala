package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLine extends StObject {
  
  var grid: Line
}
object GridLine {
  
  inline def apply(grid: Line): GridLine = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLine]
  }
  
  extension [Self <: GridLine](x: Self) {
    
    inline def setGrid(value: Line): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
  }
}
