package typings.activexLibreoffice.com_.sun.star.uri

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * parses textual representations of absolute URIs.
  *
  * See [RFC   2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} for a description of URIs and related terms.
  * @since OOo 2.0
  */
@js.native
trait XUriSchemeParser extends XInterface {
  
  /**
    * parses the textual representation of an absolute URI.
    *
    * This method is used to parse URIs (with no fragment part), not URI references (with an optional fragment part).
    *
    * If an object is returned, the behaviour of its {@link com.sun.star.uri.XUriReference} methods must reflect the fact that the object represents an
    * absolute URI reference with the given scheme and scheme-specific part, and without a fragment part.
    * @param scheme the textual representation of the scheme part (without the delimiting "`:`" ).
    * @param schemeSpecificPart the textual representation of the scheme-specific part.
    * @returns an object that supports {@link com.sun.star.uri.XUriReference} (and possibly also additional, scheme-specific interfaces), if the given input can
    */
  def parse(scheme: String, schemeSpecificPart: String): XUriReference = js.native
}
object XUriSchemeParser {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    parse: (String, String) => XUriReference,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUriSchemeParser = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), parse = js.Any.fromFunction2(parse), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUriSchemeParser]
  }
  
  @scala.inline
  implicit class XUriSchemeParserOps[Self <: XUriSchemeParser] (val x: Self) extends AnyVal {
    
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
    def setParse(value: (String, String) => XUriReference): Self = this.set("parse", js.Any.fromFunction2(value))
  }
}
