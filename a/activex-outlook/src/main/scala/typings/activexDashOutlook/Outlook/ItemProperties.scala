package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ItemProperties")
@js.native
class ItemProperties protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var `Outlook.ItemProperties_typekey`: ItemProperties = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String, Type: OlUserPropertyType): ItemProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: js.Any): ItemProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: js.Any, DisplayFormat: js.Any): ItemProperty = js.native
  def Item(Index: js.Any): ItemProperty = js.native
  def Remove(Index: Double): Unit = js.native
}

