package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.UserDefinedProperties")
@js.native
class UserDefinedProperties protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.UserDefinedProperties_typekey")
  var OutlookDotUserDefinedProperties_typekey: UserDefinedProperties = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String, Type: OlUserPropertyType): UserDefinedProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, DisplayFormat: js.Any): UserDefinedProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, DisplayFormat: js.Any, Formula: js.Any): UserDefinedProperty = js.native
  def Find(Name: String): UserDefinedProperty = js.native
  def Item(Index: js.Any): UserDefinedProperty = js.native
  def Refresh(): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

