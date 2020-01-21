package typings.atom.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorElement extends HTMLElement {
  /** Extended: get the width of an `x` character displayed in this element. */
  def getBaseCharacterWidth(): Double = js.native
  def getComponent(): TextEditorComponent = js.native
  def getModel(): TextEditor = js.native
  /**
    * Extended: Get a promise that resolves the next time the element's
    * DOM is updated in any way.
    */
  def getNextUpdatePromise(): js.Promise[Unit] = js.native
  def getScrollHeight(): Double = js.native
  def getScrollLeft(): Double = js.native
  def getScrollTop(): Double = js.native
  /** Called when the editor is attached to the DOM. */
  def onDidAttach(callback: js.Function0[Unit]): Disposable = js.native
  def onDidChangeScrollLeft(callback: js.Function1[/* scrollLeft */ Double, Unit]): Disposable = js.native
  // Event subscription
  def onDidChangeScrollTop(callback: js.Function1[/* scrollTop */ Double, Unit]): Disposable = js.native
  /** Called when the editor is detached from the DOM. */
  def onDidDetach(callback: js.Function0[Unit]): Disposable = js.native
  /** Extended: Converts a buffer position to a pixel position. */
  def pixelPositionForBufferPosition(bufferPosition: PointLike): PixelPosition = js.native
  /** Extended: Converts a screen position to a pixel position. */
  def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition = js.native
  /** Essential: Scrolls the editor to the bottom. */
  def scrollToBottom(): Unit = js.native
  /** Essential: Scrolls the editor to the top. */
  def scrollToTop(): Unit = js.native
  def setScrollLeft(scrollLeft: Double): Unit = js.native
  def setScrollTop(scrollTop: Double): Unit = js.native
}

