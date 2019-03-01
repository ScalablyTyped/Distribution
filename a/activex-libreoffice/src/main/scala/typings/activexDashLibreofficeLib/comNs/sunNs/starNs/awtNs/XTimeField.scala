package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a time field. */
trait XTimeField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the currently set first value which is set on POS1 key. */
  var First: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns the currently set last value which is set on END key. */
  var Last: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns the currently set maximum time value that can be entered by the user. */
  var Max: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns the currently set minimum time value that can be entered by the user. */
  var Min: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns the time value which is currently displayed in the time field. */
  var Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns the currently set last value which is set on END key. */
  def getLast(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns the currently set maximum time value that can be entered by the user. */
  def getMax(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns the currently set minimum time value that can be entered by the user. */
  def getMin(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns the time value which is currently displayed in the time field. */
  def getTime(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /** returns whether currently an empty value is set for the time. */
  def isEmpty(): scala.Boolean
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): scala.Boolean
  /** sets an empty value for the time. */
  def setEmpty(): scala.Unit
  /** sets the first value to be set on POS1 key. */
  def setFirst(Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
  /** sets the last value to be set on END key. */
  def setLast(Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
  /** sets the maximum time value that can be entered by the user. */
  def setMax(Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
  /** sets the minimum time value that can be entered by the user. */
  def setMin(Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: scala.Boolean): scala.Unit
  /** sets the time value which is displayed in the time field. */
  def setTime(Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
}

object XTimeField {
  @scala.inline
  def apply(
    First: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Last: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Max: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Min: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    acquire: js.Function0[scala.Unit],
    getFirst: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getLast: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getMax: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getMin: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getTime: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    isEmpty: js.Function0[scala.Boolean],
    isStrictFormat: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setEmpty: js.Function0[scala.Unit],
    setFirst: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    setLast: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    setMax: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    setMin: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    setStrictFormat: js.Function1[scala.Boolean, scala.Unit],
    setTime: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit]
  ): XTimeField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("First")(First)
    __obj.updateDynamic("Last")(Last)
    __obj.updateDynamic("Max")(Max)
    __obj.updateDynamic("Min")(Min)
    __obj.updateDynamic("Time")(Time)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getFirst")(getFirst)
    __obj.updateDynamic("getLast")(getLast)
    __obj.updateDynamic("getMax")(getMax)
    __obj.updateDynamic("getMin")(getMin)
    __obj.updateDynamic("getTime")(getTime)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("isStrictFormat")(isStrictFormat)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setEmpty")(setEmpty)
    __obj.updateDynamic("setFirst")(setFirst)
    __obj.updateDynamic("setLast")(setLast)
    __obj.updateDynamic("setMax")(setMax)
    __obj.updateDynamic("setMin")(setMin)
    __obj.updateDynamic("setStrictFormat")(setStrictFormat)
    __obj.updateDynamic("setTime")(setTime)
    __obj.asInstanceOf[XTimeField]
  }
}

