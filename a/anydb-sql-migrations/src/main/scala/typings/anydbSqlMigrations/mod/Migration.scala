package typings.anydbSqlMigrations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migration extends js.Object {
  var version: String
}

object Migration {
  @scala.inline
  def apply(version: String): Migration = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Migration]
  }
}

