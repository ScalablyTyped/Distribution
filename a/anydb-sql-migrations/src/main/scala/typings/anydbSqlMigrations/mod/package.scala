package typings.anydbSqlMigrations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MigFn = js.Function1[/* tx */ typings.anydbSql.mod.Transaction, typings.bluebird.mod.^[js.Any]]
}
