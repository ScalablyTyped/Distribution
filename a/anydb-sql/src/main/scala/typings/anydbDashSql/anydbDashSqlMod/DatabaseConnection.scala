package typings.anydbDashSql.anydbDashSqlMod

import typings.anydbDashSql.Anon_RowCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConnection extends js.Object {
  def queryAsync[T](query: String, params: js.Any*): typings.bluebird.bluebirdMod.^[Anon_RowCount[T]] = js.native
  def queryAsync[T](query: QueryLike): typings.bluebird.bluebirdMod.^[Anon_RowCount[T]] = js.native
}

