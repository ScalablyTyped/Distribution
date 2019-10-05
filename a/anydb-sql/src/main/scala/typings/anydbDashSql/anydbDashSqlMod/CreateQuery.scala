package typings.anydbDashSql.anydbDashSqlMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQuery extends Executable[Unit] {
  def ifNotExists(): Executable[Unit]
}

object CreateQuery {
  @scala.inline
  def apply(
    all: () => ^[js.Array[Unit]],
    allWithin: DatabaseConnection => ^[js.Array[Unit]],
    exec: () => ^[Unit],
    execWithin: DatabaseConnection => ^[Unit],
    get: () => ^[Unit],
    getWithin: DatabaseConnection => ^[Unit],
    ifNotExists: () => Executable[Unit],
    toQuery: () => QueryLike
  ): CreateQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), ifNotExists = js.Any.fromFunction0(ifNotExists), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[CreateQuery]
  }
}

