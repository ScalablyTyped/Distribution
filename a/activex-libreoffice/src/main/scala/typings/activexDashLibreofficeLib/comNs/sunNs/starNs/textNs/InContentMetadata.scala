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
    AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType],
    ElementType: activexDashLibreofficeLib.`type`,
    LocalName: java.lang.String,
    MetadataReference: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair,
    Namespace: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    StringValue: java.lang.String,
    TextWrap: WrapTextMode,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    dispose: js.Function0[scala.Unit],
    ensureMetadataReference: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): InContentMetadata = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, ElementType = ElementType, LocalName = LocalName, MetadataReference = MetadataReference, Namespace = Namespace, Parent = Parent, StringValue = StringValue, TextWrap = TextWrap, acquire = acquire, addEventListener = addEventListener, attach = attach, createEnumeration = createEnumeration, dispose = dispose, ensureMetadataReference = ensureMetadataReference, getAnchor = getAnchor, getElementType = getElementType, getParent = getParent, hasElements = hasElements, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setParent = setParent)
  
    __obj.asInstanceOf[InContentMetadata]
  }
}

