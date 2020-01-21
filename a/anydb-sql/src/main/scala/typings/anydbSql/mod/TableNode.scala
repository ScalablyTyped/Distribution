package typings.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNode extends js.Object {
  def join(table: TableNode): JoinTableNode
  def leftJoin(table: TableNode): JoinTableNode
}

object TableNode {
  @scala.inline
  def apply(join: TableNode => JoinTableNode, leftJoin: TableNode => JoinTableNode): TableNode = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction1(join), leftJoin = js.Any.fromFunction1(leftJoin))
  
    __obj.asInstanceOf[TableNode]
  }
}

