package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineDataExtended
  extends StObject
     with LineData {
  
  /** Boolean that is true if a fold may be created here. */
  var foldable: Boolean
  
  /** Number the maximum number of digits necessary to represent any known screen row. */
  var maxDigits: Double
  
  /** Boolean if this screen row is the soft-wrapped continuation of the same buffer row. */
  var softWrapped: Boolean
}
object LineDataExtended {
  
  inline def apply(bufferRow: Double, foldable: Boolean, maxDigits: Double, screenRow: Double, softWrapped: Boolean): LineDataExtended = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], foldable = foldable.asInstanceOf[js.Any], maxDigits = maxDigits.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any], softWrapped = softWrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDataExtended]
  }
  
  extension [Self <: LineDataExtended](x: Self) {
    
    inline def setFoldable(value: Boolean): Self = StObject.set(x, "foldable", value.asInstanceOf[js.Any])
    
    inline def setMaxDigits(value: Double): Self = StObject.set(x, "maxDigits", value.asInstanceOf[js.Any])
    
    inline def setSoftWrapped(value: Boolean): Self = StObject.set(x, "softWrapped", value.asInstanceOf[js.Any])
  }
}
