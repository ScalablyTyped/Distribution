package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.StringPair
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.rdf.XMetadatable
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a {@link TextContent} that can be used to attach RDF metadata to a range of text.
  * @since OOo 3.2
  */
@js.native
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
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], MetadataReference = MetadataReference.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), ensureMetadataReference = js.Any.fromFunction0(ensureMetadataReference), getAnchor = js.Any.fromFunction0(getAnchor), getElementType = js.Any.fromFunction0(getElementType), getParent = js.Any.fromFunction0(getParent), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[InContentMetadata]
  }
}
