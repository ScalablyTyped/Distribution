package typings.activexDashOutlook.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Table")
@js.native
class Table protected () extends js.Object {
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Columns: typings.activexDashOutlook.OutlookNs.Columns = js.native
  val EndOfTable: Boolean = js.native
  var `Outlook.Table_typekey`: Table = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def FindNextRow(): Row = js.native
  def FindRow(Filter: String): Row = js.native
  def GetArray(MaxRows: Double): js.Any = js.native
  def GetNextRow(): Row = js.native
  def GetRowCount(): Double = js.native
  def MoveToStart(): Unit = js.native
  def Restrict(Filter: String): Table = js.native
  def Sort(SortProperty: String): Unit = js.native
  def Sort(SortProperty: String, Descending: js.Any): Unit = js.native
}

