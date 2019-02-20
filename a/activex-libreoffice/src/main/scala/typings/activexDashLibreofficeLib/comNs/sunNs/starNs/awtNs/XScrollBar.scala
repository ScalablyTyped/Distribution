package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a scroll bar and makes it possible to register adjustment event listeners. */
trait XScrollBar
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the currently set increment for a block move. */
  var BlockIncrement: scala.Double
  /** returns the currently set increment for a single line move. */
  var LineIncrement: scala.Double
  /** returns the currently set maximum scroll value of the scroll bar. */
  var Maximum: scala.Double
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  var Orientation: scala.Double
  /** returns the current scroll value of the scroll bar. */
  var Value: scala.Double
  /** returns the currently visible size of the scroll bar. */
  var VisibleSize: scala.Double
  /** registers an adjustment event listener. */
  def addAdjustmentListener(l: XAdjustmentListener): scala.Unit
  /** returns the currently set increment for a block move. */
  def getBlockIncrement(): scala.Double
  /** returns the currently set increment for a single line move. */
  def getLineIncrement(): scala.Double
  /** returns the currently set maximum scroll value of the scroll bar. */
  def getMaximum(): scala.Double
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  def getOrientation(): scala.Double
  /** returns the current scroll value of the scroll bar. */
  def getValue(): scala.Double
  /** returns the currently visible size of the scroll bar. */
  def getVisibleSize(): scala.Double
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(l: XAdjustmentListener): scala.Unit
  /** sets the increment for a block move. */
  def setBlockIncrement(n: scala.Double): scala.Unit
  /** sets the increment for a single line move. */
  def setLineIncrement(n: scala.Double): scala.Unit
  /** sets the maximum scroll value of the scroll bar. */
  def setMaximum(n: scala.Double): scala.Unit
  /** sets the {@link ScrollBarOrientation} of the scroll bar. */
  def setOrientation(n: scala.Double): scala.Unit
  /** sets the scroll value of the scroll bar. */
  def setValue(n: scala.Double): scala.Unit
  /** sets the scroll value, visible area and maximum scroll value of the scroll bar. */
  def setValues(nValue: scala.Double, nVisible: scala.Double, nMax: scala.Double): scala.Unit
  /** sets the visible size of the scroll bar. */
  def setVisibleSize(n: scala.Double): scala.Unit
}

