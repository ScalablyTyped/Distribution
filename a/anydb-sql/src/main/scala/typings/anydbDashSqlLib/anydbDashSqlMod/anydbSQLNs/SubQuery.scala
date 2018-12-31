package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubQuery[T] extends js.Object {
  def exists(): BinaryNode
  def from(table: TableNode): SubQuery[T]
  def group(nodes: js.Any*): Group[SubQuery[T]]
  def notExists(subQuery: SubQuery[_]): BinaryNode
  def order(criteria: OrderByValueNode): SubQuery[T]
  def select(node: Column[T]): SubQuery[T]
  def where(nodes: js.Any*): SubQuery[T]
}

