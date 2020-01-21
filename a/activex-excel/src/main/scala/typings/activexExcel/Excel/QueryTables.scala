package typings.activexExcel.Excel

import typings.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTables extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): QueryTable = js.native
  def apply(Index: Double): QueryTable = js.native
  def Add(Connection: String, Destination: Range): QueryTable = js.native
  def Add(Connection: String, Destination: Range, Sql: String): QueryTable = js.native
  def Add(Connection: Recordset, Destination: Range): QueryTable = js.native
  def Add(Connection: typings.activexDao.DAO.Recordset, Destination: Range): QueryTable = js.native
  def Add(Connection: QueryTable, Destination: Range): QueryTable = js.native
  def Item(Index: String): QueryTable = js.native
  def Item(Index: Double): QueryTable = js.native
  def _Default(Index: js.Any): QueryTable = js.native
}

