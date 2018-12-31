package typings
package anydbDashSqlDashMigrationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UndoLast extends js.Object {
  var check: js.Function1[
    /* f */ js.Function1[
      /* items */ js.Array[anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod.MigrationTask], 
      _
    ], 
    bluebirdLib.bluebirdMod.namespaced[_]
  ]
  var drop: js.Function0[bluebirdLib.bluebirdMod.namespaced[_]]
  var execMigrations: js.Function1[
    /* migrationOptions */ anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod.MigrationOptions, 
    bluebirdLib.bluebirdMod.namespaced[scala.Unit]
  ]
  var migrate: js.Function0[bluebirdLib.bluebirdMod.namespaced[_]]
  var run: js.Function0[bluebirdLib.bluebirdMod.namespaced[_]]
  var undoLast: js.Function0[bluebirdLib.bluebirdMod.namespaced[_]]
}

