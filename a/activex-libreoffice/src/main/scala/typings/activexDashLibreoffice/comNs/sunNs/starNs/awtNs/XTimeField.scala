package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a time field. */
trait XTimeField extends XInterface {
  /** returns the currently set first value which is set on POS1 key. */
  var First: Time
  /** returns the currently set last value which is set on END key. */
  var Last: Time
  /** returns the currently set maximum time value that can be entered by the user. */
  var Max: Time
  /** returns the currently set minimum time value that can be entered by the user. */
  var Min: Time
  /** returns the time value which is currently displayed in the time field. */
  var Time: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Time
  /** returns the currently set last value which is set on END key. */
  def getLast(): Time
  /** returns the currently set maximum time value that can be entered by the user. */
  def getMax(): Time
  /** returns the currently set minimum time value that can be entered by the user. */
  def getMin(): Time
  /** returns the time value which is currently displayed in the time field. */
  def getTime(): Time
  /** returns whether currently an empty value is set for the time. */
  def isEmpty(): Boolean
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  /** sets an empty value for the time. */
  def setEmpty(): Unit
  /** sets the first value to be set on POS1 key. */
  def setFirst(Time: Time): Unit
  /** sets the last value to be set on END key. */
  def setLast(Time: Time): Unit
  /** sets the maximum time value that can be entered by the user. */
  def setMax(Time: Time): Unit
  /** sets the minimum time value that can be entered by the user. */
  def setMin(Time: Time): Unit
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  /** sets the time value which is displayed in the time field. */
  def setTime(Time: Time): Unit
}

object XTimeField {
  @scala.inline
  def apply(
    First: Time,
    Last: Time,
    Max: Time,
    Min: Time,
    Time: Time,
    acquire: () => Unit,
    getFirst: () => Time,
    getLast: () => Time,
    getMax: () => Time,
    getMin: () => Time,
    getTime: () => Time,
    isEmpty: () => Boolean,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setEmpty: () => Unit,
    setFirst: Time => Unit,
    setLast: Time => Unit,
    setMax: Time => Unit,
    setMin: Time => Unit,
    setStrictFormat: Boolean => Unit,
    setTime: Time => Unit
  ): XTimeField = {
    val __obj = js.Dynamic.literal(First = First, Last = Last, Max = Max, Min = Min, Time = Time, acquire = js.Any.fromFunction0(acquire), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getTime = js.Any.fromFunction0(getTime), isEmpty = js.Any.fromFunction0(isEmpty), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEmpty = js.Any.fromFunction0(setEmpty), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setTime = js.Any.fromFunction1(setTime))
  
    __obj.asInstanceOf[XTimeField]
  }
}

