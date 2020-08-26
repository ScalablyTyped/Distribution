package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Context information in case of a {@link FilePicker} event. */
@js.native
trait FilePickerEvent extends EventObject {
  /**
    * @param ElementId Identifies the affected element
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  var ElementId: Double = js.native
}

object FilePickerEvent {
  @scala.inline
  def apply(ElementId: Double, Source: XInterface): FilePickerEvent = {
    val __obj = js.Dynamic.literal(ElementId = ElementId.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerEvent]
  }
  @scala.inline
  implicit class FilePickerEventOps[Self <: FilePickerEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElementId(value: Double): Self = this.set("ElementId", value.asInstanceOf[js.Any])
  }
  
}

