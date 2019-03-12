package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and formatting of a metric field. */
trait XMetricField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the currently set number of decimals. */
  var DecimalDigits: scala.Double
  /** returns the currently set increment value for the spin button. */
  var SpinSize: scala.Double
  /** returns the corrected value which is displayed in the metric field. */
  def getCorrectedValue(FieldUnit: scala.Double): scala.Double
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): scala.Double
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(FieldUnit: scala.Double): scala.Double
  /** returns the currently set last value which is set on END key. */
  def getLast(FieldUnit: scala.Double): scala.Double
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(FieldUnit: scala.Double): scala.Double
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(FieldUnit: scala.Double): scala.Double
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): scala.Double
  /** returns the value which is currently displayed in the metric field. */
  def getValue(FieldUnit: scala.Double): scala.Double
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): scala.Boolean
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: scala.Double): scala.Unit
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: scala.Double, FieldUnit: scala.Double): scala.Unit
  /** sets the last value to be set on END key. */
  def setLast(Value: scala.Double, FieldUnit: scala.Double): scala.Unit
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: scala.Double, FieldUnit: scala.Double): scala.Unit
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: scala.Double, FieldUnit: scala.Double): scala.Unit
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: scala.Double): scala.Unit
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: scala.Boolean): scala.Unit
  /** sets the user value which is displayed in the metric field. */
  def setUserValue(Value: scala.Double, FieldUnit: scala.Double): scala.Unit
  /** sets the value which is displayed in the metric field. */
  def setValue(Value: scala.Double, FieldUnit: scala.Double): scala.Unit
}

object XMetricField {
  @scala.inline
  def apply(
    DecimalDigits: scala.Double,
    SpinSize: scala.Double,
    acquire: () => scala.Unit,
    getCorrectedValue: scala.Double => scala.Double,
    getDecimalDigits: () => scala.Double,
    getFirst: scala.Double => scala.Double,
    getLast: scala.Double => scala.Double,
    getMax: scala.Double => scala.Double,
    getMin: scala.Double => scala.Double,
    getSpinSize: () => scala.Double,
    getValue: scala.Double => scala.Double,
    isStrictFormat: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDecimalDigits: scala.Double => scala.Unit,
    setFirst: (scala.Double, scala.Double) => scala.Unit,
    setLast: (scala.Double, scala.Double) => scala.Unit,
    setMax: (scala.Double, scala.Double) => scala.Unit,
    setMin: (scala.Double, scala.Double) => scala.Unit,
    setSpinSize: scala.Double => scala.Unit,
    setStrictFormat: scala.Boolean => scala.Unit,
    setUserValue: (scala.Double, scala.Double) => scala.Unit,
    setValue: (scala.Double, scala.Double) => scala.Unit
  ): XMetricField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits, SpinSize = SpinSize, acquire = js.Any.fromFunction0(acquire), getCorrectedValue = js.Any.fromFunction1(getCorrectedValue), getDecimalDigits = js.Any.fromFunction0(getDecimalDigits), getFirst = js.Any.fromFunction1(getFirst), getLast = js.Any.fromFunction1(getLast), getMax = js.Any.fromFunction1(getMax), getMin = js.Any.fromFunction1(getMin), getSpinSize = js.Any.fromFunction0(getSpinSize), getValue = js.Any.fromFunction1(getValue), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDecimalDigits = js.Any.fromFunction1(setDecimalDigits), setFirst = js.Any.fromFunction2(setFirst), setLast = js.Any.fromFunction2(setLast), setMax = js.Any.fromFunction2(setMax), setMin = js.Any.fromFunction2(setMin), setSpinSize = js.Any.fromFunction1(setSpinSize), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setUserValue = js.Any.fromFunction2(setUserValue), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[XMetricField]
  }
}

