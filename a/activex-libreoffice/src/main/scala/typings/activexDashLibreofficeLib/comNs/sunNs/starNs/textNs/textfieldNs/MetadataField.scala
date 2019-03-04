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
    AnchorTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentAnchorType],
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
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    createTextCursor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor],
    createTextCursorByRange: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor
    ],
    dispose: js.Function0[scala.Unit],
    ensureMetadataReference: js.Function0[scala.Unit],
    getAnchor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getEnd: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPresentation: js.Function1[scala.Boolean, java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getStart: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText],
    hasElements: js.Function0[scala.Boolean],
    insertControlCharacter: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      scala.Double, 
      scala.Boolean, 
      scala.Unit
    ],
    insertString: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      java.lang.String, 
      scala.Boolean, 
      scala.Unit
    ],
    insertTextContent: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextContent, 
      scala.Boolean, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeTextContent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextContent, scala.Unit],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): MetadataField = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, ElementType = ElementType, End = End, IsFieldDisplayed = IsFieldDisplayed, IsFieldUsed = IsFieldUsed, IsFixedLanguage = IsFixedLanguage, LocalName = LocalName, MetadataReference = MetadataReference, Namespace = Namespace, NumberFormat = NumberFormat, Parent = Parent, PropertySetInfo = PropertySetInfo, Start = Start, String = String, StringValue = StringValue, TextWrap = TextWrap, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, attach = attach, createEnumeration = createEnumeration, createTextCursor = createTextCursor, createTextCursorByRange = createTextCursorByRange, dispose = dispose, ensureMetadataReference = ensureMetadataReference, getAnchor = getAnchor, getElementType = getElementType, getEnd = getEnd, getParent = getParent, getPresentation = getPresentation, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getStart = getStart, getString = getString, getText = getText, hasElements = hasElements, insertControlCharacter = insertControlCharacter, insertString = insertString, insertTextContent = insertTextContent, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeTextContent = removeTextContent, removeVetoableChangeListener = removeVetoableChangeListener, setParent = setParent, setPropertyValue = setPropertyValue, setString = setString)
  
    __obj.asInstanceOf[MetadataField]
  }
}

