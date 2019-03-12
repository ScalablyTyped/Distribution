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

object XScrollBar {
  @scala.inline
  def apply(
    BlockIncrement: scala.Double,
    LineIncrement: scala.Double,
    Maximum: scala.Double,
    Orientation: scala.Double,
    Value: scala.Double,
    VisibleSize: scala.Double,
    acquire: () => scala.Unit,
    addAdjustmentListener: XAdjustmentListener => scala.Unit,
    getBlockIncrement: () => scala.Double,
    getLineIncrement: () => scala.Double,
    getMaximum: () => scala.Double,
    getOrientation: () => scala.Double,
    getValue: () => scala.Double,
    getVisibleSize: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeAdjustmentListener: XAdjustmentListener => scala.Unit,
    setBlockIncrement: scala.Double => scala.Unit,
    setLineIncrement: scala.Double => scala.Unit,
    setMaximum: scala.Double => scala.Unit,
    setOrientation: scala.Double => scala.Unit,
    setValue: scala.Double => scala.Unit,
    setValues: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    setVisibleSize: scala.Double => scala.Unit
  ): XScrollBar = {
    val __obj = js.Dynamic.literal(BlockIncrement = BlockIncrement, LineIncrement = LineIncrement, Maximum = Maximum, Orientation = Orientation, Value = Value, VisibleSize = VisibleSize, acquire = js.Any.fromFunction0(acquire), addAdjustmentListener = js.Any.fromFunction1(addAdjustmentListener), getBlockIncrement = js.Any.fromFunction0(getBlockIncrement), getLineIncrement = js.Any.fromFunction0(getLineIncrement), getMaximum = js.Any.fromFunction0(getMaximum), getOrientation = js.Any.fromFunction0(getOrientation), getValue = js.Any.fromFunction0(getValue), getVisibleSize = js.Any.fromFunction0(getVisibleSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAdjustmentListener = js.Any.fromFunction1(removeAdjustmentListener), setBlockIncrement = js.Any.fromFunction1(setBlockIncrement), setLineIncrement = js.Any.fromFunction1(setLineIncrement), setMaximum = js.Any.fromFunction1(setMaximum), setOrientation = js.Any.fromFunction1(setOrientation), setValue = js.Any.fromFunction1(setValue), setValues = js.Any.fromFunction3(setValues), setVisibleSize = js.Any.fromFunction1(setVisibleSize))
  
    __obj.asInstanceOf[XScrollBar]
  }
}

