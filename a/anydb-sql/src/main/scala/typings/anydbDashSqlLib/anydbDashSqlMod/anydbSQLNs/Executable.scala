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
    all: js.Function0[bluebirdLib.bluebirdMod.namespaced[js.Array[T]]],
    allWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[js.Array[T]]],
    exec: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    execWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    get: js.Function0[bluebirdLib.bluebirdMod.namespaced[T]],
    getWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[T]],
    toQuery: js.Function0[QueryLike]
  ): Executable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("allWithin")(allWithin)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("execWithin")(execWithin)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getWithin")(getWithin)
    __obj.updateDynamic("toQuery")(toQuery)
    __obj.asInstanceOf[Executable[T]]
  }
}

