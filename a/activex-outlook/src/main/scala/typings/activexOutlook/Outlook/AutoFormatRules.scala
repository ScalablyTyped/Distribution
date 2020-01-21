package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AutoFormatRules")
@js.native
class AutoFormatRules protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.AutoFormatRules_typekey")
  var OutlookDotAutoFormatRules_typekey: AutoFormatRules = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String): AutoFormatRule = js.native
  def Insert(Name: String, Index: js.Any): AutoFormatRule = js.native
  def Item(Index: js.Any): AutoFormatRule = js.native
  def Remove(Index: js.Any): Unit = js.native
  def RemoveAll(): Unit = js.native
  def Save(): Unit = js.native
}

