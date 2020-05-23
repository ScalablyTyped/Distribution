package typings.anydbSqlMigrations.anon

import typings.anydbSqlMigrations.mod.MigrationOptions
import typings.anydbSqlMigrations.mod.MigrationTask
import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Check extends js.Object {
  def check(f: js.Function1[/* items */ js.Array[MigrationTask], _]): ^[_]
  def drop(): ^[_]
  def execMigrations(migrationOptions: MigrationOptions): ^[Unit]
  def migrate(): ^[_]
  def run(): ^[_]
  def undoLast(): ^[_]
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
}

