package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Context information in case of a {@link FilePicker} event. */
trait FilePickerEvent extends EventObject {
  /**
    * @param ElementId Identifies the affected element
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  var ElementId: Double
}

object FilePickerEvent {
  @scala.inline
  def apply(ElementId: Double, Source: XInterface): FilePickerEvent = {
    val __obj = js.Dynamic.literal(ElementId = ElementId.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerEvent]
  }
}

