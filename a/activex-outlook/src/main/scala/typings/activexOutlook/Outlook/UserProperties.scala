package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.UserProperties")
@js.native
class UserProperties protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.UserProperties_typekey")
  var OutlookDotUserProperties_typekey: UserProperties = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String, Type: OlUserPropertyType): UserProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: js.Any): UserProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: js.Any, DisplayFormat: js.Any): UserProperty = js.native
  def Find(Name: String): UserProperty = js.native
  def Find(Name: String, Custom: js.Any): UserProperty = js.native
  def Item(Index: js.Any): UserProperty = js.native
  def Remove(Index: Double): Unit = js.native
}

