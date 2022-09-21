package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and formatting of a currency field. */
trait XCurrencyField
  extends StObject
     with XInterface {
  
  /** returns the currently set number of decimals. */
  var DecimalDigits: Double
  
  /** returns the currently set first value which is set on POS1 key. */
  var First: Double
  
  /** returns the currently set last value which is set on END key. */
  var Last: Double
  
  /** returns the currently set maximum value that can be entered by the user. */
  var Max: Double
  
  /** returns the currently set minimum value that can be entered by the user. */
  var Min: Double
  
  /** returns the currently set increment value for the spin button. */
  var SpinSize: Double
  
  /** returns the value which is currently displayed in the currency field. */
  var Value: Double
  
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): Double
  
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Double
  
  /** returns the currently set last value which is set on END key. */
  def getLast(): Double
  
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(): Double
  
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(): Double
  
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): Double
  
  /** returns the value which is currently displayed in the currency field. */
  def getValue(): Double
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: Double): Unit
  
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: Double): Unit
  
  /** sets the last value to be set on END key. */
  def setLast(Value: Double): Unit
  
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: Double): Unit
  
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: Double): Unit
  
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: Double): Unit
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  
  /** sets the value which is displayed in the currency field. */
  def setValue(Value: Double): Unit
}
object XCurrencyField {
  
  inline def apply(
    DecimalDigits: Double,
    First: Double,
    Last: Double,
    Max: Double,
    Min: Double,
    SpinSize: Double,
    Value: Double,
    acquire: () => Unit,
    getDecimalDigits: () => Double,
    getFirst: () => Double,
    getLast: () => Double,
    getMax: () => Double,
    getMin: () => Double,
    getSpinSize: () => Double,
    getValue: () => Double,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setDecimalDigits: Double => Unit,
    setFirst: Double => Unit,
    setLast: Double => Unit,
    setMax: Double => Unit,
    setMin: Double => Unit,
    setSpinSize: Double => Unit,
    setStrictFormat: Boolean => Unit,
    setValue: Double => Unit
  ): XCurrencyField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], SpinSize = SpinSize.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDecimalDigits = js.Any.fromFunction0(getDecimalDigits), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getSpinSize = js.Any.fromFunction0(getSpinSize), getValue = js.Any.fromFunction0(getValue), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDecimalDigits = js.Any.fromFunction1(setDecimalDigits), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setSpinSize = js.Any.fromFunction1(setSpinSize), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XCurrencyField]
  }
  
  extension [Self <: XCurrencyField](x: Self) {
    
    inline def setDecimalDigits(value: Double): Self = StObject.set(x, "DecimalDigits", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Double): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setGetDecimalDigits(value: () => Double): Self = StObject.set(x, "getDecimalDigits", js.Any.fromFunction0(value))
    
    inline def setGetFirst(value: () => Double): Self = StObject.set(x, "getFirst", js.Any.fromFunction0(value))
    
    inline def setGetLast(value: () => Double): Self = StObject.set(x, "getLast", js.Any.fromFunction0(value))
    
    inline def setGetMax(value: () => Double): Self = StObject.set(x, "getMax", js.Any.fromFunction0(value))
    
    inline def setGetMin(value: () => Double): Self = StObject.set(x, "getMin", js.Any.fromFunction0(value))
    
    inline def setGetSpinSize(value: () => Double): Self = StObject.set(x, "getSpinSize", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setIsStrictFormat(value: () => Boolean): Self = StObject.set(x, "isStrictFormat", js.Any.fromFunction0(value))
    
    inline def setLast(value: Double): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setSetDecimalDigits(value: Double => Unit): Self = StObject.set(x, "setDecimalDigits", js.Any.fromFunction1(value))
    
    inline def setSetFirst(value: Double => Unit): Self = StObject.set(x, "setFirst", js.Any.fromFunction1(value))
    
    inline def setSetLast(value: Double => Unit): Self = StObject.set(x, "setLast", js.Any.fromFunction1(value))
    
    inline def setSetMax(value: Double => Unit): Self = StObject.set(x, "setMax", js.Any.fromFunction1(value))
    
    inline def setSetMin(value: Double => Unit): Self = StObject.set(x, "setMin", js.Any.fromFunction1(value))
    
    inline def setSetSpinSize(value: Double => Unit): Self = StObject.set(x, "setSpinSize", js.Any.fromFunction1(value))
    
    inline def setSetStrictFormat(value: Boolean => Unit): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: Double => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSpinSize(value: Double): Self = StObject.set(x, "SpinSize", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
