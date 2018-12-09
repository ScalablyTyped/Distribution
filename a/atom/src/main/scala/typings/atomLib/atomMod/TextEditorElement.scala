package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorElement
  extends stdLib.HTMLElement {
  /** Extended: get the width of an `x` character displayed in this element. */
  def getBaseCharacterWidth(): scala.Double = js.native
  def getComponent(): TextEditorComponent = js.native
  def getModel(): TextEditor = js.native
  /**
     * Extended: Get a promise that resolves the next time the element's
     * DOM is updated in any way.
     */
  def getNextUpdatePromise(): js.Promise[scala.Unit] = js.native
  def getScrollHeight(): scala.Double = js.native
  def getScrollLeft(): scala.Double = js.native
  def getScrollTop(): scala.Double = js.native
  /** Called when the editor is attached to the DOM. */
  def onDidAttach(callback: js.Function0[scala.Unit]): Disposable = js.native
  def onDidChangeScrollLeft(callback: js.Function1[/* scrollLeft */ scala.Double, scala.Unit]): Disposable = js.native
  // Event subscription
  def onDidChangeScrollTop(callback: js.Function1[/* scrollTop */ scala.Double, scala.Unit]): Disposable = js.native
  /** Called when the editor is detached from the DOM. */
  def onDidDetach(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Extended: Converts a buffer position to a pixel position. */
  def pixelPositionForBufferPosition(bufferPosition: PointLike): PixelPosition = js.native
  /** Extended: Converts a screen position to a pixel position. */
  def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition = js.native
  /** Essential: Scrolls the editor to the bottom. */
  def scrollToBottom(): scala.Unit = js.native
  /** Essential: Scrolls the editor to the top. */
  def scrollToTop(): scala.Unit = js.native
  def setScrollLeft(scrollLeft: scala.Double): scala.Unit = js.native
  def setScrollTop(scrollTop: scala.Double): scala.Unit = js.native
}

