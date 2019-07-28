package typings.anydbDashSql.anydbDashSqlMod

import typings.anydbDashSql.Fn_N
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
  var multiply_Original: Fn_N[T] = js.native
  var name: String = js.native
  var table: Table[_] = js.native
  def as(name: String): Column[T] = js.native
  def count(): Column[Double] = js.native
  def count(name: String): Column[Double] = js.native
  def distinct(): Column[T] = js.native
  def equals(node: js.Any): BinaryNode = js.native
  def gt(node: js.Any): BinaryNode = js.native
  def gte(node: js.Any): BinaryNode = js.native
  def in(arr: js.Array[T]): BinaryNode = js.native
  def in(subQuery: SubQuery[T]): BinaryNode = js.native
  def isNotNull(): BinaryNode = js.native
  def isNull(): BinaryNode = js.native
  def like(str: String): BinaryNode = js.native
  def lt(node: js.Any): BinaryNode = js.native
  def lte(node: js.Any): BinaryNode = js.native
  def max(): Column[T] = js.native
  def max(name: String): Column[T] = js.native
  def min(): Column[T] = js.native
  def min(name: String): Column[T] = js.native
  def multiply(node: Column[T]): Column[T] = js.native
  def multiply(n: Double): Column[Double] = js.native
  def notEquals(node: js.Any): BinaryNode = js.native
  def notIn(arr: js.Array[T]): BinaryNode = js.native
  def sum(): Column[Double] = js.native
}

