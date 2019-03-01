package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a date field. */
trait XDateField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the date value which is currently displayed in the date field. */
  var Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns the currently set first value which is set on POS1 key. */
  var First: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns the currently set last value which is set on END key. */
  var Last: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns the currently set maximum date value that can be entered by the user. */
  var Max: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns the currently set minimum date value that can be entered by the user. */
  var Min: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns the date value which is currently displayed in the date field. */
  def getDate(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns the currently set last value which is set on END key. */
  def getLast(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns the currently set maximum date value that can be entered by the user. */
  def getMax(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns the currently set minimum date value that can be entered by the user. */
  def getMin(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** returns whether currently an empty value is set for the date. */
  def isEmpty(): scala.Boolean
  /** determines if the long date format is currently used. */
  def isLongFormat(): scala.Boolean
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): scala.Boolean
  /** sets the date value which is displayed in the date field. */
  def setDate(Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /** sets an empty value for the date. */
  def setEmpty(): scala.Unit
  /** sets the first value to be set on POS1 key. */
  def setFirst(Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /** sets the last value to be set on END key. */
  def setLast(Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /** determines if the long date format is to be used. */
  def setLongFormat(bLong: scala.Boolean): scala.Unit
  /** sets the maximum date value that can be entered by the user. */
  def setMax(Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /** sets the minimum date value that can be entered by the user. */
  def setMin(Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: scala.Boolean): scala.Unit
}

object XDateField {
  @scala.inline
  def apply(
    Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    First: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    Last: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    Max: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    Min: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    acquire: js.Function0[scala.Unit],
    getDate: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    getFirst: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    getLast: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    getMax: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    getMin: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    isEmpty: js.Function0[scala.Boolean],
    isLongFormat: js.Function0[scala.Boolean],
    isStrictFormat: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDate: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    setEmpty: js.Function0[scala.Unit],
    setFirst: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    setLast: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    setLongFormat: js.Function1[scala.Boolean, scala.Unit],
    setMax: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    setMin: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    setStrictFormat: js.Function1[scala.Boolean, scala.Unit]
  ): XDateField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Date")(Date)
    __obj.updateDynamic("First")(First)
    __obj.updateDynamic("Last")(Last)
    __obj.updateDynamic("Max")(Max)
    __obj.updateDynamic("Min")(Min)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDate")(getDate)
    __obj.updateDynamic("getFirst")(getFirst)
    __obj.updateDynamic("getLast")(getLast)
    __obj.updateDynamic("getMax")(getMax)
    __obj.updateDynamic("getMin")(getMin)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("isLongFormat")(isLongFormat)
    __obj.updateDynamic("isStrictFormat")(isStrictFormat)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDate")(setDate)
    __obj.updateDynamic("setEmpty")(setEmpty)
    __obj.updateDynamic("setFirst")(setFirst)
    __obj.updateDynamic("setLast")(setLast)
    __obj.updateDynamic("setLongFormat")(setLongFormat)
    __obj.updateDynamic("setMax")(setMax)
    __obj.updateDynamic("setMin")(setMin)
    __obj.updateDynamic("setStrictFormat")(setStrictFormat)
    __obj.asInstanceOf[XDateField]
  }
}

