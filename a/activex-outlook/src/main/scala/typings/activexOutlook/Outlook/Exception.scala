package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exception extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val AppointmentItem: typings.activexOutlook.Outlook.AppointmentItem
  val Class: OlObjectClass
  val Deleted: Boolean
  val ItemProperties: typings.activexOutlook.Outlook.ItemProperties
  val OriginalDate: VarDate
  @JSName("Outlook.Exception_typekey")
  var OutlookDotException_typekey: Exception
  val Parent: js.Any
  val Session: NameSpace
}

object Exception {
  @scala.inline
  def apply(
    Application: Application,
    AppointmentItem: AppointmentItem,
    Class: OlObjectClass,
    Deleted: Boolean,
    ItemProperties: ItemProperties,
    OriginalDate: VarDate,
    OutlookDotException_typekey: Exception,
    Parent: js.Any,
    Session: NameSpace
  ): Exception = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AppointmentItem = AppointmentItem.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Deleted = Deleted.asInstanceOf[js.Any], ItemProperties = ItemProperties.asInstanceOf[js.Any], OriginalDate = OriginalDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Exception_typekey")(OutlookDotException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
}

