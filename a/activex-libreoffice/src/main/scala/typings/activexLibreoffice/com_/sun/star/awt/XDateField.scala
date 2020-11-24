package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a date field. */
@js.native
trait XDateField extends XInterface {
  
  /** returns the date value which is currently displayed in the date field. */
  var Date: typings.activexLibreoffice.com_.sun.star.util.Date = js.native
  
  /** returns the currently set first value which is set on POS1 key. */
  var First: Date = js.native
  
  /** returns the currently set last value which is set on END key. */
  var Last: Date = js.native
  
  /** returns the currently set maximum date value that can be entered by the user. */
  var Max: Date = js.native
  
  /** returns the currently set minimum date value that can be entered by the user. */
  var Min: Date = js.native
  
  /** returns the date value which is currently displayed in the date field. */
  def getDate(): Date = js.native
  
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Date = js.native
  
  /** returns the currently set last value which is set on END key. */
  def getLast(): Date = js.native
  
  /** returns the currently set maximum date value that can be entered by the user. */
  def getMax(): Date = js.native
  
  /** returns the currently set minimum date value that can be entered by the user. */
  def getMin(): Date = js.native
  
  /** returns whether currently an empty value is set for the date. */
  def isEmpty(): Boolean = js.native
  
  /** determines if the long date format is currently used. */
  def isLongFormat(): Boolean = js.native
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean = js.native
  
  /** sets the date value which is displayed in the date field. */
  def setDate(Date: Date): Unit = js.native
  
  /** sets an empty value for the date. */
  def setEmpty(): Unit = js.native
  
  /** sets the first value to be set on POS1 key. */
  def setFirst(Date: Date): Unit = js.native
  
  /** sets the last value to be set on END key. */
  def setLast(Date: Date): Unit = js.native
  
  /** determines if the long date format is to be used. */
  def setLongFormat(bLong: Boolean): Unit = js.native
  
  /** sets the maximum date value that can be entered by the user. */
  def setMax(Date: Date): Unit = js.native
  
  /** sets the minimum date value that can be entered by the user. */
  def setMin(Date: Date): Unit = js.native
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit = js.native
}
object XDateField {
  
  @scala.inline
  def apply(
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
    queryInterface: `type` => js.Any,
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
  
  @scala.inline
  implicit class XDateFieldOps[Self <: XDateField] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Date): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Date): Self = this.set("First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast(value: Date): Self = this.set("Last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Date): Self = this.set("Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Date): Self = this.set("Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDate(value: () => Date): Self = this.set("getDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirst(value: () => Date): Self = this.set("getFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLast(value: () => Date): Self = this.set("getLast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMax(value: () => Date): Self = this.set("getMax", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMin(value: () => Date): Self = this.set("getMin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLongFormat(value: () => Boolean): Self = this.set("isLongFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStrictFormat(value: () => Boolean): Self = this.set("isStrictFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDate(value: Date => Unit): Self = this.set("setDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEmpty(value: () => Unit): Self = this.set("setEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFirst(value: Date => Unit): Self = this.set("setFirst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLast(value: Date => Unit): Self = this.set("setLast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLongFormat(value: Boolean => Unit): Self = this.set("setLongFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMax(value: Date => Unit): Self = this.set("setMax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMin(value: Date => Unit): Self = this.set("setMin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStrictFormat(value: Boolean => Unit): Self = this.set("setStrictFormat", js.Any.fromFunction1(value))
  }
}
