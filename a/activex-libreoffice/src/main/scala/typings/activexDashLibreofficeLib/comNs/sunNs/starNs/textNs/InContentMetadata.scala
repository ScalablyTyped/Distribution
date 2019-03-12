package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a {@link TextContent} that can be used to attach RDF metadata to a range of text.
  * @since OOo 3.2
  */
trait InContentMetadata
  extends TextContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.XMetadatable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild

object InContentMetadata {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: stdLib.SafeArray[TextContentAnchorType],
    ElementType: activexDashLibreofficeLib.`type`,
    LocalName: java.lang.String,
    MetadataReference: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair,
    Namespace: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    StringValue: java.lang.String,
    TextWrap: WrapTextMode,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attach: XTextRange => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    dispose: () => scala.Unit,
    ensureMetadataReference: () => scala.Unit,
    getAnchor: () => XTextRange,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit
  ): InContentMetadata = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, ElementType = ElementType, LocalName = LocalName, MetadataReference = MetadataReference, Namespace = Namespace, Parent = Parent, StringValue = StringValue, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), ensureMetadataReference = js.Any.fromFunction0(ensureMetadataReference), getAnchor = js.Any.fromFunction0(getAnchor), getElementType = js.Any.fromFunction0(getElementType), getParent = js.Any.fromFunction0(getParent), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[InContentMetadata]
  }
}

