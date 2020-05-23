package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XClipboardNotifier extends XInterface {
  /**
    * Requests notifications on clipboard content changes.
    * @param listener The object receiving the notifications.
    */
  def addClipboardListener(listener: XClipboardListener): Unit
  /**
    * Removes listener from notification list.
    * @param listener The object to remove from notification list.
    */
  def removeClipboardListener(listener: XClipboardListener): Unit
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
}

