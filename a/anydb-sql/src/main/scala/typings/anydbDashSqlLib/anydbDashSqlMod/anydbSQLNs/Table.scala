package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[T]
  extends TableNode
     with Queryable[T] {
  var _name: java.lang.String = js.native
  var columns: js.Array[Column[_]] = js.native
  var eventEmitter: anydbDashSqlLib.Anon_Emit = js.native
  var sql: SQL = js.native
  def alter(): AlterQuery[T] = js.native
  def as(name: java.lang.String): Table[T] = js.native
  def create(): CreateQuery = js.native
  def drop(): DropQuery = js.native
  def from[U](table: TableNode): Query[U] = js.native
  def indexes(): IndexQuery = js.native
  def insert(row: T): ModifyingQuery = js.native
  def insert(rows: js.Array[T]): ModifyingQuery = js.native
  def select(): Query[T] = js.native
  def star(): Column[_] = js.native
  def subQuery[U](): SubQuery[U] = js.native
  def update(o: js.Any): ModifyingQuery = js.native
}

