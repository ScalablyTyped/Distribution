package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTables extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): QueryTable = js.native
  def apply(Index: scala.Double): QueryTable = js.native
  def Add(Connection: activexDashAdodbLib.ADODBNs.Recordset, Destination: Range): QueryTable = js.native
  def Add(Connection: activexDashDaoLib.DAONs.Recordset, Destination: Range): QueryTable = js.native
  def Add(Connection: QueryTable, Destination: Range): QueryTable = js.native
  def Add(Connection: java.lang.String, Destination: Range): QueryTable = js.native
  def Add(Connection: java.lang.String, Destination: Range, Sql: java.lang.String): QueryTable = js.native
  def Item(Index: java.lang.String): QueryTable = js.native
  def Item(Index: scala.Double): QueryTable = js.native
  def _Default(Index: js.Any): QueryTable = js.native
}

