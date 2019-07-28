package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a scroll bar and makes it possible to register adjustment event listeners. */
trait XScrollBar extends XInterface {
  /** returns the currently set increment for a block move. */
  var BlockIncrement: Double
  /** returns the currently set increment for a single line move. */
  var LineIncrement: Double
  /** returns the currently set maximum scroll value of the scroll bar. */
  var Maximum: Double
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  var Orientation: Double
  /** returns the current scroll value of the scroll bar. */
  var Value: Double
  /** returns the currently visible size of the scroll bar. */
  var VisibleSize: Double
  /** registers an adjustment event listener. */
  def addAdjustmentListener(l: XAdjustmentListener): Unit
  /** returns the currently set increment for a block move. */
  def getBlockIncrement(): Double
  /** returns the currently set increment for a single line move. */
  def getLineIncrement(): Double
  /** returns the currently set maximum scroll value of the scroll bar. */
  def getMaximum(): Double
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  def getOrientation(): Double
  /** returns the current scroll value of the scroll bar. */
  def getValue(): Double
  /** returns the currently visible size of the scroll bar. */
  def getVisibleSize(): Double
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(l: XAdjustmentListener): Unit
  /** sets the increment for a block move. */
  def setBlockIncrement(n: Double): Unit
  /** sets the increment for a single line move. */
  def setLineIncrement(n: Double): Unit
  /** sets the maximum scroll value of the scroll bar. */
  def setMaximum(n: Double): Unit
  /** sets the {@link ScrollBarOrientation} of the scroll bar. */
  def setOrientation(n: Double): Unit
  /** sets the scroll value of the scroll bar. */
  def setValue(n: Double): Unit
  /** sets the scroll value, visible area and maximum scroll value of the scroll bar. */
  def setValues(nValue: Double, nVisible: Double, nMax: Double): Unit
  /** sets the visible size of the scroll bar. */
  def setVisibleSize(n: Double): Unit
}

object XScrollBar {
  @scala.inline
  def apply(
    BlockIncrement: Double,
    LineIncrement: Double,
    Maximum: Double,
    Orientation: Double,
    Value: Double,
    VisibleSize: Double,
    acquire: () => Unit,
    addAdjustmentListener: XAdjustmentListener => Unit,
    getBlockIncrement: () => Double,
    getLineIncrement: () => Double,
    getMaximum: () => Double,
    getOrientation: () => Double,
    getValue: () => Double,
    getVisibleSize: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAdjustmentListener: XAdjustmentListener => Unit,
    setBlockIncrement: Double => Unit,
    setLineIncrement: Double => Unit,
    setMaximum: Double => Unit,
    setOrientation: Double => Unit,
    setValue: Double => Unit,
    setValues: (Double, Double, Double) => Unit,
    setVisibleSize: Double => Unit
  ): XScrollBar = {
    val __obj = js.Dynamic.literal(BlockIncrement = BlockIncrement, LineIncrement = LineIncrement, Maximum = Maximum, Orientation = Orientation, Value = Value, VisibleSize = VisibleSize, acquire = js.Any.fromFunction0(acquire), addAdjustmentListener = js.Any.fromFunction1(addAdjustmentListener), getBlockIncrement = js.Any.fromFunction0(getBlockIncrement), getLineIncrement = js.Any.fromFunction0(getLineIncrement), getMaximum = js.Any.fromFunction0(getMaximum), getOrientation = js.Any.fromFunction0(getOrientation), getValue = js.Any.fromFunction0(getValue), getVisibleSize = js.Any.fromFunction0(getVisibleSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAdjustmentListener = js.Any.fromFunction1(removeAdjustmentListener), setBlockIncrement = js.Any.fromFunction1(setBlockIncrement), setLineIncrement = js.Any.fromFunction1(setLineIncrement), setMaximum = js.Any.fromFunction1(setMaximum), setOrientation = js.Any.fromFunction1(setOrientation), setValue = js.Any.fromFunction1(setValue), setValues = js.Any.fromFunction3(setValues), setVisibleSize = js.Any.fromFunction1(setVisibleSize))
  
    __obj.asInstanceOf[XScrollBar]
  }
}

