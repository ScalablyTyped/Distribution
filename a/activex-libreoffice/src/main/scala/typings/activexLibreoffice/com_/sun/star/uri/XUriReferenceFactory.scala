package typings.activexLibreoffice.com_.sun.star.uri

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * creates URI references.
  *
  * See [RFC   2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} for a description of URI references and related terms.
  * @since OOo 2.0
  */
@js.native
trait XUriReferenceFactory extends XInterface {
  /**
    * resolves a relative URI reference to absolute form.
    * @param baseUriReference the base URI reference. If the given `uriReference` is a same-document reference, `baseUriReference` is used as a reference to t
    * @param uriReference any URI reference. Backwards-compatible relative URI references starting with a scheme component (see RFC   2396, Section   5.2, ste
    * @param processSpecialBaseSegments if `TRUE` , special segments ( "`.`" and "`..`" ) within the path of the base URI (except for the last, cut-off segmen
    * @param excessParentSegments details how excess special parent segments ( "`..`" ) are handled.
    * @returns a fresh object that supports {@link com.sun.star.uri.XUriReference} (and possibly also additional, scheme-specific interfaces), if the given `uri
    */
  def makeAbsolute(
    baseUriReference: XUriReference,
    uriReference: XUriReference,
    processSpecialBaseSegments: Boolean,
    excessParentSegments: RelativeUriExcessParentSegments
  ): XUriReference = js.native
  /**
    * changes an absolute URI reference to relative form.
    * @param baseUriReference the base URI reference.
    * @param uriReference any URI reference.
    * @param preferAuthorityOverRelativePath controls how a relative URI reference is generated when both `baseUriReference` (e.g., "`scheme://auth/a/b`" ) an
    * @param preferAbsoluteOverRelativePath controls how a relative URI reference is generated when both `baseUriReference` (e.g., "`scheme://auth/a/b`" ) and
    * @param encodeRetainedSpecialSegments if `TRUE` , special segments ( "`.`" and "`..`" ) that are already present in the path component of the given `uriR
    * @returns a fresh object that supports {@link com.sun.star.uri.XUriReference} , if the given `uriReference` is either already relative, or is not hierarchi
    */
  def makeRelative(
    baseUriReference: XUriReference,
    uriReference: XUriReference,
    preferAuthorityOverRelativePath: Boolean,
    preferAbsoluteOverRelativePath: Boolean,
    encodeRetainedSpecialSegments: Boolean
  ): XUriReference = js.native
  /**
    * parses the textual representation of a URI reference.
    * @param uriReference the textual representation of a URI reference.
    * @returns an object that supports {@link com.sun.star.uri.XUriReference} (and possibly also additional, scheme-specific interfaces), if the given input can
    */
  def parse(uriReference: String): XUriReference = js.native
}

object XUriReferenceFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    makeAbsolute: (XUriReference, XUriReference, Boolean, RelativeUriExcessParentSegments) => XUriReference,
    makeRelative: (XUriReference, XUriReference, Boolean, Boolean, Boolean) => XUriReference,
    parse: String => XUriReference,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUriReferenceFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), makeAbsolute = js.Any.fromFunction4(makeAbsolute), makeRelative = js.Any.fromFunction5(makeRelative), parse = js.Any.fromFunction1(parse), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUriReferenceFactory]
  }
  @scala.inline
  implicit class XUriReferenceFactoryOps[Self <: XUriReferenceFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMakeAbsolute(value: (XUriReference, XUriReference, Boolean, RelativeUriExcessParentSegments) => XUriReference): Self = this.set("makeAbsolute", js.Any.fromFunction4(value))
    @scala.inline
    def setMakeRelative(value: (XUriReference, XUriReference, Boolean, Boolean, Boolean) => XUriReference): Self = this.set("makeRelative", js.Any.fromFunction5(value))
    @scala.inline
    def setParse(value: String => XUriReference): Self = this.set("parse", js.Any.fromFunction1(value))
  }
  
}

