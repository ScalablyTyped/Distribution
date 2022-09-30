package typings.aceBuilds.anon

import typings.aceBuilds.aceBuildsInts.`-1`
import typings.aceBuilds.aceBuildsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetX extends StObject {
  
  var column: Double
  
  var offsetX: Double
  
  var row: Double
  
  var side: `1` | `-1`
}
object OffsetX {
  
  inline def apply(column: Double, offsetX: Double, row: Double, side: `1` | `-1`): OffsetX = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetX]
  }
  
  extension [Self <: OffsetX](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSide(value: `1` | `-1`): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
