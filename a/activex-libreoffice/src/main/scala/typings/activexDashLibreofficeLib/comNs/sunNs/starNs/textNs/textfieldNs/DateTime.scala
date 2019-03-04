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
    AnchorTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType],
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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    attach: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getPresentation: js.Function1[scala.Boolean, java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DateTime = {
    val __obj = js.Dynamic.literal(Adjust = Adjust, Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, DateTimeFormat = DateTimeFormat, DateTimeValue = DateTimeValue, IsDate = IsDate, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, IsFixed = IsFixed, IsFixedLanguage = IsFixedLanguage, NumberFormat = NumberFormat, PropertySetInfo = PropertySetInfo, TextWrap = TextWrap, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getPresentation = getPresentation, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DateTime]
  }
}

