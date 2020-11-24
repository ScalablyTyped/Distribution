package typings.anydbSqlMigrations.anon

import typings.anydbSqlMigrations.mod.MigrationOptions
import typings.anydbSqlMigrations.mod.MigrationTask
import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Check extends js.Object {
  
  def check(f: js.Function1[/* items */ js.Array[MigrationTask], _]): ^[_] = js.native
  
  def drop(): ^[_] = js.native
  
  def execMigrations(migrationOptions: MigrationOptions): ^[Unit] = js.native
  
  def migrate(): ^[_] = js.native
  
  def run(): ^[_] = js.native
  
  def undoLast(): ^[_] = js.native
}
object Check {
  
  @scala.inline
  def apply(
    check: js.Function1[/* items */ js.Array[MigrationTask], _] => ^[_],
    drop: () => ^[_],
    execMigrations: MigrationOptions => ^[Unit],
    migrate: () => ^[_],
    run: () => ^[_],
    undoLast: () => ^[_]
  ): Check = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), drop = js.Any.fromFunction0(drop), execMigrations = js.Any.fromFunction1(execMigrations), migrate = js.Any.fromFunction0(migrate), run = js.Any.fromFunction0(run), undoLast = js.Any.fromFunction0(undoLast))
    __obj.asInstanceOf[Check]
  }
  
  @scala.inline
  implicit class CheckOps[Self <: Check] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: js.Function1[/* items */ js.Array[MigrationTask], _] => ^[_]): Self = this.set("check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrop(value: () => ^[_]): Self = this.set("drop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecMigrations(value: MigrationOptions => ^[Unit]): Self = this.set("execMigrations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMigrate(value: () => ^[_]): Self = this.set("migrate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRun(value: () => ^[_]): Self = this.set("run", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoLast(value: () => ^[_]): Self = this.set("undoLast", js.Any.fromFunction0(value))
  }
}
