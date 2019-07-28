package typings.activexDashOutlook.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Columns")
@js.native
class Columns protected () extends js.Object {
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var `Outlook.Columns_typekey`: Columns = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String): Column = js.native
  def Item(Index: js.Any): Column = js.native
  def Remove(Index: js.Any): Unit = js.native
  def RemoveAll(): Unit = js.native
}

