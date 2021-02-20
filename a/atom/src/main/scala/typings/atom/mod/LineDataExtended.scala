package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineDataExtended extends LineData {
  
  /** Boolean that is true if a fold may be created here. */
  var foldable: Boolean = js.native
  
  /** Number the maximum number of digits necessary to represent any known screen row. */
  var maxDigits: Double = js.native
  
  /** Boolean if this screen row is the soft-wrapped continuation of the same buffer row. */
  var softWrapped: Boolean = js.native
}
object LineDataExtended {
  
  @scala.inline
  def apply(bufferRow: Double, foldable: Boolean, maxDigits: Double, screenRow: Double, softWrapped: Boolean): LineDataExtended = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], foldable = foldable.asInstanceOf[js.Any], maxDigits = maxDigits.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any], softWrapped = softWrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDataExtended]
  }
  
  @scala.inline
  implicit class LineDataExtendedMutableBuilder[Self <: LineDataExtended] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFoldable(value: Boolean): Self = StObject.set(x, "foldable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDigits(value: Double): Self = StObject.set(x, "maxDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftWrapped(value: Boolean): Self = StObject.set(x, "softWrapped", value.asInstanceOf[js.Any])
  }
}
