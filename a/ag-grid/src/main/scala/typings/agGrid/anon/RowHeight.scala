package typings.agGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowHeight extends StObject {
  
  var rowHeight: Double = js.native
  
  var rowTop: Double = js.native
}
object RowHeight {
  
  @scala.inline
  def apply(rowHeight: Double, rowTop: Double): RowHeight = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowTop = rowTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeight]
  }
  
  @scala.inline
  implicit class RowHeightMutableBuilder[Self <: RowHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTop(value: Double): Self = StObject.set(x, "rowTop", value.asInstanceOf[js.Any])
  }
}
