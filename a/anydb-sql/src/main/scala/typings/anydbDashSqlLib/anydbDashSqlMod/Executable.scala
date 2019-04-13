package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executable[T] extends js.Object {
  def all(): bluebirdLib.bluebirdMod.^[js.Array[T]]
  def allWithin(tx: DatabaseConnection): bluebirdLib.bluebirdMod.^[js.Array[T]]
  def exec(): bluebirdLib.bluebirdMod.^[scala.Unit]
  def execWithin(tx: DatabaseConnection): bluebirdLib.bluebirdMod.^[scala.Unit]
  def get(): bluebirdLib.bluebirdMod.^[T]
  def getWithin(tx: DatabaseConnection): bluebirdLib.bluebirdMod.^[T]
  def toQuery(): QueryLike
}

object Executable {
  @scala.inline
  def apply[T](
    all: () => bluebirdLib.bluebirdMod.^[js.Array[T]],
    allWithin: DatabaseConnection => bluebirdLib.bluebirdMod.^[js.Array[T]],
    exec: () => bluebirdLib.bluebirdMod.^[scala.Unit],
    execWithin: DatabaseConnection => bluebirdLib.bluebirdMod.^[scala.Unit],
    get: () => bluebirdLib.bluebirdMod.^[T],
    getWithin: DatabaseConnection => bluebirdLib.bluebirdMod.^[T],
    toQuery: () => QueryLike
  ): Executable[T] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[Executable[T]]
  }
}

