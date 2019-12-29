package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Categories")
@js.native
class Categories protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Categories_typekey")
  var OutlookDotCategories_typekey: Categories = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String): Category = js.native
  def Add(Name: String, Color: js.Any): Category = js.native
  def Add(Name: String, Color: js.Any, ShortcutKey: js.Any): Category = js.native
  def Item(Index: js.Any): Category = js.native
  def Remove(Index: js.Any): Unit = js.native
}

