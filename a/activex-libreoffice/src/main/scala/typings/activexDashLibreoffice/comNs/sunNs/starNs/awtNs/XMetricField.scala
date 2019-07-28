package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and formatting of a metric field. */
trait XMetricField extends XInterface {
  /** returns the currently set number of decimals. */
  var DecimalDigits: Double
  /** returns the currently set increment value for the spin button. */
  var SpinSize: Double
  /** returns the corrected value which is displayed in the metric field. */
  def getCorrectedValue(FieldUnit: Double): Double
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): Double
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(FieldUnit: Double): Double
  /** returns the currently set last value which is set on END key. */
  def getLast(FieldUnit: Double): Double
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(FieldUnit: Double): Double
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(FieldUnit: Double): Double
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): Double
  /** returns the value which is currently displayed in the metric field. */
  def getValue(FieldUnit: Double): Double
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: Double): Unit
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: Double, FieldUnit: Double): Unit
  /** sets the last value to be set on END key. */
  def setLast(Value: Double, FieldUnit: Double): Unit
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: Double, FieldUnit: Double): Unit
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: Double, FieldUnit: Double): Unit
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: Double): Unit
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  /** sets the user value which is displayed in the metric field. */
  def setUserValue(Value: Double, FieldUnit: Double): Unit
  /** sets the value which is displayed in the metric field. */
  def setValue(Value: Double, FieldUnit: Double): Unit
}

object XMetricField {
  @scala.inline
  def apply(
    DecimalDigits: Double,
    SpinSize: Double,
    acquire: () => Unit,
    getCorrectedValue: Double => Double,
    getDecimalDigits: () => Double,
    getFirst: Double => Double,
    getLast: Double => Double,
    getMax: Double => Double,
    getMin: Double => Double,
    getSpinSize: () => Double,
    getValue: Double => Double,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDecimalDigits: Double => Unit,
    setFirst: (Double, Double) => Unit,
    setLast: (Double, Double) => Unit,
    setMax: (Double, Double) => Unit,
    setMin: (Double, Double) => Unit,
    setSpinSize: Double => Unit,
    setStrictFormat: Boolean => Unit,
    setUserValue: (Double, Double) => Unit,
    setValue: (Double, Double) => Unit
  ): XMetricField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits, SpinSize = SpinSize, acquire = js.Any.fromFunction0(acquire), getCorrectedValue = js.Any.fromFunction1(getCorrectedValue), getDecimalDigits = js.Any.fromFunction0(getDecimalDigits), getFirst = js.Any.fromFunction1(getFirst), getLast = js.Any.fromFunction1(getLast), getMax = js.Any.fromFunction1(getMax), getMin = js.Any.fromFunction1(getMin), getSpinSize = js.Any.fromFunction0(getSpinSize), getValue = js.Any.fromFunction1(getValue), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDecimalDigits = js.Any.fromFunction1(setDecimalDigits), setFirst = js.Any.fromFunction2(setFirst), setLast = js.Any.fromFunction2(setLast), setMax = js.Any.fromFunction2(setMax), setMin = js.Any.fromFunction2(setMin), setSpinSize = js.Any.fromFunction1(setSpinSize), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setUserValue = js.Any.fromFunction2(setUserValue), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[XMetricField]
  }
}

