package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Results")
@js.native
class Results protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var DefaultItemType: OlItemType = js.native
  @JSName("Outlook.Results_typekey")
  var OutlookDotResults_typekey: Results = js.native
  val Parent: js.Any = js.native
  val RawTable: js.Any = js.native
  val Session: NameSpace = js.native
  def GetFirst(): js.Any = js.native
  def GetLast(): js.Any = js.native
  def GetNext(): js.Any = js.native
  def GetPrevious(): js.Any = js.native
  def Item(Index: js.Any): js.Any = js.native
  def ResetColumns(): Unit = js.native
  def SetColumns(Columns: String): Unit = js.native
  def Sort(Property: String): Unit = js.native
  def Sort(Property: String, Descending: js.Any): Unit = js.native
}

