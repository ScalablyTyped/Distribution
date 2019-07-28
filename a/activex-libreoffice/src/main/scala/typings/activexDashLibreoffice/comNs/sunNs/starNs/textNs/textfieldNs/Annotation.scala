package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.textfieldNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.TextContentAnchorType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.TextField
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.WrapTextMode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Date
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of an annotation text field.
  * @see com.sun.star.text.TextField
  */
trait Annotation extends TextField {
  /** contains the name of the author of the annotation. */
  var Author: String
  /** contains the annotation's content */
  var Content: String
  /** contains the creation date. */
  var Date: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Date
  /** contains the creation date. */
  var DateTimeValue: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * contains the initials of the author of the annotation.
    * @since LibreOffice 4.0
    */
  var Initials: String
  /**
    * contains the name of the annotation.
    * @since LibreOffice 4.0
    */
  var Name: String
}

object Annotation {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Author: String,
    Content: String,
    Date: Date,
    DateTimeValue: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime,
    Initials: String,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    Name: String,
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
  ): Annotation = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, Author = Author, Content = Content, Date = Date, DateTimeValue = DateTimeValue, Initials = Initials, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, Name = Name, PropertySetInfo = PropertySetInfo, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Annotation]
  }
}

