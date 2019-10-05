package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Recipients")
@js.native
class Recipients protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var `Outlook.Recipients_typekey`: Recipients = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String): Recipient = js.native
  def Item(Index: js.Any): Recipient = js.native
  def Remove(Index: Double): Unit = js.native
  def ResolveAll(): Boolean = js.native
}

