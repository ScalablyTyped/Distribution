package typings.anydbDashSql.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubQuery[T] extends js.Object {
  def exists(): BinaryNode = js.native
  def from(statement: String): SubQuery[T] = js.native
  def from(table: TableNode): SubQuery[T] = js.native
  def group(nodes: js.Any*): Group[SubQuery[T]] = js.native
  @JSName("group")
  def group_GroupSubQuery(nodes: js.Any*): GroupSubQuery[T] = js.native
  def notExists(): BinaryNode = js.native
  def notExists(subQuery: SubQuery[_]): BinaryNode = js.native
  def order(criteria: OrderByValueNode): SubQuery[T] = js.native
  def select(nodes: js.Any*): SubQuery[T] = js.native
  def select(node: Column[T]): SubQuery[T] = js.native
  def where(nodes: js.Any*): SubQuery[T] = js.native
}

