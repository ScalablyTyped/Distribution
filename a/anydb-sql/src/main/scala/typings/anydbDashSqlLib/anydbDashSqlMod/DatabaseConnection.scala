package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConnection extends js.Object {
  def queryAsync[T](query: QueryLike): bluebirdLib.bluebirdMod.^[anydbDashSqlLib.Anon_RowCount[T]] = js.native
  def queryAsync[T](query: java.lang.String, params: js.Any*): bluebirdLib.bluebirdMod.^[anydbDashSqlLib.Anon_RowCount[T]] = js.native
}

