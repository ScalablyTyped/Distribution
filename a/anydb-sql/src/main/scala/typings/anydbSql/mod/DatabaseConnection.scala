package typings.anydbSql.mod

import typings.anydbSql.AnonRowCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConnection extends js.Object {
  def queryAsync[T](query: String, params: js.Any*): typings.bluebird.mod.^[AnonRowCount[T]] = js.native
  def queryAsync[T](query: QueryLike): typings.bluebird.mod.^[AnonRowCount[T]] = js.native
}

