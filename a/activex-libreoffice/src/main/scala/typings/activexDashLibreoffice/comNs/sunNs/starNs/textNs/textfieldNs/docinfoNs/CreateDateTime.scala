package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.TextContentAnchorType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.TextField
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.WrapTextMode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextRange
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a text field that provides information about the date and time of the document creation.
  * @see com.sun.star.text.TextField
  */
trait CreateDateTime extends TextField {
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: String
  /** contains the date and time as double value. */
  var DateTimeValue: Double
  /** If this flag is set to `TRUE` this field represents, a date with an optional time. If it is set to `FALSE` only the time is used here. */
  var IsDate: Boolean
  /**
    * If this flag is set to false the author will be overridden by the current author each time the document is saved. If this flag is set to `FALSE` the
    * date or time is always displayed as the current date or time.
    * @since OOo 1.1.2
    */
  var IsFixed: Boolean
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    */
  var IsFixedLanguage: Boolean
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: Double
}

object CreateDateTime {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    CurrentPresentation: String,
    DateTimeValue: Double,
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
  ): CreateDateTime = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, CurrentPresentation = CurrentPresentation, DateTimeValue = DateTimeValue, IsDate = IsDate, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, IsFixed = IsFixed, IsFixedLanguage = IsFixedLanguage, NumberFormat = NumberFormat, PropertySetInfo = PropertySetInfo, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[CreateDateTime]
  }
}

