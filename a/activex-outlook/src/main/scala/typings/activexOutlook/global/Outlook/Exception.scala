package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Exception")
@js.native
class Exception protected ()
  extends typings.activexOutlook.Outlook.Exception {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val AppointmentItem: typings.activexOutlook.Outlook.AppointmentItem = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Deleted: Boolean = js.native
  /* CompleteClass */
  override val ItemProperties: typings.activexOutlook.Outlook.ItemProperties = js.native
  /* CompleteClass */
  override val OriginalDate: VarDate = js.native
  /* CompleteClass */
  @JSName("Outlook.Exception_typekey")
  override var OutlookDotException_typekey: typings.activexOutlook.Outlook.Exception = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

