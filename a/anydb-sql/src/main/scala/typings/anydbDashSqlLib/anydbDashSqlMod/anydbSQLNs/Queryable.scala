package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queryable[T] extends js.Object {
  def delete(): ModifyingQuery
  def select[U](nodes: js.Any*): Query[U]
  def selectDeep[U](nodesOrTables: js.Any*): Query[U]
  def where(nodes: js.Any*): Query[T]
}

