package typings.anydbDashSqlDashMigrations

import typings.anydbDashSqlDashMigrations.anydbDashSqlDashMigrationsMod.MigrationOptions
import typings.anydbDashSqlDashMigrations.anydbDashSqlDashMigrationsMod.MigrationTask
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Check extends js.Object {
  def check(f: js.Function1[/* items */ js.Array[MigrationTask], _]): ^[_]
  def drop(): ^[_]
  def execMigrations(migrationOptions: MigrationOptions): ^[Unit]
  def migrate(): ^[_]
  def run(): ^[_]
  def undoLast(): ^[_]
}

object Anon_Check {
  @scala.inline
  def apply(
    check: js.Function1[/* items */ js.Array[MigrationTask], _] => ^[_],
    drop: () => ^[_],
    execMigrations: MigrationOptions => ^[Unit],
    migrate: () => ^[_],
    run: () => ^[_],
    undoLast: () => ^[_]
  ): Anon_Check = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), drop = js.Any.fromFunction0(drop), execMigrations = js.Any.fromFunction1(execMigrations), migrate = js.Any.fromFunction0(migrate), run = js.Any.fromFunction0(run), undoLast = js.Any.fromFunction0(undoLast))
  
    __obj.asInstanceOf[Anon_Check]
  }
}

