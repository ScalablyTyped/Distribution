package typings.anydbSqlMigrations.mod

import typings.anydbSql.mod.Column
import typings.anydbSql.mod.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsTable extends Table[Migration] {
  
  var version: Column[String] = js.native
}
