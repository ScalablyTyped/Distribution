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
    acquire: js.Function0[scala.Unit],
    getCorrectedValue: js.Function1[scala.Double, scala.Double],
    getDecimalDigits: js.Function0[scala.Double],
    getFirst: js.Function1[scala.Double, scala.Double],
    getLast: js.Function1[scala.Double, scala.Double],
    getMax: js.Function1[scala.Double, scala.Double],
    getMin: js.Function1[scala.Double, scala.Double],
    getSpinSize: js.Function0[scala.Double],
    getValue: js.Function1[scala.Double, scala.Double],
    isStrictFormat: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDecimalDigits: js.Function1[scala.Double, scala.Unit],
    setFirst: js.Function2[scala.Double, scala.Double, scala.Unit],
    setLast: js.Function2[scala.Double, scala.Double, scala.Unit],
    setMax: js.Function2[scala.Double, scala.Double, scala.Unit],
    setMin: js.Function2[scala.Double, scala.Double, scala.Unit],
    setSpinSize: js.Function1[scala.Double, scala.Unit],
    setStrictFormat: js.Function1[scala.Boolean, scala.Unit],
    setUserValue: js.Function2[scala.Double, scala.Double, scala.Unit],
    setValue: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XMetricField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits, SpinSize = SpinSize, acquire = acquire, getCorrectedValue = getCorrectedValue, getDecimalDigits = getDecimalDigits, getFirst = getFirst, getLast = getLast, getMax = getMax, getMin = getMin, getSpinSize = getSpinSize, getValue = getValue, isStrictFormat = isStrictFormat, queryInterface = queryInterface, release = release, setDecimalDigits = setDecimalDigits, setFirst = setFirst, setLast = setLast, setMax = setMax, setMin = setMin, setSpinSize = setSpinSize, setStrictFormat = setStrictFormat, setUserValue = setUserValue, setValue = setValue)
  
    __obj.asInstanceOf[XMetricField]
  }
}

