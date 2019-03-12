package typings
package anydbDashSqlDashMigrationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Check extends js.Object {
  def check(
    f: js.Function1[
      /* items */ js.Array[anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod.MigrationTask], 
      _
    ]
  ): bluebirdLib.bluebirdMod.namespaced[_]
  def drop(): bluebirdLib.bluebirdMod.namespaced[_]
  def execMigrations(migrationOptions: anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod.MigrationOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit]
  def migrate(): bluebirdLib.bluebirdMod.namespaced[_]
  def run(): bluebirdLib.bluebirdMod.namespaced[_]
  def undoLast(): bluebirdLib.bluebirdMod.namespaced[_]
}

object Anon_Check {
  @scala.inline
  def apply(
    check: js.Function1[
      /* items */ js.Array[anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod.MigrationTask], 
      _
    ] => bluebirdLib.bluebirdMod.namespaced[_],
    drop: () => bluebirdLib.bluebirdMod.namespaced[_],
    execMigrations: anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod.MigrationOptions => bluebirdLib.bluebirdMod.namespaced[scala.Unit],
    migrate: () => bluebirdLib.bluebirdMod.namespaced[_],
    run: () => bluebirdLib.bluebirdMod.namespaced[_],
    undoLast: () => bluebirdLib.bluebirdMod.namespaced[_]
  ): Anon_Check = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), drop = js.Any.fromFunction0(drop), execMigrations = js.Any.fromFunction1(execMigrations), migrate = js.Any.fromFunction0(migrate), run = js.Any.fromFunction0(run), undoLast = js.Any.fromFunction0(undoLast))
  
    __obj.asInstanceOf[Anon_Check]
  }
}

