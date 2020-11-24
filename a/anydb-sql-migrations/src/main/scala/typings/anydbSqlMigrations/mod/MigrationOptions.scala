package typings.anydbSqlMigrations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationOptions extends js.Object {
  
  var check: js.UndefOr[Boolean] = js.native
  
  var drop: js.UndefOr[Boolean] = js.native
  
  var execute: js.UndefOr[Boolean] = js.native
  
  var rollback: js.UndefOr[Boolean] = js.native
}
object MigrationOptions {
  
  @scala.inline
  def apply(): MigrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationOptions]
  }
  
  @scala.inline
  implicit class MigrationOptionsOps[Self <: MigrationOptions] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setDrop(value: Boolean): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setExecute(value: Boolean): Self = this.set("execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    
    @scala.inline
    def setRollback(value: Boolean): Self = this.set("rollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollback: Self = this.set("rollback", js.undefined)
  }
}
