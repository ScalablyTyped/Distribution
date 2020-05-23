package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Row")
@js.native
class Row protected ()
  extends typings.activexOutlook.Outlook.Row {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  @JSName("Outlook.Row_typekey")
  override var OutlookDotRow_typekey: typings.activexOutlook.Outlook.Row = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def BinaryToString(Index: js.Any): String = js.native
  /* CompleteClass */
  override def GetValues(): js.Any = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): js.Any = js.native
  /* CompleteClass */
  override def LocalTimeToUTC(Index: js.Any): VarDate = js.native
  /* CompleteClass */
  override def UTCToLocalTime(Index: js.Any): VarDate = js.native
}

