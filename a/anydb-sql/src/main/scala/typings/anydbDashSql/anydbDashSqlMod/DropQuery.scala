package typings.anydbDashSql.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropQuery extends Executable[Unit] {
  def ifExists(): Executable[Unit]
}

object DropQuery {
  @scala.inline
  def apply(
    all: () => typings.bluebird.bluebirdMod.^[js.Array[Unit]],
    allWithin: DatabaseConnection => typings.bluebird.bluebirdMod.^[js.Array[Unit]],
    exec: () => typings.bluebird.bluebirdMod.^[Unit],
    execWithin: DatabaseConnection => typings.bluebird.bluebirdMod.^[Unit],
    get: () => typings.bluebird.bluebirdMod.^[Unit],
    getWithin: DatabaseConnection => typings.bluebird.bluebirdMod.^[Unit],
    ifExists: () => Executable[Unit],
    toQuery: () => QueryLike
  ): DropQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), ifExists = js.Any.fromFunction0(ifExists), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[DropQuery]
  }
}

