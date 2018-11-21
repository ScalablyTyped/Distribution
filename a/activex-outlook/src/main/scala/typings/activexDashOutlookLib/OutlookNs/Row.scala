package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Row")
@js.native
class Row protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  var `Outlook.Row_typekey`: Row = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def BinaryToString(Index: js.Any): java.lang.String = js.native
  def GetValues(): js.Any = js.native
  def Item(Index: js.Any): js.Any = js.native
  def LocalTimeToUTC(Index: js.Any): activexDashInteropLib.VarDate = js.native
  def UTCToLocalTime(Index: js.Any): activexDashInteropLib.VarDate = js.native
}

