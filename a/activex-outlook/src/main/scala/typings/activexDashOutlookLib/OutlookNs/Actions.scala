package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Actions")
@js.native
class Actions protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.Actions_typekey`: Actions = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(): Action = js.native
  def Item(Index: js.Any): Action = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

