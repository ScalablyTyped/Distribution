package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ViewFields")
@js.native
class ViewFields protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var `Outlook.ViewFields_typekey`: ViewFields = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(PropertyName: String): ViewField = js.native
  def Insert(PropertyName: String, Index: js.Any): ViewField = js.native
  def Item(Index: js.Any): ViewField = js.native
  def Remove(Index: js.Any): Unit = js.native
}

