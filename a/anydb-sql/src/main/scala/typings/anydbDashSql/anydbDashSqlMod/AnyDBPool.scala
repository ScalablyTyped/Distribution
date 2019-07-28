package typings.anydbDashSql.anydbDashSqlMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyDBPool extends DatabaseConnection {
  def begin(): Transaction = js.native
  def close(err: Error): Unit = js.native
  def query(
    text: String,
    values: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
}

