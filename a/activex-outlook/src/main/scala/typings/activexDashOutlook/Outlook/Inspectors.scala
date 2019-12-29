package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Inspectors")
@js.native
class Inspectors protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Inspectors_typekey")
  var OutlookDotInspectors_typekey: Inspectors = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Item: js.Any): Inspector = js.native
  def Item(Index: js.Any): Inspector = js.native
}

