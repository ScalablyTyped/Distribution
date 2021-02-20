package typings.anydbSql.mod

import typings.anydbSql.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDefinition extends StObject {
  
  var columns: Dictionary[ColumnDefinition] = js.native
  
  var has: js.UndefOr[Dictionary[From]] = js.native
  
  var name: String = js.native
}
object TableDefinition {
  
  @scala.inline
  def apply(columns: Dictionary[ColumnDefinition], name: String): TableDefinition = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDefinition]
  }
  
  @scala.inline
  implicit class TableDefinitionMutableBuilder[Self <: TableDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Dictionary[ColumnDefinition]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas(value: Dictionary[From]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
