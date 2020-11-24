package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XClipboardNotifier extends XInterface {
  
  /**
    * Requests notifications on clipboard content changes.
    * @param listener The object receiving the notifications.
    */
  def addClipboardListener(listener: XClipboardListener): Unit = js.native
  
  /**
    * Removes listener from notification list.
    * @param listener The object to remove from notification list.
    */
  def removeClipboardListener(listener: XClipboardListener): Unit = js.native
}
object XClipboardNotifier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addClipboardListener: XClipboardListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeClipboardListener: XClipboardListener => Unit
  ): XClipboardNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addClipboardListener = js.Any.fromFunction1(addClipboardListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboardListener = js.Any.fromFunction1(removeClipboardListener))
    __obj.asInstanceOf[XClipboardNotifier]
  }
  
  @scala.inline
  implicit class XClipboardNotifierOps[Self <: XClipboardNotifier] (val x: Self) extends AnyVal {
    
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
    def setAddClipboardListener(value: XClipboardListener => Unit): Self = this.set("addClipboardListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClipboardListener(value: XClipboardListener => Unit): Self = this.set("removeClipboardListener", js.Any.fromFunction1(value))
  }
}
