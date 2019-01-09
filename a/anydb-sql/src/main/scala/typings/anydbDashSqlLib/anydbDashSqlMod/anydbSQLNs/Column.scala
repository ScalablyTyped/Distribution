package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column[T] extends js.Object {
  var asc: OrderByValueNode = js.native
  var ascending: OrderByValueNode = js.native
  var desc: OrderByValueNode = js.native
  var descending: OrderByValueNode = js.native
  @JSName("multiply")
  var multiply_Original: anydbDashSqlLib.Anon_N[T] = js.native
  var name: java.lang.String = js.native
  var table: Table[_] = js.native
  def as(name: java.lang.String): Column[T] = js.native
  def count(): Column[scala.Double] = js.native
  def count(name: java.lang.String): Column[scala.Double] = js.native
  def distinct(): Column[T] = js.native
  def equals(node: js.Any): BinaryNode = js.native
  def gt(node: js.Any): BinaryNode = js.native
  def gte(node: js.Any): BinaryNode = js.native
  def in(arr: js.Array[T]): BinaryNode = js.native
  def in(subQuery: SubQuery[T]): BinaryNode = js.native
  def isNotNull(): BinaryNode = js.native
  def isNull(): BinaryNode = js.native
  def like(str: java.lang.String): BinaryNode = js.native
  def lt(node: js.Any): BinaryNode = js.native
  def lte(node: js.Any): BinaryNode = js.native
  def max(): Column[T] = js.native
  def max(name: java.lang.String): Column[T] = js.native
  def min(): Column[T] = js.native
  def min(name: java.lang.String): Column[T] = js.native
  def multiply(node: Column[T]): Column[T] = js.native
  def multiply(n: scala.Double): Column[scala.Double] = js.native
  def notEquals(node: js.Any): BinaryNode = js.native
  def notIn(arr: js.Array[T]): BinaryNode = js.native
  def sum(): Column[scala.Double] = js.native
}

