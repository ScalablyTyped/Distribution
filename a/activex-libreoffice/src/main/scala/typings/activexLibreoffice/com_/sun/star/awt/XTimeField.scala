package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a time field. */
trait XTimeField
  extends StObject
     with XInterface {
  
  /** returns the currently set first value which is set on POS1 key. */
  var First: Time
  
  /** returns the currently set last value which is set on END key. */
  var Last: Time
  
  /** returns the currently set maximum time value that can be entered by the user. */
  var Max: Time
  
  /** returns the currently set minimum time value that can be entered by the user. */
  var Min: Time
  
  /** returns the time value which is currently displayed in the time field. */
  var Time: typings.activexLibreoffice.com_.sun.star.util.Time
  
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
  
  inline def apply(
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
    queryInterface: `type` => Any,
    release: () => Unit,
    setEmpty: () => Unit,
    setFirst: Time => Unit,
    setLast: Time => Unit,
    setMax: Time => Unit,
    setMin: Time => Unit,
    setStrictFormat: Boolean => Unit,
    setTime: Time => Unit
  ): XTimeField = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getTime = js.Any.fromFunction0(getTime), isEmpty = js.Any.fromFunction0(isEmpty), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEmpty = js.Any.fromFunction0(setEmpty), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setTime = js.Any.fromFunction1(setTime))
    __obj.asInstanceOf[XTimeField]
  }
  
  extension [Self <: XTimeField](x: Self) {
    
    inline def setFirst(value: Time): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setGetFirst(value: () => Time): Self = StObject.set(x, "getFirst", js.Any.fromFunction0(value))
    
    inline def setGetLast(value: () => Time): Self = StObject.set(x, "getLast", js.Any.fromFunction0(value))
    
    inline def setGetMax(value: () => Time): Self = StObject.set(x, "getMax", js.Any.fromFunction0(value))
    
    inline def setGetMin(value: () => Time): Self = StObject.set(x, "getMin", js.Any.fromFunction0(value))
    
    inline def setGetTime(value: () => Time): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setIsStrictFormat(value: () => Boolean): Self = StObject.set(x, "isStrictFormat", js.Any.fromFunction0(value))
    
    inline def setLast(value: Time): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Time): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Time): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setSetEmpty(value: () => Unit): Self = StObject.set(x, "setEmpty", js.Any.fromFunction0(value))
    
    inline def setSetFirst(value: Time => Unit): Self = StObject.set(x, "setFirst", js.Any.fromFunction1(value))
    
    inline def setSetLast(value: Time => Unit): Self = StObject.set(x, "setLast", js.Any.fromFunction1(value))
    
    inline def setSetMax(value: Time => Unit): Self = StObject.set(x, "setMax", js.Any.fromFunction1(value))
    
    inline def setSetMin(value: Time => Unit): Self = StObject.set(x, "setMin", js.Any.fromFunction1(value))
    
    inline def setSetStrictFormat(value: Boolean => Unit): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1(value))
    
    inline def setSetTime(value: Time => Unit): Self = StObject.set(x, "setTime", js.Any.fromFunction1(value))
    
    inline def setTime(value: Time): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
  }
}
