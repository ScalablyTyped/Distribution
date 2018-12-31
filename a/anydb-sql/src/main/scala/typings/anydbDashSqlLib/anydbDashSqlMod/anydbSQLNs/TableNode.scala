package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNode extends js.Object {
  def join(table: TableNode): JoinTableNode
  def leftJoin(table: TableNode): JoinTableNode
}

