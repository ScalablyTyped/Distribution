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

