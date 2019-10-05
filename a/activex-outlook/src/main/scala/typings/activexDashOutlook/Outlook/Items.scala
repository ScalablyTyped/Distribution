package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Items")
@js.native
class Items protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var IncludeRecurrences: Boolean = js.native
  var `Outlook.Items_typekey`: Items = js.native
  val Parent: js.Any = js.native
  val RawTable: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(): js.Any = js.native
  def Add(Type: js.Any): js.Any = js.native
  def Find(Filter: String): js.Any = js.native
  def FindNext(): js.Any = js.native
  def GetFirst(): js.Any = js.native
  def GetLast(): js.Any = js.native
  def GetNext(): js.Any = js.native
  def GetPrevious(): js.Any = js.native
  def Item(Index: js.Any): js.Any = js.native
  def Remove(Index: Double): Unit = js.native
  def ResetColumns(): Unit = js.native
  def Restrict(Filter: String): Items = js.native
  def SetColumns(Columns: String): Unit = js.native
  def Sort(Property: String): Unit = js.native
  def Sort(Property: String, Descending: js.Any): Unit = js.native
}

