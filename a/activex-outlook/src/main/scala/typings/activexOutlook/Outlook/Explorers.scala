package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Explorers")
@js.native
class Explorers protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Explorers_typekey")
  var OutlookDotExplorers_typekey: Explorers = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Folder: js.Any, DisplayMode: OlFolderDisplayMode): Explorer = js.native
  def Item(Index: js.Any): Explorer = js.native
}

