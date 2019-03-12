package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a {@link com.sun.star.text.TextField} whose content is specified by RDF metadata.
  * @see com.sun.star.rdf
  * @since OOo 3.2
  */
trait MetadataField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField
     with activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.XMetadatable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild {
  /** determines whether changes in language attributes at the position of the text field also change the number format as appropriate for this language. */
  var IsFixedLanguage: scala.Boolean
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: scala.Double
}

object MetadataField {
  @scala.inline
  def apply(
    Anchor: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    AnchorType: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType,
    AnchorTypes: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType],
    ElementType: activexDashLibreofficeLib.`type`,
    End: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    IsFieldDisplayed: scala.Boolean,
    IsFieldUsed: scala.Boolean,
    IsFixedLanguage: scala.Boolean,
    LocalName: java.lang.String,
    MetadataReference: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair,
    Namespace: java.lang.String,
    NumberFormat: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Start: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    String: java.lang.String,
    StringValue: java.lang.String,
    TextWrap: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    attach: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    createTextCursor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor,
    createTextCursorByRange: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor,
    dispose: () => scala.Unit,
    ensureMetadataReference: () => scala.Unit,
    getAnchor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getEnd: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getPresentation: scala.Boolean => java.lang.String,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getStart: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    getString: () => java.lang.String,
    getText: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    hasElements: () => scala.Boolean,
    insertControlCharacter: (activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, scala.Double, scala.Boolean) => scala.Unit,
    insertString: (activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, java.lang.String, scala.Boolean) => scala.Unit,
    insertTextContent: (activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextContent, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeTextContent: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextContent => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): MetadataField = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, ElementType = ElementType, End = End, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, IsFixedLanguage = IsFixedLanguage, LocalName = LocalName, MetadataReference = MetadataReference, Namespace = Namespace, NumberFormat = NumberFormat, Parent = Parent, PropertySetInfo = PropertySetInfo, Start = Start, String = String, StringValue = StringValue, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), createEnumeration = js.Any.fromFunction0(createEnumeration), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), dispose = js.Any.fromFunction0(dispose), ensureMetadataReference = js.Any.fromFunction0(ensureMetadataReference), getAnchor = js.Any.fromFunction0(getAnchor), getElementType = js.Any.fromFunction0(getElementType), getEnd = js.Any.fromFunction0(getEnd), getParent = js.Any.fromFunction0(getParent), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), hasElements = js.Any.fromFunction0(hasElements), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[MetadataField]
  }
}

