package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and formatting of a numeric field. */
@js.native
trait XNumericField extends XInterface {
  
  /** returns the currently set number of decimals. */
  var DecimalDigits: Double = js.native
  
  /** returns the currently set first value which is set on POS1 key. */
  var First: Double = js.native
  
  /** returns the currently set last value which is set on END key. */
  var Last: Double = js.native
  
  /** returns the currently set maximum value that can be entered by the user. */
  var Max: Double = js.native
  
  /** returns the currently set minimum value that can be entered by the user. */
  var Min: Double = js.native
  
  /** returns the currently set increment value for the spin button. */
  var SpinSize: Double = js.native
  
  /** returns the value which is currently displayed in the numeric field. */
  var Value: Double = js.native
  
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): Double = js.native
  
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Double = js.native
  
  /** returns the currently set last value which is set on END key. */
  def getLast(): Double = js.native
  
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(): Double = js.native
  
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(): Double = js.native
  
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): Double = js.native
  
  /** returns the value which is currently displayed in the numeric field. */
  def getValue(): Double = js.native
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean = js.native
  
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: Double): Unit = js.native
  
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: Double): Unit = js.native
  
  /** sets the last value to be set on END key. */
  def setLast(Value: Double): Unit = js.native
  
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: Double): Unit = js.native
  
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: Double): Unit = js.native
  
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: Double): Unit = js.native
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit = js.native
  
  /** sets the value which is displayed in the numeric field. */
  def setValue(Value: Double): Unit = js.native
}
object XNumericField {
  
  @scala.inline
  def apply(
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
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDecimalDigits: Double => Unit,
    setFirst: Double => Unit,
    setLast: Double => Unit,
    setMax: Double => Unit,
    setMin: Double => Unit,
    setSpinSize: Double => Unit,
    setStrictFormat: Boolean => Unit,
    setValue: Double => Unit
  ): XNumericField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], SpinSize = SpinSize.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDecimalDigits = js.Any.fromFunction0(getDecimalDigits), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getSpinSize = js.Any.fromFunction0(getSpinSize), getValue = js.Any.fromFunction0(getValue), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDecimalDigits = js.Any.fromFunction1(setDecimalDigits), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setSpinSize = js.Any.fromFunction1(setSpinSize), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XNumericField]
  }
  
  @scala.inline
  implicit class XNumericFieldOps[Self <: XNumericField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecimalDigits(value: Double): Self = this.set("DecimalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Double): Self = this.set("First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast(value: Double): Self = this.set("Last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinSize(value: Double): Self = this.set("SpinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDecimalDigits(value: () => Double): Self = this.set("getDecimalDigits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirst(value: () => Double): Self = this.set("getFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLast(value: () => Double): Self = this.set("getLast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMax(value: () => Double): Self = this.set("getMax", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMin(value: () => Double): Self = this.set("getMin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSpinSize(value: () => Double): Self = this.set("getSpinSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => Double): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStrictFormat(value: () => Boolean): Self = this.set("isStrictFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDecimalDigits(value: Double => Unit): Self = this.set("setDecimalDigits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFirst(value: Double => Unit): Self = this.set("setFirst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLast(value: Double => Unit): Self = this.set("setLast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMax(value: Double => Unit): Self = this.set("setMax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMin(value: Double => Unit): Self = this.set("setMin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSpinSize(value: Double => Unit): Self = this.set("setSpinSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStrictFormat(value: Boolean => Unit): Self = this.set("setStrictFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: Double => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
}
