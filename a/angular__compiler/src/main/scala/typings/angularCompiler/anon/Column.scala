package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: Double | Null
  
  var line: Double | Null
}
object Column {
  
  @scala.inline
  def apply(): Column = {
    val __obj = js.Dynamic.literal(column = null, line = null)
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNull: Self = StObject.set(x, "column", null)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNull: Self = StObject.set(x, "line", null)
  }
}
