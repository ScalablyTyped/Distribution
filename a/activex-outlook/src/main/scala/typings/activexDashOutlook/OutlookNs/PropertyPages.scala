package typings.activexDashOutlook.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.PropertyPages")
@js.native
class PropertyPages protected () extends js.Object {
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var `Outlook.PropertyPages_typekey`: PropertyPages = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Page: js.Any, Title: String): Unit = js.native
  def Item(Index: js.Any): js.Any = js.native
  def Remove(Index: js.Any): Unit = js.native
}

