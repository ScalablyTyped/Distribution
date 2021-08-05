package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineData extends StObject {
  
  /** Number indicating the zero-indexed buffer index of a line. */
  var bufferRow: Double
  
  /** Number indicating the zero-indexed screen index. */
  var screenRow: Double
}
object LineData {
  
  inline def apply(bufferRow: Double, screenRow: Double): LineData = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineData]
  }
  
  extension [Self <: LineData](x: Self) {
    
    inline def setBufferRow(value: Double): Self = StObject.set(x, "bufferRow", value.asInstanceOf[js.Any])
    
    inline def setScreenRow(value: Double): Self = StObject.set(x, "screenRow", value.asInstanceOf[js.Any])
  }
}
