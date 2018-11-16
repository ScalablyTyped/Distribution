package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Table")
@js.native
class Table protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Columns: Columns = js.native
  val EndOfTable: scala.Boolean = js.native
  var `Outlook.Table_typekey`: Table = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def FindNextRow(): Row = js.native
  def FindRow(Filter: java.lang.String): Row = js.native
  def GetArray(MaxRows: scala.Double): js.Any = js.native
  def GetNextRow(): Row = js.native
  def GetRowCount(): scala.Double = js.native
  def MoveToStart(): scala.Unit = js.native
  def Restrict(Filter: java.lang.String): Table = js.native
  def Sort(SortProperty: java.lang.String): scala.Unit = js.native
  def Sort(SortProperty: java.lang.String, Descending: js.Any): scala.Unit = js.native
}

