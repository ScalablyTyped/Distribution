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
  * specifies service of text field that displays a {@link URL}
  * @see com.sun.star.text.TextField
  */
trait URL extends TextField {
  /** Specifies how the {@link URL} is formatted on output. */
  var Format: Double
  /**
    * contains the content that will be displayed to the user.
    *
    * If this string is empty, the `URL` will be shown.
    */
  var Representation: String
  /** Specifies the frame name in that the {@link URL} will be opened */
  var TargetFrame: String
  /**
    * contains the unparsed original {@link URL} , for example, [http://me:pass@www.sun.de:8080/pub/test/foo.txt?a=b#xyz]{@link
    * url="http://me:pass@www.sun.de:8080/pub/test/foo.txt?a=b#xyz"}
    */
  var URL: String
}

object URL {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Format: Double,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    PropertySetInfo: XPropertySetInfo,
    Representation: String,
    TargetFrame: String,
    TextWrap: WrapTextMode,
    URL: String,
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
  ): URL = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, Format = Format, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, PropertySetInfo = PropertySetInfo, Representation = Representation, TargetFrame = TargetFrame, TextWrap = TextWrap, URL = URL, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[URL]
  }
}

