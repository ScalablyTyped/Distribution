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
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a place holder text field.
  * @see com.sun.star.text.TextField
  */
trait JumpEdit extends TextField {
  /** determines a hint that is displayed at the user interface as tip. */
  var Hint: String
  /** determines the text of the place holder. */
  var PlaceHolder: String
  /** determines the type of the place holder as described in {@link com.sun.star.text.PlaceholderType} . */
  var PlaceHolderType: Double
}

object JumpEdit {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Hint: String,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    PlaceHolder: String,
    PlaceHolderType: Double,
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
  ): JumpEdit = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, Hint = Hint, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, PlaceHolder = PlaceHolder, PlaceHolderType = PlaceHolderType, PropertySetInfo = PropertySetInfo, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[JumpEdit]
  }
}

