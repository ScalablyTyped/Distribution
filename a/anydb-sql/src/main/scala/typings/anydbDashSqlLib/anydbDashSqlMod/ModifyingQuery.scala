package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyingQuery
  extends Executable[scala.Unit] {
  def returning[U](nodes: js.Any*): Query[U]
  def where(nodes: js.Any*): ModifyingQuery
}

object ModifyingQuery {
  @scala.inline
  def apply(
    all: () => bluebirdLib.bluebirdMod.^[js.Array[scala.Unit]],
    allWithin: DatabaseConnection => bluebirdLib.bluebirdMod.^[js.Array[scala.Unit]],
    exec: () => bluebirdLib.bluebirdMod.^[scala.Unit],
    execWithin: DatabaseConnection => bluebirdLib.bluebirdMod.^[scala.Unit],
    get: () => bluebirdLib.bluebirdMod.^[scala.Unit],
    getWithin: DatabaseConnection => bluebirdLib.bluebirdMod.^[scala.Unit],
    returning: /* repeated */ js.Any => Query[js.Any],
    toQuery: () => QueryLike,
    where: /* repeated */ js.Any => ModifyingQuery
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), returning = js.Any.fromFunction1(returning), toQuery = js.Any.fromFunction0(toQuery), where = js.Any.fromFunction1(where))
  
    __obj.asInstanceOf[ModifyingQuery]
  }
}

