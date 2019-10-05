package typings.anydbDashSql.anydbDashSqlMod

import typings.anydbDashSql.Anon_LOWER
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnydbSql extends DatabaseConnection {
  var functions: Anon_LOWER = js.native
  var models: Dictionary[Table[_]] = js.native
  def allOf(tables: Table[_]*): js.Any = js.native
  def begin(): Transaction = js.native
  def close(): Unit = js.native
  def define[T](map: TableDefinition): Table[T] = js.native
  def dialect(): String = js.native
  def getPool(): AnyDBPool = js.native
  def makeFunction(name: String): js.Function = js.native
  def open(): Unit = js.native
  def transaction[T](fn: js.Function1[/* tx */ Transaction, ^[T]]): ^[T] = js.native
}

