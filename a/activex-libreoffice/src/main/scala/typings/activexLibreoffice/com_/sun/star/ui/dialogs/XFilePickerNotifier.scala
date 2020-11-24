package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface to be implemented in order to support listener management. */
@js.native
trait XFilePickerNotifier extends XInterface {
  
  /**
    * Interface for clients to register as {@link XFilePickerListener}
    * @param xListener The {@link XFilePickerListener} interface of the listener that wants to receive events of type {@link FilePickerEvent} . Invalid interf
    */
  def addFilePickerListener(xListener: XFilePickerListener): Unit = js.native
  
  /**
    * Interface for clients to unregister as {@link XFilePickerListener} .
    * @param xListener The {@link XFilePickerListener} interface of the listener that wants to receive events of type {@link FilePickerEvent} . Invalid interf
    */
  def removeFilePickerListener(xListener: XFilePickerListener): Unit = js.native
}
object XFilePickerNotifier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addFilePickerListener: XFilePickerListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeFilePickerListener: XFilePickerListener => Unit
  ): XFilePickerNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addFilePickerListener = js.Any.fromFunction1(addFilePickerListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFilePickerListener = js.Any.fromFunction1(removeFilePickerListener))
    __obj.asInstanceOf[XFilePickerNotifier]
  }
  
  @scala.inline
  implicit class XFilePickerNotifierOps[Self <: XFilePickerNotifier] (val x: Self) extends AnyVal {
    
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
    def setAddFilePickerListener(value: XFilePickerListener => Unit): Self = this.set("addFilePickerListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFilePickerListener(value: XFilePickerListener => Unit): Self = this.set("removeFilePickerListener", js.Any.fromFunction1(value))
  }
}
