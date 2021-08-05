package typings.anydbSql.mod

import typings.anydbSql.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDefinition extends StObject {
  
  var columns: Dictionary[ColumnDefinition]
  
  var has: js.UndefOr[Dictionary[From]] = js.undefined
  
  var name: String
}
object TableDefinition {
  
  inline def apply(columns: Dictionary[ColumnDefinition], name: String): TableDefinition = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDefinition]
  }
  
  extension [Self <: TableDefinition](x: Self) {
    
    inline def setColumns(value: Dictionary[ColumnDefinition]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setHas(value: Dictionary[From]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
    
    inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
