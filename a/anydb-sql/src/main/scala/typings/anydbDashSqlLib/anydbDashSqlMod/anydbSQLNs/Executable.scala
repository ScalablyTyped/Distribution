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

