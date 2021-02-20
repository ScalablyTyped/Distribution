package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to be implemented by a {@link FilePicker} listener.
  *
  * The {@link XFilePickerListener} interface must be implemented by the clients of the {@link FilePicker} service which need to be informed about events
  * while the {@link FilePicker} service is displayed.
  */
@js.native
trait XFilePickerListener extends XEventListener {
  
  /**
    * A client receives this event if the state of a control within the {@link FilePicker} service dialog changes.
    * @param aEvent of type {@link FilePickerEvent} that describes the event.
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def controlStateChanged(aEvent: FilePickerEvent): Unit = js.native
  
  /**
    * A client receives this event if the size of the {@link FilePicker} dialog has changed. If the {@link FilePicker} dialog contains a preview the client
    * may ask for the new dimension of the preview area.
    */
  def dialogSizeChanged(): Unit = js.native
  
  /**
    * A client receives this event if the directory selection within the {@link FilePicker} dialog changes.
    * @param aEvent Of type {@link FilePickerEvent} that describes the event.
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def directoryChanged(aEvent: FilePickerEvent): Unit = js.native
  
  /**
    * A client receives this event if the file selection within the {@link FilePicker} service dialog changes.
    * @param aEvent of type {@link FilePickerEvent} that describes the event
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def fileSelectionChanged(aEvent: FilePickerEvent): Unit = js.native
  
  /**
    * A client receives this event if the F1 key or the help button was pressed.
    * @param aEvent of type {@link FilePickerEvent} that describes the event
    * @returns A help string which the {@link FilePicker} dialog should use to display a help for a specific control. If the returned string is empty it is unde
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def helpRequested(aEvent: FilePickerEvent): String = js.native
}
object XFilePickerListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    controlStateChanged: FilePickerEvent => Unit,
    dialogSizeChanged: () => Unit,
    directoryChanged: FilePickerEvent => Unit,
    disposing: EventObject => Unit,
    fileSelectionChanged: FilePickerEvent => Unit,
    helpRequested: FilePickerEvent => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFilePickerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), controlStateChanged = js.Any.fromFunction1(controlStateChanged), dialogSizeChanged = js.Any.fromFunction0(dialogSizeChanged), directoryChanged = js.Any.fromFunction1(directoryChanged), disposing = js.Any.fromFunction1(disposing), fileSelectionChanged = js.Any.fromFunction1(fileSelectionChanged), helpRequested = js.Any.fromFunction1(helpRequested), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFilePickerListener]
  }
  
  @scala.inline
  implicit class XFilePickerListenerMutableBuilder[Self <: XFilePickerListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlStateChanged(value: FilePickerEvent => Unit): Self = StObject.set(x, "controlStateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDialogSizeChanged(value: () => Unit): Self = StObject.set(x, "dialogSizeChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDirectoryChanged(value: FilePickerEvent => Unit): Self = StObject.set(x, "directoryChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileSelectionChanged(value: FilePickerEvent => Unit): Self = StObject.set(x, "fileSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHelpRequested(value: FilePickerEvent => String): Self = StObject.set(x, "helpRequested", js.Any.fromFunction1(value))
  }
}
