package typings.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDefinition extends js.Object {
  
  var dataType: js.UndefOr[String] = js.native
  
  var notNull: js.UndefOr[Boolean] = js.native
  
  var primaryKey: js.UndefOr[Boolean] = js.native
  
  var references: js.UndefOr[typings.anydbSql.anon.Column] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object ColumnDefinition {
  
  @scala.inline
  def apply(): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinition]
  }
  
  @scala.inline
  implicit class ColumnDefinitionOps[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
    
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
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setNotNull(value: Boolean): Self = this.set("notNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotNull: Self = this.set("notNull", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setReferences(value: typings.anydbSql.anon.Column): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}
