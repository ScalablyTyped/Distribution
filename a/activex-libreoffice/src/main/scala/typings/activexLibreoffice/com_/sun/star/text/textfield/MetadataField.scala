package typings.activexLibreoffice.com_.sun.star.text.textfield

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.StringPair
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.rdf.XMetadatable
import typings.activexLibreoffice.com_.sun.star.text.TextContentAnchorType
import typings.activexLibreoffice.com_.sun.star.text.TextField_
import typings.activexLibreoffice.com_.sun.star.text.WrapTextMode
import typings.activexLibreoffice.com_.sun.star.text.XText
import typings.activexLibreoffice.com_.sun.star.text.XTextContent
import typings.activexLibreoffice.com_.sun.star.text.XTextCursor
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a {@link com.sun.star.text.TextField} whose content is specified by RDF metadata.
  * @see com.sun.star.rdf
  * @since OOo 3.2
  */
trait MetadataField
  extends StObject
     with TextField_
     with XMetadatable
     with XText
     with XEnumerationAccess
     with XChild {
  
  /** determines whether changes in language attributes at the position of the text field also change the number format as appropriate for this language. */
  var IsFixedLanguage: Boolean
  
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: Double
}
object MetadataField {
  
  inline def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    ElementType: `type`,
    End: XTextRange,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    IsFixedLanguage: Boolean,
    LocalName: String,
    MetadataReference: StringPair,
    Namespace: String,
    NumberFormat: Double,
    Parent: XInterface,
    PropertySetInfo: XPropertySetInfo,
    Start: XTextRange,
    String: String,
    StringValue: String,
    TextWrap: WrapTextMode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    createEnumeration: () => XEnumeration,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    dispose: () => Unit,
    ensureMetadataReference: () => Unit,
    getAnchor: () => XTextRange,
    getElementType: () => `type`,
    getEnd: () => XTextRange,
    getParent: () => XInterface,
    getPresentation: Boolean => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    hasElements: () => Boolean,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeTextContent: XTextContent => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setParent: XInterface => Unit,
    setPropertyValue: (String, Any) => Unit,
    setString: String => Unit
  ): MetadataField = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixedLanguage = IsFixedLanguage.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], MetadataReference = MetadataReference.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), createEnumeration = js.Any.fromFunction0(createEnumeration), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), dispose = js.Any.fromFunction0(dispose), ensureMetadataReference = js.Any.fromFunction0(ensureMetadataReference), getAnchor = js.Any.fromFunction0(getAnchor), getElementType = js.Any.fromFunction0(getElementType), getEnd = js.Any.fromFunction0(getEnd), getParent = js.Any.fromFunction0(getParent), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), hasElements = js.Any.fromFunction0(hasElements), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[MetadataField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataField] (val x: Self) extends AnyVal {
    
    inline def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
  }
}
