package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubQuery[T] extends js.Object {
  def exists(): BinaryNode
  def from(table: TableNode): SubQuery[T]
  def group(nodes: js.Any*): Group[SubQuery[T]]
  def notExists(subQuery: SubQuery[_]): BinaryNode
  def order(criteria: OrderByValueNode): SubQuery[T]
  def select(node: Column[T]): SubQuery[T]
  def where(nodes: js.Any*): SubQuery[T]
}

object SubQuery {
  @scala.inline
  def apply[T](
    exists: js.Function0[BinaryNode],
    from: js.Function1[TableNode, SubQuery[T]],
    group: js.Function1[/* repeated */ js.Any, Group[SubQuery[T]]],
    notExists: js.Function1[SubQuery[_], BinaryNode],
    order: js.Function1[OrderByValueNode, SubQuery[T]],
    select: js.Function1[Column[T], SubQuery[T]],
    where: js.Function1[/* repeated */ js.Any, SubQuery[T]]
  ): SubQuery[T] = {
    val __obj = js.Dynamic.literal(exists = exists, from = from, group = group, notExists = notExists, order = order, select = select, where = where)
  
    __obj.asInstanceOf[SubQuery[T]]
  }
}

