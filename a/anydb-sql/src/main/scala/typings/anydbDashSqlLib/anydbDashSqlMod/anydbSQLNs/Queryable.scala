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

object Queryable {
  @scala.inline
  def apply[T](
    delete: js.Function0[ModifyingQuery],
    select: js.Function1[/* repeated */ js.Any, Query[js.Any]],
    selectDeep: js.Function1[/* repeated */ js.Any, Query[js.Any]],
    where: js.Function1[/* repeated */ js.Any, Query[T]]
  ): Queryable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("selectDeep")(selectDeep)
    __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[Queryable[T]]
  }
}

