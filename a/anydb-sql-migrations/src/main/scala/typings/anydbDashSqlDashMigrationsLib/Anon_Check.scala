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
      js.Function1[
        /* items */ js.Array[anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod.MigrationTask], 
        _
      ], 
      bluebirdLib.bluebirdMod.namespaced[_]
    ],
    drop: js.Function0[bluebirdLib.bluebirdMod.namespaced[_]],
    execMigrations: js.Function1[
      anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod.MigrationOptions, 
      bluebirdLib.bluebirdMod.namespaced[scala.Unit]
    ],
    migrate: js.Function0[bluebirdLib.bluebirdMod.namespaced[_]],
    run: js.Function0[bluebirdLib.bluebirdMod.namespaced[_]],
    undoLast: js.Function0[bluebirdLib.bluebirdMod.namespaced[_]]
  ): Anon_Check = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(check)
    __obj.updateDynamic("drop")(drop)
    __obj.updateDynamic("execMigrations")(execMigrations)
    __obj.updateDynamic("migrate")(migrate)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("undoLast")(undoLast)
    __obj.asInstanceOf[Anon_Check]
  }
}

