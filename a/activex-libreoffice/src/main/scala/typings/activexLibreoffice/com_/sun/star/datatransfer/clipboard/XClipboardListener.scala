package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to be implemented to receive notifications on clipboard content changes. */
@js.native
trait XClipboardListener extends XEventListener {
  /**
    * The content of the clipboard has changed.
    * @param event The event object containing the new clipboard content.
    * @see com.sun.star.datatransfer.clipboard.ClipboardEvent
    */
  def changedContents(event: ClipboardEvent): Unit = js.native
}

object XClipboardListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    changedContents: ClipboardEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XClipboardListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changedContents = js.Any.fromFunction1(changedContents), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XClipboardListener]
  }
  @scala.inline
  implicit class XClipboardListenerOps[Self <: XClipboardListener] (val x: Self) extends AnyVal {
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
    def setChangedContents(value: ClipboardEvent => Unit): Self = this.set("changedContents", js.Any.fromFunction1(value))
  }
  
}

