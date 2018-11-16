package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterQuery[T]
  extends Executable[scala.Unit] {
  def addColumn(column: Column[_]): AlterQuery[T] = js.native
  def addColumn(name: java.lang.String, options: java.lang.String): AlterQuery[T] = js.native
  def dropColumn(column: Column[_]): AlterQuery[T] = js.native
  def dropColumn(column: java.lang.String): AlterQuery[T] = js.native
  def rename(newName: java.lang.String): AlterQuery[T] = js.native
  def renameColumn(column: Column[_], newColumn: Column[_]): AlterQuery[T] = js.native
  def renameColumn(column: Column[_], newName: java.lang.String): AlterQuery[T] = js.native
  def renameColumn(name: java.lang.String, newName: java.lang.String): AlterQuery[T] = js.native
}

