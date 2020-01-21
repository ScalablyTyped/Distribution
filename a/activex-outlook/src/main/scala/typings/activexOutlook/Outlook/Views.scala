package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Views")
@js.native
class Views protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Views_typekey")
  var OutlookDotViews_typekey: Views = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String, ViewType: OlViewType, SaveOption: OlViewSaveOption): View = js.native
  def Item(Index: js.Any): View = js.native
  def Remove(Index: js.Any): Unit = js.native
}

