package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies some extended operations for a window component.
  *
  * A window is a rectangular region on an output device with its own position, size, and internal coordinate system. A window is used for displaying
  * data. In addition, the window receives events from the user.
  */
trait XWindow2 extends XWindow {
  /** returns the inner bounds of the window, also known as the client size. */
  var OutputSize: Size
  /** returns the inner bounds of the window, also known as the client size. */
  def getOutputSize(): Size
  /** returns the focus state of the window */
  def hasFocus(): scala.Boolean
  /** returns the activation state of the window */
  def isActive(): scala.Boolean
  /** returns the enabled state of the window */
  def isEnabled(): scala.Boolean
  /** returns the visibility state of the window */
  def isVisible(): scala.Boolean
  /**
    * sets the inner bounds of the window, also known as the client size
    * @param Size the inner width and height of the window.
    */
  def setOutputSize(Size: Size): scala.Unit
}

