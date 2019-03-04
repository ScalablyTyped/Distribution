package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNode extends js.Object {
  def join(table: TableNode): JoinTableNode
  def leftJoin(table: TableNode): JoinTableNode
}

object TableNode {
  @scala.inline
  def apply(join: js.Function1[TableNode, JoinTableNode], leftJoin: js.Function1[TableNode, JoinTableNode]): TableNode = {
    val __obj = js.Dynamic.literal(join = join, leftJoin = leftJoin)
  
    __obj.asInstanceOf[TableNode]
  }
}

