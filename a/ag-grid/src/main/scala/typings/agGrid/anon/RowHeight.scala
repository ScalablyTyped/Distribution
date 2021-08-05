package typings.agGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowHeight extends StObject {
  
  var rowHeight: Double
  
  var rowTop: Double
}
object RowHeight {
  
  inline def apply(rowHeight: Double, rowTop: Double): RowHeight = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowTop = rowTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeight]
  }
  
  extension [Self <: RowHeight](x: Self) {
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowTop(value: Double): Self = StObject.set(x, "rowTop", value.asInstanceOf[js.Any])
  }
}
