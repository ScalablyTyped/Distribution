package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queryable[T] extends js.Object {
  def delete(): ModifyingQuery
  def select[U](nodes: js.Any*): Query[U]
  def selectDeep[U](nodesOrTables: js.Any*): Query[U]
  def where(nodes: js.Any*): Query[T]
}

object Queryable {
  @scala.inline
  def apply[T](
    delete: () => ModifyingQuery,
    select: /* repeated */ js.Any => Query[js.Any],
    selectDeep: /* repeated */ js.Any => Query[js.Any],
    where: /* repeated */ js.Any => Query[T]
  ): Queryable[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), select = js.Any.fromFunction1(select), selectDeep = js.Any.fromFunction1(selectDeep), where = js.Any.fromFunction1(where))
  
    __obj.asInstanceOf[Queryable[T]]
  }
}

