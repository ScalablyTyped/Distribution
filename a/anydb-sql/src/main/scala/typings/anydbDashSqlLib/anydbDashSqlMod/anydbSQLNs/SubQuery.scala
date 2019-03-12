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
    exists: () => BinaryNode,
    from: TableNode => SubQuery[T],
    group: /* repeated */ js.Any => Group[SubQuery[T]],
    notExists: SubQuery[_] => BinaryNode,
    order: OrderByValueNode => SubQuery[T],
    select: Column[T] => SubQuery[T],
    where: /* repeated */ js.Any => SubQuery[T]
  ): SubQuery[T] = {
    val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), from = js.Any.fromFunction1(from), group = js.Any.fromFunction1(group), notExists = js.Any.fromFunction1(notExists), order = js.Any.fromFunction1(order), select = js.Any.fromFunction1(select), where = js.Any.fromFunction1(where))
  
    __obj.asInstanceOf[SubQuery[T]]
  }
}

