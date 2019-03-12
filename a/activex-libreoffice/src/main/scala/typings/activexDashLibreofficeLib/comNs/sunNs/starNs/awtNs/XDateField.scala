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
    acquire: () => scala.Unit,
    getDate: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    getFirst: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    getLast: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    getMax: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    getMin: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    isEmpty: () => scala.Boolean,
    isLongFormat: () => scala.Boolean,
    isStrictFormat: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date => scala.Unit,
    setEmpty: () => scala.Unit,
    setFirst: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date => scala.Unit,
    setLast: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date => scala.Unit,
    setLongFormat: scala.Boolean => scala.Unit,
    setMax: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date => scala.Unit,
    setMin: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date => scala.Unit,
    setStrictFormat: scala.Boolean => scala.Unit
  ): XDateField = {
    val __obj = js.Dynamic.literal(Date = Date, First = First, Last = Last, Max = Max, Min = Min, acquire = js.Any.fromFunction0(acquire), getDate = js.Any.fromFunction0(getDate), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), isEmpty = js.Any.fromFunction0(isEmpty), isLongFormat = js.Any.fromFunction0(isLongFormat), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDate = js.Any.fromFunction1(setDate), setEmpty = js.Any.fromFunction0(setEmpty), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setLongFormat = js.Any.fromFunction1(setLongFormat), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setStrictFormat = js.Any.fromFunction1(setStrictFormat))
  
    __obj.asInstanceOf[XDateField]
  }
}

