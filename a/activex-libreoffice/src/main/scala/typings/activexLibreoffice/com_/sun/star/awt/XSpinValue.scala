package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a control which is associated with a spinnable value. */
@js.native
trait XSpinValue extends XInterface {
  /** returns the currently set maximum value of the control */
  var Maximum: Double = js.native
  /** returns the currently set minimum value of the control */
  var Minimum: Double = js.native
  /** returns the current orientation of the control */
  var Orientation: Double = js.native
  /** returns the value by which the current value of the control should be incremented or decremented upon spinning. */
  var SpinIncrement: Double = js.native
  /** returns the current value of the control. */
  var Value: Double = js.native
  /** registers an adjustment event listener. */
  def addAdjustmentListener(listener: XAdjustmentListener): Unit = js.native
  /** returns the currently set maximum value of the control */
  def getMaximum(): Double = js.native
  /** returns the currently set minimum value of the control */
  def getMinimum(): Double = js.native
  /** returns the current orientation of the control */
  def getOrientation(): Double = js.native
  /** returns the value by which the current value of the control should be incremented or decremented upon spinning. */
  def getSpinIncrement(): Double = js.native
  /** returns the current value of the control. */
  def getValue(): Double = js.native
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(listener: XAdjustmentListener): Unit = js.native
  /** sets the maximum value which can be set on the control */
  def setMaximum(maxValue: Double): Unit = js.native
  /** sets the minimum value which can be set on the control */
  def setMinimum(minValue: Double): Unit = js.native
  /**
    * controls the orientation of the control
    * @param orientation one of the {@link ScrollBarOrientation} values specifying the orientation
    * @throws com::sun::star::lang::NoSupportException in case the given orientation is not supported
    */
  def setOrientation(orientation: Double): Unit = js.native
  /** sets the value by which the current value of the control should be incremented or decremented upon spinning. */
  def setSpinIncrement(spinIncrement: Double): Unit = js.native
  /** sets the current value of the control */
  def setValue(value: Double): Unit = js.native
  /**
    * sets the value and value range of the control
    * @see setValue
    * @see setMinimum
    * @see setMaximum
    */
  def setValues(minValue: Double, maxValue: Double, currentValue: Double): Unit = js.native
}

object XSpinValue {
  @scala.inline
  def apply(
    Maximum: Double,
    Minimum: Double,
    Orientation: Double,
    SpinIncrement: Double,
    Value: Double,
    acquire: () => Unit,
    addAdjustmentListener: XAdjustmentListener => Unit,
    getMaximum: () => Double,
    getMinimum: () => Double,
    getOrientation: () => Double,
    getSpinIncrement: () => Double,
    getValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAdjustmentListener: XAdjustmentListener => Unit,
    setMaximum: Double => Unit,
    setMinimum: Double => Unit,
    setOrientation: Double => Unit,
    setSpinIncrement: Double => Unit,
    setValue: Double => Unit,
    setValues: (Double, Double, Double) => Unit
  ): XSpinValue = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], SpinIncrement = SpinIncrement.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAdjustmentListener = js.Any.fromFunction1(addAdjustmentListener), getMaximum = js.Any.fromFunction0(getMaximum), getMinimum = js.Any.fromFunction0(getMinimum), getOrientation = js.Any.fromFunction0(getOrientation), getSpinIncrement = js.Any.fromFunction0(getSpinIncrement), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAdjustmentListener = js.Any.fromFunction1(removeAdjustmentListener), setMaximum = js.Any.fromFunction1(setMaximum), setMinimum = js.Any.fromFunction1(setMinimum), setOrientation = js.Any.fromFunction1(setOrientation), setSpinIncrement = js.Any.fromFunction1(setSpinIncrement), setValue = js.Any.fromFunction1(setValue), setValues = js.Any.fromFunction3(setValues))
    __obj.asInstanceOf[XSpinValue]
  }
  @scala.inline
  implicit class XSpinValueOps[Self <: XSpinValue] (val x: Self) extends AnyVal {
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
    def setMaximum(value: Double): Self = this.set("Maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimum(value: Double): Self = this.set("Minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: Double): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpinIncrement(value: Double): Self = this.set("SpinIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddAdjustmentListener(value: XAdjustmentListener => Unit): Self = this.set("addAdjustmentListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMaximum(value: () => Double): Self = this.set("getMaximum", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinimum(value: () => Double): Self = this.set("getMinimum", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOrientation(value: () => Double): Self = this.set("getOrientation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSpinIncrement(value: () => Double): Self = this.set("getSpinIncrement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValue(value: () => Double): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveAdjustmentListener(value: XAdjustmentListener => Unit): Self = this.set("removeAdjustmentListener", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMaximum(value: Double => Unit): Self = this.set("setMaximum", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMinimum(value: Double => Unit): Self = this.set("setMinimum", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOrientation(value: Double => Unit): Self = this.set("setOrientation", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSpinIncrement(value: Double => Unit): Self = this.set("setSpinIncrement", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValue(value: Double => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValues(value: (Double, Double, Double) => Unit): Self = this.set("setValues", js.Any.fromFunction3(value))
  }
  
}

