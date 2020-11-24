package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineData extends js.Object {
  
  /** Number indicating the zero-indexed buffer index of a line. */
  var bufferRow: Double = js.native
  
  /** Number indicating the zero-indexed screen index. */
  var screenRow: Double = js.native
}
object LineData {
  
  @scala.inline
  def apply(bufferRow: Double, screenRow: Double): LineData = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineData]
  }
  
  @scala.inline
  implicit class LineDataOps[Self <: LineData] (val x: Self) extends AnyVal {
    
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
    def setBufferRow(value: Double): Self = this.set("bufferRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenRow(value: Double): Self = this.set("screenRow", value.asInstanceOf[js.Any])
  }
}
