package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[T]
  extends Executable[T]
     with Queryable[T] {
  def from(table: TableNode): Query[T] = js.native
  def group(nodes: js.Any*): Group[Query[T]] = js.native
  def limit(l: scala.Double): Query[T] = js.native
  def offset(o: scala.Double): Query[T] = js.native
  def order(criteria: OrderByValueNode*): Query[T] = js.native
  def update(o: Dictionary[_]): ModifyingQuery = js.native
  def update(o: js.Object): ModifyingQuery = js.native
}

