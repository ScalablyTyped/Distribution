package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Context information in case of a {@link FilePicker} event. */
trait FilePickerEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * @param ElementId Identifies the affected element
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  var ElementId: scala.Double
}

object FilePickerEvent {
  @scala.inline
  def apply(ElementId: scala.Double, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): FilePickerEvent = {
    val __obj = js.Dynamic.literal(ElementId = ElementId, Source = Source)
  
    __obj.asInstanceOf[FilePickerEvent]
  }
}

