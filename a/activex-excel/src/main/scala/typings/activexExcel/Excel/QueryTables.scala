package typings.activexExcel.Excel

import typings.activexAdodb.ADODB.Recordset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryTables extends StObject {
  
  def apply(Index: String): QueryTable = js.native
  def apply(Index: Double): QueryTable = js.native
  
  def Add(Connection: String, Destination: Range): QueryTable = js.native
  def Add(Connection: String, Destination: Range, Sql: String): QueryTable = js.native
  def Add(Connection: Recordset, Destination: Range): QueryTable = js.native
  def Add(Connection: typings.activexDao.DAO.Recordset, Destination: Range): QueryTable = js.native
  def Add(Connection: QueryTable, Destination: Range): QueryTable = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): QueryTable = js.native
  def Item(Index: Double): QueryTable = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): QueryTable = js.native
}
