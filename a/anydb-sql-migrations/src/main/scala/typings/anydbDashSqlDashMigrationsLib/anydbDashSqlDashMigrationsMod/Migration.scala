package typings
package anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migration extends js.Object {
  var version: java.lang.String
}

object Migration {
  @scala.inline
  def apply(version: java.lang.String): Migration = {
    val __obj = js.Dynamic.literal(version = version)
  
    __obj.asInstanceOf[Migration]
  }
}

