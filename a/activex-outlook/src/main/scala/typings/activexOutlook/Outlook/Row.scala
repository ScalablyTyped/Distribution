package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Row")
@js.native
class Row protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  @JSName("Outlook.Row_typekey")
  var OutlookDotRow_typekey: Row = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def BinaryToString(Index: js.Any): String = js.native
  def GetValues(): js.Any = js.native
  def Item(Index: js.Any): js.Any = js.native
  def LocalTimeToUTC(Index: js.Any): VarDate = js.native
  def UTCToLocalTime(Index: js.Any): VarDate = js.native
}

