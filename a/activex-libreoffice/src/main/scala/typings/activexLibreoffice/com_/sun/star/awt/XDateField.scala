package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a date field. */
trait XDateField
  extends StObject
     with XInterface {
  
  /** returns the date value which is currently displayed in the date field. */
  var Date: typings.activexLibreoffice.com_.sun.star.util.Date
  
  /** returns the currently set first value which is set on POS1 key. */
  var First: Date
  
  /** returns the currently set last value which is set on END key. */
  var Last: Date
  
  /** returns the currently set maximum date value that can be entered by the user. */
  var Max: Date
  
  /** returns the currently set minimum date value that can be entered by the user. */
  var Min: Date
  
  /** returns the date value which is currently displayed in the date field. */
  def getDate(): Date
  
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Date
  
  /** returns the currently set last value which is set on END key. */
  def getLast(): Date
  
  /** returns the currently set maximum date value that can be entered by the user. */
  def getMax(): Date
  
  /** returns the currently set minimum date value that can be entered by the user. */
  def getMin(): Date
  
  /** returns whether currently an empty value is set for the date. */
  def isEmpty(): Boolean
  
  /** determines if the long date format is currently used. */
  def isLongFormat(): Boolean
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  
  /** sets the date value which is displayed in the date field. */
  def setDate(Date: Date): Unit
  
  /** sets an empty value for the date. */
  def setEmpty(): Unit
  
  /** sets the first value to be set on POS1 key. */
  def setFirst(Date: Date): Unit
  
  /** sets the last value to be set on END key. */
  def setLast(Date: Date): Unit
  
  /** determines if the long date format is to be used. */
  def setLongFormat(bLong: Boolean): Unit
  
  /** sets the maximum date value that can be entered by the user. */
  def setMax(Date: Date): Unit
  
  /** sets the minimum date value that can be entered by the user. */
  def setMin(Date: Date): Unit
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
}
object XDateField {
  
  inline def apply(
    Date: Date,
    First: Date,
    Last: Date,
    Max: Date,
    Min: Date,
    acquire: () => Unit,
    getDate: () => Date,
    getFirst: () => Date,
    getLast: () => Date,
    getMax: () => Date,
    getMin: () => Date,
    isEmpty: () => Boolean,
    isLongFormat: () => Boolean,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setDate: Date => Unit,
    setEmpty: () => Unit,
    setFirst: Date => Unit,
    setLast: Date => Unit,
    setLongFormat: Boolean => Unit,
    setMax: Date => Unit,
    setMin: Date => Unit,
    setStrictFormat: Boolean => Unit
  ): XDateField = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDate = js.Any.fromFunction0(getDate), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), isEmpty = js.Any.fromFunction0(isEmpty), isLongFormat = js.Any.fromFunction0(isLongFormat), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDate = js.Any.fromFunction1(setDate), setEmpty = js.Any.fromFunction0(setEmpty), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setLongFormat = js.Any.fromFunction1(setLongFormat), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setStrictFormat = js.Any.fromFunction1(setStrictFormat))
    __obj.asInstanceOf[XDateField]
  }
  
  extension [Self <: XDateField](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Date): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setGetDate(value: () => Date): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
    
    inline def setGetFirst(value: () => Date): Self = StObject.set(x, "getFirst", js.Any.fromFunction0(value))
    
    inline def setGetLast(value: () => Date): Self = StObject.set(x, "getLast", js.Any.fromFunction0(value))
    
    inline def setGetMax(value: () => Date): Self = StObject.set(x, "getMax", js.Any.fromFunction0(value))
    
    inline def setGetMin(value: () => Date): Self = StObject.set(x, "getMin", js.Any.fromFunction0(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setIsLongFormat(value: () => Boolean): Self = StObject.set(x, "isLongFormat", js.Any.fromFunction0(value))
    
    inline def setIsStrictFormat(value: () => Boolean): Self = StObject.set(x, "isStrictFormat", js.Any.fromFunction0(value))
    
    inline def setLast(value: Date): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Date): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Date): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setSetDate(value: Date => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction1(value))
    
    inline def setSetEmpty(value: () => Unit): Self = StObject.set(x, "setEmpty", js.Any.fromFunction0(value))
    
    inline def setSetFirst(value: Date => Unit): Self = StObject.set(x, "setFirst", js.Any.fromFunction1(value))
    
    inline def setSetLast(value: Date => Unit): Self = StObject.set(x, "setLast", js.Any.fromFunction1(value))
    
    inline def setSetLongFormat(value: Boolean => Unit): Self = StObject.set(x, "setLongFormat", js.Any.fromFunction1(value))
    
    inline def setSetMax(value: Date => Unit): Self = StObject.set(x, "setMax", js.Any.fromFunction1(value))
    
    inline def setSetMin(value: Date => Unit): Self = StObject.set(x, "setMin", js.Any.fromFunction1(value))
    
    inline def setSetStrictFormat(value: Boolean => Unit): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1(value))
  }
}
