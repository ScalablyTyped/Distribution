package typings.anydbSql.mod

import typings.anydbSql.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDefinition extends js.Object {
  
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
  implicit class TableDefinitionOps[Self <: TableDefinition] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: Dictionary[ColumnDefinition]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas(value: Dictionary[From]): Self = this.set("has", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas: Self = this.set("has", js.undefined)
  }
}
