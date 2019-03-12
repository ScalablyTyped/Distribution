package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executable[T] extends js.Object {
  def all(): bluebirdLib.bluebirdMod.namespaced[js.Array[T]]
  def allWithin(tx: DatabaseConnection): bluebirdLib.bluebirdMod.namespaced[js.Array[T]]
  def exec(): bluebirdLib.bluebirdMod.namespaced[scala.Unit]
  def execWithin(tx: DatabaseConnection): bluebirdLib.bluebirdMod.namespaced[scala.Unit]
  def get(): bluebirdLib.bluebirdMod.namespaced[T]
  def getWithin(tx: DatabaseConnection): bluebirdLib.bluebirdMod.namespaced[T]
  def toQuery(): QueryLike
}

object Executable {
  @scala.inline
  def apply[T](
    all: () => bluebirdLib.bluebirdMod.namespaced[js.Array[T]],
    allWithin: DatabaseConnection => bluebirdLib.bluebirdMod.namespaced[js.Array[T]],
    exec: () => bluebirdLib.bluebirdMod.namespaced[scala.Unit],
    execWithin: DatabaseConnection => bluebirdLib.bluebirdMod.namespaced[scala.Unit],
    get: () => bluebirdLib.bluebirdMod.namespaced[T],
    getWithin: DatabaseConnection => bluebirdLib.bluebirdMod.namespaced[T],
    toQuery: () => QueryLike
  ): Executable[T] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[Executable[T]]
  }
}

