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
  
  @scala.inline
  def apply(bufferRow: Double, screenRow: Double): LineData = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineData]
  }
  
  @scala.inline
  implicit class LineDataMutableBuilder[Self <: LineData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferRow(value: Double): Self = StObject.set(x, "bufferRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenRow(value: Double): Self = StObject.set(x, "screenRow", value.asInstanceOf[js.Any])
  }
}
