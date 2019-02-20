package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a control which is associated with a spinnable value. */
trait XSpinValue
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the currently set maximum value of the control */
  var Maximum: scala.Double
  /** returns the currently set minimum value of the control */
  var Minimum: scala.Double
  /** returns the current orientation of the control */
  var Orientation: scala.Double
  /** returns the value by which the current value of the control should be incremented or decremented upon spinning. */
  var SpinIncrement: scala.Double
  /** returns the current value of the control. */
  var Value: scala.Double
  /** registers an adjustment event listener. */
  def addAdjustmentListener(listener: XAdjustmentListener): scala.Unit
  /** returns the currently set maximum value of the control */
  def getMaximum(): scala.Double
  /** returns the currently set minimum value of the control */
  def getMinimum(): scala.Double
  /** returns the current orientation of the control */
  def getOrientation(): scala.Double
  /** returns the value by which the current value of the control should be incremented or decremented upon spinning. */
  def getSpinIncrement(): scala.Double
  /** returns the current value of the control. */
  def getValue(): scala.Double
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(listener: XAdjustmentListener): scala.Unit
  /** sets the maximum value which can be set on the control */
  def setMaximum(maxValue: scala.Double): scala.Unit
  /** sets the minimum value which can be set on the control */
  def setMinimum(minValue: scala.Double): scala.Unit
  /**
    * controls the orientation of the control
    * @param orientation one of the {@link ScrollBarOrientation} values specifying the orientation
    * @throws com::sun::star::lang::NoSupportException in case the given orientation is not supported
    */
  def setOrientation(orientation: scala.Double): scala.Unit
  /** sets the value by which the current value of the control should be incremented or decremented upon spinning. */
  def setSpinIncrement(spinIncrement: scala.Double): scala.Unit
  /** sets the current value of the control */
  def setValue(value: scala.Double): scala.Unit
  /**
    * sets the value and value range of the control
    * @see setValue
    * @see setMinimum
    * @see setMaximum
    */
  def setValues(minValue: scala.Double, maxValue: scala.Double, currentValue: scala.Double): scala.Unit
}

