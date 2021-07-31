package typings.activexLibreoffice.com_.sun.star.text.textfield

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.text.TextContentAnchorType
import typings.activexLibreoffice.com_.sun.star.text.TextField_
import typings.activexLibreoffice.com_.sun.star.text.WrapTextMode
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of a date or time text field.
  * @see com.sun.star.text.TextField
  */
trait DateTime
  extends StObject
     with TextField_ {
  
  /** contains an offset to the date or time value in minutes. */
  var Adjust: Double
  
  /**
    * this is the display format for this field. Depending on {@link IsDate} , this is either a {@link com.sun.star.text.DateDisplayFormat} or {@link
    * com.sun.star.text.TimeDisplayFormat} .
    *
    * This property is deprecated and is here only for components that do not support a {@link com.sun.star.util.NumberFormatter} .
    * @deprecated Deprecated
    * @see com.sun.star.text.DateDisplayFormat
    * @see com.sun.star.text.TimeDisplayFormat
    */
  var DateTimeFormat: Double
  
  /** the is the content of this field. */
  var DateTimeValue: typings.activexLibreoffice.com_.sun.star.util.DateTime
  
  /** If this flag is set to `TRUE` this field represents a date with an optional time. If it is set to `FALSE` only the time is used here. */
  var IsDate: Boolean
  
  /**
    * If this flag is set to `FALSE` the date or time is always displayed as the current date or time.
    * @since OOo 1.1.2
    */
  var IsFixed: Boolean
  
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    */
  var IsFixedLanguage: Boolean
  
  /**
    * this is the number format for this field
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: Double
}
object DateTime {
  
  @scala.inline
  def apply(
    Adjust: Double,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    DateTimeFormat: Double,
    DateTimeValue: typings.activexLibreoffice.com_.sun.star.util.DateTime,
    IsDate: Boolean,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    IsFixed: Boolean,
    IsFixedLanguage: Boolean,
    NumberFormat: Double,
    PropertySetInfo: XPropertySetInfo,
    TextWrap: WrapTextMode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getPresentation: Boolean => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DateTime = {
    val __obj = js.Dynamic.literal(Adjust = Adjust.asInstanceOf[js.Any], Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], DateTimeFormat = DateTimeFormat.asInstanceOf[js.Any], DateTimeValue = DateTimeValue.asInstanceOf[js.Any], IsDate = IsDate.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], IsFixedLanguage = IsFixedLanguage.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DateTime]
  }
  
  @scala.inline
  implicit class DateTimeMutableBuilder[Self <: DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjust(value: Double): Self = StObject.set(x, "Adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeFormat(value: Double): Self = StObject.set(x, "DateTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeValue(value: typings.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDate(value: Boolean): Self = StObject.set(x, "IsDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
  }
}
