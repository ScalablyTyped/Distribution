package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.StringPair
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XChild
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.rdfNs.XMetadatable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a {@link TextContent} that can be used to attach RDF metadata to a range of text.
  * @since OOo 3.2
  */
trait InContentMetadata
  extends TextContent
     with XMetadatable
     with XEnumerationAccess
     with XChild

object InContentMetadata {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    ElementType: `type`,
    LocalName: String,
    MetadataReference: StringPair,
    Namespace: String,
    Parent: XInterface,
    StringValue: String,
    TextWrap: WrapTextMode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    createEnumeration: () => XEnumeration,
    dispose: () => Unit,
    ensureMetadataReference: () => Unit,
    getAnchor: () => XTextRange,
    getElementType: () => `type`,
    getParent: () => XInterface,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setParent: XInterface => Unit
  ): InContentMetadata = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, ElementType = ElementType, LocalName = LocalName, MetadataReference = MetadataReference, Namespace = Namespace, Parent = Parent, StringValue = StringValue, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), ensureMetadataReference = js.Any.fromFunction0(ensureMetadataReference), getAnchor = js.Any.fromFunction0(getAnchor), getElementType = js.Any.fromFunction0(getElementType), getParent = js.Any.fromFunction0(getParent), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[InContentMetadata]
  }
}

