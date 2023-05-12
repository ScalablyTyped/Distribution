package typings.atlaskitPrimitives.anon

import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.column
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  val column: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.column
  
  val row: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.row
}
object Column {
  
  inline def apply(): Column = {
    val __obj = js.Dynamic.literal(column = "column", row = "row")
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
