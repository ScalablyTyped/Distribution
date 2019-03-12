package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a date or time text field.
  * @see com.sun.star.text.TextField
  */
trait DateTime
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains an offset to the date or time value in minutes. */
  var Adjust: scala.Double
  /**
    * this is the display format for this field. Depending on {@link IsDate} , this is either a {@link com.sun.star.text.DateDisplayFormat} or {@link
    * com.sun.star.text.TimeDisplayFormat} .
    *
    * This property is deprecated and is here only for components that do not support a {@link com.sun.star.util.NumberFormatter} .
    * @deprecated Deprecated
    * @see com.sun.star.text.DateDisplayFormat
    * @see com.sun.star.text.TimeDisplayFormat
    */
  var DateTimeFormat: scala.Double
  /** the is the content of this field. */
  var DateTimeValue: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /** If this flag is set to `TRUE` this field represents a date with an optional time. If it is set to `FALSE` only the time is used here. */
  var IsDate: scala.Boolean
  /**
    * If this flag is set to `FALSE` the date or time is always displayed as the current date or time.
    * @since OOo 1.1.2
    */
  var IsFixed: scala.Boolean
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    */
  var IsFixedLanguage: scala.Boolean
  /**
    * this is the number format for this field
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: scala.Double
}

object DateTime {
  @scala.inline
  def apply(
    Adjust: scala.Double,
    Anchor: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    AnchorType: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType,
    AnchorTypes: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType],
    DateTimeFormat: scala.Double,
    DateTimeValue: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    IsDate: scala.Boolean,
    IsFieldDisplayed: scala.Boolean,
    IsFieldUsed: scala.Boolean,
    IsFixed: scala.Boolean,
    IsFixedLanguage: scala.Boolean,
    NumberFormat: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    TextWrap: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    attach: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange => scala.Unit,
    dispose: () => scala.Unit,
    getAnchor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    getPresentation: scala.Boolean => java.lang.String,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): DateTime = {
    val __obj = js.Dynamic.literal(Adjust = Adjust, Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, DateTimeFormat = DateTimeFormat, DateTimeValue = DateTimeValue, IsDate = IsDate, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, IsFixed = IsFixed, IsFixedLanguage = IsFixedLanguage, NumberFormat = NumberFormat, PropertySetInfo = PropertySetInfo, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DateTime]
  }
}

