package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and formatting of a currency field. */
trait XCurrencyField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the currently set number of decimals. */
  var DecimalDigits: scala.Double
  /** returns the currently set first value which is set on POS1 key. */
  var First: scala.Double
  /** returns the currently set last value which is set on END key. */
  var Last: scala.Double
  /** returns the currently set maximum value that can be entered by the user. */
  var Max: scala.Double
  /** returns the currently set minimum value that can be entered by the user. */
  var Min: scala.Double
  /** returns the currently set increment value for the spin button. */
  var SpinSize: scala.Double
  /** returns the value which is currently displayed in the currency field. */
  var Value: scala.Double
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): scala.Double
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): scala.Double
  /** returns the currently set last value which is set on END key. */
  def getLast(): scala.Double
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(): scala.Double
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(): scala.Double
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): scala.Double
  /** returns the value which is currently displayed in the currency field. */
  def getValue(): scala.Double
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): scala.Boolean
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: scala.Double): scala.Unit
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: scala.Double): scala.Unit
  /** sets the last value to be set on END key. */
  def setLast(Value: scala.Double): scala.Unit
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: scala.Double): scala.Unit
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: scala.Double): scala.Unit
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: scala.Double): scala.Unit
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: scala.Boolean): scala.Unit
  /** sets the value which is displayed in the currency field. */
  def setValue(Value: scala.Double): scala.Unit
}

object XCurrencyField {
  @scala.inline
  def apply(
    DecimalDigits: scala.Double,
    First: scala.Double,
    Last: scala.Double,
    Max: scala.Double,
    Min: scala.Double,
    SpinSize: scala.Double,
    Value: scala.Double,
    acquire: () => scala.Unit,
    getDecimalDigits: () => scala.Double,
    getFirst: () => scala.Double,
    getLast: () => scala.Double,
    getMax: () => scala.Double,
    getMin: () => scala.Double,
    getSpinSize: () => scala.Double,
    getValue: () => scala.Double,
    isStrictFormat: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDecimalDigits: scala.Double => scala.Unit,
    setFirst: scala.Double => scala.Unit,
    setLast: scala.Double => scala.Unit,
    setMax: scala.Double => scala.Unit,
    setMin: scala.Double => scala.Unit,
    setSpinSize: scala.Double => scala.Unit,
    setStrictFormat: scala.Boolean => scala.Unit,
    setValue: scala.Double => scala.Unit
  ): XCurrencyField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits, First = First, Last = Last, Max = Max, Min = Min, SpinSize = SpinSize, Value = Value, acquire = js.Any.fromFunction0(acquire), getDecimalDigits = js.Any.fromFunction0(getDecimalDigits), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getSpinSize = js.Any.fromFunction0(getSpinSize), getValue = js.Any.fromFunction0(getValue), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDecimalDigits = js.Any.fromFunction1(setDecimalDigits), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setSpinSize = js.Any.fromFunction1(setSpinSize), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[XCurrencyField]
  }
}

