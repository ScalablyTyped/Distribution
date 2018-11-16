package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModifyingQuery
  extends Executable[scala.Unit] {
  def returning[U](nodes: js.Any*): Query[U]
  def where(nodes: js.Any*): ModifyingQuery
}

