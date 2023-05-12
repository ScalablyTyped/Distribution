package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: SerializedStyles
  
  var row: SerializedStyles
}
object Column {
  
  inline def apply(column: SerializedStyles, row: SerializedStyles): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: SerializedStyles): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: SerializedStyles): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
