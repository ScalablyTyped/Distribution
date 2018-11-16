package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Recipients")
@js.native
class Recipients protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.Recipients_typekey`: Recipients = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: java.lang.String): Recipient = js.native
  def Item(Index: js.Any): Recipient = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
  def ResolveAll(): scala.Boolean = js.native
}

