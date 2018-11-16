package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Items")
@js.native
class Items protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var IncludeRecurrences: scala.Boolean = js.native
  var `Outlook.Items_typekey`: Items = js.native
  val Parent: js.Any = js.native
  val RawTable: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(): js.Any = js.native
  def Add(Type: js.Any): js.Any = js.native
  def Find(Filter: java.lang.String): js.Any = js.native
  def FindNext(): js.Any = js.native
  def GetFirst(): js.Any = js.native
  def GetLast(): js.Any = js.native
  def GetNext(): js.Any = js.native
  def GetPrevious(): js.Any = js.native
  def Item(Index: js.Any): js.Any = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
  def ResetColumns(): scala.Unit = js.native
  def Restrict(Filter: java.lang.String): Items = js.native
  def SetColumns(Columns: java.lang.String): scala.Unit = js.native
  def Sort(Property: java.lang.String): scala.Unit = js.native
  def Sort(Property: java.lang.String, Descending: js.Any): scala.Unit = js.native
}

