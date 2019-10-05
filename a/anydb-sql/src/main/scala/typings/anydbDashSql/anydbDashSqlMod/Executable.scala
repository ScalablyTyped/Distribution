package typings.anydbDashSql.anydbDashSqlMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executable[T] extends js.Object {
  def all(): ^[js.Array[T]]
  def allWithin(tx: DatabaseConnection): ^[js.Array[T]]
  def exec(): ^[Unit]
  def execWithin(tx: DatabaseConnection): ^[Unit]
  def get(): ^[T]
  def getWithin(tx: DatabaseConnection): ^[T]
  def toQuery(): QueryLike
}

object Executable {
  @scala.inline
  def apply[T](
    all: () => ^[js.Array[T]],
    allWithin: DatabaseConnection => ^[js.Array[T]],
    exec: () => ^[Unit],
    execWithin: DatabaseConnection => ^[Unit],
    get: () => ^[T],
    getWithin: DatabaseConnection => ^[T],
    toQuery: () => QueryLike
  ): Executable[T] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[Executable[T]]
  }
}

