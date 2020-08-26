package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard.XClipboard
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDragGestureRecognizer
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDragSource
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDropTarget
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface extends the {@link XToolkit} interface with clipboard and drag-and-drop support. */
@js.native
trait XDataTransferProviderAccess extends XInterface {
  /**
    * returns the specified clipboard.
    * @param clipboardName the name of the clipboard to return. If an empty string is passed in, the default clipboard is returned.
    * @returns the specified clipboard (if available).
    */
  def getClipboard(clipboardName: String): XClipboard = js.native
  /**
    * returns the drag gesture recognizer of the specified window.
    * @param window a window created by the same toolkit instance.
    * @returns the drag gesture recognizer.
    */
  def getDragGestureRecognizer(window: XWindow): XDragGestureRecognizer = js.native
  /**
    * returns the drag source of the specified window.
    * @param window a window created by the same toolkit instance.
    * @returns the drag source.
    */
  def getDragSource(window: XWindow): XDragSource = js.native
  /**
    * returns the drop target of the specified window.
    * @param window a window created by the same toolkit instance.
    * @returns the drop target.
    */
  def getDropTarget(window: XWindow): XDropTarget = js.native
}

object XDataTransferProviderAccess {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getClipboard: String => XClipboard,
    getDragGestureRecognizer: XWindow => XDragGestureRecognizer,
    getDragSource: XWindow => XDragSource,
    getDropTarget: XWindow => XDropTarget,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataTransferProviderAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getClipboard = js.Any.fromFunction1(getClipboard), getDragGestureRecognizer = js.Any.fromFunction1(getDragGestureRecognizer), getDragSource = js.Any.fromFunction1(getDragSource), getDropTarget = js.Any.fromFunction1(getDropTarget), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataTransferProviderAccess]
  }
  @scala.inline
  implicit class XDataTransferProviderAccessOps[Self <: XDataTransferProviderAccess] (val x: Self) extends AnyVal {
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
    def setGetClipboard(value: String => XClipboard): Self = this.set("getClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDragGestureRecognizer(value: XWindow => XDragGestureRecognizer): Self = this.set("getDragGestureRecognizer", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDragSource(value: XWindow => XDragSource): Self = this.set("getDragSource", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDropTarget(value: XWindow => XDropTarget): Self = this.set("getDropTarget", js.Any.fromFunction1(value))
  }
  
}

