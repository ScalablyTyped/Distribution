package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Results")
@js.native
class Results protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var DefaultItemType: OlItemType = js.native
  var `Outlook.Results_typekey`: Results = js.native
  val Parent: js.Any = js.native
  val RawTable: js.Any = js.native
  val Session: NameSpace = js.native
  def GetFirst(): js.Any = js.native
  def GetLast(): js.Any = js.native
  def GetNext(): js.Any = js.native
  def GetPrevious(): js.Any = js.native
  def Item(Index: js.Any): js.Any = js.native
  def ResetColumns(): scala.Unit = js.native
  def SetColumns(Columns: java.lang.String): scala.Unit = js.native
  def Sort(Property: java.lang.String): scala.Unit = js.native
  def Sort(Property: java.lang.String, Descending: js.Any): scala.Unit = js.native
}

