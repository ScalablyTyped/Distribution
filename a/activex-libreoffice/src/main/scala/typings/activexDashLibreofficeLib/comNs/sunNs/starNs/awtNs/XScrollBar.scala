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
    acquire: js.Function0[scala.Unit],
    addAdjustmentListener: js.Function1[XAdjustmentListener, scala.Unit],
    getBlockIncrement: js.Function0[scala.Double],
    getLineIncrement: js.Function0[scala.Double],
    getMaximum: js.Function0[scala.Double],
    getOrientation: js.Function0[scala.Double],
    getValue: js.Function0[scala.Double],
    getVisibleSize: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAdjustmentListener: js.Function1[XAdjustmentListener, scala.Unit],
    setBlockIncrement: js.Function1[scala.Double, scala.Unit],
    setLineIncrement: js.Function1[scala.Double, scala.Unit],
    setMaximum: js.Function1[scala.Double, scala.Unit],
    setOrientation: js.Function1[scala.Double, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit],
    setValues: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    setVisibleSize: js.Function1[scala.Double, scala.Unit]
  ): XScrollBar = {
    val __obj = js.Dynamic.literal(BlockIncrement = BlockIncrement, LineIncrement = LineIncrement, Maximum = Maximum, Orientation = Orientation, Value = Value, VisibleSize = VisibleSize, acquire = acquire, addAdjustmentListener = addAdjustmentListener, getBlockIncrement = getBlockIncrement, getLineIncrement = getLineIncrement, getMaximum = getMaximum, getOrientation = getOrientation, getValue = getValue, getVisibleSize = getVisibleSize, queryInterface = queryInterface, release = release, removeAdjustmentListener = removeAdjustmentListener, setBlockIncrement = setBlockIncrement, setLineIncrement = setLineIncrement, setMaximum = setMaximum, setOrientation = setOrientation, setValue = setValue, setValues = setValues, setVisibleSize = setVisibleSize)
  
    __obj.asInstanceOf[XScrollBar]
  }
}

