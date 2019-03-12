package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to be implemented by a {@link FilePicker} listener.
  *
  * The {@link XFilePickerListener} interface must be implemented by the clients of the {@link FilePicker} service which need to be informed about events
  * while the {@link FilePicker} service is displayed.
  */
trait XFilePickerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * A client receives this event if the state of a control within the {@link FilePicker} service dialog changes.
    * @param aEvent of type {@link FilePickerEvent} that describes the event.
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def controlStateChanged(aEvent: FilePickerEvent): scala.Unit
  /**
    * A client receives this event if the size of the {@link FilePicker} dialog has changed. If the {@link FilePicker} dialog contains a preview the client
    * may ask for the new dimension of the preview area.
    */
  def dialogSizeChanged(): scala.Unit
  /**
    * A client receives this event if the directory selection within the {@link FilePicker} dialog changes.
    * @param aEvent Of type {@link FilePickerEvent} that describes the event.
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def directoryChanged(aEvent: FilePickerEvent): scala.Unit
  /**
    * A client receives this event if the file selection within the {@link FilePicker} service dialog changes.
    * @param aEvent of type {@link FilePickerEvent} that describes the event
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def fileSelectionChanged(aEvent: FilePickerEvent): scala.Unit
  /**
    * A client receives this event if the F1 key or the help button was pressed.
    * @param aEvent of type {@link FilePickerEvent} that describes the event
    * @returns A help string which the {@link FilePicker} dialog should use to display a help for a specific control. If the returned string is empty it is unde
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def helpRequested(aEvent: FilePickerEvent): java.lang.String
}

object XFilePickerListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    controlStateChanged: FilePickerEvent => scala.Unit,
    dialogSizeChanged: () => scala.Unit,
    directoryChanged: FilePickerEvent => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    fileSelectionChanged: FilePickerEvent => scala.Unit,
    helpRequested: FilePickerEvent => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFilePickerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), controlStateChanged = js.Any.fromFunction1(controlStateChanged), dialogSizeChanged = js.Any.fromFunction0(dialogSizeChanged), directoryChanged = js.Any.fromFunction1(directoryChanged), disposing = js.Any.fromFunction1(disposing), fileSelectionChanged = js.Any.fromFunction1(fileSelectionChanged), helpRequested = js.Any.fromFunction1(helpRequested), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFilePickerListener]
  }
}

